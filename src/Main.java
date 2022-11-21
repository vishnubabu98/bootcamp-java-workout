import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in) ;
    public static void main(String[] args) {

       int a,b,c,opt;
        System.out.println("Enter the operation");
        System.out.println("1:Largest\n");
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
        }


    }
}