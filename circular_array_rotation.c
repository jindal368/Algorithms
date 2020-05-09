int* circularArrayRotation(long int a_count, int* a, int k, int queries_count, int* queries, int* result_count) {int i,j;

static int r[1000000];
static int t[1000000];

for(i=0;i<a_count;i++)
{    j=i+k;
    if(j>=a_count)
     
      j=(j-a_count)%a_count;
      t[j]=a[i];
}
for(j=0;j<queries_count;j++)
{
   r[j]=t[queries[j]];
}*result_count=queries_count;
return r;

}
