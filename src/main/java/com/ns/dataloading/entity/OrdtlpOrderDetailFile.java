package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ORDTLP_OrderDetailFile")
public class OrdtlpOrderDetailFile {
    private Long id;
    private Integer orpyrProcessYear;
    private Integer orpmoProcessMonth;
    private Long orordOrderNumber;
    private Long orenvEnvelopeNumber;
    private Long orparaPurchaceArea;
    private Long orctlDistributorControl;
    private Long orqtyQuantityOfProduct;
    private Long orqshpShippedQuantity;
    private Long orqboBackOrderQuantity;
    private String orprdProductNumber;
    private String orrevRevisionNumber;
    private String orptypProductType;
    private String orunitUnitOfProduct;
    private BigDecimal orcscrCaseCredits;
    private BigDecimal orsrpSrpOfProduct;
    private BigDecimal orwhsWholeSaleCostOfProduct;
    private BigDecimal orndpNdpAmount;
    private BigDecimal orslpSalesPriceOfItem;
    private BigDecimal ortaxTaxOfOrder;
    private Integer orseqSequenceNumber;
    private String ordateDateOfOrder;
    private String oruserLastChangeUser;
    private String ortxblTaxableItemYorN;
    private BigDecimal orwghtWeight;
    private String oredteEntryTimeStamp;
    private String orcdteChangeTimeStamp;

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
    @Column(name = "ORPYR_ProcessYear", nullable = true)
    public Integer getOrpyrProcessYear() {
        return orpyrProcessYear;
    }

    public void setOrpyrProcessYear(Integer orpyrProcessYear) {
        this.orpyrProcessYear = orpyrProcessYear;
    }

    @Basic
    @Column(name = "ORPMO_ProcessMonth", nullable = true)
    public Integer getOrpmoProcessMonth() {
        return orpmoProcessMonth;
    }

    public void setOrpmoProcessMonth(Integer orpmoProcessMonth) {
        this.orpmoProcessMonth = orpmoProcessMonth;
    }

    @Basic
    @Column(name = "ORORD_OrderNumber", nullable = false)
    public Long getOrordOrderNumber() {
        return orordOrderNumber;
    }

    public void setOrordOrderNumber(Long orordOrderNumber) {
        this.orordOrderNumber = orordOrderNumber;
    }

    @Basic
    @Column(name = "ORENV_EnvelopeNumber", nullable = true)
    public Long getOrenvEnvelopeNumber() {
        return orenvEnvelopeNumber;
    }

    public void setOrenvEnvelopeNumber(Long orenvEnvelopeNumber) {
        this.orenvEnvelopeNumber = orenvEnvelopeNumber;
    }

    @Basic
    @Column(name = "ORPARA_PurchaceArea", nullable = true)
    public Long getOrparaPurchaceArea() {
        return orparaPurchaceArea;
    }

    public void setOrparaPurchaceArea(Long orparaPurchaceArea) {
        this.orparaPurchaceArea = orparaPurchaceArea;
    }

    @Basic
    @Column(name = "ORCTL_DistributorControl", nullable = false)
    public Long getOrctlDistributorControl() {
        return orctlDistributorControl;
    }

    public void setOrctlDistributorControl(Long orctlDistributorControl) {
        this.orctlDistributorControl = orctlDistributorControl;
    }

    @Basic
    @Column(name = "ORQTY_QuantityOfProduct", nullable = true)
    public Long getOrqtyQuantityOfProduct() {
        return orqtyQuantityOfProduct;
    }

    public void setOrqtyQuantityOfProduct(Long orqtyQuantityOfProduct) {
        this.orqtyQuantityOfProduct = orqtyQuantityOfProduct;
    }

    @Basic
    @Column(name = "ORQSHP_ShippedQuantity", nullable = true)
    public Long getOrqshpShippedQuantity() {
        return orqshpShippedQuantity;
    }

    public void setOrqshpShippedQuantity(Long orqshpShippedQuantity) {
        this.orqshpShippedQuantity = orqshpShippedQuantity;
    }

    @Basic
    @Column(name = "ORQBO_BackOrderQuantity", nullable = true)
    public Long getOrqboBackOrderQuantity() {
        return orqboBackOrderQuantity;
    }

