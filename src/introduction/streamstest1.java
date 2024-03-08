package introduction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class streamstest1 {
	//count the number of names starting with alphabet A in list
	//@Test
	public void regular()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Rama");
		int count=0;
		
		for(int i=0;i<names.size();i++)
		{
			String actual=names.get(i);
			if(actual.startsWith("A"));
			{
				count++;
			}
		}
		System.out.println(count);
	}
	@Test
	public void streamFilter()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Rama");
		//there is no life for intermediate operation if there is no terminal operation
		//terminal operation will execute only if intern operation (filter) return true
		//we can create stream package
		//how to use filter in stream API
		Long c= names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		long d=Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->
		 {
			 s.startsWith("A");
			 return true;
		 }
		 ).count();
		System.out.println(d);
	//print all the names of arraylist
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	
	}
	
	@Test
	public void streamMap()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("man");
		names.add("Don");
		names.add("women");
		
		//print names which have last letter as "a" with uppercase
		Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
.forEach(s->System.out.println(s));
        //print names which have first letter as a with uppercase with sorted
		
		//names
		List<String>names1=Arrays.asList("Abhijeet","Don","Alekhya","Adam","Rama");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//merging two different lists
		Stream<String> newStream =Stream.concat(names.stream(), names1.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	
	@Test
	public void streamCollect()
	{
		List<String> ls=Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
	  .collect(Collectors.toList());
		System.out.println(ls.get(0));
	}
	
	
	
	
	
	
	
	
	
	

}
