package main.java.model;

public class Product {
    private int productId;
    private String productName;
    private String productType;
    private String productInfo;
    private String productCountry;

    public Product(String productName, String productType, String productInfo, String productCountry) {
        this.productName = productName;
        this.productType = productType;
        this.productInfo = productInfo;
        this.productCountry = productCountry;
    }

    public Product(int productId,String productName, String productType, String productInfo, String productCountry) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.productInfo = productInfo;
        this.productCountry = productCountry;
    }

    public Product() {
    }

    public int getproductId () {
        return productId ;
    }

    public void setproductId (int productId ) {
        this.productId  = productId ;
    }

    public String getproductName () {
        return productName ;
    }

    public void setproductName(String productName ) {
        this.productName  = productName ;
    }

    public String getproductType () {
        return productType ;
    }

    public void setproductType (String productType ) {
        this.productType  = productType ;
    }

    public String getproductInfo () {
        return productInfo ;
    }

    public void setproductInfo(String productInfo ) {
        this.productInfo  = productInfo ;
    }

    public String getproductCountry() {
        return productCountry ;
    }

    public void setproductCountry(String productCountry ) {
        this.productCountry  = productCountry ;
    }
}
