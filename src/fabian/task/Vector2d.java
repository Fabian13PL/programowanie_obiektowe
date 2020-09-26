package fabian.task;

public class Vector2d {
    public final int x;
    public final int y;
    public Vector2d(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }
    boolean precedes(Vector2d other){
        if(x<=other.x){
            if(y<=other.y){
                return true;
            }else return false;
        }else return false;
    }
    boolean follows(Vector2d other){
        if(x>=other.x){
            if(y>=other.y){
                return true;
            }else return false;
        }else return false;
    }
    Vector2d upperRight(Vector2d other){
        int x, y;
        if(this.x>other.x){
            x=this.x;
        }else x=other.x;
        if(this.y>other.y){
            y=this.y;
        }else y=other.y;
        return new Vector2d(x,y);
    }
    Vector2d lowerLeft(Vector2d other){
        int x, y;
        if(this.x<other.x){
            x=this.x;
        }else x=other.x;
        if(this.y<other.y){
            y=this.y;
        }else y=other.y;
        return new Vector2d(x,y);
    }
    Vector2d add(Vector2d other){
        return new Vector2d(this.x+other.x,this.y+other.y);
    }
    Vector2d subtract(Vector2d other){
        return new Vector2d(this.x-other.x,this.y-other.y);
    }
    public boolean equals(Object other){
        if (!(other instanceof Vector2d))
        return false;
        if (this == other)
            return true;
        else return false;
    }
    Vector2d opposite(){
        return new Vector2d((-1)*this.x,(-1)*this.y);
    }
}
