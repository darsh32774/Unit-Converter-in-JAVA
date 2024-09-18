package Distance;

import java.io.*;

public class DisConv{
	public int conv(int len1,int len2, double l){
		double temp = 0,ans = 0;
		
		switch(len1){
			case 1:{
				temp = l * 0.001;
				break;
			}
			case 2:{
				temp = l * 0.01;
				break;
			}
			case 3:{
				temp = l * 0.0254;
				break;
			}
			case 4:{	
				temp = l * 0.9144;
				break;
			}
			case 5:{
				temp = l * 0.3048;
				break;
			}
			case 6:{
				temp = l;
				break;
			}
			case 7:{
				temp = l * 1000;
				break;
			}
			case 8:{
				temp = l * 1609.34;
				break;
			}
			case 9:{
				temp = l * 1852;
				break;
			}
			default:{
				return 0;
			}
		}
			
		switch(len2){
			case 1:{
				ans = temp * 1000;
				break;
			}
			case 2:{
				ans = temp * 100;
				break;
			}
			case 3:{
				ans = temp * 39.3701;
				break;
			}
			case 4:{
				ans = temp * 1.09361;
				break;
			}
			case 5:{
				ans = temp * 3.28084;
				break;
			}
			case 6:{
				ans = temp;
				break;
			}
			case 7:{
				ans = temp * 0.001;
				break;
			}
			case 8:{
				ans = temp * 0.000621371;
				break;
			}
			case 9:{
				ans = temp * 0.000539957;
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
