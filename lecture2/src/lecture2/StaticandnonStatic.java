package lecture2;

public class StaticandnonStatic {
	
	public static int q = 150; //global static variable
	public int p = 250; //global non static variable
	
	//static function
	public static void first_function() {
		int abc  = 20; //this is a local variable
	}

	// non static method
	public  void second_function() {
		int xyz  = 200; //this is a local variable
	}
}
