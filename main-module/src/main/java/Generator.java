public class Generator {

    public String name;

    public Generator (String name) {
        this.name = name;
    }

    public int generate() {

        switch (name) {
            case "NORMAL":
                return 1;
            default:
                return 2;
        }
    }

}
