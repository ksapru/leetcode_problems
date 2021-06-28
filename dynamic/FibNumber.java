// A recursive solution 

// Probably won't show up in an interview 

class Solution {
    public int fib(int n) {
        
        if (n <= 1) {
            return n;
        }
        
   
        return fib(n - 1) + fib(n - 2);
        
        
    }
}

// An iterative solution 


class Solution {
    public int fib(int N) {
        if (N <= 1) {
            return N;
        }
        return memoize(N);
    }

    public int memoize(int N) {
      int[] cache = new int[N + 1]; // set up a cache 
      cache[1] = 1;

      for (int i = 2; i <= N; i++) {
          cache[i] = cache[i-1] + cache[i-2]; // represents the fib function 
      }
      return cache[N];
    }
}
