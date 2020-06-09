package com.ns.dataloading.entity;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ORMSTP_Order")
//@Qualifier("Ormstp")
public class OrmstpOrder {
    private Long id;
    private Long omordNumber;
    private Long omctlDistCtrl;
    private Integer ompyrYear;
    private Integer ompmoMonth;
    private String omodatDate;
    private Long omdidDistId;
    private BigDecimal ompsrpProdSrp;
    private BigDecimal ompndpProdNdp;
    private BigDecimal ompwhsProdWhs;
    private BigDecimal omtsrpTotSrp;
    private String omptypPriceType;
    private BigDecimal omccrdCredits;
    private BigDecimal ompcasPhyCases;
    private BigDecimal omtwhsTotWhs;
    private BigDecimal omtndpTotNdp;
    private String omcoidCompanyCode;
    private Long omctycCntryCode;
    private String omcurcCurrCode;
    private BigDecimal omdiscPersonalDiscAmt;
    private BigDecimal omptaxProdTax;
    private BigDecimal omlsrpLitSrp;
    private BigDecimal omlwhsLitrWhsCost;
    private BigDecimal omlndpLitrNdp;
    private BigDecimal omltaxLitrTax;
    private BigDecimal omtslpTotSalesPrice;
    private BigDecimal omttaxTotTax;
    private BigDecimal omifeeImportFee;
    private BigDecimal omhchgShipHandChg;
    private BigDecimal omwghtTotWeight;
    private BigDecimal omshipShippingCharge;
    private BigDecimal omhandHandlingCharge;
    private Long omareaDistArea;
    private Long omparaPurchaseArea;
    private Long omenvEnvNum;
    private String omdateLastChangeDate;
    private String omuserLastChangeUser;
    private BigDecimal omtxblNetTaxAmt;
    private BigDecimal omntxbNetNonTaxAmt;
    private String omgmbnPayGmasmbon;
    private Long omdmDistMgrId;
    private String omntxfNonTaxFlag;
    private Long omordsOrderSrcCode;
    private Long omshpsShippingSrcCode;
    private Long omotypOrderTypeCode;
    private String omjdefJdeFlag;
    private String omndpfNdpFlag;
    private String omwebWebNum;
    private BigDecimal omexrtCurrExchRate;
    private String omedteEntryTimeStamp;
    private String omcdteChangeTimeStamp;
    private BigDecimal omdbalDiscBalConsumed;
    private BigDecimal omdpctPerDiscPerc;
    private Long omdtrnPerDiscTran;
    private String omgflgGenericFlag;

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
    @Column(name = "OMORD_Number", nullable = false)
    public Long getOmordNumber() {
        return omordNumber;
    }

    public void setOmordNumber(Long omordNumber) {
        this.omordNumber = omordNumber;
    }

    @Basic
    @Column(name = "OMCTL_DistCtrl", nullable = false)
    public Long getOmctlDistCtrl() {
        return omctlDistCtrl;
    }

    public void setOmctlDistCtrl(Long omctlDistCtrl) {
        this.omctlDistCtrl = omctlDistCtrl;
    }

    @Basic
    @Column(name = "OMPYR_Year", nullable = true)
    public Integer getOmpyrYear() {
        return ompyrYear;
    }

    public void setOmpyrYear(Integer ompyrYear) {
        this.ompyrYear = ompyrYear;
    }

    @Basic
    @Column(name = "OMPMO_Month", nullable = true)
    public Integer getOmpmoMonth() {
        return ompmoMonth;
    }

    public void setOmpmoMonth(Integer ompmoMonth) {
        this.ompmoMonth = ompmoMonth;
    }

    @Basic
    @Column(name = "OMODAT_Date", nullable = true, length = 10)
    public String getOmodatDate() {
        return omodatDate;
    }

    public void setOmodatDate(String omodatDate) {
        this.omodatDate = omodatDate;
    }

    @Basic
    @Column(name = "OMDID_DistId", nullable = true)
    public Long getOmdidDistId() {
        return omdidDistId;
    }

    public void setOmdidDistId(Long omdidDistId) {
        this.omdidDistId = omdidDistId;
    }

    @Basic
    @Column(name = "OMPSRP_ProdSrp", nullable = true, precision = 3)
    public BigDecimal getOmpsrpProdSrp() {
        return ompsrpProdSrp;
    }

    public void setOmpsrpProdSrp(BigDecimal ompsrpProdSrp) {
        this.ompsrpProdSrp = ompsrpProdSrp;
    }

    @Basic
    @Column(name = "OMPNDP_ProdNDP", nullable = true, precision = 3)
    public BigDecimal getOmpndpProdNdp() {
        return ompndpProdNdp;
    }

    public void setOmpndpProdNdp(BigDecimal ompndpProdNdp) {
        this.ompndpProdNdp = ompndpProdNdp;
    }

    @Basic
    @Column(name = "OMPWHS_ProdWHS", nullable = true, precision = 3)
    public BigDecimal getOmpwhsProdWhs() {
        return ompwhsProdWhs;
    }

    public void setOmpwhsProdWhs(BigDecimal ompwhsProdWhs) {
        this.ompwhsProdWhs = ompwhsProdWhs;
    }

