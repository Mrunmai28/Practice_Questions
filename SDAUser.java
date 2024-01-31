import java.util.Scanner;
public class SDAUser{
    public static void main(String args[]){
      int score[]=new int[5];  //declare with initalize
      Scanner sc=new Scanner(System.in);   //To accept UserInput
         for(int i=0;i<5;i++){
             System.out.println("Enter Position " +(i+1)+ " Value :");  
             score[i]=sc.nextInt();   //store value by position
         }
       for(int i=0;i<5;i++){
             System.out.println(score[i]);   //To print value
       }
    
    }
}