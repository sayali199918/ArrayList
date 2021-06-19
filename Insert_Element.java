//3. Write a Java program to insert an element into the array list at the first position.
import java.util.*;
public class Insert_Element {

	public static void main(String[] args) {
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
				Colour_list.add(0, "yellow");
				Colour_list.add(3, "pink");
				Colour_list.add(5, "Orange");
				
				for(String e: Colour_list)
				{
					System.out.println(e);
				}
				
				
			}
	

	}


