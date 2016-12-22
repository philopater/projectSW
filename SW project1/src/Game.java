import java.util.Scanner;
import java.util.Vector;

public class Game {
	
	public void CreateGame (String GameName , String TeacherName , String GameDescription)
	
	{
		Vector <String> Game = new Vector (); 
		Vector <String> ModelAns = new Vector(); 
		String Questions;
		String Answers;
		String ModelAnswer;
		int GameCategory;
		int QuestionNumber;
		
	    System.out.println( " Please choose your new game Category : ");
	    System.out.println( " For True and False category press number 1 " );
	    System.out.println( " For Multiple Choice category press number 2 " );
  
	    Scanner in =new Scanner(System.in);
		GameCategory = in.nextInt();
	       
	         
		System.out.println(" The game Name is : " + GameName );
	        
		if (GameCategory == 1)
	        {
	            System.out.println(" Please enter the numbers of questions :D ");
	            QuestionNumber = in.nextInt();
	            
	            
	            for(int i= 0 ; i< QuestionNumber ; i++){
	            	
	                System.out.println(" Please enter the question :D ");
	                Questions = in.nextLine();
	                Game.add(Questions);
	      
	            System.out.println(" Please enter the correct answer for this question : ");
	                ModelAnswer = in.nextLine();
	                ModelAns.add(ModelAnswer);
	             
	            } 
	            
	            System.out.println(" Congratulatios the game is created successfully :D ");

	        }
	        
		 else if (GameCategory == 2 )
	        
		 {
	        	 System.out.println(" Please enter the numbers of questions :D ");
	             QuestionNumber = in.nextInt();
	           
	             
	             for(int i= 0 ; i< QuestionNumber ; i++)
	             
	             {   
	            	 System.out.println(" Please enter the question :D ");
		                Questions = in.nextLine();
		                Game.add(Questions);
	                    
		                in.nextLine();
	                 
		                for(int j=0 ; j<4 ; j++){
	                 
		                	System.out.print(" Please enter the choices :D ");
	                 
		                	Answers=in.nextLine();
	                 
		                	Game.add(Answers);
	                 }
	             
	             System.out.println(" Please enter the correct answer for this question : ");
	            
	                ModelAnswer = in.nextLine();
	                ModelAns.add(ModelAnswer);
	                 
	              
	             }
	             
	             System.out.println(" Congratulatios the game is created successfully :D ");


	}

	}
	
	 public void FirstGame (){
        int Answer;
        int Score = 0 ;
        
        System.out.println(" Welcome to First game in MCQ :D ");
        
        System.out.println(" 1)  How many angles in triangle ? = (6 ,3 ,5 ,4 )  ");
         
        Scanner in =new Scanner(System.in);
         
        System.out.println(" Please enter your answer :D ");
		Answer = in.nextInt();
                    
		        if(Answer == 3 )
                    {    
			            Score++;
                        System.out.println(" It is the correct answer bravo 3lek kaml b2a :D " ); 
                        System.out.println(" Your score is "+ Score );
 	
                    }
                    
		          else {
                        System.out.println(" It is wrong answer 7awel mara tania :( ");
                        System.out.println(" Your score is "+ Score );

                        return;

                    }
        
		        System.out.println(" 2) How many planets in the solar system ? = (6 ,7 ,9 ,8 )  ");
		        
		        System.out.println(" Please enter your answer :D ");
				Answer = in.nextInt();
		                    
				        if(Answer == 9 )
		                    {    
					            Score++;
		                        System.out.println(" It is the correct answer bravo 3lek kaml b2a :D " ); 
		                        System.out.println(" Your score is "+ Score );
		 	
		                    }
		                    
				          else {
		                        System.out.println(" It is wrong answer 7awel mara tania :( ");
		                        System.out.println(" Your score is "+ Score );

		                        return;
		                        }
        
				        System.out.println(" 3) What is the result of 2*8_1 ? = (16 ,15 ,14 ,13 )  ");
				        
				        System.out.println(" Please enter your answer :D ");
						Answer = in.nextInt();
				                    
						        if(Answer == 15 )
				                    {    
							            Score++;
				                        System.out.println(" It is the correct answer bravo 3lek kaml b2a :D " ); 
				                        System.out.println(" Your score is "+ Score );
				 	
				                    }
				                    
						          else {
				                        System.out.println(" It is wrong answer 7awel mara tania :( ");
				                        System.out.println(" Your score is "+ Score );

				                        return;
				                        }
						        
						  System.out.println(" 4) How many electrons in halogens outershell ? = (6 ,7 ,9 ,8 )  ");
						        
						  System.out.println(" Please enter your answer :D ");
					      Answer = in.nextInt();
						                    
								if(Answer == 7 )
						                    {    
									            Score++;
						                        System.out.println(" It is the correct answer bravo 3lek kaml b2a :D " ); 
						                        System.out.println(" Your score is "+ Score );
						 	
						                    }
						                    
								          else {
						                        System.out.println(" It is wrong answer 7awel mara tania :( ");
						                        System.out.println(" Your score is "+ Score );

						                        return;
								          }
	 }
    
