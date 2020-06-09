package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("ORWK1P_NonInternetSalesForUs")
public class Orwk1PNonInternetSalesForUs implements Serializable {
    private Long id;
    private Long w1ParaPurchaceArea;
    private Long w1CtycCountryCode;
    private Long w1DidDistributorId;
    private Long w1CtlDistributorControl;
    private Long w1OrdOrderNumber;
    private BigDecimal w1TwhsTotWholesaleCostOfOrder;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "W1PARA_PurchaceArea", nullable = true)
    public Long getW1ParaPurchaceArea() {
        return w1ParaPurchaceArea;
    }

    public void setW1ParaPurchaceArea(Long w1ParaPurchaceArea) {
        this.w1ParaPurchaceArea = w1ParaPurchaceArea;
    }

    // @Basic
    // @Column(name = "W1CTYC_CountryCode", nullable = true)
    public Long getW1CtycCountryCode() {
        return w1CtycCountryCode;
    }

    public void setW1CtycCountryCode(Long w1CtycCountryCode) {
        this.w1CtycCountryCode = w1CtycCountryCode;
    }

    // @Basic
    // @Column(name = "W1DID_DistributorId", nullable = true)
    public Long getW1DidDistributorId() {
        return w1DidDistributorId;
    }

    public void setW1DidDistributorId(Long w1DidDistributorId) {
        this.w1DidDistributorId = w1DidDistributorId;
    }

    // @Basic
    // @Column(name = "W1CTL_DistributorControl", nullable = true)
    public Long getW1CtlDistributorControl() {
        return w1CtlDistributorControl;
    }

    public void setW1CtlDistributorControl(Long w1CtlDistributorControl) {
        this.w1CtlDistributorControl = w1CtlDistributorControl;
    }

    // @Basic
    // @Column(name = "W1ORD_OrderNumber", nullable = true)
    public Long getW1OrdOrderNumber() {
        return w1OrdOrderNumber;
    }

    public void setW1OrdOrderNumber(Long w1OrdOrderNumber) {
        this.w1OrdOrderNumber = w1OrdOrderNumber;
    }

    // @Basic
    // @Column(name = "W1TWHS_TotWholesaleCostOfOrder", nullable = true, precision = 2)
    public BigDecimal getW1TwhsTotWholesaleCostOfOrder() {
        return w1TwhsTotWholesaleCostOfOrder;
    }

    public void setW1TwhsTotWholesaleCostOfOrder(BigDecimal w1TwhsTotWholesaleCostOfOrder) {
        this.w1TwhsTotWholesaleCostOfOrder = w1TwhsTotWholesaleCostOfOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orwk1PNonInternetSalesForUs that = (Orwk1PNonInternetSalesForUs) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (w1ParaPurchaceArea != null ? !w1ParaPurchaceArea.equals(that.w1ParaPurchaceArea) : that.w1ParaPurchaceArea != null)
            return false;
        if (w1CtycCountryCode != null ? !w1CtycCountryCode.equals(that.w1CtycCountryCode) : that.w1CtycCountryCode != null)
            return false;
        if (w1DidDistributorId != null ? !w1DidDistributorId.equals(that.w1DidDistributorId) : that.w1DidDistributorId != null)
            return false;
        if (w1CtlDistributorControl != null ? !w1CtlDistributorControl.equals(that.w1CtlDistributorControl) : that.w1CtlDistributorControl != null)
            return false;
        if (w1OrdOrderNumber != null ? !w1OrdOrderNumber.equals(that.w1OrdOrderNumber) : that.w1OrdOrderNumber != null)
            return false;
        if (w1TwhsTotWholesaleCostOfOrder != null ? !w1TwhsTotWholesaleCostOfOrder.equals(that.w1TwhsTotWholesaleCostOfOrder) : that.w1TwhsTotWholesaleCostOfOrder != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (w1ParaPurchaceArea != null ? w1ParaPurchaceArea.hashCode() : 0);
        result = 31 * result + (w1CtycCountryCode != null ? w1CtycCountryCode.hashCode() : 0);
        result = 31 * result + (w1DidDistributorId != null ? w1DidDistributorId.hashCode() : 0);
        result = 31 * result + (w1CtlDistributorControl != null ? w1CtlDistributorControl.hashCode() : 0);
        result = 31 * result + (w1OrdOrderNumber != null ? w1OrdOrderNumber.hashCode() : 0);
        result = 31 * result + (w1TwhsTotWholesaleCostOfOrder != null ? w1TwhsTotWholesaleCostOfOrder.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"Orwk1PNonInternetSalesForUs\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"w1ParaPurchaceArea\":\"" + w1ParaPurchaceArea + "\""
                + ",                         \"w1CtycCountryCode\":\"" + w1CtycCountryCode + "\""
                + ",                         \"w1DidDistributorId\":\"" + w1DidDistributorId + "\""
                + ",                         \"w1CtlDistributorControl\":\"" + w1CtlDistributorControl + "\""
                + ",                         \"w1OrdOrderNumber\":\"" + w1OrdOrderNumber + "\""
                + ",                         \"w1TwhsTotWholesaleCostOfOrder\":\"" + w1TwhsTotWholesaleCostOfOrder + "\""
                + "}}";
    }
}
