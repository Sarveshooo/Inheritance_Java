class gun
{
    gun()
    {
        System.out.println(this);
    }
}
class run extends gun
{
    run()
    {
        System.out.println(this);
    }
    public static void main(String[] args) {
        run  obj=new run();
       //System.out.println(this);
    }


}