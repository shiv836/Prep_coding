

import java.io.*;
import java.util.*;
import java.math.BigInteger;


class Codechef {

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
// kadane algorithm.
// -evaluate current sum.
// -update the current sum.
//-set the current sum to zero if the current sum reaches to less than zero.
//return the anser at the end.
//in kth concatenaation problem, if k=1 ,then simply apply kadane algorithm .
// if k>1, then if the current sum is greater than zero, then the subset sum would be kadane algorithm on two  + (k-2)*currSum;
// if the currentSum is less than zero than the subset sum would be kadane on k=2;

while(t>0)
{
int n=sc.nextInt();
int k=sc.nextInt();
int[] a=new int[n];

long sum=0;
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
sum+=a[i];
}
long ans=0;
long currSum=0;

long maxSum=Long.MIN_VALUE;
if(k==1)
{
 for(int i=0;i<n;i++)
 {
 currSum+=a[i];
  if(currSum>maxSum)  
  {
      maxSum=currSum;
      }
      if(currSum<0)
      {
          currSum=0;
      }
 }
 ans=maxSum;
}
else{
for(int i=0;i<2*n;i++)
{
 
 currSum+=a[i%n];
   if(currSum>maxSum)  
  {
      maxSum=currSum;
      }
      if(currSum<0)
      {
          currSum=0;
      }
 }
 if(sum>=0)
 {
 ans=maxSum+(k-2)*sum;
 }
 else{
     ans=maxSum;
 }
}
System.out.println(ans);
t--;
}

}
}
}














