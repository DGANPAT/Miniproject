public class PrimeNumber
{
		public static void main(String[] args)
		{
			int primeN=1;
			int count=0; 
			for(int i=primeN;i>0;i--)
			{ 
				if( primeN % i==0 );
				{
					count++;
				}			
			}
			if(count>2)
			{ 
				System.out.println("This is not prime numbber");
			}else
			{ 
				System.out.println("This is a prime number");
			}
		}






}
 

