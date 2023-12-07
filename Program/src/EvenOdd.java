import java.util.*;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number");
		int n = scan.nextInt();
		int i =1;
		do
		{
			System.out.println(n+"*"+i+"="+(n*i));
		i++;
		
		}
		while(i<=10);
	}

}