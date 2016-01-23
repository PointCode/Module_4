import core.*;
import core.Camera;

/*
Данная программа контрольно пропускного пункта КПП выполняет следующие действия:
1 - Выводит номер автомобиля
2 - Выводит массу и высоту автомобиля.
3 - Если высота авто больше высоты пункта не пропускает авто.
4 - начисляет сумму оплаты за проезд для легковых и грузовых авто, определяя какой автомобиль легковой или грузовой.
5 - Выводит скорость автомобиля при подъезде к КПП  если скорость выше разрешенной выписывает штраф.
6 - Сверяет номера проезжающих авто с номерами угнанных авто,и не пропускает их сообщая в полицию.
7 - пропускает спецтранспорт бесплатно
*/

public class RoadController
{                    // Перепенная passengerCarMaxWeight тип Double
    public static double passengerCarMaxWeight = 3500.0; // kg
                    // Переменная passengerCarMaxHeight тип Integer
    public static int passengerCarMaxHeight = 2000; // mm
                    //Переменная controllerMaxHeight тип Integer
    public static int controllerMaxHeight = 3500; // mm

                    //Переменная passengerCarPrice тип Integer
    public static int passengerCarPrice = 100; // RUB цена проезда легкового автомобиля
                    //Переменная cargoCarPrice тип Integer
    public static int cargoCarPrice = 250; // RUB цена проезда грузовго автомобиля
                    //Переменная vehicleAdditionalPrice тип Integer
    public static int vehicleAdditionalPrice = 200; // RUB дополнительная цена

                    //Переменная maxOncomingSpeed тип Integer
    public static int maxOncomingSpeed = 60; // km/h
                    //Переменная speedFineGrade тип Integer
    public static int speedFineGrade = 20; // km/h
                    //Переменная finePerGrade тип Integer
    public static int finePerGrade = 500; // RUB
                    //Переменная criminalSpeed тип Integer
    public static int criminalSpeed = 160; // km/h



    public static void main(String[] args)
    {        //Переменная i тип Integer - счетчик цикла.
        for(int i = 0; i < 10; i++)
        {
            Car car = Camera.getNextCar();
            System.out.println(car);
            System.out.println("Скорость: " + Camera.getCarSpeed(car) + " км/ч");

            /**
             * Проверка на наличие номера в списке номеров нарушителей
             */
                  //Переменная policeCalled тип Boolean
            boolean policeCalled = false;
            for(String criminalNumber : Police.getCriminalNumbers())
            {
                //Переменная carNumber тип String
                String carNumber = car.getNumber();
                if(carNumber.equals(criminalNumber)) {
                    Police.call("автомобиль нарушителя с номером " + carNumber);
                    blockWay("не двигайтесь с места! За вами уже выехали!");
                    break;
                }
            }
            if(Police.wasCalled()) {
                continue;
            }

            /**     ПЕРЕНОСИМ ПРОВЕРКУ СПЕЦТАРАНСПОРАТ ПОСЛЕ ЦИКЛА ПРОВЕРКИ НА УГОН.
             * Пропускаем автомобили спецтранспорта
             */

            if(car.isSpecial()) {
                openWay();
               continue; //
            }
            /**
             * Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
             */
                 //Переменная carHeight  тип Integer
            int carHeight = car.getHeight();

                 //Переменная price тип Integer
            int price = 0;
            if(carHeight > controllerMaxHeight)
            {
                blockWay("высота вашего ТС превышает высоту пропускного пункта!");
                continue;
            }
            else if(carHeight > passengerCarMaxHeight)
            {
                      //Переменная weight тип Double
                double weight = WeightMeter.getWeight(car);

                //Грузовой автомобиль
                if(weight > passengerCarMaxWeight)
                {
                    price = cargoCarPrice; // Была перменная для легкового авто passengerCarPrice  нужно для грузового;
                    if(car.hasVehicle()) {
                        price = price + vehicleAdditionalPrice;
                    }
                }
                //Легковой автомобиль
                else {
                    price = passengerCarPrice; // Была перенная cargoCarPrice для грузового нужно passengerCarPrice;
                }
            }
            else {
                price = passengerCarPrice; //цена проезда легкового автомобиля
            }

            /**
             * Проверка скорости подъезда и выставление штрафа
             */
            //Переменная carSpeed тип Integer
            int carSpeed = Camera.getCarSpeed(car);
            if(carSpeed > criminalSpeed)
            {
                Police.call("cкорость автомобиля - " + carSpeed + " км/ч, номер - " + car.getNumber());
                blockWay("вы значительно превысили скорость. Ожидайте полицию!");
                continue;
            }
            else if(carSpeed > maxOncomingSpeed)
            {
                //Переменная overSpeed тип Integer
                int overSpeed = carSpeed - maxOncomingSpeed;

                //Переменная totalFine тип Integer
                int totalFine = finePerGrade * (1 + overSpeed / speedFineGrade);
                System.out.println("Вы превысили скорость! Штраф: " + totalFine + " руб.");
                price = price + totalFine;
            }

            /**
             * Отображение суммы к оплате
             */
            System.out.println("Общая сумма к оплате: " + price + " руб.");
        }

    }

    /**
     * Открытие шлагбаума
     */
    public static void openWay()
    {
        System.out.println("Шлагбаум открывается... Счастливого пути!");
    }

    public static void blockWay(String reason)
    {
        System.out.println("Проезд невозможен: " + reason);
    }
}