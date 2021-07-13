package com.druggelp.backend.enums;

public enum OrderStatusEnum implements CodeEnum {
    NEW(0, "Nueva orden principal"),
    FINISHED(1, "Terminado"),
    CANCELED(2, "Canceledo")
    ;

    private  int code;
    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public Integer getCode() {
        return code;
    }
}
