package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "CSADJP_CashRecieptAdjustments")
public class CsadjpCashRecieptAdjustments {
    private Long id;
    private Integer csapyrProcessYear;
    private Integer csapmoProcessMonth;
    private String csentaEntryDate;
    private Long csaaraWareHouseNumber;
    private Long csaenvEnvelopeNumber;
    private Long csoraOrderNumber;
    private String csacidCompanyCode;
    private Integer cssqaRecordSequence;
    private String csatypAdjustmentType;
    private String csacodAdjustmentCode;
    private BigDecimal csadaTotalAdjusted;
    private String csusraUserid;
    private String cschgaChangeDate;

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
    @Column(name = "CSAPYR_ProcessYear", nullable = true)
    public Integer getCsapyrProcessYear() {
        return csapyrProcessYear;
    }

    public void setCsapyrProcessYear(Integer csapyrProcessYear) {
        this.csapyrProcessYear = csapyrProcessYear;
    }

    @Basic
    @Column(name = "CSAPMO_ProcessMonth", nullable = true)
    public Integer getCsapmoProcessMonth() {
        return csapmoProcessMonth;
    }

    public void setCsapmoProcessMonth(Integer csapmoProcessMonth) {
        this.csapmoProcessMonth = csapmoProcessMonth;
    }

    @Basic
    @Column(name = "CSENTA_EntryDate", nullable = true, length = 15)
    public String getCsentaEntryDate() {
        return csentaEntryDate;
    }

    public void setCsentaEntryDate(String csentaEntryDate) {
        this.csentaEntryDate = csentaEntryDate;
    }

    @Basic
    @Column(name = "CSAARA_WareHouseNumber", nullable = true)
    public Long getCsaaraWareHouseNumber() {
        return csaaraWareHouseNumber;
    }

    public void setCsaaraWareHouseNumber(Long csaaraWareHouseNumber) {
        this.csaaraWareHouseNumber = csaaraWareHouseNumber;
    }

    @Basic
    @Column(name = "CSAENV_EnvelopeNumber", nullable = true)
    public Long getCsaenvEnvelopeNumber() {
        return csaenvEnvelopeNumber;
    }

    public void setCsaenvEnvelopeNumber(Long csaenvEnvelopeNumber) {
        this.csaenvEnvelopeNumber = csaenvEnvelopeNumber;
    }

    @Basic
    @Column(name = "CSORA_OrderNumber", nullable = true)
    public Long getCsoraOrderNumber() {
        return csoraOrderNumber;
    }

    public void setCsoraOrderNumber(Long csoraOrderNumber) {
        this.csoraOrderNumber = csoraOrderNumber;
    }

    @Basic
    @Column(name = "CSACID_CompanyCode", nullable = true, length = 255)
    public String getCsacidCompanyCode() {
        return csacidCompanyCode;
    }

    public void setCsacidCompanyCode(String csacidCompanyCode) {
        this.csacidCompanyCode = csacidCompanyCode;
    }

    @Basic
    @Column(name = "CSSQA_RecordSequence", nullable = true)
    public Integer getCssqaRecordSequence() {
        return cssqaRecordSequence;
    }

    public void setCssqaRecordSequence(Integer cssqaRecordSequence) {
        this.cssqaRecordSequence = cssqaRecordSequence;
    }

    @Basic
    @Column(name = "CSATYP_AdjustmentType", nullable = true, length = 3)
    public String getCsatypAdjustmentType() {
        return csatypAdjustmentType;
    }

    public void setCsatypAdjustmentType(String csatypAdjustmentType) {
        this.csatypAdjustmentType = csatypAdjustmentType;
    }

    @Basic
    @Column(name = "CSACOD_AdjustmentCode", nullable = true, length = 5)
    public String getCsacodAdjustmentCode() {
        return csacodAdjustmentCode;
    }

    public void setCsacodAdjustmentCode(String csacodAdjustmentCode) {
        this.csacodAdjustmentCode = csacodAdjustmentCode;
    }

    @Basic
    @Column(name = "CSADA_TotalAdjusted", nullable = true, precision = 3)
    public BigDecimal getCsadaTotalAdjusted() {
        return csadaTotalAdjusted;
    }

    public void setCsadaTotalAdjusted(BigDecimal csadaTotalAdjusted) {
        this.csadaTotalAdjusted = csadaTotalAdjusted;
    }

    @Basic
    @Column(name = "CSUSRA_Userid", nullable = true, length = 255)
    public String getCsusraUserid() {
        return csusraUserid;
    }

    public void setCsusraUserid(String csusraUserid) {
        this.csusraUserid = csusraUserid;
    }

    @Basic
    @Column(name = "CSCHGA_ChangeDate", nullable = true, length = 15)
    public String getCschgaChangeDate() {
        return cschgaChangeDate;
    }

