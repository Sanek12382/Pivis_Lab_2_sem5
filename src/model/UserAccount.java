package model;

public class UserAccount {

    public UserAccount(String loginUser, String passwordUser, String telephoneNumberUser, UserRole roleUser) {
        this.loginUser = loginUser;
        this.passwordUser = passwordUser;
        this.telephoneNumberUser = telephoneNumberUser;
        this.roleUser = roleUser;
    }

    public String loginUser;
    public String passwordUser;
    public String telephoneNumberUser;
    public UserRole roleUser;

    public UserAccount() {

    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public String getTelephoneNumberUser() {
        return telephoneNumberUser;
    }

    public void setTelephoneNumberUser(String telephoneNumberUser) {
        this.telephoneNumberUser = telephoneNumberUser;
    }

    public UserRole getRoleUser() {
        return roleUser;
    }

    public void setRoleUser(UserRole roleUser) {
        this.roleUser = roleUser;
    }
}
