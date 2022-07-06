import java.util.Scanner
public class Votings
{
		public ageCheck()
		{
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the your age");
			int age=scanner.nextInt();
			try
			{

			if(age<18)
			{
				throw new AgeException("Your age is below 18 you can't vote");
			}
			else
			{
				System.out.println("Your voting is succesfully")
			}
			}
			catch(Exception e)
			{
				e.printStackTrace90;
			}
				System.out.println("yes");
		}
		public static void main(String[]args )
		{
			Voting v=new Voting();
			v.ageCheck();
		}
}
class AgeException extends RuntimeException
{
		public AgeException(String s)
		{
			super(s);
		}
}