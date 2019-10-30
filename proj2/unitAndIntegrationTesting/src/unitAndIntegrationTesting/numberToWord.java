package unitAndIntegrationTesting;

import java.util.*;

public class numberToWord {

	public String numtoWord() {
		String singleDig[] = {" ZERO", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN",
				" ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"};
		String TensMult[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
		int num, temp1,temp2,temp3;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = s.nextInt();
		
		temp1 = num/100;
		temp2 = num/10;
		temp3 = num%10;
		
		if(num>=0 && num<10) {
			System.out.print(singleDig[temp3]);
		}
		else if(num>=10 && num<20) {
			System.out.print(singleDig[num]);
		}
		else if(num>=20 && num<100) {
			System.out.print(TensMult[temp2]);
			if(temp3!=0) {
				System.out.println(singleDig[temp3]);
			}
		}
		else {
			System.out.println(singleDig[num/100%10]+" HUNDRED "+TensMult[num/10%10]+" "+singleDig[num%10]);
		}
		return "abc";
	}
	public static void main(String args[]) {
		numberToWord nToW = new numberToWord();
		String s;
		s = nToW.numtoWord();
	}

}
