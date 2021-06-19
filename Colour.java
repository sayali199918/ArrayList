//1. Write a Java program to create a new array list, add some colors (string) and print out the collection
import java.util.*;
public class Colour {
	public static void main(String args[])
	{
		List<String> Colour_list=new  ArrayList<String>();
		Colour_list.add("Black");
		Colour_list.add("Red");
		Colour_list.add("White");
		Colour_list.add("Grey");
		Colour_list.add("Green");
		Colour_list.add("Purple");
		//System.out.println(Colour_list);
		/*for (int i = 0; i < Colour_list.size(); i++) 
		{
	       System.out.println(Colour_list.get(i));
	    }
		*/
		for(String e: Colour_list)
		{
			System.out.println(e);
		}
		
		
	}
}
