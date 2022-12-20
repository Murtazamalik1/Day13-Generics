package generics;

public class Refactor_uc4 <T>{
    private T[] inputArray ;
    private T[] doublesArray;
    public Refactor_uc4 (T [] inputArray){
        this.inputArray = inputArray;
    }
    public void tomaximum(){
        Refactor_uc4.tomaximum(this.inputArray);
    }
    public static <E> void tomaximum( E[] inputArray){
        for (E elements: inputArray){
            System.out.printf(""+elements);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Integer[] inputArray = {1, 2,3,5,7};
        double[] doublesArray = {4.4, 3.3,1.1,7.8};
        String[] strings = {"malik","murtaza","java"};


        new Refactor_uc4(inputArray).tomaximum();

    }

}
