package infinitegame;

import java.util.Arrays;

public class SwampArray{
	public  int[][] swampy;
	public int originx;
	public int originy;// ideally both would be private and create a getter method but not got time.

	public SwampArray() {
		//this.height = height;
		//this.length = length;
	
	
//	 int[][] swamp = new int[5][5]; // only odd numbers
	int[][] swampy = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,1}};
	this.swampy = swampy;
	originx = 2;
	originy = 2;
	swampy[originy][originx] = 2;
	
//	 for (int i = 0; i < swamp.length; i++) { 
//		 for (int j = 0; j < swamp[i].length; j++) { 
//			 swamp[i][j] = 1;
//			 
//			 return swamp;
//			 }
//		 }
//	 swamp[2][2] = 2;
//	 return swamp;
	 }
	
	
	public int[][] getArray() {
		for(int[] a : swampy) { 
			for (int i : a) { 
			System.out.print(i+ "\t"); 
			} 
		System.out.println("\n");
		}
		return swampy;
	}
	public int[][] giveArray() {
		
		return swampy;
	}
	
	public void updatePos(int playery, int playerx){
		swampy[playery][playerx]= 2;
	}
}

