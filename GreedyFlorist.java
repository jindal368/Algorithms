 static int getMinimumCost(int k, int[] c) {
        int i=k,f,s=0,l=c.length;
        Arrays.sort(c);
        while(l>0){
          f=i/k;
          s+=c[l-1]*f;
          i++;
          l--;
        }
        return s;
    }



//for problem statement vist : https://www.hackerrank.com/challenges/greedy-florist/problem?h_r=internal-search
