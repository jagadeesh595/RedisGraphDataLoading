package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ORHSTP")
public class Orhstp {
    private Long id;
    private String ohhscdHistoryCode;
    private Integer ohpyrOrigYearOfOrder;
    private Integer ohpmoOrigMonthOfOrder;
    private Long ohparaOrigPurchasedArea;
    private Long ohenvOrigEnvelopeNumber;
    private Long ohordOrigOrderNumber;
    private Integer onpyrNewYearOfOrder;
    private Integer onpmoNewMonthOfOrder;
    private Long onparaNewPurchasedArea;
    private Long onenvNewEnvelopeNumber;
    private Long onordNewOrderNumber;
    private BigDecimal ohord1ValueOfOrder;
    private BigDecimal ohcshValueOfCash;
    private String ohdateLastChangeDate;
    private String ohuserLastChangeUser;
    private String ohcoidCompanyCode;
    private Long ohctlDistributorControl;
    private String ohodtaOldData;
    private Integer ohseqSequenceNumber;

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
    @Column(name = "OHHSCD_HistoryCode", nullable = true, length = 255)
    public String getOhhscdHistoryCode() {
        return ohhscdHistoryCode;
    }

    public void setOhhscdHistoryCode(String ohhscdHistoryCode) {
        this.ohhscdHistoryCode = ohhscdHistoryCode;
    }

    @Basic
    @Column(name = "OHPYR_OrigYearOfOrder", nullable = true)
    public Integer getOhpyrOrigYearOfOrder() {
        return ohpyrOrigYearOfOrder;
    }

    public void setOhpyrOrigYearOfOrder(Integer ohpyrOrigYearOfOrder) {
        this.ohpyrOrigYearOfOrder = ohpyrOrigYearOfOrder;
    }

    @Basic
    @Column(name = "OHPMO_OrigMonthOfOrder", nullable = true)
    public Integer getOhpmoOrigMonthOfOrder() {
        return ohpmoOrigMonthOfOrder;
    }

    public void setOhpmoOrigMonthOfOrder(Integer ohpmoOrigMonthOfOrder) {
        this.ohpmoOrigMonthOfOrder = ohpmoOrigMonthOfOrder;
    }

    @Basic
    @Column(name = "OHPARA_OrigPurchasedArea", nullable = true)
    public Long getOhparaOrigPurchasedArea() {
        return ohparaOrigPurchasedArea;
    }

    public void setOhparaOrigPurchasedArea(Long ohparaOrigPurchasedArea) {
        this.ohparaOrigPurchasedArea = ohparaOrigPurchasedArea;
    }

    @Basic
    @Column(name = "OHENV_OrigEnvelopeNumber", nullable = true)
    public Long getOhenvOrigEnvelopeNumber() {
        return ohenvOrigEnvelopeNumber;
    }

    public void setOhenvOrigEnvelopeNumber(Long ohenvOrigEnvelopeNumber) {
        this.ohenvOrigEnvelopeNumber = ohenvOrigEnvelopeNumber;
    }

    @Basic
    @Column(name = "OHORD_OrigOrderNumber", nullable = true)
    public Long getOhordOrigOrderNumber() {
        return ohordOrigOrderNumber;
    }

    public void setOhordOrigOrderNumber(Long ohordOrigOrderNumber) {
        this.ohordOrigOrderNumber = ohordOrigOrderNumber;
    }

    @Basic
    @Column(name = "ONPYR_NewYearOfOrder", nullable = true)
    public Integer getOnpyrNewYearOfOrder() {
        return onpyrNewYearOfOrder;
    }

    public void setOnpyrNewYearOfOrder(Integer onpyrNewYearOfOrder) {
        this.onpyrNewYearOfOrder = onpyrNewYearOfOrder;
    }

    @Basic
    @Column(name = "ONPMO_NewMonthOfOrder", nullable = true)
    public Integer getOnpmoNewMonthOfOrder() {
        return onpmoNewMonthOfOrder;
    }

    public void setOnpmoNewMonthOfOrder(Integer onpmoNewMonthOfOrder) {
        this.onpmoNewMonthOfOrder = onpmoNewMonthOfOrder;
    }

    @Basic
    @Column(name = "ONPARA_NewPurchasedArea", nullable = true)
    public Long getOnparaNewPurchasedArea() {
        return onparaNewPurchasedArea;
    }

