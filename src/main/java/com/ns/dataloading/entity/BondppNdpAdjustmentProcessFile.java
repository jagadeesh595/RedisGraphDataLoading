package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "BONDPP_NDPAdjustmentProcessFile")
public class BondppNdpAdjustmentProcessFile {
    private Long id;
    private Integer bnpyrProcessingYear;
    private Integer bnpmoProcessingMonth;
    private Long bnordOrderNumber;
    private String bncoidCompanyId;
    private Long bnctlPayeeControl;
    private Long bnpurOrderControl;
    private String bnatypAdjType;
    private String bnacdeAdjCode;
    private BigDecimal bnadjaAdjAmount;
    private BigDecimal bnwhsaWhsAmount;
    private BigDecimal bnndpaNdpAmount;
    private BigDecimal bnsrpaSrpAmount;
    private String bnstscStatusCode;
    private String bnttypTransactionType;
    private String bnptypProcessType;
    private String bncrtcCreatedCycle;
    private String bncdatCreatedDate;
    private String bnpidcPaidCycle;
    private String bnpdatPaidDate;
    private String bnref1AlphaRef1;
    private String bnref2AlphaRef2;
    private Long bnref3NumericRef;
    private String bnmdatMaintainedDate;
    private String bncusrLastChangeUser;
    private Long bnordsOrderSourceCode;
    private Long bnshpsShippingSourceCode;
    private Long bnotypOrderTypeCode;

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
    @Column(name = "BNPYR_ProcessingYear", nullable = true)
    public Integer getBnpyrProcessingYear() {
        return bnpyrProcessingYear;
    }

    public void setBnpyrProcessingYear(Integer bnpyrProcessingYear) {
        this.bnpyrProcessingYear = bnpyrProcessingYear;
    }

    @Basic
    @Column(name = "BNPMO_ProcessingMonth", nullable = true)
    public Integer getBnpmoProcessingMonth() {
        return bnpmoProcessingMonth;
    }

    public void setBnpmoProcessingMonth(Integer bnpmoProcessingMonth) {
        this.bnpmoProcessingMonth = bnpmoProcessingMonth;
    }

    @Basic
    @Column(name = "BNORD_OrderNumber", nullable = true)
    public Long getBnordOrderNumber() {
        return bnordOrderNumber;
    }

    public void setBnordOrderNumber(Long bnordOrderNumber) {
        this.bnordOrderNumber = bnordOrderNumber;
    }

    @Basic
    @Column(name = "BNCOID_CompanyId", nullable = true, length = 255)
    public String getBncoidCompanyId() {
        return bncoidCompanyId;
    }

    public void setBncoidCompanyId(String bncoidCompanyId) {
        this.bncoidCompanyId = bncoidCompanyId;
    }

    @Basic
    @Column(name = "BNCTL_PayeeControl", nullable = true)
    public Long getBnctlPayeeControl() {
        return bnctlPayeeControl;
    }

    public void setBnctlPayeeControl(Long bnctlPayeeControl) {
        this.bnctlPayeeControl = bnctlPayeeControl;
    }

    @Basic
    @Column(name = "BNPUR_OrderControl", nullable = true)
    public Long getBnpurOrderControl() {
        return bnpurOrderControl;
    }

    public void setBnpurOrderControl(Long bnpurOrderControl) {
        this.bnpurOrderControl = bnpurOrderControl;
    }

    @Basic
    @Column(name = "BNATYP_AdjType", nullable = true, length = 255)
    public String getBnatypAdjType() {
        return bnatypAdjType;
    }

    public void setBnatypAdjType(String bnatypAdjType) {
        this.bnatypAdjType = bnatypAdjType;
    }

    @Basic
    @Column(name = "BNACDE_AdjCode", nullable = true, length = 255)
    public String getBnacdeAdjCode() {
        return bnacdeAdjCode;
    }

    public void setBnacdeAdjCode(String bnacdeAdjCode) {
        this.bnacdeAdjCode = bnacdeAdjCode;
    }

