package MethodsProgs;

public class MethodsProg1 {

	public static void add(int a) {
		System.out.println("this is no arguments " + a);
	}

	public static int add1(int a, int b) {
		System.out.println("this is parameterized ");
		return a + b;
	}

	public static boolean add2(int a, float b) {
		return a == b;
	}

	public static void driver(int c, int e, int a, int b) {
		System.out.println(c + e + "" + a + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method starts");
		// add(4);
		System.out.println(add2(5, 5));
		// System.out.println(add1(5 , 5));
		// driver(5 , 7 , 5 , 7 );
		System.out.println("main method ends ");
	}

}
