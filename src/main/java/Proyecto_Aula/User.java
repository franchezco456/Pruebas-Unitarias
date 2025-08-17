package Proyecto_Aula;

public class User {

    private String user_name;
    private String name;
    private String last_name;
    private Integer id;
    private String email;
    private String password;


    public User(String user_name, String name, String last_name, Integer id, String email, String password) {
        this.user_name = user_name;
        this.name = name;
        this.last_name = last_name;
        this.id = id;
        this.email = email;
        this.password = password;
    }

    // --- Getters y Setters ---
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}