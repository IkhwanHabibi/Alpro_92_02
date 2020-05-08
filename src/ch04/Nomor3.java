package ch04;

public class Nomor3 {

	public static void main(String[] args) {

        		int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        		for (int i = 0; i < arr.length; i++){
                			System.out.print(arr[i]+", ");
        		}

        		System.out.println("\n");
        		System.out.println("Menampilkan angka ganjil di dalam array");

        		for (int i = 0; i<arr.length; i++) {
            			if (arr[i] % 2 != 0) {
                				System.out.print(arr[i] +", ");
            			}
       		}

    	}

}