    @Basic
    @Column(name = "OMTSRP_TotSrp", nullable = true, precision = 3)
    public BigDecimal getOmtsrpTotSrp() {
        return omtsrpTotSrp;
    }

    public void setOmtsrpTotSrp(BigDecimal omtsrpTotSrp) {
        this.omtsrpTotSrp = omtsrpTotSrp;
    }

    @Basic
    @Column(name = "OMPTYP_PriceType", nullable = true, length = 255)
    public String getOmptypPriceType() {
        return omptypPriceType;
    }

    public void setOmptypPriceType(String omptypPriceType) {
        this.omptypPriceType = omptypPriceType;
    }

    @Basic
    @Column(name = "OMCCRD_Credits", nullable = true, precision = 3)
    public BigDecimal getOmccrdCredits() {
        return omccrdCredits;
    }

    public void setOmccrdCredits(BigDecimal omccrdCredits) {
        this.omccrdCredits = omccrdCredits;
    }

    @Basic
    @Column(name = "OMPCAS_PhyCases", nullable = true, precision = 3)
    public BigDecimal getOmpcasPhyCases() {
        return ompcasPhyCases;
    }

    public void setOmpcasPhyCases(BigDecimal ompcasPhyCases) {
        this.ompcasPhyCases = ompcasPhyCases;
    }

    @Basic
    @Column(name = "OMTWHS_TotWhs", nullable = true, precision = 3)
    public BigDecimal getOmtwhsTotWhs() {
        return omtwhsTotWhs;
    }

    public void setOmtwhsTotWhs(BigDecimal omtwhsTotWhs) {
        this.omtwhsTotWhs = omtwhsTotWhs;
    }

    @Basic
    @Column(name = "OMTNDP_TotNdp", nullable = true, precision = 3)
    public BigDecimal getOmtndpTotNdp() {
        return omtndpTotNdp;
    }

    public void setOmtndpTotNdp(BigDecimal omtndpTotNdp) {
        this.omtndpTotNdp = omtndpTotNdp;
    }

    @Basic
    @Column(name = "OMCOID_CompanyCode", nullable = true, length = 255)
    public String getOmcoidCompanyCode() {
        return omcoidCompanyCode;
    }

    public void setOmcoidCompanyCode(String omcoidCompanyCode) {
        this.omcoidCompanyCode = omcoidCompanyCode;
    }

    @Basic
    @Column(name = "OMCTYC_CntryCode", nullable = true)
    public Long getOmctycCntryCode() {
        return omctycCntryCode;
    }

    public void setOmctycCntryCode(Long omctycCntryCode) {
        this.omctycCntryCode = omctycCntryCode;
    }

    @Basic
    @Column(name = "OMCURC_CurrCode", nullable = true, length = 255)
    public String getOmcurcCurrCode() {
        return omcurcCurrCode;
    }

    public void setOmcurcCurrCode(String omcurcCurrCode) {
        this.omcurcCurrCode = omcurcCurrCode;
    }

    @Basic
    @Column(name = "OMDISC_PersonalDiscAmt", nullable = true, precision = 3)
    public BigDecimal getOmdiscPersonalDiscAmt() {
        return omdiscPersonalDiscAmt;
    }

    public void setOmdiscPersonalDiscAmt(BigDecimal omdiscPersonalDiscAmt) {
        this.omdiscPersonalDiscAmt = omdiscPersonalDiscAmt;
    }

    @Basic
    @Column(name = "OMPTAX_ProdTax", nullable = true, precision = 3)
    public BigDecimal getOmptaxProdTax() {
        return omptaxProdTax;
    }

    public void setOmptaxProdTax(BigDecimal omptaxProdTax) {
        this.omptaxProdTax = omptaxProdTax;
    }

    @Basic
    @Column(name = "OMLSRP_LitSrp", nullable = true, precision = 3)
    public BigDecimal getOmlsrpLitSrp() {
        return omlsrpLitSrp;
    }

    public void setOmlsrpLitSrp(BigDecimal omlsrpLitSrp) {
        this.omlsrpLitSrp = omlsrpLitSrp;
    }

    @Basic
    @Column(name = "OMLWHS_LitrWhsCost", nullable = true, precision = 3)
    public BigDecimal getOmlwhsLitrWhsCost() {
        return omlwhsLitrWhsCost;
    }

    public void setOmlwhsLitrWhsCost(BigDecimal omlwhsLitrWhsCost) {
        this.omlwhsLitrWhsCost = omlwhsLitrWhsCost;
    }

    @Basic
    @Column(name = "OMLNDP_LitrNdp", nullable = true, precision = 3)
    public BigDecimal getOmlndpLitrNdp() {
        return omlndpLitrNdp;
    }

    public void setOmlndpLitrNdp(BigDecimal omlndpLitrNdp) {
        this.omlndpLitrNdp = omlndpLitrNdp;
    }

    @Basic
    @Column(name = "OMLTAX_LitrTax", nullable = true, precision = 3)
    public BigDecimal getOmltaxLitrTax() {
        return omltaxLitrTax;
    }

