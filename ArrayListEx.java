package Anudip_Core_Java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList<>();//generic
		List<Integer> al1=new ArrayList<Integer>();  
		ArrayList<String> al3=new ArrayList<>();   //create arraylist object of string datatype
		al3.add("Mrunmai");   //add string element
		al3.add("Lokhande");
		System.out.println(al3);
		
		al.add(10);      //add element in Arraylist
		al.add(15);
		al.add(5);
		al1.add(30);
		al1.add(25);
		System.out.println(al);
		System.out.println(al1);
		System.out.println("Before add:"+al.size());   
		al.addAll(al1);
		System.out.println(al);
		System.out.println("After add:"+al.size());    //arraylist size check
		
		int x=al.remove(4);   //remove element by index& store value in x
		System.out.println("After remove:"+al.size());
		System.out.println(al);
		System.out.println(al1);
		System.out.println("Removed number:"+x);
		System.out.println("Position 2:"+al.get(2));  //get element position 
		al.set(1, 50);   //set element by position  
		System.out.println(al);
		
		
		
		Iterator <Integer> i=al.iterator();    //only give one element
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		al.removeAll(al1);       //remove al1 element from al
		System.out.println(al);
		System.out.println();
		
		
		System.out.println("Before sort:"+al);
		al.sort(Comparator.naturalOrder());//asc order
		System.out.println("After Ascending sort:"+al);
		al.sort(Comparator.reverseOrder());//desc order
		System.out.println("After Descending sort:"+al);
		al.clear();            //clear all element in array
		System.out.println(al);   //print empty element
	


	}

}
