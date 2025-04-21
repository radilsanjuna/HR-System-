
package Admin;

public class HR_Assistant {
    // Private variables (encapsulation)
    private String assistantName;
    private String username;
    private String password;

    // Constructor to initialize the HR assistant object
    public HR_Assistant(String assistantName, String username, String password) {
        this.assistantName = assistantName;
        this.username = username;
        this.password = password;
    }

    // Getter and Setter for assistantName
    public String getAssistantName() {
        return assistantName;
    }

    public void setAssistantName(String assistantName) {
        this.assistantName = assistantName;
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
