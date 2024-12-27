public class MyClass {
    public static void main(String[] args) {
        int i = 10;
        try {
            i = i / 0; //This will cause an ArithmeticException
            System.out.println(i); 
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException caught");
        }
        finally{
            System.out.println("Finally block executed");
        }
    }
}