import com.bz.Exceptions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class UserRegistration
{
    private static Scanner scan = new Scanner(System.in);

    public static void main(String arg[])
    {
        ValidationDuringUserEntry validationUserEntry = new ValidationDuringUserEntry();





        try {
            System.out.println("Enetr your gamil");
            String gamil = scan.next();
            validationUserEntry.emailValidation(gamil);
        }
        catch (InvalidEmailException e)
        {
            System.out.println(e);
            System.out.println("Enetr your gamil");
            String gamil = scan.next();
            validationUserEntry.emailValidation(gamil);
        }
        try {
            System.out.println("Enetr your First name");
            String firstName = scan.next();
            validationUserEntry.firstNameValidation(firstName);
        }
        catch (InvalidFirstNameException e)
        {
            System.out.println(e);
            System.out.println("Enetr your First name");
            String firstName = scan.next();
            validationUserEntry.firstNameValidation(firstName);
        }
        try {
            System.out.println("Enetr your last name");
            String lastName = scan.next();
            validationUserEntry.lastNameValidation(lastName);
        }
        catch (InvalidLastNameException e)
        {
            System.out.println(e);
            System.out.println("Enetr your last name");
            String lastName = scan.next();
            validationUserEntry.lastNameValidation(lastName);
        }
        try {
            System.out.println("Enetr your Phone number");
            String phoneNo = scan.next();
            validationUserEntry.phoneValidation(phoneNo);
        }
        catch (InvalidMobileNoException e)
        {
            System.out.println(e);
            System.out.println("Enetr your Phone number");
            String phoneNo = scan.next();
            validationUserEntry.phoneValidation(phoneNo);
        }
        try {
            System.out.println("Enetr your password");
            String password = scan.next();
            validationUserEntry.passwordValidation(password);
        }
        catch (InvalidPasswordException e)
        {
            System.out.println(e);
            System.out.println("Enetr your password");
            String password = scan.next();
            validationUserEntry.passwordValidation(password);
        }









    }
}
class ValidationDuringUserEntry
{

    public void firstNameValidation(String firstName)throws InvalidFirstNameException
    {
        if(Pattern.matches("^[A-Z]{1}[a-z]{2}$" , firstName) == true)
        {
            System.out.println("Valid First Name");
        }
        else
        {
            throw new InvalidFirstNameException("Invalid First Name");
//            System.out.println();
        }
    }
    public void lastNameValidation(String lastName)throws InvalidLastNameException
    {
        if(Pattern.matches("^[A-Z]{1}[a-z]{2}$" , lastName) == true)
        {
//            throw new InvalidLastNameException("Valid Last Name");
            System.out.println("Valid Last Name");
        }
        else
        {

            throw new InvalidLastNameException("Invalid Last Name");
//            System.out.println("Invalid Last Name");
        }
    }
    //abc.xyz@bl.co.in   ///abc@bl.co
    public void emailValidation(String email)throws InvalidEmailException
    {
        if(Pattern.matches("^[a-z]+([+-.])?(.[a-z]+)?(.[0-9]+)?@([0-9]+.)?([a-z]+.)?([a-z]+.)?([a-z]+.)?$" , email) == true)
        {
            System.out.println("Valid email");
        }
        else
        {
            throw new InvalidEmailException("Invalid EmailId");
//            System.out.println("Invalid email");
        }
    }
    public void phoneValidation(String phone)throws InvalidMobileNoException
    {
        if(Pattern.matches("^(91\\s)?[0-9]{10}" ,phone) == true)
        {
            System.out.println("Valid phone number");
        }
        else
        {
            throw new InvalidMobileNoException("Invalid phone number");
//            System.out.println("Invalid phone number");
        }
    }

    public void passwordValidation(String password)throws InvalidMobileNoException
    {
        if(Pattern.matches("^[A-Z][a-zA-Z]{7,}[0-9]{1,}[!@#$%^&*]{1}" ,password) == true)
        {
            System.out.println("Valid Password number");
        }
        else
        {
            throw new InvalidMobileNoException("Invalid Password number");
//            System.out.println("Invalid Password number");
        }
    }

}
