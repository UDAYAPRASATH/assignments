package week6.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollections {

	public static void main(String[] args) {

		List<String> li=new ArrayList<String>();
		
		li.add("HCL");
		li.add("Wipro");
		li.add("Aspire Systems");
		li.add("CTS");
		
		Collections.sort(li);
		
		System.out.println(li.reversed());
		
	}

}
