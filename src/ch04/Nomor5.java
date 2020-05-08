package ch04;

public class Nomor5 {

	public static void main(String[] args) {

        		int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        		for (int i = 0; i<arr.length; i++) {
            			System.out.print(arr[i] +", ");
        		}

        		System.out.println("\n");
        		System.out.println("Menampilkan angka angka yang memiliki angka 2 di dalam array");

       

		for (int i = 0; i<arr.length; i++) {
			boolean con = String.valueOf(arr[i]).indexOf('2') > -1;
			if (con) System.out.print(arr[i] +", ");
		}
    	}

}