    public void setOrqboBackOrderQuantity(Long orqboBackOrderQuantity) {
        this.orqboBackOrderQuantity = orqboBackOrderQuantity;
    }

    @Basic
    @Column(name = "ORPRD_ProductNumber", nullable = true, length = 15)
    public String getOrprdProductNumber() {
        return orprdProductNumber;
    }

    public void setOrprdProductNumber(String orprdProductNumber) {
        this.orprdProductNumber = orprdProductNumber;
    }

    @Basic
    @Column(name = "ORREV_RevisionNumber", nullable = true, length = 25)
    public String getOrrevRevisionNumber() {
        return orrevRevisionNumber;
    }

    public void setOrrevRevisionNumber(String orrevRevisionNumber) {
        this.orrevRevisionNumber = orrevRevisionNumber;
    }

    @Basic
    @Column(name = "ORPTYP_ProductType", nullable = true, length = 1)
    public String getOrptypProductType() {
        return orptypProductType;
    }

    public void setOrptypProductType(String orptypProductType) {
        this.orptypProductType = orptypProductType;
    }

    @Basic
    @Column(name = "ORUNIT_UnitOfProduct", nullable = true, length = 1)
    public String getOrunitUnitOfProduct() {
        return orunitUnitOfProduct;
    }

    public void setOrunitUnitOfProduct(String orunitUnitOfProduct) {
        this.orunitUnitOfProduct = orunitUnitOfProduct;
    }

    @Basic
    @Column(name = "ORCSCR_CaseCredits", nullable = true, precision = 3)
    public BigDecimal getOrcscrCaseCredits() {
        return orcscrCaseCredits;
    }

    public void setOrcscrCaseCredits(BigDecimal orcscrCaseCredits) {
        this.orcscrCaseCredits = orcscrCaseCredits;
    }

    @Basic
    @Column(name = "ORSRP_SRPOfProduct", nullable = true, precision = 3)
    public BigDecimal getOrsrpSrpOfProduct() {
        return orsrpSrpOfProduct;
    }

    public void setOrsrpSrpOfProduct(BigDecimal orsrpSrpOfProduct) {
        this.orsrpSrpOfProduct = orsrpSrpOfProduct;
    }

    @Basic
    @Column(name = "ORWHS_WholeSaleCostOfProduct", nullable = true, precision = 3)
    public BigDecimal getOrwhsWholeSaleCostOfProduct() {
        return orwhsWholeSaleCostOfProduct;
    }

    public void setOrwhsWholeSaleCostOfProduct(BigDecimal orwhsWholeSaleCostOfProduct) {
        this.orwhsWholeSaleCostOfProduct = orwhsWholeSaleCostOfProduct;
    }

    @Basic
    @Column(name = "ORNDP_NDPAmount", nullable = true, precision = 3)
    public BigDecimal getOrndpNdpAmount() {
        return orndpNdpAmount;
    }

    public void setOrndpNdpAmount(BigDecimal orndpNdpAmount) {
        this.orndpNdpAmount = orndpNdpAmount;
    }

    @Basic
    @Column(name = "ORSLP_SalesPriceOfItem", nullable = true, precision = 3)
    public BigDecimal getOrslpSalesPriceOfItem() {
        return orslpSalesPriceOfItem;
    }

    public void setOrslpSalesPriceOfItem(BigDecimal orslpSalesPriceOfItem) {
        this.orslpSalesPriceOfItem = orslpSalesPriceOfItem;
    }

    @Basic
    @Column(name = "ORTAX_TaxOfOrder", nullable = true, precision = 3)
    public BigDecimal getOrtaxTaxOfOrder() {
        return ortaxTaxOfOrder;
    }

    public void setOrtaxTaxOfOrder(BigDecimal ortaxTaxOfOrder) {
        this.ortaxTaxOfOrder = ortaxTaxOfOrder;
    }

    @Basic
    @Column(name = "ORSEQ_SequenceNumber", nullable = true)
    public Integer getOrseqSequenceNumber() {
        return orseqSequenceNumber;
    }

