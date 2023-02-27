package Constructor;

public class Main // Class
{
    String Name; // Features : Data Members
    public Main(String name){
        this.Name = name;
    }

    public static void main(String[] args) {

        Main objOne = new Main("Something");
        Main objTwo = new Main("Someone");
        Main objThree = new Main ("X");
        System.out.println(objOne.Name);
        System.out.println(objTwo.Name);
        System.out.println(objThree.Name);
    }
}


