package ThisRefersInInnerclassAndLambdas;

public class Test {
    int x = 5;

    public void m2() {

        MyInterface interf = new MyInterface() {
            int x = 10;
            public void m1(){
                System.out.println(this.x);
            }
        };
        interf.m1();
    }

//    public void m2() {
//        MyInterface interf = () -> {
//            int x = 10;
//            System.out.println(this.x);
//            System.out.println(x);
//        };
//        interf.m1();
//    }

}

