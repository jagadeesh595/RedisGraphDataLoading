package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "WBRTEP_WebOperCoOrHomeCoRoutingFile")
public class WbrtepWebOperCoOrHomeCoRoutingFile {
    private Long id;
    private String wropcyOperatingCompanyCode;
    private String wrpfidPlatFormId;
    private String wrcntyHomeCompanyCode;
    private String wrpcntHomeCompanyId;
    private Long wrareaDistributorArea;
    private Long wrparaPurchaceArea;
    private BigDecimal wrccltCcLimit;
    private Integer wrfm01CcFiscalMm;
    private String wrstatWebEnabledYorN;
    private String wruserEnabledByUser;
    private String wredteDateEntered;
    private String wraspcAutoSponserCode;
    private String wrdcurDefaultCurrency;
    private String wrblmdBillingModel;
    private String wrbocdBackOrderAllowedCode;
    private String wrsacdSubstitutionAllowedCode;
    private String wrivmdIncRetailInCcLimitYorN;
    private Integer wrnsetNonSysCmpyEscalInterval;
    private String wrnsecNonSysCmpyEscalCode;
    private String wrnseoNonSysCmpyEscalOccurances;

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
    @Column(name = "WROPCY_OperatingCompanyCode", nullable = true, length = 255)
    public String getWropcyOperatingCompanyCode() {
        return wropcyOperatingCompanyCode;
    }

    public void setWropcyOperatingCompanyCode(String wropcyOperatingCompanyCode) {
        this.wropcyOperatingCompanyCode = wropcyOperatingCompanyCode;
    }

    @Basic
    @Column(name = "WRPFID_PlatFormId", nullable = true, length = 255)
    public String getWrpfidPlatFormId() {
        return wrpfidPlatFormId;
    }

    public void setWrpfidPlatFormId(String wrpfidPlatFormId) {
        this.wrpfidPlatFormId = wrpfidPlatFormId;
    }

    @Basic
    @Column(name = "WRCNTY_HomeCompanyCode", nullable = true, length = 255)
    public String getWrcntyHomeCompanyCode() {
        return wrcntyHomeCompanyCode;
    }

    public void setWrcntyHomeCompanyCode(String wrcntyHomeCompanyCode) {
        this.wrcntyHomeCompanyCode = wrcntyHomeCompanyCode;
    }

    @Basic
    @Column(name = "WRPCNT_HomeCompanyId", nullable = true, length = 255)
    public String getWrpcntHomeCompanyId() {
        return wrpcntHomeCompanyId;
    }

    public void setWrpcntHomeCompanyId(String wrpcntHomeCompanyId) {
        this.wrpcntHomeCompanyId = wrpcntHomeCompanyId;
    }

    @Basic
    @Column(name = "WRAREA_DistributorArea", nullable = true)
    public Long getWrareaDistributorArea() {
        return wrareaDistributorArea;
    }

    public void setWrareaDistributorArea(Long wrareaDistributorArea) {
        this.wrareaDistributorArea = wrareaDistributorArea;
    }

    @Basic
    @Column(name = "WRPARA_PurchaceArea", nullable = true)
    public Long getWrparaPurchaceArea() {
        return wrparaPurchaceArea;
    }

    public void setWrparaPurchaceArea(Long wrparaPurchaceArea) {
        this.wrparaPurchaceArea = wrparaPurchaceArea;
    }

    @Basic
    @Column(name = "WRCCLT_CCLimit", nullable = true, precision = 3)
    public BigDecimal getWrccltCcLimit() {
        return wrccltCcLimit;
    }

    public void setWrccltCcLimit(BigDecimal wrccltCcLimit) {
        this.wrccltCcLimit = wrccltCcLimit;
    }

    @Basic
    @Column(name = "WRFM01_CCFiscalMM", nullable = true)
    public Integer getWrfm01CcFiscalMm() {
        return wrfm01CcFiscalMm;
    }

    public void setWrfm01CcFiscalMm(Integer wrfm01CcFiscalMm) {
        this.wrfm01CcFiscalMm = wrfm01CcFiscalMm;
    }

    @Basic
    @Column(name = "WRSTAT_WebEnabledYorN", nullable = true, length = 1)
    public String getWrstatWebEnabledYorN() {
        return wrstatWebEnabledYorN;
    }

    public void setWrstatWebEnabledYorN(String wrstatWebEnabledYorN) {
        this.wrstatWebEnabledYorN = wrstatWebEnabledYorN;
    }

