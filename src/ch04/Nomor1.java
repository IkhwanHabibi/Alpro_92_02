package ch04;

public class Nomor1 {

	public static void main(String[] args) {

		int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        		System.out.println("Menampilkan semua nilai dalam array");

        		for (int i = 0; i<arr.length; i++) {
           			System.out.print(arr[i] +", ");
        		}
        
        		System.out.println("\n");

       		 for (int i = 0; i < arr.length; i++){
            		 	System.out.println("Indeks Ke-"+i+" = "+ arr[i]);
       		 }

   	 }

}