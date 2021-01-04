/*package whatever //do not write package name here */
package graphics;
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    int n=sc.nextInt();
		    int[] array=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        array[i]=sc.nextInt();
		    }
		    int k=sc.nextInt();
		 int[] maxSum=new int[n];
		int currSum=array[0];
		  maxSum[0]=array[0];
		 for(int i=1;i<n;i++)
		 {
		 if(currSum>0)
		     {
		         maxSum[i]=currSum+array[i];
		         currSum+=array[i];
		     }
		   else
		   {
		       maxSum[i]=array[i];
		       currSum=array[i];
		   }
		  }
		  int sum=0;
		  int result=Integer.MIN_VALUE;
		  int i=0;
		   for(;i<k;i++)
		   {
		    sum+=array[i];   
		   }
		   
		    result=sum;
		    while(i<n)
		    {
		    sum-=array[i-k];
		    sum+=array[i];
		    if(maxSum[i-k]<0)
		    {
		    result=Math.max(result,sum);  
		    }
		    else
		    {
		    result=Math.max(result,sum+maxSum[i-k]);
		    }
		    i++;
		    }
		    System.out.println(result);
		    t--;
		}
	}
}













