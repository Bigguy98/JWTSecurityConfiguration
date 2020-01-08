package vn.vtt.demo.domain;

import javax.persistence.*;

@Entity
@Table(name = "ADM_USER", schema = "JHIPSTER", catalog = "")
public class AdmUser {
    private long id;
    private String username;
    private String password;
    private String role;
    private String email;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "USERNAME", nullable = false, length = 50)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = false, length = 200)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "ROLE", nullable = false, length = 20)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdmUser admUser = (AdmUser) o;

        if (id != admUser.id) return false;
        if (username != null ? !username.equals(admUser.username) : admUser.username != null) return false;
        if (password != null ? !password.equals(admUser.password) : admUser.password != null) return false;
        if (role != null ? !role.equals(admUser.role) : admUser.role != null) return false;
        if (email != null ? !email.equals(admUser.email) : admUser.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
