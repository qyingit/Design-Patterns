package PrincipleDemo.dependence_Inversion.test2;

public class OpenAndClose implements IopenAndClose {

    private ITV itv;

    public OpenAndClose(ITV itv){
        this.itv = itv;
    }

    public void open() {
        this.itv.play();
    }
}
