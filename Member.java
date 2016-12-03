/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymsystem;

/**
 *
 * @author Peter Mikulasko
 */
public class Member {
    private String name;
    private String surname;
    private int age;

    
    public Member(){    
    }
    
    public Member(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0 || age > 150)
            throw new IllegalArgumentException("Age is not valid"); 
        this.age = age;
    }

    @Override
    public String toString() {        
        return "Member Details:" +"\n" + getName() + ", "
                +"\n" + getSurname() + ", "
                +"\n" + getAge() + ", ";
    }
    
    
}
