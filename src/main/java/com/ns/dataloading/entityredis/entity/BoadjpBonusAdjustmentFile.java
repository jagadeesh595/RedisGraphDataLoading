package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("BOADJP_BonusAdjustmentFile")
public class BoadjpBonusAdjustmentFile implements Serializable {
    private Long id;
    private Integer bapyrProcessingYear;
    private Integer bapmoProcessingMonth;
    private Long bactlDistributorControl;
    private Long baordOrderNumber;
    private String baetypErrorType;
    private String baecdeErrorCode;
    private BigDecimal baeamtErrorAmount;
    private BigDecimal batccrCaseCreditAdjustment;
    private Integer bafmoAdjustForMonth;
    private Integer bafyrAdjustForYear;
    private String barevReverseYorN;
    private String bacdatLastChangeDate;
    private String bacusrLastChangeUser;
    private String bacoidCompanyId;
    private Long baordsOrderSourceCode;
    private Long bashpsShippingSourceCode;
    private Long baotypOrderTypeCode;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "BAPYR_ProcessingYear", nullable = true)
    public Integer getBapyrProcessingYear() {
        return bapyrProcessingYear;
    }

    public void setBapyrProcessingYear(Integer bapyrProcessingYear) {
        this.bapyrProcessingYear = bapyrProcessingYear;
    }

    // @Basic
    // @Column(name = "BAPMO_ProcessingMonth", nullable = true)
    public Integer getBapmoProcessingMonth() {
        return bapmoProcessingMonth;
    }

    public void setBapmoProcessingMonth(Integer bapmoProcessingMonth) {
        this.bapmoProcessingMonth = bapmoProcessingMonth;
    }

    // @Basic
    // @Column(name = "BACTL_DistributorControl", nullable = false)
    public Long getBactlDistributorControl() {
        return bactlDistributorControl;
    }

    public void setBactlDistributorControl(Long bactlDistributorControl) {
        this.bactlDistributorControl = bactlDistributorControl;
    }

    // @Basic
    // @Column(name = "BAORD_OrderNumber", nullable = true)
    public Long getBaordOrderNumber() {
        return baordOrderNumber;
    }

    public void setBaordOrderNumber(Long baordOrderNumber) {
        this.baordOrderNumber = baordOrderNumber;
    }

    // @Basic
    // @Column(name = "BAETYP_ErrorType", nullable = true, length = 2)
    public String getBaetypErrorType() {
        return baetypErrorType;
    }

    public void setBaetypErrorType(String baetypErrorType) {
        this.baetypErrorType = baetypErrorType;
    }

    // @Basic
    // @Column(name = "BAECDE_ErrorCode", nullable = true, length = 255)
    public String getBaecdeErrorCode() {
        return baecdeErrorCode;
    }

    public void setBaecdeErrorCode(String baecdeErrorCode) {
        this.baecdeErrorCode = baecdeErrorCode;
    }

    // @Basic
    // @Column(name = "BAEAMT_ErrorAmount", nullable = true, precision = 2)
    public BigDecimal getBaeamtErrorAmount() {
        return baeamtErrorAmount;
    }

    public void setBaeamtErrorAmount(BigDecimal baeamtErrorAmount) {
        this.baeamtErrorAmount = baeamtErrorAmount;
    }

    // @Basic
    // @Column(name = "BATCCR_CaseCreditAdjustment", nullable = true, precision = 3)
    public BigDecimal getBatccrCaseCreditAdjustment() {
        return batccrCaseCreditAdjustment;
    }

    public void setBatccrCaseCreditAdjustment(BigDecimal batccrCaseCreditAdjustment) {
        this.batccrCaseCreditAdjustment = batccrCaseCreditAdjustment;
    }

    // @Basic
    // @Column(name = "BAFMO_AdjustForMonth", nullable = true)
    public Integer getBafmoAdjustForMonth() {
        return bafmoAdjustForMonth;
    }

    public void setBafmoAdjustForMonth(Integer bafmoAdjustForMonth) {
        this.bafmoAdjustForMonth = bafmoAdjustForMonth;
    }

    // @Basic
    // @Column(name = "BAFYR_AdjustForYear", nullable = true)
    public Integer getBafyrAdjustForYear() {
        return bafyrAdjustForYear;
    }

    public void setBafyrAdjustForYear(Integer bafyrAdjustForYear) {
        this.bafyrAdjustForYear = bafyrAdjustForYear;
    }

    // @Basic
    // @Column(name = "BAREV_ReverseYorN", nullable = true, length = 1)
    public String getBarevReverseYorN() {
        return barevReverseYorN;
    }

    public void setBarevReverseYorN(String barevReverseYorN) {
        this.barevReverseYorN = barevReverseYorN;
    }

    // @Basic
    // @Column(name = "BACDAT_LastChangeDate", nullable = true)
    public String getBacdatLastChangeDate() {
        return bacdatLastChangeDate;
    }

    public void setBacdatLastChangeDate(String bacdatLastChangeDate) {
        this.bacdatLastChangeDate = bacdatLastChangeDate;
    }

    // @Basic
    // @Column(name = "BACUSR_LastChangeUser", nullable = true, length = 10)
    public String getBacusrLastChangeUser() {
        return bacusrLastChangeUser;
    }

    public void setBacusrLastChangeUser(String bacusrLastChangeUser) {
        this.bacusrLastChangeUser = bacusrLastChangeUser;
    }

    // @Basic
    // @Column(name = "BACOID_CompanyId", nullable = true, length = 4)
    public String getBacoidCompanyId() {
        return bacoidCompanyId;
    }

    public void setBacoidCompanyId(String bacoidCompanyId) {
        this.bacoidCompanyId = bacoidCompanyId;
    }

    // @Basic
    // @Column(name = "BAORDS_OrderSourceCode", nullable = true)
    public Long getBaordsOrderSourceCode() {
        return baordsOrderSourceCode;
    }

    public void setBaordsOrderSourceCode(Long baordsOrderSourceCode) {
        this.baordsOrderSourceCode = baordsOrderSourceCode;
    }

    // @Basic
    // @Column(name = "BASHPS_ShippingSourceCode", nullable = true)
    public Long getBashpsShippingSourceCode() {
        return bashpsShippingSourceCode;
    }

    public void setBashpsShippingSourceCode(Long bashpsShippingSourceCode) {
        this.bashpsShippingSourceCode = bashpsShippingSourceCode;
    }

    // @Basic
    // @Column(name = "BAOTYP_OrderTypeCode", nullable = true)
    public Long getBaotypOrderTypeCode() {
        return baotypOrderTypeCode;
    }

    public void setBaotypOrderTypeCode(Long baotypOrderTypeCode) {
        this.baotypOrderTypeCode = baotypOrderTypeCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoadjpBonusAdjustmentFile that = (BoadjpBonusAdjustmentFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bapyrProcessingYear != null ? !bapyrProcessingYear.equals(that.bapyrProcessingYear) : that.bapyrProcessingYear != null)
            return false;
        if (bapmoProcessingMonth != null ? !bapmoProcessingMonth.equals(that.bapmoProcessingMonth) : that.bapmoProcessingMonth != null)
            return false;
        if (bactlDistributorControl != null ? !bactlDistributorControl.equals(that.bactlDistributorControl) : that.bactlDistributorControl != null)
            return false;
        if (baordOrderNumber != null ? !baordOrderNumber.equals(that.baordOrderNumber) : that.baordOrderNumber != null)
            return false;
        if (baetypErrorType != null ? !baetypErrorType.equals(that.baetypErrorType) : that.baetypErrorType != null)
            return false;
        if (baecdeErrorCode != null ? !baecdeErrorCode.equals(that.baecdeErrorCode) : that.baecdeErrorCode != null)
            return false;
        if (baeamtErrorAmount != null ? !baeamtErrorAmount.equals(that.baeamtErrorAmount) : that.baeamtErrorAmount != null)
            return false;
        if (batccrCaseCreditAdjustment != null ? !batccrCaseCreditAdjustment.equals(that.batccrCaseCreditAdjustment) : that.batccrCaseCreditAdjustment != null)
            return false;
        if (bafmoAdjustForMonth != null ? !bafmoAdjustForMonth.equals(that.bafmoAdjustForMonth) : that.bafmoAdjustForMonth != null)
            return false;
        if (bafyrAdjustForYear != null ? !bafyrAdjustForYear.equals(that.bafyrAdjustForYear) : that.bafyrAdjustForYear != null)
            return false;
        if (barevReverseYorN != null ? !barevReverseYorN.equals(that.barevReverseYorN) : that.barevReverseYorN != null)
            return false;
        if (bacdatLastChangeDate != null ? !bacdatLastChangeDate.equals(that.bacdatLastChangeDate) : that.bacdatLastChangeDate != null)
            return false;
        if (bacusrLastChangeUser != null ? !bacusrLastChangeUser.equals(that.bacusrLastChangeUser) : that.bacusrLastChangeUser != null)
            return false;
        if (bacoidCompanyId != null ? !bacoidCompanyId.equals(that.bacoidCompanyId) : that.bacoidCompanyId != null)
            return false;
        if (baordsOrderSourceCode != null ? !baordsOrderSourceCode.equals(that.baordsOrderSourceCode) : that.baordsOrderSourceCode != null)
            return false;
        if (bashpsShippingSourceCode != null ? !bashpsShippingSourceCode.equals(that.bashpsShippingSourceCode) : that.bashpsShippingSourceCode != null)
            return false;
        if (baotypOrderTypeCode != null ? !baotypOrderTypeCode.equals(that.baotypOrderTypeCode) : that.baotypOrderTypeCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bapyrProcessingYear != null ? bapyrProcessingYear.hashCode() : 0);
        result = 31 * result + (bapmoProcessingMonth != null ? bapmoProcessingMonth.hashCode() : 0);
        result = 31 * result + (bactlDistributorControl != null ? bactlDistributorControl.hashCode() : 0);
        result = 31 * result + (baordOrderNumber != null ? baordOrderNumber.hashCode() : 0);
        result = 31 * result + (baetypErrorType != null ? baetypErrorType.hashCode() : 0);
        result = 31 * result + (baecdeErrorCode != null ? baecdeErrorCode.hashCode() : 0);
        result = 31 * result + (baeamtErrorAmount != null ? baeamtErrorAmount.hashCode() : 0);
        result = 31 * result + (batccrCaseCreditAdjustment != null ? batccrCaseCreditAdjustment.hashCode() : 0);
        result = 31 * result + (bafmoAdjustForMonth != null ? bafmoAdjustForMonth.hashCode() : 0);
        result = 31 * result + (bafyrAdjustForYear != null ? bafyrAdjustForYear.hashCode() : 0);
        result = 31 * result + (barevReverseYorN != null ? barevReverseYorN.hashCode() : 0);
        result = 31 * result + (bacdatLastChangeDate != null ? bacdatLastChangeDate.hashCode() : 0);
        result = 31 * result + (bacusrLastChangeUser != null ? bacusrLastChangeUser.hashCode() : 0);
        result = 31 * result + (bacoidCompanyId != null ? bacoidCompanyId.hashCode() : 0);
        result = 31 * result + (baordsOrderSourceCode != null ? baordsOrderSourceCode.hashCode() : 0);
        result = 31 * result + (bashpsShippingSourceCode != null ? bashpsShippingSourceCode.hashCode() : 0);
        result = 31 * result + (baotypOrderTypeCode != null ? baotypOrderTypeCode.hashCode() : 0);
        return result;
    }


    public BoadjpBonusAdjustmentFile copy() {
        BoadjpBonusAdjustmentFile boadjpBonusAdjustmentFile = new BoadjpBonusAdjustmentFile();
        boadjpBonusAdjustmentFile.setBapyrProcessingYear(bapyrProcessingYear);
        boadjpBonusAdjustmentFile.setBapmoProcessingMonth(bapmoProcessingMonth);
        boadjpBonusAdjustmentFile.setBactlDistributorControl(bactlDistributorControl);
        boadjpBonusAdjustmentFile.setBaordOrderNumber(baordOrderNumber);
        boadjpBonusAdjustmentFile.setBaetypErrorType(baetypErrorType);
        boadjpBonusAdjustmentFile.setBaecdeErrorCode(baecdeErrorCode);
        boadjpBonusAdjustmentFile.setBaeamtErrorAmount(baeamtErrorAmount);
        boadjpBonusAdjustmentFile.setBatccrCaseCreditAdjustment(batccrCaseCreditAdjustment);
        boadjpBonusAdjustmentFile.setBafmoAdjustForMonth(bafmoAdjustForMonth);
        boadjpBonusAdjustmentFile.setBafyrAdjustForYear(bafyrAdjustForYear);
        boadjpBonusAdjustmentFile.setBarevReverseYorN(barevReverseYorN);
        boadjpBonusAdjustmentFile.setBacdatLastChangeDate(bacdatLastChangeDate);
        boadjpBonusAdjustmentFile.setBacusrLastChangeUser(bacusrLastChangeUser);
        boadjpBonusAdjustmentFile.setBacoidCompanyId(bacoidCompanyId);
        boadjpBonusAdjustmentFile.setBaordsOrderSourceCode(baordsOrderSourceCode);
        boadjpBonusAdjustmentFile.setBashpsShippingSourceCode(bashpsShippingSourceCode);
        boadjpBonusAdjustmentFile.setBaotypOrderTypeCode(baotypOrderTypeCode);
        return boadjpBonusAdjustmentFile;
    }

    @Override
    public String toString() {
        return "{\"BoadjpBonusAdjustmentFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"bapyrProcessingYear\":\"" + bapyrProcessingYear + "\""
                + ",                         \"bapmoProcessingMonth\":\"" + bapmoProcessingMonth + "\""
                + ",                         \"bactlDistributorControl\":\"" + bactlDistributorControl + "\""
                + ",                         \"baordOrderNumber\":\"" + baordOrderNumber + "\""
                + ",                         \"baetypErrorType\":\"" + baetypErrorType + "\""
                + ",                         \"baecdeErrorCode\":\"" + baecdeErrorCode + "\""
                + ",                         \"baeamtErrorAmount\":\"" + baeamtErrorAmount + "\""
                + ",                         \"batccrCaseCreditAdjustment\":\"" + batccrCaseCreditAdjustment + "\""
                + ",                         \"bafmoAdjustForMonth\":\"" + bafmoAdjustForMonth + "\""
                + ",                         \"bafyrAdjustForYear\":\"" + bafyrAdjustForYear + "\""
                + ",                         \"barevReverseYorN\":\"" + barevReverseYorN + "\""
                + ",                         \"bacdatLastChangeDate\":\"" + bacdatLastChangeDate + "\""
                + ",                         \"bacusrLastChangeUser\":\"" + bacusrLastChangeUser + "\""
                + ",                         \"bacoidCompanyId\":\"" + bacoidCompanyId + "\""
                + ",                         \"baordsOrderSourceCode\":\"" + baordsOrderSourceCode + "\""
                + ",                         \"bashpsShippingSourceCode\":\"" + bashpsShippingSourceCode + "\""
                + ",                         \"baotypOrderTypeCode\":\"" + baotypOrderTypeCode + "\""
                + "}}";
    }
}
