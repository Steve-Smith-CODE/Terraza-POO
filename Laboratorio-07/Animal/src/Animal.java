class Animal{
    public void AnimalSound(){
        System.out.println("The animal makes a sound");
    }
}
class Pig extends Animal{
    public void AnimalSound(){
        System.out.println("The pig says: wee weee");
    }
}
class Dog extends Animal{
    public void AnimalSound(){
        System.out.println("The dog says: wuao wuao");
    }
}


class Main{
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Pig();
        Animal animal2 = new Dog();
        animal.AnimalSound();
        animal1.AnimalSound();
        animal2.AnimalSound();
    }
}