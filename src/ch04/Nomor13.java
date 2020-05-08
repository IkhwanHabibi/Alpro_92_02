package ch04;

public class Nomor13 {

	public static void main(String[] args) {

		int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] +", ");
        		}

        		System.out.println("\n");
        		System.out.println("Menghitung jumlah angka angka selisih yang di tampilkan pada nomor 9");

        		int jumlah = 0, selisih;
        		for (int i = 0; i < arr.length-1; i++) {
            			selisih = arr[i] - arr[i+1];
            			selisih = Math.decrementExact(selisih);
            			System.out.println("indek ke-" +i+ "=" +arr[i]+ " dan indek ke-" +(i+1)+ "=" +arr[i+1]+ " => selisih angkanya adalah " +selisih);
            			jumlah = jumlah + selisih;
        		}
		
		System.out.println("\n");
        		System.out.println("Jumlah angka selisih : " + jumlah);

    	}

}
