import java.util.*;

public class Bank {
    private static HashMap<Account, Client> accounts = new HashMap<>();
    private static HashMap<Client, Set<Account>> clients = new HashMap<>();

    public Account createAccount(String accountID, Client client,int coins)  {
        Account newAccount = new Account(accountID, coins,client);
        if (accounts.containsKey(newAccount)) {
            System.out.println("error");
        }
        accounts.put(newAccount, client);
        client.addAccount(newAccount);
        clients.put(client, client.getActiveAccounts());
        return newAccount;
    }

    //Найти все счета по клиенту (например List getAccounts(Client client) )
    public Set<Account> getAccounts(Client client){
       return clients.get(client);
    }

    //Найти клиента по счету (например Client findClient(Account account) )
    public Client findClient(Account account){
        return accounts.get(account);
    }
}
