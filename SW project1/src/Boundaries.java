import java.io.IOException;
import java.util.Scanner;


public class Boundaries {

	public void Start_boundary() throws IOException{
	
		System.out.println(" Welcome to the website :D ");
		System.out.println(" Enjoy playing games and learning new skills :D ");
		System.out.println(" Enter as : ");
		System.out.println(" 1) Teacher ") ;
		System.out.println(" Please press number 1 ") ;
		System.out.println(" 2) Student ") ;
		System.out.println(" Please press number 2 ") ;
		int U = 0 ;
		Scanner in =new Scanner(System.in);
		U=in.nextInt();
	
		UserWantToR_S(U);
	 }

	public void Start_boundary() throws IOException{

		System.out.println(" Welcome to the website :D ");
		System.out.println(" Enjoy playing games and learning new skills :D ");
		System.out.println(" Enter as : ");
		System.out.println(" 1) Teacher ") ;
    	System.out.println(" Please press number 1 ") ;
    	System.out.println(" 2) Student ") ;
    	System.out.println(" Please press number 2 ") ;
		int U = 0 ;
		Scanner in =new Scanner(System.in);
		U=in.nextInt();

		UserWantToR_S(U);
	 }

	public void UserWantToR_S(int UserStatus) throws IOException{
		System.out.println(" Want to : ");
    	System.out.println(" 1) Register ") ;
    	System.out.println(" Please press number 1 ") ;
    	System.out.println(" 2) Sign in ") ;
    	System.out.println(" Please press number 2 ") ;
        int C = 0 ;
		Scanner in=new Scanner(System.in);
		C=in.nextInt();

		if(C==2){
			SigningBoundary(UserStatus);

		}

		else if(C==1){
			RegisterationBoundary(UserStatus);
		}

}

	public void RegisterationBoundary(int UserStatus) throws IOException{
		Scanner in = new Scanner(System.in);
		Boolean F = true;

		while(F){

			String UserName;
			String UserGender;
			String UserMaritalStatus;
			int UserAge;
			String UserEmail;
			String UserPassword;


			System.out.println(" Welcome to Registeration :D : ");

			System.out.println(" Please enter user name : ");
			UserName = in.nextLine();

			System.out.println(" Please enter user gender : ");
			UserGender = in.nextLine();

			System.out.println(" Please enter user marital status : ");
			UserMaritalStatus = in.nextLine();

			System.out.println(" Please enter user age : ");
			UserAge=in.nextInt();
			in.nextLine();

			System.out.println(" Please enter user Email : ");
			UserEmail = in.nextLine();

			System.out.println(" Please enter user Password : ");
			UserPassword = in.nextLine();


			 // ab2a a3ml check 3leha

			WebsiteControl Control = new WebsiteControl();
		    int check;

		if (UserStatus == 1){

			check = Control.RegistrationChecking("Student", UserName, UserGender, UserMaritalStatus, UserAge, UserEmail, UserPassword);
			if(check == 1){

				Control.LoadStudentEmails(UserEmail);
				Control.LoadStudentData(UserName, UserGender, UserMaritalStatus, UserAge, UserEmail, UserPassword);
				F = false;

			}
			else if(check == 2 || check == 3){
				F = true;
			}
		}
		else if(UserStatus == 2){

			check = Control.RegistrationChecking("Teacher", UserName, UserGender, UserMaritalStatus, UserAge, UserEmail, UserPassword);
			if(check == 5){
				Control.LoadTeacherEmails(UserEmail);
				Control.LoadTeachertData(UserName, UserGender, UserMaritalStatus, UserAge, UserEmail, UserPassword);
				F = false;

			}
			else if(check ==2 || check ==3){
				F = true;
			}
		}


			}
		}
	
	public void SigningBoundary(int UserStatus) throws IOException{
		
		Scanner in=new Scanner(System.in);
		String UserEmail;
		String UserPassword;
		
		Boolean F = false;
		WebsiteControl Control = new WebsiteControl();
		
		while(!F){
			
			System.out.println(" Welcome to Registeration :D : ");
			System.out.println(" Enter UserEmail : ");
			UserEmail=in.nextLine();	
			System.out.println(" Enter UserPassword : ");
			UserPassword=in.nextLine();
			
			if(UserStatus==1){
				
				F = Control.Sign_in_validation("Student", UserEmail, UserPassword);
				
				if(F){
					
					System.out.println(" You signed in successfully :D");
					System.out.println(" If you want to play game ") ;
					System.out.println(" Please press 1 ") ;

					Scanner s=new Scanner(System.in);
					
					int C = s.nextInt() ;
					
					if (C == 1) {
					
						PlayingGameBoundary ();					}
					else 
						return ;
				}
				else
					System.out.println(" Signing in is Faild unfortunatly :( ");

			}
			if(UserStatus==2){
				
				F = Control.Sign_in_validation("Teacher", UserEmail, UserPassword);
				if(F){
					
					System.out.println(" You signed in successfully :D");
					System.out.println(" If you want to create game ") ;
					System.out.println(" Please press 1 ") ;

					Scanner inn = new Scanner(System.in);
					
					int C = inn.nextInt() ;
					if (C == 1) {
						
						CreatingGameBoundary ();						
					}
					else 
						return ;

				}
				else
					System.out.println(" Signing in is Faild unfortunatly :( ");
			}
			
			
	}
	}
	

public void PlayingGameBoundary () {

		WebsiteControl Control = new WebsiteControl () ;
		Control.StartingGameRequest() ;
	}

	public void CreatingGameBoundary () {
		WebsiteControl Control = new WebsiteControl () ;
		Control.AddingGameRequest() ;

	}



	}




