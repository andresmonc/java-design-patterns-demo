package BuilderPatternDemo.CodeBuilder;

public class CodeBuilder {

    private Class aClass = new Class();

    public CodeBuilder(String className) {
        aClass.setClassName(className);
    }

    public CodeBuilder addField(String name, String type) {
        aClass.getFields().add(new Field(type,name));
        return this;
    }

    public CodeBuilder clear() {
        aClass.getFields().clear();
        return this;
    }

    @Override
    public String toString() {
        return aClass.toString();
    }
}