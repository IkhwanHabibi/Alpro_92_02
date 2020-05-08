package ch04;

public class Nomor6 {

	public static void main(String[] args) {

        		int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        		for (int i = 0; i<arr.length; i++) {
            			System.out.print(arr[i] +". ");
        		}

        		System.out.println("\n");
        		System.out.println("Menampilkan angka ganjil yang diapit angka genap di array");

        		for (int i = 0; i<arr.length-1; i++) {
           			if (i != arr.length-1) {
               				if (arr[i] %2 != 0) {
                   				if (arr[i-1] %2 == 0) {
                       					if (arr[i+1] %2 == 0) {
                           						System.out.print(arr[i] +", ");
                       					}
                   				}
               				}
           			}
        		}

    	}

}