import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Client {
    private int id;
    private String name;
    private int age;
    private final Set <Account> activeAccounts;

    public Client(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.activeAccounts = new HashSet<>();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && Objects.equals(name, client.name);
    }
    public Set<Account> getActiveAccounts() {
        return activeAccounts;
    }

    public void addAccount (Account account) {
        activeAccounts.add(account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
