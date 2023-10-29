 
public class boy {
	// instance variable
 String name ;
  int age ;

 //  parameterised  constructor 
  public boy(String name  , int age )
  {
	 this .name = name ;
	this .age = age ;
	
  }
   void run()
   {
	   System.out.println(name );
	   System.out.println(age);
	  
   }
public static void main(String[] args) {
	boy b1 = new boy("basu", 2);
	
	 b1.run();
}
}


