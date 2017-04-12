
package com.novauc.entities;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "ArrayOfProduct")
@XmlAccessorType (XmlAccessType.FIELD)
public class ArrayOfProduct
{
    private List<Product> products;

    private String xmlns;

    public ArrayOfProduct() {
    }

    public ArrayOfProduct(List<Product> products, String xmlns) {
        this.products = products;
        this.xmlns = xmlns;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Product = "+products+", xmlns = "+xmlns+"]";
    }


}
	