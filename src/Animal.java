public class Animal {
    private String color;
    private int size;

    private String name;

    public Animal(String color, int size, String name) {
        this.color = color;
        this.size = size;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public void info(){
        System.out.println(getName());
        System.out.println(getColor());
        System.out.println(getSize());
    }
}
