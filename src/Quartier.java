import java.util.ArrayList;
import java.util.List;

public class Quartier extends Endroit {
  private final List<Immeuble> immeubles = new ArrayList<Immeuble>();

  public Quartier(String id, String name) {
    super(id, name);
  }

  public List<Immeuble> getImmeubles() {
    return immeubles;
  }

  public void addImmeuble(Immeuble immeuble) {
    immeuble.setQuartier(this);
    immeubles.add(immeuble);
  }

  public boolean hasApart(Appartement appartement) {
    return  this.getAppartements().contains(appartement);
  }
}
