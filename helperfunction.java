
///binomial coefficient
public class helperfunction {
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;

    }
    public static int bicoe(int n, int r){
        int a= fact(n);
        int n_r=fact(n-r);
        int b=fact(r);
        return a/(n_r * b);
        
    }
    public static void main(String[] args) {
        
         
            System.out.println(bicoe(5,3));
        }

        
    }
    

