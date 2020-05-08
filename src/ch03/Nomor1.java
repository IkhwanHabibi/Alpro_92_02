package ch03;

import java.util.Scanner;

public class Nomor1 {

	public static void main(String[] args) {
	
		System.out.println("Program menentukan nilai tertinggi antara variabel x dan y");

		Scanner scan = new Scanner(System.in);

		int x, y;

		System.out.print("Masukkan nilai X : ");
		   x = scan.nextInt();
		System.out.print("Masukkan nilai Y : ");
		   y = scan.nextInt();

		if (x > y) {
			System.out.println("Nilai tertinggi nya adalah X : " +x);
		}else {
			System.out.println("Nilai tertinggi nya adalah Y : " +y);
		}


	}

}