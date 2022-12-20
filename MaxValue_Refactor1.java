package generics;

public class MaxValue_Refactor1 {

    public <K extends Comparable<K>> void maxValue(K val1, K val2, K val3) {
        if ((val1.compareTo(val2)) >= 0 && (val1.compareTo(val3)) >= 0) {
            System.out.println(val1 + " " + " is the largest");
        } else if ((val2.compareTo(val1)) >= 0 && (val2.compareTo(val3)) >= 0) {
            System.out.println(val2 + " " + "is the largest");
        } else {
            System.out.println(val3 + " " + "is the largest");
        }

    }

    public static void main(String[] args) {
        MaxValue_Refactor1 maxValue = new MaxValue_Refactor1();
        System.out.println("Integer Test case1");
        maxValue.maxValue(5, 4, 3);
        System.out.println("Integer Test case2");
        maxValue.maxValue(5, 6, 3);
        System.out.println("Integer Test case3");
        maxValue.maxValue(5, 4, 7);
        System.out.println("Float Test case1");
        maxValue.maxValue(5.2F, 4.3F, 3.2F);
        System.out.println("Float Test case2");
        maxValue.maxValue(5.2F, 6.3F, 3.2F);
        System.out.println("Float Test case3");
        maxValue.maxValue(5.2F, 4.3F, 7.2F);
        System.out.println("String Test case1");
        maxValue.maxValue("Peach", "Apple", "Banana");
        System.out.println("String Test case2");
        maxValue.maxValue("Apple", "Zach", "Banana");
        System.out.println("String Test case3");
        maxValue.maxValue("Apple", "Banana", "Class");
    }
}
