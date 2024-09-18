package Base;

import java.io.*;

public class BaseConv{
	public int conv(int bs1,String num,int bs2){
		int number = Integer.parseInt(num,bs1),top = -1;
		char[] ans;
		ans = new char[50];
		
		if((bs1>36)||(bs1<2)||(bs2>36)||(bs2<2)){
			return 0;
		}
		
		if(bs2 == 10){
			System.out.println("\nConversion: " + number);
			return 1;
		}
		
		for(int i=2;number>0;i++){
			
			if(bs2 != i){
				continue;
			}
			
			int temp = (number%bs2);
			number /= bs2;
			
			switch(temp){
				case 0:{
					ans[++top] = '0';
					break;
				}
				case 1:{
					ans[++top] = '1';
					break;
				}
				case 2:{
					ans[++top] = '2';
					break;
				}
				case 3:{
					ans[++top] = '3';
					break;
				}
				case 4:{
					ans[++top] = '4';
					break;
				}
				case 5:{
					ans[++top] = '5';
					break;
				}
				case 6:{
					ans[++top] = '6';
					break;
				}
				case 7:{
					ans[++top] = '7';
					break;
				}
				case 8:{
					ans[++top] = '8';
					break;
				}
				case 9:{
					ans[++top] = '9';
					break;
				}
				case 10:{
					ans[++top] = 'a';
					break;
				}					
				case 11:{
					ans[++top] = 'b';
					break;
				}
				case 12:{
					ans[++top] = 'c';
					break;
				}
				case 13:{
					ans[++top] = 'd';
					break;
				}
				case 14:{
					ans[++top] = 'e';
					break;
				}
				case 15:{
					ans[++top] = 'f';
					break;
				}
				case 16:{
					ans[++top] = 'g';
					break;
				}
				case 17:{
					ans[++top] = 'h';
					break;
				}
				case 18:{
					ans[++top] = 'i';
					break;	
				}				
				case 19:{
					ans[++top] = 'j';
					break;
				}
				case 20:{
					ans[++top] = 'k';
					break;
				}
				case 21:{
					ans[++top] = 'l';
					break;
				}
				case 22:{
					ans[++top] = 'm';
					break;
				}
				case 23:{
					ans[++top] = 'n';
					break;
				}
				case 24:{
					ans[++top] = 'o';
					break;
				}
				case 25:{
					ans[++top] = 'p';
					break;
				}
				case 26:{
					ans[++top] = 'q';
					break;
				}
				case 27:{
					ans[++top] = 'r';
					break;
				}
				case 28:{
					ans[++top] = 's';
					break;
				}
				case 29:{
					ans[++top] = 't';
					break;
				}
				case 30:{
					ans[++top] = 'u';
					break;
				}
				case 31:{
					ans[++top] = 'v';
					break;
				}
				case 32:{
					ans[++top] = 'w';
					break;
				}
				case 33:{
					ans[++top] = 'x';
					break;
				}
				case 34:{
					ans[++top] = 'y';
					break;
				}
				case 35:{
					ans[++top] = 'z';
					break;
				}
			}
		}
		System.out.print("\nConversion: ");
		for(int i=top;i>=0;i--){
			System.out.print(ans[i]);
		}
		
		return 1;
	}
}
