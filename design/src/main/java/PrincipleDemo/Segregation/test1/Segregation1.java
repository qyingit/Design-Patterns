package PrincipleDemo.Segregation.test1;

import PrincipleDemo.Segregation.test1.A;
import PrincipleDemo.Segregation.test1.B;
import PrincipleDemo.Segregation.test1.C;
import PrincipleDemo.Segregation.test1.D;

public class Segregation1 {
    public static void main(String[] args) {
        //todo
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());
        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());

    }
}
