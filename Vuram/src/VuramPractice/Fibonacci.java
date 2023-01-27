package VuramPractice;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first = 0, second = 1, result=0;
		
		while(result<20) {
			result = first + second;
            first = second;
            second = result;
            System.out.println(result);
		}
		

	}

}
