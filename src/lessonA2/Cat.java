package lessonA2;
import lessonA2.JumpAble;
import lessonA2.RunAble;

public class Cat implements RunAble, JumpAble{

    private int remainedDistanceForToday=5000;
    private int maxJumpHeight=5;


    @Override
    public String toString() {
        return "Кот";
    }


    @Override
    public boolean jump(int height) {
        boolean canJump = height<=maxJumpHeight;
        System.out.println(canJump?"Кот перепрыгнул":"Кот не перепрыгнул");
        return canJump;
    }


    @Override
    public boolean run(int distance) {
        boolean canRun = distance<=remainedDistanceForToday;
        remainedDistanceForToday-=distance;
        System.out.println(canRun?"Кот пробежал":"Кот не пробежал");
        return canRun;
    }

}
