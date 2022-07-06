import java.util.HashSet;
public class Duplicate
{
		public static void main(String[] args)
		{
				int[] a= {3,5,6,3,8};
				int[] b= {5,9,7,6,7};
				HashSet<Integer> hs1=new HashSet<>();
				HashSet<Integer> hs2=new HashSet<>();
				for(int no:a)
				{
					hs1.add(no);
				}
				for(int no:b)
				{
					hs2.add(no);
					
				}
				for(int no:hs2)
				{
					boolean z=hs1.add(no);
					if(z==false)
					{
						System.out.println(no);
					}
					
				}
				
		}
}
