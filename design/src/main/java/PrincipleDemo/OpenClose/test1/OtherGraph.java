package PrincipleDemo.OpenClose.test1;

public class OtherGraph extends Shape {
    OtherGraph(){
        super.m_type = 4;
    }
    void draw() {
        System.out.println("绘制其它矩形");
    }
}
