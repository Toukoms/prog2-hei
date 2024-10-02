import java.util.ArrayList;
import java.util.List;

public class Endroit {
  private String id;
  private String name;
  private final List<Appartement> appartements = new ArrayList<Appartement>();

  public Endroit(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Appartement> getAppartements() {
    return appartements;
  }

  public void addAppartement(Appartement appartement) {
    appartement.setEndroit(this);
    appartements.add(appartement);
  }

  public Integer countApart() {
    return appartements.size();
  }
}
