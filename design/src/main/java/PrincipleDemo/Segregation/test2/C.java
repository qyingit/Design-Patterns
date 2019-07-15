package PrincipleDemo.Segregation.test2;

import PrincipleDemo.Segregation.test1.Interface1;

public class C {
    public void depend1( Interface1 i ) {
        i.operation1();
    }
    public void depend4( Interface1 i ) {
        i.operation4();
    }
    public void depend5( Interface1 i ) {
        i.operation5();
    }
}
