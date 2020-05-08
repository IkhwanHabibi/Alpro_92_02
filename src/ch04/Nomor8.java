package ch04;

public class Nomor8 {

	public static void main(String[] args) {

       		int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        		for (int i = 0; i<arr.length; i++) {
            			System.out.print(arr[i] +", ");
        		}

        		System.out.println("\n");
        		System.out.println("Menghitung jumlah angka di dalam array");


        		int jumlah = 0;
        		for (int i = 0; i<arr.length; i++) {
            			jumlah = jumlah + arr[i];
        		}

        		System.out.println(jumlah);

    	}

}