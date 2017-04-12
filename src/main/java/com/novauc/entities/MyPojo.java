package com.novauc.entities;

/**
 * Created by mfahrner on 4/11/17.
 */
public class MyPojo
{
    private ArrayOfProduct ArrayOfProduct;

    public ArrayOfProduct getArrayOfProduct ()
    {
        return ArrayOfProduct;
    }

    public void setArrayOfProduct (ArrayOfProduct ArrayOfProduct)
    {
        this.ArrayOfProduct = ArrayOfProduct;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ArrayOfProduct = "+ArrayOfProduct+"]";
    }
}
