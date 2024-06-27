class show6
{
    int x=10;
    int y=20;
    show6()
    {
        this(30);
        System.out.println("CONSTRUCTOR 1");
    }
    show6(int x)
    {
        this(20,30);
        System.out.println("constructor 2");
    }
    public static void main(String[] args) {
        show6 obj =new show6();
    
    }
}////////////////////////////////////recursion//////////////////////