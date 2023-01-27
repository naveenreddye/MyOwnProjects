package VuramPractice;

public class Swap{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=12;
		int b=32;
//		a=a+b;
//		b=a-b;
//		a=a-b;
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		//SwapUsing third variable
		int temp=a;//12
		a=b;//12
		b=temp;
		System.out.println(a);
		System.out.println(b);
		

	}

}
