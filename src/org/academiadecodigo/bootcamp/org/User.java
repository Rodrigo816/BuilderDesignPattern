package org.academiadecodigo.bootcamp.org;

public class User {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private int age;
    private String password;
    private String email;
    private int phone;
    private String idCard;

    private User(String firstName, String lastName, String address, String city, int age, String password, String email, int phone, String idCard) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.age = age;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.idCard = idCard;
    }

    //Inner Class
    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private int age;
        private String password;
        private String email;
        private int phone;
        private String idCard;

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder address(String adress) {
            this.address = adress;
            return this;
        }

        public UserBuilder city(String city) {
            this.city = city;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder phone(int phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder idCard(String idCard) {
            this.idCard = idCard;
            return this;
        }

        public User build (){
            if (firstName==null){
                throw new IllegalStateException("Missing First Name");
            }
            if (lastName==null){
                throw new IllegalStateException("Missing Last Name");
            }
            return new User(firstName,lastName, address,city,age,password,email,phone,idCard);
        }
    }
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}
