package fabian.task;

public class OptionsParser {
    MoveDirection[] parse(String[] strings){
        MoveDirection[] moveDirections = new MoveDirection[strings.length];
        for(int i=0; i<strings.length; i++){
            if(strings[i].equals("f") || strings[i].equals("forward"))
                moveDirections[i]=MoveDirection.FORWARD;
            else if(strings[i].equals("b") || strings[i].equals("backward"))
                moveDirections[i]=MoveDirection.BACKWARD;
            else if(strings[i].equals("l")||strings[i].equals("left"))
                moveDirections[i]=MoveDirection.LEFT;
            else if(strings[i].equals("r")||strings[i].equals("right"))
                moveDirections[i]=MoveDirection.RIGHT;
        }
        return moveDirections;
    }
}
