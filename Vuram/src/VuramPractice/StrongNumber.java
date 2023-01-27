package VuramPractice;

public class StrongNumber {

	public static void main(String[] args) {
		 int num=145;
		 int temp=num;
		 int a;
		 int sum=0;
		 int fact=1;
		 
		  while(num!=0) {
			  a=num%10;
			  sum=sum+fact(a);
			  num=num/10;
			  
		  }
		  if(sum==temp)
			  System.out.println(temp+" it is strong numebr");
		  else
			  System.out.println(temp+" it is not an strong ");
				 
	}

	private static int fact(int a) {
		int fact=1;
		 while(a!=0) {
			 fact=fact*a;
			 a--;
		 }
		 
		 return fact;
	}

}
