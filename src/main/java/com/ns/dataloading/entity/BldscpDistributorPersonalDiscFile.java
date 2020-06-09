package com.ns.dataloading.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "BLDSCP_DistributorPersonalDiscFile")
//@RedisHash("BLDSCP_DistributorPersonalDiscFile")

public class BldscpDistributorPersonalDiscFile {
    private Long id;
    private Integer ldpyrProcessingYear;
    private Integer ldpmoProcessingMonth;
    private Long ldctlDistributorControl;
    private Long ldordOrderNumber;
    private BigDecimal lderndEarnedDiscount;
    private BigDecimal ldapldAppliedDiscount;
    private BigDecimal ldadldAdditionalDiscount;
    private BigDecimal ldrfdaNdpRefundOrCorr;
    private BigDecimal ldovraNdpOverPayment;
    private BigDecimal ldudraNdpUnderPayment;
    private Long ldordsOrderSourceCode;
    private Long ldshpsShippingSourceCode;
    private Long ldotypOrderTypeCode;
    private String ldatspAddProcessTimeStamp;
    private String ldausrLastChangeUser;
    private String ldmtspProcessTimeStamp;
    private String ldmusrLastChangeUser;
    private String ldpflgProcessFlag;

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
    @Column(name = "LDPYR_ProcessingYear", nullable = true)
    public Integer getLdpyrProcessingYear() {
        return ldpyrProcessingYear;
    }

    public void setLdpyrProcessingYear(Integer ldpyrProcessingYear) {
        this.ldpyrProcessingYear = ldpyrProcessingYear;
    }

    @Basic
    @Column(name = "LDPMO_ProcessingMonth", nullable = true)
    public Integer getLdpmoProcessingMonth() {
        return ldpmoProcessingMonth;
    }

    public void setLdpmoProcessingMonth(Integer ldpmoProcessingMonth) {
        this.ldpmoProcessingMonth = ldpmoProcessingMonth;
    }

    @Basic
    @Column(name = "LDCTL_DistributorControl", nullable = true)
    public Long getLdctlDistributorControl() {
        return ldctlDistributorControl;
    }

    public void setLdctlDistributorControl(Long ldctlDistributorControl) {
        this.ldctlDistributorControl = ldctlDistributorControl;
    }

    @Basic
    @Column(name = "LDORD_OrderNumber", nullable = true)
    public Long getLdordOrderNumber() {
        return ldordOrderNumber;
    }

    public void setLdordOrderNumber(Long ldordOrderNumber) {
        this.ldordOrderNumber = ldordOrderNumber;
    }

    @Basic
    @Column(name = "LDERND_EarnedDiscount", nullable = true, precision = 3)
    public BigDecimal getLderndEarnedDiscount() {
        return lderndEarnedDiscount;
    }

    public void setLderndEarnedDiscount(BigDecimal lderndEarnedDiscount) {
        this.lderndEarnedDiscount = lderndEarnedDiscount;
    }

    @Basic
    @Column(name = "LDAPLD_AppliedDiscount", nullable = true, precision = 3)
    public BigDecimal getLdapldAppliedDiscount() {
        return ldapldAppliedDiscount;
    }

    public void setLdapldAppliedDiscount(BigDecimal ldapldAppliedDiscount) {
        this.ldapldAppliedDiscount = ldapldAppliedDiscount;
    }

    @Basic
    @Column(name = "LDADLD_AdditionalDiscount", nullable = true, precision = 3)
    public BigDecimal getLdadldAdditionalDiscount() {
        return ldadldAdditionalDiscount;
    }

    public void setLdadldAdditionalDiscount(BigDecimal ldadldAdditionalDiscount) {
        this.ldadldAdditionalDiscount = ldadldAdditionalDiscount;
    }

    @Basic
    @Column(name = "LDRFDA_NdpRefundOrCorr", nullable = true, precision = 3)
    public BigDecimal getLdrfdaNdpRefundOrCorr() {
        return ldrfdaNdpRefundOrCorr;
    }

