 static int maximumToys(int[] prices, int k) {
         int p=0,c=0,i=0;
          Arrays.sort(prices);
          while(p<k){
              p+=prices[i]; 
              i++;
              c++;
          }return c-1;

    }


// for problem statement  visit  https://www.hackerrank.com/challenges/mark-and-toys/problem
