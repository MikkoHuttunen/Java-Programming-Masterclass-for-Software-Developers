public class FlourPacker {

    public static boolean canPack (int bigCount, int smallCount, int goal) {

        //Validation
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        //1 bigCount is counted as 5
        int sum = (bigCount * 5) + smallCount;

        //If the summary is lesser than goal return false
        if (sum < goal) {
            return false;
        } else if ( goal % 5 <= smallCount) {
            return true;
        }

        return false;
    }
}
