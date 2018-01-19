package lambda;

interface SufixFunction{
	void call ();
}

public class PigLatin {

	public static void main(String[] args) {
		String word = "Hello";
		//word = "aa";
		SufixFunction sufixFunction = () -> System.out.println( word + " World ");
		//word = "aa";
		sufixFunction.call();
	}

}
