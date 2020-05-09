 static int solve(long x) {
        long i=1;
        while(((i*(i+1)*(2*i+1))/6) <=x){
            i++;
        }return (int)i-1;
    }
