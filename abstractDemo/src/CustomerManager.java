public class CustomerManager {

    BaseDatabaseManager databaseManager; // Base sınıf bizim Strategy görevimizi görüyor

    public void getCustomers() {
    //Strategy Pattern
        databaseManager.getData();
        // hangi sınıfı verirseniz onun getDatası çalışıcak

    }
}
