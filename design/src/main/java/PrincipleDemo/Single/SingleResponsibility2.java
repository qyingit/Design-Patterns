package PrincipleDemo.Single;

public class SingleResponsibility2 {

    public static void main(String[] args) {

        //单一职责原则
        //这样改动大，同时修改客户端
        //改进,直接修啊给iVehicle,改动代码小
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}
