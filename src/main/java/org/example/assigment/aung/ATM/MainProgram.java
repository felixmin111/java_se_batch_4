package org.example.assigment.aung.ATM;

public class MainProgram {
    public static void main(String[] args) {
        Account[] accounts = new Account[3];

        accounts[0] = new Account("1344-545-677","1234",1000.00);
        accounts[1] = new Account("abcdef","1234",2000.00);
        accounts[2] = new Account("zxcvb","1234",500.00);

        Service atmService = new Service();
        view atmView = new view(atmService, accounts);

        atmView.mainmenu();
    }


}
