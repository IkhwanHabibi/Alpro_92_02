package ch09;

import java.util.Scanner;

public class Sieve_of_Eratosthenes {

	void find(int n) {
        		boolean[] prima = new boolean[n+1];

        		for (int i = 0; i < n; i++) {
            			prima[i] = true;
        		}

        		for (int p = 2; p * p <= n; p++) {
            			if (prima[p]) {
                				for (int i = p *2; i <= n; i+=p) {
                    				prima[i] = false;
                				}
            			}
        		}

        		for (int i = 2; i < n; i++) {
            			if (prima[i]) {
                				System.out.println(i+ " ");
            			}
        		}
    	}

    	public static void main(String[] args) {

        		Scanner scan = new Scanner(System.in);

        		System.out.print("masukkan batas maksimum bil prima yang di cari : ");
        		int n = scan.nextInt();

        		Sieve_of_Eratosthenes obj = new Sieve_of_Eratosthenes();
        		obj.find(n);
    	}

}
