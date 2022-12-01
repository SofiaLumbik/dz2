import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите начальную дату: ");
        String vvodDannyx = scanner.nextLine();
        System.out.println(vvodDannyx);
        Pattern pattern = Pattern.compile("\\d{2}\\/\\d{2}\\/\\d{4}");
        Matcher matcher = pattern.matcher(vvodDannyx);
        if (matcher.find()) {
            Pattern pattern0 = Pattern.compile("(0[1-9]|1\\d|2\\d|3[0-1])\\/(01|0[3-9]|1[0-2])\\/(19\\d{2}|[2-9]\\d{3})|(0[1-9]|1\\d|2\\d)\\/(02)\\/(19\\d{2}|[2-9]\\d{3})");
            Matcher matcher0 = pattern0.matcher(vvodDannyx);
            if (matcher0.find()) {
                System.out.println("Введенное выражение является датой");
            }
            else {
                System.out.println("Введенное выражение не является датой");
            }
        }
        else {
            System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
        }
    }
}