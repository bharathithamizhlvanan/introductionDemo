package introduction;

public class corejavabrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNum =5;
		 String website="rahul shetty acadamy";
		 char letter ='r';
		 double dec = 5.99;
		 boolean mycard= true;
		 
		 System.out.println(myNum +"is the value stored in the myNum variable");
		 System.out.println(website);
		 
		 int[] arr=new int[5];
		 arr[0] = 1;
		 arr[1] = 2;
		 arr[2] = 3;
		 arr[3] = 4;
		 arr[4] = 5;
		 int[] arr2= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		 System.out.println(arr2[3]);
		 
		 //for loop arr.length=5
		 for(int i=2; i<arr.length; i++)
			 
		 {
			 System.out.println(arr[i]);
		 }
		 
				for(int i=10; i<arr2.length; i++)
				{
					System.out.println(arr2[i]);
				}
				
			String[] name = {"rahul","shetty","selenium"};
			for(int i =0; i<name.length;i++)
			{
		     System.out.println(name[i]);
			}
			for (String s: name)
			{
				System.out.println(s);
			}
			
			
			
	}

}
