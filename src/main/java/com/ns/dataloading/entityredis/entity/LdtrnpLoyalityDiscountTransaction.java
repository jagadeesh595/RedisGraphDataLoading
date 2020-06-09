package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("LDTRNP_LoyalityDiscountTransaction")
public class LdtrnpLoyalityDiscountTransaction implements Serializable {
    private Long id;
    private String ltopcyOperatingCountry;
    private String ltcmpyCompanyCode;
    private Integer ltpyrYear;
    private Integer ltpmoMonth;
    private Long ltordOrderNumber;
    private Long ltdidDistributorId;
    private String lttrnTransactionNumber;
    private String ltreqRequestNumber;
    private String lttypeTransactionType;
    private String ltstasOrderStatus;
    private BigDecimal ltdamtDiscountAmount;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "LTOPCY_OperatingCountry", nullable = true, length = 255)
    public String getLtopcyOperatingCountry() {
        return ltopcyOperatingCountry;
    }

    public void setLtopcyOperatingCountry(String ltopcyOperatingCountry) {
        this.ltopcyOperatingCountry = ltopcyOperatingCountry;
    }

    // @Basic
    // @Column(name = "LTCMPY_CompanyCode", nullable = true, length = 255)
    public String getLtcmpyCompanyCode() {
        return ltcmpyCompanyCode;
    }

    public void setLtcmpyCompanyCode(String ltcmpyCompanyCode) {
        this.ltcmpyCompanyCode = ltcmpyCompanyCode;
    }

    // @Basic
    // @Column(name = "LTPYR_Year", nullable = true)
    public Integer getLtpyrYear() {
        return ltpyrYear;
    }

    public void setLtpyrYear(Integer ltpyrYear) {
        this.ltpyrYear = ltpyrYear;
    }

    // @Basic
    // @Column(name = "LTPMO_Month", nullable = true)
    public Integer getLtpmoMonth() {
        return ltpmoMonth;
    }

    public void setLtpmoMonth(Integer ltpmoMonth) {
        this.ltpmoMonth = ltpmoMonth;
    }

    // @Basic
    // @Column(name = "LTORD_OrderNumber", nullable = true)
    public Long getLtordOrderNumber() {
        return ltordOrderNumber;
    }

    public void setLtordOrderNumber(Long ltordOrderNumber) {
        this.ltordOrderNumber = ltordOrderNumber;
    }

    // @Basic
    // @Column(name = "LTDID_DistributorId", nullable = true)
    public Long getLtdidDistributorId() {
        return ltdidDistributorId;
    }

    public void setLtdidDistributorId(Long ltdidDistributorId) {
        this.ltdidDistributorId = ltdidDistributorId;
    }

    // @Basic
    // @Column(name = "LTTRN_TransactionNumber", nullable = true, length = 255)
    public String getLttrnTransactionNumber() {
        return lttrnTransactionNumber;
    }

    public void setLttrnTransactionNumber(String lttrnTransactionNumber) {
        this.lttrnTransactionNumber = lttrnTransactionNumber;
    }

    // @Basic
    // @Column(name = "LTREQ_RequestNumber", nullable = true, length = 255)
    public String getLtreqRequestNumber() {
        return ltreqRequestNumber;
    }

    public void setLtreqRequestNumber(String ltreqRequestNumber) {
        this.ltreqRequestNumber = ltreqRequestNumber;
    }

    // @Basic
    // @Column(name = "LTTYPE_TransactionType", nullable = true, length = 255)
    public String getLttypeTransactionType() {
        return lttypeTransactionType;
    }

    public void setLttypeTransactionType(String lttypeTransactionType) {
        this.lttypeTransactionType = lttypeTransactionType;
    }

    // @Basic
    // @Column(name = "LTSTAS_OrderStatus", nullable = true, length = 1)
    public String getLtstasOrderStatus() {
        return ltstasOrderStatus;
    }

    public void setLtstasOrderStatus(String ltstasOrderStatus) {
        this.ltstasOrderStatus = ltstasOrderStatus;
    }

    // @Basic
    // @Column(name = "LTDAMT_DiscountAmount", nullable = true, precision = 2)
    public BigDecimal getLtdamtDiscountAmount() {
        return ltdamtDiscountAmount;
    }

    public void setLtdamtDiscountAmount(BigDecimal ltdamtDiscountAmount) {
        this.ltdamtDiscountAmount = ltdamtDiscountAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LdtrnpLoyalityDiscountTransaction that = (LdtrnpLoyalityDiscountTransaction) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ltopcyOperatingCountry != null ? !ltopcyOperatingCountry.equals(that.ltopcyOperatingCountry) : that.ltopcyOperatingCountry != null)
            return false;
        if (ltcmpyCompanyCode != null ? !ltcmpyCompanyCode.equals(that.ltcmpyCompanyCode) : that.ltcmpyCompanyCode != null)
            return false;
        if (ltpyrYear != null ? !ltpyrYear.equals(that.ltpyrYear) : that.ltpyrYear != null) return false;
        if (ltpmoMonth != null ? !ltpmoMonth.equals(that.ltpmoMonth) : that.ltpmoMonth != null) return false;
        if (ltordOrderNumber != null ? !ltordOrderNumber.equals(that.ltordOrderNumber) : that.ltordOrderNumber != null)
            return false;
        if (ltdidDistributorId != null ? !ltdidDistributorId.equals(that.ltdidDistributorId) : that.ltdidDistributorId != null)
            return false;
        if (lttrnTransactionNumber != null ? !lttrnTransactionNumber.equals(that.lttrnTransactionNumber) : that.lttrnTransactionNumber != null)
            return false;
        if (ltreqRequestNumber != null ? !ltreqRequestNumber.equals(that.ltreqRequestNumber) : that.ltreqRequestNumber != null)
            return false;
        if (lttypeTransactionType != null ? !lttypeTransactionType.equals(that.lttypeTransactionType) : that.lttypeTransactionType != null)
            return false;
        if (ltstasOrderStatus != null ? !ltstasOrderStatus.equals(that.ltstasOrderStatus) : that.ltstasOrderStatus != null)
            return false;
        if (ltdamtDiscountAmount != null ? !ltdamtDiscountAmount.equals(that.ltdamtDiscountAmount) : that.ltdamtDiscountAmount != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ltopcyOperatingCountry != null ? ltopcyOperatingCountry.hashCode() : 0);
        result = 31 * result + (ltcmpyCompanyCode != null ? ltcmpyCompanyCode.hashCode() : 0);
        result = 31 * result + (ltpyrYear != null ? ltpyrYear.hashCode() : 0);
        result = 31 * result + (ltpmoMonth != null ? ltpmoMonth.hashCode() : 0);
        result = 31 * result + (ltordOrderNumber != null ? ltordOrderNumber.hashCode() : 0);
        result = 31 * result + (ltdidDistributorId != null ? ltdidDistributorId.hashCode() : 0);
        result = 31 * result + (lttrnTransactionNumber != null ? lttrnTransactionNumber.hashCode() : 0);
        result = 31 * result + (ltreqRequestNumber != null ? ltreqRequestNumber.hashCode() : 0);
        result = 31 * result + (lttypeTransactionType != null ? lttypeTransactionType.hashCode() : 0);
        result = 31 * result + (ltstasOrderStatus != null ? ltstasOrderStatus.hashCode() : 0);
        result = 31 * result + (ltdamtDiscountAmount != null ? ltdamtDiscountAmount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"LdtrnpLoyalityDiscountTransaction\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"ltopcyOperatingCountry\":\"" + ltopcyOperatingCountry + "\""
                + ",                         \"ltcmpyCompanyCode\":\"" + ltcmpyCompanyCode + "\""
                + ",                         \"ltpyrYear\":\"" + ltpyrYear + "\""
                + ",                         \"ltpmoMonth\":\"" + ltpmoMonth + "\""
                + ",                         \"ltordOrderNumber\":\"" + ltordOrderNumber + "\""
                + ",                         \"ltdidDistributorId\":\"" + ltdidDistributorId + "\""
                + ",                         \"lttrnTransactionNumber\":\"" + lttrnTransactionNumber + "\""
                + ",                         \"ltreqRequestNumber\":\"" + ltreqRequestNumber + "\""
                + ",                         \"lttypeTransactionType\":\"" + lttypeTransactionType + "\""
                + ",                         \"ltstasOrderStatus\":\"" + ltstasOrderStatus + "\""
                + ",                         \"ltdamtDiscountAmount\":\"" + ltdamtDiscountAmount + "\""
                + "}}";
    }
}
