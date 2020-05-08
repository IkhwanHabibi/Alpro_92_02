package ch04;

public class Nomor10 {

	public static void main(String[] args) {

       		int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        			for (int i = 0; i<arr.length; i++) {
            				System.out.print(arr[i] +", ");
        			}

        			System.out.println("\n");
        			System.out.println("Menampilkan selisih angka genap dengan angka setelah nya genap pula");

        		int selisih;
        		for (int i = 0; i<arr.length; i++) {
            			if (arr[i] %2 == 0) {
                				for (int n = i+1; n<arr.length; n++) {
                    				if (arr[n] %2 == 0) {
                        					selisih = arr[i] - arr[n];
                        					selisih = Math.decrementExact(selisih);
                        					System.out.println("indek ke-" +i+ "=" +arr[i]+ " dan indek ke-" +(n+1)+ "=" +arr[n]+ " => selisih angkanya adalah " +selisih);
                        					break;
                    				}
                				}
            			}
        		}

    	}

}