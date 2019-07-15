package PrincipleDemo.dependence_Inversion.test3;


public class DependencyPass {

    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose2 = new OpenAndClose();

        openAndClose2.setItv(changHong);
        openAndClose2.open();
    }
}
