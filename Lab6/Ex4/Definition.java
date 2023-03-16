package Lab6.Ex4;

public class Definition {
    private String description;

    public Definition() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Definition " +
                "is: '" + description + '\'';
    }
}
