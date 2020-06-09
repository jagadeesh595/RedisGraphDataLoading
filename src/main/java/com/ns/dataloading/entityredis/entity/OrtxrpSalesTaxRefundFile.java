package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("ORTXRP_SalesTaxRefundFile")
public class OrtxrpSalesTaxRefundFile implements Serializable {
    private Long id;
    private Integer otpyrProcessingYear;
    private Integer otpmoProcessingMonth;
    private Long otctlDistributorControl;
    private Long otctycCountryCode;
    private Long otdidDistributorId;
    private Integer otopyrOrderProcessingYear;
    private Integer otopmoOrderProcessingMonth;
    private Long otordOrderNumber;
    private Long otseqSequenceNumber;
    private String otprcdProductCode;
    private BigDecimal otramtRefundAmount;
    private Long otordsOrderSourceCode;
    private Long otshpsShippingSourceCode;
    private Long ototypOrderTypeCode;
    private String otvdatDateSentToVertex;
    private Long otgeocGeographicCode;
    private String otcdatLastChangeDate;
    private String otcusrLastChangeUser;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "OTPYR_ProcessingYear", nullable = true)
    public Integer getOtpyrProcessingYear() {
        return otpyrProcessingYear;
    }

    public void setOtpyrProcessingYear(Integer otpyrProcessingYear) {
        this.otpyrProcessingYear = otpyrProcessingYear;
    }

    // @Basic
    // @Column(name = "OTPMO_ProcessingMonth", nullable = true)
    public Integer getOtpmoProcessingMonth() {
        return otpmoProcessingMonth;
    }

    public void setOtpmoProcessingMonth(Integer otpmoProcessingMonth) {
        this.otpmoProcessingMonth = otpmoProcessingMonth;
    }

    // @Basic
    // @Column(name = "OTCTL_DistributorControl", nullable = false)
    public Long getOtctlDistributorControl() {
        return otctlDistributorControl;
    }

    public void setOtctlDistributorControl(Long otctlDistributorControl) {
        this.otctlDistributorControl = otctlDistributorControl;
    }

    // @Basic
    // @Column(name = "OTCTYC_CountryCode", nullable = true)
    public Long getOtctycCountryCode() {
        return otctycCountryCode;
    }

    public void setOtctycCountryCode(Long otctycCountryCode) {
        this.otctycCountryCode = otctycCountryCode;
    }

    // @Basic
    // @Column(name = "OTDID_DistributorId", nullable = true)
    public Long getOtdidDistributorId() {
        return otdidDistributorId;
    }

    public void setOtdidDistributorId(Long otdidDistributorId) {
        this.otdidDistributorId = otdidDistributorId;
    }

    // @Basic
    // @Column(name = "OTOPYR_OrderProcessingYear", nullable = true)
    public Integer getOtopyrOrderProcessingYear() {
        return otopyrOrderProcessingYear;
    }

    public void setOtopyrOrderProcessingYear(Integer otopyrOrderProcessingYear) {
        this.otopyrOrderProcessingYear = otopyrOrderProcessingYear;
    }

    // @Basic
    // @Column(name = "OTOPMO_OrderProcessingMonth", nullable = true)
    public Integer getOtopmoOrderProcessingMonth() {
        return otopmoOrderProcessingMonth;
    }

    public void setOtopmoOrderProcessingMonth(Integer otopmoOrderProcessingMonth) {
        this.otopmoOrderProcessingMonth = otopmoOrderProcessingMonth;
    }

    // @Basic
    // @Column(name = "OTORD_OrderNumber", nullable = true)
    public Long getOtordOrderNumber() {
        return otordOrderNumber;
    }

    public void setOtordOrderNumber(Long otordOrderNumber) {
        this.otordOrderNumber = otordOrderNumber;
    }

    // @Basic
    // @Column(name = "OTSEQ_SequenceNumber", nullable = true)
    public Long getOtseqSequenceNumber() {
        return otseqSequenceNumber;
    }

    public void setOtseqSequenceNumber(Long otseqSequenceNumber) {
        this.otseqSequenceNumber = otseqSequenceNumber;
    }

    // @Basic
    // @Column(name = "OTPRCD_ProductCode", nullable = true, length = 255)
    public String getOtprcdProductCode() {
        return otprcdProductCode;
    }

    public void setOtprcdProductCode(String otprcdProductCode) {
        this.otprcdProductCode = otprcdProductCode;
    }

    // @Basic
    // @Column(name = "OTRAMT_RefundAmount", nullable = true, precision = 3)
    public BigDecimal getOtramtRefundAmount() {
        return otramtRefundAmount;
    }

    public void setOtramtRefundAmount(BigDecimal otramtRefundAmount) {
        this.otramtRefundAmount = otramtRefundAmount;
    }

    // @Basic
    // @Column(name = "OTORDS_OrderSourceCode", nullable = true)
    public Long getOtordsOrderSourceCode() {
        return otordsOrderSourceCode;
    }

    public void setOtordsOrderSourceCode(Long otordsOrderSourceCode) {
        this.otordsOrderSourceCode = otordsOrderSourceCode;
    }

    // @Basic
    // @Column(name = "OTSHPS_ShippingSourceCode", nullable = true)
    public Long getOtshpsShippingSourceCode() {
        return otshpsShippingSourceCode;
    }

    public void setOtshpsShippingSourceCode(Long otshpsShippingSourceCode) {
        this.otshpsShippingSourceCode = otshpsShippingSourceCode;
    }

    // @Basic
    // @Column(name = "OTOTYP_OrderTypeCode", nullable = true)
    public Long getOtotypOrderTypeCode() {
        return ototypOrderTypeCode;
    }

    public void setOtotypOrderTypeCode(Long ototypOrderTypeCode) {
        this.ototypOrderTypeCode = ototypOrderTypeCode;
    }

    // @Basic
    // @Column(name = "OTVDAT_DateSentToVertex", nullable = true, length = 15)
    public String getOtvdatDateSentToVertex() {
        return otvdatDateSentToVertex;
    }

    public void setOtvdatDateSentToVertex(String otvdatDateSentToVertex) {
        this.otvdatDateSentToVertex = otvdatDateSentToVertex;
    }

    // @Basic
    // @Column(name = "OTGEOC_GeographicCode", nullable = true)
    public Long getOtgeocGeographicCode() {
        return otgeocGeographicCode;
    }

    public void setOtgeocGeographicCode(Long otgeocGeographicCode) {
        this.otgeocGeographicCode = otgeocGeographicCode;
    }

    // @Basic
    // @Column(name = "OTCDAT_LastChangeDate", nullable = true, length = 15)
    public String getOtcdatLastChangeDate() {
        return otcdatLastChangeDate;
    }

    public void setOtcdatLastChangeDate(String otcdatLastChangeDate) {
        this.otcdatLastChangeDate = otcdatLastChangeDate;
    }

    // @Basic
    // @Column(name = "OTCUSR_LastChangeUser", nullable = true, length = 255)
    public String getOtcusrLastChangeUser() {
        return otcusrLastChangeUser;
    }

    public void setOtcusrLastChangeUser(String otcusrLastChangeUser) {
        this.otcusrLastChangeUser = otcusrLastChangeUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrtxrpSalesTaxRefundFile that = (OrtxrpSalesTaxRefundFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (otpyrProcessingYear != null ? !otpyrProcessingYear.equals(that.otpyrProcessingYear) : that.otpyrProcessingYear != null)
            return false;
        if (otpmoProcessingMonth != null ? !otpmoProcessingMonth.equals(that.otpmoProcessingMonth) : that.otpmoProcessingMonth != null)
            return false;
        if (otctlDistributorControl != null ? !otctlDistributorControl.equals(that.otctlDistributorControl) : that.otctlDistributorControl != null)
            return false;
        if (otctycCountryCode != null ? !otctycCountryCode.equals(that.otctycCountryCode) : that.otctycCountryCode != null)
            return false;
        if (otdidDistributorId != null ? !otdidDistributorId.equals(that.otdidDistributorId) : that.otdidDistributorId != null)
            return false;
        if (otopyrOrderProcessingYear != null ? !otopyrOrderProcessingYear.equals(that.otopyrOrderProcessingYear) : that.otopyrOrderProcessingYear != null)
            return false;
        if (otopmoOrderProcessingMonth != null ? !otopmoOrderProcessingMonth.equals(that.otopmoOrderProcessingMonth) : that.otopmoOrderProcessingMonth != null)
            return false;
        if (otordOrderNumber != null ? !otordOrderNumber.equals(that.otordOrderNumber) : that.otordOrderNumber != null)
            return false;
        if (otseqSequenceNumber != null ? !otseqSequenceNumber.equals(that.otseqSequenceNumber) : that.otseqSequenceNumber != null)
            return false;
        if (otprcdProductCode != null ? !otprcdProductCode.equals(that.otprcdProductCode) : that.otprcdProductCode != null)
            return false;
        if (otramtRefundAmount != null ? !otramtRefundAmount.equals(that.otramtRefundAmount) : that.otramtRefundAmount != null)
            return false;
        if (otordsOrderSourceCode != null ? !otordsOrderSourceCode.equals(that.otordsOrderSourceCode) : that.otordsOrderSourceCode != null)
            return false;
        if (otshpsShippingSourceCode != null ? !otshpsShippingSourceCode.equals(that.otshpsShippingSourceCode) : that.otshpsShippingSourceCode != null)
            return false;
        if (ototypOrderTypeCode != null ? !ototypOrderTypeCode.equals(that.ototypOrderTypeCode) : that.ototypOrderTypeCode != null)
            return false;
        if (otvdatDateSentToVertex != null ? !otvdatDateSentToVertex.equals(that.otvdatDateSentToVertex) : that.otvdatDateSentToVertex != null)
            return false;
        if (otgeocGeographicCode != null ? !otgeocGeographicCode.equals(that.otgeocGeographicCode) : that.otgeocGeographicCode != null)
            return false;
        if (otcdatLastChangeDate != null ? !otcdatLastChangeDate.equals(that.otcdatLastChangeDate) : that.otcdatLastChangeDate != null)
            return false;
        if (otcusrLastChangeUser != null ? !otcusrLastChangeUser.equals(that.otcusrLastChangeUser) : that.otcusrLastChangeUser != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (otpyrProcessingYear != null ? otpyrProcessingYear.hashCode() : 0);
        result = 31 * result + (otpmoProcessingMonth != null ? otpmoProcessingMonth.hashCode() : 0);
        result = 31 * result + (otctlDistributorControl != null ? otctlDistributorControl.hashCode() : 0);
        result = 31 * result + (otctycCountryCode != null ? otctycCountryCode.hashCode() : 0);
        result = 31 * result + (otdidDistributorId != null ? otdidDistributorId.hashCode() : 0);
        result = 31 * result + (otopyrOrderProcessingYear != null ? otopyrOrderProcessingYear.hashCode() : 0);
        result = 31 * result + (otopmoOrderProcessingMonth != null ? otopmoOrderProcessingMonth.hashCode() : 0);
        result = 31 * result + (otordOrderNumber != null ? otordOrderNumber.hashCode() : 0);
        result = 31 * result + (otseqSequenceNumber != null ? otseqSequenceNumber.hashCode() : 0);
        result = 31 * result + (otprcdProductCode != null ? otprcdProductCode.hashCode() : 0);
        result = 31 * result + (otramtRefundAmount != null ? otramtRefundAmount.hashCode() : 0);
        result = 31 * result + (otordsOrderSourceCode != null ? otordsOrderSourceCode.hashCode() : 0);
        result = 31 * result + (otshpsShippingSourceCode != null ? otshpsShippingSourceCode.hashCode() : 0);
        result = 31 * result + (ototypOrderTypeCode != null ? ototypOrderTypeCode.hashCode() : 0);
        result = 31 * result + (otvdatDateSentToVertex != null ? otvdatDateSentToVertex.hashCode() : 0);
        result = 31 * result + (otgeocGeographicCode != null ? otgeocGeographicCode.hashCode() : 0);
        result = 31 * result + (otcdatLastChangeDate != null ? otcdatLastChangeDate.hashCode() : 0);
        result = 31 * result + (otcusrLastChangeUser != null ? otcusrLastChangeUser.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"OrtxrpSalesTaxRefundFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"otpyrProcessingYear\":\"" + otpyrProcessingYear + "\""
                + ",                         \"otpmoProcessingMonth\":\"" + otpmoProcessingMonth + "\""
                + ",                         \"otctlDistributorControl\":\"" + otctlDistributorControl + "\""
                + ",                         \"otctycCountryCode\":\"" + otctycCountryCode + "\""
                + ",                         \"otdidDistributorId\":\"" + otdidDistributorId + "\""
                + ",                         \"otopyrOrderProcessingYear\":\"" + otopyrOrderProcessingYear + "\""
                + ",                         \"otopmoOrderProcessingMonth\":\"" + otopmoOrderProcessingMonth + "\""
                + ",                         \"otordOrderNumber\":\"" + otordOrderNumber + "\""
                + ",                         \"otseqSequenceNumber\":\"" + otseqSequenceNumber + "\""
                + ",                         \"otprcdProductCode\":\"" + otprcdProductCode + "\""
                + ",                         \"otramtRefundAmount\":\"" + otramtRefundAmount + "\""
                + ",                         \"otordsOrderSourceCode\":\"" + otordsOrderSourceCode + "\""
                + ",                         \"otshpsShippingSourceCode\":\"" + otshpsShippingSourceCode + "\""
                + ",                         \"ototypOrderTypeCode\":\"" + ototypOrderTypeCode + "\""
                + ",                         \"otvdatDateSentToVertex\":\"" + otvdatDateSentToVertex + "\""
                + ",                         \"otgeocGeographicCode\":\"" + otgeocGeographicCode + "\""
                + ",                         \"otcdatLastChangeDate\":\"" + otcdatLastChangeDate + "\""
                + ",                         \"otcusrLastChangeUser\":\"" + otcusrLastChangeUser + "\""
                + "}}";
    }
}
