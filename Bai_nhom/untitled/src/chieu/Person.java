package chieu;

import chieu.exception.InvalidAgeException;
import chieu.exception.InvalidEmailException;
import chieu.exception.NullOrEmptyException;

import java.util.Scanner;

public abstract class Person {
    private String id;
    private String fullName;
    private int age;
    private String email;

    public Person() {
    }

    public Person(String id, String fullName, int age, String email) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        // Nhập tên
        while (true) {
            try {
                System.out.print("Nhập tên: ");
                this.fullName = sc.nextLine().trim();

                if (this.fullName.isEmpty()) {
                    throw new NullOrEmptyException("Tên không được bỏ trống!");
                }

                if (!this.fullName.matches("[a-zA-ZÀ-Ỹà-ỹ\\s]+")) {
                    System.out.println("Tên không hợp lệ! Không chứa số hoặc ký tự đặc biệt.\n");
                    continue;
                }
                break;

            } catch (NullOrEmptyException e) {
                System.out.println(e.getMessage());
            }
        }

        // Nhập tuổi
        while (true) {
            try {
                System.out.print("Nhập tuổi: ");
                String input = sc.nextLine().trim();

                if (input.isEmpty()) {
                    throw new NullOrEmptyException("Tuổi không được bỏ trống!");
                }
                try {
                    this.age = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Tuổi phải là nhập số!");
                }

                validateAge(this.age);
                break;

            } catch (NullOrEmptyException | InvalidAgeException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        // Nhập email
        while (true) {
            try {
                System.out.print("Nhập email: ");
                this.email = sc.nextLine().trim();

                if (this.email.isEmpty()) {
                    throw new NullOrEmptyException("Email không được bỏ trống!");
                }
                validateEmail(this.email);
                break;

            } catch (NullOrEmptyException | InvalidEmailException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Validate tuổi
    private void validateAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 100) {
            throw new InvalidAgeException(age);
        }
    }

    // Validate email
    private void validateEmail(String email) throws InvalidEmailException {
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
            throw new InvalidEmailException("Email '" + email + "' không đúng định dạng! (vd: ten@gmail.com)");
        }
    }

    // Getter / Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "ID: " + id + "\n"
                + "Họ tên: " + fullName + "\n"
                + "Tuổi: " + age + "\n"
                + "Email: " + email + "\n";
    }
}
