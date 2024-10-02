import apart.ApartStatus;
import apart.Appartement;
import apart.Immeuble;
import apart.Quartier;

public class App {
  public static void main(String[] args) {
    // 1. check if an apart is present in a quartier
    Appartement apart1 = new Appartement("1", "Apart 1", "Description 1", 528, ApartStatus.FREE);
    Appartement apart2 = new Appartement("2", "Apart 2", "Description 2", 436, ApartStatus.OWNED);
    Appartement apart3 = new Appartement("3", "Apart 3", "Description 3", 631, ApartStatus.IN_PROCESS);
    Appartement apart4 = new Appartement("4", "Apart 4", "Description 4", 389, ApartStatus.OWNED);
    Quartier ivandry = new Quartier("1", "ivandry");
    ivandry.addAppartement(apart4);
    ivandry.addAppartement(apart3);
    ivandry.addAppartement(apart1);
    if (ivandry.hasApart(apart4)) {
      System.out.println(apart4.getTitle() + " is in " + ivandry.getName());
    } else {
      System.out.println(apart4.getTitle() + " is not in quartier " + ivandry.getName());
    }
    if (ivandry.hasApart(apart2)) {
      System.out.println(apart2.getTitle() + " is in " + ivandry.getName());
    } else {
      System.out.println(apart2.getTitle() + " is not in " + ivandry.getName());
    }

    System.out.println();
    
    // 2. Count Apart in a immeuble or quartier
    System.out.println("Number of apart in " + ivandry.getName() + ": " + ivandry.countApart());
    Immeuble im1 = new Immeuble("1", "Immeuble 1", 3);
    im1.addAppartement(apart2);
    im1.addAppartement(apart1);
    System.out.println("Number of apart in " + im1.getName() + ": " + im1.countApart());
  }
}
