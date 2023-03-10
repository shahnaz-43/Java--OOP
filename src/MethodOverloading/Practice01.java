package MethodOverloading;

public class Practice01 {

//    public static void eat(String a,String b){
//        System.out.println(a);
//        System.out.println(b);
//    }
//    public static void eat(String a){
//        System.out.println(a);
//    }

        public static void shape(int sideOfA,int sideOfB,int sideOfC){
            System.out.println(sideOfA);
            System.out.println(sideOfB);
            System.out.println(sideOfC);
        }
        public static void shape(int sideOfA,int SideOfB){
            System.out.println(sideOfA);
            System.out.println(SideOfB);
        }
        public static void shape(int radius){
            System.out.println(radius);
        }
        public void write(String pen){
            System.out.println(pen);
        }

        public void write(String pen,String pencil){

            System.out.println(pen);
            System.out.println(pencil);
        }
        public static void main(String[] args) {
//      shape(5,6,5);
//      shape(5,6);
//      shape(7);

            Practice01 m=new Practice01();
            m.write("i am a pen");
            m.write("Bread","Oat");

        }
    }



