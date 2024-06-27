class show2
{
    int x=10;
    int y=20;
    show2()
    {
        this(30,40);
        System.out.println("constructor 1");
    }
    show2(int x)
    {
        System.out.println("constructor 2");
    }
    show2(int x,int y)
    {
        System.out.println("cnstructor 3");
    }
    public static void main(String[] args) {
        show2 obj=new show2();
    }
}