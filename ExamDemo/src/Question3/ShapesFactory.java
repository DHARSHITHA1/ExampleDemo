package Question3;
import java.util.ArrayList;
import java.util.List;

class ShapesFactory 
{
	ArrayList<Shape> slist = new ArrayList<>();
	public ShapesFactory() { }
	public void addShape(Shape s)
	{
		slist.add(s);
	}
	public ArrayList<Circle> getCircles()
	{
		ArrayList<Shape> clist=new AyyarList<Shape>();
		for(Shape s: slist)
		{
			if(s.getClass().getName=="Circle")
			{
				clist.add(s);
			}
		}
		return clist;		
	}
	public ArrayList<Rectangle> getRectangle()
	{
		ArrayList<Shape> rli=new ArrayList<>();
		for(Shape s : slist)
		{
			if(s.getClass.getName()=="Rectangle")
			{
				rli.add(s);
			}
		}
		return rli;
	}
	public boolean deleteShape(Shape s)
	{
		for( Shape e : slist)
		{
			if(e.equals(s))
			{
				slist.remove(s);
				return true;
			}
			else
			{
				return false;
			}
				
		}
		
	}
	

}
