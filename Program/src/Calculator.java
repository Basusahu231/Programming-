import java.util.*;
public class Calculator {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the first number");
	int a = scan.nextInt();
	System.out.println("enter the second number");
	int b = scan.nextInt();
	int res1 = add(a,b);
	System.out.println(res1);
	int res2 = subtract(a,b);
	if(a>b)
	{
		System.out.println( a -  b);
	}
	else
	{
		System.out.println(b-a);
	}
	int res3 = multiply(a,b);
	System.out.println(res3);
	int res4 = division(a,b);
	System.out.println(res4);
	
}
public static int add(int a , int b )
{
int c = a+b;
return c;
}
public static int subtract(int a , int b)
{
	int c = a-b;
	
	return c;
}
public static int multiply(int a , int b )
{
	int  c = a*b;
	return c;
}
public static int division(int a , int b)
{
	int c = a/b;
	return c;
}
}