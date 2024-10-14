class Parent
{
    void printParentMessage()
    {
        System.out.println("This is parent class");
    }
}

class Child extends Parent
{
    void printChildMessage()
    {
        System.out.println("This is child class");
    }
}
public class P17 {
    public static void main(String[] args)
    {
        Parent parentObject = new Parent();

        parentObject.printParentMessage();

        Child childObject = new Child();

        childObject.printChildMessage();
    }
}