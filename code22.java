class show5
{
    int x=10;
    int y=20;
    show5()
    {
        this(30);
        System.out.println("CONSTRUCTOR 1");
    }
    show5(int x)
    {
        this(20,30);
        System.out.println("constructor 2");
    }
    show5(int x,int y)
    {
        this();
        System.out.println("constructor 3");
    }
    public static void main(String[] args) {
        
        show5 obj =new show5();
    }
}/////////////////////////////recursion example//////////////////////