    public void setLdrfdaNdpRefundOrCorr(BigDecimal ldrfdaNdpRefundOrCorr) {
        this.ldrfdaNdpRefundOrCorr = ldrfdaNdpRefundOrCorr;
    }

    @Basic
    @Column(name = "LDOVRA_NdpOverPayment", nullable = true, precision = 3)
    public BigDecimal getLdovraNdpOverPayment() {
        return ldovraNdpOverPayment;
    }

    public void setLdovraNdpOverPayment(BigDecimal ldovraNdpOverPayment) {
        this.ldovraNdpOverPayment = ldovraNdpOverPayment;
    }

    @Basic
    @Column(name = "LDUDRA_NdpUnderPayment", nullable = true, precision = 3)
    public BigDecimal getLdudraNdpUnderPayment() {
        return ldudraNdpUnderPayment;
    }

    public void setLdudraNdpUnderPayment(BigDecimal ldudraNdpUnderPayment) {
        this.ldudraNdpUnderPayment = ldudraNdpUnderPayment;
    }

    @Basic
    @Column(name = "LDORDS_OrderSourceCode", nullable = true)
    public Long getLdordsOrderSourceCode() {
        return ldordsOrderSourceCode;
    }

    public void setLdordsOrderSourceCode(Long ldordsOrderSourceCode) {
        this.ldordsOrderSourceCode = ldordsOrderSourceCode;
    }

    @Basic
    @Column(name = "LDSHPS_ShippingSourceCode", nullable = true)
    public Long getLdshpsShippingSourceCode() {
        return ldshpsShippingSourceCode;
    }

    public void setLdshpsShippingSourceCode(Long ldshpsShippingSourceCode) {
        this.ldshpsShippingSourceCode = ldshpsShippingSourceCode;
    }

    @Basic
    @Column(name = "LDOTYP_OrderTypeCode", nullable = true)
    public Long getLdotypOrderTypeCode() {
        return ldotypOrderTypeCode;
    }

    public void setLdotypOrderTypeCode(Long ldotypOrderTypeCode) {
        this.ldotypOrderTypeCode = ldotypOrderTypeCode;
    }

    @Basic
    @Column(name = "LDATSP_AddProcessTimeStamp", nullable = true, length = 255)
    public String getLdatspAddProcessTimeStamp() {
        return ldatspAddProcessTimeStamp;
    }

    public void setLdatspAddProcessTimeStamp(String ldatspAddProcessTimeStamp) {
        this.ldatspAddProcessTimeStamp = ldatspAddProcessTimeStamp;
    }

    @Basic
    @Column(name = "LDAUSR_LastChangeUser", nullable = true, length = 255)
    public String getLdausrLastChangeUser() {
        return ldausrLastChangeUser;
    }

    public void setLdausrLastChangeUser(String ldausrLastChangeUser) {
        this.ldausrLastChangeUser = ldausrLastChangeUser;
    }

    @Basic
    @Column(name = "LDMTSP_ProcessTimeStamp", nullable = true, length = 255)
    public String getLdmtspProcessTimeStamp() {
        return ldmtspProcessTimeStamp;
    }

    public void setLdmtspProcessTimeStamp(String ldmtspProcessTimeStamp) {
        this.ldmtspProcessTimeStamp = ldmtspProcessTimeStamp;
    }

    @Basic
    @Column(name = "LDMUSR_LastChangeUser", nullable = true, length = 255)
    public String getLdmusrLastChangeUser() {
        return ldmusrLastChangeUser;
    }

    public void setLdmusrLastChangeUser(String ldmusrLastChangeUser) {
        this.ldmusrLastChangeUser = ldmusrLastChangeUser;
    }

    @Basic
    @Column(name = "LDPFLG_ProcessFlag", nullable = true, length = 1)
    public String getLdpflgProcessFlag() {
        return ldpflgProcessFlag;
    }

