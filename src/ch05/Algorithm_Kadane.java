package ch05;

import java.util.Scanner;

public class Algorithm_Kadane {

	public static void main(String[] args){

        		System.out.println("Program java Algoritma kadane");

        		Scanner scan = new Scanner( System.in );

        		System.out.print("inputkan size array : ");
        		int size = scan.nextInt();
        		System.out.print("Masukkan nilai array nya : ");
        		int[] arr = new int[size];

        		for(int i = 0; i < size; i++){
            			arr[i] = scan.nextInt ();
        		}

        		int MaxSubarraySize = arr[0];
        		int sum = 0;

        		for(int i = 0; i < size; i++){
            			sum = sum + arr[i];
            			if(MaxSubarraySize < sum){
                				MaxSubarraySize = sum;
            			}else if(sum < 0){
                				sum = 0;
            			}
        		}

        		System.out.println ("sub array max : " + MaxSubarraySize);

    	}

}