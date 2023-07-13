package core;

public class CWH_28_Multi_Dim_array {
	public static void main(String[] args) {
//	2-D array

		int[][] flats;
		flats = new int[2][3];

		flats[0][0] = 101;
		flats[0][1] = 102;
		flats[0][2] = 103;
		flats[1][0] = 201;
		flats[1][1] = 202;
		flats[1][2] = 203;
		int i = 0, j = 0;
		for (i = 0; i < flats.length; i++) {
			for (j = 0; j < flats[i].length; j++) {
				System.out.print(flats[i][j]);
				System.out.println("  ");
			}
			System.out.println(" ");
		}

//	System.out.println(flats[0][1]);
	}
}