    public void setCschgaChangeDate(String cschgaChangeDate) {
        this.cschgaChangeDate = cschgaChangeDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CsadjpCashRecieptAdjustments that = (CsadjpCashRecieptAdjustments) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (csapyrProcessYear != null ? !csapyrProcessYear.equals(that.csapyrProcessYear) : that.csapyrProcessYear != null)
            return false;
        if (csapmoProcessMonth != null ? !csapmoProcessMonth.equals(that.csapmoProcessMonth) : that.csapmoProcessMonth != null)
            return false;
        if (csentaEntryDate != null ? !csentaEntryDate.equals(that.csentaEntryDate) : that.csentaEntryDate != null)
            return false;
        if (csaaraWareHouseNumber != null ? !csaaraWareHouseNumber.equals(that.csaaraWareHouseNumber) : that.csaaraWareHouseNumber != null)
            return false;
        if (csaenvEnvelopeNumber != null ? !csaenvEnvelopeNumber.equals(that.csaenvEnvelopeNumber) : that.csaenvEnvelopeNumber != null)
            return false;
        if (csoraOrderNumber != null ? !csoraOrderNumber.equals(that.csoraOrderNumber) : that.csoraOrderNumber != null)
            return false;
        if (csacidCompanyCode != null ? !csacidCompanyCode.equals(that.csacidCompanyCode) : that.csacidCompanyCode != null)
            return false;
        if (cssqaRecordSequence != null ? !cssqaRecordSequence.equals(that.cssqaRecordSequence) : that.cssqaRecordSequence != null)
            return false;
        if (csatypAdjustmentType != null ? !csatypAdjustmentType.equals(that.csatypAdjustmentType) : that.csatypAdjustmentType != null)
            return false;
        if (csacodAdjustmentCode != null ? !csacodAdjustmentCode.equals(that.csacodAdjustmentCode) : that.csacodAdjustmentCode != null)
            return false;
        if (csadaTotalAdjusted != null ? !csadaTotalAdjusted.equals(that.csadaTotalAdjusted) : that.csadaTotalAdjusted != null)
            return false;
        if (csusraUserid != null ? !csusraUserid.equals(that.csusraUserid) : that.csusraUserid != null) return false;
        if (cschgaChangeDate != null ? !cschgaChangeDate.equals(that.cschgaChangeDate) : that.cschgaChangeDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (csapyrProcessYear != null ? csapyrProcessYear.hashCode() : 0);
        result = 31 * result + (csapmoProcessMonth != null ? csapmoProcessMonth.hashCode() : 0);
        result = 31 * result + (csentaEntryDate != null ? csentaEntryDate.hashCode() : 0);
        result = 31 * result + (csaaraWareHouseNumber != null ? csaaraWareHouseNumber.hashCode() : 0);
        result = 31 * result + (csaenvEnvelopeNumber != null ? csaenvEnvelopeNumber.hashCode() : 0);
        result = 31 * result + (csoraOrderNumber != null ? csoraOrderNumber.hashCode() : 0);
        result = 31 * result + (csacidCompanyCode != null ? csacidCompanyCode.hashCode() : 0);
        result = 31 * result + (cssqaRecordSequence != null ? cssqaRecordSequence.hashCode() : 0);
        result = 31 * result + (csatypAdjustmentType != null ? csatypAdjustmentType.hashCode() : 0);
        result = 31 * result + (csacodAdjustmentCode != null ? csacodAdjustmentCode.hashCode() : 0);
        result = 31 * result + (csadaTotalAdjusted != null ? csadaTotalAdjusted.hashCode() : 0);
        result = 31 * result + (csusraUserid != null ? csusraUserid.hashCode() : 0);
        result = 31 * result + (cschgaChangeDate != null ? cschgaChangeDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"CsadjpCashRecieptAdjustments\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"csapyrProcessYear\":\"" + csapyrProcessYear + "\""
                + ",                         \"csapmoProcessMonth\":\"" + csapmoProcessMonth + "\""
                + ",                         \"csentaEntryDate\":\"" + csentaEntryDate + "\""
                + ",                         \"csaaraWareHouseNumber\":\"" + csaaraWareHouseNumber + "\""
                + ",                         \"csaenvEnvelopeNumber\":\"" + csaenvEnvelopeNumber + "\""
                + ",                         \"csoraOrderNumber\":\"" + csoraOrderNumber + "\""
                + ",                         \"csacidCompanyCode\":\"" + csacidCompanyCode + "\""
                + ",                         \"cssqaRecordSequence\":\"" + cssqaRecordSequence + "\""
                + ",                         \"csatypAdjustmentType\":\"" + csatypAdjustmentType + "\""
                + ",                         \"csacodAdjustmentCode\":\"" + csacodAdjustmentCode + "\""
                + ",                         \"csadaTotalAdjusted\":\"" + csadaTotalAdjusted + "\""
                + ",                         \"csusraUserid\":\"" + csusraUserid + "\""
                + ",                         \"cschgaChangeDate\":\"" + cschgaChangeDate + "\""
                + "}}";
    }
}
