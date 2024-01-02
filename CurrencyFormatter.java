import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        scanner.close();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String formattedUS = usFormat.format(amount);

        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String formattedIndia = indiaFormat.format(amount);

        Locale chinaLocale = Locale.CHINA;
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(chinaLocale);
        String formattedChina = chinaFormat.format(amount);
       
        Locale franceLocale = Locale.FRANCE;
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(franceLocale);
        String formattedFrance = franceFormat.format(amount);
    
        System.out.println("US: " + formattedUS);
        System.out.println("India: " + formattedIndia);
        System.out.println("China: " + formattedChina);
        System.out.println("France: " + formattedFrance);
    }
}
