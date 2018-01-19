package com.wifi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Timer;
import java.util.TimerTask;

public class PingWifi extends TimerTask {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new PingWifi(), 0, 1000);

	}
	
	private boolean isConnected(){
		boolean status = false;
		try {
			Process p = Runtime.getRuntime().exec("ping google.com");
			p.waitFor();
			String output = getCommandOutput(p);
			if(output != null && !output.isEmpty() && output.contains("Reply from")){
				status = true;
			}
		} catch (Exception e) {
			System.out.println("Error in isConnected");
			e.printStackTrace();
		}
		return status;
	}
	
	private String getCommandOutput(Process p){
		StringBuilder output = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		try{
	        String line = null;
	        
	        while ((line = br.readLine()) != null) {
	            output.append(line);
	            output.append("\n");
	        }
		}catch (Exception e) {
			System.out.println("Error in getCommandOutput");
			e.printStackTrace();
		} finally{
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Error in getCommandOutput closing br");
				e.printStackTrace();
			}
		}
		System.out.println(output.toString());
		return output.toString();
	}
	@Override
	public void run() {
		if(!isConnected()){
			System.out.println("Internet disconnected - connecting again !!");
			try {
				getCommandOutput(Runtime.getRuntime().exec("netsh wlan disconnect"));
				getCommandOutput(Runtime.getRuntime().exec("netsh wlan connect MOTOROLA-D4096"));
			} catch (IOException e) {
				System.out.println("Error in run");
				e.printStackTrace();
			}
		}
		        
	}

}