    public void setOnparaNewPurchasedArea(Long onparaNewPurchasedArea) {
        this.onparaNewPurchasedArea = onparaNewPurchasedArea;
    }

    @Basic
    @Column(name = "ONENV_NewEnvelopeNumber", nullable = true)
    public Long getOnenvNewEnvelopeNumber() {
        return onenvNewEnvelopeNumber;
    }

    public void setOnenvNewEnvelopeNumber(Long onenvNewEnvelopeNumber) {
        this.onenvNewEnvelopeNumber = onenvNewEnvelopeNumber;
    }

    @Basic
    @Column(name = "ONORD_NewOrderNumber", nullable = true)
    public Long getOnordNewOrderNumber() {
        return onordNewOrderNumber;
    }

    public void setOnordNewOrderNumber(Long onordNewOrderNumber) {
        this.onordNewOrderNumber = onordNewOrderNumber;
    }

    @Basic
    @Column(name = "OHORD1_ValueOfOrder", nullable = true, precision = 3)
    public BigDecimal getOhord1ValueOfOrder() {
        return ohord1ValueOfOrder;
    }

    public void setOhord1ValueOfOrder(BigDecimal ohord1ValueOfOrder) {
        this.ohord1ValueOfOrder = ohord1ValueOfOrder;
    }

    @Basic
    @Column(name = "OHCSH_ValueOfCash", nullable = true, precision = 3)
    public BigDecimal getOhcshValueOfCash() {
        return ohcshValueOfCash;
    }

    public void setOhcshValueOfCash(BigDecimal ohcshValueOfCash) {
        this.ohcshValueOfCash = ohcshValueOfCash;
    }

    @Basic
    @Column(name = "OHDATE_LastChangeDate", nullable = true, length = 15)
    public String getOhdateLastChangeDate() {
        return ohdateLastChangeDate;
    }

    public void setOhdateLastChangeDate(String ohdateLastChangeDate) {
        this.ohdateLastChangeDate = ohdateLastChangeDate;
    }

    @Basic
    @Column(name = "OHUSER_LastChangeUser", nullable = true, length = 255)
    public String getOhuserLastChangeUser() {
        return ohuserLastChangeUser;
    }

    public void setOhuserLastChangeUser(String ohuserLastChangeUser) {
        this.ohuserLastChangeUser = ohuserLastChangeUser;
    }

    @Basic
    @Column(name = "OHCOID_CompanyCode", nullable = true, length = 255)
    public String getOhcoidCompanyCode() {
        return ohcoidCompanyCode;
    }

    public void setOhcoidCompanyCode(String ohcoidCompanyCode) {
        this.ohcoidCompanyCode = ohcoidCompanyCode;
    }

    @Basic
    @Column(name = "OHCTL_DistributorControl", nullable = true)
    public Long getOhctlDistributorControl() {
        return ohctlDistributorControl;
    }

    public void setOhctlDistributorControl(Long ohctlDistributorControl) {
        this.ohctlDistributorControl = ohctlDistributorControl;
    }

    @Basic
    @Column(name = "OHODTA_OldData", nullable = true, length = 255)
    public String getOhodtaOldData() {
        return ohodtaOldData;
    }

    public void setOhodtaOldData(String ohodtaOldData) {
        this.ohodtaOldData = ohodtaOldData;
    }

    @Basic
    @Column(name = "OHSEQ_SequenceNumber", nullable = true)
    public Integer getOhseqSequenceNumber() {
        return ohseqSequenceNumber;
    }

