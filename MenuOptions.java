import java.io.Serializable;

public class MenuOptions implements Serializable {
    public Long id;
    public String label;
    public String description;
    public String callbacks;

    public Long getId() {
      return id;
    }

    public String getLabel() {
      return label;
    }

    public String getDescription() {
      return description;
    }

    public String getCallbacks() {
      return callbacks;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public void setLabel(String label) {
      this.label = label;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public void setCallbacks(String callbacks) {
      this.callbacks = callbacks;
    }
}
