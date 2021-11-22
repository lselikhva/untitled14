package com.company;

import javax.lang.model.SourceVersion;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String secondName = "Ivanov ";
        String fullName = firstName + " " + middleName + " " + secondName;

        System.out.println("fullName сотрудника = " + fullName);

        if (fullName != null ) {
            System.out.println("NameFull = " + fullName.toUpperCase(Locale.ROOT));
        }
    }
}
