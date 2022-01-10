package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String directorName;
    private String directorSurname;
    private String nameSchool;

    public Principal(String directorName, String directorSurname, String nameSchool) {
        this.directorName = directorName;
        this.directorSurname = directorSurname;
        this.nameSchool = nameSchool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Principal)) return false;
        Principal principal = (Principal) o;
        return directorName.equals(principal.directorName) && directorSurname.equals(principal.directorSurname) && nameSchool.equals(principal.nameSchool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directorName, directorSurname, nameSchool);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "directorName='" + directorName + '\'' +
                ", directorSurname='" + directorSurname + '\'' +
                ", nameSchool='" + nameSchool + '\'' +
                '}';
    }

    public String getDirectorName() {
        return directorName;
    }

    public String getDirectorSurname() {
        return directorSurname;
    }

    public String getNameSchool() {
        return nameSchool;
    }
}
