package array_String;

import java.util.Scanner;

public class Convert_Uppercase 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Only Characters");

		String str = sc.nextLine();
		char[]arr = str.toCharArray();

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=97 && arr[i]<=122)
			{
				arr[i] = (char)(arr[i]-32);

				System.out.print(arr[i]);
			}
			else
			{
				System.out.print(arr[i]);
			}
		}
		sc.close();
	}
}
