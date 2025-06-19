package com.example.fastapi.dto;

public class UserProfileDTO {
    private String username;
    private String firstName;
    private String lastName;
    private String roleName;
    private String permissionName;

//        public UserProfileDTO() {}

    public UserProfileDTO(String username, String firstName, String lastName, String roleName, String permissionName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roleName = roleName;
        this.permissionName = permissionName;
    }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getRoleName() { return roleName; }
    public void setRoleName(String roleName) { this.roleName = roleName; }

    public String getPermissionName() { return permissionName; }
    public void setPermissionName(String permissionName) { this.permissionName = permissionName; }
}