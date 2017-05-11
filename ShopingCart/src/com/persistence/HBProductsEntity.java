package com.persistence;

import javax.persistence.*;

@Entity
@Table(name = "products", schema = "public", catalog = "skistuff")
public class HBProductsEntity {


    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    public int getId() {
        return id;
    }


    @Basic
    @Column(name = "productname")
    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HBProductsEntity that = (HBProductsEntity) o;

        if (id != that.id) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        return result;
    }
}
