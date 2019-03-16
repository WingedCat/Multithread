package Thread3_1.Thread3_1_3.test1;

public class Test2 {
    public static void main(String[] args) {
        try{
            String lock = new String();
            System.out.println("syn 上面");
            synchronized (lock){
                System.out.println("syn 第一行");
                lock.wait();
                System.out.println("wait 下面的代码");
            }
            System.out.println("syn 下面的代码");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        /**
         * syn 上面
         * syn 第一行
         */
    }
}
