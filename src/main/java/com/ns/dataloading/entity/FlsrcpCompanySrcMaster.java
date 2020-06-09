package com.ns.dataloading.entity;

import javax.persistence.*;

@Entity
@Table(name = "FLSRCP_CompanySrcMaster")
public class FlsrcpCompanySrcMaster {
    private Long id;
    private Long fsordsOrderSourceCode;
    private Long fsshpsShippingSourceCode;
    private String fscoidCompanyCode;
    private String fsgmflGmFlag;
    private String fssdscOrderSrcShortDesc;
    private String fsdescOrderSrcDesc;

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
    @Column(name = "FSORDS_OrderSourceCode", nullable = true)
    public Long getFsordsOrderSourceCode() {
        return fsordsOrderSourceCode;
    }

    public void setFsordsOrderSourceCode(Long fsordsOrderSourceCode) {
        this.fsordsOrderSourceCode = fsordsOrderSourceCode;
    }

    @Basic
    @Column(name = "FSSHPS_ShippingSourceCode", nullable = true)
    public Long getFsshpsShippingSourceCode() {
        return fsshpsShippingSourceCode;
    }

    public void setFsshpsShippingSourceCode(Long fsshpsShippingSourceCode) {
        this.fsshpsShippingSourceCode = fsshpsShippingSourceCode;
    }

    @Basic
    @Column(name = "FSCOID_CompanyCode", nullable = true, length = 15)
    public String getFscoidCompanyCode() {
        return fscoidCompanyCode;
    }

    public void setFscoidCompanyCode(String fscoidCompanyCode) {
        this.fscoidCompanyCode = fscoidCompanyCode;
    }

    @Basic
    @Column(name = "FSGMFL_GMFlag", nullable = true, length = 1)
    public String getFsgmflGmFlag() {
        return fsgmflGmFlag;
    }

    public void setFsgmflGmFlag(String fsgmflGmFlag) {
        this.fsgmflGmFlag = fsgmflGmFlag;
    }

    @Basic
    @Column(name = "FSSDSC_OrderSrcShortDesc", nullable = true, length = 255)
    public String getFssdscOrderSrcShortDesc() {
        return fssdscOrderSrcShortDesc;
    }

    public void setFssdscOrderSrcShortDesc(String fssdscOrderSrcShortDesc) {
        this.fssdscOrderSrcShortDesc = fssdscOrderSrcShortDesc;
    }

    @Basic
    @Column(name = "FSDESC_OrderSrcDesc", nullable = true, length = 255)
    public String getFsdescOrderSrcDesc() {
        return fsdescOrderSrcDesc;
    }

    public void setFsdescOrderSrcDesc(String fsdescOrderSrcDesc) {
        this.fsdescOrderSrcDesc = fsdescOrderSrcDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlsrcpCompanySrcMaster that = (FlsrcpCompanySrcMaster) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (fsordsOrderSourceCode != null ? !fsordsOrderSourceCode.equals(that.fsordsOrderSourceCode) : that.fsordsOrderSourceCode != null)
            return false;
        if (fsshpsShippingSourceCode != null ? !fsshpsShippingSourceCode.equals(that.fsshpsShippingSourceCode) : that.fsshpsShippingSourceCode != null)
            return false;
        if (fscoidCompanyCode != null ? !fscoidCompanyCode.equals(that.fscoidCompanyCode) : that.fscoidCompanyCode != null)
            return false;
        if (fsgmflGmFlag != null ? !fsgmflGmFlag.equals(that.fsgmflGmFlag) : that.fsgmflGmFlag != null) return false;
        if (fssdscOrderSrcShortDesc != null ? !fssdscOrderSrcShortDesc.equals(that.fssdscOrderSrcShortDesc) : that.fssdscOrderSrcShortDesc != null)
            return false;
        if (fsdescOrderSrcDesc != null ? !fsdescOrderSrcDesc.equals(that.fsdescOrderSrcDesc) : that.fsdescOrderSrcDesc != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (fsordsOrderSourceCode != null ? fsordsOrderSourceCode.hashCode() : 0);
        result = 31 * result + (fsshpsShippingSourceCode != null ? fsshpsShippingSourceCode.hashCode() : 0);
        result = 31 * result + (fscoidCompanyCode != null ? fscoidCompanyCode.hashCode() : 0);
        result = 31 * result + (fsgmflGmFlag != null ? fsgmflGmFlag.hashCode() : 0);
        result = 31 * result + (fssdscOrderSrcShortDesc != null ? fssdscOrderSrcShortDesc.hashCode() : 0);
        result = 31 * result + (fsdescOrderSrcDesc != null ? fsdescOrderSrcDesc.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"FlsrcpCompanySrcMaster\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"fsordsOrderSourceCode\":\"" + fsordsOrderSourceCode + "\""
                + ",                         \"fsshpsShippingSourceCode\":\"" + fsshpsShippingSourceCode + "\""
                + ",                         \"fscoidCompanyCode\":\"" + fscoidCompanyCode + "\""
                + ",                         \"fsgmflGmFlag\":\"" + fsgmflGmFlag + "\""
                + ",                         \"fssdscOrderSrcShortDesc\":\"" + fssdscOrderSrcShortDesc + "\""
                + ",                         \"fsdescOrderSrcDesc\":\"" + fsdescOrderSrcDesc + "\""
                + "}}";
    }
}
