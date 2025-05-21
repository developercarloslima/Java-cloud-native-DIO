package edu.kaka.poo.herançapolimorfismo;

public non-sealed class Manager extends Employer{

    private String login;

    private String password;

    private double commision;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCommision() {
        return commision;
    }

    public void setCommision(double commision) {
        this.commision = commision;
    }
}
