public class Palindrome
{
		public static void main(String[] args)
		{
			String s="NAVAN";
			String reverse="";
			int size =s.length();
			for(int i=size-1;i>=0;i--)
			{
				reverse=reverse+s.charAt(i);
			}
				System.out.println(reverse);
			
			if(reverse.equals(s))
			{
				System.out.println("String is a palindrome");
			}
			else
			{
				System.out.println("String is not  palindrome");
			}
		}
}