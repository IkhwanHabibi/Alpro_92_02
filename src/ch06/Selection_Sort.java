package ch06;

public class Selection_Sort {

	public static void main(String[] args) {

        		int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        		for (int i : arr) {
            			System.out.print(i + ", ");
        		}

        		System.out.println("\n");
        		System.out.println("Mengurutkan array di atas menggunakan Algoritma Selection Sort");

       		int i, j, temp, pos, small;

        		for (i = 0; i < arr.length; i++) {
            			small = arr[i];
            			pos = i;
            			for (j = i + 1; j < arr.length; j++) {
                				if (arr[j] < small) {
                    				small = arr[j];
                    				pos = j;
                				}
            			}

            			temp = arr[i];
            			arr[i] = arr[pos];
            			arr[pos] = temp;
        		}

        		for (int n : arr) {
            			System.out.print(n + ", ");
        		}

    	}

}