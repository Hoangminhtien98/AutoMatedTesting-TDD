package triangleclassifier;

public class TriangleClassifier {
    public static String findTriangleClassifier(int a, int b, int c) {
        boolean checkTamGiacDeu = a == b && b == c;
        if (checkTamGiacDeu) {
            return "Tam giác đều";
        } else if ((a + b) > c && (a + c) > b && (b + c) > a) {
            if (a == b || b == c || c == a){
            return "Tam giác cân";
        } else {
            return "Tam giác thường";
        }
    }else {
            return "Không phải tam giác";
        }
    }
}

