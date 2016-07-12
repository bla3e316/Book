package pointLine;

/**
 * Created by Aleks on 7/6/16.
 */
public class Line {

    public final Point start;
    public final Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return  start;
    }

    public Point getEnd() {
        return end;
    }
}
