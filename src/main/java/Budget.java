import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Budget implements Comparable<Budget> {

    private long id;
    private String name;
    private Set<User> users = new HashSet<>();
    private LocalDate startDate;
    private LocalDate endDate;
    private SortedSet<Group> groups = new TreeSet<>();
    private Set<Transaction> transactions = new HashSet<>();

    public Budget(long id, String name, Set<User> users, LocalDate startDate, LocalDate endDate, SortedSet<Group> groups, Set<Transaction> transactions) {
        this.id = id;
        this.name = name;
        this.users = users;
        this.startDate = startDate;
        this.endDate = endDate;
        this.groups = groups;
        this.transactions = transactions;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public SortedSet<Group> getGroups() {
        return groups;
    }

    public void setGroups(SortedSet<Group> groups) {
        this.groups = groups;
    }

    public Set<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Budget budget = (Budget) o;
        return id == budget.id && name.equals(budget.name) && users.equals(budget.users) && startDate.equals(budget.startDate) && endDate.equals(budget.endDate) && groups.equals(budget.groups) && transactions.equals(budget.transactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, users, startDate, endDate, groups, transactions);
    }

    @Override
    public String toString() {
        return "Budget{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", users=" + users +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", groups=" + groups +
                ", transactions=" + transactions +
                '}';
    }

    @Override
    public int compareTo(Budget budget) {
        return thiis.id.compareTo(budget.getId());
    }
}
