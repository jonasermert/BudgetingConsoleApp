import java.util.Objects;

public class Group implements Comparable<Group> {

    private Long id;
    private String name;
    private Budget budget;
    private Set<Category> categories = new TreeSet<>();

    public Group(Long id, String name, Budget budget, Set<Category> categories) {
        this.id = id;
        this.name = name;
        this.budget = budget;
        this.categories = categories;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return id.equals(group.id) && name.equals(group.name) && budget.equals(group.budget) && categories.equals(group.categories);
    }

    @Override
    public int hashCode() {
        // return Objects.hash(id, name, budget, categories);
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", budget=" + budget +
                ", categories=" + categories +
                '}';
    }

    @Override
    public int compareTo(Group o) {
        int compareTo = 0;
        if (this.getId() != null && o.getId() != null)
            compareTo = this.getId().compareTo(o.getId());

        return compareTo;
    }
}
