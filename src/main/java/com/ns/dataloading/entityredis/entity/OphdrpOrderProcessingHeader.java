package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("OPHDRP_OrderProcessingHeader")
public class OphdrpOrderProcessingHeader implements Serializable {
    private Long id;
    private Long ohoidOpId;
    private String ohreqRequestNumber;
    private Long ohordSystemOrderNumber;
    private Long ohctycDistCtyc;
    private Long ohdidDistributorId;
    private String ohsrccSourceCompany;
    private String ohoprcOperatingCompany;
    private String ohhcmpDistributorHomeCompany;
    private String ohrstsRecordStatus;
    private String ohstscStatusCode;
    private String ohsrcOrderSource;
    private String ohtypOrderType;
    private String ohdvtDeliveryType;
    private String ohdvsDeliverySource;
    private String ohcurcCurrencyCode;
    private BigDecimal ohexrtCurrencyExchangeRate;
    private String ohordtOrderDate;
    private String ohtxemTaxExemptCode;
    private Integer ohpyrYearOfOrder;
    private Integer ohpmoMonthOfOrder;
    private Long ohareaDistributorArea;
    private Long ohparaPurchaceArea;
    private BigDecimal ohoamtOrderTotalAmount;
    private BigDecimal ohobamTotalBilledAmount;
    private String ohlngcCharacterCode;
    private Long ohsppsShippingSourceCode;
    private Long ohinvInvoiceNumber;
    private Long ohgnc1GenericNumeric1;
    private Long ohgnc2GenericNumeric2;
    private Long ohgnc3GenericNumeric3;
    private BigDecimal ohgnc4GenericNumeric4;
    private BigDecimal ohgnc5GenericNumberic5;
    private BigDecimal ohgnc6GenericNumeric6;
    private String ohgenaGenericAlpha1;
    private String ohgenbGenericAlpha2;
    private String ohgencGenericAlpha3;
    private String ohgendGenericAlpha4;
    private String ohgeneGenericAlpha5;
    private String ohgenfGenericAlpha6;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "OHOID_OpId", nullable = true)
    public Long getOhoidOpId() {
        return ohoidOpId;
    }

    public void setOhoidOpId(Long ohoidOpId) {
        this.ohoidOpId = ohoidOpId;
    }

    // @Basic
    // @Column(name = "OHREQ_RequestNumber", nullable = true, length = 255)
    public String getOhreqRequestNumber() {
        return ohreqRequestNumber;
    }

    public void setOhreqRequestNumber(String ohreqRequestNumber) {
        this.ohreqRequestNumber = ohreqRequestNumber;
    }

    // @Basic
    // @Column(name = "OHORD_SystemOrderNumber", nullable = true)
    public Long getOhordSystemOrderNumber() {
        return ohordSystemOrderNumber;
    }

    public void setOhordSystemOrderNumber(Long ohordSystemOrderNumber) {
        this.ohordSystemOrderNumber = ohordSystemOrderNumber;
    }

    // @Basic
    // @Column(name = "OHCTYC_DistCtyc", nullable = true)
    public Long getOhctycDistCtyc() {
        return ohctycDistCtyc;
    }

    public void setOhctycDistCtyc(Long ohctycDistCtyc) {
        this.ohctycDistCtyc = ohctycDistCtyc;
    }

    // @Basic
    // @Column(name = "OHDID_DistributorId", nullable = true)
    public Long getOhdidDistributorId() {
        return ohdidDistributorId;
    }

    public void setOhdidDistributorId(Long ohdidDistributorId) {
        this.ohdidDistributorId = ohdidDistributorId;
    }

    // @Basic
    // @Column(name = "OHSRCC_SourceCompany", nullable = true, length = 15)
    public String getOhsrccSourceCompany() {
        return ohsrccSourceCompany;
    }

    public void setOhsrccSourceCompany(String ohsrccSourceCompany) {
        this.ohsrccSourceCompany = ohsrccSourceCompany;
    }

    // @Basic
    // @Column(name = "OHOPRC_OperatingCompany", nullable = true, length = 15)
    public String getOhoprcOperatingCompany() {
        return ohoprcOperatingCompany;
    }

    public void setOhoprcOperatingCompany(String ohoprcOperatingCompany) {
        this.ohoprcOperatingCompany = ohoprcOperatingCompany;
    }

    // @Basic
    // @Column(name = "OHHCMP_DistributorHomeCompany", nullable = true, length = 15)
    public String getOhhcmpDistributorHomeCompany() {
        return ohhcmpDistributorHomeCompany;
    }

    public void setOhhcmpDistributorHomeCompany(String ohhcmpDistributorHomeCompany) {
        this.ohhcmpDistributorHomeCompany = ohhcmpDistributorHomeCompany;
    }

    // @Basic
    // @Column(name = "OHRSTS_RecordStatus", nullable = true, length = 15)
    public String getOhrstsRecordStatus() {
        return ohrstsRecordStatus;
    }

    public void setOhrstsRecordStatus(String ohrstsRecordStatus) {
        this.ohrstsRecordStatus = ohrstsRecordStatus;
    }

    // @Basic
    // @Column(name = "OHSTSC_StatusCode", nullable = true, length = 1)
    public String getOhstscStatusCode() {
        return ohstscStatusCode;
    }

    public void setOhstscStatusCode(String ohstscStatusCode) {
        this.ohstscStatusCode = ohstscStatusCode;
    }

    // @Basic
    // @Column(name = "OHSRC_OrderSource", nullable = true, length = 1)
    public String getOhsrcOrderSource() {
        return ohsrcOrderSource;
    }

    public void setOhsrcOrderSource(String ohsrcOrderSource) {
        this.ohsrcOrderSource = ohsrcOrderSource;
    }

    // @Basic
    // @Column(name = "OHTYP_OrderType", nullable = true, length = 1)
    public String getOhtypOrderType() {
        return ohtypOrderType;
    }

    public void setOhtypOrderType(String ohtypOrderType) {
        this.ohtypOrderType = ohtypOrderType;
    }

    // @Basic
    // @Column(name = "OHDVT_DeliveryType", nullable = true, length = 1)
    public String getOhdvtDeliveryType() {
        return ohdvtDeliveryType;
    }

    public void setOhdvtDeliveryType(String ohdvtDeliveryType) {
        this.ohdvtDeliveryType = ohdvtDeliveryType;
    }

    // @Basic
    // @Column(name = "OHDVS_DeliverySource", nullable = true, length = 15)
    public String getOhdvsDeliverySource() {
        return ohdvsDeliverySource;
    }

    public void setOhdvsDeliverySource(String ohdvsDeliverySource) {
        this.ohdvsDeliverySource = ohdvsDeliverySource;
    }

    // @Basic
    // @Column(name = "OHCURC_CurrencyCode", nullable = true, length = 3)
    public String getOhcurcCurrencyCode() {
        return ohcurcCurrencyCode;
    }

    public void setOhcurcCurrencyCode(String ohcurcCurrencyCode) {
        this.ohcurcCurrencyCode = ohcurcCurrencyCode;
    }

    // @Basic
    // @Column(name = "OHEXRT_CurrencyExchangeRate", nullable = true, precision = 7)
    public BigDecimal getOhexrtCurrencyExchangeRate() {
        return ohexrtCurrencyExchangeRate;
    }

    public void setOhexrtCurrencyExchangeRate(BigDecimal ohexrtCurrencyExchangeRate) {
        this.ohexrtCurrencyExchangeRate = ohexrtCurrencyExchangeRate;
    }

    // @Basic
    // @Column(name = "OHORDT_OrderDate", nullable = true, length = 15)
    public String getOhordtOrderDate() {
        return ohordtOrderDate;
    }

    public void setOhordtOrderDate(String ohordtOrderDate) {
        this.ohordtOrderDate = ohordtOrderDate;
    }

    // @Basic
    // @Column(name = "OHTXEM_TaxExemptCode", nullable = true, length = 3)
    public String getOhtxemTaxExemptCode() {
        return ohtxemTaxExemptCode;
    }

    public void setOhtxemTaxExemptCode(String ohtxemTaxExemptCode) {
        this.ohtxemTaxExemptCode = ohtxemTaxExemptCode;
    }

    // @Basic
    // @Column(name = "OHPYR_YearOfOrder", nullable = true)
    public Integer getOhpyrYearOfOrder() {
        return ohpyrYearOfOrder;
    }

    public void setOhpyrYearOfOrder(Integer ohpyrYearOfOrder) {
        this.ohpyrYearOfOrder = ohpyrYearOfOrder;
    }

    // @Basic
    // @Column(name = "OHPMO_MonthOfOrder", nullable = true)
    public Integer getOhpmoMonthOfOrder() {
        return ohpmoMonthOfOrder;
    }

    public void setOhpmoMonthOfOrder(Integer ohpmoMonthOfOrder) {
        this.ohpmoMonthOfOrder = ohpmoMonthOfOrder;
    }

    // @Basic
    // @Column(name = "OHAREA_DistributorArea", nullable = true)
    public Long getOhareaDistributorArea() {
        return ohareaDistributorArea;
    }

    public void setOhareaDistributorArea(Long ohareaDistributorArea) {
        this.ohareaDistributorArea = ohareaDistributorArea;
    }

    // @Basic
    // @Column(name = "OHPARA_PurchaceArea", nullable = true)
    public Long getOhparaPurchaceArea() {
        return ohparaPurchaceArea;
    }

    public void setOhparaPurchaceArea(Long ohparaPurchaceArea) {
        this.ohparaPurchaceArea = ohparaPurchaceArea;
    }

    // @Basic
    // @Column(name = "OHOAMT_OrderTotalAmount", nullable = true, precision = 2)
    public BigDecimal getOhoamtOrderTotalAmount() {
        return ohoamtOrderTotalAmount;
    }

    public void setOhoamtOrderTotalAmount(BigDecimal ohoamtOrderTotalAmount) {
        this.ohoamtOrderTotalAmount = ohoamtOrderTotalAmount;
    }

    // @Basic
    // @Column(name = "OHOBAM_TotalBilledAmount", nullable = true, precision = 2)
    public BigDecimal getOhobamTotalBilledAmount() {
        return ohobamTotalBilledAmount;
    }

    public void setOhobamTotalBilledAmount(BigDecimal ohobamTotalBilledAmount) {
        this.ohobamTotalBilledAmount = ohobamTotalBilledAmount;
    }

    // @Basic
    // @Column(name = "OHLNGC_CharacterCode", nullable = true, length = 3)
    public String getOhlngcCharacterCode() {
        return ohlngcCharacterCode;
    }

    public void setOhlngcCharacterCode(String ohlngcCharacterCode) {
        this.ohlngcCharacterCode = ohlngcCharacterCode;
    }

    // @Basic
    // @Column(name = "OHSPPS_ShippingSourceCode", nullable = true)
    public Long getOhsppsShippingSourceCode() {
        return ohsppsShippingSourceCode;
    }

    public void setOhsppsShippingSourceCode(Long ohsppsShippingSourceCode) {
        this.ohsppsShippingSourceCode = ohsppsShippingSourceCode;
    }

    // @Basic
    // @Column(name = "OHINV_InvoiceNumber", nullable = true)
    public Long getOhinvInvoiceNumber() {
        return ohinvInvoiceNumber;
    }

    public void setOhinvInvoiceNumber(Long ohinvInvoiceNumber) {
        this.ohinvInvoiceNumber = ohinvInvoiceNumber;
    }

    // @Basic
    // @Column(name = "OHGNC1_GenericNumeric1", nullable = true)
    public Long getOhgnc1GenericNumeric1() {
        return ohgnc1GenericNumeric1;
    }

    public void setOhgnc1GenericNumeric1(Long ohgnc1GenericNumeric1) {
        this.ohgnc1GenericNumeric1 = ohgnc1GenericNumeric1;
    }

    // @Basic
    // @Column(name = "OHGNC2_GenericNumeric2", nullable = true)
    public Long getOhgnc2GenericNumeric2() {
        return ohgnc2GenericNumeric2;
    }

    public void setOhgnc2GenericNumeric2(Long ohgnc2GenericNumeric2) {
        this.ohgnc2GenericNumeric2 = ohgnc2GenericNumeric2;
    }

    // @Basic
    // @Column(name = "OHGNC3_GenericNumeric3", nullable = true)
    public Long getOhgnc3GenericNumeric3() {
        return ohgnc3GenericNumeric3;
    }

    public void setOhgnc3GenericNumeric3(Long ohgnc3GenericNumeric3) {
        this.ohgnc3GenericNumeric3 = ohgnc3GenericNumeric3;
    }

    // @Basic
    // @Column(name = "OHGNC4_GenericNumeric4", nullable = true, precision = 2)
    public BigDecimal getOhgnc4GenericNumeric4() {
        return ohgnc4GenericNumeric4;
    }

    public void setOhgnc4GenericNumeric4(BigDecimal ohgnc4GenericNumeric4) {
        this.ohgnc4GenericNumeric4 = ohgnc4GenericNumeric4;
    }

    // @Basic
    // @Column(name = "OHGNC5_GenericNumberic5", nullable = true, precision = 2)
    public BigDecimal getOhgnc5GenericNumberic5() {
        return ohgnc5GenericNumberic5;
    }

    public void setOhgnc5GenericNumberic5(BigDecimal ohgnc5GenericNumberic5) {
        this.ohgnc5GenericNumberic5 = ohgnc5GenericNumberic5;
    }

    // @Basic
    // @Column(name = "OHGNC6_GenericNumeric6", nullable = true, precision = 2)
    public BigDecimal getOhgnc6GenericNumeric6() {
        return ohgnc6GenericNumeric6;
    }

    public void setOhgnc6GenericNumeric6(BigDecimal ohgnc6GenericNumeric6) {
        this.ohgnc6GenericNumeric6 = ohgnc6GenericNumeric6;
    }

    // @Basic
    // @Column(name = "OHGENA_GenericAlpha1", nullable = true, length = 1)
    public String getOhgenaGenericAlpha1() {
        return ohgenaGenericAlpha1;
    }

    public void setOhgenaGenericAlpha1(String ohgenaGenericAlpha1) {
        this.ohgenaGenericAlpha1 = ohgenaGenericAlpha1;
    }

    // @Basic
    // @Column(name = "OHGENB_GenericAlpha2", nullable = true, length = 1)
    public String getOhgenbGenericAlpha2() {
        return ohgenbGenericAlpha2;
    }

    public void setOhgenbGenericAlpha2(String ohgenbGenericAlpha2) {
        this.ohgenbGenericAlpha2 = ohgenbGenericAlpha2;
    }

    // @Basic
    // @Column(name = "OHGENC_GenericAlpha3", nullable = true, length = 5)
    public String getOhgencGenericAlpha3() {
        return ohgencGenericAlpha3;
    }

    public void setOhgencGenericAlpha3(String ohgencGenericAlpha3) {
        this.ohgencGenericAlpha3 = ohgencGenericAlpha3;
    }

    // @Basic
    // @Column(name = "OHGEND_GenericAlpha4", nullable = true, length = 5)
    public String getOhgendGenericAlpha4() {
        return ohgendGenericAlpha4;
    }

    public void setOhgendGenericAlpha4(String ohgendGenericAlpha4) {
        this.ohgendGenericAlpha4 = ohgendGenericAlpha4;
    }

    // @Basic
    // @Column(name = "OHGENE_GenericAlpha5", nullable = true, length = 15)
    public String getOhgeneGenericAlpha5() {
        return ohgeneGenericAlpha5;
    }

    public void setOhgeneGenericAlpha5(String ohgeneGenericAlpha5) {
        this.ohgeneGenericAlpha5 = ohgeneGenericAlpha5;
    }

    // @Basic
    // @Column(name = "OHGENF_GenericAlpha6", nullable = true, length = 15)
    public String getOhgenfGenericAlpha6() {
        return ohgenfGenericAlpha6;
    }

    public void setOhgenfGenericAlpha6(String ohgenfGenericAlpha6) {
        this.ohgenfGenericAlpha6 = ohgenfGenericAlpha6;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OphdrpOrderProcessingHeader that = (OphdrpOrderProcessingHeader) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ohoidOpId != null ? !ohoidOpId.equals(that.ohoidOpId) : that.ohoidOpId != null) return false;
        if (ohreqRequestNumber != null ? !ohreqRequestNumber.equals(that.ohreqRequestNumber) : that.ohreqRequestNumber != null)
            return false;
        if (ohordSystemOrderNumber != null ? !ohordSystemOrderNumber.equals(that.ohordSystemOrderNumber) : that.ohordSystemOrderNumber != null)
            return false;
        if (ohctycDistCtyc != null ? !ohctycDistCtyc.equals(that.ohctycDistCtyc) : that.ohctycDistCtyc != null)
            return false;
        if (ohdidDistributorId != null ? !ohdidDistributorId.equals(that.ohdidDistributorId) : that.ohdidDistributorId != null)
            return false;
        if (ohsrccSourceCompany != null ? !ohsrccSourceCompany.equals(that.ohsrccSourceCompany) : that.ohsrccSourceCompany != null)
            return false;
        if (ohoprcOperatingCompany != null ? !ohoprcOperatingCompany.equals(that.ohoprcOperatingCompany) : that.ohoprcOperatingCompany != null)
            return false;
        if (ohhcmpDistributorHomeCompany != null ? !ohhcmpDistributorHomeCompany.equals(that.ohhcmpDistributorHomeCompany) : that.ohhcmpDistributorHomeCompany != null)
            return false;
        if (ohrstsRecordStatus != null ? !ohrstsRecordStatus.equals(that.ohrstsRecordStatus) : that.ohrstsRecordStatus != null)
            return false;
        if (ohstscStatusCode != null ? !ohstscStatusCode.equals(that.ohstscStatusCode) : that.ohstscStatusCode != null)
            return false;
        if (ohsrcOrderSource != null ? !ohsrcOrderSource.equals(that.ohsrcOrderSource) : that.ohsrcOrderSource != null)
            return false;
        if (ohtypOrderType != null ? !ohtypOrderType.equals(that.ohtypOrderType) : that.ohtypOrderType != null)
            return false;
        if (ohdvtDeliveryType != null ? !ohdvtDeliveryType.equals(that.ohdvtDeliveryType) : that.ohdvtDeliveryType != null)
            return false;
        if (ohdvsDeliverySource != null ? !ohdvsDeliverySource.equals(that.ohdvsDeliverySource) : that.ohdvsDeliverySource != null)
            return false;
        if (ohcurcCurrencyCode != null ? !ohcurcCurrencyCode.equals(that.ohcurcCurrencyCode) : that.ohcurcCurrencyCode != null)
            return false;
        if (ohexrtCurrencyExchangeRate != null ? !ohexrtCurrencyExchangeRate.equals(that.ohexrtCurrencyExchangeRate) : that.ohexrtCurrencyExchangeRate != null)
            return false;
        if (ohordtOrderDate != null ? !ohordtOrderDate.equals(that.ohordtOrderDate) : that.ohordtOrderDate != null)
            return false;
        if (ohtxemTaxExemptCode != null ? !ohtxemTaxExemptCode.equals(that.ohtxemTaxExemptCode) : that.ohtxemTaxExemptCode != null)
            return false;
        if (ohpyrYearOfOrder != null ? !ohpyrYearOfOrder.equals(that.ohpyrYearOfOrder) : that.ohpyrYearOfOrder != null)
            return false;
        if (ohpmoMonthOfOrder != null ? !ohpmoMonthOfOrder.equals(that.ohpmoMonthOfOrder) : that.ohpmoMonthOfOrder != null)
            return false;
        if (ohareaDistributorArea != null ? !ohareaDistributorArea.equals(that.ohareaDistributorArea) : that.ohareaDistributorArea != null)
            return false;
        if (ohparaPurchaceArea != null ? !ohparaPurchaceArea.equals(that.ohparaPurchaceArea) : that.ohparaPurchaceArea != null)
            return false;
        if (ohoamtOrderTotalAmount != null ? !ohoamtOrderTotalAmount.equals(that.ohoamtOrderTotalAmount) : that.ohoamtOrderTotalAmount != null)
            return false;
        if (ohobamTotalBilledAmount != null ? !ohobamTotalBilledAmount.equals(that.ohobamTotalBilledAmount) : that.ohobamTotalBilledAmount != null)
            return false;
        if (ohlngcCharacterCode != null ? !ohlngcCharacterCode.equals(that.ohlngcCharacterCode) : that.ohlngcCharacterCode != null)
            return false;
        if (ohsppsShippingSourceCode != null ? !ohsppsShippingSourceCode.equals(that.ohsppsShippingSourceCode) : that.ohsppsShippingSourceCode != null)
            return false;
        if (ohinvInvoiceNumber != null ? !ohinvInvoiceNumber.equals(that.ohinvInvoiceNumber) : that.ohinvInvoiceNumber != null)
            return false;
        if (ohgnc1GenericNumeric1 != null ? !ohgnc1GenericNumeric1.equals(that.ohgnc1GenericNumeric1) : that.ohgnc1GenericNumeric1 != null)
            return false;
        if (ohgnc2GenericNumeric2 != null ? !ohgnc2GenericNumeric2.equals(that.ohgnc2GenericNumeric2) : that.ohgnc2GenericNumeric2 != null)
            return false;
        if (ohgnc3GenericNumeric3 != null ? !ohgnc3GenericNumeric3.equals(that.ohgnc3GenericNumeric3) : that.ohgnc3GenericNumeric3 != null)
            return false;
        if (ohgnc4GenericNumeric4 != null ? !ohgnc4GenericNumeric4.equals(that.ohgnc4GenericNumeric4) : that.ohgnc4GenericNumeric4 != null)
            return false;
        if (ohgnc5GenericNumberic5 != null ? !ohgnc5GenericNumberic5.equals(that.ohgnc5GenericNumberic5) : that.ohgnc5GenericNumberic5 != null)
            return false;
        if (ohgnc6GenericNumeric6 != null ? !ohgnc6GenericNumeric6.equals(that.ohgnc6GenericNumeric6) : that.ohgnc6GenericNumeric6 != null)
            return false;
        if (ohgenaGenericAlpha1 != null ? !ohgenaGenericAlpha1.equals(that.ohgenaGenericAlpha1) : that.ohgenaGenericAlpha1 != null)
            return false;
        if (ohgenbGenericAlpha2 != null ? !ohgenbGenericAlpha2.equals(that.ohgenbGenericAlpha2) : that.ohgenbGenericAlpha2 != null)
            return false;
        if (ohgencGenericAlpha3 != null ? !ohgencGenericAlpha3.equals(that.ohgencGenericAlpha3) : that.ohgencGenericAlpha3 != null)
            return false;
        if (ohgendGenericAlpha4 != null ? !ohgendGenericAlpha4.equals(that.ohgendGenericAlpha4) : that.ohgendGenericAlpha4 != null)
            return false;
        if (ohgeneGenericAlpha5 != null ? !ohgeneGenericAlpha5.equals(that.ohgeneGenericAlpha5) : that.ohgeneGenericAlpha5 != null)
            return false;
        if (ohgenfGenericAlpha6 != null ? !ohgenfGenericAlpha6.equals(that.ohgenfGenericAlpha6) : that.ohgenfGenericAlpha6 != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ohoidOpId != null ? ohoidOpId.hashCode() : 0);
        result = 31 * result + (ohreqRequestNumber != null ? ohreqRequestNumber.hashCode() : 0);
        result = 31 * result + (ohordSystemOrderNumber != null ? ohordSystemOrderNumber.hashCode() : 0);
        result = 31 * result + (ohctycDistCtyc != null ? ohctycDistCtyc.hashCode() : 0);
        result = 31 * result + (ohdidDistributorId != null ? ohdidDistributorId.hashCode() : 0);
        result = 31 * result + (ohsrccSourceCompany != null ? ohsrccSourceCompany.hashCode() : 0);
        result = 31 * result + (ohoprcOperatingCompany != null ? ohoprcOperatingCompany.hashCode() : 0);
        result = 31 * result + (ohhcmpDistributorHomeCompany != null ? ohhcmpDistributorHomeCompany.hashCode() : 0);
        result = 31 * result + (ohrstsRecordStatus != null ? ohrstsRecordStatus.hashCode() : 0);
        result = 31 * result + (ohstscStatusCode != null ? ohstscStatusCode.hashCode() : 0);
        result = 31 * result + (ohsrcOrderSource != null ? ohsrcOrderSource.hashCode() : 0);
        result = 31 * result + (ohtypOrderType != null ? ohtypOrderType.hashCode() : 0);
        result = 31 * result + (ohdvtDeliveryType != null ? ohdvtDeliveryType.hashCode() : 0);
        result = 31 * result + (ohdvsDeliverySource != null ? ohdvsDeliverySource.hashCode() : 0);
        result = 31 * result + (ohcurcCurrencyCode != null ? ohcurcCurrencyCode.hashCode() : 0);
        result = 31 * result + (ohexrtCurrencyExchangeRate != null ? ohexrtCurrencyExchangeRate.hashCode() : 0);
        result = 31 * result + (ohordtOrderDate != null ? ohordtOrderDate.hashCode() : 0);
        result = 31 * result + (ohtxemTaxExemptCode != null ? ohtxemTaxExemptCode.hashCode() : 0);
        result = 31 * result + (ohpyrYearOfOrder != null ? ohpyrYearOfOrder.hashCode() : 0);
        result = 31 * result + (ohpmoMonthOfOrder != null ? ohpmoMonthOfOrder.hashCode() : 0);
        result = 31 * result + (ohareaDistributorArea != null ? ohareaDistributorArea.hashCode() : 0);
        result = 31 * result + (ohparaPurchaceArea != null ? ohparaPurchaceArea.hashCode() : 0);
        result = 31 * result + (ohoamtOrderTotalAmount != null ? ohoamtOrderTotalAmount.hashCode() : 0);
        result = 31 * result + (ohobamTotalBilledAmount != null ? ohobamTotalBilledAmount.hashCode() : 0);
        result = 31 * result + (ohlngcCharacterCode != null ? ohlngcCharacterCode.hashCode() : 0);
        result = 31 * result + (ohsppsShippingSourceCode != null ? ohsppsShippingSourceCode.hashCode() : 0);
        result = 31 * result + (ohinvInvoiceNumber != null ? ohinvInvoiceNumber.hashCode() : 0);
        result = 31 * result + (ohgnc1GenericNumeric1 != null ? ohgnc1GenericNumeric1.hashCode() : 0);
        result = 31 * result + (ohgnc2GenericNumeric2 != null ? ohgnc2GenericNumeric2.hashCode() : 0);
        result = 31 * result + (ohgnc3GenericNumeric3 != null ? ohgnc3GenericNumeric3.hashCode() : 0);
        result = 31 * result + (ohgnc4GenericNumeric4 != null ? ohgnc4GenericNumeric4.hashCode() : 0);
        result = 31 * result + (ohgnc5GenericNumberic5 != null ? ohgnc5GenericNumberic5.hashCode() : 0);
        result = 31 * result + (ohgnc6GenericNumeric6 != null ? ohgnc6GenericNumeric6.hashCode() : 0);
        result = 31 * result + (ohgenaGenericAlpha1 != null ? ohgenaGenericAlpha1.hashCode() : 0);
        result = 31 * result + (ohgenbGenericAlpha2 != null ? ohgenbGenericAlpha2.hashCode() : 0);
        result = 31 * result + (ohgencGenericAlpha3 != null ? ohgencGenericAlpha3.hashCode() : 0);
        result = 31 * result + (ohgendGenericAlpha4 != null ? ohgendGenericAlpha4.hashCode() : 0);
        result = 31 * result + (ohgeneGenericAlpha5 != null ? ohgeneGenericAlpha5.hashCode() : 0);
        result = 31 * result + (ohgenfGenericAlpha6 != null ? ohgenfGenericAlpha6.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"OphdrpOrderProcessingHeader\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"ohoidOpId\":\"" + ohoidOpId + "\""
                + ",                         \"ohreqRequestNumber\":\"" + ohreqRequestNumber + "\""
                + ",                         \"ohordSystemOrderNumber\":\"" + ohordSystemOrderNumber + "\""
                + ",                         \"ohctycDistCtyc\":\"" + ohctycDistCtyc + "\""
                + ",                         \"ohdidDistributorId\":\"" + ohdidDistributorId + "\""
                + ",                         \"ohsrccSourceCompany\":\"" + ohsrccSourceCompany + "\""
                + ",                         \"ohoprcOperatingCompany\":\"" + ohoprcOperatingCompany + "\""
                + ",                         \"ohhcmpDistributorHomeCompany\":\"" + ohhcmpDistributorHomeCompany + "\""
                + ",                         \"ohrstsRecordStatus\":\"" + ohrstsRecordStatus + "\""
                + ",                         \"ohstscStatusCode\":\"" + ohstscStatusCode + "\""
                + ",                         \"ohsrcOrderSource\":\"" + ohsrcOrderSource + "\""
                + ",                         \"ohtypOrderType\":\"" + ohtypOrderType + "\""
                + ",                         \"ohdvtDeliveryType\":\"" + ohdvtDeliveryType + "\""
                + ",                         \"ohdvsDeliverySource\":\"" + ohdvsDeliverySource + "\""
                + ",                         \"ohcurcCurrencyCode\":\"" + ohcurcCurrencyCode + "\""
                + ",                         \"ohexrtCurrencyExchangeRate\":\"" + ohexrtCurrencyExchangeRate + "\""
                + ",                         \"ohordtOrderDate\":\"" + ohordtOrderDate + "\""
                + ",                         \"ohtxemTaxExemptCode\":\"" + ohtxemTaxExemptCode + "\""
                + ",                         \"ohpyrYearOfOrder\":\"" + ohpyrYearOfOrder + "\""
                + ",                         \"ohpmoMonthOfOrder\":\"" + ohpmoMonthOfOrder + "\""
                + ",                         \"ohareaDistributorArea\":\"" + ohareaDistributorArea + "\""
                + ",                         \"ohparaPurchaceArea\":\"" + ohparaPurchaceArea + "\""
                + ",                         \"ohoamtOrderTotalAmount\":\"" + ohoamtOrderTotalAmount + "\""
                + ",                         \"ohobamTotalBilledAmount\":\"" + ohobamTotalBilledAmount + "\""
                + ",                         \"ohlngcCharacterCode\":\"" + ohlngcCharacterCode + "\""
                + ",                         \"ohsppsShippingSourceCode\":\"" + ohsppsShippingSourceCode + "\""
                + ",                         \"ohinvInvoiceNumber\":\"" + ohinvInvoiceNumber + "\""
                + ",                         \"ohgnc1GenericNumeric1\":\"" + ohgnc1GenericNumeric1 + "\""
                + ",                         \"ohgnc2GenericNumeric2\":\"" + ohgnc2GenericNumeric2 + "\""
                + ",                         \"ohgnc3GenericNumeric3\":\"" + ohgnc3GenericNumeric3 + "\""
                + ",                         \"ohgnc4GenericNumeric4\":\"" + ohgnc4GenericNumeric4 + "\""
                + ",                         \"ohgnc5GenericNumberic5\":\"" + ohgnc5GenericNumberic5 + "\""
                + ",                         \"ohgnc6GenericNumeric6\":\"" + ohgnc6GenericNumeric6 + "\""
                + ",                         \"ohgenaGenericAlpha1\":\"" + ohgenaGenericAlpha1 + "\""
                + ",                         \"ohgenbGenericAlpha2\":\"" + ohgenbGenericAlpha2 + "\""
                + ",                         \"ohgencGenericAlpha3\":\"" + ohgencGenericAlpha3 + "\""
                + ",                         \"ohgendGenericAlpha4\":\"" + ohgendGenericAlpha4 + "\""
                + ",                         \"ohgeneGenericAlpha5\":\"" + ohgeneGenericAlpha5 + "\""
                + ",                         \"ohgenfGenericAlpha6\":\"" + ohgenfGenericAlpha6 + "\""
                + "}}";
    }
}
