


package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class corejavabrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for(int i=0; i<arr2.length; i++)
		{
		if(arr2[i]%2==0)
		{
			//System.out.println(arr2[i]);
		}
		else
		{
			//System.out.println(arr2[i] +" is not multiple of 2");
		}
		}

		List<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("shetty");
		a.add("academy");
		a.add("selenium");
		a.add("java");
		System.out.println(a.get(4));
		
		for(int i=3;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("******");
		for( String val:a)
		{
			System.out.println(val);
		}
		System.out.println(a.contains("shetty"));
		String[] name = {"rahul","shetty","academy"};
		List<String>nameArraylist = Arrays.asList(name);
			nameArraylist.contains("selenium");


	}

}
