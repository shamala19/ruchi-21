public class aritexep {
    public static void main(String args[])
    {
        try {
            int r = 8, s = 0;
            int t = r/s;  // cannot divide by zero
            System.out.println ("Result = " + t);
        }
        catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0");
        }
    }
}
