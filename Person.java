public class Person {
    private String name;
    private int height;
    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }
    @Override
    public String toString() {
        return name + ", рост: " + height;
    }
}
