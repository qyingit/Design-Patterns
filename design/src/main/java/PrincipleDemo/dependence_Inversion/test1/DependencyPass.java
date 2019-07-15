package PrincipleDemo.dependence_Inversion.test1;

public class DependencyPass {

    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(changHong);

        OpenAndClose openAndClose1 = new OpenAndClose(changHong);
        openAndClose1.open();

        OpenAndClose openAndClose2 = new OpenAndClose();

        openAndClose2.setTv(changHong);
        openAndClose2.open();
    }
}
