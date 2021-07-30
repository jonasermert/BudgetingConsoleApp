import java.util.Objects;

public class Transaction {

    private Long id;
    private LocalDate date;
    private BigDecimal total;
    private String type;
    private String note;
    private Category category;
    private Budget budget;

    public Transaction(Long id, LocalDate date, BigDecimal total, String type, String note, Category category, Budget budget) {
        this.id = id;
        this.date = date;
        this.total = total;
        this.type = type;
        this.note = note;
        this.category = category;
        this.budget = budget;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return id.equals(that.id) && date.equals(that.date) && total.equals(that.total) && type.equals(that.type) && note.equals(that.note) && category.equals(that.category) && budget.equals(that.budget);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, total, type, note, category, budget);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", date=" + date +
                ", total=" + total +
                ", type='" + type + '\'' +
                ", note='" + note + '\'' +
                ", category=" + category +
                ", budget=" + budget +
                '}';
    }
}
