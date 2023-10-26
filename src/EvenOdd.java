public class EvenOdd {
    public static void main(String[] args) {
        int n=50;
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        String res=n%2==0 ? "even": "odd";
        System.out.println(n + " is "+res);
    }


}
