package ch04;

public class Nomor7 {

	public static void main(String[] args) {

        		int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        		for (int i = 0; i<arr.length; i++) {
            			System.out.print(arr[i] +", ");
        		}

        		System.out.println("\n");
        		System.out.println("Menampilkan angka kelipatan lima yang sebelum nya juga  angka kelipatan 5");

        		for (int i = 1; i<arr.length; i++) {
            			if (arr[i] %5 == 0) {
                				if (arr[i-1] %5 == 0) {
                    				System.out.println(arr[i]);
                				}
            			}
        		}

    	}

}