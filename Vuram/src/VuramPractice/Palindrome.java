package VuramPractice;

public class Palindrome {

	public static void main(String[] args) {
		
		
		int num=151;
		int dub=num;
		int pal=0;
		int last;
		while(num!=0) {
			last=num%10;
			pal=pal*10+last;
			num=num/10;
		}
		
	
		if(dub==pal) 
			System.out.println("it is palindorme");
		else
		System.out.println("it is not palindorme");
	}

}
