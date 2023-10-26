public class LeapYear {
    public static void main(String[] args) {
        int year=100;

        if(year%4==0 && year%100!=0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("not a Leap Year");
        }

        String res=(year%4==0 && year%100!=0)? "Leap Year": "Not a Leap Year";
        System.out.println(res);
    }
}
