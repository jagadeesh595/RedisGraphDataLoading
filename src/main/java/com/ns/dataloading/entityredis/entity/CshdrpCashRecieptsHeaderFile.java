package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("CSHDRP_CashRecieptsHeaderFile")
public class CshdrpCashRecieptsHeaderFile implements Serializable {
    private Long id;
    private Integer cshpyrProcessingYear;
    private Integer cshpmoProcessingMonth;
    private String csenthEntryDate;
    private Long csharaWareHouseNumber;
    private Long csenvhEnvelopeNumber;
    private Long csorhOrderNumber;
    private BigDecimal csor1HTotalOrderAmount;
    private BigDecimal csc1HhTotalRecievedAmount;
    private BigDecimal csen1HTotalEntryAmount;
    private BigDecimal csad1HTotalAdjustment;
    private String cstathRecordStatus;
    private String cscoidCountryCode;
    private String csusrhUserId;
    private String cschghChangeDate;
    private Long csrf2HOrderReferenceNumber;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "CSHPYR_ProcessingYear", nullable = true)
    public Integer getCshpyrProcessingYear() {
        return cshpyrProcessingYear;
    }

    public void setCshpyrProcessingYear(Integer cshpyrProcessingYear) {
        this.cshpyrProcessingYear = cshpyrProcessingYear;
    }

    // @Basic
    // @Column(name = "CSHPMO_ProcessingMonth", nullable = true)
    public Integer getCshpmoProcessingMonth() {
        return cshpmoProcessingMonth;
    }

    public void setCshpmoProcessingMonth(Integer cshpmoProcessingMonth) {
        this.cshpmoProcessingMonth = cshpmoProcessingMonth;
    }

    // @Basic
    // @Column(name = "CSENTH_EntryDate", nullable = true, length = 15)
    public String getCsenthEntryDate() {
        return csenthEntryDate;
    }

    public void setCsenthEntryDate(String csenthEntryDate) {
        this.csenthEntryDate = csenthEntryDate;
    }

    // @Basic
    // @Column(name = "CSHARA_WareHouseNumber", nullable = true)
    public Long getCsharaWareHouseNumber() {
        return csharaWareHouseNumber;
    }

    public void setCsharaWareHouseNumber(Long csharaWareHouseNumber) {
        this.csharaWareHouseNumber = csharaWareHouseNumber;
    }

    // @Basic
    // @Column(name = "CSENVH_EnvelopeNumber", nullable = true)
    public Long getCsenvhEnvelopeNumber() {
        return csenvhEnvelopeNumber;
    }

    public void setCsenvhEnvelopeNumber(Long csenvhEnvelopeNumber) {
        this.csenvhEnvelopeNumber = csenvhEnvelopeNumber;
    }

    // @Basic
    // @Column(name = "CSORH_OrderNumber", nullable = true)
    public Long getCsorhOrderNumber() {
        return csorhOrderNumber;
    }

    public void setCsorhOrderNumber(Long csorhOrderNumber) {
        this.csorhOrderNumber = csorhOrderNumber;
    }

    // @Basic
    // @Column(name = "CSOR1H_TotalOrderAmount", nullable = true, precision = 3)
    public BigDecimal getCsor1HTotalOrderAmount() {
        return csor1HTotalOrderAmount;
    }

    public void setCsor1HTotalOrderAmount(BigDecimal csor1HTotalOrderAmount) {
        this.csor1HTotalOrderAmount = csor1HTotalOrderAmount;
    }

    // @Basic
    // @Column(name = "CSC1HH_TotalRecievedAmount", nullable = true, precision = 3)
    public BigDecimal getCsc1HhTotalRecievedAmount() {
        return csc1HhTotalRecievedAmount;
    }

    public void setCsc1HhTotalRecievedAmount(BigDecimal csc1HhTotalRecievedAmount) {
        this.csc1HhTotalRecievedAmount = csc1HhTotalRecievedAmount;
    }

    // @Basic
    // @Column(name = "CSEN1H_TotalEntryAmount", nullable = true, precision = 3)
    public BigDecimal getCsen1HTotalEntryAmount() {
        return csen1HTotalEntryAmount;
    }

    public void setCsen1HTotalEntryAmount(BigDecimal csen1HTotalEntryAmount) {
        this.csen1HTotalEntryAmount = csen1HTotalEntryAmount;
    }

    // @Basic
    // @Column(name = "CSAD1H_TotalAdjustment", nullable = true, precision = 3)
    public BigDecimal getCsad1HTotalAdjustment() {
        return csad1HTotalAdjustment;
    }

    public void setCsad1HTotalAdjustment(BigDecimal csad1HTotalAdjustment) {
        this.csad1HTotalAdjustment = csad1HTotalAdjustment;
    }

    // @Basic
    // @Column(name = "CSTATH_RecordStatus", nullable = true, length = 1)
    public String getCstathRecordStatus() {
        return cstathRecordStatus;
    }

    public void setCstathRecordStatus(String cstathRecordStatus) {
        this.cstathRecordStatus = cstathRecordStatus;
    }

    // @Basic
    // @Column(name = "CSCOID_CountryCode", nullable = true, length = 15)
    public String getCscoidCountryCode() {
        return cscoidCountryCode;
    }

    public void setCscoidCountryCode(String cscoidCountryCode) {
        this.cscoidCountryCode = cscoidCountryCode;
    }

    // @Basic
    // @Column(name = "CSUSRH_UserId", nullable = true, length = 255)
    public String getCsusrhUserId() {
        return csusrhUserId;
    }

    public void setCsusrhUserId(String csusrhUserId) {
        this.csusrhUserId = csusrhUserId;
    }

    // @Basic
    // @Column(name = "CSCHGH_ChangeDate", nullable = true, length = 15)
    public String getCschghChangeDate() {
        return cschghChangeDate;
    }

    public void setCschghChangeDate(String cschghChangeDate) {
        this.cschghChangeDate = cschghChangeDate;
    }

    // @Basic
    // @Column(name = "CSRF2H_OrderReferenceNumber", nullable = true)
    public Long getCsrf2HOrderReferenceNumber() {
        return csrf2HOrderReferenceNumber;
    }

    public void setCsrf2HOrderReferenceNumber(Long csrf2HOrderReferenceNumber) {
        this.csrf2HOrderReferenceNumber = csrf2HOrderReferenceNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CshdrpCashRecieptsHeaderFile that = (CshdrpCashRecieptsHeaderFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (cshpyrProcessingYear != null ? !cshpyrProcessingYear.equals(that.cshpyrProcessingYear) : that.cshpyrProcessingYear != null)
            return false;
        if (cshpmoProcessingMonth != null ? !cshpmoProcessingMonth.equals(that.cshpmoProcessingMonth) : that.cshpmoProcessingMonth != null)
            return false;
        if (csenthEntryDate != null ? !csenthEntryDate.equals(that.csenthEntryDate) : that.csenthEntryDate != null)
            return false;
        if (csharaWareHouseNumber != null ? !csharaWareHouseNumber.equals(that.csharaWareHouseNumber) : that.csharaWareHouseNumber != null)
            return false;
        if (csenvhEnvelopeNumber != null ? !csenvhEnvelopeNumber.equals(that.csenvhEnvelopeNumber) : that.csenvhEnvelopeNumber != null)
            return false;
        if (csorhOrderNumber != null ? !csorhOrderNumber.equals(that.csorhOrderNumber) : that.csorhOrderNumber != null)
            return false;
        if (csor1HTotalOrderAmount != null ? !csor1HTotalOrderAmount.equals(that.csor1HTotalOrderAmount) : that.csor1HTotalOrderAmount != null)
            return false;
        if (csc1HhTotalRecievedAmount != null ? !csc1HhTotalRecievedAmount.equals(that.csc1HhTotalRecievedAmount) : that.csc1HhTotalRecievedAmount != null)
            return false;
        if (csen1HTotalEntryAmount != null ? !csen1HTotalEntryAmount.equals(that.csen1HTotalEntryAmount) : that.csen1HTotalEntryAmount != null)
            return false;
        if (csad1HTotalAdjustment != null ? !csad1HTotalAdjustment.equals(that.csad1HTotalAdjustment) : that.csad1HTotalAdjustment != null)
            return false;
        if (cstathRecordStatus != null ? !cstathRecordStatus.equals(that.cstathRecordStatus) : that.cstathRecordStatus != null)
            return false;
        if (cscoidCountryCode != null ? !cscoidCountryCode.equals(that.cscoidCountryCode) : that.cscoidCountryCode != null)
            return false;
        if (csusrhUserId != null ? !csusrhUserId.equals(that.csusrhUserId) : that.csusrhUserId != null) return false;
        if (cschghChangeDate != null ? !cschghChangeDate.equals(that.cschghChangeDate) : that.cschghChangeDate != null)
            return false;
        if (csrf2HOrderReferenceNumber != null ? !csrf2HOrderReferenceNumber.equals(that.csrf2HOrderReferenceNumber) : that.csrf2HOrderReferenceNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (cshpyrProcessingYear != null ? cshpyrProcessingYear.hashCode() : 0);
        result = 31 * result + (cshpmoProcessingMonth != null ? cshpmoProcessingMonth.hashCode() : 0);
        result = 31 * result + (csenthEntryDate != null ? csenthEntryDate.hashCode() : 0);
        result = 31 * result + (csharaWareHouseNumber != null ? csharaWareHouseNumber.hashCode() : 0);
        result = 31 * result + (csenvhEnvelopeNumber != null ? csenvhEnvelopeNumber.hashCode() : 0);
        result = 31 * result + (csorhOrderNumber != null ? csorhOrderNumber.hashCode() : 0);
        result = 31 * result + (csor1HTotalOrderAmount != null ? csor1HTotalOrderAmount.hashCode() : 0);
        result = 31 * result + (csc1HhTotalRecievedAmount != null ? csc1HhTotalRecievedAmount.hashCode() : 0);
        result = 31 * result + (csen1HTotalEntryAmount != null ? csen1HTotalEntryAmount.hashCode() : 0);
        result = 31 * result + (csad1HTotalAdjustment != null ? csad1HTotalAdjustment.hashCode() : 0);
        result = 31 * result + (cstathRecordStatus != null ? cstathRecordStatus.hashCode() : 0);
        result = 31 * result + (cscoidCountryCode != null ? cscoidCountryCode.hashCode() : 0);
        result = 31 * result + (csusrhUserId != null ? csusrhUserId.hashCode() : 0);
        result = 31 * result + (cschghChangeDate != null ? cschghChangeDate.hashCode() : 0);
        result = 31 * result + (csrf2HOrderReferenceNumber != null ? csrf2HOrderReferenceNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"CshdrpCashRecieptsHeaderFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"cshpyrProcessingYear\":\"" + cshpyrProcessingYear + "\""
                + ",                         \"cshpmoProcessingMonth\":\"" + cshpmoProcessingMonth + "\""
                + ",                         \"csenthEntryDate\":\"" + csenthEntryDate + "\""
                + ",                         \"csharaWareHouseNumber\":\"" + csharaWareHouseNumber + "\""
                + ",                         \"csenvhEnvelopeNumber\":\"" + csenvhEnvelopeNumber + "\""
                + ",                         \"csorhOrderNumber\":\"" + csorhOrderNumber + "\""
                + ",                         \"csor1HTotalOrderAmount\":\"" + csor1HTotalOrderAmount + "\""
                + ",                         \"csc1HhTotalRecievedAmount\":\"" + csc1HhTotalRecievedAmount + "\""
                + ",                         \"csen1HTotalEntryAmount\":\"" + csen1HTotalEntryAmount + "\""
                + ",                         \"csad1HTotalAdjustment\":\"" + csad1HTotalAdjustment + "\""
                + ",                         \"cstathRecordStatus\":\"" + cstathRecordStatus + "\""
                + ",                         \"cscoidCountryCode\":\"" + cscoidCountryCode + "\""
                + ",                         \"csusrhUserId\":\"" + csusrhUserId + "\""
                + ",                         \"cschghChangeDate\":\"" + cschghChangeDate + "\""
                + ",                         \"csrf2HOrderReferenceNumber\":\"" + csrf2HOrderReferenceNumber + "\""
                + "}}";
    }
}

