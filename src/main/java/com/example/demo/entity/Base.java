package com.example.demo.entity;

public class Base {

    private String name;

    private String age;

    private Gender gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    enum Gender {
        MR("先生"),MS("女士");
        private String gender;
        Gender (String gender) {
            this.gender = gender;
        }
    }

}
