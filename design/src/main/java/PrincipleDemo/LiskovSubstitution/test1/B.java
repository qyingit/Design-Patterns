package PrincipleDemo.LiskovSubstitution.test1;

public class B implements Base {

    private A a = new A();

    public int func1(int num1, int num2) {
        return num1 + num2;
    }

    public int func2(int num1, int num2){
        return func1(num1 , num2) + 9;
    }

    public int func3(int num1, int num2){
        return this.a.func1(num1,num2);
    }

}
