public class Solution {

    public int numOuts(double innings) {
        int baseOuts = (int) innings * 3;
        System.out.println(baseOuts);
        int intValue = (int) innings;
        System.out.println(intValue);
        double remOuts = (innings % intValue)*10;
        System.out.println(remOuts);

        int outs = (int) (baseOuts+remOuts);
        return outs;
    }
}
