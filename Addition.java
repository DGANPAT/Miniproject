public class Addition 
{
		public static void main(String[] args)
		{
			int[] a={1,4,5,2,5};
			int[] b={2,5,3,6,7};
			int[] c=new int[5];
			 
			for(int i=0;i<=a.length-1;i++)
			{
				c[i] = a[i] + b[i];
			}
			for(int z:c)
			{
				System.out.println(z+" , ");
			}
		}
}