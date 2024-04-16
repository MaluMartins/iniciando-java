// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class ConversaoTemperatura {

  public static double celsiusToFahrenheit(double celsius) {
    double fahrenheit = 1.8*celsius + 32;
    return fahrenheit;
  }

  public static double fahrenheitToCelsius(double fahrenheit) {
    double celsius = (fahrenheit - 32)/1.8;
    return celsius;
  }

  public static double celsiusToKelvin(double celsius) {
    double kelvin = celsius + 273;
    return kelvin;
  }

  public static double kelvinTocelsius(double kelvin) {
    double celsius = kelvin - 273;
    return celsius;
  }

  public static double kelvinToFahrenheit(double kelvin) {
    double fahrenheit = 1.8*(kelvin - 273) + 32;
    return fahrenheit;
  }

  public static double fahrenheitToKelvin(double fahrenheit) {
    double kelvin = (fahrenheit - 32)/1.8 + 273;
    return kelvin;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Qual escala deseja converter? (Celsius, Fahrenheit ou Kelvin): ");
    String escala1 = sc.nextLine();
    System.out.print("Para qual escala deseja converter? (Celsius, Fahrenheit ou Kelvin): ");
    String escala2 = sc.nextLine();

    //celsius para fahrenheit
    if (escala1.equals("Celsius") && escala2.equals("Fahrenheit")) {
      System.out.print("Digite a temperatura em Celsius: ");
      double celsius = sc.nextDouble();
      double fahrenheit = celsiusToFahrenheit(celsius);
      System.out.println(celsius + " graus Celsius equivalem a " + fahrenheit + " graus Fahrenheit.");
    } 
    //celsius para kelvin 
    else if (escala1.equals("Celsius") && escala2.equals("Kelvin")) {
      System.out.print("Digite a temperatura em Celsius: ");
      double celsius = sc.nextDouble();
      double kelvin = celsiusToKelvin(celsius);
      System.out.println(celsius + " graus Celsius equivalem a " + kelvin + " graus Kelvin.");
    }  
    //fahrenheit para celsius
    else if (escala1.equals("Fahrenheit") && escala2.equals("Celsius")) {
      System.out.print("Digite a temperatura em Fahrenheit: ");
      double fahrenheit = sc.nextDouble();
      double celsius = fahrenheitToCelsius(fahrenheit);
      System.out.println(fahrenheit + " graus Fahrenheit equivalem a " + celsius + " graus Celsius");
    } 
    //fahrenheit para kelvin
    else if (escala1.equals("Fahrenheit") && escala2.equals("Kelvin")) {
      System.out.print("Digite a temperatura em Fahrenheit: ");
      double fahrenheit = sc.nextDouble();
      double kelvin = fahrenheitToKelvin(fahrenheit);
      System.out.println(fahrenheit + " graus Fahrenheit equivalem a " + kelvin + "graus Kelvin");
    }
    //kelvin para celsius
    else if (escala1.equals("Kelvin") && escala2.equals("Celsius")) {
      System.out.print("Digite a temperatura em Kelvin: ");
      double kelvin = sc.nextDouble();
      double celsius = kelvinTocelsius(kelvin);
      System.out.println(kelvin + " graus Kelvin equivalem a " + celsius + " graus Celsius");
    }
    //kelvin para fahrenheit
    else if (escala1.equals("Kelvin") && escala2.equals("Fahrenheit")) {
      System.out.print("Digite a temperatura em Kelvin: ");
      double kelvin = sc.nextDouble();
      double fahrenheit = kelvinToFahrenheit(kelvin);
      System.out.println(kelvin + " graus Kelvin equivalem a " + fahrenheit + " graus Fahrenheit");
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}