import java.io.*;
public class copyfile
{
    public static void main(String [] args )throws IOException
    {
        FileInputStream in =null;
        FileOutputStream out=null;
        InputStreamReader cin = new InputStreamReader(System.in);
        System.out.println("Enetr the character,'q'to quit.");
        char c;
    try
    {
    do{
            c=(char)cin.read();
            System.out.print(c);
        }
        while(c!='q');
   }
    finally
    {
        if(cin!=null)
        {
            cin.close();
        }
    }
    try{
        in=new FileInputStream("input.txt");
        out=new FileOutputStream("output.txt");
         int data;
         while((data=in.read())!=-1)
         {
             out.write(data);
             
         }

    }
    finally
    {
        if(in!=null)
        {
            in.close();
        }
        if(out!=null)
        {
            out.close();
        }
    }
}
}
