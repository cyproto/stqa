package unitAndIntegrationTesting;

import java.util.*;

public class numberToWord {

	public String numtoWord(int n) {
		String singleDig[] = {" ZERO", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN",
				" ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"};
		String TensMult[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
		int num, temp1,temp2,temp3;
		num = n;
		
		temp1 = num/100;
		temp2 = num/10;
		temp3 = num%10;
		
		String result;
		
		if(num>=0 && num<10) {
			result = singleDig[temp3];
		}
		else if(num>=10 && num<20) {
			result = singleDig[num];
		}
		else if(num>=20 && num<100) {
			result = TensMult[temp2];
			if(temp3!=0) {
				result = result + singleDig[temp3];
			}
		}
		else {
			result = singleDig[num/100%10]+" HUNDRED "+TensMult[num/10%10]+" "+singleDig[num%10];
		}
		return result;
	}
	public static void main(String args[]) {
		numberToWord nToW = new numberToWord();
		String result = nToW.numtoWord(70);
		System.out.println(result);
	}

}
