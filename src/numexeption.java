public class numexeption {
    public static void main(String args[])
    {
        try {
            // "ruchi" is not a number
            int num = Integer.parseInt ("ruchi") ;

            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }
}
