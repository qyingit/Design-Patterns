package PrincipleDemo.dependence_Inversion;

public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());

        person.receive(new WeiXin());
    }
}
