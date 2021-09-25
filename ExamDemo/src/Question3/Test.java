package Question3;

public class Test
{
	public static void main(String[] args)
	{
		Circle c= new Circle(7.8);
		
		Rectangle x = new Rectangle(4.0,7.0);
		Rectangle y = new Rectangle(8.1,7.2);
		ShapesFactory s = new ShapesFactory();
		s.addShape(x);
		s.addShape(y);
		s.addShape(c);
		
		
		
	}

}
