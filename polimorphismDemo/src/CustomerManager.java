public class CustomerManager {
    private  BaseLogger logger;
    public CustomerManager(BaseLogger logger){
        this.logger  = logger;
    }

    public void add(){
        System.out.println("Müşteri eklendi ");
        // DataBaseLogger logger = new DataBaseLogger();
        this.logger.log("log mesajı");

    }


}
