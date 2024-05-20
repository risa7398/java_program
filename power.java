package basic;
import java.util.*;
public class power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	       System.out.print("enter the number: ");

	       int a = sc.nextInt();

	       System.out.print("enter the power:");

	       int b = sc.nextInt();

	       int power = 1;

	       if (b>= 1) {

	           for (int i = 1; i <= b; i++) {

	               power = power * a;

	           }

	           System.out.println(power);

	    }
	}
}
