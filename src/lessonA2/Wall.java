package lessonA2;

import lessonA2.Able;
import lessonA2.RunAble;
import lessonA2.JumpAble;
import lessonA2.Cat;
import lessonA2.Robot;

public class Wall implements Obstacle{

    private int height;

    public Wall(int height) {

        this.height = height;
    }

    @Override
    public boolean createObstacle(Able a) {
        if(!(a instanceof JumpAble)) {
            return false;
        }
        else {
            return ((JumpAble)a).jump(height);
        }
    }

    @Override
    public String toString() {
        return  "\n\nСтена "+height+" метров";
    }

}
