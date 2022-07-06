public class CovidDose
{
		public void getCovidDose(int dose)
		{
			int dose;
			try
			{
			if(dose!=2)
			{
				throw new DoseException("you are not aplicable for 3rd Dose");
			}
			else
			{
				System.out.println("You are aplicable for 3rd dose");
			}
			}
			catch(Exception e)
			{
				e.printStackTrace(); 
			}
		}
		public static void main(String[] args)
		{
			CovidDose c=new CovidDose();
				c.getCovidDose(1);
		}
}
class DoseException extends RuntimeException
{
		public DoseException(String s)
		{
			super(s);
		}
}