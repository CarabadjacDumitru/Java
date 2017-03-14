package AutoBoxing;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Customer cust1 = new Customer("Dima");
        Customer cust2 = new Customer("Irina");
        Branch  branch1 = new Branch("Branch");
        Bank Victoria = new Bank("Victoria");
        cust1.AddMoney(40);
        cust2.AddMoney(33);
        cust1.AddMoney(50);
        cust1.AddMoney(10);
        cust2.AddMoney(22);
        branch1.AddCustomer(cust1);
        branch1.AddCustomer(cust2);
        Victoria.AddBranch(branch1);
    }
}
