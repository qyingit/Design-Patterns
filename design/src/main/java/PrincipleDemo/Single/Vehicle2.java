package PrincipleDemo.Single;

//类上遵守单一职责原则，在方法级别上，任然遵守但一职责
public class Vehicle2 {

    public void run(String vehicle){
        System.out.println(vehicle + "在路上跑。。");
    }

    public void runAir(String vehicle){
        System.out.println(vehicle + "在天空飞");
    }

    public void runWater(String vehicle){
        System.out.println(vehicle + "在水里游。。");
    }
}
