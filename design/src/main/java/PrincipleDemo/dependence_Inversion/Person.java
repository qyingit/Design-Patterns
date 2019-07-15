package PrincipleDemo.dependence_Inversion;

public class Person {

    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}
