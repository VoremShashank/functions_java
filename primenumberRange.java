public class primenumberRange{
    boolean isPrime=true;
    public static boolean isPrime(int b){
        for(int i=2;i<=b-1;i++){
            if(b%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeinrange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        System.out.println();

    }
    public static void main(String[] args) {
        primeinrange(20);
    }
       
        
    
  
}