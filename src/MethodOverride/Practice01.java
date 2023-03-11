package MethodOverride;

public class MORPractice01 {
    public static void main(String[] args) {
        child c=new child();
        c.eat("coffee");
        human h= new human();
        h.eat(5,6);
        c.eat(10,12);
        h.eat("tea"); //test .. cannot be applied

    }
}
class human{
    public void eat(int a,int c){
        System.out.println(a);
        System.out.println(c);
    }
}
class child extends human {
    public void eat(String a){
        System.out.println(a);
    }

}
