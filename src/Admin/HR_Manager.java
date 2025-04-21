/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

/**
 *
 * @author Radil_Sanjuna
 */
public class HR_Manager {
        // Private variables (encapsulation)
    private String managerName;
    private String username;
    private String password;

    // Constructor to initialize the HR assistant object
    public HR_Manager(String managerName, String username, String password) {
        this.managerName = managerName;
        this.username = username;
        this.password = password;
    }

    // Getter and Setter for assistantName
    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    // Getter and Setter for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and Setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


