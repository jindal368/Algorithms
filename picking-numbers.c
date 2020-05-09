int pickingNumbers(int a_count, int* a) {
  int i,j,c,t=0;
  for(i=0;i<a_count;i++)
  {    c=0;
      for(j=0;j<a_count;j++)
     { 
         if(a[i]-a[j]==1||a[i]-a[j]==0)
         c++;
     }
     if(c>t)
     t=c;
  }
  return t;
}
// if arr =[4,6,5,3,3,1] => subarrays with absolute difference either 0 or 1 : [4,3,3] , [6,5] 
  then our subarray should be [4,3,3], as absolute difference b/w any two element is either 0 or 1. and having max length 3
  ,then we have to print length of max subarray ie,3.
