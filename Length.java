public class Length
{
		public static void main(String[] args)
		{
			String s="Ganpat Babanarao Deshmukh";
			int size=s.length();
			int count=0;
			System.out.println("Length of string is>>"+size);
			for(int i=0;i<=size-1;i++)
			{
				char ch=s.charAt(i);
				if(ch=='a')
				{
					count++;
				}
			}
				System.out.println("Number of a in string is>> "+count);
		}
}