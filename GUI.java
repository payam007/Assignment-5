import java.util.Scanner;
public class GUI {
	public static void main(String[] args){

	String username, password;

	Scanner keyboard = new Scanner(System.in);

	System.out.println("Enter your Username: ");

	username = keyboard.nextLine();		

	System.out.println("Enter your Password: ");	

	password = keyboard.nextLine();
	
import javax.swing.JOptionPane;



        public static void main(String[]args){

                String user = "Payamk";
                String pass = "78945";
                String entered_user = "";
                String entered_pass = "";

                while(entered_user.equals(user) == false || entered_pass.equals(
pass) == false){

                        entered_user = JOptionPane.showInputDialog("Enter userna
me");
                        entered_pass = JOptionPane.showInputDialog("Enter passwo
rd");

                        String[] choices = {"Admin", "Student", "Staff"};
                        String input = (String) JOptionPane.showInputDialog(null
, "Choose account type ","Account Type", JOptionPane.QUESTION_MESSAGE, null,choi
ces,choices[1]);

			System.out.println(input);

	if(username.equals(username))
		System.out.println("Welcome " + username);
	else 
		System.out.println("Wrong User name or Password!");

	if(password.equals(password))

			System.out.println("Welcome " + username);
	else 
		System.out.println("Wrong User name or Password!");
		}