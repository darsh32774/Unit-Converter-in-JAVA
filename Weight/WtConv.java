package Weight;

import java.io.*;

public class WtConv{
	public int conv(int wt1,int wt2,double wt){
		double ans = 0,temp = 0;
		
		switch(wt1){
			case 1:{
				temp = wt * 0.001;
				break;
			}
			case 2:{
				temp = wt * 0.2;
				break;
			}
			case 3:{
				temp = wt;
				break;
			}
			case 4:{
				temp = wt * 28.3495;
				break;
			}
			case 5:{
				temp = wt * 453.592;
				break;
			}
			case 6:{
				temp = wt * 1000;
				break;
			}
			case 7:{
				temp = wt * 6350.29;
				break;
			}
			case 8:{
				temp = wt * 1000000;
				break;
			}
			default:{
				return 0;
			}
		}
		
		switch(wt2){
			case 1:{
				ans  = temp * 1000;
				break;
			}
			case 2:{
				ans  = temp * 5;
				break;
			}
			case 3:{
				ans  = temp;
				break;
			}
			case 4:{
				ans  = temp * 0.035274;
				break;
			}
			case 5:{
				ans  = temp * 0.00220462;
				break;
			}
			case 6:{
				ans  = temp * 0.001;
				break;
			}
			case 7:{
				ans  = temp * 0.000157473;
				break;
			}
			case 8:{
				ans  = temp * 0.000001;
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
