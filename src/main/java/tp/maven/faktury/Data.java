package tp.maven.faktury;

/**
 * This is class contain a Date format.
 *
 * @author tkazulak.
 *
 */
public class Data {
  private int dzien;
  private int miesiac;
  private int rok;

  /**
   * This is constructor.
   */
  public Data(int dzien1, int miesiac1, int rok1) {
    dzien = dzien1;
    miesiac = miesiac1;
    rok = rok1;
  }
  
  public Data getData() {
    Data data = new Data(dzien, miesiac, rok);
    return data;
  }
}
