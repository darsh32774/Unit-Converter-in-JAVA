import java.util.Scanner;
import java.lang.*;
import Base.*;
import Currency.*;
import Distance.*;
import Temperature.*;
import Weight.*;
 
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	
		System.out.print("1.Base\n2.Currency\n3.Distance\n4.Temperature\n5.Weight\nWaiting for input: ");
		int choice = sc.nextInt();
		
		switch(choice){
			case 1:{
				System.out.print("\nNumber systems from 2 to 36\n\nFrom: ");
				int bs1 = sc.nextInt();
				System.out.print("To: ");
				int bs2 = sc.nextInt();
				System.out.print("Enter the number: ");
				String num = sc.next();
				
				BaseConv base = new BaseConv();
				
				if(base.conv(bs1,num,bs2) == 0){
				System.out.print("Invalid input.");
				}
				
				break;
			}
			case 2:{
				System.out.print("\nCURRENCIES\n1. U.S. Dollar (USD)\n2. Euro (EUR)\n3. Japanese Yen\n4. Sterling (GBP)\n5. Chinese Yuan (CNY)\n6. Australian Dollar (AUD)\n7. Canadian Dollar (CAD)\n8. Swiss Franc (CHF)\n9. Hong Kong Dollar (HKD)\n10. Singapore Dollar (SGD)\n*Conversion rates updated on : 6th Sept 2024\n\nFrom: " );
				int Cur = sc.nextInt();
				System.out.print("To: ");
				int Cur2 = sc.nextInt();
				System.out.print("Amount: ");
				double amt = sc.nextInt();
				
				CurrConv cur = new CurrConv();
				
				if(cur.conv(Cur,amt,Cur2) == 0){
				System.out.print("Invalid input.");
				}
				
				break;
			}
			case 3:{
				System.out.print("\n1. Millimetre\n2. Centimetre\n3. Inch\n4. Yard\n5. Foot\n6. Metre\n7. Kilometre\n8. Mile\n9. Nautical Mile\nFrom: ");
				int len1 = sc.nextInt();
				System.out.print("To: ");
				int len2 = sc.nextInt();
				System.out.print("Length: ");
				int l = sc.nextInt();
				
				DisConv dis = new DisConv();
				
				if(dis.conv(len1,len2,l) == 0){
				System.out.print("Invalid input.");
				}
				
				break;
			}
			case 4:{
				System.out.print("\n1. Kelvin\n2. Celcius\n3. Farenheit\n\nFrom: ");
				int temp1 = sc.nextInt();
				System.out.print("To: ");
				int temp2 = sc.nextInt();
				System.out.print("Temperature: ");
				double temp = sc.nextInt();
				
				TempConv tem = new TempConv();
				
				if(tem.conv(temp1,temp2,temp) == 0){
				System.out.print("Invalid input.");
				}
				
				break;
			}
			case 5:{
				System.out.print("\n1. Milligram\n2. Carat\n3. Gram\n4. Ounce\n5. Pound\n6. Kilogram\n7. Stone\n8. Tonne\n\nFrom: ");
				int wt1 = sc.nextInt();
				System.out.print("To: ");
				int wt2 = sc.nextInt();
				System.out.print("Amount: ");
				double wt = sc.nextInt();
				
				WtConv weight = new WtConv();
				
				if(weight.conv(wt1,wt2,wt) == 0){
				System.out.print("Invalid input.");
				}
				
				break;
			}
		}
	}
}
