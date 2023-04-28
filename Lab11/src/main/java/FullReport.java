import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class FullReport
{
    public static double generateReport()
    {
        double sal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter salary: ");
        sal = scanner.nextDouble();
        return sal;
    }
    public static String generateName()
    {
        Scanner scanner = new Scanner(System.in);
        String nam;
        System.out.println("Enter name: ");
        nam = scanner.nextLine();
        return nam;
    }
    public static void Print(Employee[] employees, Locale locale)
    {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("title", locale);
        NumberFormat format = NumberFormat.getInstance(locale);

        for (Employee employee1 : employees)
        {
            System.out.println(resourceBundle.getString("surname")+" :" + employee1.name+", "+resourceBundle.getString("salary")+" : "+format.format(employee1.salary));
        }
    }
}
