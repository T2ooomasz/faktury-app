package tp.maven.faktury;

import java.util.EnumSet;
import java.util.Scanner;

/**
 * Class containing all necessary information about one position (item) in invoice (faktura).
 *
 * @author Tomasz Kazulak.
 *
 */

public class Rzecz {
  private String nazwa;
  private String gtu;
  private TypJednostkiMiary jednostkaMiary;
  private double ilosc;
  private double cenaNetto;
  private double wartoscNetto;
  private double stawkaVat;
  private double kwotaVat;
  private double wartoscBrutto;
  private TypWaluty waluta;
  
  /**
   * 'Interactive' constructor to class Rzecz.
   * It allows the administrator to fill all fields.
   */
  public Rzecz() {
    System.out.println();
    @SuppressWarnings("resource")
    Scanner in = new Scanner(System.in);
    System.out.println();
    nazwa = in.nextLine();
    System.out.println();
    gtu = in.nextLine();
    EnumSet.allOf(TypJednostkiMiary.class)
        .forEach(miara -> System.out.print(miara + ", "));
    System.out.println();
    jednostkaMiary = TypJednostkiMiary.valueOf(in.nextLine().toUpperCase());
    System.out.println();
    ilosc = in.nextDouble();
    System.out.println();
    cenaNetto = in.nextDouble();
    wartoscNetto = calculateWartoscNetto();
    System.out.println();
    stawkaVat = in.nextDouble();
    kwotaVat = calculateKwotaVat();
    wartoscBrutto = calculateWartoscBrutto();
    EnumSet.allOf(TypWaluty.class)
        .forEach(wal -> System.out.print(wal + ", "));
    System.out.println();
    waluta = TypWaluty.valueOf(in.nextLine().toUpperCase());
  }
  
  /** Method calculate the amount of VAT tax for one item. */
  private double calculateKwotaVat() {
    return wartoscNetto * stawkaVat / 100;
  }
  
  /**
   * Method calculate sum of Netto value. One item is a multiplication of
   *  ilosc (number) and cenaNeto (netto price for one pice).
   */
  private double calculateWartoscNetto() {
    return ilosc * cenaNetto;
  }
  
  /** Method calculate the Brutto value. Add Netto and tax VAT. */
  private double calculateWartoscBrutto() {
    return wartoscNetto + kwotaVat;
  }

  /** Method to get private field of Netto value. */
  public double getWartoscNetto() {
    return wartoscNetto;
  }
  
  /** Method to get private field of Brutto value. */
  public double getWartoscBrutto() {
    return wartoscBrutto;
  }
  
  /** Enum type of the jednostki miary. eg. SI like kg, m. */
  enum TypJednostkiMiary {
    SZT, USL, DOBA, DZIEN, GODZINA, KWH, KG, L, M, M2, M3
  }
  
  /** Enum type of the currency. Polisch zloty, Dolar, Euro etc. */
  enum TypWaluty {
    PLN, USD, EUR, GBP, CHF, CAD, AUD
  }
  
  /** Throw all field to terminal. */
  public void printRzecz() {
    System.out.println("Nazwa: " + nazwa + "\tGTU: " + gtu + "\tJm: " + jednostkaMiary
        + "\tIlosc: " + ilosc + "\tCena Netto: " + cenaNetto + "\tWartosc Netto: "
        + wartoscNetto + "\tStawka VAT: " + stawkaVat + "\tKwota VAT: " + kwotaVat
        + "\tWartosc Brutto: " + wartoscBrutto + "\tWaluta: " + waluta);
  }
}
