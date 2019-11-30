public class Singleton {
    private static Singleton intance;
    private String name;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (intance == null) {
            intance = new Singleton();
        }
        return intance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
