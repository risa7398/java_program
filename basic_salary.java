package basic;
import java.util.*;
public class basic_salary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float bsalary , gsalary;
		System.out.print("enter the basic salary=");
		bsalary=sc.nextFloat();
		if (bsalary>=10000) {
			gsalary= bsalary+(bsalary * 40/100) + (bsalary * 30/100);
			System.out.print("gross salary is="+gsalary);
		}
		else {
			gsalary= bsalary+(bsalary * 30/100) + (bsalary * 20/100);
			System.out.print("gross salary is="+gsalary);
			
		}
		

	}

}
