package com.example.restapi2;

public interface DiskManager {
    // Returns the person identified by the input parameter phone number
    Person getPerson(int phoneNum);

    // Returns the phone number of the person added
    int addPerson(Person person);
}