    public void setOhseqSequenceNumber(Integer ohseqSequenceNumber) {
        this.ohseqSequenceNumber = ohseqSequenceNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orhstp orhstp = (Orhstp) o;

        if (id != null ? !id.equals(orhstp.id) : orhstp.id != null) return false;
        if (ohhscdHistoryCode != null ? !ohhscdHistoryCode.equals(orhstp.ohhscdHistoryCode) : orhstp.ohhscdHistoryCode != null)
            return false;
        if (ohpyrOrigYearOfOrder != null ? !ohpyrOrigYearOfOrder.equals(orhstp.ohpyrOrigYearOfOrder) : orhstp.ohpyrOrigYearOfOrder != null)
            return false;
        if (ohpmoOrigMonthOfOrder != null ? !ohpmoOrigMonthOfOrder.equals(orhstp.ohpmoOrigMonthOfOrder) : orhstp.ohpmoOrigMonthOfOrder != null)
            return false;
        if (ohparaOrigPurchasedArea != null ? !ohparaOrigPurchasedArea.equals(orhstp.ohparaOrigPurchasedArea) : orhstp.ohparaOrigPurchasedArea != null)
            return false;
        if (ohenvOrigEnvelopeNumber != null ? !ohenvOrigEnvelopeNumber.equals(orhstp.ohenvOrigEnvelopeNumber) : orhstp.ohenvOrigEnvelopeNumber != null)
            return false;
        if (ohordOrigOrderNumber != null ? !ohordOrigOrderNumber.equals(orhstp.ohordOrigOrderNumber) : orhstp.ohordOrigOrderNumber != null)
            return false;
        if (onpyrNewYearOfOrder != null ? !onpyrNewYearOfOrder.equals(orhstp.onpyrNewYearOfOrder) : orhstp.onpyrNewYearOfOrder != null)
            return false;
        if (onpmoNewMonthOfOrder != null ? !onpmoNewMonthOfOrder.equals(orhstp.onpmoNewMonthOfOrder) : orhstp.onpmoNewMonthOfOrder != null)
            return false;
        if (onparaNewPurchasedArea != null ? !onparaNewPurchasedArea.equals(orhstp.onparaNewPurchasedArea) : orhstp.onparaNewPurchasedArea != null)
            return false;
        if (onenvNewEnvelopeNumber != null ? !onenvNewEnvelopeNumber.equals(orhstp.onenvNewEnvelopeNumber) : orhstp.onenvNewEnvelopeNumber != null)
            return false;
        if (onordNewOrderNumber != null ? !onordNewOrderNumber.equals(orhstp.onordNewOrderNumber) : orhstp.onordNewOrderNumber != null)
            return false;
        if (ohord1ValueOfOrder != null ? !ohord1ValueOfOrder.equals(orhstp.ohord1ValueOfOrder) : orhstp.ohord1ValueOfOrder != null)
            return false;
        if (ohcshValueOfCash != null ? !ohcshValueOfCash.equals(orhstp.ohcshValueOfCash) : orhstp.ohcshValueOfCash != null)
            return false;
        if (ohdateLastChangeDate != null ? !ohdateLastChangeDate.equals(orhstp.ohdateLastChangeDate) : orhstp.ohdateLastChangeDate != null)
            return false;
        if (ohuserLastChangeUser != null ? !ohuserLastChangeUser.equals(orhstp.ohuserLastChangeUser) : orhstp.ohuserLastChangeUser != null)
            return false;
        if (ohcoidCompanyCode != null ? !ohcoidCompanyCode.equals(orhstp.ohcoidCompanyCode) : orhstp.ohcoidCompanyCode != null)
            return false;
        if (ohctlDistributorControl != null ? !ohctlDistributorControl.equals(orhstp.ohctlDistributorControl) : orhstp.ohctlDistributorControl != null)
            return false;
        if (ohodtaOldData != null ? !ohodtaOldData.equals(orhstp.ohodtaOldData) : orhstp.ohodtaOldData != null)
            return false;
        if (ohseqSequenceNumber != null ? !ohseqSequenceNumber.equals(orhstp.ohseqSequenceNumber) : orhstp.ohseqSequenceNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ohhscdHistoryCode != null ? ohhscdHistoryCode.hashCode() : 0);
        result = 31 * result + (ohpyrOrigYearOfOrder != null ? ohpyrOrigYearOfOrder.hashCode() : 0);
        result = 31 * result + (ohpmoOrigMonthOfOrder != null ? ohpmoOrigMonthOfOrder.hashCode() : 0);
        result = 31 * result + (ohparaOrigPurchasedArea != null ? ohparaOrigPurchasedArea.hashCode() : 0);
        result = 31 * result + (ohenvOrigEnvelopeNumber != null ? ohenvOrigEnvelopeNumber.hashCode() : 0);
        result = 31 * result + (ohordOrigOrderNumber != null ? ohordOrigOrderNumber.hashCode() : 0);
        result = 31 * result + (onpyrNewYearOfOrder != null ? onpyrNewYearOfOrder.hashCode() : 0);
        result = 31 * result + (onpmoNewMonthOfOrder != null ? onpmoNewMonthOfOrder.hashCode() : 0);
        result = 31 * result + (onparaNewPurchasedArea != null ? onparaNewPurchasedArea.hashCode() : 0);
        result = 31 * result + (onenvNewEnvelopeNumber != null ? onenvNewEnvelopeNumber.hashCode() : 0);
        result = 31 * result + (onordNewOrderNumber != null ? onordNewOrderNumber.hashCode() : 0);
        result = 31 * result + (ohord1ValueOfOrder != null ? ohord1ValueOfOrder.hashCode() : 0);
        result = 31 * result + (ohcshValueOfCash != null ? ohcshValueOfCash.hashCode() : 0);
        result = 31 * result + (ohdateLastChangeDate != null ? ohdateLastChangeDate.hashCode() : 0);
        result = 31 * result + (ohuserLastChangeUser != null ? ohuserLastChangeUser.hashCode() : 0);
        result = 31 * result + (ohcoidCompanyCode != null ? ohcoidCompanyCode.hashCode() : 0);
        result = 31 * result + (ohctlDistributorControl != null ? ohctlDistributorControl.hashCode() : 0);
        result = 31 * result + (ohodtaOldData != null ? ohodtaOldData.hashCode() : 0);
        result = 31 * result + (ohseqSequenceNumber != null ? ohseqSequenceNumber.hashCode() : 0);
        return result;
    }

