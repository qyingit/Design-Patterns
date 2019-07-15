package PrincipleDemo.dependence_Inversion.test3;

public class OpenAndClose implements IOpenAndClose {

    private ITV itv;

    public void setItv(ITV itv){
        this.itv = itv;
    }

    public void open() {
        this.itv.play();
    }
}
