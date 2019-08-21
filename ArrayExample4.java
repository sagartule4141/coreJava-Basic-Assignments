package com.hefshine.arrayExample;

import java.util.Scanner;

public class ArrayExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[4];
Scanner sc =new Scanner(System.in);
System.out.println("enter a numbers");

for(int i=0; i<4; i++)
{
	 arr[i]= sc.nextInt();
}
for(int i=0; i<4;i++)
{
	System.out.println("array elements are  " +arr[i]  + " location of elements  are = " +i);
}
	}

}
