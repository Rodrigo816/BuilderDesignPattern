package org.academiadecodigo.bootcamp.org;

public class Main {
    public static void main(String[] args) {

        //User user = new User("Maria","Pimpolha", "Rua dos Canos","P.V",33,"password123","abc@abc.com",295662333,"25RA4TACF");

        User user1 = new User.UserBuilder()
                .firstName("Maria")
                .lastName("Pimpolha")
                .address("Rua dos Canos")
                .city("P.V")
                .age(33)
                .password("password123")
                .email("abc@abc.com")
                .phone(295662333)
                .idCard("25RA4TACF")
                .build();



        User user2 = new User.UserBuilder()
                .address("PV")
                .lastName("Borba")
                .firstName("Rodrigo")
                .build();

        User user3 = new User.UserBuilder()
                .idCard("8994ARRTTB")
                .build(); // Throw a Exception


        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
