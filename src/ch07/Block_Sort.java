package ch07;

public class Block_Sort {

	public static void main(String[] args) {
        		int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        		for (int i : arr) {
            			System.out.print(i + ", ");
       		}

        		System.out.println("\n");
        		System.out.println("Mengurutkan array diatas menggunakan Algoritma Block Sort");

        		for (int i = 1; i < arr.length; i++) {
            		int n = arr[i];
            		int j = i - 1;

            		while ((j > -1) && (arr[j] > n)) {
                			arr[j + 1] = arr[j];
                			j--;
            		}

            		arr[j + 1] = n;
        		}

        		for (int n : arr) {
            			System.out.print(n + ", ");
        		}
    	}

}