package com.josueao.labcommercebase.dto;

public class FieldMenssage {

    private String fieldName;
    private String message;

    public FieldMenssage(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getMessage() {
        return message;
    }
}
