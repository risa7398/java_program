package basic;
import java.util.*;
public class quantity {

	public static void main(String[] args) {
		float quantity, cost, d_cost;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the quantity:");
		quantity = sc.nextFloat();
		cost = quantity * 100;
		System.out.println("toatal cost of the user:" + cost);
		if (cost > 2000) {
			d_cost = cost - cost * 10 / 100;
			System.out.println("after discount:" + d_cost);
		} 
		else {
			System.out.println(cost);
		}

	}

}