    public void setOrseqSequenceNumber(Integer orseqSequenceNumber) {
        this.orseqSequenceNumber = orseqSequenceNumber;
    }

    @Basic
    @Column(name = "ORDATE_DateOfOrder", nullable = true, length = 15)
    public String getOrdateDateOfOrder() {
        return ordateDateOfOrder;
    }

    public void setOrdateDateOfOrder(String ordateDateOfOrder) {
        this.ordateDateOfOrder = ordateDateOfOrder;
    }

    @Basic
    @Column(name = "ORUSER_LastChangeUser", nullable = true, length = 255)
    public String getOruserLastChangeUser() {
        return oruserLastChangeUser;
    }

    public void setOruserLastChangeUser(String oruserLastChangeUser) {
        this.oruserLastChangeUser = oruserLastChangeUser;
    }

    @Basic
    @Column(name = "ORTXBL_TaxableItemYorN", nullable = true, length = 1)
    public String getOrtxblTaxableItemYorN() {
        return ortxblTaxableItemYorN;
    }

    public void setOrtxblTaxableItemYorN(String ortxblTaxableItemYorN) {
        this.ortxblTaxableItemYorN = ortxblTaxableItemYorN;
    }

    @Basic
    @Column(name = "ORWGHT_Weight", nullable = true, precision = 4)
    public BigDecimal getOrwghtWeight() {
        return orwghtWeight;
    }

    public void setOrwghtWeight(BigDecimal orwghtWeight) {
        this.orwghtWeight = orwghtWeight;
    }

    @Basic
    @Column(name = "OREDTE_EntryTimeStamp", nullable = true, length = 255)
    public String getOredteEntryTimeStamp() {
        return oredteEntryTimeStamp;
    }

    public void setOredteEntryTimeStamp(String oredteEntryTimeStamp) {
        this.oredteEntryTimeStamp = oredteEntryTimeStamp;
    }

    @Basic
    @Column(name = "ORCDTE_ChangeTimeStamp", nullable = true, length = 255)
    public String getOrcdteChangeTimeStamp() {
        return orcdteChangeTimeStamp;
    }

