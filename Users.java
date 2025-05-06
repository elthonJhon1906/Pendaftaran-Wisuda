 


/**
 * Write a description of class User here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Users{
    
    private static int idCounter = 1;
    private int id;
    private String username;
    private String password;
    private Role Role;
    
    public Users(String username, String password, Role Role){
        this.id = idCounter++;
        this.username = username;
        this.password = password;
        this.Role = Role;
    }
    
    
    
}
