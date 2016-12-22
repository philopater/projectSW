import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Teacher {

	private String UserName          = null;
	private String UserGender        = null;
	private String UserMaritalStatus = null;
	private int    UserAge           = -1 ;
	private String UserEmail         = null;
	private String UserPassword      = null;

	public Teacher (String UserName , String UserGender , String UserMaritalStatus , int UserAge , String UserEmail , String UserPassword ){
	
		this.UserName                = UserName;
		this.UserGender              = UserGender;
		this.UserMaritalStatus       = UserMaritalStatus;
		this.UserAge                 = UserAge;
		this.UserEmail               = UserEmail;
		this.UserPassword            = UserPassword;
		
		}
	

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public String getUserName (){
		return UserName;
	}
	public String getUserGender(){
		return UserGender;
		}
	public String getUserMaritalStatus (){
		return UserMaritalStatus;
	}
	public int getUserAge(){
		return UserAge;
	}
	public String getUserEmail(){
		return UserEmail;
	}
	public String getUserPassword(){
		return UserPassword;
	}
	public void setUserName (String user_name){
		this.UserName = user_name;
	}
	public void setUserGender (String user_gender){
	    this.UserGender = user_gender;
	}
	public void setUserMaritalStatus (String user_marital_status){
		this.UserMaritalStatus = user_marital_status;
	}
	public void setUserAge (int user_age){
		this.UserAge = user_age;
	}
	public void setUserEmail (String user_email){
		this.UserEmail = user_email;
	}
	public void setUserPassword (String user_password){
		this.UserPassword = user_password;
	}
	
	public Boolean CheckEmptyFields(){

    	if(UserName.equals(null)||UserGender.equals(null)||UserMaritalStatus.equals(null)||UserAge==-1||UserEmail.equals(null)||UserPassword.equals(null)){
			
    		return false;
    	}
    	
    	else{
    		
    		return true;
    	}

    }
	
	public Boolean Registeration_Validation()throws IOException{

        BufferedReader bufferReader;
        
        try {
            
        	bufferReader = new BufferedReader (new FileReader("E:\\SW project\\SW project1\\src\\SigningData.txt"));
             
        	String string;
                
        	string = bufferReader.readLine();
            
        	while (string!=null) {
                
        		if (string.equals(this.getUserEmail())) {

                    return false;
                }

                string = bufferReader.readLine();
            }
           
        	bufferReader.close();
        } 
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    public boolean SignValidation () throws IOException {


    	BufferedReader bufferReader;
        
    	try {
            
    		bufferReader = new BufferedReader(new FileReader("E:\\SW project\\SW project1\\src\\TeacherEmailsFile.txt"));
             
    		String UserEmail ;
            String UserPassword;
                
    		UserEmail =bufferReader.readLine();

            while (UserEmail!=null) {
                
            	UserPassword=bufferReader.readLine();
                
            	if (UserEmail.equals(this.getUserEmail()) && UserPassword.equals(this.getUserPassword())) {

                    return true;
                }

                UserEmail=bufferReader.readLine();
            }
            
            bufferReader.close();
        } 
    	
    	catch (FileNotFoundException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false ;

    }

}

	
	
	
	
	

	
	



	
	
	
	
	
	
	

	
	


