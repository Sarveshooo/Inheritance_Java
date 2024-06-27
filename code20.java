class show3
{
    int x=10;
    int y=20;
    show3()
    {
        this(30,40);
        System.out.println("constructor 1");
        //System.out.println(this.x);//10
       // System.out.println(x);10
    }
    show3(int x)
    {
        this();
        System.out.println("constructor 2");
       /// System.out.println(this.x);//10
      /// System.out.println(x);//60
    }
    show3(int x,int y)
    {
        System.out.println("cnstructor 3");
       // System.out.println(this.x);//10
    /// System.out.println(x);//30
    }
    public static void main(String[] args) {
        show3 obj=new show3();
        show3 obj2=new show3(60);
    }
}