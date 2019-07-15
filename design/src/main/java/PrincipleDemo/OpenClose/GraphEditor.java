package PrincipleDemo.OpenClose;

public class GraphEditor {

    public void drawShape(Shape s){
        if (s.m_type == 1){
            drawRectangle(s);
        }else if (s.m_type == 2){
            drawCricle(s);
        }else if(s.m_type == 3){
            drawTriangle(s);
        }
    }

    private void drawTriangle(Shape s) {
        System.out.println("绘制三角形");

    }

    private void drawCricle(Shape s) {
        System.out.println("绘制圆形");

    }

    private void drawRectangle(Shape s) {
        System.out.println("绘制矩形");
    }
}
