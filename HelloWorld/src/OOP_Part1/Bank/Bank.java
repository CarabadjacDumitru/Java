package OOP_Part1.Bank;
import java.util.ArrayList;

public class Bank {
    private String nameBank;
    private ArrayList<Branch> listBranches;

    public Bank(String nameBank) {
        this.nameBank = nameBank;
        listBranches = new ArrayList<>();
    }


    public String getNameBank() {
        return nameBank;
    }

    public ArrayList<Branch> getListBranches() {
        return listBranches;
    }

    public void AddBranch(Branch addBranch){
        listBranches.add(addBranch);
    }

}
