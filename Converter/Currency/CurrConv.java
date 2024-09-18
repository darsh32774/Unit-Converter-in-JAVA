package Currency;

import java.io.*;

public class CurrConv{
	public int conv(int cur1,double amt,int cur2){
		
		double temp = 0, ans = 0;
		
		switch(cur1){
			case 1:{
				temp = amt;
				break;
			}
			case 2:{
				temp = amt * 1.10935;
				break;
			}
			case 3:{
				temp = amt * 0.00697;
				break;
			}
			case 4:{
				temp = amt * 1.31615;
				break;
			}
			case 5:{
				temp = amt * 0.14089;
				break;
			}
			case 6:{
				temp = amt * 0.67285;
				break;
			}
			case 7:{
				temp = amt * 0.74013;
				break;
			}
			case 8:{
				temp = amt * 1.18212;
				break;
			}
			case 9:{
				temp = amt * 0.12829;
				break;
			}
			case 10:{
				temp = amt * 0.76832;
				break;
			}
			default:{
				return 0;
			}
		}
		
		switch(cur2){
			case 1:{
				ans = temp;
				break;
			}
			case 2:{
				ans = temp * 0.9013;
				break;
			}
			case 3:{
				ans = temp * 143.483;
				break;
			}
			case 4:{
				ans = temp * 0.75968;
				break;
			}
			case 5:{
				ans = temp * 7.09538;
				break;
			}
			case 6:{
				ans = temp * 1.48593;
				break;
			}
			case 7:{
				ans = temp * 1.35092;
				break;
			}
			case 8:{
				ans = temp * 0.84577;
				break;
			}
			case 9:{
				ans = temp * 7.79442;
				break;
			}
			case 10:{
				ans = temp * 1.30133;
				break;
			}
			default:{
				return 0;
			}
		}
		System.out.print("\nConversion: " + ans);
		
		return 1;
	}
}
