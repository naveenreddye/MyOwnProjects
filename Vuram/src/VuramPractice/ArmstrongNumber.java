package VuramPractice;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num=371;
		int temp=num;
		int sum=0;
		int count=countDig(num);
		int pow;
		
		while (num!=0) {
			pow=num%10;
			int powe=power(pow,count);
			sum=sum+powe;
			System.out.println(powe);
			num=num/10;
		}
		System.out.println("sum "+sum);
		System.out.println("temp "+temp);
		if(temp==sum)
			System.out.println(temp+" it is armstrong num");
		else
			System.out.println(temp+" it is not an armstrong numebre");
		

	}

	private static int power(int pow, int count1) {
		
		int fact=1;
		while(count1!=0) {
			  fact=fact*pow;
			count1--;
		}
		
		return fact;
		
	}

	private static int countDig(int num) {
		int count=0;
		while(num>0) {
			
			num=num/10;
			count++;
		}
		System.out.println(count);
		return count;
	}

}