    public Orhstp() {
        this.ohhscdHistoryCode = "";
        this.ohpyrOrigYearOfOrder = 0;
        this.ohpmoOrigMonthOfOrder = 0;
        this.ohparaOrigPurchasedArea = 0L;
        this.ohenvOrigEnvelopeNumber = 0L;
        this.ohordOrigOrderNumber = 0L;
        this.onpyrNewYearOfOrder = 0;
        this.onpmoNewMonthOfOrder = 0;
        this.onparaNewPurchasedArea = 0L;
        this.onenvNewEnvelopeNumber = 0L;
        this.onordNewOrderNumber = 0L;
        this.ohord1ValueOfOrder = BigDecimal.ZERO;
        this.ohcshValueOfCash = BigDecimal.ZERO;
        this.ohdateLastChangeDate = "";
        this.ohuserLastChangeUser = "";
        this.ohcoidCompanyCode = "";
        this.ohctlDistributorControl = 0L;
        this.ohodtaOldData = "";
        this.ohseqSequenceNumber = 0;
    }

    @Override
    public String toString() {
        return "{\"Orhstp\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"ohhscdHistoryCode\":\"" + ohhscdHistoryCode + "\""
                + ",                         \"ohpyrOrigYearOfOrder\":\"" + ohpyrOrigYearOfOrder + "\""
                + ",                         \"ohpmoOrigMonthOfOrder\":\"" + ohpmoOrigMonthOfOrder + "\""
                + ",                         \"ohparaOrigPurchasedArea\":\"" + ohparaOrigPurchasedArea + "\""
                + ",                         \"ohenvOrigEnvelopeNumber\":\"" + ohenvOrigEnvelopeNumber + "\""
                + ",                         \"ohordOrigOrderNumber\":\"" + ohordOrigOrderNumber + "\""
                + ",                         \"onpyrNewYearOfOrder\":\"" + onpyrNewYearOfOrder + "\""
                + ",                         \"onpmoNewMonthOfOrder\":\"" + onpmoNewMonthOfOrder + "\""
                + ",                         \"onparaNewPurchasedArea\":\"" + onparaNewPurchasedArea + "\""
                + ",                         \"onenvNewEnvelopeNumber\":\"" + onenvNewEnvelopeNumber + "\""
                + ",                         \"onordNewOrderNumber\":\"" + onordNewOrderNumber + "\""
                + ",                         \"ohord1ValueOfOrder\":\"" + ohord1ValueOfOrder + "\""
                + ",                         \"ohcshValueOfCash\":\"" + ohcshValueOfCash + "\""
                + ",                         \"ohdateLastChangeDate\":\"" + ohdateLastChangeDate + "\""
                + ",                         \"ohuserLastChangeUser\":\"" + ohuserLastChangeUser + "\""
                + ",                         \"ohcoidCompanyCode\":\"" + ohcoidCompanyCode + "\""
                + ",                         \"ohctlDistributorControl\":\"" + ohctlDistributorControl + "\""
                + ",                         \"ohodtaOldData\":\"" + ohodtaOldData + "\""
                + ",                         \"ohseqSequenceNumber\":\"" + ohseqSequenceNumber + "\""
                + "}}";
    }
}
