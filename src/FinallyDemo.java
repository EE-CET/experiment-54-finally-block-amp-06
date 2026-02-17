import java.util.Scanner;

public class FinallyDemo {
    
         public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter two integers");
            int a=sc.nextInt();
            int b=sc.nextInt();
            try{
                int z=a/b;
                System.out.println("Result: "+z);

            }
            catch (ArithmeticException e)
            {
                System.out.println("Error");

            }
            finally
            {
                System.out.println("Finally block executed");
            }

        }
}
