class test5
{
	public static void main(String[] args)
	{
		test3 t=new test3();
		try {
		t.nir();
	     }
	     catch(Exception e)

	     {
	     	System.out.println(e);
	     }
	}
	public static void nir()
	{
		
		int a=100,b=0,c;    
		c=a/b;
		System.out.print(c);
	   
	}
}