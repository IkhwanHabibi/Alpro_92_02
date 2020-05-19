package ch07;

public class Merge_Sort {

	public static void main(String[] args) {

        		int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        		Merge_Sort mergeSort = new Merge_Sort();
        		mergeSort.sort(arr, 0, arr.length-1);

        		for (int i : arr) {
            			System.out.print(i + ", ");
        		}

        		System.out.println("\n");
        		System.out.println("Mengurutkan array di atas menggunakan Algoritma Merge Sort");
        		cetakArray(arr);

    	}

    	void merge(int[] arrA, int left, int middle, int right) {

        		int n1 = middle - left + 1;
        		int n2 = right - middle;


        		int[] l = new int [n1];
        		int[] r = new int [n2];


        		if (n1 >= 0) System.arraycopy(arrA, left, l, 0, n1);
        			for (int j = 0; j < n2; ++j) {
            				r[j] = arrA[middle + 1 + j];
        			}

        			int i = 0, j = 0;

        			int k = left;
        			while (i < n1 && j < n2) {
            				if (l[i] <= r[j]) {
                					arrA[k] = l[i];
                					i++;
            				} else {
                					arrA[k] = r[j];
                					j++;
            				}
            				k++;
        			}

        			while (i < n1) {
            				arrA[k] = l[i];
            					i++;
            					k++;
        			}

        			while (j < n2) {
            				arrA[k] = r[j];
           	 			j++;
            				k++;
        			}
    		}

    	void sort(int[] arrA, int left, int right) {
        		if (left < right) {
            			int middleIndex = (left + right)/2;

            			sort(arrA, left, middleIndex);
			sort(arrA , middleIndex+1, right);

            			merge(arrA, left, middleIndex, right);
        		}
    	}

    	static void cetakArray(int[] arrA) {
        		for (int value : arrA) {
            			System.out.print(value + " ");
        	}
    	}

}