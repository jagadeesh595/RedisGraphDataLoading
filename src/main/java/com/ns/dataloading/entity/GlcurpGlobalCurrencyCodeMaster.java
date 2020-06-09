package com.ns.dataloading.entity;

import javax.persistence.*;

@Entity
@Table(name = "GLCURP_GlobalCurrencyCodeMaster")
public class GlcurpGlobalCurrencyCodeMaster {
    private Long id;
    private String gcopcyOperCountryCode;
    private String gccntyCountryCode;
    private String gcpcurProductCurrency;
    private String gcpdscCurrencyDesc;
    private String gcocurOrderCurrency;
    private String gcodscCurrencyDesc;
    private String gccdteMaintainedOnDate;
    private String gccusrMaintainedByUser;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "GCOPCY_OperCountryCode", nullable = true, length = 15)
    public String getGcopcyOperCountryCode() {
        return gcopcyOperCountryCode;
    }

    public void setGcopcyOperCountryCode(String gcopcyOperCountryCode) {
        this.gcopcyOperCountryCode = gcopcyOperCountryCode;
    }

    @Basic
    @Column(name = "GCCNTY_CountryCode", nullable = true, length = 15)
    public String getGccntyCountryCode() {
        return gccntyCountryCode;
    }

    public void setGccntyCountryCode(String gccntyCountryCode) {
        this.gccntyCountryCode = gccntyCountryCode;
    }

    @Basic
    @Column(name = "GCPCUR_ProductCurrency", nullable = true, length = 15)
    public String getGcpcurProductCurrency() {
        return gcpcurProductCurrency;
    }

    public void setGcpcurProductCurrency(String gcpcurProductCurrency) {
        this.gcpcurProductCurrency = gcpcurProductCurrency;
    }

    @Basic
    @Column(name = "GCPDSC_CurrencyDesc", nullable = true, length = 55)
    public String getGcpdscCurrencyDesc() {
        return gcpdscCurrencyDesc;
    }

    public void setGcpdscCurrencyDesc(String gcpdscCurrencyDesc) {
        this.gcpdscCurrencyDesc = gcpdscCurrencyDesc;
    }

    @Basic
    @Column(name = "GCOCUR_OrderCurrency", nullable = true, length = 15)
    public String getGcocurOrderCurrency() {
        return gcocurOrderCurrency;
    }

    public void setGcocurOrderCurrency(String gcocurOrderCurrency) {
        this.gcocurOrderCurrency = gcocurOrderCurrency;
    }

    @Basic
    @Column(name = "GCODSC_CurrencyDesc", nullable = true, length = 15)
    public String getGcodscCurrencyDesc() {
        return gcodscCurrencyDesc;
    }

    public void setGcodscCurrencyDesc(String gcodscCurrencyDesc) {
        this.gcodscCurrencyDesc = gcodscCurrencyDesc;
    }

    @Basic
    @Column(name = "GCCDTE_MaintainedOnDate", nullable = true, length = 15)
    public String getGccdteMaintainedOnDate() {
        return gccdteMaintainedOnDate;
    }

    public void setGccdteMaintainedOnDate(String gccdteMaintainedOnDate) {
        this.gccdteMaintainedOnDate = gccdteMaintainedOnDate;
    }

    @Basic
    @Column(name = "GCCUSR_MaintainedByUser", nullable = true, length = 255)
    public String getGccusrMaintainedByUser() {
        return gccusrMaintainedByUser;
    }

    public void setGccusrMaintainedByUser(String gccusrMaintainedByUser) {
        this.gccusrMaintainedByUser = gccusrMaintainedByUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GlcurpGlobalCurrencyCodeMaster that = (GlcurpGlobalCurrencyCodeMaster) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (gcopcyOperCountryCode != null ? !gcopcyOperCountryCode.equals(that.gcopcyOperCountryCode) : that.gcopcyOperCountryCode != null)
            return false;
        if (gccntyCountryCode != null ? !gccntyCountryCode.equals(that.gccntyCountryCode) : that.gccntyCountryCode != null)
            return false;
        if (gcpcurProductCurrency != null ? !gcpcurProductCurrency.equals(that.gcpcurProductCurrency) : that.gcpcurProductCurrency != null)
            return false;
        if (gcpdscCurrencyDesc != null ? !gcpdscCurrencyDesc.equals(that.gcpdscCurrencyDesc) : that.gcpdscCurrencyDesc != null)
            return false;
        if (gcocurOrderCurrency != null ? !gcocurOrderCurrency.equals(that.gcocurOrderCurrency) : that.gcocurOrderCurrency != null)
            return false;
        if (gcodscCurrencyDesc != null ? !gcodscCurrencyDesc.equals(that.gcodscCurrencyDesc) : that.gcodscCurrencyDesc != null)
            return false;
        if (gccdteMaintainedOnDate != null ? !gccdteMaintainedOnDate.equals(that.gccdteMaintainedOnDate) : that.gccdteMaintainedOnDate != null)
            return false;
        if (gccusrMaintainedByUser != null ? !gccusrMaintainedByUser.equals(that.gccusrMaintainedByUser) : that.gccusrMaintainedByUser != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (gcopcyOperCountryCode != null ? gcopcyOperCountryCode.hashCode() : 0);
        result = 31 * result + (gccntyCountryCode != null ? gccntyCountryCode.hashCode() : 0);
        result = 31 * result + (gcpcurProductCurrency != null ? gcpcurProductCurrency.hashCode() : 0);
        result = 31 * result + (gcpdscCurrencyDesc != null ? gcpdscCurrencyDesc.hashCode() : 0);
        result = 31 * result + (gcocurOrderCurrency != null ? gcocurOrderCurrency.hashCode() : 0);
        result = 31 * result + (gcodscCurrencyDesc != null ? gcodscCurrencyDesc.hashCode() : 0);
        result = 31 * result + (gccdteMaintainedOnDate != null ? gccdteMaintainedOnDate.hashCode() : 0);
        result = 31 * result + (gccusrMaintainedByUser != null ? gccusrMaintainedByUser.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"GlcurpGlobalCurrencyCodeMaster\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"gcopcyOperCountryCode\":\"" + gcopcyOperCountryCode + "\""
                + ",                         \"gccntyCountryCode\":\"" + gccntyCountryCode + "\""
                + ",                         \"gcpcurProductCurrency\":\"" + gcpcurProductCurrency + "\""
                + ",                         \"gcpdscCurrencyDesc\":\"" + gcpdscCurrencyDesc + "\""
                + ",                         \"gcocurOrderCurrency\":\"" + gcocurOrderCurrency + "\""
                + ",                         \"gcodscCurrencyDesc\":\"" + gcodscCurrencyDesc + "\""
                + ",                         \"gccdteMaintainedOnDate\":\"" + gccdteMaintainedOnDate + "\""
                + ",                         \"gccusrMaintainedByUser\":\"" + gccusrMaintainedByUser + "\""
                + "}}";
    }
}
