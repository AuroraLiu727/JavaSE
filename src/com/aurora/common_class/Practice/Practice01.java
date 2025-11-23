package com.aurora.common_class.Practice;

/*
    字符串反转
 */

public class Practice01 {
    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println("reverse之前str = " + str);
        try {
            String reversed = reverse(str, 2, 5);
            System.out.println("reverse之后reversed = " + reversed);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;     //程序结束
        }
    }

    public static String reverse(String str, int start, int end) {

        //参数异常的情况
        if (!(str != null && start >0 && end < str.length() && start <= end)) {
            throw new RuntimeException("参数不正确");
        }

        char[] arr = str.toCharArray();
//        for (int i = 0; i <= (end - start) / 2; i++) {
//            char temp = arr[start + i];
//            arr[start + i] = arr[end - i];
//            arr[end - i] = temp;
//        }
        for (int i = start, j = end; i < j; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return new String(arr);
    }
}