    @Basic
    @Column(name = "WRUSER_EnabledByUser", nullable = true, length = 255)
    public String getWruserEnabledByUser() {
        return wruserEnabledByUser;
    }

    public void setWruserEnabledByUser(String wruserEnabledByUser) {
        this.wruserEnabledByUser = wruserEnabledByUser;
    }

    @Basic
    @Column(name = "WREDTE_DateEntered", nullable = true, length = 15)
    public String getWredteDateEntered() {
        return wredteDateEntered;
    }

    public void setWredteDateEntered(String wredteDateEntered) {
        this.wredteDateEntered = wredteDateEntered;
    }

    @Basic
    @Column(name = "WRASPC_AutoSponserCode", nullable = true, length = 1)
    public String getWraspcAutoSponserCode() {
        return wraspcAutoSponserCode;
    }

    public void setWraspcAutoSponserCode(String wraspcAutoSponserCode) {
        this.wraspcAutoSponserCode = wraspcAutoSponserCode;
    }

    @Basic
    @Column(name = "WRDCUR_DefaultCurrency", nullable = true, length = 255)
    public String getWrdcurDefaultCurrency() {
        return wrdcurDefaultCurrency;
    }

    public void setWrdcurDefaultCurrency(String wrdcurDefaultCurrency) {
        this.wrdcurDefaultCurrency = wrdcurDefaultCurrency;
    }

    @Basic
    @Column(name = "WRBLMD_BillingModel", nullable = true, length = 1)
    public String getWrblmdBillingModel() {
        return wrblmdBillingModel;
    }

    public void setWrblmdBillingModel(String wrblmdBillingModel) {
        this.wrblmdBillingModel = wrblmdBillingModel;
    }

    @Basic
    @Column(name = "WRBOCD_BackOrderAllowedCode", nullable = true, length = 1)
    public String getWrbocdBackOrderAllowedCode() {
        return wrbocdBackOrderAllowedCode;
    }

    public void setWrbocdBackOrderAllowedCode(String wrbocdBackOrderAllowedCode) {
        this.wrbocdBackOrderAllowedCode = wrbocdBackOrderAllowedCode;
    }

    @Basic
    @Column(name = "WRSACD_SubstitutionAllowedCode", nullable = true, length = 1)
    public String getWrsacdSubstitutionAllowedCode() {
        return wrsacdSubstitutionAllowedCode;
    }

    public void setWrsacdSubstitutionAllowedCode(String wrsacdSubstitutionAllowedCode) {
        this.wrsacdSubstitutionAllowedCode = wrsacdSubstitutionAllowedCode;
    }

    @Basic
    @Column(name = "WRIVMD_IncRetailInCCLimitYorN", nullable = true, length = 1)
    public String getWrivmdIncRetailInCcLimitYorN() {
        return wrivmdIncRetailInCcLimitYorN;
    }

    public void setWrivmdIncRetailInCcLimitYorN(String wrivmdIncRetailInCcLimitYorN) {
        this.wrivmdIncRetailInCcLimitYorN = wrivmdIncRetailInCcLimitYorN;
    }

    @Basic
    @Column(name = "WRNSET_NonSysCmpyEscalInterval", nullable = true)
    public Integer getWrnsetNonSysCmpyEscalInterval() {
        return wrnsetNonSysCmpyEscalInterval;
    }

    public void setWrnsetNonSysCmpyEscalInterval(Integer wrnsetNonSysCmpyEscalInterval) {
        this.wrnsetNonSysCmpyEscalInterval = wrnsetNonSysCmpyEscalInterval;
    }

    @Basic
    @Column(name = "WRNSEC_NonSysCmpyEscalCode", nullable = true, length = 1)
    public String getWrnsecNonSysCmpyEscalCode() {
        return wrnsecNonSysCmpyEscalCode;
    }

    public void setWrnsecNonSysCmpyEscalCode(String wrnsecNonSysCmpyEscalCode) {
        this.wrnsecNonSysCmpyEscalCode = wrnsecNonSysCmpyEscalCode;
    }

    @Basic
    @Column(name = "WRNSEO_NonSysCmpyEscalOccurances", nullable = true, length = 1)
    public String getWrnseoNonSysCmpyEscalOccurances() {
        return wrnseoNonSysCmpyEscalOccurances;
    }

