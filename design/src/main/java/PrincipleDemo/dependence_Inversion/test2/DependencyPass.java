package PrincipleDemo.dependence_Inversion.test2;


public class DependencyPass {

    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();

        OpenAndClose openAndClose1 = new OpenAndClose(changHong);
        openAndClose1.open();

    }
}
