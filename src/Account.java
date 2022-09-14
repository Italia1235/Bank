import java.util.Objects;

public class Account {
    private String id;
    private  Client client;
    private int coins;

    public Account(String id, int coins,Client client) {
        this.id = id;
        this.coins = coins;
        this.client = client;
    }

    public Client getClient(){
        return client;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCoins() {
        return coins;
    }



    public void setCoins(int coins) {
        this.coins = coins;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
