import java.util.Scanner;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System. in );
        Pattern regex = Pattern.compile("#[0-9A-F]{6}");
        System. out.println( " Введите строку :" );
        String a;
        a = sc1.nextLine();
        Matcher b=regex.matcher(a);
        if (b.matches()==true)
            System. out.println( " Введенная строка - идентификатор цвета" );
        else
            System. out.println("Строка не является идентификатором цвета");
    }
}