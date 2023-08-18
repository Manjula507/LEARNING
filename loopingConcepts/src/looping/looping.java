package looping;

public class looping {

	public static void main(String[] args) {
		System.out.println("start here");
		forloop();
		whileloop();
		dowhileloop();
		
	}
	  public static void forloop()
	    {
	    	System.out.println("*********************************************");
	    	System.out.println("for loop Example");
	    	for(int i=101;i<=105;i++)
	    	{
	    		System.out.println("Kodnest");
	    	}
	    	System.out.println("*********************************************");
	    	
	    }
	   
	    public static void whileloop()
	    {
	    	System.out.println("*********************************************");
	    	System.out.println("for  whileloop Example");
	    	int i=100;
	    	while(i<=104)
	    	{
	    		System.out.println("Kodnest");
	    		i++;
	    	}
	    	System.out.println("*********************************************");
	    	
	    }
  
    public static void dowhileloop()
    {
    	System.out.println("*********************************************");
    	System.out.println("for while doloop Example");
    	int i=10;
    	do
    	{
    		System.out.println("Kodnest");
    		i++;
    	}while(i<=14);
    	System.out.println("********************************************");
    
    	
    
    
}
}
