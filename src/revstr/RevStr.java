package revstr;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author akm
 */
public class RevStr {

    public static String revStr(String sourceStr) {
        return new StringBuilder(sourceStr).reverse().toString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String source;
        
        if (args.length == 0) {
            System.out.println("Не указан обязательный аргумент - строка для разворота");
            System.out.print("Введите строку: ");
            Scanner scan=new Scanner(System.in);
            source = scan.next();
        }
        else {
            source = args[0];
        }

        System.out.printf("Исходная: %s\n", source);
        System.out.printf("Обратная: %s\n", RevStr.revStr(source));

        int count = 1000;
        for (int j = 0; j < 3; j++) {

            Long ts = (new Date()).getTime();

            for (int i = 0; i < count; i++) {
                RevStr.revStr(source);
            }

            System.out.printf("%d: %d ms\n", count, (new Date()).getTime() - ts);
            System.gc();
            
            count *=10;
        }
    }
}