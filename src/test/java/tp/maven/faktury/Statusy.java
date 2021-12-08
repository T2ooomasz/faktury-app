package tp.maven.faktury;

/**
 * @author tkazulak
 *
 */
public class Statusy {
  private TypStatusu status;
  private int zaplacono;
  private Data dataPlatnosci;
  private String opisPlatnosci;
  private TypSposoboPlatnosci sposobPlatnosci;
  private Data terminPlatnosci;
  private int[] numerKonta;
  private String Uwagi;
  
  enum TypStatusu {
    NIEZAPLACONA, CZESCIOWO_ZAPLACONA, ZAPLACONA
  }
  
  enum TypSposoboPlatnosci {
    PRZELEW, GOTOWKA, KARTA_PLATNICZA, CZEK, WEKSEL, KREDYT
  }
}
