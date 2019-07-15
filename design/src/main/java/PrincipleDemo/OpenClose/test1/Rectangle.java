package PrincipleDemo.OpenClose.test1;

public class Rectangle extends Shape{
    Rectangle(){
        super.m_type = 1;
    }

    void draw() {
        System.out.println("绘制矩形");
    }
}
