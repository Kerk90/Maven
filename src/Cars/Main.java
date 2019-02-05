
package Cars;


public class Main {

    public static void main(String[] args) {

        Car[] cars = new Car[4];
        cars[0] = new Ferrari();
        cars[1] = new Mercedes();
        cars[2] = new Toyota();
        cars[3] = new Nissan();

        for (Car car : cars) {
            car.forward();

//приведен только Главный класс с точкой входа
//реализовать абстрактный класс Car  с методом Forward
//реализовать каждый класс машин, который будут наследовать Car и по своему реализовывать метод Forward
//довести до рабочего состояния главный класс
            //System.out.println("");
        }
    }
}