    public void setOmltaxLitrTax(BigDecimal omltaxLitrTax) {
        this.omltaxLitrTax = omltaxLitrTax;
    }

    @Basic
    @Column(name = "OMTSLP_TotSalesPrice", nullable = true, precision = 3)
    public BigDecimal getOmtslpTotSalesPrice() {
        return omtslpTotSalesPrice;
    }

    public void setOmtslpTotSalesPrice(BigDecimal omtslpTotSalesPrice) {
        this.omtslpTotSalesPrice = omtslpTotSalesPrice;
    }

    @Basic
    @Column(name = "OMTTAX_TotTax", nullable = true, precision = 3)
    public BigDecimal getOmttaxTotTax() {
        return omttaxTotTax;
    }

    public void setOmttaxTotTax(BigDecimal omttaxTotTax) {
        this.omttaxTotTax = omttaxTotTax;
    }

    @Basic
    @Column(name = "OMIFEE_ImportFee", nullable = true, precision = 3)
    public BigDecimal getOmifeeImportFee() {
        return omifeeImportFee;
    }

    public void setOmifeeImportFee(BigDecimal omifeeImportFee) {
        this.omifeeImportFee = omifeeImportFee;
    }

    @Basic
    @Column(name = "OMHCHG_ShipHandChg", nullable = true, precision = 3)
    public BigDecimal getOmhchgShipHandChg() {
        return omhchgShipHandChg;
    }

    public void setOmhchgShipHandChg(BigDecimal omhchgShipHandChg) {
        this.omhchgShipHandChg = omhchgShipHandChg;
    }

    @Basic
    @Column(name = "OMWGHT_TotWeight", nullable = true, precision = 3)
    public BigDecimal getOmwghtTotWeight() {
        return omwghtTotWeight;
    }

    public void setOmwghtTotWeight(BigDecimal omwghtTotWeight) {
        this.omwghtTotWeight = omwghtTotWeight;
    }

    @Basic
    @Column(name = "OMSHIP_ShippingCharge", nullable = true, precision = 3)
    public BigDecimal getOmshipShippingCharge() {
        return omshipShippingCharge;
    }

    public void setOmshipShippingCharge(BigDecimal omshipShippingCharge) {
        this.omshipShippingCharge = omshipShippingCharge;
    }

    @Basic
    @Column(name = "OMHAND_HandlingCharge", nullable = true, precision = 3)
    public BigDecimal getOmhandHandlingCharge() {
        return omhandHandlingCharge;
    }

    public void setOmhandHandlingCharge(BigDecimal omhandHandlingCharge) {
        this.omhandHandlingCharge = omhandHandlingCharge;
    }

    @Basic
    @Column(name = "OMAREA_DistArea", nullable = true)
    public Long getOmareaDistArea() {
        return omareaDistArea;
    }

    public void setOmareaDistArea(Long omareaDistArea) {
        this.omareaDistArea = omareaDistArea;
    }

    @Basic
    @Column(name = "OMPARA_PurchaseArea", nullable = true)
    public Long getOmparaPurchaseArea() {
        return omparaPurchaseArea;
    }

    public void setOmparaPurchaseArea(Long omparaPurchaseArea) {
        this.omparaPurchaseArea = omparaPurchaseArea;
    }

    @Basic
    @Column(name = "OMENV_EnvNum", nullable = true)
    public Long getOmenvEnvNum() {
        return omenvEnvNum;
    }

    public void setOmenvEnvNum(Long omenvEnvNum) {
        this.omenvEnvNum = omenvEnvNum;
    }

    @Basic
    @Column(name = "OMDATE_LastChangeDate", nullable = true, length = 10)
    public String getOmdateLastChangeDate() {
        return omdateLastChangeDate;
    }

    public void setOmdateLastChangeDate(String omdateLastChangeDate) {
        this.omdateLastChangeDate = omdateLastChangeDate;
    }

    @Basic
    @Column(name = "OMUSER_LastChangeUser", nullable = true, length = 255)
    public String getOmuserLastChangeUser() {
        return omuserLastChangeUser;
    }

    public void setOmuserLastChangeUser(String omuserLastChangeUser) {
        this.omuserLastChangeUser = omuserLastChangeUser;
    }

    @Basic
    @Column(name = "OMTXBL_NetTaxAmt", nullable = true, precision = 3)
    public BigDecimal getOmtxblNetTaxAmt() {
        return omtxblNetTaxAmt;
    }

    public void setOmtxblNetTaxAmt(BigDecimal omtxblNetTaxAmt) {
        this.omtxblNetTaxAmt = omtxblNetTaxAmt;
    }

    @Basic
    @Column(name = "OMNTXB_NetNonTaxAmt", nullable = true, precision = 3)
    public BigDecimal getOmntxbNetNonTaxAmt() {
        return omntxbNetNonTaxAmt;
    }

    public void setOmntxbNetNonTaxAmt(BigDecimal omntxbNetNonTaxAmt) {
        this.omntxbNetNonTaxAmt = omntxbNetNonTaxAmt;
    }

    @Basic
    @Column(name = "OMGMBN_PayGMASMBON", nullable = true, length = 1)
    public String getOmgmbnPayGmasmbon() {
        return omgmbnPayGmasmbon;
    }

