package bhavyasri.assignment.singleton;

class staticVariables
{
    String name;

    public static staticVariables stringInitializer(String name)
    {
        name = name;
        staticVariables sobj = new staticVariables();
        return sobj;
    }

    public void printString()
    {
        System.out.println("The name is :"+ name);
    }
}

public class JavaAssignment5_2 {

    public static void main(String[] args) {

        staticVariables var = staticVariables.stringInitializer("bhavya");
        var.printString();

    }

}