	 public void SecondGame (){
	        int Answer;
	        int Score = 0 ;
	        
	        System.out.println(" Welcome to Second game in MCQ :D ");
	        
	        System.out.println(" 1)  How many sides in triangle ? = (6 ,3 ,5 ,4 )  ");
	         
	        Scanner in =new Scanner(System.in);
	         
	        System.out.println(" Please enter your answer :D ");
			Answer = in.nextInt();
	                    
			        if(Answer == 3 )
	                    {    
				            Score++;
	                        System.out.println(" It is the correct answer bravo 3lek kaml b2a :D " ); 
	                        System.out.println(" Your score is "+ Score );
	 	
	                    }
	                    
			          else {
	                        System.out.println(" It is wrong answer 7awel mara tania :( ");
	                        System.out.println(" Your score is "+ Score );

	                        return;

	                    }
	        
			        System.out.println(" 2) How many noble gases in the periodic table ? = (6 ,7 ,9 ,8 )  ");
			        
			        System.out.println(" Please enter your answer :D ");
					Answer = in.nextInt();
			                    
					        if(Answer == 7 )
			                    {    
						            Score++;
			                        System.out.println(" It is the correct answer bravo 3lek kaml b2a :D " ); 
			                        System.out.println(" Your score is "+ Score );
			 	
			                    }
			                    
					          else {
			                        System.out.println(" It is wrong answer 7awel mara tania :( ");
			                        System.out.println(" Your score is "+ Score );

			                        return;
			                        }
	        
					        System.out.println(" 3) What is the result of 10-7 ? = (3 ,4 ,5 ,6 )  ");
					        
					        System.out.println(" Please enter your answer :D ");
							Answer = in.nextInt();
					                    
							        if(Answer == 3 )
					                    {    
								            Score++;
					                        System.out.println(" It is the correct answer bravo 3lek kaml b2a :D " ); 
					                        System.out.println(" Your score is "+ Score );
					 	
					                    }
					                    
							          else {
					                        System.out.println(" It is wrong answer 7awel mara tania :( ");
					                        System.out.println(" Your score is "+ Score );

					                        return;
					                        }
							        
							  System.out.println(" 4) How many lungs does the human body have ? = (2 ,1 ,3 ,4 )  ");
							        
							  System.out.println(" Please enter your answer :D ");
						      Answer = in.nextInt();
							                    
									if(Answer == 2 )
							                    {    
										            Score++;
							                        System.out.println(" It is the correct answer bravo 3lek kaml b2a :D " ); 
							                        System.out.println(" Your score is "+ Score );
							 	
							                    }
							                    
									          else {
							                        System.out.println(" It is wrong answer 7awel mara tania :( ");
							                        System.out.println(" Your score is "+ Score );

							                        return;
									          }
		 }
    
    
    public void ThirdGame (  ){
        
        String Answer;
        int Score =0 ;
    	
    	Scanner in=new Scanner(System.in); 
    	
    	System.out.println(" Welcome to Third game in T&F :D ");
        
    	System.out.println(" 1)  The angles in triangle = 3 ?  ");
               
    	System.out.println(" Please enter your answer :D "); 
                 Answer = in.nextLine();
                    
                  if(Answer.equals("T") )
                    {
                        Score++;
                        System.out.println(" It is the correct answer bravo 3lek kaml b2a :D " );
                        System.out.println(" Your score is "+ Score );
                    }
                    else if (Answer.equals("F") ){
                    	System.out.println(" It is wrong answer 7awel mara tania :( ");
                        System.out.println(" Your score is "+ Score );
                        
                        return;

                    }
                  
                  System.out.println(" 2) The planets in the solar system are 8 ? ");
                  
              	System.out.println(" Please enter your answer :D "); 
                           Answer = in.nextLine();
                              
                            if(Answer.equals("F") )
                              {
                                  Score++;
                                  System.out.println(" It is the correct answer bravo 3lek kaml b2a :D " );
                                  System.out.println(" Your score is "+ Score );
                              }
                              else if (Answer.equals("T") ){
                              	System.out.println(" It is wrong answer 7awel mara tania :( ");
                                  System.out.println(" Your score is "+ Score );
                                  
                                  return;

                              }
        
                            System.out.println(" 3) The result of 2*8_1 is 16 ? ");
                            
                          	System.out.println(" Please enter your answer :D "); 
                                       Answer = in.nextLine();
                                          
                                        if(Answer.equals("F") )
                                          {
                                              Score++;
                                              System.out.println(" It is the correct answer bravo 3lek kaml b2a :D " );
                                              System.out.println(" Your score is "+ Score );
                                          }
                                          else if (Answer.equals("T") ){
                                          	System.out.println(" It is wrong answer 7awel mara tania :( ");
                                              System.out.println(" Your score is "+ Score );
                                              
                                              return;
}
    
                                        System.out.println(" 4) The electrons in halogens outershell are 7 ? ");
                                        
                                      	System.out.println(" Please enter your answer :D "); 
                                                   Answer = in.nextLine();
                                                      
                                                    if(Answer.equals("T") )
                                                      {
                                                          Score++;
                                                          System.out.println(" It is the correct answer bravo 3lek kaml b2a :D " );
                                                          System.out.println(" Your score is "+ Score );
                                                      }
                                                      else if (Answer.equals("F") ){
                                                      	System.out.println(" It is wrong answer 7awel mara tania :( ");
                                                          System.out.println(" Your score is "+ Score );
                                                          
                                                          return;

                                                      }   
    }
    
public void FourthGame (  ){
        
        String Answer;
        int Score =0 ;
    	
    	Scanner in=new Scanner(System.in); 
    	
    	System.out.println(" Welcome to Forth game in T&F :D ");
        
    	System.out.println(" 1)  Sides in the triangle is 3 ? ");
               
    	System.out.println(" Please enter your answer :D "); 
                 Answer = in.nextLine();
                    
                  if(Answer.equals("T") )
                    {
                        Score++;
                        System.out.println(" It is the correct answer bravo 3lek kaml b2a :D " );
                        System.out.println(" Your score is "+ Score );
                    }
                    else if (Answer.equals("F") ){
                    	System.out.println(" It is wrong answer 7awel mara tania :( ");
                        System.out.println(" Your score is "+ Score );
                        
                        return;

                    }
                  
                  System.out.println(" 2) Noble gases in the periodic table are 6 ? ");
                  
              	System.out.println(" Please enter your answer :D "); 
                           Answer = in.nextLine();
                              
                            if(Answer.equals("F") )
                              {
                                  Score++;
                                  System.out.println(" It is the correct answer bravo 3lek kaml b2a :D " );
                                  System.out.println(" Your score is "+ Score );
                              }
                              else if (Answer.equals("T") ){
                              	System.out.println(" It is wrong answer 7awel mara tania :( ");
                                  System.out.println(" Your score is "+ Score );
                                  
                                  return;

                              }
        
                            System.out.println(" 3) The result of 10-7 is 5 ? ");
                            
                          	System.out.println(" Please enter your answer :D "); 
                                       Answer = in.nextLine();
                                          
                                        if(Answer.equals("F") )
                                          {
                                              Score++;
                                              System.out.println(" It is the correct answer bravo 3lek kaml b2a :D " );
                                              System.out.println(" Your score is "+ Score );
                                          }
                                          else if (Answer.equals("T") ){
                                          	System.out.println(" It is wrong answer 7awel mara tania :( ");
                                              System.out.println(" Your score is "+ Score );
                                              
                                              return;
}
    
                                        System.out.println(" 4) Lungs does the human body have are 2 ? ");
                                        
                                      	System.out.println(" Please enter your answer :D "); 
                                                   Answer = in.nextLine();
                                                      
                                                    if(Answer.equals("T") )
                                                      {
                                                          Score++;
                                                          System.out.println(" It is the correct answer bravo 3lek kaml b2a :D " );
                                                          System.out.println(" Your score is "+ Score );
                                                      }
                                                      else if (Answer.equals("F") ){
                                                      	System.out.println(" It is wrong answer 7awel mara tania :( ");
                                                          System.out.println(" Your score is "+ Score );
                                                          
                                                          return;

                                                      }   
    }   
	
