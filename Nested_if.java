package Anudip_Core_Java;

import java.util.Scanner;

public class Nested_if {
		

		public static void main(String[] args) {
			int num;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number:");
			num = sc.nextInt();
//			if(num>10)
//			{
//				if(num%2==0)
//				{
//					System.out.println("even number");
//				}
//				else
//				{
//					System.out.println("Not even");
//				}
//			}
//			else
//			{
//				System.out.println("less than 10");
//			}
			if(num>10 && num%2==0)
			{
				System.out.println("even");
			}
			else
			{
				System.out.println("not even");
			}

		}

	}