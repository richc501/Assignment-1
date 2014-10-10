//Richard Cunningham
//With (x, y) as the coordinates of the car, consider the initial position (0,0).
//At each intersection, the only directions available are North, South, East or West
//The GPS is broken, and it chooses the direction randomly at each intersection, which happens every 5 minutes
//The assumption is that the car has the same speed at all times, including when it changes direction and turns. 

//make variables
// create loop to go 12 times
// make random generator b/w 1 and 4
// use switch to determine direction
// find distance
public class BrokenGPS {
	public static void main(String[] args)
	{
		int xPosition = 0, yPosition = 0, xSum=0, ySum=0, distance;
		int east = 1, west=-1, south=-1, north=1;
		for(int i=0;i<12;i++)//loops 12 times
		{
			int randomNumber = (int)(Math.random()*(5-1)+1);//creates random number
			//System.out.println(randomNumber);
			switch(randomNumber)//determines direction
			{
			case 1://EAST
				System.out.println("EAST");
				xPosition = east*5;
				xSum=xSum+xPosition;//adds +x direction
				System.out.println(xSum+","+ySum);
				break;
			case 2://WEST
				System.out.println("WEST");
				xPosition = west*5;
				xSum=xSum+xPosition;//adds -x direction
				System.out.println(xSum+","+ySum);
				break;
			case 3://SOUTH
				System.out.println("SOUTH");
				yPosition = south*5;
				ySum=ySum+yPosition; //adds +y direction
				System.out.println(xSum+","+ySum);
				break;
			case 4://NORTH
				System.out.println("NORTH");
				yPosition = north*5;
				ySum=ySum+yPosition;//adds -y direction
				System.out.println(xSum+","+ySum);
				break;
			}
		}
		xPosition = 0;//resets to origin
		yPosition = 0;
		distance =(int)Math.sqrt((xSum-xPosition)*(xSum-xPosition)+(ySum-yPosition)*(ySum-yPosition)); //Finds distance
		System.out.println("Distance: "+distance);//prints distance
	}
}