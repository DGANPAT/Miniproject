public class Multiplication
{
		public static void main(String[] args)
		{
			int[] a={2,5,6,4,7,8};
			int[] b={4,5,7,8,2,7};		
			int[] c=new int[6];
			for(int i=0;i<=a.length-1;i++)
			{
				c[i] = a[i] + b[i];
			}
			for(int z:c)
			{
				System.out.print(z +" , ");
			}
		}
}