enum Status {
  FREE,
  OWNED,
  IN_PROCESS
}

public class Appartement {

  private String id;
  private String title;
  private String description;
  private Integer price;
  private Status status;

  private Endroit endroit;

  public Appartement(String id, String title, String description, Integer price, Status status) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.price = price;
    this.status = status;
  }

  public String getId() {
    return id;
  }

  public String getDescription() {
    return description;
  }

  public Endroit getEndroit() {
    return endroit;
  }

  public Integer getPrice() {
    return price;
  }

  public Status getStatus() {
    return status;
  }

  public String getTitle() {
    return title;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setEndroit(Endroit endroit) {
    this.endroit = endroit;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
