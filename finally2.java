class finally2
{
	public static void main(String[] args)
	{
		try 
		{
		int a=100,b=0,c;
		c=a/b;
		System.out.println(c);
	    }
	   
	    finally{
	    	System.out.println("I'm finally block");
	    }
	    System.out.println("Welcome");
	}
}