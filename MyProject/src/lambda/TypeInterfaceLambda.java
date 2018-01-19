package lambda;

public class TypeInterfaceLambda {

	public static void main(String[] args) {
		
		StringLengthLambda stringLength = s -> s.length();
		System.out.println(stringLength.getLength("Hello World"));
	}
	
	interface StringLengthLambda{
		int getLength(String s);
			
		
	}

}
