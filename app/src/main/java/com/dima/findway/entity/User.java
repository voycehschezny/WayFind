
package com.dima.findway.entity;


import android.widget.EditText;

public class User {
    private EditText email;
    private EditText username;
    private EditText password;
    private EditText repeatPassword;
    private EditText usernameLogin;
    private EditText passwordLogin;


    public EditText getEmail() {
        return email;
    }

    public void setEmail(EditText email) {
        this.email = email;
    }

    public EditText getUsername() {
        return username;
    }

    public void setUsername(EditText username) {
        this.username = username;
    }

    public EditText getPassword() {
        return password;
    }

    public void setPassword(EditText password) {
        this.password = password;
    }

    public EditText getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(EditText repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    public EditText getUsernameLogin() {
        return usernameLogin;
    }

    public void setUsernameLogin(EditText usernameLogin) {
        this.usernameLogin = usernameLogin;
    }

    public EditText getPasswordLogin() {
        return passwordLogin;
    }

    public void setPasswordLogin(EditText passwordLogin) {
        this.passwordLogin = passwordLogin;
    }

    @Override
    public String toString() {
        return "User{" +
                "email=" + email +
                ", username=" + username +
                ", password=" + password +
                ", repeatPassword=" + repeatPassword +
                ", usernameLogin=" + usernameLogin +
                ", passwordLogin=" + passwordLogin +
                '}';
    }
}
