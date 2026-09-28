class Hod
{
    void show()
    {
        System.out.println("CSE-DEPARTMENT....");
    }
}
class faculty extends Hod
{
    void show1()
    {
        System.out.println("CSE-DEPARTMENT MEMBERS....");
    }
}
class student extends Hod
{
    void show2()
    {
        System.out.println("CSE-DEPARTMENT STUDENTS....");
    }
}
public class Main
{
	public static void main(String[] args)
	{
		Hod ob= new Hod();
		ob.show();
	}
}
