int saveThePrisoner(int n, int m, int s) {
   int a=(m+s-1)%n;
   if(a==0)
   return n;
   else 
   return a;

}