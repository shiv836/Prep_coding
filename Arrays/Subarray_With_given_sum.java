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
		int s=sc.nextInt();
		int[] A=new int[n];
		HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
		  A[i]=sc.nextInt();
		}
		boolean flag=false;
		int currSum=0;
		int startIndex=0;
		int endIndex=0;
		for(int i=0;i<n;i++)
		{
		currSum+=A[i];
		mp.put(currSum,i);
		if(currSum==s)
		{
		    startIndex=1;
		 endIndex=i+1;
		 flag=true;
		 break;
		}
		if(mp.containsKey(currSum-s))
		{
		 startIndex=mp.get(currSum-s)+2;;
		 
		 endIndex=i+1;
		 flag=true;
		 break;
		}
		}
	
		if(flag==false)
		{
		System.out.println("-1");    
		}
		else
		{
		    System.out.println(startIndex+" "+endIndex);
		}
		t--;
		}
	}
}
















