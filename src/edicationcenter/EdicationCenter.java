package edicationcenter;

import java.time.LocalDate;

public abstract class EdicationCenter {
    private String name;
    private String locatedCountry;
    private LocalDate foundationYear;

    public EdicationCenter(LocalDate foundationYear, String locatedCountry, String name) {
        this.foundationYear = foundationYear;
        this.locatedCountry = locatedCountry;
        this.name = name;
    }

    public LocalDate getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(LocalDate foundationYear) {
        this.foundationYear = foundationYear;
    }

    public String getLocatedCountry() {
        return locatedCountry;
    }

    public void setLocatedCountry(String locatedCountry) {
        this.locatedCountry = locatedCountry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EdicationCenter{" +
                "foundationYear=" + foundationYear +
                ", name='" + name + '\'' +
                ", locatedCountry='" + locatedCountry + '\'' +
                '}';
    }
}
