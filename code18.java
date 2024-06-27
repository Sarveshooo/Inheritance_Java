class show1
{
    int x=10;

    show1()
    {
        this(20);
        System.out.println("constructor no 1");
        System.out.println(x);
    }
    show1(int x)
    {
        System.out.println("constructor no 2");
        System.out.println(x);

    }
    public static void main(String[] args) {
        show1 obj=new show1();
    }
}
