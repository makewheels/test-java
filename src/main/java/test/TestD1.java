package test;

public class TestD1 {
    /**
     * 合并两个有序数组
     *
     * @param arr1
     * @param arr2
     * @return
     */
    private int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int index1 = 0;
        int index2 = 0;
        int indexResult = 0;
        //先复制一个数组到结束
        while (index1 < arr1.length - 1 && index2 < arr2.length) {
            if (arr1[index1] < arr2[index2]) {
                result[indexResult] = arr1[index1];
                index1++;
            } else {
                result[indexResult] = arr2[index2];
                index2++;
            }
        }
        //复制剩余部分
        if (index1 < index2) {
            for (int i = index1; i < result.length - 1; i++) {
                result[i] = arr1[index1];
                index1++;
            }
        } else {
            for (int i = index2; i < result.length - 1; i++) {
                result[i] = arr2[index2];
                index2++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
