package PrincipleDemo.dependence_Inversion;

public class Email implements IReceiver{

    public String getInfo() {
        return "电子邮件信息:hello world";
    }
}
