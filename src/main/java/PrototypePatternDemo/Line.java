package PrototypePatternDemo;

import java.io.Serializable;

class Line implements Serializable {

    public Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Line deepCopy() {
        //call copy constructor
        Point newStart = new Point(start);
        Point newEnd = new Point(end);
        return new Line(newStart,newEnd);
    }
}