    @Basic
    @Column(name = "BNADJA_AdjAmount", nullable = true, precision = 3)
    public BigDecimal getBnadjaAdjAmount() {
        return bnadjaAdjAmount;
    }

    public void setBnadjaAdjAmount(BigDecimal bnadjaAdjAmount) {
        this.bnadjaAdjAmount = bnadjaAdjAmount;
    }

    @Basic
    @Column(name = "BNWHSA_WHSAmount", nullable = true, precision = 3)
    public BigDecimal getBnwhsaWhsAmount() {
        return bnwhsaWhsAmount;
    }

    public void setBnwhsaWhsAmount(BigDecimal bnwhsaWhsAmount) {
        this.bnwhsaWhsAmount = bnwhsaWhsAmount;
    }

    @Basic
    @Column(name = "BNNDPA_NdpAmount", nullable = true, precision = 3)
    public BigDecimal getBnndpaNdpAmount() {
        return bnndpaNdpAmount;
    }

    public void setBnndpaNdpAmount(BigDecimal bnndpaNdpAmount) {
        this.bnndpaNdpAmount = bnndpaNdpAmount;
    }

    @Basic
    @Column(name = "BNSRPA_SRPAmount", nullable = true, precision = 3)
    public BigDecimal getBnsrpaSrpAmount() {
        return bnsrpaSrpAmount;
    }

    public void setBnsrpaSrpAmount(BigDecimal bnsrpaSrpAmount) {
        this.bnsrpaSrpAmount = bnsrpaSrpAmount;
    }

    @Basic
    @Column(name = "BNSTSC_StatusCode", nullable = true, length = 1)
    public String getBnstscStatusCode() {
        return bnstscStatusCode;
    }

    public void setBnstscStatusCode(String bnstscStatusCode) {
        this.bnstscStatusCode = bnstscStatusCode;
    }

    @Basic
    @Column(name = "BNTTYP_TransactionType", nullable = true, length = 1)
    public String getBnttypTransactionType() {
        return bnttypTransactionType;
    }

    public void setBnttypTransactionType(String bnttypTransactionType) {
        this.bnttypTransactionType = bnttypTransactionType;
    }

    @Basic
    @Column(name = "BNPTYP_ProcessType", nullable = true, length = 1)
    public String getBnptypProcessType() {
        return bnptypProcessType;
    }

    public void setBnptypProcessType(String bnptypProcessType) {
        this.bnptypProcessType = bnptypProcessType;
    }

    @Basic
    @Column(name = "BNCRTC_CreatedCycle", nullable = true, length = 1)
    public String getBncrtcCreatedCycle() {
        return bncrtcCreatedCycle;
    }

    public void setBncrtcCreatedCycle(String bncrtcCreatedCycle) {
        this.bncrtcCreatedCycle = bncrtcCreatedCycle;
    }

    @Basic
    @Column(name = "BNCDAT_CreatedDate", nullable = true, length = 15)
    public String getBncdatCreatedDate() {
        return bncdatCreatedDate;
    }

    public void setBncdatCreatedDate(String bncdatCreatedDate) {
        this.bncdatCreatedDate = bncdatCreatedDate;
    }

    @Basic
    @Column(name = "BNPIDC_PaidCycle", nullable = true, length = 1)
    public String getBnpidcPaidCycle() {
        return bnpidcPaidCycle;
    }

    public void setBnpidcPaidCycle(String bnpidcPaidCycle) {
        this.bnpidcPaidCycle = bnpidcPaidCycle;
    }

    @Basic
    @Column(name = "BNPDAT_PaidDate", nullable = true, length = 15)
    public String getBnpdatPaidDate() {
        return bnpdatPaidDate;
    }

    public void setBnpdatPaidDate(String bnpdatPaidDate) {
        this.bnpdatPaidDate = bnpdatPaidDate;
    }

    @Basic
    @Column(name = "BNREF1_AlphaRef1", nullable = true, length = 255)
    public String getBnref1AlphaRef1() {
        return bnref1AlphaRef1;
    }

