class DisplayOverloading
{
    public void disp(char p)
    {
        System.out.println(p);
    }
    public void disp(char p, int num)
    {
        System.out.println(p + " "+num);
    }
}
class nmbrovrloading
{
    public static void main(String args[])
    {
        DisplayOverloading obj = new DisplayOverloading();
        obj.disp('a');
        obj.disp('a',20);
    }
}

