package infinitegame;

public class PlayingField {
	public  int playerx;
	public  int playery;

	

	public static void main(String[] args) {
		SwampArray l = new SwampArray();
		
		CompassField c = new CompassField();
		PlayingField f = new PlayingField();
		
		System.out.println(l.getArray()); //- testing whether it worked
		
	// Logical instructions upon user entry:
	float distance = 1;
	while(distance>0) { // need to update previous location :(
		String userInput = c.CompassInput();
		if(userInput.equals("east")) {
			l.swampy[l.originy][l.originx]= 0;
			f.playerx = l.originx + 1;
			f.playery = l.originy;
			l.updatePos(f.playery, f.playerx);
			PointsDist p = new PointsDist(f.playery,f.playerx);
			System.out.println(l.getArray());
			System.out.println(p.getDistance());
			distance = p.distance;
		}
		else if(userInput.equals("west")) {
			l.swampy[l.originy][l.originx]= 0;
			f.playerx = l.originx - 1;
			f.playery = l.originy;
			l.updatePos(f.playery, f.playerx);
			PointsDist p = new PointsDist(f.playery,f.playerx);
			System.out.println(l.getArray());
			System.out.println(p.getDistance());
			distance =  p.distance;
		}
		else if(userInput.equals("north")) {
			l.swampy[l.originy][l.originx]= 0;
			f.playerx = l.originx;
			f.playery = l.originy-1;
			l.updatePos(f.playery, f.playerx);
			PointsDist p = new PointsDist(f.playery,f.playerx);
			System.out.println(l.getArray());
			System.out.println(p.getDistance());
			distance = p.distance;

		}
		else {
			l.swampy[l.originy][l.originx]= 0;
			f.playerx = l.originx;
			f.playery = l.originy+1;
			l.updatePos(f.playery, f.playerx);
			PointsDist p = new PointsDist(f.playery,f.playerx);
			System.out.println(l.getArray());
			System.out.println(p.getDistance());
			distance= p.distance;

		}
	
	}
	}

}
