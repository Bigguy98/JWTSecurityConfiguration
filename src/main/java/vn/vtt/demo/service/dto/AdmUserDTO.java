package vn.vtt.demo.service.dto;

import vn.vtt.demo.domain.AdmUser;

public class AdmUserDTO {
    private Long id;
    private String username;
    private String role;

    public AdmUserDTO(AdmUser admUser) {
        this.id = admUser.getId();
        this.username = admUser.getUsername();
        this.role = admUser.getRole();
    }

    public AdmUserDTO() {
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
