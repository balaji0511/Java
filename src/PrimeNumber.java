public class PrimeNumber {
    public static void main(String[] args) {
        int n=37;
        int count=0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                count+=1;
            }
        }
        System.out.println(count);
        if(count>2){
            System.out.println(n+" is not a prime");
        }
        else{
            System.out.println(n+" is a prime");
        }

        //average
        boolean isprime=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        if(isprime){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }

        //square root
        boolean prime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
        if(prime){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }


        int a=2;
        if(checkPrime(37,a)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }

    public static boolean checkPrime(int n,int a){
        if(n<2){
            return false;
        }
        if(n==a){
            return true;
        }
        if(n%a==0){
            return false;
        }
        a+=1;
        return checkPrime(n,a);
    }
}
