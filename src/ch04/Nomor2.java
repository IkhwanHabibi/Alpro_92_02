package ch04;

import java.util.Scanner;

public class Nomor2 {

	public static void main(String[] args) {

		int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

	        	Scanner scan = new Scanner(System.in);

	        	for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] +", ");
       	 	}

        		System.out.println("\n");
        		System.out.println("Mencari sebuah angka di dalam array");

        		System.out.print("Masukkan angka yg di cari : ");
       		int cari = scan.nextInt();

        		boolean status = false;
        		int index = 0;

        		for (int i = arr.length-1; i >= 0; i--) {
            			if (arr[i] == cari) {
               				status = true;
                				index = i;
           		 	}
        		}

       		 if (status) {
            			System.out.println("Angka " +cari+ " di temukan di indeks " +index);
        		}else {
            			System.out.println("Angka " +cari+ " tidak ada di dalam array");
        		}

	}

}