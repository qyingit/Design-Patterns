package PrincipleDemo.OpenClose.test1;

public class Circle extends Shape{
    Circle (){
        super.m_type =2;
    }

    void draw() {
        System.out.println("绘制圆形");
    }
}
