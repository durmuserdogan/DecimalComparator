public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double one, double two){
        int oneNum = (int) ((double)one*1000);
        int twoNum = (int) ((double)two*1000);

        if (oneNum==twoNum){
            return true;
        }else{
            return false;
        }

    }
}
