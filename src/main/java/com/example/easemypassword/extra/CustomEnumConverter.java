package com.example.easemypassword.extra;


import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

/**
 * This is sample class to store the enum in database
 * to convert enum as string column and read it back to enum
 * In database entity it can be use like
 *  @Convert(converter = CustomEnumConverter.class)
 *  private CustomEnum status;
 */

@Converter
public class CustomEnumConverter implements AttributeConverter<CustomEnum, String> {

    @Override
    public String convertToDatabaseColumn(CustomEnum attribute) {
        return attribute.toString(); // Convert enum to string
    }

    @Override
    public CustomEnum convertToEntityAttribute(String dbData) {
        return CustomEnum.valueOf(dbData); // Convert string to enum
    }
}

