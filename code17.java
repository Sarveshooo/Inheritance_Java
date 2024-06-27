class show
{
    int x=10;///instance variable 
    show()
    {
        this(20);/////CALL THE CONSTRUCTOR WITH ONE PARAMETER
        System.out.println("constructor show 1");
        System.out.println(x);
    }
    show(int x)
    {
        System.out.println("constructor show 2");
        System.out.println(x);
    }
    public static void main(String[] args) {
        show obj=new show();
    }
}

///////HERE WE UNDERSTAND THAT BY USING ONLY ONE OBJECT WE CAN INITIALIZE MANY CONSTRUCTOR