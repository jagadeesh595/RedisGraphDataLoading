package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("FLCMPP_CompanyConfig")
public class FlcmppCompanyConfig implements Serializable {
    private   Long id;
    private @Indexed
    String flcoidCompanyCode;
    private @Indexed  String flcmpnCompanyName;
    private @Indexed  String flcmshShortCmpnyName;
    private @Indexed  String flstatStateCode;
    private @Indexed  String flcntyCountryCode;
    private @Indexed  String flcurrCurrencySymbol;
    private @Indexed  String flcrvbCurrencyVerbage;
    private @Indexed  Integer fldecpDecimalPosition;
    private @Indexed  BigDecimal flcrncCurrencyCasCre;
    private @Indexed  String fllbedLbBonEffDate;
    private @Indexed  String flgfedGrandFatherEffDate;
    private @Indexed  BigDecimal fldwthDomWhPct;
    private @Indexed  BigDecimal flfwthForiegnWhPct;
    private @Indexed  String flcmcnCmpnyNameCenter;
    private @Indexed  String fladd1AddrLine1;
    private @Indexed  String fladd2AddrLine3;
    private @Indexed  String fladd3AddrLine4;
    private @Indexed  String fladd4AddrLine5;
    private @Indexed  String flcityCity;
    private @Indexed  String flzipcZipCode;
    private @Indexed  Long flphonPhoneNum;
    private @Indexed  String flfnamCfoFrstName;
    private @Indexed  String fllnamCfoLastName;
    private @Indexed  String flalbtAllowBottleProc;
    private @Indexed  String flcorcCCorCurrency;
    private @Indexed  String flmnamMerchName;
    private @Indexed  String flmacMerchAcct;
    private @Indexed  Long flmdcManagingDirCtrl;
    private @Indexed  String fldfmtDateDispFrmt;
    private @Indexed  Integer flfm01EarningsOne;
    private @Indexed  Integer flfm02ProfitSharing;
    private @Indexed  Integer flfm03MonthEndReports;
    private @Indexed  Integer flfm04EarnedRallyTrips;
    private @Indexed  Integer flfm05FutureOne;
    private @Indexed  Integer flfm06FutureTwo;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "FLCOID_CompanyCode", nullable = false, length = 255)
    public String getFlcoidCompanyCode() {
        return flcoidCompanyCode;
    }

    public void setFlcoidCompanyCode(String flcoidCompanyCode) {
        this.flcoidCompanyCode = flcoidCompanyCode;
    }

    // @Basic
    // @Column(name = "FLCMPN_CompanyName", nullable = true, length = 255)
    public String getFlcmpnCompanyName() {
        return flcmpnCompanyName;
    }

    public void setFlcmpnCompanyName(String flcmpnCompanyName) {
        this.flcmpnCompanyName = flcmpnCompanyName;
    }

    // @Basic
    // @Column(name = "FLCMSH_ShortCmpnyName", nullable = true, length = 255)
    public String getFlcmshShortCmpnyName() {
        return flcmshShortCmpnyName;
    }

    public void setFlcmshShortCmpnyName(String flcmshShortCmpnyName) {
        this.flcmshShortCmpnyName = flcmshShortCmpnyName;
    }

    // @Basic
    // @Column(name = "FLSTAT_StateCode", nullable = true, length = 255)
    public String getFlstatStateCode() {
        return flstatStateCode;
    }

    public void setFlstatStateCode(String flstatStateCode) {
        this.flstatStateCode = flstatStateCode;
    }

    // @Basic
    // @Column(name = "FLCNTY_CountryCode", nullable = true, length = 15)
    public String getFlcntyCountryCode() {
        return flcntyCountryCode;
    }

    public void setFlcntyCountryCode(String flcntyCountryCode) {
        this.flcntyCountryCode = flcntyCountryCode;
    }

    // @Basic
    // @Column(name = "FLCURR_CurrencySymbol", nullable = true, length = 255)
    public String getFlcurrCurrencySymbol() {
        return flcurrCurrencySymbol;
    }

    public void setFlcurrCurrencySymbol(String flcurrCurrencySymbol) {
        this.flcurrCurrencySymbol = flcurrCurrencySymbol;
    }

    // @Basic
    // @Column(name = "FLCRVB_CurrencyVerbage", nullable = true, length = 255)
    public String getFlcrvbCurrencyVerbage() {
        return flcrvbCurrencyVerbage;
    }

    public void setFlcrvbCurrencyVerbage(String flcrvbCurrencyVerbage) {
        this.flcrvbCurrencyVerbage = flcrvbCurrencyVerbage;
    }

    // @Basic
    // @Column(name = "FLDECP_DecimalPosition", nullable = true)
    public Integer getFldecpDecimalPosition() {
        return fldecpDecimalPosition;
    }

    public void setFldecpDecimalPosition(Integer fldecpDecimalPosition) {
        this.fldecpDecimalPosition = fldecpDecimalPosition;
    }

    // @Basic
    // @Column(name = "FLCRNC_CurrencyCasCre", nullable = true, precision = 3)
    public BigDecimal getFlcrncCurrencyCasCre() {
        return flcrncCurrencyCasCre;
    }

    public void setFlcrncCurrencyCasCre(BigDecimal flcrncCurrencyCasCre) {
        this.flcrncCurrencyCasCre = flcrncCurrencyCasCre;
    }

    // @Basic
    // @Column(name = "FLLBED_LBBonEffDate", nullable = true, length = 10)
    public String getFllbedLbBonEffDate() {
        return fllbedLbBonEffDate;
    }

    public void setFllbedLbBonEffDate(String fllbedLbBonEffDate) {
        this.fllbedLbBonEffDate = fllbedLbBonEffDate;
    }

    // @Basic
    // @Column(name = "FLGFED_GrandFatherEffDate", nullable = true, length = 10)
    public String getFlgfedGrandFatherEffDate() {
        return flgfedGrandFatherEffDate;
    }

    public void setFlgfedGrandFatherEffDate(String flgfedGrandFatherEffDate) {
        this.flgfedGrandFatherEffDate = flgfedGrandFatherEffDate;
    }

    // @Basic
    // @Column(name = "FLDWTH_DomWHPct", nullable = true, precision = 3)
    public BigDecimal getFldwthDomWhPct() {
        return fldwthDomWhPct;
    }

    public void setFldwthDomWhPct(BigDecimal fldwthDomWhPct) {
        this.fldwthDomWhPct = fldwthDomWhPct;
    }

    // @Basic
    // @Column(name = "FLFWTH_ForiegnWHPct", nullable = true, precision = 3)
    public BigDecimal getFlfwthForiegnWhPct() {
        return flfwthForiegnWhPct;
    }

    public void setFlfwthForiegnWhPct(BigDecimal flfwthForiegnWhPct) {
        this.flfwthForiegnWhPct = flfwthForiegnWhPct;
    }

    // @Basic
    // @Column(name = "FLCMCN_CmpnyNameCenter", nullable = true, length = 255)
    public String getFlcmcnCmpnyNameCenter() {
        return flcmcnCmpnyNameCenter;
    }

    public void setFlcmcnCmpnyNameCenter(String flcmcnCmpnyNameCenter) {
        this.flcmcnCmpnyNameCenter = flcmcnCmpnyNameCenter;
    }

    // @Basic
    // @Column(name = "FLADD1_AddrLine1", nullable = true, length = 255)
    public String getFladd1AddrLine1() {
        return fladd1AddrLine1;
    }

    public void setFladd1AddrLine1(String fladd1AddrLine1) {
        this.fladd1AddrLine1 = fladd1AddrLine1;
    }

    // @Basic
    // @Column(name = "FLADD2_AddrLine3", nullable = true, length = 255)
    public String getFladd2AddrLine3() {
        return fladd2AddrLine3;
    }

    public void setFladd2AddrLine3(String fladd2AddrLine3) {
        this.fladd2AddrLine3 = fladd2AddrLine3;
    }

    // @Basic
    // @Column(name = "FLADD3_AddrLine4", nullable = true, length = 255)
    public String getFladd3AddrLine4() {
        return fladd3AddrLine4;
    }

    public void setFladd3AddrLine4(String fladd3AddrLine4) {
        this.fladd3AddrLine4 = fladd3AddrLine4;
    }

    // @Basic
    // @Column(name = "FLADD4_AddrLine5", nullable = true, length = 255)
    public String getFladd4AddrLine5() {
        return fladd4AddrLine5;
    }

    public void setFladd4AddrLine5(String fladd4AddrLine5) {
        this.fladd4AddrLine5 = fladd4AddrLine5;
    }

    // @Basic
    // @Column(name = "FLCITY_City", nullable = true, length = 255)
    public String getFlcityCity() {
        return flcityCity;
    }

    public void setFlcityCity(String flcityCity) {
        this.flcityCity = flcityCity;
    }

    // @Basic
    // @Column(name = "FLZIPC_ZipCode", nullable = true, length = 255)
    public String getFlzipcZipCode() {
        return flzipcZipCode;
    }

    public void setFlzipcZipCode(String flzipcZipCode) {
        this.flzipcZipCode = flzipcZipCode;
    }

    // @Basic
    // @Column(name = "FLPHON_PhoneNum", nullable = true)
    public Long getFlphonPhoneNum() {
        return flphonPhoneNum;
    }

    public void setFlphonPhoneNum(Long flphonPhoneNum) {
        this.flphonPhoneNum = flphonPhoneNum;
    }

    // @Basic
    // @Column(name = "FLFNAM_CFOFrstName", nullable = true, length = 255)
    public String getFlfnamCfoFrstName() {
        return flfnamCfoFrstName;
    }

    public void setFlfnamCfoFrstName(String flfnamCfoFrstName) {
        this.flfnamCfoFrstName = flfnamCfoFrstName;
    }

    // @Basic
    // @Column(name = "FLLNAM_CFOLastName", nullable = true, length = 255)
    public String getFllnamCfoLastName() {
        return fllnamCfoLastName;
    }

    public void setFllnamCfoLastName(String fllnamCfoLastName) {
        this.fllnamCfoLastName = fllnamCfoLastName;
    }

    // @Basic
    // @Column(name = "FLALBT_AllowBottleProc", nullable = true, length = 255)
    public String getFlalbtAllowBottleProc() {
        return flalbtAllowBottleProc;
    }

    public void setFlalbtAllowBottleProc(String flalbtAllowBottleProc) {
        this.flalbtAllowBottleProc = flalbtAllowBottleProc;
    }

    // @Basic
    // @Column(name = "FLCORC_CCorCurrency", nullable = true, length = 1)
    public String getFlcorcCCorCurrency() {
        return flcorcCCorCurrency;
    }

    public void setFlcorcCCorCurrency(String flcorcCCorCurrency) {
        this.flcorcCCorCurrency = flcorcCCorCurrency;
    }

    // @Basic
    // @Column(name = "FLMNAM_MerchName", nullable = true, length = 255)
    public String getFlmnamMerchName() {
        return flmnamMerchName;
    }

    public void setFlmnamMerchName(String flmnamMerchName) {
        this.flmnamMerchName = flmnamMerchName;
    }

    // @Basic
    // @Column(name = "FLMAC_MerchAcct", nullable = true, length = 255)
    public String getFlmacMerchAcct() {
        return flmacMerchAcct;
    }

    public void setFlmacMerchAcct(String flmacMerchAcct) {
        this.flmacMerchAcct = flmacMerchAcct;
    }

    // @Basic
    // @Column(name = "FLMDC_ManagingDirCtrl", nullable = true)
    public Long getFlmdcManagingDirCtrl() {
        return flmdcManagingDirCtrl;
    }

    public void setFlmdcManagingDirCtrl(Long flmdcManagingDirCtrl) {
        this.flmdcManagingDirCtrl = flmdcManagingDirCtrl;
    }

    // @Basic
    // @Column(name = "FLDFMT_DateDispFrmt", nullable = true, length = 10)
    public String getFldfmtDateDispFrmt() {
        return fldfmtDateDispFrmt;
    }

    public void setFldfmtDateDispFrmt(String fldfmtDateDispFrmt) {
        this.fldfmtDateDispFrmt = fldfmtDateDispFrmt;
    }

    // @Basic
    // @Column(name = "FLFM01_EarningsOne", nullable = true)
    public Integer getFlfm01EarningsOne() {
        return flfm01EarningsOne;
    }

    public void setFlfm01EarningsOne(Integer flfm01EarningsOne) {
        this.flfm01EarningsOne = flfm01EarningsOne;
    }

    // @Basic
    // @Column(name = "FLFM02_ProfitSharing", nullable = true)
    public Integer getFlfm02ProfitSharing() {
        return flfm02ProfitSharing;
    }

    public void setFlfm02ProfitSharing(Integer flfm02ProfitSharing) {
        this.flfm02ProfitSharing = flfm02ProfitSharing;
    }

    // @Basic
    // @Column(name = "FLFM03_MonthEndReports", nullable = true)
    public Integer getFlfm03MonthEndReports() {
        return flfm03MonthEndReports;
    }

    public void setFlfm03MonthEndReports(Integer flfm03MonthEndReports) {
        this.flfm03MonthEndReports = flfm03MonthEndReports;
    }

    // @Basic
    // @Column(name = "FLFM04_EarnedRallyTrips", nullable = true)
    public Integer getFlfm04EarnedRallyTrips() {
        return flfm04EarnedRallyTrips;
    }

    public void setFlfm04EarnedRallyTrips(Integer flfm04EarnedRallyTrips) {
        this.flfm04EarnedRallyTrips = flfm04EarnedRallyTrips;
    }

    // @Basic
    // @Column(name = "FLFM05_FutureOne", nullable = true)
    public Integer getFlfm05FutureOne() {
        return flfm05FutureOne;
    }

    public void setFlfm05FutureOne(Integer flfm05FutureOne) {
        this.flfm05FutureOne = flfm05FutureOne;
    }

    // @Basic
    // @Column(name = "FLFM06_FutureTwo", nullable = true)
    public Integer getFlfm06FutureTwo() {
        return flfm06FutureTwo;
    }

    public void setFlfm06FutureTwo(Integer flfm06FutureTwo) {
        this.flfm06FutureTwo = flfm06FutureTwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlcmppCompanyConfig that = (FlcmppCompanyConfig) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (flcoidCompanyCode != null ? !flcoidCompanyCode.equals(that.flcoidCompanyCode) : that.flcoidCompanyCode != null)
            return false;
        if (flcmpnCompanyName != null ? !flcmpnCompanyName.equals(that.flcmpnCompanyName) : that.flcmpnCompanyName != null)
            return false;
        if (flcmshShortCmpnyName != null ? !flcmshShortCmpnyName.equals(that.flcmshShortCmpnyName) : that.flcmshShortCmpnyName != null)
            return false;
        if (flstatStateCode != null ? !flstatStateCode.equals(that.flstatStateCode) : that.flstatStateCode != null)
            return false;
        if (flcntyCountryCode != null ? !flcntyCountryCode.equals(that.flcntyCountryCode) : that.flcntyCountryCode != null)
            return false;
        if (flcurrCurrencySymbol != null ? !flcurrCurrencySymbol.equals(that.flcurrCurrencySymbol) : that.flcurrCurrencySymbol != null)
            return false;
        if (flcrvbCurrencyVerbage != null ? !flcrvbCurrencyVerbage.equals(that.flcrvbCurrencyVerbage) : that.flcrvbCurrencyVerbage != null)
            return false;
        if (fldecpDecimalPosition != null ? !fldecpDecimalPosition.equals(that.fldecpDecimalPosition) : that.fldecpDecimalPosition != null)
            return false;
        if (flcrncCurrencyCasCre != null ? !flcrncCurrencyCasCre.equals(that.flcrncCurrencyCasCre) : that.flcrncCurrencyCasCre != null)
            return false;
        if (fllbedLbBonEffDate != null ? !fllbedLbBonEffDate.equals(that.fllbedLbBonEffDate) : that.fllbedLbBonEffDate != null)
            return false;
        if (flgfedGrandFatherEffDate != null ? !flgfedGrandFatherEffDate.equals(that.flgfedGrandFatherEffDate) : that.flgfedGrandFatherEffDate != null)
            return false;
        if (fldwthDomWhPct != null ? !fldwthDomWhPct.equals(that.fldwthDomWhPct) : that.fldwthDomWhPct != null)
            return false;
        if (flfwthForiegnWhPct != null ? !flfwthForiegnWhPct.equals(that.flfwthForiegnWhPct) : that.flfwthForiegnWhPct != null)
            return false;
        if (flcmcnCmpnyNameCenter != null ? !flcmcnCmpnyNameCenter.equals(that.flcmcnCmpnyNameCenter) : that.flcmcnCmpnyNameCenter != null)
            return false;
        if (fladd1AddrLine1 != null ? !fladd1AddrLine1.equals(that.fladd1AddrLine1) : that.fladd1AddrLine1 != null)
            return false;
        if (fladd2AddrLine3 != null ? !fladd2AddrLine3.equals(that.fladd2AddrLine3) : that.fladd2AddrLine3 != null)
            return false;
        if (fladd3AddrLine4 != null ? !fladd3AddrLine4.equals(that.fladd3AddrLine4) : that.fladd3AddrLine4 != null)
            return false;
        if (fladd4AddrLine5 != null ? !fladd4AddrLine5.equals(that.fladd4AddrLine5) : that.fladd4AddrLine5 != null)
            return false;
        if (flcityCity != null ? !flcityCity.equals(that.flcityCity) : that.flcityCity != null) return false;
        if (flzipcZipCode != null ? !flzipcZipCode.equals(that.flzipcZipCode) : that.flzipcZipCode != null)
            return false;
        if (flphonPhoneNum != null ? !flphonPhoneNum.equals(that.flphonPhoneNum) : that.flphonPhoneNum != null)
            return false;
        if (flfnamCfoFrstName != null ? !flfnamCfoFrstName.equals(that.flfnamCfoFrstName) : that.flfnamCfoFrstName != null)
            return false;
        if (fllnamCfoLastName != null ? !fllnamCfoLastName.equals(that.fllnamCfoLastName) : that.fllnamCfoLastName != null)
            return false;
        if (flalbtAllowBottleProc != null ? !flalbtAllowBottleProc.equals(that.flalbtAllowBottleProc) : that.flalbtAllowBottleProc != null)
            return false;
        if (flcorcCCorCurrency != null ? !flcorcCCorCurrency.equals(that.flcorcCCorCurrency) : that.flcorcCCorCurrency != null)
            return false;
        if (flmnamMerchName != null ? !flmnamMerchName.equals(that.flmnamMerchName) : that.flmnamMerchName != null)
            return false;
        if (flmacMerchAcct != null ? !flmacMerchAcct.equals(that.flmacMerchAcct) : that.flmacMerchAcct != null)
            return false;
        if (flmdcManagingDirCtrl != null ? !flmdcManagingDirCtrl.equals(that.flmdcManagingDirCtrl) : that.flmdcManagingDirCtrl != null)
            return false;
        if (fldfmtDateDispFrmt != null ? !fldfmtDateDispFrmt.equals(that.fldfmtDateDispFrmt) : that.fldfmtDateDispFrmt != null)
            return false;
        if (flfm01EarningsOne != null ? !flfm01EarningsOne.equals(that.flfm01EarningsOne) : that.flfm01EarningsOne != null)
            return false;
        if (flfm02ProfitSharing != null ? !flfm02ProfitSharing.equals(that.flfm02ProfitSharing) : that.flfm02ProfitSharing != null)
            return false;
        if (flfm03MonthEndReports != null ? !flfm03MonthEndReports.equals(that.flfm03MonthEndReports) : that.flfm03MonthEndReports != null)
            return false;
        if (flfm04EarnedRallyTrips != null ? !flfm04EarnedRallyTrips.equals(that.flfm04EarnedRallyTrips) : that.flfm04EarnedRallyTrips != null)
            return false;
        if (flfm05FutureOne != null ? !flfm05FutureOne.equals(that.flfm05FutureOne) : that.flfm05FutureOne != null)
            return false;
        if (flfm06FutureTwo != null ? !flfm06FutureTwo.equals(that.flfm06FutureTwo) : that.flfm06FutureTwo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (flcoidCompanyCode != null ? flcoidCompanyCode.hashCode() : 0);
        result = 31 * result + (flcmpnCompanyName != null ? flcmpnCompanyName.hashCode() : 0);
        result = 31 * result + (flcmshShortCmpnyName != null ? flcmshShortCmpnyName.hashCode() : 0);
        result = 31 * result + (flstatStateCode != null ? flstatStateCode.hashCode() : 0);
        result = 31 * result + (flcntyCountryCode != null ? flcntyCountryCode.hashCode() : 0);
        result = 31 * result + (flcurrCurrencySymbol != null ? flcurrCurrencySymbol.hashCode() : 0);
        result = 31 * result + (flcrvbCurrencyVerbage != null ? flcrvbCurrencyVerbage.hashCode() : 0);
        result = 31 * result + (fldecpDecimalPosition != null ? fldecpDecimalPosition.hashCode() : 0);
        result = 31 * result + (flcrncCurrencyCasCre != null ? flcrncCurrencyCasCre.hashCode() : 0);
        result = 31 * result + (fllbedLbBonEffDate != null ? fllbedLbBonEffDate.hashCode() : 0);
        result = 31 * result + (flgfedGrandFatherEffDate != null ? flgfedGrandFatherEffDate.hashCode() : 0);
        result = 31 * result + (fldwthDomWhPct != null ? fldwthDomWhPct.hashCode() : 0);
        result = 31 * result + (flfwthForiegnWhPct != null ? flfwthForiegnWhPct.hashCode() : 0);
        result = 31 * result + (flcmcnCmpnyNameCenter != null ? flcmcnCmpnyNameCenter.hashCode() : 0);
        result = 31 * result + (fladd1AddrLine1 != null ? fladd1AddrLine1.hashCode() : 0);
        result = 31 * result + (fladd2AddrLine3 != null ? fladd2AddrLine3.hashCode() : 0);
        result = 31 * result + (fladd3AddrLine4 != null ? fladd3AddrLine4.hashCode() : 0);
        result = 31 * result + (fladd4AddrLine5 != null ? fladd4AddrLine5.hashCode() : 0);
        result = 31 * result + (flcityCity != null ? flcityCity.hashCode() : 0);
        result = 31 * result + (flzipcZipCode != null ? flzipcZipCode.hashCode() : 0);
        result = 31 * result + (flphonPhoneNum != null ? flphonPhoneNum.hashCode() : 0);
        result = 31 * result + (flfnamCfoFrstName != null ? flfnamCfoFrstName.hashCode() : 0);
        result = 31 * result + (fllnamCfoLastName != null ? fllnamCfoLastName.hashCode() : 0);
        result = 31 * result + (flalbtAllowBottleProc != null ? flalbtAllowBottleProc.hashCode() : 0);
        result = 31 * result + (flcorcCCorCurrency != null ? flcorcCCorCurrency.hashCode() : 0);
        result = 31 * result + (flmnamMerchName != null ? flmnamMerchName.hashCode() : 0);
        result = 31 * result + (flmacMerchAcct != null ? flmacMerchAcct.hashCode() : 0);
        result = 31 * result + (flmdcManagingDirCtrl != null ? flmdcManagingDirCtrl.hashCode() : 0);
        result = 31 * result + (fldfmtDateDispFrmt != null ? fldfmtDateDispFrmt.hashCode() : 0);
        result = 31 * result + (flfm01EarningsOne != null ? flfm01EarningsOne.hashCode() : 0);
        result = 31 * result + (flfm02ProfitSharing != null ? flfm02ProfitSharing.hashCode() : 0);
        result = 31 * result + (flfm03MonthEndReports != null ? flfm03MonthEndReports.hashCode() : 0);
        result = 31 * result + (flfm04EarnedRallyTrips != null ? flfm04EarnedRallyTrips.hashCode() : 0);
        result = 31 * result + (flfm05FutureOne != null ? flfm05FutureOne.hashCode() : 0);
        result = 31 * result + (flfm06FutureTwo != null ? flfm06FutureTwo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"FlcmppCompanyConfig\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"flcoidCompanyCode\":\"" + flcoidCompanyCode + "\""
                + ",                         \"flcmpnCompanyName\":\"" + flcmpnCompanyName + "\""
                + ",                         \"flcmshShortCmpnyName\":\"" + flcmshShortCmpnyName + "\""
                + ",                         \"flstatStateCode\":\"" + flstatStateCode + "\""
                + ",                         \"flcntyCountryCode\":\"" + flcntyCountryCode + "\""
                + ",                         \"flcurrCurrencySymbol\":\"" + flcurrCurrencySymbol + "\""
                + ",                         \"flcrvbCurrencyVerbage\":\"" + flcrvbCurrencyVerbage + "\""
                + ",                         \"fldecpDecimalPosition\":\"" + fldecpDecimalPosition + "\""
                + ",                         \"flcrncCurrencyCasCre\":\"" + flcrncCurrencyCasCre + "\""
                + ",                         \"fllbedLbBonEffDate\":\"" + fllbedLbBonEffDate + "\""
                + ",                         \"flgfedGrandFatherEffDate\":\"" + flgfedGrandFatherEffDate + "\""
                + ",                         \"fldwthDomWhPct\":\"" + fldwthDomWhPct + "\""
                + ",                         \"flfwthForiegnWhPct\":\"" + flfwthForiegnWhPct + "\""
                + ",                         \"flcmcnCmpnyNameCenter\":\"" + flcmcnCmpnyNameCenter + "\""
                + ",                         \"fladd1AddrLine1\":\"" + fladd1AddrLine1 + "\""
                + ",                         \"fladd2AddrLine3\":\"" + fladd2AddrLine3 + "\""
                + ",                         \"fladd3AddrLine4\":\"" + fladd3AddrLine4 + "\""
                + ",                         \"fladd4AddrLine5\":\"" + fladd4AddrLine5 + "\""
                + ",                         \"flcityCity\":\"" + flcityCity + "\""
                + ",                         \"flzipcZipCode\":\"" + flzipcZipCode + "\""
                + ",                         \"flphonPhoneNum\":\"" + flphonPhoneNum + "\""
                + ",                         \"flfnamCfoFrstName\":\"" + flfnamCfoFrstName + "\""
                + ",                         \"fllnamCfoLastName\":\"" + fllnamCfoLastName + "\""
                + ",                         \"flalbtAllowBottleProc\":\"" + flalbtAllowBottleProc + "\""
                + ",                         \"flcorcCCorCurrency\":\"" + flcorcCCorCurrency + "\""
                + ",                         \"flmnamMerchName\":\"" + flmnamMerchName + "\""
                + ",                         \"flmacMerchAcct\":\"" + flmacMerchAcct + "\""
                + ",                         \"flmdcManagingDirCtrl\":\"" + flmdcManagingDirCtrl + "\""
                + ",                         \"fldfmtDateDispFrmt\":\"" + fldfmtDateDispFrmt + "\""
                + ",                         \"flfm01EarningsOne\":\"" + flfm01EarningsOne + "\""
                + ",                         \"flfm02ProfitSharing\":\"" + flfm02ProfitSharing + "\""
                + ",                         \"flfm03MonthEndReports\":\"" + flfm03MonthEndReports + "\""
                + ",                         \"flfm04EarnedRallyTrips\":\"" + flfm04EarnedRallyTrips + "\""
                + ",                         \"flfm05FutureOne\":\"" + flfm05FutureOne + "\""
                + ",                         \"flfm06FutureTwo\":\"" + flfm06FutureTwo + "\""
                + "}}";
    }
}
