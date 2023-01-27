package VuramPractice;

public class ReveseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=98687;
		String reve="";
		while(num!=0) {
			reve=reve+num%10;
			num=num/10;
		}
		int i=Integer.parseInt(reve);
		System.out.println(i);
		System.out.println(reve);
	}

}
