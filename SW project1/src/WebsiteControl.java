import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class WebsiteControl {
	
	public int RegistrationChecking (String UserStatus , String UserName , String UserGender , String UserMaritalStatus , int UserAge , String UserEmail , String UserPassword) throws IOException
	
	{
		if(UserStatus.equals("Student")){

			Student student = new Student(UserName,UserGender,UserMaritalStatus,UserAge ,UserEmail,UserPassword);
			
			Boolean DataCheck;
			
			DataCheck = student.CheckEmptyFields();
			
			if(DataCheck){
				
				Boolean DataValid;
				
				DataValid= student.Registeration_Validation();
				
				if(DataValid){

					System.out.println(" You register successfully :D ");
					
					return 1;
				}
				
				else {
					
					System.out.println(" Registeration is Failed unfortunately :( ");
					
					return 2;
				}
			}
			
			else {
				
				System.out.println(" Please enter information again ");
				
				return 3;
			}
			
	}
		

		else if (UserStatus.equals("Teacher") ) {
			
			 Teacher teacher =new Teacher (UserName,UserGender,UserMaritalStatus,UserAge ,UserEmail,UserPassword);
				
			 Boolean DataCheck;
				
				DataCheck = teacher.CheckEmptyFields();
				
				if(DataCheck){
					
					Boolean DataValid;
					
					DataValid = teacher.Registeration_Validation();
					
					if(DataValid){
						
						System.out.println(" You register successfully :D ");
						
						return 4;
					}
					
					else {
						
						System.out.println(" Registeration is Failed unfortunately :( ");
						
						return 5;
					}
				}
				
				else {
					
					System.out.println(" Please enter information again ");
					
					return 6;
				}
				
		}	
				return 0 ;
			
	}
		
	public void LoadStudentData(String UserName , String UserGender , String UserMaritalStatus , int UserAge , String UserEmail , String UserPassword){
		
		Student student = new Student(UserName,UserGender,UserMaritalStatus,UserAge ,UserEmail,UserPassword);
	    student.setUserName(UserName);
		student.setUserGender(UserGender);
		student.setUserMaritalStatus(UserMaritalStatus);
		student.setUserAge(UserAge);
		student.setUserEmail(UserEmail);
		student.setUserPassword(UserPassword);

		try{
			
		 File StudentSavedDataFile =new File("E:\\SW project\\SW project1\\src\\StudentSavedDataFile.txt");
         
		 if(!StudentSavedDataFile.exists()){
        	 
			 StudentSavedDataFile.createNewFile();
          }
         
         FileWriter fileWriter = new FileWriter(StudentSavedDataFile,true);
         BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
         
         bufferWriter.write(student.getUserName());
         bufferWriter.newLine();
         bufferWriter.write(student.getUserGender());
         bufferWriter.newLine();
         bufferWriter.write(student.getUserMaritalStatus());
         bufferWriter.newLine();
         bufferWriter.write(""+student.getUserAge());
         bufferWriter.newLine();
         bufferWriter.write(student.getUserEmail());
         bufferWriter.newLine();
         bufferWriter.write(student.getUserPassword());
         bufferWriter.newLine();
         bufferWriter.close();
		
		}
    
		catch(IOException ioe)
    {
        System.err.println("IOException: " + ioe.getMessage());
    }
	
		try{
			 File StudentSavedDataFile =new File("E:\\SW project\\SW project1\\src\\SigningData.txt");
             if(!StudentSavedDataFile.exists()){
            	 StudentSavedDataFile.createNewFile();
              }
             FileWriter fileWriter = new FileWriter(StudentSavedDataFile,true);
             BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
             
             bufferWriter.write(student.getUserEmail());
             bufferWriter.newLine();
             bufferWriter.write(student.getUserPassword());
             bufferWriter.newLine();
            
             bufferWriter.close();
			}
        
		catch(IOException ioe)
        
		{
            System.err.println("IOException: " + ioe.getMessage());
        }
		
	}
	
	public void LoadStudentEmails(String UserEmail){
		
		try{
		 
			File StudentEmailsFile =new File ("E:\\SW project\\SW project1\\src\\StudentEmailsFile.txt");
         
			if(!StudentEmailsFile.exists()){
             
				StudentEmailsFile.createNewFile();
          }
         
		 FileWriter fileWriter = new FileWriter(StudentEmailsFile,true);
         BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
         bufferWriter.write(UserEmail);
         System.out.println(UserEmail+" UserEmail");
         bufferWriter.newLine();
         bufferWriter.close();
		}
    
		catch(IOException ioe)
    {
        System.err.println("IOException: " + ioe.getMessage());
    }
	}
	
public void LoadTeachertData(String UserName , String UserGender , String UserMaritalStatus , int UserAge , String UserEmail , String UserPassword){
		
		Teacher teacher = new Teacher(UserName,UserGender,UserMaritalStatus,UserAge ,UserEmail,UserPassword);
		teacher.setUserName(UserName);
		teacher.setUserGender(UserGender);
		teacher.setUserMaritalStatus(UserMaritalStatus);
		teacher.setUserAge(UserAge);
		teacher.setUserEmail(UserEmail);
		teacher.setUserPassword(UserPassword);

		try{
			
		 File TeacherSavedDataFile =new File("E:\\SW project\\SW project1\\src\\TeacherSavedDataFile.txt");
         
		 if(!TeacherSavedDataFile.exists()){
        	 
			 TeacherSavedDataFile.createNewFile();
          }
         
         FileWriter fileWriter = new FileWriter(TeacherSavedDataFile,true);
         BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
         
         bufferWriter.write(teacher.getUserName());
         bufferWriter.newLine();
         bufferWriter.write(teacher.getUserGender());
         bufferWriter.newLine();
         bufferWriter.write(teacher.getUserMaritalStatus());
         bufferWriter.newLine();
         bufferWriter.write(""+teacher.getUserAge());
         bufferWriter.newLine();
         bufferWriter.write(teacher.getUserEmail());
         bufferWriter.newLine();
         bufferWriter.write(teacher.getUserPassword());
         bufferWriter.newLine();
         bufferWriter.close();
		
		}
    
		catch(IOException ioe)
    {
        System.err.println("IOException: " + ioe.getMessage());
    }
	
		try{
			 File TeacherSavedDataFile =new File("E:\\SW project\\SW project1\\src\\SigningData.txt");
             if(!TeacherSavedDataFile.exists()){
            	 TeacherSavedDataFile.createNewFile();
              }
             FileWriter fileWriter = new FileWriter(TeacherSavedDataFile,true);
             BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
             
             bufferWriter.write(teacher.getUserEmail());
             bufferWriter.newLine();
             bufferWriter.write(teacher.getUserPassword());
             bufferWriter.newLine();
            
             bufferWriter.close();
			}
        
		catch(IOException ioe)
        
		{
            System.err.println("IOException: " + ioe.getMessage());
        }
		
	}
	
	
	public void LoadTeacherEmails(String UserEmail){
		 
		try{
		 
			 File TeacherEmailsFile =new File("E:\\SW project\\SW project1\\src\\TeacherEmailsFile.txt");
         
			 if(!TeacherEmailsFile.exists()){
				 TeacherEmailsFile.createNewFile();
          }
			 
         FileWriter fileWriter = new FileWriter(TeacherEmailsFile,true);
         BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
         
         bufferWriter.write(UserEmail);
         System.out.println(UserEmail+" UserEmail");
         bufferWriter.newLine();
         
         bufferWriter.close();
		}
    
		 catch(IOException ioe)
    {
        System.err.println("IOException: " + ioe.getMessage());
    }
	}
	
	
	public boolean Sign_in_validation (String UserStatus , String UserEmail , String UserPassword ) throws IOException {
    	
		Student student = new Student();
    	Teacher teacher = new Teacher();
    	
    	Boolean check = false;
	  
    	if(UserStatus.equals("Student")){
    		
    		student.setUserEmail(UserEmail);
    		student.setUserPassword(UserPassword);
    		
    		check=student.SignValidation();
    	}
    	
	  if(UserStatus.equals("Teacher")){
    		
		    teacher.setUserEmail(UserEmail);
    		teacher.setUserPassword(UserPassword);
    		
    		check = teacher.SignValidation();
    	}
	  
	  return check;

    }
  
  public void StartingGameRequest () {
	  
	  Game game = new Game () ;
	  game.playGame() ;
  }
  
  public void AddingGameRequest () {
	  String GameName ;
	  String TeacherName ; 
	  String GameDescription ;
	  
	  Scanner in = new Scanner(System.in);
	  
	  System.out.println(" Welcome to creating game :D ") ;
	  System.out.println(" Please enter new game name : ") ;

	  GameName = in.nextLine() ;
	  
	  System.out.println(" Please enter new game teacher : ") ;
	  TeacherName = in.nextLine() ;
	  
	  System.out.println(" Please enter new game description : ") ;
	  GameDescription = in.nextLine() ;
	  
	  Game game = new Game () ;
	  
	  game.CreateGame(GameName, TeacherName, GameDescription) ;

  }
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	
}
	
	

	
	


	