package eu.senla.task;

public class Main {

    public static void main(String[] args) {
               FactoryTwo factoryTwo = new FactoryTwo();
        Robot robot = new Robot();
    Robot[] robots =new Robot[9];
        for (int i = 0; i < robots.length; i++) {
        robots[i] = new Robot(robot.getNameRobot(), robot.getRoboHead(), robot.getRoboBody());
            System.out.println(robots[i].toString());
        }
    }
}
