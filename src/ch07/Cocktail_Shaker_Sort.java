package ch07;

public class Cocktail_Shaker_Sort {

	public static void main(String[] args) {

        		int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

       		 for (int i = 0; i < arr.length; i++) {
            			System.out.print(arr[i] + ", ");
        		}

        		System.out.println("\n");
        		System.out.println("Mengurutkan array di atas menggunakan Algoritma Cocktail Shaker Sort");

       		boolean swap = true;
        		int inStr = 0;
        		int inEnd = arr.length;

        		while (swap) {
            			swap = false;

            		for (int i = inStr; i < inEnd-1; ++i) {
                			if (arr[i] > arr[i + 1]) {
                    			int temp = arr[i];
                    			arr[i] = arr[i + 1];
                    			arr[i + 1] = temp;
                    			swap = true;
                			}
            		}

            		if (!swap) {
                			break;
            		}

            		swap = false;

            		inEnd = inEnd - 1;

            		for (int i = inEnd-1; i >= inStr; i--) {
                			if (arr[i] > arr[i + 1]) {
                    			int temp = arr[i];
                    			arr[i] = arr[i + 1];
                    			arr[i + 1] = temp;
                    			swap = true;
                			}
            		}

            		inStr = inStr + 1;
        		}

        		for (int value : arr) {
            			System.out.print(value + ", ");
        		}
    	}

}