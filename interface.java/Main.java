// interface Car{
//     void race();
// }
// class Showroom implements Car{
//  public void race()
//     {
//         System.out.println("Ready to the race-----");
//     }
// }
// public class Main
// {
//     public static void main(String []args)
//     {
//         Showroom sc=new Showroom();
//         sc.race();
//     }
// }



interface Family1
{
    void member1();
}
interface Family2
{
    void member2();
}
class Count implements Family1,Family2
{
    public void member1()
    {
        System.out.println("Family1 member count is 10");
    }
    public void member2()
    {
        System.out.println("Family2 member count is 13");
    }
}
public class Main{
    public static void main(String []args)
    {
        Count c=new Count();
        c.member2();
        c.member1();
    }
}