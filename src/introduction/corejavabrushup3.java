package introduction;

public class corejavabrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s2 = "rahul shetty academy";
        String s5="hello";
		
		String s2 = new String("welcome");
		String s3 = new String("welcome");
		
String s ="rahul shetty academy";
String [] splittedstring = s.split("shetty");

System.out.println(splittedstring[0]);
System.out.println(splittedstring[1]);

	
System.out.println(splittedstring[1].trim());
for(int i=s.length()-1; i>=0; i--)
{
System.out.println(s.charAt(i));	
}




	}

}
