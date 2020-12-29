package graphics;

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
	public static void main (String[] args) throws IOException {
		BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(rd.readLine());
		while(t>0)
		{
		    int n=Integer.parseInt(rd.readLine());
		    String[] arrayh=rd.readLine().trim().split(" ");
		    int[] array=new int[n];
		    for(int i=0;i<n;i++)
		    {
		     array[i]=Integer.parseInt(arrayh[i]);  
		    }
		    int[] maxRight=new int[n];
		    int[] maxLeft=new int[n];
		    int resultRight=array[0];
		    int resultLeft=array[n-1];
		    for(int i=0;i<n;i++)
		    {
		     resultRight=Math.max(resultRight,array[i]);
		    maxRight[i]= resultRight;   
		    }
		  for(int j=n-1;j>=0;j--)
		    {
		     resultLeft=Math.max(resultLeft,array[j]);
		    maxLeft[j]= resultLeft;   
		    }
		    int sum=0;
		    for(int i=1;i<n-1;i++)
		    {
		    int min=Math.min(maxLeft[i],maxRight[i]);
		    if(min-array[i]>0)
		    {
		        sum+=min-array[i];
		    }
		    }
		    System.out.println(sum);
		    t--;
		}
	}
}













