package ch08;

public class LongestCommonSubstring {

	public static void main(String[] args) {

        		String x = "asdfghjkhdfsaDxvbnjhgfgdsdzdgvhjcxgdzsdzfgvbkjgfdszfgvh";
        		String y = "dgcjvhjbhgfdfszdgcgjbhjgfgdfszgfvhbjnk.jhmggzdsgxfhgkbj";

        		int M = x.length();
        		int N = y.length();

        		int[][] opt = new int[M+1][N+1];

        		for (int i = M-1; i >= 0; i--) {
            			for (int j = N-1; j >= 0; j--) {
                				if (x.charAt(i) == y.charAt(j))
                    				opt[i][j] = opt[i+1][j+1] + 1;
                				else
                    				opt[i][j] = Math.max(opt[i+1][j], opt[i][j+1]);
            				}
        			}
        
       			int i = 0, j = 0;
        			while(i < M && j < N) {
            				if (x.charAt(i) == y.charAt(j)) {
                					System.out.print(x.charAt(i));
                					i++;
                					j++;
            				}
            				else if (opt[i+1][j] >= opt[i][j+1]) i++;
            				else                                 j++;
        			}
        		System.out.println();

    	}

}
