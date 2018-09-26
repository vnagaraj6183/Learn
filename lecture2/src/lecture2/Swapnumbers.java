package lecture2;

public class Swapnumbers {

	int s;
	int t;
	
	public static void swap(int a, int b) {
		//pass by value
		int temp =a;
		a=b;
		b=temp;
	}
	public static void swap(Swapnumbers p) { //pass by reference
		int temp = p.s;
		p.s=p.t;
		p.t=temp;
	}
	
	public static void main(String[] args) {
		Swapnumbers sw = new Swapnumbers();
		sw.s=50;
		sw.t=100;
		
		swap(sw.s, sw.t) ;//pass by value
		System.out.println("Pass by the values s is   " +sw.s );
		System.out.println("Pass by the values t is   " + sw.t);

		swap(sw);
		System.out.println("Pass by the reference s is   " +sw.s );
		System.out.println("Pass by the reference t is   " + sw.t);
	}

}
