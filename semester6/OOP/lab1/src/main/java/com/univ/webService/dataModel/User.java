package com.univ.webService.dataModel;

public class User {
    private int id;
    private String name;
    private String surname;
    private String login;
    private String password;
    private boolean admin;

    public User() {
    }

    public User(int idAbonent, String name, String surname, String login, String password, Boolean isAdmin) {
        this.id = idAbonent;
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.admin = isAdmin;
    }

    public User(int id, String name, String surname, String login, String password, boolean isAdmin)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.admin = isAdmin;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean getIsAdmin() {
        return admin;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setIdAbonent(int idAbonent) {
        this.id = idAbonent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.admin = isAdmin;
    }
}
