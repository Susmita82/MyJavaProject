package lambda;

public class FirstLambda {

	public static void main (String [] args){
		
		// below line is a lambda expression of type LambdaFunction interface.
		LambdaFunction lambdaFunction = () -> System.out.println ("Hello world");
		lambdaFunction.call();
	}
}

