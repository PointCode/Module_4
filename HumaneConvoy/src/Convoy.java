/**
 * Created by papa on 14.12.15.
 */class Convoy {
    private int boxInCont;
    private int containerInAvto;

    public Convoy() {
        boxInCont = 27;                                       //количество ящиков в контейнере
        containerInAvto = 12;                                 //количество контейнеров в грузовике
    }

    public void Carrying(int inBox) {
        int inContainer = inBox / boxInCont;                  //колическтво требуемых контейнеров.


        int avto = 0;                                         //Счетчик грузовиков
        int cont = 0;                                         //Счетчик контейнеров
        int box = 0;                                          //счетчик ящиков

        if (inBox % boxInCont > 0) {                         //Добавляем контейнер если остались еще ящики

            inContainer++;
        }

        System.out.println("Количество контейнеров  " + inContainer);

        while (box != inBox) {             // загружаем грузовики контейнервами и контейнеры ящиками

            int boxTruck = 0;                    // Счетчик ящиков в каждом грузовике.
            avto++;
            System.out.println("Грузовик " + avto + " :");

            for (int j = 1; j <= containerInAvto; j++) {             // загружаем грузовики котейнерами

                if (box == inBox) {                                 //если загруженны вся ящики в контейнеры выходим из цикла
                   break;
                }
                cont++;
                System.out.println("  Контейнер " + j + " :");

                for (int k = 1; k <= boxInCont; k++){              // загружаем контейнеры ящиками

                    boxTruck++;
                    box++;
                    System.out.println("     Ящик " + boxTruck);
                    if (box == inBox){                            //ящиков больше не осталось выходим из цикла
                        break;
                    }
                }
            }

        }

        System.out.println("Отправлено ящиков, всего: " + box);
        System.out.println("Отправлено контейнеров всего: " + cont);
        System.out.println("Отправлено горузовиков всего: " + avto);

    }
}