class DisplayOverloading3
{
    public void disp(char c, int num)
    {
        System.out.println("I’m the first definition of method disp");
    }
    public void disp(int num, char c)
    {
        System.out.println("I’m the second definition of method disp" );
    }
}
class seqdataovrldng
{
    public static void main(String args[])
    {
        DisplayOverloading3 obj = new DisplayOverloading3();
        obj.disp('x', 21 );
        obj.disp(22, 'y');
    }
}