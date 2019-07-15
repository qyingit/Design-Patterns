package PrincipleDemo.LiskovSubstitution;

public class B extends A{

    //B重写A的方法导致原有功能改变
    public Integer func1(int num1, int num2) {
        return num1 + num2;
    }

    public Integer func2(int num1, int num2) {
        return func1(num1,num2) +9;
    }
}