    public void setOmgmbnPayGmasmbon(String omgmbnPayGmasmbon) {
        this.omgmbnPayGmasmbon = omgmbnPayGmasmbon;
    }

    @Basic
    @Column(name = "OMDM_DistMgrId", nullable = true)
    public Long getOmdmDistMgrId() {
        return omdmDistMgrId;
    }

    public void setOmdmDistMgrId(Long omdmDistMgrId) {
        this.omdmDistMgrId = omdmDistMgrId;
    }

    @Basic
    @Column(name = "OMNTXF_NonTaxFlag", nullable = true, length = 1)
    public String getOmntxfNonTaxFlag() {
        return omntxfNonTaxFlag;
    }

    public void setOmntxfNonTaxFlag(String omntxfNonTaxFlag) {
        this.omntxfNonTaxFlag = omntxfNonTaxFlag;
    }

    @Basic
    @Column(name = "OMORDS_OrderSrcCode", nullable = false)
    public Long getOmordsOrderSrcCode() {
        return omordsOrderSrcCode;
    }

    public void setOmordsOrderSrcCode(Long omordsOrderSrcCode) {
        this.omordsOrderSrcCode = omordsOrderSrcCode;
    }

    @Basic
    @Column(name = "OMSHPS_ShippingSrcCode", nullable = false)
    public Long getOmshpsShippingSrcCode() {
        return omshpsShippingSrcCode;
    }

    public void setOmshpsShippingSrcCode(Long omshpsShippingSrcCode) {
        this.omshpsShippingSrcCode = omshpsShippingSrcCode;
    }

    @Basic
    @Column(name = "OMOTYP_OrderTypeCode", nullable = false)
    public Long getOmotypOrderTypeCode() {
        return omotypOrderTypeCode;
    }

    public void setOmotypOrderTypeCode(Long omotypOrderTypeCode) {
        this.omotypOrderTypeCode = omotypOrderTypeCode;
    }

    @Basic
    @Column(name = "OMJDEF_JDEFlag", nullable = true, length = 1)
    public String getOmjdefJdeFlag() {
        return omjdefJdeFlag;
    }

    public void setOmjdefJdeFlag(String omjdefJdeFlag) {
        this.omjdefJdeFlag = omjdefJdeFlag;
    }

    @Basic
    @Column(name = "OMNDPF_NDPFlag", nullable = true, length = 1)
    public String getOmndpfNdpFlag() {
        return omndpfNdpFlag;
    }

    public void setOmndpfNdpFlag(String omndpfNdpFlag) {
        this.omndpfNdpFlag = omndpfNdpFlag;
    }

    @Basic
    @Column(name = "OMWEB_WebNum", nullable = true, length = 255)
    public String getOmwebWebNum() {
        return omwebWebNum;
    }

    public void setOmwebWebNum(String omwebWebNum) {
        this.omwebWebNum = omwebWebNum;
    }

    @Basic
    @Column(name = "OMEXRT_CurrExchRate", nullable = true, precision = 3)
    public BigDecimal getOmexrtCurrExchRate() {
        return omexrtCurrExchRate;
    }

    public void setOmexrtCurrExchRate(BigDecimal omexrtCurrExchRate) {
        this.omexrtCurrExchRate = omexrtCurrExchRate;
    }

    @Basic
    @Column(name = "OMEDTE_EntryTimeStamp", nullable = true, length = 255)
    public String getOmedteEntryTimeStamp() {
        return omedteEntryTimeStamp;
    }

    public void setOmedteEntryTimeStamp(String omedteEntryTimeStamp) {
        this.omedteEntryTimeStamp = omedteEntryTimeStamp;
    }

    @Basic
    @Column(name = "OMCDTE_ChangeTimeStamp", nullable = true, length = 255)
    public String getOmcdteChangeTimeStamp() {
        return omcdteChangeTimeStamp;
    }

    public void setOmcdteChangeTimeStamp(String omcdteChangeTimeStamp) {
        this.omcdteChangeTimeStamp = omcdteChangeTimeStamp;
    }

    @Basic
    @Column(name = "OMDBAL_DiscBalConsumed", nullable = true, precision = 3)
    public BigDecimal getOmdbalDiscBalConsumed() {
        return omdbalDiscBalConsumed;
    }

    public void setOmdbalDiscBalConsumed(BigDecimal omdbalDiscBalConsumed) {
        this.omdbalDiscBalConsumed = omdbalDiscBalConsumed;
    }

    @Basic
    @Column(name = "OMDPCT_PerDiscPerc", nullable = true, precision = 3)
    public BigDecimal getOmdpctPerDiscPerc() {
        return omdpctPerDiscPerc;
    }

    public void setOmdpctPerDiscPerc(BigDecimal omdpctPerDiscPerc) {
        this.omdpctPerDiscPerc = omdpctPerDiscPerc;
    }

    @Basic
    @Column(name = "OMDTRN_PerDiscTran", nullable = true)
    public Long getOmdtrnPerDiscTran() {
        return omdtrnPerDiscTran;
    }

