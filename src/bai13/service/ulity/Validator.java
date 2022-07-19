package bai13.service.ulity;

import bai13.service.exception.BirthdayException;
import bai13.service.exception.EmailException;
import bai13.service.exception.FullNameException;
import bai13.service.exception.PhoneException;

import java.time.LocalDate;

public class Validator {
    public static void nameCheck(String fullName) throws FullNameException {
        String[] str = fullName.split(" ");
        if (str.length < 2) {
            throw new FullNameException("Please enter your real name");
        }
    }
    public static void birthdayCheck(LocalDate dateOfBirth) throws BirthdayException {
    }

    public static void phoneCheck(String phone) throws PhoneException {
        if (phone.length() != 10 && phone.length() != 12) {
            throw new PhoneException("Phone number are from 10 to 12 numbers");
        }
    }

    public static void emailCheck(String email) throws EmailException {
        if (!email.contains("@gmail.com")) {
            throw  new EmailException("Please re-enter your email");
        }
    }
}
