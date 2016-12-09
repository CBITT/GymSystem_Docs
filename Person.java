package OOAD;

/**
 * Created by Peter Mikulasko
 */
public class Person {
    private String name;
    private String surname;
    private int age;
    private Gender gender;

    public Person(){}

    public Person(String name, String surname, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
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

//    public void setAge(int age) {
//        if (age <= 0 || age > 150)
//            throw new IllegalArgumentException("Age is not valid");
//        this.age = age;
//    }

    public void setAge(int age) {
        if (age <= 0 || age > 150) {
            throw new IllegalArgumentException("Age is not valid");
        } else if(age <= 16 ){
            throw new IllegalArgumentException("You are too young to register");
        } else if(age >= 75) {
            throw new IllegalArgumentException("You are too old to register");
        } else {
            this.age = age;
        }
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  getName() + ", "
                +"\n" + getSurname() + ", "
                +"\n" + getAge() + ", "
                +"\n" + getGender();
    }
}
