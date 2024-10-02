package by.emall.yatsevich.components.utils.generators.enums;

import java.lang.reflect.Array;

public enum OperatorsCodes {
     LIFE(25), MTS_1(29), MTS_2(33), A1(44);

     private final int code;
    OperatorsCodes(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static int[] getAllCodes() {
        return new int[]{LIFE.getCode(), MTS_1.getCode(), MTS_2.getCode(), A1.getCode()};
    }
}
