
import com.fasterxml.jackson.annotation.JsonProperty;

public class Search {
    @JsonProperty
    private String city;

    // Default constructor (required for Jackson)
    public Search() {}

    // Constructor with city
    public Search(String city) {
        this.city = city;
    }

    // Getter
    public String getCity() {
        return city;
    }

    // Setter
    public void setCity(String city) {
        this.city = city;
    }
}
