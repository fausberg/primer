public class Cat extends Animal{
    private String eat;

    public Cat(String color, int size, String name, String eat) {
        super(color, size, name);
        this.eat = eat;
    }

    public String getEat() {
        return eat;
    }

    @Override
    public void info() {
        super.info();
        System.out.println(getEat());
    }
}
