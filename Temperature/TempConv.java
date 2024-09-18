package Temperature;

import java.io.*;

public class TempConv{
	public int conv(int temp1,int temp2,double temp){
		double ans = 0;
		
		switch(temp1){
			case 1:{
				switch(temp2){
					case 2:{
						ans = temp - 273.15;
						break;
					}
					case 3:{
						ans = (temp * 1.8) - 459.67;
						break;
					}
					default:{
						return 0;
					}
				}
				break;
			}
			case 2:{
				switch(temp2){
					case 1:{
						ans = temp + 273.15;
						break;
					}
					case 3:{
						ans = (temp * 1.8) + 32;
						break;
					}
					default:{
						return 0;
					}
				}
				break;
			}
			case 3:{
				switch(temp2){
					case 1:{
						ans = (temp - 32) * 5/9 + 273.15;
						break;
					}
					case 2:{
						ans = (temp - 32) * 5/9;
						break;
					}
					default:{
						return 0;
					}
				}
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
