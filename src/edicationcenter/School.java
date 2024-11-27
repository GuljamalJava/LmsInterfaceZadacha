package edicationcenter;

import java.time.LocalDate;

public class School extends EdicationCenter{
    public School(LocalDate foundationYear, String locatedCountry, String name) {
        super(foundationYear, locatedCountry, name);
    }
}
