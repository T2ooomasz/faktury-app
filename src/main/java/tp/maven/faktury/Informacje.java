package tp.maven.faktury;

import java.util.EnumSet;
import java.util.Scanner;

/**
 * Class containgnig basics information about invoice (faktura).
 *
 * @author Tomasz Kazulak
 *
 */
public class Informacje {

  private TypDokumentu dokument;
  private String numer;
  private TypJezyka jezyk;
  private String miejsceWystawienia;
  private Data dataWystawienia;
  private Data dataSprzedazy;
  
  /**
   * 'Interactive' constructor to class Informacje.
   * It allows the administrator to fill all fields.
   */
  public Informacje() {
    System.out.println("Wybor typu dokumentu: ");
    @SuppressWarnings("resource")
    Scanner in = new Scanner(System.in);
    EnumSet.allOf(TypDokumentu.class)
        .forEach(dok -> System.out.print(dok + ", "));
    dokument = TypDokumentu.valueOf(in.nextLine().toUpperCase());
    System.out.println("Numer faktury: ");
    numer = in.nextLine();
    System.out.println("Wybor jezyka: ");
    EnumSet.allOf(TypJezyka.class)
        .forEach(jez -> System.out.print(jez + ", "));
    System.out.println();
    jezyk = TypJezyka.valueOf(in.nextLine().toUpperCase());
    System.out.println("Miejsce wystawienia: ");
    miejsceWystawienia = in.nextLine();
    System.out.println("Data wystawienia: ");
    dataWystawienia = new Data();
    System.out.println("Data sprzedazy: ");
    dataSprzedazy = new Data();
  }
  
  /** Enum type of the document. */
  enum TypDokumentu {
    FAKTURA, FAKTURA_VAT, FAKTURA_DO_PARAGONU
  }
  
  /** Enum type of the language. */
  enum TypJezyka {
    POLSKI, ANGIELSKI, NIEMIECKI
  }
  
  /** Printing all information from this class. */
  public void printInformacje() {
    System.out.println("INFORMACJE: ");
    System.out.print("Typ dokumentu: " + dokument + "\tNumer: " + numer 
        + "\tJezyk: " + jezyk + "\tMiejsce Wystawienia: " + miejsceWystawienia 
        + "\tData Wystawienia: ");
    dataWystawienia.printData(); 
    System.out.print("\tData Sprzedazy: ");
    dataSprzedazy.printData();
    System.out.println();
  }
}
