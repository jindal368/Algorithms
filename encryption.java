 static String encryption(String s) {
     double l=s.length();
     int r=(int)Math.sqrt(l),c;
     if(Math.pow(r,2)==l)
         c=r;
         else
         c=r+1;
    
     if(r*c<l){
       while(r*c<l)
           r++;
     }
     
     int i,j,k=0,m=0;
     char[][] t=new char[r][c];
     char[] ch=s.toCharArray();
     for(i=0;i<r;i++)
     {
         for(j=0;j<c;j++)
         {  
             if(m<l){
              t[i][j]=ch[m];
              m++;
             }
         }
     }
     String s2=new String();
       for(i=0;i<c;i++)
     {
         for(j=0;j<r;j++)
         {  
            if(t[j][i]>='a' && t[j][i]<='z')
            s2+=t[j][i];
            else
            continue;
         }
           
            s2+=' ';
     }
     
     return s2;
    }
