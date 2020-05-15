package ch05;

import java.util.Scanner;

public class Algorithm_Euclidean {

	public static void main(String[] args) {

        		System.out.println("Program java Algoritma Euclidean");

        		Scanner scan = new Scanner(System.in);

        		int m, n;
        		System.out.print("Masukkan angka pertama : ");
        		m = scan.nextInt();
        		System.out.print("Masukkan angka kedua : ");
        		n = scan.nextInt();

        		while (n > 0) {
            			int r = m % n;
            			m = n;
            			n = r;
        		}

        		System.out.println("pbb: " +m);
    	}

}