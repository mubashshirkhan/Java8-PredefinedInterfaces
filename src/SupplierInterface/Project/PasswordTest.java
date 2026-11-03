package SupplierInterface.Project;

public class PasswordTest {

    public static void main(String[] args) {

        PasswordGenerator pg = new PasswordGenerator();

        System.out.println(pg.generatePassword());
        System.out.println(pg.generatePassword());
        System.out.println(pg.generatePassword());
        System.out.println(pg.generatePassword());
        System.out.println(pg.generatePassword());
    }
}