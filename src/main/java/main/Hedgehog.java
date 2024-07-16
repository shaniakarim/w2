package main;

public class Hedgehog {
    private String name;
    private int age;
    public Hedgehog() {
        this.name = "Pikseli";
        this.age = 5;
    }
    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void speak(String message) {
        if (message.isEmpty()) {
            System.out.println("I am " + this.name + " and my age is " + this.age + ", but could you still give me input values?");
        } else {
            System.out.println(this.name + ": " + message);
        }
    }
    public void run(int laps) {
        for (int i = 0; i < laps; i++) {
            System.out.println(this.name + " runs really fast!");
        }
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

