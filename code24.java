class show7
{
    int x=10;
    int y=20;
    show7()
    {
        this(30);
        super();
        System.out.println("CONSTRUCTOR 1");
    }
    show7(int x)
    {
        super();
        this(20,30);
        
        System.out.println("constructor 2");
    }
    public static void main(String[] args) {
        show7 obj =new show7();
    
    }
}