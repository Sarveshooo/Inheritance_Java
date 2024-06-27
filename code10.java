class DEMO
{
    DEMO()
    {
        System.out.println("NON PARAMETERIZED CONSTRU");
    }
    DEMO(int x)
    {
        System.out.println("parametrized construc");
    }
    public static void main(String[] args) {
        DEMO obj=new DEMO();
        DEMO obj1=new DEMO(34);
    }
}