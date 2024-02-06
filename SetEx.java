package anudip_core_java;
import java.util.*;

public class SetEx {

		public static void main(String[] args) {
			
			Set<String> s=new HashSet<>();           
			s.add("Paritosh");        
			s.add("Mrunmai");
			s.add("Nasrin");
			s.add("Amrish");
			s.add("Nasrin");
			s.add("Praveen");
			s.add("");
			s.add(null);
			s.add(null);     //take null 
			System.out.println(s);
		
			SortedSet<String> s1=new TreeSet<>();      //sorted  in treeset
			s1.add("Paritosh");
			s1.add("Mrunmai");
			s1.add("Nasrin");
			s1.add("Amrish");
			s1.add("Nasrin");
			s1.add("Praveen");
			//s1.add(null);        //gives NullPointerException bez treeset is sortedset
			System.out.println(s1);
			

		}

	}