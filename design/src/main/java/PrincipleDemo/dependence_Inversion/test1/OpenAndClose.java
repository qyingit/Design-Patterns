package PrincipleDemo.dependence_Inversion.test1;

public class OpenAndClose implements IOpenAndClose{
    public OpenAndClose(){}

    public OpenAndClose(ChangHong changHong) {
    }
    public void open() {
    }

    public void setTv(ChangHong changHong) {
    }

    public void open(ITV tv) {
        tv.play();
    }
}
