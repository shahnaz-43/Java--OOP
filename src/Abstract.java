public class Abstract {
    public static void main(String[] args) {
        ab b= new bc();
        b.show();

        ab obj2=new bc();
        obj2.something();
        //ab obj= new ab();
    }
}
abstract class ab{
    abstract void show();
    abstract  void something();
}
class bc extends ab{
    public void show(){
        System.out.println("hello");
    }

    @Override
    void something() {
        System.out.println("something");
    }
}


