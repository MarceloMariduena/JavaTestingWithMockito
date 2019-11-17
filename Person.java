package com.example.restapi2;

public class Person {

    private int phoneNumber;
    private String firstName;
    private String lastName;
    private CacheManager cache;
    private DiskManager disk;

    public Person(CacheManager cache, DiskManager disk) {
        this.cache = cache;
        this.disk = disk;
    }

    public void setPerson(int phoneNumber, String firstName, String lastName) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean equals(Person p) {
        if (this.phoneNumber == p.phoneNumber
                && this.firstName.equals(p.firstName)
                && this.lastName.equals(p.lastName) ) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        Person foundPerson = cache.getPerson(phoneNumber);
        if (foundPerson == null) {
            foundPerson = disk.getPerson(phoneNumber);
        }
        if (foundPerson == null) {
            return "";
        }
        return foundPerson.firstName + " " + foundPerson.lastName;
    }
}
