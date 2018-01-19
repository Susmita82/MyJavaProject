package com.test;

public class StringContentTest {

	public static void main(String[] args) {
		String t1="I am Java Expert";
		String t2="I am C Expert";
		String t3="I am Java Expert";
//       
		System.out.println(  t1 == t3 );
		System.out.println("t1.equals(t3) : "+ t1.equals(t3));
        
        String s1 = "Rakesh";
        String s2 = "Rakesh";
        String s3 = "Rakesh".intern();
        String s4 = new String("Rakesh");
        String s5 = new String("Rakesh").intern();

        if ( s1 == s2 ){
            System.out.println("s1 and s2 are same");  // 1.
        }

        if ( s1 == s3 ){
            System.out.println("s1 and s3 are same" );  // 2.
        }

        if ( s1 == s4 ){
            System.out.println("s1 and s4 are same" );  // 3.
        }

        if ( s1 == s5 ){
            System.out.println("s1 and s5 are same" );  // 4.
        }
	}

}
