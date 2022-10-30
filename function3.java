import java.util.*;
public class function3{
    public static int sum(int a, int b) {
        
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int x=sum(a,b);
            System.out.println(x);
        }
    }
}
/*parameters or formal parameters or normal parameters are written in the function definition
 * actual parameters or arguements are written in the main function  or written in the calling statement
 */