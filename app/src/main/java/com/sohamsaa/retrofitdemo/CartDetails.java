package com.sohamsaa.retrofitdemo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class CartDetails {
    @SerializedName("result")
    ArrayList<AllDetails> cartDetails;
}

class AllDetails {
    @SerializedName("CartDetails")
    ArrayList<ChildItems> allCartDetails;
}

class ChildItems {
    private String Amount;
    private String ImgUrl;
    private String ItemNo;
    private int ProductID;
    private String ProductName;
    private int Quantity;

    public String getAmount() {
        return Amount;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public String getItemNo() {
        return ItemNo;
    }

    public int getProductID() {
        return ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public int getQuantity() {
        return Quantity;
    }
}
