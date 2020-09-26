package fabian.task;

public class World {
    public static void main(String[] args) {
        Animal animal1 = new Animal();

        animal1.move(MoveDirection.LEFT);
        for(int i=0; i<3; i++){
            animal1.move(MoveDirection.FORWARD);
            System.out.println(animal1.toString());
        }
        System.out.println(animal1.toString());
    }
}
