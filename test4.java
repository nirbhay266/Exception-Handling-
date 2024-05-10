class test4
{
	public static void main(String[] args)
	{
		test3 t=new test3();
		t.nir();
	}
	public static void nir()
	{
		try 
		{
		int a=100,b=0,c;
		c=a/b;
		System.out.print(c);
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
	}
}