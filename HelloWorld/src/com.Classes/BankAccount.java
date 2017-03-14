package com.Classes;

public class BankAccount {
    private String _accountNumber;
    private double _Balance;
    private String _customerName;
    private String _email;
    private String _Telephone;

    public BankAccount(String accNumber, double balance, String custName, String email, String tel) {
        set_accountNumber(accNumber);
        set_Balance(balance);
        set_customerName(custName);
        set_email(email);
        set_Telephone(tel);
    }

    public String get_accountNumber() {
        return _accountNumber;
    }

    public void set_accountNumber(String _accountNumber) {
        this._accountNumber = _accountNumber;
    }

    public double get_Balance() {
        return _Balance;
    }

    public void set_Balance(double _Balance) {
        this._Balance = _Balance;
    }

    public String get_customerName() {
        return _customerName;
    }

    public void set_customerName(String _customerName) {
        this._customerName = _customerName;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_Telephone() {
        return _Telephone;
    }

    public void set_Telephone(String _Telephone) {
        this._Telephone = _Telephone;
    }

    public void DepositFunds(double addBalance) {
        set_Balance(get_Balance() + addBalance);
    }

    public void WithdrawFunds(double withdrawBalance) {

        if (withdrawBalance > get_Balance()) {
            System.out.println("Insuficient funds");
        } else
            set_Balance(get_Balance() - withdrawBalance);
    }

    public void ShowBalance(){
        System.out.println("Balance is " + get_Balance());
    }

}
