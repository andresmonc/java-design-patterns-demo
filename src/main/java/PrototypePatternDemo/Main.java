package PrototypePatternDemo;

public class Main {

    public static void main(String[] args) {
        Point a = new Point(1,2);
        Point b = new Point(1,2);
        Line line = new Line(a,b);

        // This is a shallow copy; 2 names same object
        Line line2 = line;
        line2.getEnd().x = 9999;

        Line line3 = line.deepCopy();
        line3.getEnd().x = 1111111111;

        System.out.println(line.getEnd());
        System.out.println(line2.getEnd());
        System.out.println(line3.getEnd());

//        EASISEST WAY is serialize/deserialize through apache commons
//         need to make line serializable
//        import org.apache.commons.lang.SerializationUtils;
//        Line line4 = SerializationUtils.roundTrip();



    }

}
