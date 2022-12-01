import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String pass = scanner.nextLine();
        System.out.println(pass);
        int n = pass.length();
        if (n < 8){
            System.out.println("Пароль ненадежен. Повторите ввод");
        }
        else {
            Pattern pattern = Pattern.compile("([[0-9]|[a-zA-Z]|\\_]+)");
            Matcher matcher = pattern.matcher(pass);
            if (matcher.find()) {
                Pattern pattern0 = Pattern.compile("([A-Z]+)");
                Matcher matcher0 = pattern0.matcher(pass);
                if (matcher0.find()) {
                    Pattern pattern1 = Pattern.compile("([a-z]+)");
                    Matcher matcher1 = pattern1.matcher(pass);
                    if (matcher1.find()) {
                        Pattern pattern2 = Pattern.compile("(\\d+)");
                        Matcher matcher2 = pattern2.matcher(pass);
                        if (matcher2.find()) {
                            System.out.println("Пароль надежен");
                        }
                        else {
                            System.out.println("Пароль ненадежен. Повторите ввод");
                        }
                    }
                    else {
                        System.out.println("Пароль ненадежен. Повторите ввод");
                    }
                }
                else {
                    System.out.println("Пароль ненадежен. Повторите ввод");
                }
            }
            else {
                System.out.println("Пароль ненадежен. Повторите ввод");
            }
        }
    }
}