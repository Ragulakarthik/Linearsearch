import java.util.*;
public class Linearsearch
{
	public void linearsearch(int arr[],int x,int roll)
	{
		int count=0;
		for(int i=0;i<x;i++)
		{
			if(roll==arr[i])
			{
				System.out.println("He came to training");
				break;
			}
			else
				count++;
		}
		if(count==x)
			System.out.println("He didn't came to training");
	}
	public static void main(String args[])
	{
		Linearsearch d=new Linearsearch();
		try (Scanner st = new Scanner(System.in)) 
		{
			System.out.println("Enter how many members attended the placement training:");
			int x=st.nextInt();
			System.out.println("Enter the roll numbers of attended students:");
			int arr[]=new int[x];
			for(int i=0;i<x;i++)
			{
				arr[i]=st.nextInt();
			}
			System.out.println("Enter the number you want to search");
			int roll=st.nextInt();
			d.linearsearch(arr,x,roll);
		}
	}
}
