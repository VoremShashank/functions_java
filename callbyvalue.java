public class callbyvalue {
    public static void swap(int a, int b){
         int temp =a;
         a=b;
         b=temp;
         System.out.println(a);
         System.out.println(b);
    }
    public static void main(String[] args) {
        int a =6;
        int b=7;
        swap(a,b);
        System.out.println(a);
        System.out.println(b);
    }
    
}
/* call by value means the copy of the variables are passed to the function definition
 * but it only change inside the function but the values dont change in the main function.
 */
