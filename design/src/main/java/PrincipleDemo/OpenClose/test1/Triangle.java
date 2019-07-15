package PrincipleDemo.OpenClose.test1;

public class Triangle extends Shape {
    Triangle(){
        super.m_type =3;
    }

    void draw() {
        System.out.println("绘制三角形");
    }
}
