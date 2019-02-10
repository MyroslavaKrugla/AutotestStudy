public class Cat extends Animal {
    @Override
    public void speak() { // This is a good override.
        System.out.println("Meow.");
    }

    @Override
    public String getType() { // Compile-time error due to mistyped name.
        return "Cat";
    }
}