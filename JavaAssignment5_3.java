package bhavyasri.assignment.main;

class Main
{
    public void method1(int age)
    {
        System.out.println("The age is :"+age);
    }

    public void method2(String name)
    {
        System.out.println("The name is "+name);
    }

    public static void creatingObject()
    {
        JavaAssignment5_3 assign = new JavaAssignment5_3();
        //assign.method2("bhavya");
        //we cannot call a method if that method is not present in that class and without inheritance

    }
}

public class JavaAssignment5_3 {

    public static void main(String[] args) {

        Main main = new Main();
        main.method1(10);
        main.method2("bhavya");

    }
}