   public void playGame(  ){
	   
	      System.out.println(" Welcome to Playing Game :D ");
	      System.out.println(" Please choose Game category : ");
		  System.out.println(" For MCQ press number 1 : ");
		  System.out.println(" For T&F press number 2 : ");
	     
	   
	      int GameCategory;
	      Scanner in =new Scanner(System.in);
		  GameCategory = in.nextInt();
		
		  if (GameCategory == 1){
			  System.out.println(" Please choose the Game :D  ");
			  System.out.println(" For First game press number 1 :  ");
			  System.out.println(" For Second game press number 2 :  ");

          int Game;
          Game = in.nextInt();
          if(Game == 1)
              FirstGame();
            else if (Game == 2)
              SecondGame();
            else 
                System.out.println(" Sorry , Your choice is not available :( ");
            
}
		  else if   (GameCategory == 2){
			  
			  System.out.println(" Please choose the Game :D  ");
			  System.out.println(" For First game press number 1 :  ");
			  System.out.println(" For Second game press number 2 :  ");

			  int Game;
	          Game = in.nextInt();
	          if(Game == 1)
	              ThirdGame();
	            else if (Game == 2)
	              FourthGame();
	            else 
	                System.out.println(" Sorry , Your choice is not available :( ");
	            
		  }
   }
}