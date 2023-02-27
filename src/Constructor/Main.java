package Constructor;

public class Main // Class
{
    String Name; // Features : Data Members
    public Main(String name)
    {
        this.Name = name;

    }

    public static void main(String[] args) {

        Main objOne = new Main("Something");
        Main objTwo = new Main("Someone");
        Main objThree = new Main ("X");
        System.out.println(objOne.Name);
        System.out.println(objTwo.Name);
        System.out.println(objThree.Name);
        A objOfA = new A();
        objOfA.show();
        B objOfB = new B();
    }
}
// Default Constructor
class A {

    public void show(){
        System.out.println("Class A");
    }
}
// No argument
class B {

    public B (){
        System.out.println("Class B");
    }
}
/*
Type of Constructor

Default , No-arg , Parameterized
*/

