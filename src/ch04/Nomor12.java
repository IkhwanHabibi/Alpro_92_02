package ch04;

public class Nomor12 {

	public static void main(String[] args) {

        		int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

       	 	for (int i = 0; i<arr.length; i++) {
            			System.out.print(arr[i] +", ");
        		}

        		System.out.println("\n");
        		System.out.println("Menampilkan jumlah angka dengan angka setelahnya yang hasil penjumlahannya bernilai genap di dalam array");

        		for (int i = 0; i<arr.length; i++) {
            			if (i < arr.length-1) {
                				if (arr[i] % 2 == 0 && arr[i+1] % 2 == 0) {
                    				int jumlah = arr[i] + arr[i+1];
                    				System.out.println(arr[i] + " dan " + arr[i+1] + " hasil jumlah " + jumlah);
                				}
            			}
        		}

    	}

}