package infinitegame;

public class PointsDist extends SwampArray{
	 float distance;
	int playerposx;
	int playerposy;
	int treasx;
	int treasy;
	
	public PointsDist(int playerx,int playery) {
		 for (int i = 0; i < swampy.length; i++) { 
			 for (int j = 0; j < swampy[i].length; j++) { 
//				 if(swampy[i][j] == 2) {
//					 playerposy = i;
//					 playerposx = j;
//				 }
				 if(swampy[i][j] == 1) { //need to add minimum distance to 1 (only have one 1 now)
					 treasy = i;
					 treasx = j;
				 }
			 }
		 }
		 distance = (playerx-treasx) + (playery-treasy);

	}
	
	public String getDistance() {
		if(distance <0) {
			 distance = (-1)*distance;
			 return "You are " + distance +"m away";
		 }
		else {
			return "You are " + distance +"m away";		
		
		
	}
		
	}
}
