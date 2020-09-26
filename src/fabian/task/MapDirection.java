package fabian.task;

enum MapDirection {
    NORTH,
    SOUTH,
    EAST,
    WEST;

    public String toString(){
        switch(this) {
            case NORTH: return "Północ";
            case SOUTH: return "Południe";
            case WEST: return "Zachód";
            case EAST: return "Wschód";
            default: return "Błąd";
        }
    }
    MapDirection next(){
        switch (this){
            case WEST: return NORTH;
            case NORTH: return EAST;
            case EAST: return SOUTH;
            default: return WEST;
        }
    }
    MapDirection previous(){
        switch (this){
            case WEST: return SOUTH;
            case NORTH: return WEST;
            case EAST: return NORTH;
            default: return EAST;
        }
    }
    Vector2d toUnitVector(){
        switch (this){
            case SOUTH: return new Vector2d(0,-1);
            case NORTH: return new Vector2d(0,1);
            case EAST: return new Vector2d(1,0);
            default: return new Vector2d(-1,0);
        }
    }
}
