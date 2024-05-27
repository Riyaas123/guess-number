package Execeptiontopic;

import java.util.Random;
import java.util.Scanner;

public class Sample1 {
public static void main(String[] args)
{
	Random r=new Random();
	int arr[]=new int[3];
	for(int i=0;i<=2;i++)
	{
		arr[i]=r.nextInt((10));
	}
	Scanner sc=new Scanner(System.in);
			int Score=0;
	for(int i=0;i<=2;i++)
	{
		System.out.println("Enter number");
		int ip=sc.nextInt();
		if(ip==arr[i])
		{
			System.out.println("lucky");
			Score=Score+10;
		}
		else
		{
			System.out.println("oops unlucky");
			System.out.println(Score);
		}
		}
	}
}
