import java.math.BigDecimal;
import java.util.Objects;

public class Category {

    private Long id;
    private BigDecimal budget;
    private String name;
    private Group group;
    private Set<Transaction> transactions = new TreeSet<>();

    public Category(Long id, BigDecimal budget, String name, Group group, Set<Transaction> transactions) {
        this.id = id;
        this.budget = budget;
        this.name = name;
        this.group = group;
        this.transactions = transactions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
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
        Category category = (Category) o;
        return id.equals(category.id) && budget.equals(category.budget) && name.equals(category.name) && group.equals(category.group) && transactions.equals(category.transactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, budget, name, group, transactions);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", budget=" + budget +
                ", name='" + name + '\'' +
                ", group=" + group +
                ", transactions=" + transactions +
                '}';
    }
}
