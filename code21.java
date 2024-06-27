class show4
{
    int x=10;
    int y=20;
    show4()
    {
        this(30,40);
        System.out.println("constructor 1");
        System.out.println(this.x);//10
        System.out.println(x);//10
    }
    show4( int x)
    {
        this();
        System.out.println("constructor 2");
        System.out.println(this.x);//10
         System.out.println(x);//60
    }
    show4 (int x,int y)
    {
        System.out.println("cnstructor 3");
        System.out.println(this.x);//10
        System.out.println(x);//30
    }
    public static void main(String[] args) {
        show4 obj=new show4();
        show4 obj2=new show4(60);
    }
}