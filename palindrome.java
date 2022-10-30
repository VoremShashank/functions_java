public class palindrome {
    public static boolean ispalindromes(int number) {
        int palindrome=number;
        
        int reverse=0;
        while (palindrome!=0){
           
            int remainder = number%10;
            reverse=reverse*10+remainder;
            
            number=number/10;

        }
        if(number==reverse){
            return true;
        }
        return false;

     }
    public static void main(String[] args) {
        int palindrome=121;
      if(ispalindromes(palindrome)){
        System.out.println("it is a palindrome");
      }
      else{
        System.out.println("it is not a palindrome");
      }
    }
        
}
    

