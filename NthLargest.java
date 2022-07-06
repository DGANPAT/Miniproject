public class NthLargest
{
		public static void main(String[] args)
		{
			int[] a={4,5,6,82,7,28,45,10};
			int k=4;
			for(int i=0;i<a.length-1;i++)
			{
				for(int j=i+1;j<a.length-1;j++)
				{
					if(a[i]<a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
				if(i==k-1)
				{
					System.out.println("k largest number is"+a[i]);
				}
			}
		}
}