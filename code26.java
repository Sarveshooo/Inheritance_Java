class show9
{
    int x=0;
    

    show9(int x)
    {
        this.x=x;
        System.out.println("CONSTRUCTOR 1");
    }
    void fun()
    {
        System.out.println(x);
        System.out.println(this.x);
    }
    public static void main(String[] args) {
        show9 obj=new show9(40);
        obj.fun();
    }
    

}