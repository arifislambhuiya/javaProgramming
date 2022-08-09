package variable;

public class LocalVariable {
    void local(){
        int num  =  30;//local variable
        System.out.println("This is a variable called local variable " + num);
    }
    public static void main(String[] args) {
       LocalVariable lo = new LocalVariable();
       lo.local();
    }
}
