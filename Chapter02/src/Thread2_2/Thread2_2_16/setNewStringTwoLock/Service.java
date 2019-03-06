package Thread2_2.Thread2_2_16.setNewStringTwoLock;

public class Service {
    public void serviceMethodA(User user){
        synchronized (user){
            try {
                System.out.println(Thread.currentThread().getName());
                user.setPassword("change");
                Thread.sleep(3000);
                System.out.println("end time = "+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
