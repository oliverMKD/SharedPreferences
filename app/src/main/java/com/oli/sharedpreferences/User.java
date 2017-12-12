package com.oli.sharedpreferences;

/**
 * Created by oliver on 12/12/2017.
 */

public class User {

    String name;
    String Lastname;
    String age;
    boolean isMale;

    public User(String name, String lastname, String age, boolean isMale) {
        this.name = name;
        Lastname = lastname;
        this.age = age;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}
