package com.novauc.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Product")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product
{
    private String ItemID;

    private String Itemname;

    private String AisleNumber;

    private String ItemCategory;

    private String ItemImage;

    private String ItemDescription;


    public Product(String itemID, String itemname, String aisleNumber, String itemCategory, String itemImage, String itemDescription) {
        ItemID = itemID;
        Itemname = itemname;
        AisleNumber = aisleNumber;
        ItemCategory = itemCategory;
        ItemImage = itemImage;
        ItemDescription = itemDescription;
    }

    public Product() {
    }

    public String getItemID ()
    {
        return ItemID;
    }

    @XmlElement(name="itemID")
    public void setItemID (String ItemID)
    {
        this.ItemID = ItemID;
    }

    public String getItemname ()
    {
        return Itemname;
    }

    @XmlElement(name="itemname")
    public void setItemname (String Itemname)
    {
        this.Itemname = Itemname;
    }

    public String getAisleNumber ()
    {
        return AisleNumber;
    }

    @XmlElement(name="aisleNumber")
    public void setAisleNumber (String AisleNumber)
    {
        this.AisleNumber = AisleNumber;
    }

    public String getItemCategory ()
    {
        return ItemCategory;
    }

    @XmlElement(name="itemCategory")
    public void setItemCategory (String ItemCategory)
    {
        this.ItemCategory = ItemCategory;
    }

    public String getItemImage ()
    {
        return ItemImage;
    }

    @XmlElement(name="itemImage")
    public void setItemImage (String ItemImage)
    {
        this.ItemImage = ItemImage;
    }

    public String getItemDescription ()
    {
        return ItemDescription;
    }

    @XmlElement(name="itemDescription")
    public void setItemDescription (String ItemDescription)
    {
        this.ItemDescription = ItemDescription;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ItemID = "+ItemID+", Itemname = "+Itemname+", AisleNumber = "+AisleNumber+", ItemCategory = "+ItemCategory+", ItemImage = "+ItemImage+", ItemDescription = "+ItemDescription+"]";
    }
}