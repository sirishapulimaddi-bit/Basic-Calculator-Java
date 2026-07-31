import java.util.Scanner;
public class Calculator{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); //input evadaniki scanner use chestunam
        int c;
        do{ 
            System.out.println("calculator:");
            System.out.println("1.Addition");  
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Square root"); //Bonus feature
            System.out.println("6.Power");       //bonus feature
            System.out.println("7.Exit");
            System.out.println("enter the operation");
            c=sc.nextInt();
            double a,b;
            switch(c)
            {
              case 1:System.out.println("enter 2 values"); //Addition
                    a=sc.nextDouble();
                    b=sc.nextDouble();
                    System.out.println("Add:" + (a+b));
                    break;
              case 2:System.out.println("enter 2 value");   //Subtraction
                    a=sc.nextDouble();
                    b=sc.nextDouble();
                    System.out.println("sub:" + (a-b));
                    break;
              case 3:System.out.println("enter 2 values");  //Multiplication
                    a=sc.nextDouble();
                    b=sc.nextDouble();
                    System.out.println("Mul:"+ (a*b));
                    break;
              case 4:System.out.println("enter 2 values");  //Division
                    a=sc.nextDouble();
                    b=sc.nextDouble();
                    if(b!=0){  //checking divide by zero or not
                    System.out.println("Div:"+ (a/b));
                    }
                    else
                    System.out.println("cannot divide by zero");
                    break;
              case 5:System.out.println("enter a value");   //Square root 
                     a=sc.nextDouble();
                     System.out.println("square root:" + Math.sqrt(a));
                     break;
              case 6:System.out.println("enter base value");  //power
                     a=sc.nextDouble();
                     System.out.println("enter power");
                     b=sc.nextDouble();
                     System.out.println("power:" + Math.pow(a,b));
                     break;
              case 7:System.out.println("Thank You");
                     break;
              default:System.out.println("invalid input"); //if not above operations
            }
        }while(c!=7);
        sc.close();
    }
}