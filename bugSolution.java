public class MyClass {
    public static void main(String[] args) {
        int i = 10;
        try {
            if (args.length > 0) {
                int divisor = Integer.parseInt(args[0]);
                if (divisor != 0) {
                    i = i / divisor;
                    System.out.println(i);
                } else {
                    System.out.println("Cannot divide by zero!");
                }
            } else {
                System.out.println("Please provide a divisor as a command-line argument.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter an integer.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
