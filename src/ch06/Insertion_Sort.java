package ch06;

public class Insertion_Sort {

	public static void main(String[] args) {

		int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        		for (int i : arr) {
            			System.out.print(i + ", ");
        		}

        		System.out.println("\n");
        		System.out.println("Mengurutkan array di atas menggunakan Algoritma Insertion Sort");

        		int i, j, temp;

        		for (i = 0; i < arr.length; i++) {
            			temp = arr[i];
            			for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
                				arr[j+1] = arr[j];
            			}
            			arr[j+1] = temp;
        		}

        		for (int n : arr) {
            			System.out.print(n + ", ");
        		}

    	}

}