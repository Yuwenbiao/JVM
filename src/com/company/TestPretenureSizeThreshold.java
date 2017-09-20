package com.company;

public class TestPretenureSizeThreshold {
    /**
     * PretenureSizeThreshold参数只对Serial和ParNew有效，Parallel Scavenge无效。
     */
    private static final int _1MB = 1024 * 1024;

    public static void testPretenureSizeThreshold() {
        byte[] allocation;
        allocation = new byte[4 * _1MB];//直接分配在老年代中
    }

    public static void main(String[] args) {
        testPretenureSizeThreshold();
    }
}
