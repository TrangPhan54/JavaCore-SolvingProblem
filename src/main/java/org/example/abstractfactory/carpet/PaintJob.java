package org.example.abstractfactory.carpet;

public class PaintJob {
    public static void main(String[] args) {
        int re = getBucketCount(0.75, 0.75, 0.5, 0);
        System.out.println(re);
    }

    public static int getBucketCount(double width, double height, double areaBucket, int extraBucket) {
        double wallArea = width * height;
        if (width <= 0 || height <= 0) {
            return -1;
        }
        return (int) Math.ceil(wallArea / areaBucket) - extraBucket;
    }
    public static int extraBuckets(double width, double height, double areaBucket){
        if (width <= 0 || height <= 0) {
            return -1;
        }
        return (int) Math.ceil(width * height / areaBucket);
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        return (int) Math.ceil(area/areaPerBucket);
    }

}