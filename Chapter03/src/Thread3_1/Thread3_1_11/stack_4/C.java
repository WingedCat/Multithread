package Thread3_1.Thread3_1_11.stack_4;

public class C {
    private MyStack myStack;

    public C(MyStack myStack){
        this.myStack = myStack;
    }

    public void popService(){
        System.out.println("pop="+myStack.pop());
    }
}
