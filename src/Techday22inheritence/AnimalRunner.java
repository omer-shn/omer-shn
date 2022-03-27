package Techday22inheritence;

public class AnimalRunner {

        public static void main(String[] args) {

            Tigre tigre1 =new Tigre();
            tigre1.drink();
            tigre1.eat();
            tigre1.fast();
            System.out.println("=========");



            Animal animal1 =new Animal();
            animal1.drink();
            animal1.eat();

            System.out.println("=========");


            Bird bird1 = new Bird();
            bird1.eat();
        }
}
