package PrincipleDemo.OpenClose.test1;

public class Ocp {

    public static void main(String[] args) {
        GraphEditor graphEditor = new GraphEditor();
        graphEditor.drawShape(new Rectangle());
        graphEditor.drawShape(new Circle());
        graphEditor.drawShape(new Triangle());
        graphEditor.drawShape(new OtherGraph());
    }
}
