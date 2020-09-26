package fabian.task;

public class Animal {
    private MapDirection mapDirection = MapDirection.NORTH;;
    private Vector2d vector = new Vector2d(2,2);

    void move(MoveDirection direction){
        if(direction==MoveDirection.LEFT) {
            this.mapDirection = this.mapDirection.previous();
        }else if(direction==MoveDirection.RIGHT) {
            this.mapDirection = this.mapDirection.next();
        }else if(direction==MoveDirection.FORWARD) {
            moveForward(this);
        }else if(direction==MoveDirection.BACKWARD) {
            moveBackward(this);
        }
    }

    @Override
    public String toString() {
        return vector.toString()+" "+mapDirection.toString();
    }

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

    private void moveBackward(Animal animal) {
        if(animal.vector.x==4 && animal.vector.y==4){
            if(!(animal.mapDirection==MapDirection.SOUTH || animal.mapDirection==MapDirection.WEST))
                animal.vector = animal.vector.add(animal.mapDirection.toUnitVector().opposite());
        }else if(animal.vector.x==0 && animal.vector.y==0){
            if(!(animal.mapDirection==MapDirection.NORTH || animal.mapDirection==MapDirection.EAST))
                animal.vector = animal.vector.add(animal.mapDirection.toUnitVector().opposite());
        }else if(animal.vector.x==4 && animal.vector.y==0) {
            if (!(animal.mapDirection == MapDirection.NORTH || animal.mapDirection == MapDirection.WEST))
                animal.vector = animal.vector.add(animal.mapDirection.toUnitVector().opposite());
        }else if(animal.vector.x==0 && animal.vector.y==4) {
            if (!(animal.mapDirection == MapDirection.SOUTH || animal.mapDirection == MapDirection.EAST))
                animal.vector = animal.vector.add(animal.mapDirection.toUnitVector().opposite());
        }else if(animal.vector.x==4) {
            if (animal.mapDirection != MapDirection.WEST)
                animal.vector = animal.vector.add(animal.mapDirection.toUnitVector().opposite());
        }else if(animal.vector.x==0) {
            if (animal.mapDirection != MapDirection.EAST)
                animal.vector = animal.vector.add(animal.mapDirection.toUnitVector().opposite());
        }else if(animal.vector.y==4) {
            if (animal.mapDirection != MapDirection.SOUTH)
                animal.vector = animal.vector.add(animal.mapDirection.toUnitVector().opposite());
        }else if(animal.vector.y==0) {
            if (animal.mapDirection != MapDirection.NORTH)
                animal.vector = animal.vector.add(animal.mapDirection.toUnitVector().opposite());
        }else
            animal.vector = animal.vector.add(animal.mapDirection.toUnitVector().opposite());
    }
    private void moveForward(Animal animal){
        if(animal.vector.x==4 && animal.vector.y==4){
            if(!(animal.mapDirection==MapDirection.NORTH || animal.mapDirection==MapDirection.EAST))
                animal.vector = animal.vector.add(animal.mapDirection.toUnitVector());
        }else if(animal.vector.x==0 && animal.vector.y==0){
            if(!(animal.mapDirection==MapDirection.SOUTH || animal.mapDirection==MapDirection.WEST))
                animal.vector = animal.vector.add(animal.mapDirection.toUnitVector());
        }else if(animal.vector.x==4 && animal.vector.y==0) {
            if (!(animal.mapDirection == MapDirection.SOUTH || animal.mapDirection == MapDirection.EAST))
                animal.vector = animal.vector.add(animal.mapDirection.toUnitVector());
        }else if(animal.vector.x==0 && animal.vector.y==4) {
            if (!(animal.mapDirection == MapDirection.NORTH || animal.mapDirection == MapDirection.WEST))
                animal.vector = animal.vector.add(animal.mapDirection.toUnitVector());
        }else if(animal.vector.x==4) {
            if (animal.mapDirection != MapDirection.EAST)
                animal.vector = animal.vector.add(animal.mapDirection.toUnitVector());
        }else if(animal.vector.x==0) {
            if (animal.mapDirection != MapDirection.WEST)
                animal.vector = animal.vector.add(animal.mapDirection.toUnitVector());
        }else if(animal.vector.y==4) {
            if (animal.mapDirection != MapDirection.NORTH)
                animal.vector = animal.vector.add(animal.mapDirection.toUnitVector());
        }else if(animal.vector.y==0) {
            if (animal.mapDirection != MapDirection.SOUTH)
                animal.vector = animal.vector.add(animal.mapDirection.toUnitVector());
        }else
            animal.vector = animal.vector.add(animal.mapDirection.toUnitVector());
    }
}
