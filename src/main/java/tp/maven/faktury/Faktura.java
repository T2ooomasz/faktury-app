package tp.maven.faktury;

import java.util.Scanner;

/**
 * This is a class Faktura.
 *
 * @author Tomasz Kazulak
 *
 *@version 1.1
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
    rzeczy = new Rzeczy();
  }
  
  /** Printing whole faktura to the terminal. */
  public void printFaktura() {
    System.out.println("Faktura: ");
    
    rzeczy.printRzeczy();
  }

}
