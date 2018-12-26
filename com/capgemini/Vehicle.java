package com.capgemini;

public class Vehicle 
{	
	private int speed;
	private int directionInDegrees;
	private String ownerName;
	private static int highestIdNumber=100;
	private int vehicleIdNumber;
	

	private static final boolean turnLeft=false;
	private static final boolean turnRight=true;
	String [] arrayForDirections={"north", "northEast","east","southEast","south","southWest","west" ,"northWest"};
	private String directions="";
	
	public int getSpeed()
	{
		return speed;
	}
	public void setSpeed(int speed) 
	{
		this.speed = speed;
	}
	public int getDirection() 
	{
		return directionInDegrees;
	}
	public void setDirection(int directionInDegrees)
	{
		this.directionInDegrees = directionInDegrees;
	}
	public String getOwnerName() 
	{
		return ownerName;
	}
	public void setOwnerName(String ownerName) 
	{
		this.ownerName = ownerName;
	}
	public int getVehicleIdNumber() 
	{
		return vehicleIdNumber;
	}
	public void setVehicleIdNumber(int vehicleIdNumber) 
	{
		this.vehicleIdNumber = vehicleIdNumber;
	}
	public Vehicle(int speed,int directionInDegrees, String ownerName)
	{
		this.speed=speed;
		this.directionInDegrees=directionInDegrees;
		this.ownerName=ownerName;
	}
	public Vehicle()
	{
		
	}
	public Vehicle(String ownerName) 
	{
		super();
		this.ownerName = ownerName;
	}
	@Override
	public String toString() 
	{
		return "Vehicle [speed=" + speed + ", directionInDegrees=" + directionInDegrees
				+ ", ownerName=" + ownerName + "]";
	}
	
	public int changeSpeed(int changeSpeed)
	{
		speed=changeSpeed+speed;
		return speed;
	}
	
	public int stopSpeed()
	{
		speed=0;
		return speed;
	}
	public int currentSpeed()
	{
		return speed;
	}
	public int displayVehicleIdNumber()
	{
		return highestIdNumber;
	}
	
	public String turnsByDegrees(int degreesToTurn,boolean trueOrFalse)
	{
		if(trueOrFalse)
		{
			
		
		if(degreesToTurn+directionInDegrees<=360)
				{
					directionInDegrees=degreesToTurn+directionInDegrees;
					if(directionInDegrees==0 || directionInDegrees==360)
					{
						directions=arrayForDirections[0];
					}
					else if(directionInDegrees>0 && directionInDegrees<90)
					{
						directions=arrayForDirections[1];
					}
					else if(directionInDegrees==90)
					{
						directions=arrayForDirections[2];
					}
					else if(directionInDegrees>90 && directionInDegrees<180)
					{
						directions=arrayForDirections[3];
					}
					else if(directionInDegrees==180)
					{
						directions=arrayForDirections[4];
					}
					else if(directionInDegrees>180 && directionInDegrees<270)
					{
						directions=arrayForDirections[5];
					}
					else if(directionInDegrees==270)
					{
						directions=arrayForDirections[6];
					}
					else if(directionInDegrees>270 && directionInDegrees<360)
					{
						directions=arrayForDirections[7];
					}
					
				}
				}
		else
		{
			if((directionInDegrees-degreesToTurn)>=-360)
			{
				directionInDegrees=directionInDegrees-degreesToTurn;
				if(directionInDegrees==0 || directionInDegrees==-360)
				
					directions=arrayForDirections[0];
				
				if(directionInDegrees<-0 && directionInDegrees>-90)
				
					directions=arrayForDirections[7];
				if(directionInDegrees==-90)
					directions=arrayForDirections[6];
				
				if(directionInDegrees<-90 && directionInDegrees>-180)
				
					directions=arrayForDirections[5];
				
				if(directionInDegrees==-180)
					
					directions=arrayForDirections[4];
				
				if(directionInDegrees<-180 && directionInDegrees>-270)
				
					directions=arrayForDirections[3];
				
				if(directionInDegrees==-270)
					
					directions=arrayForDirections[2];
				
				if(directionInDegrees<-270 && directionInDegrees>-360)
				
					directions=arrayForDirections[1];
			}
		} 
		return directions;
	}

	}
	
	


