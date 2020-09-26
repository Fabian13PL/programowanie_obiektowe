package fabian.task;

public class Animal {
    private MapDirection mapDirection = MapDirection.NORTH;;
    private Vector2d vector = new Vector2d(2,2);

    @Override
    public String toString() {
        return vector.toString()+" "+mapDirection.toString();
    }
}
