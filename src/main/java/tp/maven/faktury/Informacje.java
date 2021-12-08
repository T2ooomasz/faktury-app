package tp.maven.faktury;

/**
 * @author tkazulak
 *
 */
public class Informacje {

  private TypDokumentu dokument;
  private String numer;
  private Typjezyka jezyk;
  private String miejsceWystawienia;
  private Data dataWystawienia;
  private Data dataSprzedazy;
  
  enum TypDokumentu {
    FAKTURA, FAKTURA_VAT, FAKTURA_DO_PARAGONU
  }
  
  enum Typjezyka {
    POLSKI, ANGIELSKI, NIEMIECKI
  }
}