    public void setBnref1AlphaRef1(String bnref1AlphaRef1) {
        this.bnref1AlphaRef1 = bnref1AlphaRef1;
    }

    @Basic
    @Column(name = "BNREF2_AlphaRef2", nullable = true, length = 255)
    public String getBnref2AlphaRef2() {
        return bnref2AlphaRef2;
    }

    public void setBnref2AlphaRef2(String bnref2AlphaRef2) {
        this.bnref2AlphaRef2 = bnref2AlphaRef2;
    }

    @Basic
    @Column(name = "BNREF3_NumericRef", nullable = true)
    public Long getBnref3NumericRef() {
        return bnref3NumericRef;
    }

    public void setBnref3NumericRef(Long bnref3NumericRef) {
        this.bnref3NumericRef = bnref3NumericRef;
    }

    @Basic
    @Column(name = "BNMDAT_MaintainedDate", nullable = true, length = 15)
    public String getBnmdatMaintainedDate() {
        return bnmdatMaintainedDate;
    }

    public void setBnmdatMaintainedDate(String bnmdatMaintainedDate) {
        this.bnmdatMaintainedDate = bnmdatMaintainedDate;
    }

    @Basic
    @Column(name = "BNCUSR_LastChangeUser", nullable = true, length = 255)
    public String getBncusrLastChangeUser() {
        return bncusrLastChangeUser;
    }

    public void setBncusrLastChangeUser(String bncusrLastChangeUser) {
        this.bncusrLastChangeUser = bncusrLastChangeUser;
    }

    @Basic
    @Column(name = "BNORDS_OrderSourceCode", nullable = true)
    public Long getBnordsOrderSourceCode() {
        return bnordsOrderSourceCode;
    }

    public void setBnordsOrderSourceCode(Long bnordsOrderSourceCode) {
        this.bnordsOrderSourceCode = bnordsOrderSourceCode;
    }

    @Basic
    @Column(name = "BNSHPS_ShippingSourceCode", nullable = true)
    public Long getBnshpsShippingSourceCode() {
        return bnshpsShippingSourceCode;
    }

    public void setBnshpsShippingSourceCode(Long bnshpsShippingSourceCode) {
        this.bnshpsShippingSourceCode = bnshpsShippingSourceCode;
    }

    @Basic
    @Column(name = "BNOTYP_OrderTypeCode", nullable = true)
    public Long getBnotypOrderTypeCode() {
        return bnotypOrderTypeCode;
    }

