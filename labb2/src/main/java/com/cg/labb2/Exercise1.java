package com.cg.labb2;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[] {2,6,1,7,9};
		int result=getsecondsmallest(arr);
		System.out.println("Second smallest element in array is"+result);

	}
	static int getsecondsmallest(int [] arr)
	{
		int temp,length;
		if(arr.length==0)
		{
			return 0;
		}
		length=arr.length;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[1];
	}

}
