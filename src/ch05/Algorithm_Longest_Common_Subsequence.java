package ch05;

import java.util.Scanner;

public class Algorithm_Longest_Common_Subsequence {

	public static void main(String[] args) {

        		System.out.println("Program java Algoritma Longest Common Subsequence ");

        		Scanner scan = new Scanner(System.in);

        		System.out.print("Input first String : ");
        		String A = scan.next();
        		System.out.print("Input second String : ");
        		String B = scan.next();

        		int a = A.length();
        		int b = B.length();

        		int[][] lcsArr = new int[a + 1][b + 1];

        		for (int i = 0; i <= a; i++) {
            			for (int j = 0; j <= b; j++) {
				if (i == 0 || j == 0) {
                    				lcsArr[i][j] = 0;
				} else if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    				lcsArr[i][j] = lcsArr[i - 1][j - 1] + 1;
                				} else {
                    				lcsArr[i][j] = Math.max(lcsArr[i - 1][j], lcsArr[i][j - 1]);
                				}
            			}

        		}

        		int index = lcsArr[a][b];
       		int newIndex = index;

        		char[] lcsChar = new char[index + 1];
       
        		while (a > 0 && b > 0) {
            			if (A.charAt(a - 1) == B.charAt(b - 1)) {
                				lcsChar[index - 1] = A.charAt(a - 1);
				a--;
                				b--;
                				index--;
            			} else if (lcsArr[a - 1][b] > lcsArr[a][b - 1]) {
                				a--;
            			} else {
                				b--;
            			}
        		}

        		System.out.print("LCS of " + A + " and " + B + " is ");

        		for (int i = 0; i < newIndex; i++) {
            			System.out.print(lcsChar[i]);
        		}

   	}

}