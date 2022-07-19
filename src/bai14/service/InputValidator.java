package bai14.service;

import bai14.service.exception.InvalidDOBException;
import bai14.service.exception.InvalidFullNameException;
import bai14.service.exception.InvalidInputException;
import bai14.service.exception.InvalidPhoneNumberException;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;

public class InputValidator {
    public static void nameCheck(String fullName) {
        if (fullName.length() < 10 || fullName.length() > 50 ) {
            throw new InvalidFullNameException("Invalid Full Name ");
        }
    }

    public static void phoneNumber(String phoneNumber) {
        String [] pn = {"090", "098", "091", "031", "035", "038"};
        if (!(phoneNumber.length() == 10 && Arrays.asList(pn).contains(phoneNumber.substring(0,3)))) {
            throw new InvalidPhoneNumberException("Invalid phone number");
        }
    }

    public static LocalDate dobCheck(String birthday) {
        LocalDate dob = null;
        try {
            dob = DateConverter.stringToDate(birthday);
        } catch (DateTimeParseException e) {
            throw new InvalidDOBException("Invalid birthday format");
        }
        return dob;
    }

    public static void numberOfRecruimentCheck(int n) {
        if (n < 11 || n > 15){
            throw new InvalidInputException("Invalid input");
        }
    }
}
