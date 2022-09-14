import java.util.*;

public class Main {

    public static void main(String[] args) {
      Bank bank = new Bank();
      Client john = new Client(1,"John",23);
      Client ben = new Client(2,"Ben",34);
      Account accountJohnOne = bank.createAccount("1",john,32);
      Account accountJohnTwo = bank.createAccount("2",john,44);
      Account accountBenOne = bank.createAccount("3",ben,44);


        System.out.println(bank.findClient(accountBenOne));
        System.out.println(bank.findClient(accountJohnTwo));
        System.out.println(bank.getAccounts(john));
        System.out.println(bank.getAccounts(ben));


    }
}