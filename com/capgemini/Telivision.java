package com.capgemini;


	public class Telivision 
	{
		boolean state;
		int volume=0;
		private int channel;
		
		public Telivision(boolean state, int channel) 
		{
			this.state = state;
			this.channel = channel;
		}
		public Telivision()
		{
		}
		
		public Telivision(boolean state)
		{
			this.state = state;
		}

		public Telivision(int channel) 
		{
			this.channel = channel;
		}
		
		public boolean checkState()
		{
			return state;
		}
		public int increaseVolume()
		{
			if(state==true && volume>=0)
			{
				volume=volume+1;
			}
			return volume;
		}
		public int decreaseVolume()
		{
			if(volume>0 && state==true)
			{
			volume=volume-1;
			
			}
			return volume;
		}
		public int currentChannel()
		{
			if(state==true)
			{
				return channel;
			}
			return channel;
		}
		public int increaseChannel()
		{
			if(state==true)
			{
				channel=channel+1;
			}
			return channel;
		}
		public boolean changeState()
		{
			if(state==true)
			{
				return false;
			}
			return state;
		}
	}