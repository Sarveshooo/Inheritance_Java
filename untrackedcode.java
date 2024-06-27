class show10
{
    int x=0;
    

    show10(int x)
    {
        this.x=x;
        System.out.println("CONSTRUCTOR 1");
    }
    void fun(int x)
    {
        System.out.println(x);
        System.out.println(this.x);
    }
    public static void main(String[] args) {
        show10 obj=new show10(40);
        show10 obj2=new show10(170);


        obj.fun(80);
        obj2.fun(1000);

    }
    

}