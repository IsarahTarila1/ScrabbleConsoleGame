package Utils;

import Utils.MessageUtil;

import java.util.Scanner;

public class ScrabbleLogicUtil {
    //Create an object to access the properties from MessageUtil
    MessageUtil messageUtil = new MessageUtil();
    public void scrabble(){
        //Call a Scanner class to take inout from user
        Scanner takeInput=new Scanner(System.in);
        //Ask user's name
        messageUtil.messageToUser("Please input name: ");
        String nameOfUser = takeInput.nextLine();
        //Ask user's email
        messageUtil.messageToUser("Please input email: ");
        String eMail = takeInput.nextLine();
        messageUtil.messageToUser("Click 1 to continue, else click 2 to exit");
        int userChoice = takeInput.nextInt();
        if (userChoice==1){
            logic();
        } else if (userChoice==2) {
            messageUtil.messageToUser("Thank you, come again");
        }else {
            scrabble();
        }
        //close scanner
        takeInput.close();
    }
    public void logic(){
        //Call a Scanner class to take input from user
        Scanner takeUserAnswer=new Scanner(System.in);
        messageUtil.messageToUser("Rearrange this word (rshfe)");
        String userAnswer = takeUserAnswer.nextLine();
        //Write  a condition for the user to rearrange
        if (userAnswer.equalsIgnoreCase("fresh")){
           messageUtil.messageToUser("Correct");
        }else{
            messageUtil.messageToUser("Try again");
            logic();
        }
        messageUtil.messageToUser("Rearrange this word (ltiar)");
        String takeTheAnswer = takeUserAnswer.nextLine();
        if (takeTheAnswer.equalsIgnoreCase("Tarila")){
            messageUtil.messageToUser("Correct");

        }else{
            messageUtil.messageToUser("try again");
            logic();
        }
        //close scanner
        takeUserAnswer.close();
    }
}
