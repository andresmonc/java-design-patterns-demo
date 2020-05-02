package PrototypePatternDemo;

class Point {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // copy constructor
    // implementing cloneable is too messy
    public Point(Point point){
        this(point.x,point.y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}