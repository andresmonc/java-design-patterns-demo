package BuilderPatternDemo.CodeBuilder;

public class Field {
    private String type;
    private String name;

    public Field(String type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("     public %s %s;\n",type,name);
    }
}
