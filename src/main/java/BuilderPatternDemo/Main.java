package BuilderPatternDemo;

import BuilderPatternDemo.CodeBuilder.CodeBuilder;

public class Main {
    public static void main(String[] args) {
        CodeBuilder codeBuilder = new CodeBuilder("Person");
        codeBuilder.addField("address","String");
        codeBuilder.addField("age","int");
        System.out.println(codeBuilder);
    }
}
