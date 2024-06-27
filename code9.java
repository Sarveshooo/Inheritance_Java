class sham
{
    int x=10;
    int y=20;
    static int z=30;
    sham()
    {
        System.out.println("IN PARENT CONSTRUCTOR");
    }
    void fun()
    {
        System.out.println("IN FUN PARENT");
    }
}
class ganu extends sham
{
    int x=30;
    int y=50;
    ganu()
    {
        System.out.println("IN CHILD CONSTRUCTOR");
        System.out.println(super.x);
        System.out.println(super.y);

    }
    void fun()
    {
        System.out.println("IN FUN CHILD");
        super.fun();
    }
    public static void main(String[] args) {
        ganu obj=new ganu();
        obj.fun();
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(sham.z);
    }


    }


