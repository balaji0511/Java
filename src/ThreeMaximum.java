public class ThreeMaximum {
    public static void main(String[] args) {
        int a=60;
        int b=50;
        int c=95;

        if(a>b && a>c){
            System.out.println(a+" is maximum");
        }
        else if(b>c){
            System.out.println(b+" is maximum");
        }
        else{
            System.out.println(c+" is maximum");
        }

        int temp=a>b?a:b;
         int result=temp>c ? temp:c;
        System.out.println(result+" is maximum");
    }
}
