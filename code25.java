class show8
{
    int x=10;
    int y=30;

    show8(int x)
    {
        System.out.println("CONSTRUCTOR 1");
    }
    void fun()
    {
        System.out.println(x);
        System.out.println(this.y);
        System.out.println(this.x);
    }
    public static void main(String[] args) {
        show8 obj=new show8(40);
        obj.fun();
    }
    

}