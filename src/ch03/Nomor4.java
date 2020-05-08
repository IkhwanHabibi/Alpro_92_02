package ch03;

import java.util.Scanner;

public class Nomor4 {

	public static void main(String[] args) {
		
		System.out.println("Program Menentukan sebuah angka bilangan prima atau tidak");

		Scanner scan = new Scanner(System.in);

		System.out.print("Inputkan angka : ");
		   int angka = scan.nextInt();
		int n = 0;

		for (int i = 1; i <= angka; i++) {
			if (angka %i == 0) {
				n = n + 1;
			}
		}

		if (n == 2) {
			System.out.println(angka + " Merupakan bilangan prima");
		}else {
			System.out.println(angka + " Bukan bilangan prima");
		}

	}

}