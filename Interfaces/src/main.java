public class main {
    public static void main(String[] args) {
        ICustomerDal iCustomerDal = new OracleCustomerDal();
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());


        customerManager.add();

    }
}
