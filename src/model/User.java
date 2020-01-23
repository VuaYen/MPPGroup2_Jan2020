package model;

public class User {
	private String accountName;
    private String password;
    private Role userRole;
    private String firstName;
	private String lastName;
	private String mobileNo;
	private String email;

    public void setEmail(String email){
        this.accountName = email;
    }

    public String getAccountName(){
        return accountName;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public void setRole(Role role){
        this.userRole = role;
    }

    public Role userRole(){
        return userRole;
    }

    public User(String firstName,String lastName,String mobileNo,String email,String accountName, String password,Role role){
        
    	this.firstName = firstName;
       this.lastName=lastName;
        this.mobileNo=mobileNo;
        this.email= email;
        this.password = password;
        this.accountName = accountName;
        this.userRole = role;
    }
}