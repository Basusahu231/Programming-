import java.util.*;
public class demo34 {
public static void main(String[] args) {
demo34 t = new demo34();
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the radius");
	float r = scan.nextFloat();
	t.add(r);
}
public void add(float r)
{
	System.out.println(3.14*r*r);
}
}
