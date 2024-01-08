package entity;

import java.io.Reader;
import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private String login;
    private String password;
    private Reader reader;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin (String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader (Reader reader) {
        this.reader = reader;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.login);
        hash = 23 * hash + Objects.hashCode(this.password);
        hash = 23 * hash + Objects.hashCode(this.reader);
        return hash;
    }
}