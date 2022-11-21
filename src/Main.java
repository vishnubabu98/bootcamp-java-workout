import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in) ;
    public static void main(String[] args) {

       int a,b,c,opt;
        System.out.println("Enter the operation");
        System.out.println("1:Largest\n 2: Smallest\n 3:Prime\n 4:Even 5:Reverse");
        opt=sc.nextInt();

        switch(opt){
            case 1:
                System.out.println("enter the three numbers");
                a=sc.nextInt();
                b=sc.nextInt();
                c=sc.nextInt();
                //checking
                int temp=a>b?a:b;
                int largest=c>temp?c:temp;
                System.out.println("The largest number is: "+largest);
            case 2:
                System.out.println("enter the three numbers");
                a=sc.nextInt();
                b=sc.nextInt();
                c=sc.nextInt();
                //checking
                int tem=a<b?a:b;
                int smallest=c<tem?c:tem;
                System.out.println("The largest number is: "+smallest);
            case 3:
                int num,count=0;
                System.out.println("enter the number to check prime or not");
                num =sc.nextInt();
                for(int i =2 ;i<=num-1;i++)
                {
                    if(num%i== 0)
                    {
                        count++;
                    }
                }

                if(count == 0)

                    System.out.println("prime");
                else
                    System.out.println("not prime");
            case 4:
                int number1;
                System.out.println("enter the number");
                number1 =sc.nextInt();
                if(number1%2==0)
                    System.out.println("Number is even");
                else
                    System.out.println("Number is not even");
            case 5:
                int rev=0,rem=0,number2;
                System.out.println("enter the number to  reversed");
                number2 =sc.nextInt();
                while(number2>0)
                {
                    rem =number2%10;
                    rev =rev*10+rem;
                    number2 = number2/10;
                }

                System.out.println("Reverse of the number is "+rev);

        }


    }


    }
