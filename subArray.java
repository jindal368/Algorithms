
//program to find if there exist a subarray in an array whose sum is equal to 0

//Time complexity : O(n)

import java.util.*;
public class Hashlist {
  
	public static void main(String[] args) {
		boolean result = false;
		int c=0;
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr  = new int[n]; 
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
        Set<Integer> set = new HashSet<>();		
        for(int ele :arr) {
        	set.add(c);
        	c+=ele;
        	if(set.contains(c))
        		result = true;
        }
        System.out.print(result);
	}
}
