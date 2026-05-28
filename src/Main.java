import com.stschool.ecommerce.controller.CustomerController;
import com.stschool.ecommerce.exception.CustomerExistsException;
import com.stschool.ecommerce.exception.CustomerNotFoundException;
import com.stschool.ecommerce.exception.InvalidCredentialsException;
import com.stschool.ecommerce.factory.AppFactory;
import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.repository.CustomerRepository;
import com.stschool.ecommerce.service.CustomerService;
import com.stschool.ecommerce.service.CustomerServiceImpl;
import com.stschool.ecommerce.ui.CustomerUI;
import com.stschool.ecommerce.util.CsvReader;
public class Main {
    static void main(String[] args) {
        System.out.println("E-commerce Application");

        CustomerController customerController = AppFactory.getCustomerControllerInstance();
        CustomerUI customerUI = new CustomerUI(customerController);


        try{
            Customer existingCustomer =  customerUI.loginCustomer();
            if(existingCustomer != null)
                System.out.println("Login Successful, Welcome: " + existingCustomer.getName() );
        } catch(CustomerNotFoundException | InvalidCredentialsException e){
            System.out.println(e.getMessage());
        }


    }
}