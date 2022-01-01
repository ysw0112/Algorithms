package javaStudy;

public class ExtendsTest {

    public static void main(String[] args) {
        C c = new C();
        c.b.check();
    }
}

class A {
    public A() {
        System.out.println("A 클래스 생성");
    }
}

class B extends A{
    private final int a;

    public B(int a) {
        this.a = a;
        System.out.println("생성자 실행 후 : " + this.a);
    }

    public void check(){
        System.out.println("check : " + a);
    }
}

class C {
    public B b;

    public void initial(){
        b = new B(42);
    }
}

