package PointLine2;

import java.util.List;

/**
 * Created by Aleks on 7/6/16.
 */
public class Runner {

    public static void main(String[] args) {

        List<Line> lineList = Action.createList();
        Action.allLineLength(lineList);
        Action.maxLength(lineList);
    }
}
