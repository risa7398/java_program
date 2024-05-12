package basic;
import java.util.*;
public class marriage_eligibility {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int  female;
		System.out.println("enter the age of female=");
		female=sc.nextInt();
		if (female>=18) {
			System.out.println("she is eligible for marriage");
		}
		else {
			System.out.println("she is not eligible");
		}
		

	}

}
