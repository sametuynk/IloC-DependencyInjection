public class CustomerManager {

    //Dependency Injection ile kod değişimden etkilenmedi.
    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }
    public void add(){
        customerDal.add();
    }
}
