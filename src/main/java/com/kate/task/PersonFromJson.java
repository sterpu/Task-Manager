package com.kate.task;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PersonFromJson {
    private final String name;
    private final String email;
    private int age;
    private boolean isWoman;


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setIsWoman(boolean isWoman) {
        this.isWoman = isWoman;
    }

    public boolean isWoman() {
        return isWoman;
    }
}
