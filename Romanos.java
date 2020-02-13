import java.util.*;

public class Romanos

{

  public static void main(String[] args)

  {

      Scanner scanner = new Scanner(System.in);

      Map<Character, Integer> romanos = new HashMap<>();

      romanos.put('I', 1);

      romanos.put('V', 5);

      romanos.put('X', 10);

      romanos.put('L', 50);

      romanos.put('C', 100);

      romanos.put('D', 500);

      romanos.put('M', 1000);

 

      String numRomano = "";

      int arabico = 0;

 

      System.out.print("Introduzca un número romano: ");

      numRomano = scanner.next();

      numRomano = numRomano.toUpperCase();

 

      arabico = romanos.get(numRomano.charAt(numRomano.length()-1));

 

      for(int x=numRomano.length()-2; x>=0; x--)

      {

        if(romanos.get(numRomano.charAt(x)) < romanos.get(numRomano.charAt(x+1)))

          arabico -= romanos.get(numRomano.charAt(x));

        else

          arabico += romanos.get(numRomano.charAt(x));

      }

 

      System.out.println(arabico);

     

 

  }

}