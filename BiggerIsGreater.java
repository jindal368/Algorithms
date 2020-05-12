//  input => string ...
// we have to return a f(n) which should return a next bigger string in lexographical order.. i.e,
   if input => abcd  the output must be => abdc

// here is the function

 static String biggerIsGreater(String w) {
        int l = w.length(),end=0;
        char temp;
        char[] ch = w.toCharArray();
        for(int i=l-1;i>0;i--){
            if(ch[i-1]<ch[i]){
                end = i;
                break;
            }
        }
        if(end==0)
        return "no answer";
        else{ 
            int rest=end;
              for(int i=end;i<l;i++){
                if(ch[i]>ch[end-1] && ch[i]<ch[end])
                     rest=i;
            }
            temp=ch[end-1];
            ch[end-1]=ch[rest];
            ch[rest]=temp;
            Arrays.sort(ch,end,l);
            
            return new String(ch);
        }
