class InSufficientFund extends RuntimeException
{
		public InSufficientFund(String s)
		{
			super(s);
		}
}
class Account
{
	public static void main(String[] args)
	{
		int accountBalance=12000,currentBalance;
		int withdrawAmount=11000;
		if(withdrawAmount>accountBalance)
		{
			throw new InSufficientFund("Your account balance is low");
		}
		
		currentBalance=accountBalance-withdrawAmount;
		System.out.println("Account balance is:>>"+currentBalance);
	}

}