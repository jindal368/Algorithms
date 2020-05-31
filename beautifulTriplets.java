for problem statement visit =>  https://www.hackerrank.com/challenges/beautiful-triplets/problem



  static int beautifulTriplets(int d, int[] arr) {
        int c=0;
        Arrays.sort(arr);
        Set<Integer> set =  new HashSet<>();
        for(int v : arr)
         set.add(v);
        for(int element : arr){
            if(set.contains(element+d) && set.contains(element+2*d))
            c++;
        }
        return c;
    }
