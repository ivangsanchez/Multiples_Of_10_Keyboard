package com.multdiez.app;
import java.util.Scanner;
public class multiplodiezsum
{

	public static void main(String[] args) 
	{
		int cont=0,suma=0,num=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a Number: ");
		num=input.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			if(i%10==0)
			{
				System.out.println(i);
				cont++;
				suma+=i;
			}
		}
		System.out.println("Number of %10: "+cont);
		System.out.println("Add of numbers: "+suma);

	}

}
