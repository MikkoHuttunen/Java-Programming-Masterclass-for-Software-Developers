public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        //Validation
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        //Math.ceil rounds value up
        return (int) Math.ceil((((width * height) / areaPerBucket) - extraBuckets));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        //Validation
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return (int) Math.ceil(((width * height) / areaPerBucket));
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        //Validation
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return (int) Math.ceil(area / areaPerBucket);
    }
}
