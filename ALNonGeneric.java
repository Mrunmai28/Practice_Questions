package Anudip_Core_Java;

import java.util.ArrayList;
import java.util.List;

public class ALNonGeneric {

	public static void main(String[] args) {
		ArrayList al2=new ArrayList<>();//non generic
		al2.add(1);
		al2.add("java");
		al2.add(22.9);
		al2.add('f');
		System.out.println(al2);
	}

}
