package com.druggelp.backend.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    PARAM_ERROR(1, "Error en los parámetros!"),
    PRODUCT_NOT_EXIST(10, "El producto no se encuentra!"),
    PRODUCT_NOT_ENOUGH(11, "No hay suficientes productos en stock!"),
    PRODUCT_STATUS_ERROR(12, "El estado es incorrecto!"),
    PRODUCT_OFF_SALE(13,"El producto no está en venta!"),
    PRODUCT_NOT_IN_CART(14,"El producto no está en el carrito!"),
    CART_CHECKOUT_SUCCESS(20, "Comprobación con éxito! "),

    CATEGORY_NOT_FOUND(30, "Categoría no existe!"),

    ORDER_NOT_FOUND(60, "OrderMain no existe!"),
    ORDER_STATUS_ERROR(61, "Status no es el correcto"),


    VALID_ERROR(50, "Informacion erronea"),
    USER_NOT_FOUNT(40,"No se encuentra el usuario!")
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
