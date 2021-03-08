package eu.senla.task;

import java.util.Random;

public class Robot {
    String NameRobot;
    RoboHead head;
    RoboBody body;
    int counter = 1;

    // пустой конструктор
    public Robot() {
    }

    // конструктор
    public Robot(String nameRobot, RoboHead head, RoboBody body) {
        NameRobot = nameRobot;
        this.head = head;
        this.body = body;
    }

    // метод для  генерирования имени робота
    public String getNameRobot() {

        NameRobot = "SN" + counter;
        counter++;
        return NameRobot;
    }
    FactoryOne factoryOne = new FactoryOne();
    public RoboHead getRoboHead() {
        head = (RoboHead) factoryOne.robotConstruction();
    return head;
          }
          FactoryTwo factoryTwo = new FactoryTwo();
    public RoboBody getRoboBody(){
        body = (RoboBody) factoryTwo.robotConstruction();
        return body;
    }

        // это в ту стринг
        @Override
        public String toString () {
            return "Robot{" +
                    "NameRobot='" + NameRobot + '\'' +
                    ", head=" + head +
                    ", body=" + body +
                    '}';
        }
    }

