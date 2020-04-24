package BuilderPatternDemo.CodeBuilder;

import java.util.ArrayList;
import java.util.List;

public class Class {

    private String className;

    private List<Field> fields = new ArrayList<>();

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Field> getFields() {
        return fields;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("public class ")
                .append(className)
                .append(" {\n");
        fields.forEach(field -> sb.append(field.toString()));
        sb.append("}");
        return sb.toString();
    }
}