    public void setBnotypOrderTypeCode(Long bnotypOrderTypeCode) {
        this.bnotypOrderTypeCode = bnotypOrderTypeCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BondppNdpAdjustmentProcessFile that = (BondppNdpAdjustmentProcessFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bnpyrProcessingYear != null ? !bnpyrProcessingYear.equals(that.bnpyrProcessingYear) : that.bnpyrProcessingYear != null)
            return false;
        if (bnpmoProcessingMonth != null ? !bnpmoProcessingMonth.equals(that.bnpmoProcessingMonth) : that.bnpmoProcessingMonth != null)
            return false;
        if (bnordOrderNumber != null ? !bnordOrderNumber.equals(that.bnordOrderNumber) : that.bnordOrderNumber != null)
            return false;
        if (bncoidCompanyId != null ? !bncoidCompanyId.equals(that.bncoidCompanyId) : that.bncoidCompanyId != null)
            return false;
        if (bnctlPayeeControl != null ? !bnctlPayeeControl.equals(that.bnctlPayeeControl) : that.bnctlPayeeControl != null)
            return false;
        if (bnpurOrderControl != null ? !bnpurOrderControl.equals(that.bnpurOrderControl) : that.bnpurOrderControl != null)
            return false;
        if (bnatypAdjType != null ? !bnatypAdjType.equals(that.bnatypAdjType) : that.bnatypAdjType != null)
            return false;
        if (bnacdeAdjCode != null ? !bnacdeAdjCode.equals(that.bnacdeAdjCode) : that.bnacdeAdjCode != null)
            return false;
        if (bnadjaAdjAmount != null ? !bnadjaAdjAmount.equals(that.bnadjaAdjAmount) : that.bnadjaAdjAmount != null)
            return false;
        if (bnwhsaWhsAmount != null ? !bnwhsaWhsAmount.equals(that.bnwhsaWhsAmount) : that.bnwhsaWhsAmount != null)
            return false;
        if (bnndpaNdpAmount != null ? !bnndpaNdpAmount.equals(that.bnndpaNdpAmount) : that.bnndpaNdpAmount != null)
            return false;
        if (bnsrpaSrpAmount != null ? !bnsrpaSrpAmount.equals(that.bnsrpaSrpAmount) : that.bnsrpaSrpAmount != null)
            return false;
        if (bnstscStatusCode != null ? !bnstscStatusCode.equals(that.bnstscStatusCode) : that.bnstscStatusCode != null)
            return false;
        if (bnttypTransactionType != null ? !bnttypTransactionType.equals(that.bnttypTransactionType) : that.bnttypTransactionType != null)
            return false;
        if (bnptypProcessType != null ? !bnptypProcessType.equals(that.bnptypProcessType) : that.bnptypProcessType != null)
            return false;
        if (bncrtcCreatedCycle != null ? !bncrtcCreatedCycle.equals(that.bncrtcCreatedCycle) : that.bncrtcCreatedCycle != null)
            return false;
        if (bncdatCreatedDate != null ? !bncdatCreatedDate.equals(that.bncdatCreatedDate) : that.bncdatCreatedDate != null)
            return false;
        if (bnpidcPaidCycle != null ? !bnpidcPaidCycle.equals(that.bnpidcPaidCycle) : that.bnpidcPaidCycle != null)
            return false;
        if (bnpdatPaidDate != null ? !bnpdatPaidDate.equals(that.bnpdatPaidDate) : that.bnpdatPaidDate != null)
            return false;
        if (bnref1AlphaRef1 != null ? !bnref1AlphaRef1.equals(that.bnref1AlphaRef1) : that.bnref1AlphaRef1 != null)
            return false;
        if (bnref2AlphaRef2 != null ? !bnref2AlphaRef2.equals(that.bnref2AlphaRef2) : that.bnref2AlphaRef2 != null)
            return false;
        if (bnref3NumericRef != null ? !bnref3NumericRef.equals(that.bnref3NumericRef) : that.bnref3NumericRef != null)
            return false;
        if (bnmdatMaintainedDate != null ? !bnmdatMaintainedDate.equals(that.bnmdatMaintainedDate) : that.bnmdatMaintainedDate != null)
            return false;
        if (bncusrLastChangeUser != null ? !bncusrLastChangeUser.equals(that.bncusrLastChangeUser) : that.bncusrLastChangeUser != null)
            return false;
        if (bnordsOrderSourceCode != null ? !bnordsOrderSourceCode.equals(that.bnordsOrderSourceCode) : that.bnordsOrderSourceCode != null)
            return false;
        if (bnshpsShippingSourceCode != null ? !bnshpsShippingSourceCode.equals(that.bnshpsShippingSourceCode) : that.bnshpsShippingSourceCode != null)
            return false;
        if (bnotypOrderTypeCode != null ? !bnotypOrderTypeCode.equals(that.bnotypOrderTypeCode) : that.bnotypOrderTypeCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bnpyrProcessingYear != null ? bnpyrProcessingYear.hashCode() : 0);
        result = 31 * result + (bnpmoProcessingMonth != null ? bnpmoProcessingMonth.hashCode() : 0);
        result = 31 * result + (bnordOrderNumber != null ? bnordOrderNumber.hashCode() : 0);
        result = 31 * result + (bncoidCompanyId != null ? bncoidCompanyId.hashCode() : 0);
        result = 31 * result + (bnctlPayeeControl != null ? bnctlPayeeControl.hashCode() : 0);
        result = 31 * result + (bnpurOrderControl != null ? bnpurOrderControl.hashCode() : 0);
        result = 31 * result + (bnatypAdjType != null ? bnatypAdjType.hashCode() : 0);
        result = 31 * result + (bnacdeAdjCode != null ? bnacdeAdjCode.hashCode() : 0);
        result = 31 * result + (bnadjaAdjAmount != null ? bnadjaAdjAmount.hashCode() : 0);
        result = 31 * result + (bnwhsaWhsAmount != null ? bnwhsaWhsAmount.hashCode() : 0);
        result = 31 * result + (bnndpaNdpAmount != null ? bnndpaNdpAmount.hashCode() : 0);
        result = 31 * result + (bnsrpaSrpAmount != null ? bnsrpaSrpAmount.hashCode() : 0);
        result = 31 * result + (bnstscStatusCode != null ? bnstscStatusCode.hashCode() : 0);
        result = 31 * result + (bnttypTransactionType != null ? bnttypTransactionType.hashCode() : 0);
        result = 31 * result + (bnptypProcessType != null ? bnptypProcessType.hashCode() : 0);
        result = 31 * result + (bncrtcCreatedCycle != null ? bncrtcCreatedCycle.hashCode() : 0);
        result = 31 * result + (bncdatCreatedDate != null ? bncdatCreatedDate.hashCode() : 0);
        result = 31 * result + (bnpidcPaidCycle != null ? bnpidcPaidCycle.hashCode() : 0);
        result = 31 * result + (bnpdatPaidDate != null ? bnpdatPaidDate.hashCode() : 0);
        result = 31 * result + (bnref1AlphaRef1 != null ? bnref1AlphaRef1.hashCode() : 0);
        result = 31 * result + (bnref2AlphaRef2 != null ? bnref2AlphaRef2.hashCode() : 0);
        result = 31 * result + (bnref3NumericRef != null ? bnref3NumericRef.hashCode() : 0);
        result = 31 * result + (bnmdatMaintainedDate != null ? bnmdatMaintainedDate.hashCode() : 0);
        result = 31 * result + (bncusrLastChangeUser != null ? bncusrLastChangeUser.hashCode() : 0);
        result = 31 * result + (bnordsOrderSourceCode != null ? bnordsOrderSourceCode.hashCode() : 0);
        result = 31 * result + (bnshpsShippingSourceCode != null ? bnshpsShippingSourceCode.hashCode() : 0);
        result = 31 * result + (bnotypOrderTypeCode != null ? bnotypOrderTypeCode.hashCode() : 0);
        return result;
    }