    public void setLdpflgProcessFlag(String ldpflgProcessFlag) {
        this.ldpflgProcessFlag = ldpflgProcessFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BldscpDistributorPersonalDiscFile that = (BldscpDistributorPersonalDiscFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ldpyrProcessingYear != null ? !ldpyrProcessingYear.equals(that.ldpyrProcessingYear) : that.ldpyrProcessingYear != null)
            return false;
        if (ldpmoProcessingMonth != null ? !ldpmoProcessingMonth.equals(that.ldpmoProcessingMonth) : that.ldpmoProcessingMonth != null)
            return false;
        if (ldctlDistributorControl != null ? !ldctlDistributorControl.equals(that.ldctlDistributorControl) : that.ldctlDistributorControl != null)
            return false;
        if (ldordOrderNumber != null ? !ldordOrderNumber.equals(that.ldordOrderNumber) : that.ldordOrderNumber != null)
            return false;
        if (lderndEarnedDiscount != null ? !lderndEarnedDiscount.equals(that.lderndEarnedDiscount) : that.lderndEarnedDiscount != null)
            return false;
        if (ldapldAppliedDiscount != null ? !ldapldAppliedDiscount.equals(that.ldapldAppliedDiscount) : that.ldapldAppliedDiscount != null)
            return false;
        if (ldadldAdditionalDiscount != null ? !ldadldAdditionalDiscount.equals(that.ldadldAdditionalDiscount) : that.ldadldAdditionalDiscount != null)
            return false;
        if (ldrfdaNdpRefundOrCorr != null ? !ldrfdaNdpRefundOrCorr.equals(that.ldrfdaNdpRefundOrCorr) : that.ldrfdaNdpRefundOrCorr != null)
            return false;
        if (ldovraNdpOverPayment != null ? !ldovraNdpOverPayment.equals(that.ldovraNdpOverPayment) : that.ldovraNdpOverPayment != null)
            return false;
        if (ldudraNdpUnderPayment != null ? !ldudraNdpUnderPayment.equals(that.ldudraNdpUnderPayment) : that.ldudraNdpUnderPayment != null)
            return false;
        if (ldordsOrderSourceCode != null ? !ldordsOrderSourceCode.equals(that.ldordsOrderSourceCode) : that.ldordsOrderSourceCode != null)
            return false;
        if (ldshpsShippingSourceCode != null ? !ldshpsShippingSourceCode.equals(that.ldshpsShippingSourceCode) : that.ldshpsShippingSourceCode != null)
            return false;
        if (ldotypOrderTypeCode != null ? !ldotypOrderTypeCode.equals(that.ldotypOrderTypeCode) : that.ldotypOrderTypeCode != null)
            return false;
        if (ldatspAddProcessTimeStamp != null ? !ldatspAddProcessTimeStamp.equals(that.ldatspAddProcessTimeStamp) : that.ldatspAddProcessTimeStamp != null)
            return false;
        if (ldausrLastChangeUser != null ? !ldausrLastChangeUser.equals(that.ldausrLastChangeUser) : that.ldausrLastChangeUser != null)
            return false;
        if (ldmtspProcessTimeStamp != null ? !ldmtspProcessTimeStamp.equals(that.ldmtspProcessTimeStamp) : that.ldmtspProcessTimeStamp != null)
            return false;
        if (ldmusrLastChangeUser != null ? !ldmusrLastChangeUser.equals(that.ldmusrLastChangeUser) : that.ldmusrLastChangeUser != null)
            return false;
        if (ldpflgProcessFlag != null ? !ldpflgProcessFlag.equals(that.ldpflgProcessFlag) : that.ldpflgProcessFlag != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ldpyrProcessingYear != null ? ldpyrProcessingYear.hashCode() : 0);
        result = 31 * result + (ldpmoProcessingMonth != null ? ldpmoProcessingMonth.hashCode() : 0);
        result = 31 * result + (ldctlDistributorControl != null ? ldctlDistributorControl.hashCode() : 0);
        result = 31 * result + (ldordOrderNumber != null ? ldordOrderNumber.hashCode() : 0);
        result = 31 * result + (lderndEarnedDiscount != null ? lderndEarnedDiscount.hashCode() : 0);
        result = 31 * result + (ldapldAppliedDiscount != null ? ldapldAppliedDiscount.hashCode() : 0);
        result = 31 * result + (ldadldAdditionalDiscount != null ? ldadldAdditionalDiscount.hashCode() : 0);
        result = 31 * result + (ldrfdaNdpRefundOrCorr != null ? ldrfdaNdpRefundOrCorr.hashCode() : 0);
        result = 31 * result + (ldovraNdpOverPayment != null ? ldovraNdpOverPayment.hashCode() : 0);
        result = 31 * result + (ldudraNdpUnderPayment != null ? ldudraNdpUnderPayment.hashCode() : 0);
        result = 31 * result + (ldordsOrderSourceCode != null ? ldordsOrderSourceCode.hashCode() : 0);
        result = 31 * result + (ldshpsShippingSourceCode != null ? ldshpsShippingSourceCode.hashCode() : 0);
        result = 31 * result + (ldotypOrderTypeCode != null ? ldotypOrderTypeCode.hashCode() : 0);
        result = 31 * result + (ldatspAddProcessTimeStamp != null ? ldatspAddProcessTimeStamp.hashCode() : 0);
        result = 31 * result + (ldausrLastChangeUser != null ? ldausrLastChangeUser.hashCode() : 0);
        result = 31 * result + (ldmtspProcessTimeStamp != null ? ldmtspProcessTimeStamp.hashCode() : 0);
        result = 31 * result + (ldmusrLastChangeUser != null ? ldmusrLastChangeUser.hashCode() : 0);
        result = 31 * result + (ldpflgProcessFlag != null ? ldpflgProcessFlag.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"BldscpDistributorPersonalDiscFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"ldpyrProcessingYear\":\"" + ldpyrProcessingYear + "\""
                + ",                         \"ldpmoProcessingMonth\":\"" + ldpmoProcessingMonth + "\""
                + ",                         \"ldctlDistributorControl\":\"" + ldctlDistributorControl + "\""
                + ",                         \"ldordOrderNumber\":\"" + ldordOrderNumber + "\""
                + ",                         \"lderndEarnedDiscount\":\"" + lderndEarnedDiscount + "\""
                + ",                         \"ldapldAppliedDiscount\":\"" + ldapldAppliedDiscount + "\""
                + ",                         \"ldadldAdditionalDiscount\":\"" + ldadldAdditionalDiscount + "\""
                + ",                         \"ldrfdaNdpRefundOrCorr\":\"" + ldrfdaNdpRefundOrCorr + "\""
                + ",                         \"ldovraNdpOverPayment\":\"" + ldovraNdpOverPayment + "\""
                + ",                         \"ldudraNdpUnderPayment\":\"" + ldudraNdpUnderPayment + "\""
                + ",                         \"ldordsOrderSourceCode\":\"" + ldordsOrderSourceCode + "\""
                + ",                         \"ldshpsShippingSourceCode\":\"" + ldshpsShippingSourceCode + "\""
                + ",                         \"ldotypOrderTypeCode\":\"" + ldotypOrderTypeCode + "\""
                + ",                         \"ldatspAddProcessTimeStamp\":\"" + ldatspAddProcessTimeStamp + "\""
                + ",                         \"ldausrLastChangeUser\":\"" + ldausrLastChangeUser + "\""
                + ",                         \"ldmtspProcessTimeStamp\":\"" + ldmtspProcessTimeStamp + "\""
                + ",                         \"ldmusrLastChangeUser\":\"" + ldmusrLastChangeUser + "\""
                + ",                         \"ldpflgProcessFlag\":\"" + ldpflgProcessFlag + "\""
                + "}}";
    }
}
