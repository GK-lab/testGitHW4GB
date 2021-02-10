package lessonA2;
import lessonA2.RunTrack;
import lessonA2.Wall;

public class Main {

    // задание оказалось очень сложным.
    // сам, наверное, не справился бы с моими знаниями на данный момент.
    // либо это заняло бы месяц обдумываения решения.
    // я проанализировал уже выложенный код. И попробовал сам повторить

        public static void main(String[] args) {

            Able [] participants = {new Cat(), new Man(), new Robot()};
            Obstacle [] obstacles = {new Wall(1), new RunTrack(1000),
                    new Wall(3), new RunTrack(1500), new Wall(12)};

            for(Obstacle obstacle: obstacles) {
                System.out.println(obstacle);
                for(int i = 0; i<participants.length; i++) {
                    if(participants[i] != null) {
                        boolean isSucces = obstacle.createObstacle(participants[i]);
                        if(!isSucces) {
                            participants[i] = null;
                        }
                    }
                }
                System.out.print("Кто смог :");
                printParticipants(participants);
            }
        }

        public static void printParticipants(Able[] participants) {
            for(Able participant: participants) {
                if(participant!=null) {
                    System.out.print(" "+participant);
                }

            }
        }

    }