    public BondppNdpAdjustmentProcessFile copy() {
        BondppNdpAdjustmentProcessFile adjustmentProcessFile = new BondppNdpAdjustmentProcessFile();
        adjustmentProcessFile.setBnpyrProcessingYear(bnpyrProcessingYear);
        adjustmentProcessFile.setBnpmoProcessingMonth(bnpmoProcessingMonth);
        adjustmentProcessFile.setBnordOrderNumber(bnordOrderNumber);
        adjustmentProcessFile.setBncoidCompanyId(bncoidCompanyId);
        adjustmentProcessFile.setBnctlPayeeControl(bnctlPayeeControl);
        adjustmentProcessFile.setBnpurOrderControl(bnpurOrderControl);
        adjustmentProcessFile.setBnatypAdjType(bnatypAdjType);
        adjustmentProcessFile.setBnacdeAdjCode(bnacdeAdjCode);
        adjustmentProcessFile.setBnadjaAdjAmount(bnadjaAdjAmount);
        adjustmentProcessFile.setBnwhsaWhsAmount(bnwhsaWhsAmount);
        adjustmentProcessFile.setBnndpaNdpAmount(bnndpaNdpAmount);
        adjustmentProcessFile.setBnsrpaSrpAmount(bnsrpaSrpAmount);
        adjustmentProcessFile.setBnstscStatusCode(bnstscStatusCode);
        adjustmentProcessFile.setBnttypTransactionType(bnttypTransactionType);
        adjustmentProcessFile.setBnptypProcessType(bnptypProcessType);
        adjustmentProcessFile.setBncrtcCreatedCycle(bncrtcCreatedCycle);
        adjustmentProcessFile.setBncdatCreatedDate(bncdatCreatedDate);
        adjustmentProcessFile.setBnpidcPaidCycle(bnpidcPaidCycle);
        adjustmentProcessFile.setBnpdatPaidDate(bnpdatPaidDate);
        adjustmentProcessFile.setBnref1AlphaRef1(bnref1AlphaRef1);
        adjustmentProcessFile.setBnref2AlphaRef2(bnref2AlphaRef2);
        adjustmentProcessFile.setBnref3NumericRef(bnref3NumericRef);
        adjustmentProcessFile.setBnmdatMaintainedDate(bnmdatMaintainedDate);
        adjustmentProcessFile.setBncusrLastChangeUser(bncusrLastChangeUser);
        adjustmentProcessFile.setBnordsOrderSourceCode(bnordsOrderSourceCode);
        adjustmentProcessFile.setBnshpsShippingSourceCode(bnshpsShippingSourceCode);
        adjustmentProcessFile.setBnotypOrderTypeCode(bnotypOrderTypeCode);
        return adjustmentProcessFile;
    }

