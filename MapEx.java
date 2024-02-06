package anudip_core_java;
import java.util.*;
public class MapEx {

	public static void main(String[] args) {
		
			Map<Integer,String> m=new HashMap<>();         
			m.put(101,"A");    //Put elements in Map   
			m.put(102, "B");
			
			m.put(101, "M");       //trying duplicate key  
			System.out.println(m);
			System.out.println("Entry:"+m.entrySet());      //key-value pair print
			System.out.println("Key:"+m.keySet());          //print all keys
			System.out.println("Values:"+m.values());       //print all values
			}

		}