package lambda;

public class BlockLambda {

	interface LambdaFunction{
		String intKind(int i);
	}
	public static void main(String[] args) {
		LambdaFunction lambdaFunction = (int j) -> {
			if(j % 2 == 0) 
				return "Even number";
			else
				return "Odd Number";
		};
		System.out.println(lambdaFunction.intKind(18));
	}

}