    @Override
    public String toString() {
        return "{\"BondppNdpAdjustmentProcessFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"bnpyrProcessingYear\":\"" + bnpyrProcessingYear + "\""
                + ",                         \"bnpmoProcessingMonth\":\"" + bnpmoProcessingMonth + "\""
                + ",                         \"bnordOrderNumber\":\"" + bnordOrderNumber + "\""
                + ",                         \"bncoidCompanyId\":\"" + bncoidCompanyId + "\""
                + ",                         \"bnctlPayeeControl\":\"" + bnctlPayeeControl + "\""
                + ",                         \"bnpurOrderControl\":\"" + bnpurOrderControl + "\""
                + ",                         \"bnatypAdjType\":\"" + bnatypAdjType + "\""
                + ",                         \"bnacdeAdjCode\":\"" + bnacdeAdjCode + "\""
                + ",                         \"bnadjaAdjAmount\":\"" + bnadjaAdjAmount + "\""
                + ",                         \"bnwhsaWhsAmount\":\"" + bnwhsaWhsAmount + "\""
                + ",                         \"bnndpaNdpAmount\":\"" + bnndpaNdpAmount + "\""
                + ",                         \"bnsrpaSrpAmount\":\"" + bnsrpaSrpAmount + "\""
                + ",                         \"bnstscStatusCode\":\"" + bnstscStatusCode + "\""
                + ",                         \"bnttypTransactionType\":\"" + bnttypTransactionType + "\""
                + ",                         \"bnptypProcessType\":\"" + bnptypProcessType + "\""
                + ",                         \"bncrtcCreatedCycle\":\"" + bncrtcCreatedCycle + "\""
                + ",                         \"bncdatCreatedDate\":\"" + bncdatCreatedDate + "\""
                + ",                         \"bnpidcPaidCycle\":\"" + bnpidcPaidCycle + "\""
                + ",                         \"bnpdatPaidDate\":\"" + bnpdatPaidDate + "\""
                + ",                         \"bnref1AlphaRef1\":\"" + bnref1AlphaRef1 + "\""
                + ",                         \"bnref2AlphaRef2\":\"" + bnref2AlphaRef2 + "\""
                + ",                         \"bnref3NumericRef\":\"" + bnref3NumericRef + "\""
                + ",                         \"bnmdatMaintainedDate\":\"" + bnmdatMaintainedDate + "\""
                + ",                         \"bncusrLastChangeUser\":\"" + bncusrLastChangeUser + "\""
                + ",                         \"bnordsOrderSourceCode\":\"" + bnordsOrderSourceCode + "\""
                + ",                         \"bnshpsShippingSourceCode\":\"" + bnshpsShippingSourceCode + "\""
                + ",                         \"bnotypOrderTypeCode\":\"" + bnotypOrderTypeCode + "\""
                + "}}";
    }
}
