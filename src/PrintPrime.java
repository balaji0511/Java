public class PrintPrime {

        public static void main (String[]args)
        {
            int n=100;
            for (int i =1; i <=n; i++)
                if (isPrime (i))
                    System.out.print(i+" ");

            System.out.println();
            int lower=10;
            int higher=100;
            for(int i=lower;i<=higher;i++){
                if(isPrime(i)){
                    System.out.print(i+" ");
                }
            }
        }

        static boolean isPrime (int n)
        {
            // 0, 1 negative numbers are not prime
            if (n < 2)
                return false;

            // checking the number of divisors b/w 1 and the number n-1
            for (int i = 2; i < n; i++)
            {
                if (n % i == 0)
                    return false;
            }

            // if reached here then must be true
            return true;
        }
}
