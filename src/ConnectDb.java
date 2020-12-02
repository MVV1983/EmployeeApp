public class ConnectDb {
    //процесс соединения с БД
    public void connectDb() {
        System.out.println("Соединяемся с БД.......");
        System.out.println("Соеденились!");
    }

    //процесс отключения от БД по окончанию работы с ней
    public void disconnectDb() {
        System.out.println("Разъединяюсь с Базой");
    }
}