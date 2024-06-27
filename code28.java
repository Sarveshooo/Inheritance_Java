class parent100
{
    parent100()
    {
        System.out.println("IN PARENT CONSTRUCTOR");
    }
}
class child100 extends parent100{
    child100()
    {
        System.out.println("IN CHILD CONSTRUCTOR");
    }
    public static void main(String[] args) {
        child100 objj=new child100();
    }
}