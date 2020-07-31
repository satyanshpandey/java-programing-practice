// ArmstrongNumber
import java.util.Scanner;
public class ArmstrongNumber{
	public static void main(String args[]){
		int num,cube,temp,rem,sum=0;
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter a number for Checking the number is palindrome or not:");
		num = obj1.nextInt();
		temp = num;
		while(num>0){
			// While num is not Equal to 'Zero' Then this loop will be execute.
			rem = num%10;
			// cube = rem*rem*rem;
			sum = sum+(rem*rem*rem);
			num = num/10;
			System.out.println("This is sum:"+sum);
			System.out.println("This is remaning number:"+num);
		}
		if(temp==sum)
			System.out.println("Yes Armstrong Number");
		else
			System.out.println("is not Armstrong Number");

	}
}