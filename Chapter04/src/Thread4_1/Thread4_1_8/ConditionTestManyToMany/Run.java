package Thread4_1.Thread4_1_8.ConditionTestManyToMany;


public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThreadA[] threadA = new MyThreadA[10];
        MyThreadB[] threadB = new MyThreadB[10];
        for(int i=0;i<10;i++){
            threadA[i] = new MyThreadA(service);
            threadB[i] = new MyThreadB(service);
            threadA[i].start();
            threadB[i].start();
        }
    }
}
