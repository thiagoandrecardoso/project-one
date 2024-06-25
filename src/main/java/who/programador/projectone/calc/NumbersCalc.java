package who.programador.projectone.calc;

public class NumbersCalc {

    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        return max;
    }

}
