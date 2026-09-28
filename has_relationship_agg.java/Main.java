/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class detail
{
    String Firstname ,Middlename ,Lastname;
    detail(String fn ,String mn ,String ln)
    {
        this.Firstname=fn;
        this.Middlename=mn;
        this.Lastname=ln;
    }
}
class student
{
    int stu_id;
    detail info;
    student(int stu_id,detail information)
    {
        this.stu_id=stu_id;
        this.info=information;
    }
    void dispaly()
    {
     System.out.println(".__The Student Details__.");
     System.out.println("The student_id :"+stu_id);
     System.out.println("The student_name :"+info.Firstname);
     System.out.println("The student_name :"+info.Middlename);
     System.out.println("The student_name :"+info.Lastname);
    }
}
class workers 
{
    int worker_id;
    detail info;
    workers(int worker_id,detail information)
    {
        this.worker_id=worker_id;
        this.info=information;
    }
    void dispaly()
    {
     System.out.println("\n.__The workers Details__.");
     System.out.println("The worker_id :"+worker_id);
     System.out.println("The worker_name :"+info.Firstname);
     System.out.println("The worker_name :"+info.Middlename);
     System.out.println("The worker_name :"+info.Lastname);
    }
}

public class Main
{
	public static void main(String[] args)
	{
		detail n=new detail("T","v","k");
		student stu=new student(101,n);
		stu.dispaly();
		workers work=new workers(1001,n);
		work.dispaly();
	}
}
