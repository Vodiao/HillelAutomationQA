public class HomeWorkQA_8 {
    public static void main(String[] args) {
        Cat cat = new Cat("Bolly");
        cat.play();
        cat.greets();
        Dog dog = new Dog("Oleg");
        dog.greets(new Dog("Oleg2"));
        BigDog bigDog = new BigDog("Oleg3");
        bigDog.greets(new BigDog("Oleg4"));
        greetings(dog);
        interfaces(dog);
        /**
         * Описать в коде структуру классов как показано на диаграммах
         * Describe in code the structure of classes as shown in the diagrams
         */
    }

    public static void greetings(Animal animal) {
        System.out.println(animal.getName() + " Hello!");
    }
    public static void interfaces (Pet pet){
        System.out.println();
        pet.play();
    }

}
