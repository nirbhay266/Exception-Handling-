import java.util.FileInputStream;
import java.util.FileNotFoundException;
class throws1
{
	void readFile() throws fileNotfoundException
	{
		FileInputStream fis=new FileInputStream("‪D:\4th sem\402_41_AntialiasingDithering.pdf");
	}
	void sowfile() throws FileNotfoundException
	{
		FileOutputStream fos=new FileOutputStream("D:\4th sem\402_41_AntialiasingDithering");
	}
}
class test10
{
	public static  void main(String[] args) {
		readFile r=new readFile();
		try {
		r.readFile();
	    }
	    catch(FileNotfoundException e)
	    {
	    	System.ouy.println(e);
	    }
	}
}