package PrincipleDemo.Segregation.test1;

public class A {
    public void depend1( Interface1 i ) {
        i.operation1();
    }
    public void depend2( Interface1 i ) {
        i.operation2();
    }
    public void depend3( Interface1 i ) {
        i.operation3();
    }
}
