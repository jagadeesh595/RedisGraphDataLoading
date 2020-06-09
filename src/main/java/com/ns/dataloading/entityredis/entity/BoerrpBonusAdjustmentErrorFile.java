package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

@RedisHash("BOERRP_BonusAdjustmentErrorFile")
public class BoerrpBonusAdjustmentErrorFile implements Serializable {
    private Long id;
    private String beetypErrorType;
    private String beecdeErrorCode;
    private String beedscErrorDescription;
    private String be1099IncludeIn1099Flag;
    private String becdatLastChangeDate;
    private String becusrLastChangeUser;
    private Long bebox1099AmountField;
    private String bepostPostToJde;
    private String beactcActivtiyCode;
    private String beadjtAdjustmentType;
    private String bewhtxWithHoldingYOrN;
    private String becodaCodeA;
    private String becodbCodeB;
    private String becodjCodeJ;
    private String bemoneMonetaryYOrN;
    private Integer beadjbAdjustmentBucket;
    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "BEETYP_ErrorType", nullable = true, length = 15)
    public String getBeetypErrorType() {
        return beetypErrorType;
    }

    public void setBeetypErrorType(String beetypErrorType) {
        this.beetypErrorType = beetypErrorType;
    }

    // @Basic
    // @Column(name = "BEECDE_ErrorCode", nullable = true, length = 15)
    public String getBeecdeErrorCode() {
        return beecdeErrorCode;
    }

    public void setBeecdeErrorCode(String beecdeErrorCode) {
        this.beecdeErrorCode = beecdeErrorCode;
    }

    // @Basic
    // @Column(name = "BEEDSC_ErrorDescription", nullable = true, length = 255)
    public String getBeedscErrorDescription() {
        return beedscErrorDescription;
    }

    public void setBeedscErrorDescription(String beedscErrorDescription) {
        this.beedscErrorDescription = beedscErrorDescription;
    }

    // @Basic
    // @Column(name = "BE1099_IncludeIn1099Flag", nullable = true, length = 255)
    public String getBe1099IncludeIn1099Flag() {
        return be1099IncludeIn1099Flag;
    }

    public void setBe1099IncludeIn1099Flag(String be1099IncludeIn1099Flag) {
        this.be1099IncludeIn1099Flag = be1099IncludeIn1099Flag;
    }

    // @Basic
    // @Column(name = "BECDAT_LastChangeDate", nullable = true, length = 15)
    public String getBecdatLastChangeDate() {
        return becdatLastChangeDate;
    }

    public void setBecdatLastChangeDate(String becdatLastChangeDate) {
        this.becdatLastChangeDate = becdatLastChangeDate;
    }

    // @Basic
    // @Column(name = "BECUSR_LastChangeUser", nullable = true, length = 255)
    public String getBecusrLastChangeUser() {
        return becusrLastChangeUser;
    }

    public void setBecusrLastChangeUser(String becusrLastChangeUser) {
        this.becusrLastChangeUser = becusrLastChangeUser;
    }

    // @Basic
    // @Column(name = "BEBOX_1099AmountField", nullable = true)
    public Long getBebox1099AmountField() {
        return bebox1099AmountField;
    }

    public void setBebox1099AmountField(Long bebox1099AmountField) {
        this.bebox1099AmountField = bebox1099AmountField;
    }

    // @Basic
    // @Column(name = "BEPOST_PostToJde", nullable = true, length = 1)
    public String getBepostPostToJde() {
        return bepostPostToJde;
    }

    public void setBepostPostToJde(String bepostPostToJde) {
        this.bepostPostToJde = bepostPostToJde;
    }

    // @Basic
    // @Column(name = "BEACTC_ActivtiyCode", nullable = true, length = 255)
    public String getBeactcActivtiyCode() {
        return beactcActivtiyCode;
    }

    public void setBeactcActivtiyCode(String beactcActivtiyCode) {
        this.beactcActivtiyCode = beactcActivtiyCode;
    }

    // @Basic
    // @Column(name = "BEADJT_AdjustmentType", nullable = true, length = 1)
    public String getBeadjtAdjustmentType() {
        return beadjtAdjustmentType;
    }

    public void setBeadjtAdjustmentType(String beadjtAdjustmentType) {
        this.beadjtAdjustmentType = beadjtAdjustmentType;
    }

    // @Basic
    // @Column(name = "BEWHTX_WithHoldingYOrN", nullable = true, length = 1)
    public String getBewhtxWithHoldingYOrN() {
        return bewhtxWithHoldingYOrN;
    }

    public void setBewhtxWithHoldingYOrN(String bewhtxWithHoldingYOrN) {
        this.bewhtxWithHoldingYOrN = bewhtxWithHoldingYOrN;
    }

    // @Basic
    // @Column(name = "BECODA_CodeA", nullable = true, length = 255)
    public String getBecodaCodeA() {
        return becodaCodeA;
    }

    public void setBecodaCodeA(String becodaCodeA) {
        this.becodaCodeA = becodaCodeA;
    }

    // @Basic
    // @Column(name = "BECODB_CodeB", nullable = true, length = 255)
    public String getBecodbCodeB() {
        return becodbCodeB;
    }

    public void setBecodbCodeB(String becodbCodeB) {
        this.becodbCodeB = becodbCodeB;
    }

    // @Basic
    // @Column(name = "BECODJ_CodeJ", nullable = true, length = 255)
    public String getBecodjCodeJ() {
        return becodjCodeJ;
    }

    public void setBecodjCodeJ(String becodjCodeJ) {
        this.becodjCodeJ = becodjCodeJ;
    }

    // @Basic
    // @Column(name = "BEMONE_MonetaryYOrN", nullable = true, length = 1)
    public String getBemoneMonetaryYOrN() {
        return bemoneMonetaryYOrN;
    }

    public void setBemoneMonetaryYOrN(String bemoneMonetaryYOrN) {
        this.bemoneMonetaryYOrN = bemoneMonetaryYOrN;
    }

    // @Basic
    // @Column(name = "BEADJB_AdjustmentBucket", nullable = true)
    public Integer getBeadjbAdjustmentBucket() {
        return beadjbAdjustmentBucket;
    }

    public void setBeadjbAdjustmentBucket(Integer beadjbAdjustmentBucket) {
        this.beadjbAdjustmentBucket = beadjbAdjustmentBucket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoerrpBonusAdjustmentErrorFile that = (BoerrpBonusAdjustmentErrorFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (beetypErrorType != null ? !beetypErrorType.equals(that.beetypErrorType) : that.beetypErrorType != null)
            return false;
        if (beecdeErrorCode != null ? !beecdeErrorCode.equals(that.beecdeErrorCode) : that.beecdeErrorCode != null)
            return false;
        if (beedscErrorDescription != null ? !beedscErrorDescription.equals(that.beedscErrorDescription) : that.beedscErrorDescription != null)
            return false;
        if (be1099IncludeIn1099Flag != null ? !be1099IncludeIn1099Flag.equals(that.be1099IncludeIn1099Flag) : that.be1099IncludeIn1099Flag != null)
            return false;
        if (becdatLastChangeDate != null ? !becdatLastChangeDate.equals(that.becdatLastChangeDate) : that.becdatLastChangeDate != null)
            return false;
        if (becusrLastChangeUser != null ? !becusrLastChangeUser.equals(that.becusrLastChangeUser) : that.becusrLastChangeUser != null)
            return false;
        if (bebox1099AmountField != null ? !bebox1099AmountField.equals(that.bebox1099AmountField) : that.bebox1099AmountField != null)
            return false;
        if (bepostPostToJde != null ? !bepostPostToJde.equals(that.bepostPostToJde) : that.bepostPostToJde != null)
            return false;
        if (beactcActivtiyCode != null ? !beactcActivtiyCode.equals(that.beactcActivtiyCode) : that.beactcActivtiyCode != null)
            return false;
        if (beadjtAdjustmentType != null ? !beadjtAdjustmentType.equals(that.beadjtAdjustmentType) : that.beadjtAdjustmentType != null)
            return false;
        if (bewhtxWithHoldingYOrN != null ? !bewhtxWithHoldingYOrN.equals(that.bewhtxWithHoldingYOrN) : that.bewhtxWithHoldingYOrN != null)
            return false;
        if (becodaCodeA != null ? !becodaCodeA.equals(that.becodaCodeA) : that.becodaCodeA != null) return false;
        if (becodbCodeB != null ? !becodbCodeB.equals(that.becodbCodeB) : that.becodbCodeB != null) return false;
        if (becodjCodeJ != null ? !becodjCodeJ.equals(that.becodjCodeJ) : that.becodjCodeJ != null) return false;
        if (bemoneMonetaryYOrN != null ? !bemoneMonetaryYOrN.equals(that.bemoneMonetaryYOrN) : that.bemoneMonetaryYOrN != null)
            return false;
        if (beadjbAdjustmentBucket != null ? !beadjbAdjustmentBucket.equals(that.beadjbAdjustmentBucket) : that.beadjbAdjustmentBucket != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (beetypErrorType != null ? beetypErrorType.hashCode() : 0);
        result = 31 * result + (beecdeErrorCode != null ? beecdeErrorCode.hashCode() : 0);
        result = 31 * result + (beedscErrorDescription != null ? beedscErrorDescription.hashCode() : 0);
        result = 31 * result + (be1099IncludeIn1099Flag != null ? be1099IncludeIn1099Flag.hashCode() : 0);
        result = 31 * result + (becdatLastChangeDate != null ? becdatLastChangeDate.hashCode() : 0);
        result = 31 * result + (becusrLastChangeUser != null ? becusrLastChangeUser.hashCode() : 0);
        result = 31 * result + (bebox1099AmountField != null ? bebox1099AmountField.hashCode() : 0);
        result = 31 * result + (bepostPostToJde != null ? bepostPostToJde.hashCode() : 0);
        result = 31 * result + (beactcActivtiyCode != null ? beactcActivtiyCode.hashCode() : 0);
        result = 31 * result + (beadjtAdjustmentType != null ? beadjtAdjustmentType.hashCode() : 0);
        result = 31 * result + (bewhtxWithHoldingYOrN != null ? bewhtxWithHoldingYOrN.hashCode() : 0);
        result = 31 * result + (becodaCodeA != null ? becodaCodeA.hashCode() : 0);
        result = 31 * result + (becodbCodeB != null ? becodbCodeB.hashCode() : 0);
        result = 31 * result + (becodjCodeJ != null ? becodjCodeJ.hashCode() : 0);
        result = 31 * result + (bemoneMonetaryYOrN != null ? bemoneMonetaryYOrN.hashCode() : 0);
        result = 31 * result + (beadjbAdjustmentBucket != null ? beadjbAdjustmentBucket.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"BoerrpBonusAdjustmentErrorFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"beetypErrorType\":\"" + beetypErrorType + "\""
                + ",                         \"beecdeErrorCode\":\"" + beecdeErrorCode + "\""
                + ",                         \"beedscErrorDescription\":\"" + beedscErrorDescription + "\""
                + ",                         \"be1099IncludeIn1099Flag\":\"" + be1099IncludeIn1099Flag + "\""
                + ",                         \"becdatLastChangeDate\":\"" + becdatLastChangeDate + "\""
                + ",                         \"becusrLastChangeUser\":\"" + becusrLastChangeUser + "\""
                + ",                         \"bebox1099AmountField\":\"" + bebox1099AmountField + "\""
                + ",                         \"bepostPostToJde\":\"" + bepostPostToJde + "\""
                + ",                         \"beactcActivtiyCode\":\"" + beactcActivtiyCode + "\""
                + ",                         \"beadjtAdjustmentType\":\"" + beadjtAdjustmentType + "\""
                + ",                         \"bewhtxWithHoldingYOrN\":\"" + bewhtxWithHoldingYOrN + "\""
                + ",                         \"becodaCodeA\":\"" + becodaCodeA + "\""
                + ",                         \"becodbCodeB\":\"" + becodbCodeB + "\""
                + ",                         \"becodjCodeJ\":\"" + becodjCodeJ + "\""
                + ",                         \"bemoneMonetaryYOrN\":\"" + bemoneMonetaryYOrN + "\""
                + ",                         \"beadjbAdjustmentBucket\":\"" + beadjbAdjustmentBucket + "\""
                + "}}";
    }
}
