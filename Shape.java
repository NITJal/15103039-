interface Shapes{
	 public void numberOfSides();
}
class Trapezoid implements Shapes {
	public void numberOfSides()
	{
		System.out.println("Trapexoid has 4 sides.");
	}

}
class Triangle implements Shapes{
	public void numberOfSides()
	{
		System.out.println("Triangle has 3 sides.");
	}

}

class Hexagon implements Shapes{
	public void numberOfSides()
	{
		System.out.println("Hexagon has 6 sides.");
	}
}


public class Shape{
	public static void main(String[] args)
	{
		Shapes ob1=new Trapezoid();
		Shapes ob2 = new Triangle();
		Shapes ob3=new Hexagon();
		ob1.numberOfSides();
		ob2.numberOfSides();
		ob3.numberOfSides();
	}
}