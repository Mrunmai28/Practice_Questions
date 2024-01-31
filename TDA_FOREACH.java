package Anudip_Core_Java;

import java.util.Scanner;

public class TDA_FOREACH {

	public static void main(String[] args) {
		int[][] matA=new int[2][2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)  //Row Represent
		{
			for(int j=0;j<2;j++)   //Column Represent
			{
				System.out.println("Enter row"+(i+1)+ " columns"+(j+1)+" value :");
				matA[i][j]=sc.nextInt();
			}
			
		}
		
		for(int x[]:matA)
		{
			for(int y:x)
			{
				System.out.print(y+"\t");
			}
			System.out.println();
		}

	}

}
