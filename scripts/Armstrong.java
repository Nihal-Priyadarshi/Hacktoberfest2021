import java.util.Scanner;

class Armstrong{
	public static void main(String args[]){
		Scanner value = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		String num = value.next();
		int digits = num.length(),remain,arm=0,flag=0;
		int number = Integer.parseInt(num);
		int check = number;
	outer:	while(number > 0){
			remain = number%10;
			number=number/10;
			arm+=Math.pow(remain,digits);
			if(arm == check){
				System.out.println("True");
				flag=1;
				break outer;
			}
		}
		if(flag == 0){
			System.out.println("false");
			}		
	}
}