package com.aurora.common_class.SystemClass;

import java.util.Arrays;

public class SystemMethod1 {
    public static void main(String[] args) {
        //arraycopy
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = new int[5];

        //从源数组src的索引位置1开始，复制三个元素到目标数组dest(从索引位置2开始)
        System.arraycopy(src, 1, dest, 2, 3);
        System.out.println(Arrays.toString(dest));

        //System.currentTimeMillis()
        System.out.println(System.currentTimeMillis());
    }
}
