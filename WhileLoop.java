package Anudip_Core_Java;

public class WhileLoop {

	public static void main(String[] args) {
		int i=10;
		while(i>=10)   
		{
			i++;
			if(i%5==0)
			{
				//continue;
				break;
			}
			System.out.println(i);
		}

	}

}
