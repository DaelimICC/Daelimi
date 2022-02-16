package com.icc.datatype;

/**
 * author : Hod0ri
 * Date : 2022.02.16
 * Version : 0.0.1
 * Title : Data Type Converter for freshman (for Project)
 */
public class Converter {

    // Constructor
    public Converter() {}

    // Convert to String Method
    public String CovertString(int integerData) { return Integer.toString(integerData); }
    public String ConvertString(float floatData) { return Float.toString(floatData); }

    // Convert to Integer Method
    public int ConvertInt(String stringData) { return Integer.parseInt(stringData); }
    public int ConvertInt(float floatData) { return (int)floatData; }

    // Convert to Float Method
    public float ConvertFloat(int integerData) { return (float)integerData; }
    public float ConvertFloat(String stringData) { return Float.parseFloat(stringData); }
}
