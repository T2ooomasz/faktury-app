package tp.maven.faktury;

import java.util.Scanner;

/**
 * This is a class Faktura.
 *
 * @author Tomasz Kazulak
 *
 * @version 1.1
 */
public class Faktura {

  private int klientId;
  private int fakturaId;
  private Informacje informacje;
  private Sprzedawca sprzedawca;
  private Nabywca nabywca;
  private Rzeczy rzeczy;
  private Statusy statusy;

  /**
   * Constructor for Faktura.
   */
  public Faktura() {
    @SuppressWarnings("resource")
    Scanner in = new Scanner(System.in);
    System.out.print("Wpisz ID klienta: ");
    klientId = in.nextInt();
    System.out.println("INFORMACJE");
    informacje = new Informacje();
    System.out.println("SPRZEDAWCA");
    sprzedawca = new Sprzedawca();
    System.out.println("NABYWCA");
    nabywca = new Nabywca();
    System.out.println("TOWARY LUB USLUGI");
    rzeczy = new Rzeczy();
    System.out.println("STATUS PLATNOSCI");
    statusy = new Statusy();
  }
  
  /**
   * Constructor for Faktura with fakturaId.
   */
  public Faktura(int toId) {
    fakturaId = toId;
    @SuppressWarnings("resource")
    Scanner in = new Scanner(System.in);
    System.out.print("Wpisz ID klienta: ");
    klientId = in.nextInt();
    System.out.println("INFORMACJE");
    informacje = new Informacje();
    System.out.println("SPRZEDAWCA");
    sprzedawca = new Sprzedawca();
    System.out.println("NABYWCA");
    nabywca = new Nabywca();
    System.out.println("TOWARY LUB USLUGI");
    rzeczy = new Rzeczy();
    System.out.println("STATUS PLATNOSCI");
    statusy = new Statusy();
  }
  
  /** Print whole faktura to the terminal. */
  public void printFaktura() {
    System.out.println("FAKTURA\t ID klienta: " + klientId + "\t ID faktury: " + fakturaId);
    
    informacje.printInformacje();
    sprzedawca.printPodmiot();
    nabywca.printPodmiot();
    rzeczy.printRzeczy();
    statusy.printStatusy();
  }
  
  /** Taking ID klient. */
  public int getKlientId() {
    return klientId;
  }
  
  /** Taking ID faktura. */
  public int getFakturaId() {
    return fakturaId;
  }
}
