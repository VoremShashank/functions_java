public class sumofdigits {
    public static int sumofdigit(int n){
        int sumofdigits=0;
        while(n>0){
            int lastdigit=n%10;
            sumofdigits+=lastdigit;
            n=n/10;
        }
        return sumofdigits;


    }
    public static void main(String[] args) {
        System.out.println(sumofdigit(123));
    }
    
}
