package ch09;

import java.util.Scanner;

public class Sieve_of_Atkin {

	public static void main(String[] args) {

        		Scanner scan = new Scanner(System.in);

        		System.out.print("Masukkan limit bilangan: ");
        		int limit = scan.nextInt();

        		if (limit > 2) {
            			System.out.print(2 + " ");
        		}

        		if (limit > 3) {
            			System.out.print(3 + " ");
        		}

        		boolean[] SoA = new boolean[limit];

        		for (int i = 0; i < limit; i++) {
            			SoA[i] = false;
        		}

        		for (int i = 1; i * i < limit; i++) {
            			for (int y = 1; y * y < limit; y++) {
                				int n = (4 * i * i) + (y * y);
                					if (n <= limit && (n % 12 == 1 || n % 12 == 5)) {
                    					SoA[n] ^= true;
                					}

                				n = (3 * i * i) + (y * y);
                				if (n <= limit && n % 12 == 7) {
                    				SoA[n] ^= true;
                				}

                				n = (3 * i * i) - (y * y);
                				if (i > y && n <= limit && n % 12 == 11) {
                    				SoA[n] ^= true;
                				}
            			}
        		}

        		for (int j = 5; j * j < limit; j++) {
            			if (SoA[j]) {
                				for (int k = j * j; k < limit; k += j * j) {
                    				SoA[k] = false;
                				}
            			}
        		}

        		for (int l = 5; l < limit; l++) {
            			if (SoA[l]) {
                				System.out.println(l + " ");
            			}
        		}
    	}
}

