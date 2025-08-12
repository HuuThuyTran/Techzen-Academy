package chieu.exception;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(int age) {
        super("Tuổi " + age + " không hợp lệ! Tuổi phải từ 18 đến 100.");
    }
}
