package fabian.task;

import java.util.Scanner;

public class World {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Animal animal1 = new Animal();
        String[] strings = new String[5];
        MoveDirection[] moveDirections = new MoveDirection[5];
        OptionsParser par = new OptionsParser();

        for (int i=0; i<5 ;i++){
            strings[i] = scan.nextLine();
        }
        moveDirections = par.parse(strings);
        for (int i=0; i<5 ;i++){
            animal1.move(moveDirections[i]);
            System.out.println(animal1.toString());
        }

    }
}
