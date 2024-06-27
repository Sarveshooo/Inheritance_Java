class code16
{
    int x=20;
    code16()
    {
        this(x);
        System.out.println("non ");

    }
    code16(int x)
    {
        System.out.println("parameter");
    }
    code16(int x,int y)
    {
        System.out.println("parameter 2");
    }
    public static void main(String[] args) {
        code16 obj=new code16();
        code16 obj2=new code16();
        code16 obj3=new code16();
    }
}