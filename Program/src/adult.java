
public class adult {
String name ;
int age ; 
String gender ; 
int salary ;
public adult (String a , int b , String c , int d)
{
	name = a; 
	age = b ;
	gender = c ; 
	salary = d;
}
void vote ()
{
	System.out.println("adult can vote");
}
void eat ()
{
	System.out.println("adult can eat ");
}
void details ()
{
System.out.println(name);
System.out.println(age);
System.out.println(gender);
System.out.println(salary);
	 
	
}
public static void main(String[] args) {
	adult a1 = new adult("basu" , 23 , "male" , 27823 ) ;
		a1.vote ();
		a1.eat();
	    a1.details();


}
}