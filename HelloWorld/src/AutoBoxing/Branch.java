package AutoBoxing;
import  java.util.ArrayList;

public class Branch {
    private String nameBranch;
    private ArrayList<Customer> listCustomers;

    public String getNameBranch() {
        return nameBranch;
    }

    public ArrayList<Customer> getListCustomers() {
        return listCustomers;
    }

    public Branch(String nameBranch) {
        this.nameBranch = nameBranch;
        listCustomers = new ArrayList<>();
    }

    public void AddCustomer(Customer addCustomer){
        listCustomers.add(addCustomer);
    }

    public void ShowListCustomers(){
        System.out.println("------------Printing list of Customers------------------");
        for (Customer cst:listCustomers             ) {
            System.out.println("Customer :" + cst.getName());
        }

        System.out.println("------------------------------");
    }

}
