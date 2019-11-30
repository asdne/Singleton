public class TestSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.setName("aaaaaa");
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2.getName());
        System.out.println(s1 == s2);
    }

}
