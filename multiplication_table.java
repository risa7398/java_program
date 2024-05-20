package basic;
import java.util.*;
public class multiplication_table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.print("enter the positive integer:");
		a=sc.nextInt();
		for (int i=1; i<=10; i++){
			System.out.println(a+"*"+i+"="+a*i);
		}
			

	}

}
