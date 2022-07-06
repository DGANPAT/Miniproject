public class Product
{
		public void productCheck(int weight)
		{
			try
			{
			if(weight<100)
			{
			throw new ProductException("your product weight is below 100");
			}
			else
			{
				System.out.println("Your product weight is>>"+weight);
			}
			
			}
			catch(ProductException e)
			{
				e.printStackTrace();
			}
				System.out.println("yes");
		}
		public static void main(String[]args )
		{
		Product p=new Product();
		p.productCheck(99);
		}
}
 class ProductException extends RuntimeException
{
		public ProductException(String s)
		{
			super(s);
		}
}
