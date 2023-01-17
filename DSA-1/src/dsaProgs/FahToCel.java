package dsaProgs;

import java.util.Scanner;

public class FahToCel {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int fah = sc.nextInt();
	   int cel = (5 * (fah -32))/9 ;
//	   int cel = (int) ((5.0/9) * (fah - 32)) ;
	   System.out.println (cel);

	}

}
