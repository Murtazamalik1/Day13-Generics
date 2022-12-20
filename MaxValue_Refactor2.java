package generics;

public class MaxValue_Refactor2 <T extends Comparable<T>> {
    T var1, var2, var3;

    public MaxValue_Refactor2(T var1, T var2, T var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public void testMaximum() {
        testMaxim(var1, var2, var3);
    }

    static <T extends Comparable<T>> void testMaxim(T val1, T val2, T val3) {
        if ((val1.compareTo(val2)) >= 0 && (val1.compareTo(val3)) >= 0) {
            System.out.println(val1 + " " + "is the largest");
        } else if ((val2.compareTo(val1)) >= 0 && (val2.compareTo(val3)) >= 0) {
            System.out.println(val2 + " " + "is the largest");
        } else {
            System.out.println(val3 + " " + "is the largest");
        }
    }

    public static void main(String[] args) {
        MaxValue_Refactor2<Integer> maxValue1 = new MaxValue_Refactor2<>(5, 4, 3);
        maxValue1.testMaximum();
        MaxValue_Refactor2<Float> maxValue2 = new MaxValue_Refactor2<>(5.2F, 8.3F, 3.2F);
        maxValue2.testMaximum();
        MaxValue_Refactor2<String> maxValue3 = new MaxValue_Refactor2<>("Peach", "Apple", "Zach");
        maxValue3.testMaximum();
    }

}
