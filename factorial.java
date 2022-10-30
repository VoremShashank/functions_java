import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;

    }
    public static void main(String[] args) {
        try (Scanner sc = new  Scanner(System.in)) {
            int n=sc.nextInt();
            int c=fact(n);
            System.out.println(c);
        }

        
    }
    
}
