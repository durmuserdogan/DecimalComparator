public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double one, double two){
        double oneNum = one*10000;
        double twoNum = two*10000;

        if ((int)oneNum==twoNum){
            return true;
        }else{
            return false;
        }

    }
}
