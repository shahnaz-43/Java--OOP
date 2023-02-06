package Method;

public class Test {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Robert Jhon";
        t1.age = 33;
        t1.gender="Male";
        t1.qualification = "MSc in ML";
        t1.display();
        Teacher t2 = new Teacher();
        t2.name = "Suphia Kalberg";
        t2.age = 30;
        t2.gender = "Female";
        t2.qualification = "MSc in CS";
        t2.display();
    }
}
