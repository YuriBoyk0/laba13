import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Locale locale =Locale.of("en", "US");
        Locale localeru =Locale.of("ru", "RU");
        readPorerties(locale);
        System.out.println("------------------------------------------------");
        readPorerties(localeru);

        System.out.println("------------------------------------------------");
        Employee[] employee = new Employee[4];
        for (int i =0; i<employee.length; i++)
        {
            employee[i] = new Employee();
            employee[i].name= FullReport.generateName();
            employee[i].salary=FullReport.generateReport();
        }
        Locale local = new Locale("en", "US");
        FullReport.Print(employee, local);
    }
    public static void readPorerties(Locale locale)
    {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("themjava", locale);
        Set<String> a = resourceBundle.keySet();
        int i=0;
        for (var g : a)
        {
            i++;
            System.out.println("Theme "+i+" "+resourceBundle.getString(g));
        }
    }
}
