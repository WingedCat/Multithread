package Thread3_1.Thread3_1_3.wait_notify_size5;

public class Run {
    public static void main(String[] args) {
        try{
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(50);
            ThreadB b = new ThreadB(lock);
            b.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    /**
     * wait begin1552304487742
     * 添加了1个元素
     * 添加了2个元素
     * 添加了3个元素
     * 添加了4个元素
     * 已发出通知
     * 添加了5个元素
     * 添加了6个元素
     * 添加了7个元素
     * 添加了8个元素
     * 添加了9个元素
     * 添加了10个元素
     * wait end1552304497796
     * 发出通知了wait还没结束说明notify调用后并不立即释放锁
     */
}
