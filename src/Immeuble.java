import java.util.List;

public class Immeuble extends Endroit {
  private Integer numberOfFloor;
  private Quartier quartier;

  public Immeuble(String id, String name, Integer numberOfFloor) {
    super(id, name);
    this.numberOfFloor = numberOfFloor;
  }

  public Integer getNumberOfFloor() {
    return numberOfFloor;
  }

  public void setNumberOfFloor(Integer numberOfFloor) {
    this.numberOfFloor = numberOfFloor;
  }

  public Quartier getQuartier() {
    return quartier;
  }

  public void setQuartier(Quartier quartier) {
    this.quartier = quartier;
  }
}
