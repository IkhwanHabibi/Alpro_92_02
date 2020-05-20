package ch09;

import java.util.ArrayList;
import java.util.Scanner;

public class Sieve_of_Sundaram {

	public static void main(String[] args) {

        		Scanner scan = new Scanner(System.in);

        		System.out.print("Masukkan limit :");
        		int limit = scan.nextInt();

        		int lim = (limit - 2) / 2, x, y = 1;

        		ArrayList<Integer> primes = new ArrayList<>();
        			for (int i = 0; i < lim; i++)
            				primes.add(i + 1);

        		// Sieve of Sundaram
        		for (x = 1; ; x++) {
            			if (x + y + 2 * x * y > lim)
                				break;
            		for (y = x; ; y++) {
                			if (x + y + 2 * x * y > lim) {
                    			y = 1;
                    			break;
                			}

                			for (int j = 0; j < primes.size(); j++)
                    			if (primes.get(j) == x + y + 2 * x * y)
                        				primes.remove(j);
            			}
        		}

        		for (int p = 0; p < primes.size(); p++)
            			primes.set(p, 2 * primes.get(p) + 1);
        			primes.add(0, 2);

        		System.out.println("Number of primes below " + limit + " is " + primes.size() + ", they are : \n");
        		for (Integer prime : primes) System.out.println(prime + " ");

    	}

}

