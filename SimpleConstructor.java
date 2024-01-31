package Anudip_Core_Java;
import java.util.Scanner;

public class SimpleConstructor {
	  int i;     //Data Members
	  int j=5;
	  SimpleConstructor(){
		  System.out.println("Constructor called");
	  }
	  void callFun() {                               //Member Function
		 System.out.println("Function called"); 
	  }
	  int add(int a,int b)                         //Member Function
	  {
		  int c=a+b;
//		  System.out.println(c);
		  return c;
	  }
	  public static void main(String[] args) {          //Main function
		  int x,y;
		  Scanner sc=new Scanner(System.in);           //Accept UserInput
		  x=sc.nextInt();
		  y=sc.nextInt();
		  SimpleConstructor s=new SimpleConstructor();                        //Create object of class 
		s.callFun();                             //Call function by object
//		s.add(x,y);
		
		//System.out.println(s.j); 
			s.add(s.i,s.j);
		
		

//		System.out.println(s.add(s.i,s.j));
		int z=s.add(s.i,s.j);
		System.out.println(z);
	}

}


