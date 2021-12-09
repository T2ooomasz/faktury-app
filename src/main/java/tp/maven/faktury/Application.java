package tp.maven.faktury;

import java.util.Scanner;

/**
 * Run application.
 * Provide methods to add clients, add invoice,
 * print all information, or all invoice for exact client.
 *
 * @author Tomasz Kazulak
 *
 */
public class Application {
  /** Run application. */
  public Application() {
    System.out.println("Aplikacja dziala! Zapraszam do dzialania.");
    System.out.println("Dodanie pierwszego klienta do bazy.");
    BazaKlientow listaKlientow = new BazaKlientow();
    System.out.println("Dodanie pierwszej faktury.");
    BazaFaktur listaFaktur = new BazaFaktur();
    System.out.println("Wybierz operacje jaka chcesz podjac");
    System.out.print("1 - dodaj klienta\n"
        + "2 - dodaj fakture\n"
        + "3 - wyswietl klientow\n"
        + "4 - wyswietl faktury\n"
        + "5 - wyswietl wszystkie faktury klienta z danym ID\n"
        + "inna cyfra - EXIT\n");
    @SuppressWarnings("resource")
    Scanner in = new Scanner(System.in);
    int option = in.nextInt();  
    while (option > 0 && option < 10) {
      switch (option) {
        case 1:
          listaKlientow.addKlient();
          System.out.println("Wybierz kolejne dzialanie.");
          option = in.nextInt();
          break;
        case 2:
          listaFaktur.addFaktura();
          System.out.println("Wybierz kolejne dzialanie.");
          option = in.nextInt();
          break;
        case 3:
          listaKlientow.printKlients();
          System.out.println("Wybierz kolejne dzialanie.");
          option = in.nextInt();
          break;
        case 4:
          listaFaktur.printFaktury();
          System.out.println("Wybierz kolejne dzialanie.");
          option = in.nextInt();
          break;
        case 5:
          System.out.println("Wpisz ID klienta.");
          int printFakturyKlienta = in.nextInt();
          listaFaktur.printFakturayKlienta(printFakturyKlienta);
          System.out.println("Wybierz kolejne dzialanie.");
          option = in.nextInt();
          break;
        default:
          System.out.println("ERROR!");
          option = -1;
          break;
      }
    }
    System.out.println("Dziekujemy za zaufanie.");
  }

}
