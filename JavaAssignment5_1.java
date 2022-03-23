package bhavyasri.assignment.data;

class DefaultInitializationAssignment
{
    int age;
    char gender;

    public void printInstanceVariables()
    {
        System.out.println("The age is:"+age);
        System.out.println("The gender is:"+gender);
    }

    public void printLocalVariables()
    {
        int local1=0,local2=0;

        //The local variables should be initialized before using them
        System.out.println("The local variable value:"+ local1);
        System.out.println("The local variable value:"+ local2);
    }
}

public class JavaAssignment5_1 {

    public static void main(String[] args) {

        DefaultInitializationAssignment assign = new DefaultInitializationAssignment();
        assign.printInstanceVariables();
        assign.printLocalVariables();
    }

}
