package javaStudy.java8;

abstract class testAbService implements testImpl {
    abstract void abMethod();

    @Override
    public boolean execute() {
        System.out.printf("abImplements");
        return false;
    }

    protected void hello() {
        System.out.printf("hello");
    }

    public void run() {
        System.out.printf("부모 run");
        hello();
    }
}
