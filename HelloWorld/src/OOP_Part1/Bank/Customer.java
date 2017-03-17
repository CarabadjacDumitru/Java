package OOP_Part1.Bank;
import java.util.ArrayList;


public class Customer {
    private String name;
    private ArrayList<Double> listMoney ;

    public String getName() {
        return name;
    }

    public void AddMoney(double amount){
        listMoney.add(amount);
    }

    public Customer(String name) {
        this.name = name;
        listMoney = new ArrayList<>();
    }

    public ArrayList<Double> getList() {
        return listMoney;
    }

    public void ShowListAmounts(){
        System.out.println("*****************Printing list of money*************");
        for (Double dbl:listMoney             ) {
            System.out.println("A mount :" + dbl);
        }

        System.out.println("******************************");
    }
}
