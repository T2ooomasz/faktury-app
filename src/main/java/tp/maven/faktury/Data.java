package tp.maven.faktury;

import java.util.Scanner;

/**
 * This is class contain a Date format: DD:MM:RRRR.
 *
 * @author Tomasz Kazulak
 *
 */
public class Data {
  private int dzien;
  private int miesiac;
  private int rok;

  /** This is constructor with all data pass there. */
  public Data(int dzien1, int miesiac1, int rok1) {
    dzien = dzien1;
    miesiac = miesiac1;
    rok = rok1;
  }
  
  /** 'Interactive' constructor. Administrator can enter all data. */
  public Data() {
    @SuppressWarnings("resource")
    Scanner in = new Scanner(System.in);
    System.out.print("Dzien: ");
    dzien = in.nextInt();
    System.out.print("Miesiac: ");
    miesiac = in.nextInt();
    System.out.print("Rok: ");
    rok = in.nextInt();
  }
  
  /** To get data from class. */
  public Data getData() {
    Data data = new Data(dzien, miesiac, rok);
    return data;
  }
  
  /** To print date. */
  public void printData() {
    System.out.print(dzien + ":" + miesiac + ":" + rok);
  }
}
