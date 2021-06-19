import java.util.ArrayList;
import java.util.List;

//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
//5.Write a Java program to update specific array element by given element.

public class Retrive_Element {

	public static void main(String[] args) {
		List<String> Colour_list=new  ArrayList<String>();
		Colour_list.add("Black");
		Colour_list.add("Red");
		Colour_list.add("White");
		Colour_list.add("Grey");
		Colour_list.add("Green");
		Colour_list.add("Purple");
		System.out.println(Colour_list);
		/*for (int i = 0; i < Colour_list.size(); i++) 
		{
	       System.out.println(Colour_list.get(i));
	    }
		*/
		//insert element
		Colour_list.add(0, "yellow");
		Colour_list.add(3, "pink");
		Colour_list.add(5, "Orange");
		System.out.println(Colour_list);
		
		//retrive Element
		String element=Colour_list.get(3);
		System.out.println("First Element:"+element);
		String Element=Colour_list.get(1);
		System.out.println("Second Element:"+Element);
		System.out.println(Colour_list);
		
		//Update list
		Colour_list.set(4,"pista");
		System.out.println(Colour_list);
		
		/*for(String e: Colour_list)
		{
			System.out.println(e);
		}*/
		
		
	}

}
