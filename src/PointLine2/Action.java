package PointLine2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aleks on 7/6/16.
 */
public class Action {

    public static double lineLength(Line line) {
        return Math.sqrt(Math.pow(line.getEnd().getX() - line.getStart().getX(),2) + Math.pow(line.getEnd().getY() - line.getStart().getY(),2));
    }

    public static double allLineLength(List<Line> lineList) {
        double sum = 0;

        for (Line line : lineList) {
            sum +=lineLength(line);
        }
        return sum;
    }

    public static List<Line> createList() {
        List<Line> lineList = new ArrayList<>();
        lineList.add(new Line(new Point(1, 3), new Point(2, 6)));
        lineList.add(new Line(new Point(1, 5), new Point(2, 9)));
        lineList.add(new Line(new Point(7, 65), new Point(54, 77)));

        return lineList;
    }

    public static double maxLength(List<Line> lineList) {
        double max = lineLength(lineList.get(0));

        for (Line line : lineList) {
            if (lineLength(line) > max) {
                max = lineLength(line);
            }
        }
        return max;

    }

}
