import java.util.Scanner;
class YoungerAgeException extends RuntimeException
{
	YoungerAgeException(String msg)
	{
		super(msg);
	}
}
class voting
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age=s.nextInt();
		if(age<18)
		{
			throw new YoungerAgeException("You are not eligible for voting");
		}
		else
		{
			System.out.println("Your Voting Sucssecful");
		}
	}
}