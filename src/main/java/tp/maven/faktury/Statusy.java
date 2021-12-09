package tp.maven.faktury;

import java.util.EnumSet;
import java.util.Scanner;


/**
 * Class of statusy. Contain information about status of transaction.
 *
 * @author Tomasz Kazulak
 *
 */
public class Statusy {
  private TypStatusu status;
  private double zaplacono;
  private Data dataPlatnosci;
  private String opisPlatnosci;
  private TypSposoboPlatnosci sposobPlatnosci;
  private Data terminPlatnosci;
  private int[] numerKonta = new int[26];
  private String uwagi;
  
  /**
   * 'Interactive' constructor to class Statusy.
   * It allows the administrator to fill all fields.
   */
  public Statusy() {
    System.out.print("Status: ");
    @SuppressWarnings("resource")
    Scanner in = new Scanner(System.in);
    EnumSet.allOf(TypStatusu.class)
        .forEach(stat -> System.out.print(stat + ", "));
    System.out.println();
    status = TypStatusu.valueOf(in.nextLine().toUpperCase());
    System.out.println("Ile zostalo zaplacone: ");
    zaplacono = in.nextDouble();
    System.out.println("Data platnosci: ");
    dataPlatnosci = new Data();
    System.out.println("Opis platnosci: ");
    @SuppressWarnings("unused")
    String bufor1 = in.nextLine();
    opisPlatnosci = in.nextLine();
    EnumSet.allOf(TypSposoboPlatnosci.class)
        .forEach(spl -> System.out.print(spl + ", "));
    System.out.println("Sposob platnosci: ");
    sposobPlatnosci = TypSposoboPlatnosci.valueOf(in.nextLine().toUpperCase());
    System.out.println("Termin platnosci: ");
    terminPlatnosci = new Data();
    System.out.print("Numer konta: ");
    for (int i = 0; i < 26; i++) {
      char a = in.next().charAt(0);
      numerKonta[i] = Integer.parseInt(String.valueOf(a));
    }
    System.out.print("uwagi: ");
    @SuppressWarnings("unused")
    String bufor2 = in.nextLine();
    uwagi = in.nextLine();
  }
  
  /** Transaction status. */
  enum TypStatusu {
    NIEZAPLACONA, CZESCIOWO_ZAPLACONA, ZAPLACONA
  }
  
  /** How will or was take the transaction. */
  enum TypSposoboPlatnosci {
    PRZELEW, GOTOWKA, KARTA_PLATNICZA, CZEK, WEKSEL, KREDYT
  }
  
  /** Throw all information about status to terminal. */
  public void printStatusy() {
    System.out.println("STATUS PLATNOSCI");
    System.out.print("Status: " + status + "\tZaplacono: " + zaplacono + "\tData platnosci: ");
    dataPlatnosci.printData();
    System.out.print("\tOpis platnosci: " + opisPlatnosci + "\tSposob platnosci: "
        + sposobPlatnosci + "\tTermin platnosci: ");
    terminPlatnosci.printData();
    System.out.print("\tNumer konta: ");
    for (int i = 0; i < 26; i++) {
      System.out.print(numerKonta[i]);
      if ((i >= 2) && (((i - 2) % 4) == 0)) {
        System.out.print(" ");
      }
    }
    System.out.print("\tUwagi: " + uwagi);
    System.out.println("");
  }
}
