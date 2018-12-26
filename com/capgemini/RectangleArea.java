package java1;

public class RectangleArea 
 {
	private int length;
	private int breadth;
	int area;

	public int areaFunction() 
	{
		area=getLength()*getBreadth();
		return area;
	}
	public int perimetreFunction()
	{
		int perimetre;
		perimetre=2*(getLength()+getBreadth());
		return perimetre;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

 }
