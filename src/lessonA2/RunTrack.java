package lessonA2;

import lessonA2.Able;
import lessonA2.RunAble;

public class RunTrack implements Obstacle{

    private int distance;

    public RunTrack(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean createObstacle(Able a) {
        if(!(a instanceof RunAble)) {
            return false;
        }
        else {
            return ((RunAble)a).run(distance);
        }
    }


    @Override
    public String toString() {
        return "\n\nБеговая дорожка "+distance+" метров";
    }

}

