package Thread2_2.Thread2_2_13.innerClass;

public class Run {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setPassword("passwordValue");
        publicClass.setUsername("usernameValue");
        System.out.println(publicClass.getUsername()+"  "+publicClass.getPassword());

        PublicClass.PrivateClass privateClass = publicClass.new PrivateClass();
        privateClass.setAddress("addressValue");
        privateClass.setAge("ageValue");
        System.out.println(privateClass.getAddress()+"  "+privateClass.getAge());
    }
}