    public void setWrnseoNonSysCmpyEscalOccurances(String wrnseoNonSysCmpyEscalOccurances) {
        this.wrnseoNonSysCmpyEscalOccurances = wrnseoNonSysCmpyEscalOccurances;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WbrtepWebOperCoOrHomeCoRoutingFile that = (WbrtepWebOperCoOrHomeCoRoutingFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (wropcyOperatingCompanyCode != null ? !wropcyOperatingCompanyCode.equals(that.wropcyOperatingCompanyCode) : that.wropcyOperatingCompanyCode != null)
            return false;
        if (wrpfidPlatFormId != null ? !wrpfidPlatFormId.equals(that.wrpfidPlatFormId) : that.wrpfidPlatFormId != null)
            return false;
        if (wrcntyHomeCompanyCode != null ? !wrcntyHomeCompanyCode.equals(that.wrcntyHomeCompanyCode) : that.wrcntyHomeCompanyCode != null)
            return false;
        if (wrpcntHomeCompanyId != null ? !wrpcntHomeCompanyId.equals(that.wrpcntHomeCompanyId) : that.wrpcntHomeCompanyId != null)
            return false;
        if (wrareaDistributorArea != null ? !wrareaDistributorArea.equals(that.wrareaDistributorArea) : that.wrareaDistributorArea != null)
            return false;
        if (wrparaPurchaceArea != null ? !wrparaPurchaceArea.equals(that.wrparaPurchaceArea) : that.wrparaPurchaceArea != null)
            return false;
        if (wrccltCcLimit != null ? !wrccltCcLimit.equals(that.wrccltCcLimit) : that.wrccltCcLimit != null)
            return false;
        if (wrfm01CcFiscalMm != null ? !wrfm01CcFiscalMm.equals(that.wrfm01CcFiscalMm) : that.wrfm01CcFiscalMm != null)
            return false;
        if (wrstatWebEnabledYorN != null ? !wrstatWebEnabledYorN.equals(that.wrstatWebEnabledYorN) : that.wrstatWebEnabledYorN != null)
            return false;
        if (wruserEnabledByUser != null ? !wruserEnabledByUser.equals(that.wruserEnabledByUser) : that.wruserEnabledByUser != null)
            return false;
        if (wredteDateEntered != null ? !wredteDateEntered.equals(that.wredteDateEntered) : that.wredteDateEntered != null)
            return false;
        if (wraspcAutoSponserCode != null ? !wraspcAutoSponserCode.equals(that.wraspcAutoSponserCode) : that.wraspcAutoSponserCode != null)
            return false;
        if (wrdcurDefaultCurrency != null ? !wrdcurDefaultCurrency.equals(that.wrdcurDefaultCurrency) : that.wrdcurDefaultCurrency != null)
            return false;
        if (wrblmdBillingModel != null ? !wrblmdBillingModel.equals(that.wrblmdBillingModel) : that.wrblmdBillingModel != null)
            return false;
        if (wrbocdBackOrderAllowedCode != null ? !wrbocdBackOrderAllowedCode.equals(that.wrbocdBackOrderAllowedCode) : that.wrbocdBackOrderAllowedCode != null)
            return false;
        if (wrsacdSubstitutionAllowedCode != null ? !wrsacdSubstitutionAllowedCode.equals(that.wrsacdSubstitutionAllowedCode) : that.wrsacdSubstitutionAllowedCode != null)
            return false;
        if (wrivmdIncRetailInCcLimitYorN != null ? !wrivmdIncRetailInCcLimitYorN.equals(that.wrivmdIncRetailInCcLimitYorN) : that.wrivmdIncRetailInCcLimitYorN != null)
            return false;
        if (wrnsetNonSysCmpyEscalInterval != null ? !wrnsetNonSysCmpyEscalInterval.equals(that.wrnsetNonSysCmpyEscalInterval) : that.wrnsetNonSysCmpyEscalInterval != null)
            return false;
        if (wrnsecNonSysCmpyEscalCode != null ? !wrnsecNonSysCmpyEscalCode.equals(that.wrnsecNonSysCmpyEscalCode) : that.wrnsecNonSysCmpyEscalCode != null)
            return false;
        if (wrnseoNonSysCmpyEscalOccurances != null ? !wrnseoNonSysCmpyEscalOccurances.equals(that.wrnseoNonSysCmpyEscalOccurances) : that.wrnseoNonSysCmpyEscalOccurances != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (wropcyOperatingCompanyCode != null ? wropcyOperatingCompanyCode.hashCode() : 0);
        result = 31 * result + (wrpfidPlatFormId != null ? wrpfidPlatFormId.hashCode() : 0);
        result = 31 * result + (wrcntyHomeCompanyCode != null ? wrcntyHomeCompanyCode.hashCode() : 0);
        result = 31 * result + (wrpcntHomeCompanyId != null ? wrpcntHomeCompanyId.hashCode() : 0);
        result = 31 * result + (wrareaDistributorArea != null ? wrareaDistributorArea.hashCode() : 0);
        result = 31 * result + (wrparaPurchaceArea != null ? wrparaPurchaceArea.hashCode() : 0);
        result = 31 * result + (wrccltCcLimit != null ? wrccltCcLimit.hashCode() : 0);
        result = 31 * result + (wrfm01CcFiscalMm != null ? wrfm01CcFiscalMm.hashCode() : 0);
        result = 31 * result + (wrstatWebEnabledYorN != null ? wrstatWebEnabledYorN.hashCode() : 0);
        result = 31 * result + (wruserEnabledByUser != null ? wruserEnabledByUser.hashCode() : 0);
        result = 31 * result + (wredteDateEntered != null ? wredteDateEntered.hashCode() : 0);
        result = 31 * result + (wraspcAutoSponserCode != null ? wraspcAutoSponserCode.hashCode() : 0);
        result = 31 * result + (wrdcurDefaultCurrency != null ? wrdcurDefaultCurrency.hashCode() : 0);
        result = 31 * result + (wrblmdBillingModel != null ? wrblmdBillingModel.hashCode() : 0);
        result = 31 * result + (wrbocdBackOrderAllowedCode != null ? wrbocdBackOrderAllowedCode.hashCode() : 0);
        result = 31 * result + (wrsacdSubstitutionAllowedCode != null ? wrsacdSubstitutionAllowedCode.hashCode() : 0);
        result = 31 * result + (wrivmdIncRetailInCcLimitYorN != null ? wrivmdIncRetailInCcLimitYorN.hashCode() : 0);
        result = 31 * result + (wrnsetNonSysCmpyEscalInterval != null ? wrnsetNonSysCmpyEscalInterval.hashCode() : 0);
        result = 31 * result + (wrnsecNonSysCmpyEscalCode != null ? wrnsecNonSysCmpyEscalCode.hashCode() : 0);
        result = 31 * result + (wrnseoNonSysCmpyEscalOccurances != null ? wrnseoNonSysCmpyEscalOccurances.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"WbrtepWebOperCoOrHomeCoRoutingFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"wropcyOperatingCompanyCode\":\"" + wropcyOperatingCompanyCode + "\""
                + ",                         \"wrpfidPlatFormId\":\"" + wrpfidPlatFormId + "\""
                + ",                         \"wrcntyHomeCompanyCode\":\"" + wrcntyHomeCompanyCode + "\""
                + ",                         \"wrpcntHomeCompanyId\":\"" + wrpcntHomeCompanyId + "\""
                + ",                         \"wrareaDistributorArea\":\"" + wrareaDistributorArea + "\""
                + ",                         \"wrparaPurchaceArea\":\"" + wrparaPurchaceArea + "\""
                + ",                         \"wrccltCcLimit\":\"" + wrccltCcLimit + "\""
                + ",                         \"wrfm01CcFiscalMm\":\"" + wrfm01CcFiscalMm + "\""
                + ",                         \"wrstatWebEnabledYorN\":\"" + wrstatWebEnabledYorN + "\""
                + ",                         \"wruserEnabledByUser\":\"" + wruserEnabledByUser + "\""
                + ",                         \"wredteDateEntered\":\"" + wredteDateEntered + "\""
                + ",                         \"wraspcAutoSponserCode\":\"" + wraspcAutoSponserCode + "\""
                + ",                         \"wrdcurDefaultCurrency\":\"" + wrdcurDefaultCurrency + "\""
                + ",                         \"wrblmdBillingModel\":\"" + wrblmdBillingModel + "\""
                + ",                         \"wrbocdBackOrderAllowedCode\":\"" + wrbocdBackOrderAllowedCode + "\""
                + ",                         \"wrsacdSubstitutionAllowedCode\":\"" + wrsacdSubstitutionAllowedCode + "\""
                + ",                         \"wrivmdIncRetailInCcLimitYorN\":\"" + wrivmdIncRetailInCcLimitYorN + "\""
                + ",                         \"wrnsetNonSysCmpyEscalInterval\":\"" + wrnsetNonSysCmpyEscalInterval + "\""
                + ",                         \"wrnsecNonSysCmpyEscalCode\":\"" + wrnsecNonSysCmpyEscalCode + "\""
                + ",                         \"wrnseoNonSysCmpyEscalOccurances\":\"" + wrnseoNonSysCmpyEscalOccurances + "\""
                + "}}";
    }
}