    public void setOrcdteChangeTimeStamp(String orcdteChangeTimeStamp) {
        this.orcdteChangeTimeStamp = orcdteChangeTimeStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdtlpOrderDetailFile that = (OrdtlpOrderDetailFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (orpyrProcessYear != null ? !orpyrProcessYear.equals(that.orpyrProcessYear) : that.orpyrProcessYear != null)
            return false;
        if (orpmoProcessMonth != null ? !orpmoProcessMonth.equals(that.orpmoProcessMonth) : that.orpmoProcessMonth != null)
            return false;
        if (orordOrderNumber != null ? !orordOrderNumber.equals(that.orordOrderNumber) : that.orordOrderNumber != null)
            return false;
        if (orenvEnvelopeNumber != null ? !orenvEnvelopeNumber.equals(that.orenvEnvelopeNumber) : that.orenvEnvelopeNumber != null)
            return false;
        if (orparaPurchaceArea != null ? !orparaPurchaceArea.equals(that.orparaPurchaceArea) : that.orparaPurchaceArea != null)
            return false;
        if (orctlDistributorControl != null ? !orctlDistributorControl.equals(that.orctlDistributorControl) : that.orctlDistributorControl != null)
            return false;
        if (orqtyQuantityOfProduct != null ? !orqtyQuantityOfProduct.equals(that.orqtyQuantityOfProduct) : that.orqtyQuantityOfProduct != null)
            return false;
        if (orqshpShippedQuantity != null ? !orqshpShippedQuantity.equals(that.orqshpShippedQuantity) : that.orqshpShippedQuantity != null)
            return false;
        if (orqboBackOrderQuantity != null ? !orqboBackOrderQuantity.equals(that.orqboBackOrderQuantity) : that.orqboBackOrderQuantity != null)
            return false;
        if (orprdProductNumber != null ? !orprdProductNumber.equals(that.orprdProductNumber) : that.orprdProductNumber != null)
            return false;
        if (orrevRevisionNumber != null ? !orrevRevisionNumber.equals(that.orrevRevisionNumber) : that.orrevRevisionNumber != null)
            return false;
        if (orptypProductType != null ? !orptypProductType.equals(that.orptypProductType) : that.orptypProductType != null)
            return false;
        if (orunitUnitOfProduct != null ? !orunitUnitOfProduct.equals(that.orunitUnitOfProduct) : that.orunitUnitOfProduct != null)
            return false;
        if (orcscrCaseCredits != null ? !orcscrCaseCredits.equals(that.orcscrCaseCredits) : that.orcscrCaseCredits != null)
            return false;
        if (orsrpSrpOfProduct != null ? !orsrpSrpOfProduct.equals(that.orsrpSrpOfProduct) : that.orsrpSrpOfProduct != null)
            return false;
        if (orwhsWholeSaleCostOfProduct != null ? !orwhsWholeSaleCostOfProduct.equals(that.orwhsWholeSaleCostOfProduct) : that.orwhsWholeSaleCostOfProduct != null)
            return false;
        if (orndpNdpAmount != null ? !orndpNdpAmount.equals(that.orndpNdpAmount) : that.orndpNdpAmount != null)
            return false;
        if (orslpSalesPriceOfItem != null ? !orslpSalesPriceOfItem.equals(that.orslpSalesPriceOfItem) : that.orslpSalesPriceOfItem != null)
            return false;
        if (ortaxTaxOfOrder != null ? !ortaxTaxOfOrder.equals(that.ortaxTaxOfOrder) : that.ortaxTaxOfOrder != null)
            return false;
        if (orseqSequenceNumber != null ? !orseqSequenceNumber.equals(that.orseqSequenceNumber) : that.orseqSequenceNumber != null)
            return false;
        if (ordateDateOfOrder != null ? !ordateDateOfOrder.equals(that.ordateDateOfOrder) : that.ordateDateOfOrder != null)
            return false;
        if (oruserLastChangeUser != null ? !oruserLastChangeUser.equals(that.oruserLastChangeUser) : that.oruserLastChangeUser != null)
            return false;
        if (ortxblTaxableItemYorN != null ? !ortxblTaxableItemYorN.equals(that.ortxblTaxableItemYorN) : that.ortxblTaxableItemYorN != null)
            return false;
        if (orwghtWeight != null ? !orwghtWeight.equals(that.orwghtWeight) : that.orwghtWeight != null) return false;
        if (oredteEntryTimeStamp != null ? !oredteEntryTimeStamp.equals(that.oredteEntryTimeStamp) : that.oredteEntryTimeStamp != null)
            return false;
        if (orcdteChangeTimeStamp != null ? !orcdteChangeTimeStamp.equals(that.orcdteChangeTimeStamp) : that.orcdteChangeTimeStamp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (orpyrProcessYear != null ? orpyrProcessYear.hashCode() : 0);
        result = 31 * result + (orpmoProcessMonth != null ? orpmoProcessMonth.hashCode() : 0);
        result = 31 * result + (orordOrderNumber != null ? orordOrderNumber.hashCode() : 0);
        result = 31 * result + (orenvEnvelopeNumber != null ? orenvEnvelopeNumber.hashCode() : 0);
        result = 31 * result + (orparaPurchaceArea != null ? orparaPurchaceArea.hashCode() : 0);
        result = 31 * result + (orctlDistributorControl != null ? orctlDistributorControl.hashCode() : 0);
        result = 31 * result + (orqtyQuantityOfProduct != null ? orqtyQuantityOfProduct.hashCode() : 0);
        result = 31 * result + (orqshpShippedQuantity != null ? orqshpShippedQuantity.hashCode() : 0);
        result = 31 * result + (orqboBackOrderQuantity != null ? orqboBackOrderQuantity.hashCode() : 0);
        result = 31 * result + (orprdProductNumber != null ? orprdProductNumber.hashCode() : 0);
        result = 31 * result + (orrevRevisionNumber != null ? orrevRevisionNumber.hashCode() : 0);
        result = 31 * result + (orptypProductType != null ? orptypProductType.hashCode() : 0);
        result = 31 * result + (orunitUnitOfProduct != null ? orunitUnitOfProduct.hashCode() : 0);
        result = 31 * result + (orcscrCaseCredits != null ? orcscrCaseCredits.hashCode() : 0);
        result = 31 * result + (orsrpSrpOfProduct != null ? orsrpSrpOfProduct.hashCode() : 0);
        result = 31 * result + (orwhsWholeSaleCostOfProduct != null ? orwhsWholeSaleCostOfProduct.hashCode() : 0);
        result = 31 * result + (orndpNdpAmount != null ? orndpNdpAmount.hashCode() : 0);
        result = 31 * result + (orslpSalesPriceOfItem != null ? orslpSalesPriceOfItem.hashCode() : 0);
        result = 31 * result + (ortaxTaxOfOrder != null ? ortaxTaxOfOrder.hashCode() : 0);
        result = 31 * result + (orseqSequenceNumber != null ? orseqSequenceNumber.hashCode() : 0);
        result = 31 * result + (ordateDateOfOrder != null ? ordateDateOfOrder.hashCode() : 0);
        result = 31 * result + (oruserLastChangeUser != null ? oruserLastChangeUser.hashCode() : 0);
        result = 31 * result + (ortxblTaxableItemYorN != null ? ortxblTaxableItemYorN.hashCode() : 0);
        result = 31 * result + (orwghtWeight != null ? orwghtWeight.hashCode() : 0);
        result = 31 * result + (oredteEntryTimeStamp != null ? oredteEntryTimeStamp.hashCode() : 0);
        result = 31 * result + (orcdteChangeTimeStamp != null ? orcdteChangeTimeStamp.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"OrdtlpOrderDetailFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"orpyrProcessYear\":\"" + orpyrProcessYear + "\""
                + ",                         \"orpmoProcessMonth\":\"" + orpmoProcessMonth + "\""
                + ",                         \"orordOrderNumber\":\"" + orordOrderNumber + "\""
                + ",                         \"orenvEnvelopeNumber\":\"" + orenvEnvelopeNumber + "\""
                + ",                         \"orparaPurchaceArea\":\"" + orparaPurchaceArea + "\""
                + ",                         \"orctlDistributorControl\":\"" + orctlDistributorControl + "\""
                + ",                         \"orqtyQuantityOfProduct\":\"" + orqtyQuantityOfProduct + "\""
                + ",                         \"orqshpShippedQuantity\":\"" + orqshpShippedQuantity + "\""
                + ",                         \"orqboBackOrderQuantity\":\"" + orqboBackOrderQuantity + "\""
                + ",                         \"orprdProductNumber\":\"" + orprdProductNumber + "\""
                + ",                         \"orrevRevisionNumber\":\"" + orrevRevisionNumber + "\""
                + ",                         \"orptypProductType\":\"" + orptypProductType + "\""
                + ",                         \"orunitUnitOfProduct\":\"" + orunitUnitOfProduct + "\""
                + ",                         \"orcscrCaseCredits\":\"" + orcscrCaseCredits + "\""
                + ",                         \"orsrpSrpOfProduct\":\"" + orsrpSrpOfProduct + "\""
                + ",                         \"orwhsWholeSaleCostOfProduct\":\"" + orwhsWholeSaleCostOfProduct + "\""
                + ",                         \"orndpNdpAmount\":\"" + orndpNdpAmount + "\""
                + ",                         \"orslpSalesPriceOfItem\":\"" + orslpSalesPriceOfItem + "\""
                + ",                         \"ortaxTaxOfOrder\":\"" + ortaxTaxOfOrder + "\""
                + ",                         \"orseqSequenceNumber\":\"" + orseqSequenceNumber + "\""
                + ",                         \"ordateDateOfOrder\":\"" + ordateDateOfOrder + "\""
                + ",                         \"oruserLastChangeUser\":\"" + oruserLastChangeUser + "\""
                + ",                         \"ortxblTaxableItemYorN\":\"" + ortxblTaxableItemYorN + "\""
                + ",                         \"orwghtWeight\":\"" + orwghtWeight + "\""
                + ",                         \"oredteEntryTimeStamp\":\"" + oredteEntryTimeStamp + "\""
                + ",                         \"orcdteChangeTimeStamp\":\"" + orcdteChangeTimeStamp + "\""
                + "}}";
    }
}
