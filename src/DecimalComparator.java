public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double one, double two){
        double oneNum = one*1000;
        double twoNum = two*1000;

        if ((int)oneNum==twoNum){
            return true;
        }else{
            return false;
        }

    }
}
