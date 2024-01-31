
import java.util.Scanner;
public class USERINPUT{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String nm=sc.next();
        System.out.println("Enter Your RollNo :");
        int rno=sc.nextInt();
        System.out.println("Enter your Percentage :");
        float f=sc.nextFloat();
        System.out.println("Enter your Grade :");
        char ch=sc.next().charAt(0);
        System.out.println("Your Details are : ");
         System.out.println("Your Name : " +nm + "\nYour RollNo :" +rno+ "\nYour Percentage:" +f+ "\nYour Grade:"+ch);
        
    }
}
