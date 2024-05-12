package basic;
import java.util.*;
public class discount {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	float cost,tcost,discount, totalcost;
	System.out.print("enter the cost of pen=");
	cost=sc.nextFloat();
	int tpen=70;
	tcost=tpen *cost;
	if(tcost>1000) {
		discount=20/100;
	}
	else {
		discount=10/100;
	}
	totalcost=tcost- (tcost * discount);
	System.out.print("the total price is="+totalcost);

	}

}
