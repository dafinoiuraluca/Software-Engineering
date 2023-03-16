package Lab6.Ex4;

public class Word {
    private String name;

    public Word() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Word " +
                "is: '" + name + '\'';
    }

}
