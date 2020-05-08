package  ch03;

import java.util.Scanner;

public class Nomor3 {

	public static void main(String[] args) {
		
		// Menentukan bilangan pembagi terkecil selain angka 1 dan  2
		System.out.println("Program menentukan bilangan pembagi terkecil selain angka 1 dan 2");

		Scanner Scan = new Scanner(System.in);

		System.out.print("Inputkan bilangan : ");
		   int bil = Scan.nextInt();

<<<<<<< HEAD
		for (int i = 3; i <= bil; i++) {
=======
		for (int i = 3; 1 <= bil; i++) {
>>>>>>> 2da6549531d734bb5588399aa5c375e7507d4ed5
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