    public void setOmdtrnPerDiscTran(Long omdtrnPerDiscTran) {
        this.omdtrnPerDiscTran = omdtrnPerDiscTran;
    }

    @Basic
    @Column(name = "OMGFLG_GenericFlag", nullable = true, length = 1)
    public String getOmgflgGenericFlag() {
        return omgflgGenericFlag;
    }

    public void setOmgflgGenericFlag(String omgflgGenericFlag) {
        this.omgflgGenericFlag = omgflgGenericFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrmstpOrder that = (OrmstpOrder) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (omordNumber != null ? !omordNumber.equals(that.omordNumber) : that.omordNumber != null) return false;
        if (omctlDistCtrl != null ? !omctlDistCtrl.equals(that.omctlDistCtrl) : that.omctlDistCtrl != null)
            return false;
        if (ompyrYear != null ? !ompyrYear.equals(that.ompyrYear) : that.ompyrYear != null) return false;
        if (ompmoMonth != null ? !ompmoMonth.equals(that.ompmoMonth) : that.ompmoMonth != null) return false;
        if (omodatDate != null ? !omodatDate.equals(that.omodatDate) : that.omodatDate != null) return false;
        if (omdidDistId != null ? !omdidDistId.equals(that.omdidDistId) : that.omdidDistId != null) return false;
        if (ompsrpProdSrp != null ? !ompsrpProdSrp.equals(that.ompsrpProdSrp) : that.ompsrpProdSrp != null)
            return false;
        if (ompndpProdNdp != null ? !ompndpProdNdp.equals(that.ompndpProdNdp) : that.ompndpProdNdp != null)
            return false;
        if (ompwhsProdWhs != null ? !ompwhsProdWhs.equals(that.ompwhsProdWhs) : that.ompwhsProdWhs != null)
            return false;
        if (omtsrpTotSrp != null ? !omtsrpTotSrp.equals(that.omtsrpTotSrp) : that.omtsrpTotSrp != null) return false;
        if (omptypPriceType != null ? !omptypPriceType.equals(that.omptypPriceType) : that.omptypPriceType != null)
            return false;
        if (omccrdCredits != null ? !omccrdCredits.equals(that.omccrdCredits) : that.omccrdCredits != null)
            return false;
        if (ompcasPhyCases != null ? !ompcasPhyCases.equals(that.ompcasPhyCases) : that.ompcasPhyCases != null)
            return false;
        if (omtwhsTotWhs != null ? !omtwhsTotWhs.equals(that.omtwhsTotWhs) : that.omtwhsTotWhs != null) return false;
        if (omtndpTotNdp != null ? !omtndpTotNdp.equals(that.omtndpTotNdp) : that.omtndpTotNdp != null) return false;
        if (omcoidCompanyCode != null ? !omcoidCompanyCode.equals(that.omcoidCompanyCode) : that.omcoidCompanyCode != null)
            return false;
        if (omctycCntryCode != null ? !omctycCntryCode.equals(that.omctycCntryCode) : that.omctycCntryCode != null)
            return false;
        if (omcurcCurrCode != null ? !omcurcCurrCode.equals(that.omcurcCurrCode) : that.omcurcCurrCode != null)
            return false;
        if (omdiscPersonalDiscAmt != null ? !omdiscPersonalDiscAmt.equals(that.omdiscPersonalDiscAmt) : that.omdiscPersonalDiscAmt != null)
            return false;
        if (omptaxProdTax != null ? !omptaxProdTax.equals(that.omptaxProdTax) : that.omptaxProdTax != null)
            return false;
        if (omlsrpLitSrp != null ? !omlsrpLitSrp.equals(that.omlsrpLitSrp) : that.omlsrpLitSrp != null) return false;
        if (omlwhsLitrWhsCost != null ? !omlwhsLitrWhsCost.equals(that.omlwhsLitrWhsCost) : that.omlwhsLitrWhsCost != null)
            return false;
        if (omlndpLitrNdp != null ? !omlndpLitrNdp.equals(that.omlndpLitrNdp) : that.omlndpLitrNdp != null)
            return false;
        if (omltaxLitrTax != null ? !omltaxLitrTax.equals(that.omltaxLitrTax) : that.omltaxLitrTax != null)
            return false;
        if (omtslpTotSalesPrice != null ? !omtslpTotSalesPrice.equals(that.omtslpTotSalesPrice) : that.omtslpTotSalesPrice != null)
            return false;
        if (omttaxTotTax != null ? !omttaxTotTax.equals(that.omttaxTotTax) : that.omttaxTotTax != null) return false;
        if (omifeeImportFee != null ? !omifeeImportFee.equals(that.omifeeImportFee) : that.omifeeImportFee != null)
            return false;
        if (omhchgShipHandChg != null ? !omhchgShipHandChg.equals(that.omhchgShipHandChg) : that.omhchgShipHandChg != null)
            return false;
        if (omwghtTotWeight != null ? !omwghtTotWeight.equals(that.omwghtTotWeight) : that.omwghtTotWeight != null)
            return false;
        if (omshipShippingCharge != null ? !omshipShippingCharge.equals(that.omshipShippingCharge) : that.omshipShippingCharge != null)
            return false;
        if (omhandHandlingCharge != null ? !omhandHandlingCharge.equals(that.omhandHandlingCharge) : that.omhandHandlingCharge != null)
            return false;
        if (omareaDistArea != null ? !omareaDistArea.equals(that.omareaDistArea) : that.omareaDistArea != null)
            return false;
        if (omparaPurchaseArea != null ? !omparaPurchaseArea.equals(that.omparaPurchaseArea) : that.omparaPurchaseArea != null)
            return false;
        if (omenvEnvNum != null ? !omenvEnvNum.equals(that.omenvEnvNum) : that.omenvEnvNum != null) return false;
        if (omdateLastChangeDate != null ? !omdateLastChangeDate.equals(that.omdateLastChangeDate) : that.omdateLastChangeDate != null)
            return false;
        if (omuserLastChangeUser != null ? !omuserLastChangeUser.equals(that.omuserLastChangeUser) : that.omuserLastChangeUser != null)
            return false;
        if (omtxblNetTaxAmt != null ? !omtxblNetTaxAmt.equals(that.omtxblNetTaxAmt) : that.omtxblNetTaxAmt != null)
            return false;
        if (omntxbNetNonTaxAmt != null ? !omntxbNetNonTaxAmt.equals(that.omntxbNetNonTaxAmt) : that.omntxbNetNonTaxAmt != null)
            return false;
        if (omgmbnPayGmasmbon != null ? !omgmbnPayGmasmbon.equals(that.omgmbnPayGmasmbon) : that.omgmbnPayGmasmbon != null)
            return false;
        if (omdmDistMgrId != null ? !omdmDistMgrId.equals(that.omdmDistMgrId) : that.omdmDistMgrId != null)
            return false;
        if (omntxfNonTaxFlag != null ? !omntxfNonTaxFlag.equals(that.omntxfNonTaxFlag) : that.omntxfNonTaxFlag != null)
            return false;
        if (omordsOrderSrcCode != null ? !omordsOrderSrcCode.equals(that.omordsOrderSrcCode) : that.omordsOrderSrcCode != null)
            return false;
        if (omshpsShippingSrcCode != null ? !omshpsShippingSrcCode.equals(that.omshpsShippingSrcCode) : that.omshpsShippingSrcCode != null)
            return false;
        if (omotypOrderTypeCode != null ? !omotypOrderTypeCode.equals(that.omotypOrderTypeCode) : that.omotypOrderTypeCode != null)
            return false;
        if (omjdefJdeFlag != null ? !omjdefJdeFlag.equals(that.omjdefJdeFlag) : that.omjdefJdeFlag != null)
            return false;
        if (omndpfNdpFlag != null ? !omndpfNdpFlag.equals(that.omndpfNdpFlag) : that.omndpfNdpFlag != null)
            return false;
        if (omwebWebNum != null ? !omwebWebNum.equals(that.omwebWebNum) : that.omwebWebNum != null) return false;
        if (omexrtCurrExchRate != null ? !omexrtCurrExchRate.equals(that.omexrtCurrExchRate) : that.omexrtCurrExchRate != null)
            return false;
        if (omedteEntryTimeStamp != null ? !omedteEntryTimeStamp.equals(that.omedteEntryTimeStamp) : that.omedteEntryTimeStamp != null)
            return false;
        if (omcdteChangeTimeStamp != null ? !omcdteChangeTimeStamp.equals(that.omcdteChangeTimeStamp) : that.omcdteChangeTimeStamp != null)
            return false;
        if (omdbalDiscBalConsumed != null ? !omdbalDiscBalConsumed.equals(that.omdbalDiscBalConsumed) : that.omdbalDiscBalConsumed != null)
            return false;
        if (omdpctPerDiscPerc != null ? !omdpctPerDiscPerc.equals(that.omdpctPerDiscPerc) : that.omdpctPerDiscPerc != null)
            return false;
        if (omdtrnPerDiscTran != null ? !omdtrnPerDiscTran.equals(that.omdtrnPerDiscTran) : that.omdtrnPerDiscTran != null)
            return false;
        if (omgflgGenericFlag != null ? !omgflgGenericFlag.equals(that.omgflgGenericFlag) : that.omgflgGenericFlag != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (omordNumber != null ? omordNumber.hashCode() : 0);
        result = 31 * result + (omctlDistCtrl != null ? omctlDistCtrl.hashCode() : 0);
        result = 31 * result + (ompyrYear != null ? ompyrYear.hashCode() : 0);
        result = 31 * result + (ompmoMonth != null ? ompmoMonth.hashCode() : 0);
        result = 31 * result + (omodatDate != null ? omodatDate.hashCode() : 0);
        result = 31 * result + (omdidDistId != null ? omdidDistId.hashCode() : 0);
        result = 31 * result + (ompsrpProdSrp != null ? ompsrpProdSrp.hashCode() : 0);
        result = 31 * result + (ompndpProdNdp != null ? ompndpProdNdp.hashCode() : 0);
        result = 31 * result + (ompwhsProdWhs != null ? ompwhsProdWhs.hashCode() : 0);
        result = 31 * result + (omtsrpTotSrp != null ? omtsrpTotSrp.hashCode() : 0);
        result = 31 * result + (omptypPriceType != null ? omptypPriceType.hashCode() : 0);
        result = 31 * result + (omccrdCredits != null ? omccrdCredits.hashCode() : 0);
        result = 31 * result + (ompcasPhyCases != null ? ompcasPhyCases.hashCode() : 0);
        result = 31 * result + (omtwhsTotWhs != null ? omtwhsTotWhs.hashCode() : 0);
        result = 31 * result + (omtndpTotNdp != null ? omtndpTotNdp.hashCode() : 0);
        result = 31 * result + (omcoidCompanyCode != null ? omcoidCompanyCode.hashCode() : 0);
        result = 31 * result + (omctycCntryCode != null ? omctycCntryCode.hashCode() : 0);
        result = 31 * result + (omcurcCurrCode != null ? omcurcCurrCode.hashCode() : 0);
        result = 31 * result + (omdiscPersonalDiscAmt != null ? omdiscPersonalDiscAmt.hashCode() : 0);
        result = 31 * result + (omptaxProdTax != null ? omptaxProdTax.hashCode() : 0);
        result = 31 * result + (omlsrpLitSrp != null ? omlsrpLitSrp.hashCode() : 0);
        result = 31 * result + (omlwhsLitrWhsCost != null ? omlwhsLitrWhsCost.hashCode() : 0);
        result = 31 * result + (omlndpLitrNdp != null ? omlndpLitrNdp.hashCode() : 0);
        result = 31 * result + (omltaxLitrTax != null ? omltaxLitrTax.hashCode() : 0);
        result = 31 * result + (omtslpTotSalesPrice != null ? omtslpTotSalesPrice.hashCode() : 0);
        result = 31 * result + (omttaxTotTax != null ? omttaxTotTax.hashCode() : 0);
        result = 31 * result + (omifeeImportFee != null ? omifeeImportFee.hashCode() : 0);
        result = 31 * result + (omhchgShipHandChg != null ? omhchgShipHandChg.hashCode() : 0);
        result = 31 * result + (omwghtTotWeight != null ? omwghtTotWeight.hashCode() : 0);
        result = 31 * result + (omshipShippingCharge != null ? omshipShippingCharge.hashCode() : 0);
        result = 31 * result + (omhandHandlingCharge != null ? omhandHandlingCharge.hashCode() : 0);
        result = 31 * result + (omareaDistArea != null ? omareaDistArea.hashCode() : 0);
        result = 31 * result + (omparaPurchaseArea != null ? omparaPurchaseArea.hashCode() : 0);
        result = 31 * result + (omenvEnvNum != null ? omenvEnvNum.hashCode() : 0);
        result = 31 * result + (omdateLastChangeDate != null ? omdateLastChangeDate.hashCode() : 0);
        result = 31 * result + (omuserLastChangeUser != null ? omuserLastChangeUser.hashCode() : 0);
        result = 31 * result + (omtxblNetTaxAmt != null ? omtxblNetTaxAmt.hashCode() : 0);
        result = 31 * result + (omntxbNetNonTaxAmt != null ? omntxbNetNonTaxAmt.hashCode() : 0);
        result = 31 * result + (omgmbnPayGmasmbon != null ? omgmbnPayGmasmbon.hashCode() : 0);
        result = 31 * result + (omdmDistMgrId != null ? omdmDistMgrId.hashCode() : 0);
        result = 31 * result + (omntxfNonTaxFlag != null ? omntxfNonTaxFlag.hashCode() : 0);
        result = 31 * result + (omordsOrderSrcCode != null ? omordsOrderSrcCode.hashCode() : 0);
        result = 31 * result + (omshpsShippingSrcCode != null ? omshpsShippingSrcCode.hashCode() : 0);
        result = 31 * result + (omotypOrderTypeCode != null ? omotypOrderTypeCode.hashCode() : 0);
        result = 31 * result + (omjdefJdeFlag != null ? omjdefJdeFlag.hashCode() : 0);
        result = 31 * result + (omndpfNdpFlag != null ? omndpfNdpFlag.hashCode() : 0);
        result = 31 * result + (omwebWebNum != null ? omwebWebNum.hashCode() : 0);
        result = 31 * result + (omexrtCurrExchRate != null ? omexrtCurrExchRate.hashCode() : 0);
        result = 31 * result + (omedteEntryTimeStamp != null ? omedteEntryTimeStamp.hashCode() : 0);
        result = 31 * result + (omcdteChangeTimeStamp != null ? omcdteChangeTimeStamp.hashCode() : 0);
        result = 31 * result + (omdbalDiscBalConsumed != null ? omdbalDiscBalConsumed.hashCode() : 0);
        result = 31 * result + (omdpctPerDiscPerc != null ? omdpctPerDiscPerc.hashCode() : 0);
        result = 31 * result + (omdtrnPerDiscTran != null ? omdtrnPerDiscTran.hashCode() : 0);
        result = 31 * result + (omgflgGenericFlag != null ? omgflgGenericFlag.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"OrmstpOrder\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"omordNumber\":\"" + omordNumber + "\""
                + ",                         \"omctlDistCtrl\":\"" + omctlDistCtrl + "\""
                + ",                         \"ompyrYear\":\"" + ompyrYear + "\""
                + ",                         \"ompmoMonth\":\"" + ompmoMonth + "\""
                + ",                         \"omodatDate\":\"" + omodatDate + "\""
                + ",                         \"omdidDistId\":\"" + omdidDistId + "\""
                + ",                         \"ompsrpProdSrp\":\"" + ompsrpProdSrp + "\""
                + ",                         \"ompndpProdNdp\":\"" + ompndpProdNdp + "\""
                + ",                         \"ompwhsProdWhs\":\"" + ompwhsProdWhs + "\""
                + ",                         \"omtsrpTotSrp\":\"" + omtsrpTotSrp + "\""
                + ",                         \"omptypPriceType\":\"" + omptypPriceType + "\""
                + ",                         \"omccrdCredits\":\"" + omccrdCredits + "\""
                + ",                         \"ompcasPhyCases\":\"" + ompcasPhyCases + "\""
                + ",                         \"omtwhsTotWhs\":\"" + omtwhsTotWhs + "\""
                + ",                         \"omtndpTotNdp\":\"" + omtndpTotNdp + "\""
                + ",                         \"omcoidCompanyCode\":\"" + omcoidCompanyCode + "\""
                + ",                         \"omctycCntryCode\":\"" + omctycCntryCode + "\""
                + ",                         \"omcurcCurrCode\":\"" + omcurcCurrCode + "\""
                + ",                         \"omdiscPersonalDiscAmt\":\"" + omdiscPersonalDiscAmt + "\""
                + ",                         \"omptaxProdTax\":\"" + omptaxProdTax + "\""
                + ",                         \"omlsrpLitSrp\":\"" + omlsrpLitSrp + "\""
                + ",                         \"omlwhsLitrWhsCost\":\"" + omlwhsLitrWhsCost + "\""
                + ",                         \"omlndpLitrNdp\":\"" + omlndpLitrNdp + "\""
                + ",                         \"omltaxLitrTax\":\"" + omltaxLitrTax + "\""
                + ",                         \"omtslpTotSalesPrice\":\"" + omtslpTotSalesPrice + "\""
                + ",                         \"omttaxTotTax\":\"" + omttaxTotTax + "\""
                + ",                         \"omifeeImportFee\":\"" + omifeeImportFee + "\""
                + ",                         \"omhchgShipHandChg\":\"" + omhchgShipHandChg + "\""
                + ",                         \"omwghtTotWeight\":\"" + omwghtTotWeight + "\""
                + ",                         \"omshipShippingCharge\":\"" + omshipShippingCharge + "\""
                + ",                         \"omhandHandlingCharge\":\"" + omhandHandlingCharge + "\""
                + ",                         \"omareaDistArea\":\"" + omareaDistArea + "\""
                + ",                         \"omparaPurchaseArea\":\"" + omparaPurchaseArea + "\""
                + ",                         \"omenvEnvNum\":\"" + omenvEnvNum + "\""
                + ",                         \"omdateLastChangeDate\":\"" + omdateLastChangeDate + "\""
                + ",                         \"omuserLastChangeUser\":\"" + omuserLastChangeUser + "\""
                + ",                         \"omtxblNetTaxAmt\":\"" + omtxblNetTaxAmt + "\""
                + ",                         \"omntxbNetNonTaxAmt\":\"" + omntxbNetNonTaxAmt + "\""
                + ",                         \"omgmbnPayGmasmbon\":\"" + omgmbnPayGmasmbon + "\""
                + ",                         \"omdmDistMgrId\":\"" + omdmDistMgrId + "\""
                + ",                         \"omntxfNonTaxFlag\":\"" + omntxfNonTaxFlag + "\""
                + ",                         \"omordsOrderSrcCode\":\"" + omordsOrderSrcCode + "\""
                + ",                         \"omshpsShippingSrcCode\":\"" + omshpsShippingSrcCode + "\""
                + ",                         \"omotypOrderTypeCode\":\"" + omotypOrderTypeCode + "\""
                + ",                         \"omjdefJdeFlag\":\"" + omjdefJdeFlag + "\""
                + ",                         \"omndpfNdpFlag\":\"" + omndpfNdpFlag + "\""
                + ",                         \"omwebWebNum\":\"" + omwebWebNum + "\""
                + ",                         \"omexrtCurrExchRate\":\"" + omexrtCurrExchRate + "\""
                + ",                         \"omedteEntryTimeStamp\":\"" + omedteEntryTimeStamp + "\""
                + ",                         \"omcdteChangeTimeStamp\":\"" + omcdteChangeTimeStamp + "\""
                + ",                         \"omdbalDiscBalConsumed\":\"" + omdbalDiscBalConsumed + "\""
                + ",                         \"omdpctPerDiscPerc\":\"" + omdpctPerDiscPerc + "\""
                + ",                         \"omdtrnPerDiscTran\":\"" + omdtrnPerDiscTran + "\""
                + ",                         \"omgflgGenericFlag\":\"" + omgflgGenericFlag + "\""
                + "}}";
    }
}
