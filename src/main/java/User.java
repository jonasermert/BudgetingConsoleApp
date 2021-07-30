import java.util.Objects;

public class User {

    private Long id;
    private String username;
    private String password;
    private String confirmPassword;
    private Set<Budget> budgets = new TreeSet<>();
    private Set<Authority> authorities = new HashSet<>();

    public User(Long id, String username, String password, String confirmPassword, Set<Budget> budgets, Set<Authority> authorities) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.budgets = budgets;
        this.authorities = authorities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Set<Budget> getBudgets() {
        return budgets;
    }

    public void setBudgets(Set<Budget> budgets) {
        this.budgets = budgets;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id) && username.equals(user.username) && password.equals(user.password) && confirmPassword.equals(user.confirmPassword) && budgets.equals(user.budgets) && authorities.equals(user.authorities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, confirmPassword, budgets, authorities);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", budgets=" + budgets +
                ", authorities=" + authorities +
                '}';
    }
}
