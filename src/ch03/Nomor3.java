package  ch03;

import java.util.Scanner;

public class Nomor3 {

	public static void main(String[] args) {
		
		System.out.println("Program menentukan bilangan pembagi terkecil selain angka 1 dan 2");

		Scanner Scan = new Scanner(System.in);

		System.out.print("Inputkan bilangan : ");
		   int bil = Scan.nextInt();

		for (int i = 3; 1 <= bil; i++) {
			if (bil %i == 0) {
				int pembagi = i;
				System.out.println("Pembagi terkecil dari " +bil+ " adalah " +pembagi);
				break;
			}else {
				i = i + 1;
				if (bil %i == 0) {
					int pembagi = i;
					System.out.println("Pembagi terkecil dari " +bil+ " adalah " +pembagi);
					break;
				}
			}
		} 

	}

}