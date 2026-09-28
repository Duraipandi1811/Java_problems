abstract class box
{
    abstract void pencil();
    void boxes()
    {
        System.out.println("Its is used to the school student");
    }
}
class newbox extends box
{
    void pencil()
    {
        System.out.println("Its is used to write in  note or book ");
    }
}
public class Main
{
	public static void main(String[] args) 
	{
	    newbox ob=new newbox();
	    ob.pencil();
	    ob.boxes();
	}
}
