package lessonA2;

import lessonA2.RunAble;
import lessonA2.JumpAble;

public class Robot implements  RunAble, JumpAble {

    private int petrol = 10000;

    @Override
    public String toString() {
        return "Робот";
    }



    @Override
    public boolean jump(int height) {
        boolean canJump = petrol>=height;
        petrol-=height;
        System.out.println(canJump?"Робот перепрыгнул":"Робот не перепрыгнул");
        return canJump;
    }



    @Override
    public boolean run(int distance) {
        boolean canRun = petrol>=distance;
        petrol-=distance;
        System.out.println(canRun?"Робот пробежал":"Робот не пробежал");
        return canRun;
    }


}

