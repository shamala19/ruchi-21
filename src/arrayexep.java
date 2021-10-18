public class arrayexep {
    public static void main(String args[])
    {
        try{
            int a[] = new int[2];
            a[4] = 7; // accessing 5th element in an array of
            // size 2
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }
    }
}
