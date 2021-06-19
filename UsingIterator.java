//2.Write a Java program to iterate through all elements in an array list. 

import java.util.*;
public class UsingIterator {

	public static void main(String[] args) {
		List<String> Colour_list=new  ArrayList<String>();
		Colour_list.add("Black");
		Colour_list.add("Red");
		Colour_list.add("White");
		Colour_list.add("Grey");
		Colour_list.add("Green");
		Colour_list.add("Purple");
		//Traversing list through Iterator
		Iterator itr=Colour_list.iterator();//Getting the iterator
		while(itr.hasNext()) //Check if iterator has the element
		{
			System.out.println(itr.next());//printing the element and move to next
		}

	}

}
