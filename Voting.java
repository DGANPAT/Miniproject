class YoungerAgeException extends RuntimeException
{
		public YoungerAgeException(String msg)
		{
			super(msg);
		}
}
class  Voting
{
	public static void main(String[]args )
	{
		try
		{
		int age=15;
		if(age<18)
		{
			throw new YoungerAgeException("You are not eligible");
		}
		else
		{
			System.out.println("You are eligible can you plz voting");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Kapil");

	}

}




