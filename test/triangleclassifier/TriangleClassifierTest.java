package triangleclassifier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {

    @Test
    @DisplayName("TestCase1")
    public void findTriangleClassifier(){
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "Tam giác đều";
        String result = TriangleClassifier.findTriangleClassifier(a, b, c);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("TestCase2")
    public void findTriangleClassifier2(){
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "Tam giác cân";
        String result = TriangleClassifier.findTriangleClassifier(a, b, c);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("TestCase3")
    public void findTriangleClassifier3(){
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "Tam giác thường";
        String result = TriangleClassifier.findTriangleClassifier(a, b, c);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("TestCase4")
    public void findTriangleClassifier4() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "Không phải tam giác";
        String result = TriangleClassifier.findTriangleClassifier(a, b, c);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("TestCase5")
    public void findTriangleClassifier5() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "Không phải tam giác";
        String result = TriangleClassifier.findTriangleClassifier(a, b, c);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("TestCase6")
    public void findTriangleClassifier6() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "Không phải tam giác";
        String result = TriangleClassifier.findTriangleClassifier(a, b, c);
        assertEquals(expected, result);
    }
}
