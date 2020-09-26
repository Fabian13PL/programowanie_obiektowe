package fabian.task;

public class Animal {
    private MapDirection mapDirection = MapDirection.NORTH;;
    private Vector2d vector = new Vector2d(2,2);

    public MapDirection getMapDirection() {
        return mapDirection;
    }

    public Vector2d getVector() {
        return vector;
    }

    public void setMapDirection(MapDirection mapDirection) {
        this.mapDirection = mapDirection;
    }

    public void setVector(Vector2d vector) {
        this.vector = vector;
    }

    @Override
    public String toString() {
        return vector.toString()+" "+mapDirection.toString();
    }
}
