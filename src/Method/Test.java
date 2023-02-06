package Method;

public class Test {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Moshiur";
        t1.age = 26;
        t1.gender="Male";
        t1.qualification = "CSE";
        t1.display();
        Teacher t2 = new Teacher();
        t2.name = "Rahman";
        t2.age = 24;
        t2.gender = "Male";
        t2.qualification = "CSE";
        t2.display();
    }
}
