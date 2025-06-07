class A
{
    public A()
    {
        System.out.println("It is a constructor");
    }
}

public class AnonymousObject {

    public static void main(String args[])
    {
        A a1; //reference creation
        a1 = new A(); // by writing "new A()" , we are creating objects of class A

        new A();// object has been created, it's just an anonymous object for which no variable isn't referencing
    }
}