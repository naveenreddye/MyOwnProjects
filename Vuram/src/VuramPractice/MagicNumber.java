package VuramPractice;

import java.util.Arrays;
import java.util.Iterator;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {2,1,3,6,7,9};
		int b[]={2,1,3,6,7,9};


		int gsum=0,bsum=0;

		Arrays.sort(a);

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]==b[i]) {
				gsum=gsum+a[i];	
			}
			else
				bsum=bsum+a[i];
		}
		System.out.println("bsum == "+bsum+",, gsum== "+gsum);
		System.out.println("Magic value is "+ (gsum-bsum));
	}

}


