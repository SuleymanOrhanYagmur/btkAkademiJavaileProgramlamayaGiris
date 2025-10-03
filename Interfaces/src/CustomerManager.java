public class CustomerManager {
    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal; //customermanagerin constructorunda Icustomerdal istiyorum demek
    }
    public void add(){
        // iş kodları burda yazılır
        customerDal.Add();
    }
}
