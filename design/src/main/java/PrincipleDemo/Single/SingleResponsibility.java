package PrincipleDemo.Single;

public class SingleResponsibility {

    public static void main(String[] args) {
        Velicle  velicle = new Velicle();
        velicle.run("摩托车");
        velicle.run("汽车");
        //bad demo  should according to traffic tools driver ways,to change difference class
        velicle.run("飞机");
    }
}
