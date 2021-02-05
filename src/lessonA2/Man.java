package lessonA2;

import lessonA2.RunAble;
import lessonA2.JumpAble;


    public class Man implements RunAble, JumpAble{

        private int remainedDistanceForToday=10000;
        private int maxJumpHeight=2;

        @Override
        public String toString() {
            return "Человек";
        }


        @Override
        public boolean jump(int height) {
            boolean canJump = height<=maxJumpHeight;
            System.out.println(canJump?"Человек перепрыгнул":"Человек не перепрыгнул");
            return canJump;
        }


        @Override
        public boolean run(int distance) {
            boolean canRun = distance<=remainedDistanceForToday;
            remainedDistanceForToday-=distance;
            System.out.println(canRun?"Человек пробежал":"Человек не пробежал");
            return canRun;
        }
    }


