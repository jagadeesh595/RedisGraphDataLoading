package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by rpalamakula on 16-08-2017.
 */
@RedisHash("DSMSTP_Distributor")
public class DsmstpDistributor implements Serializable {
    private  Long id;
    private @Indexed Long dsctlControl;
    private @Indexed Long dsdidId;
    private  String dsfnamFirstName;
    private  String dslnamLastName;
    private @Indexed Long dsspnSponsorControl;
    private String dscntyCountry;
    private @Indexed Long dsctycCntrCode;
    private @Indexed String dsstasStatus;
    private  String dswaiv4CcWaiver;
    private @Indexed Integer dslevlLevel;
    private  Integer dsmgrlMgrLevel;
    private @Indexed Integer dsgmlvGemMgrLevel;
    private  String dsqudsForiegnQual;
    private @Indexed String dsdqmgRecognizedManager;
    private  String dswk1CGrandFatherFlag;
    private  Long dsspsNonFederalTaxId;
    private  String dsrslResale;
    private String dstitlTitle;
    private  String dsspfnSpouseFname;
    private String dssplnSpouseLname;
    private  String dsadd1Add1;
    private String dsadd2Add2;
    private  String dsadd3Add3;
    private  String dsadd4Add4;
    private  String dscityCity;
    private  String dsstatState;
    private  String dszipcZipCode;
    private  String dsctyCounty;
    private String dsvtxVertexFlag;
    private  Long dsgeocGeoCode;
    private  String dspcntCompany;
    private  Long dsphonPhone;
    private @Indexed String dstrfmTransferredMgr;
    private @Indexed String dsinhmInheritMgr;
    private  Long dsareaWarehouseorArea;
    private  String dswh2020PerWithHold;
    private  String dswh3030PerWithHold;
    private  String dssetdSetUpDate;
    private  Integer dsamgrTotActiveMgrs;
    private  Integer dstmgrTotMgrs;
    private  String dschgdLstChgDate;
    private  String dsusidUserId;
    private  String dsarlkAreaSalesLock;
    private  Integer dsfspmFrstPurchMnth;
    private  Integer dsfspyFrstPurchYear;
    private  String dslprfLangPrefCode;
    private @Indexed String dsfrdcForiegnDom;
    private @Indexed String dsqumgForiegnQualMgr;
    private @Indexed String dsfedCorpFedTaxNum;
    private @Indexed Integer dsssrcSponsoringSrc;
    private  Integer dssssrSponsoringSubSrc;
    private  String dssfdSecFedTaxId;
    private  String dspfdPrimFedTaxId;
    private  String dsadtpAddrType;
    private  String dsw8EdExpiryDate;
    private  String dsmnamMiddleName;
    private  String dsspmnSpouceMiddleName;


    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "DSCTL_Control", nullable = false)
    public Long getDsctlControl() {
        return dsctlControl;
    }

    public void setDsctlControl(Long dsctlControl) {
        this.dsctlControl = dsctlControl;
    }

    // @Basic
    // @Column(name = "DSDID_Id", nullable = true)
    public Long getDsdidId() {
        return dsdidId;
    }

    public void setDsdidId(Long dsdidId) {
        this.dsdidId = dsdidId;
    }

    // @Basic
    // @Column(name = "DSFNAM_FirstName", nullable = true, length = 255)
    public String getDsfnamFirstName() {
        return dsfnamFirstName;
    }

    public void setDsfnamFirstName(String dsfnamFirstName) {
        this.dsfnamFirstName = dsfnamFirstName;
    }

    // @Basic
    // @Column(name = "DSLNAM_LastName", nullable = true, length = 255)
    public String getDslnamLastName() {
        return dslnamLastName;
    }

    public void setDslnamLastName(String dslnamLastName) {
        this.dslnamLastName = dslnamLastName;
    }

    // @Basic
    // @Column(name = "DSSPN_SponsorControl", nullable = true)
    public Long getDsspnSponsorControl() {
        return dsspnSponsorControl;
    }

    public void setDsspnSponsorControl(Long dsspnSponsorControl) {
        this.dsspnSponsorControl = dsspnSponsorControl;
    }

    // @Basic
    // @Column(name = "DSCNTY_Country", nullable = true, length = 255)
    public String getDscntyCountry() {
        return dscntyCountry;
    }

    public void setDscntyCountry(String dscntyCountry) {
        this.dscntyCountry = dscntyCountry;
    }

    // @Basic
    // @Column(name = "DSCTYC_CntrCode", nullable = true)
    public Long getDsctycCntrCode() {
        return dsctycCntrCode;
    }

    public void setDsctycCntrCode(Long dsctycCntrCode) {
        this.dsctycCntrCode = dsctycCntrCode;
    }

    // @Basic
    // @Column(name = "DSSTAS_Status", nullable = true, length = 1)
    public String getDsstasStatus() {
        return dsstasStatus;
    }

    public void setDsstasStatus(String dsstasStatus) {
        this.dsstasStatus = dsstasStatus;
    }

    // @Basic
    // @Column(name = "DSWAIV_4CCWaiver", nullable = true, length = 1)
    public String getDswaiv4CcWaiver() {
        return dswaiv4CcWaiver;
    }

    public void setDswaiv4CcWaiver(String dswaiv4CcWaiver) {
        this.dswaiv4CcWaiver = dswaiv4CcWaiver;
    }

    // @Basic
    // @Column(name = "DSLEVL_Level", nullable = true)
    public Integer getDslevlLevel() {
        return dslevlLevel;
    }

    public void setDslevlLevel(Integer dslevlLevel) {

        this.dslevlLevel = dslevlLevel;
    }

    // @Basic
    // @Column(name = "DSMGRL_MGRLevel", nullable = true)
    public Integer getDsmgrlMgrLevel() {
        return dsmgrlMgrLevel;
    }

    public void setDsmgrlMgrLevel(Integer dsmgrlMgrLevel) {
        this.dsmgrlMgrLevel = dsmgrlMgrLevel;
    }

    // @Basic
    // @Column(name = "DSGMLV_GemMGRLevel", nullable = true)
    public Integer getDsgmlvGemMgrLevel() {
        return dsgmlvGemMgrLevel;
    }

    public void setDsgmlvGemMgrLevel(Integer dsgmlvGemMgrLevel) {
        this.dsgmlvGemMgrLevel = dsgmlvGemMgrLevel;
    }

    // @Basic
    // @Column(name = "DSQUDS_ForiegnQual", nullable = true, length = 255)
    public String getDsqudsForiegnQual() {
        return dsqudsForiegnQual;
    }

    public void setDsqudsForiegnQual(String dsqudsForiegnQual) {
        this.dsqudsForiegnQual = dsqudsForiegnQual;
    }

    // @Basic
    // @Column(name = "DSDQMG_RecognizedManager", nullable = true, length = 1)
    public String getDsdqmgRecognizedManager() {
        return dsdqmgRecognizedManager;
    }

    public void setDsdqmgRecognizedManager(String dsdqmgRecognizedManager) {
        this.dsdqmgRecognizedManager = dsdqmgRecognizedManager;
    }

    // @Basic
    // @Column(name = "DSWK1C_GrandFatherFlag", nullable = true, length = 1)
    public String getDswk1CGrandFatherFlag() {
        return dswk1CGrandFatherFlag;
    }

    public void setDswk1CGrandFatherFlag(String dswk1CGrandFatherFlag) {
        this.dswk1CGrandFatherFlag = dswk1CGrandFatherFlag;
    }

    // @Basic
    // @Column(name = "DSSPS_NonFederalTaxId", nullable = true)
    public Long getDsspsNonFederalTaxId() {
        return dsspsNonFederalTaxId;
    }

    public void setDsspsNonFederalTaxId(Long dsspsNonFederalTaxId) {
        this.dsspsNonFederalTaxId = dsspsNonFederalTaxId;
    }

    // @Basic
    // @Column(name = "DSRSL_Resale", nullable = true, length = 255)
    public String getDsrslResale() {
        return dsrslResale;
    }

    public void setDsrslResale(String dsrslResale) {
        this.dsrslResale = dsrslResale;
    }

    // @Basic
    // @Column(name = "DSTITL_Title", nullable = true, length = 15)
    public String getDstitlTitle() {
        return dstitlTitle;
    }

    public void setDstitlTitle(String dstitlTitle) {
        this.dstitlTitle = dstitlTitle;
    }

    // @Basic
    // @Column(name = "DSSPFN_SpouseFname", nullable = true, length = 255)
    public String getDsspfnSpouseFname() {
        return dsspfnSpouseFname;
    }

    public void setDsspfnSpouseFname(String dsspfnSpouseFname) {
        this.dsspfnSpouseFname = dsspfnSpouseFname;
    }

    // @Basic
    // @Column(name = "DSSPLN_SpouseLname", nullable = true, length = 255)
    public String getDssplnSpouseLname() {
        return dssplnSpouseLname;
    }

    public void setDssplnSpouseLname(String dssplnSpouseLname) {
        this.dssplnSpouseLname = dssplnSpouseLname;
    }

    // @Basic
    // @Column(name = "DSADD1_Add1", nullable = true, length = 255)
    public String getDsadd1Add1() {
        return dsadd1Add1;
    }

    public void setDsadd1Add1(String dsadd1Add1) {
        this.dsadd1Add1 = dsadd1Add1;
    }

    // @Basic
    // @Column(name = "DSADD2_Add2", nullable = true, length = 255)
    public String getDsadd2Add2() {
        return dsadd2Add2;
    }

    public void setDsadd2Add2(String dsadd2Add2) {
        this.dsadd2Add2 = dsadd2Add2;
    }

    // @Basic
    // @Column(name = "DSADD3_Add3", nullable = true, length = 255)
    public String getDsadd3Add3() {
        return dsadd3Add3;
    }

    public void setDsadd3Add3(String dsadd3Add3) {
        this.dsadd3Add3 = dsadd3Add3;
    }

    // @Basic
    // @Column(name = "DSADD4_Add4", nullable = true, length = 255)
    public String getDsadd4Add4() {
        return dsadd4Add4;
    }

    public void setDsadd4Add4(String dsadd4Add4) {
        this.dsadd4Add4 = dsadd4Add4;
    }

    // @Basic
    // @Column(name = "DSCITY_City", nullable = true, length = 255)
    public String getDscityCity() {
        return dscityCity;
    }

    public void setDscityCity(String dscityCity) {
        this.dscityCity = dscityCity;
    }

    // @Basic
    // @Column(name = "DSSTAT_State", nullable = true, length = 255)
    public String getDsstatState() {
        return dsstatState;
    }

    public void setDsstatState(String dsstatState) {
        this.dsstatState = dsstatState;
    }

    // @Basic
    // @Column(name = "DSZIPC_ZipCode", nullable = true, length = 255)
    public String getDszipcZipCode() {
        return dszipcZipCode;
    }

    public void setDszipcZipCode(String dszipcZipCode) {
        this.dszipcZipCode = dszipcZipCode;
    }

    // @Basic
    // @Column(name = "DSCTY_County", nullable = true, length = 255)
    public String getDsctyCounty() {
        return dsctyCounty;
    }

    public void setDsctyCounty(String dsctyCounty) {
        this.dsctyCounty = dsctyCounty;
    }

    // @Basic
    // @Column(name = "DSVTX_VertexFlag", nullable = true, length = 15)
    public String getDsvtxVertexFlag() {
        return dsvtxVertexFlag;
    }

    public void setDsvtxVertexFlag(String dsvtxVertexFlag) {
        this.dsvtxVertexFlag = dsvtxVertexFlag;
    }

    // @Basic
    // @Column(name = "DSGEOC_GeoCode", nullable = true)
    public Long getDsgeocGeoCode() {
        return dsgeocGeoCode;
    }

    public void setDsgeocGeoCode(Long dsgeocGeoCode) {
        this.dsgeocGeoCode = dsgeocGeoCode;
    }

    // @Basic
    // @Column(name = "DSPCNT_Company", nullable = true, length = 15)
    public String getDspcntCompany() {
        return dspcntCompany;
    }

    public void setDspcntCompany(String dspcntCompany) {
        this.dspcntCompany = dspcntCompany;
    }

    // @Basic
    // @Column(name = "DSPHON_Phone", nullable = true)
    public Long getDsphonPhone() {
        return dsphonPhone;
    }

    public void setDsphonPhone(Long dsphonPhone) {
        this.dsphonPhone = dsphonPhone;
    }

    // @Basic
    // @Column(name = "DSTRFM_TransferredMgr", nullable = true, length = 15)
    public String getDstrfmTransferredMgr() {
        return dstrfmTransferredMgr;
    }

    public void setDstrfmTransferredMgr(String dstrfmTransferredMgr) {
        this.dstrfmTransferredMgr = dstrfmTransferredMgr;
    }

    // @Basic
    // @Column(name = "DSINHM_InheritMgr", nullable = true, length = 15)
    public String getDsinhmInheritMgr() {
        return dsinhmInheritMgr;
    }

    public void setDsinhmInheritMgr(String dsinhmInheritMgr) {
        this.dsinhmInheritMgr = dsinhmInheritMgr;
    }

    // @Basic
    // @Column(name = "DSAREA_WarehouseorArea", nullable = true)
    public Long getDsareaWarehouseorArea() {
        return dsareaWarehouseorArea;
    }

    public void setDsareaWarehouseorArea(Long dsareaWarehouseorArea) {
        this.dsareaWarehouseorArea = dsareaWarehouseorArea;
    }

    // @Basic
    // @Column(name = "DSWH20_20PerWithHold", nullable = true, length = 15)
    public String getDswh2020PerWithHold() {
        return dswh2020PerWithHold;
    }

    public void setDswh2020PerWithHold(String dswh2020PerWithHold) {
        this.dswh2020PerWithHold = dswh2020PerWithHold;
    }

    // @Basic
    // @Column(name = "DSWH30_30PerWithHold", nullable = true, length = 15)
    public String getDswh3030PerWithHold() {
        return dswh3030PerWithHold;
    }

    public void setDswh3030PerWithHold(String dswh3030PerWithHold) {
        this.dswh3030PerWithHold = dswh3030PerWithHold;
    }

    // @Basic
    // @Column(name = "DSSETD_SetUpDate", nullable = true, length = 15)
    public String getDssetdSetUpDate() {
        return dssetdSetUpDate;
    }

    public void setDssetdSetUpDate(String dssetdSetUpDate) {
        this.dssetdSetUpDate = dssetdSetUpDate;
    }

    // @Basic
    // @Column(name = "DSAMGR_TotActiveMgrs", nullable = true)
    public Integer getDsamgrTotActiveMgrs() {
        return dsamgrTotActiveMgrs;
    }

    public void setDsamgrTotActiveMgrs(Integer dsamgrTotActiveMgrs) {
        this.dsamgrTotActiveMgrs = dsamgrTotActiveMgrs;
    }

    // @Basic
    // @Column(name = "DSTMGR_TotMgrs", nullable = true)
    public Integer getDstmgrTotMgrs() {
        return dstmgrTotMgrs;
    }

    public void setDstmgrTotMgrs(Integer dstmgrTotMgrs) {
        this.dstmgrTotMgrs = dstmgrTotMgrs;
    }

    // @Basic
    // @Column(name = "DSCHGD_LstChgDate", nullable = true, length = 15)
    public String getDschgdLstChgDate() {
        return dschgdLstChgDate;
    }

    public void setDschgdLstChgDate(String dschgdLstChgDate) {
        this.dschgdLstChgDate = dschgdLstChgDate;
    }

    // @Basic
    // @Column(name = "DSUSID_UserId", nullable = true, length = 15)
    public String getDsusidUserId() {
        return dsusidUserId;
    }

    public void setDsusidUserId(String dsusidUserId) {
        this.dsusidUserId = dsusidUserId;
    }

    // @Basic
    // @Column(name = "DSARLK_AreaSalesLock", nullable = true, length = 15)
    public String getDsarlkAreaSalesLock() {
        return dsarlkAreaSalesLock;
    }

    public void setDsarlkAreaSalesLock(String dsarlkAreaSalesLock) {
        this.dsarlkAreaSalesLock = dsarlkAreaSalesLock;
    }

    // @Basic
    // @Column(name = "DSFSPM_FrstPurchMnth", nullable = true)
    public Integer getDsfspmFrstPurchMnth() {
        return dsfspmFrstPurchMnth;
    }

    public void setDsfspmFrstPurchMnth(Integer dsfspmFrstPurchMnth) {
        this.dsfspmFrstPurchMnth = dsfspmFrstPurchMnth;
    }

    // @Basic
    // @Column(name = "DSFSPY_FrstPurchYear", nullable = true)
    public Integer getDsfspyFrstPurchYear() {
        return dsfspyFrstPurchYear;
    }

    public void setDsfspyFrstPurchYear(Integer dsfspyFrstPurchYear) {
        this.dsfspyFrstPurchYear = dsfspyFrstPurchYear;
    }

    // @Basic
    // @Column(name = "DSLPRF_LangPrefCode", nullable = true, length = 15)
    public String getDslprfLangPrefCode() {
        return dslprfLangPrefCode;
    }

    public void setDslprfLangPrefCode(String dslprfLangPrefCode) {
        this.dslprfLangPrefCode = dslprfLangPrefCode;
    }

    // @Basic
    // @Column(name = "DSFRDC_ForiegnDom", nullable = true, length = 15)
    public String getDsfrdcForiegnDom() {
        return dsfrdcForiegnDom;
    }

    public void setDsfrdcForiegnDom(String dsfrdcForiegnDom) {
        this.dsfrdcForiegnDom = dsfrdcForiegnDom;
    }

    // @Basic
    // @Column(name = "DSQUMG_ForiegnQualMgr", nullable = true, length = 15)
    public String getDsqumgForiegnQualMgr() {
        return dsqumgForiegnQualMgr;
    }

    public void setDsqumgForiegnQualMgr(String dsqumgForiegnQualMgr) {
        this.dsqumgForiegnQualMgr = dsqumgForiegnQualMgr;
    }

    // @Basic
    // @Column(name = "DSFED_CorpFedTaxNum", nullable = true, length = 255)
    public String getDsfedCorpFedTaxNum() {
        return dsfedCorpFedTaxNum;
    }

    public void setDsfedCorpFedTaxNum(String dsfedCorpFedTaxNum) {
        this.dsfedCorpFedTaxNum = dsfedCorpFedTaxNum;
    }

    // @Basic
    // @Column(name = "DSSSRC_SponsoringSrc", nullable = true)
    public Integer getDsssrcSponsoringSrc() {
        return dsssrcSponsoringSrc;
    }

    public void setDsssrcSponsoringSrc(Integer dsssrcSponsoringSrc) {
        this.dsssrcSponsoringSrc = dsssrcSponsoringSrc;
    }

    // @Basic
    // @Column(name = "DSSSSR_SponsoringSubSrc", nullable = true)
    public Integer getDssssrSponsoringSubSrc() {
        return dssssrSponsoringSubSrc;
    }

    public void setDssssrSponsoringSubSrc(Integer dssssrSponsoringSubSrc) {
        this.dssssrSponsoringSubSrc = dssssrSponsoringSubSrc;
    }

    // @Basic
    // @Column(name = "DSSFD_SecFedTaxId", nullable = true, length = 255)
    public String getDssfdSecFedTaxId() {
        return dssfdSecFedTaxId;
    }

    public void setDssfdSecFedTaxId(String dssfdSecFedTaxId) {
        this.dssfdSecFedTaxId = dssfdSecFedTaxId;
    }

    // @Basic
    // @Column(name = "DSPFD_PrimFedTaxId", nullable = true, length = 255)
    public String getDspfdPrimFedTaxId() {
        return dspfdPrimFedTaxId;
    }

    public void setDspfdPrimFedTaxId(String dspfdPrimFedTaxId) {
        this.dspfdPrimFedTaxId = dspfdPrimFedTaxId;
    }

    // @Basic
    // @Column(name = "DSADTP_AddrType", nullable = true, length = 255)
    public String getDsadtpAddrType() {
        return dsadtpAddrType;
    }

    public void setDsadtpAddrType(String dsadtpAddrType) {
        this.dsadtpAddrType = dsadtpAddrType;
    }

    // @Basic
    // @Column(name = "DSW8ED_ExpiryDate", nullable = true, length = 15)
    public String getDsw8EdExpiryDate() {
        return dsw8EdExpiryDate;
    }

    public void setDsw8EdExpiryDate(String dsw8EdExpiryDate) {
        this.dsw8EdExpiryDate = dsw8EdExpiryDate;
    }

    // @Column(name = "DSMNAM_MiddleName")
    public String getDsmnamMiddleName() {
        return this.dsmnamMiddleName;
    }

    public void setDsmnamMiddleName(String dsmnamMiddleName) {
        this.dsmnamMiddleName = dsmnamMiddleName;
    }

    // @Column(name = "DSSPMN_SpouceMiddleName")
    public String getDsspmnSpouceMiddleName() {
        return this.dsspmnSpouceMiddleName;
    }

    public void setDsspmnSpouceMiddleName(String dsspmnSpouceMiddleName) {
        this.dsspmnSpouceMiddleName = dsspmnSpouceMiddleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DsmstpDistributor that = (DsmstpDistributor) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dsctlControl != null ? !dsctlControl.equals(that.dsctlControl) : that.dsctlControl != null) return false;
        if (dsdidId != null ? !dsdidId.equals(that.dsdidId) : that.dsdidId != null) return false;
        if (dsfnamFirstName != null ? !dsfnamFirstName.equals(that.dsfnamFirstName) : that.dsfnamFirstName != null)
            return false;
        if (dslnamLastName != null ? !dslnamLastName.equals(that.dslnamLastName) : that.dslnamLastName != null)
            return false;
        if (dsspnSponsorControl != null ? !dsspnSponsorControl.equals(that.dsspnSponsorControl) : that.dsspnSponsorControl != null)
            return false;
        if (dscntyCountry != null ? !dscntyCountry.equals(that.dscntyCountry) : that.dscntyCountry != null)
            return false;
        if (dsctycCntrCode != null ? !dsctycCntrCode.equals(that.dsctycCntrCode) : that.dsctycCntrCode != null)
            return false;
        if (dsstasStatus != null ? !dsstasStatus.equals(that.dsstasStatus) : that.dsstasStatus != null) return false;
        if (dswaiv4CcWaiver != null ? !dswaiv4CcWaiver.equals(that.dswaiv4CcWaiver) : that.dswaiv4CcWaiver != null)
            return false;
        if (dslevlLevel != null ? !dslevlLevel.equals(that.dslevlLevel) : that.dslevlLevel != null) return false;
        if (dsmgrlMgrLevel != null ? !dsmgrlMgrLevel.equals(that.dsmgrlMgrLevel) : that.dsmgrlMgrLevel != null)
            return false;
        if (dsgmlvGemMgrLevel != null ? !dsgmlvGemMgrLevel.equals(that.dsgmlvGemMgrLevel) : that.dsgmlvGemMgrLevel != null)
            return false;
        if (dsqudsForiegnQual != null ? !dsqudsForiegnQual.equals(that.dsqudsForiegnQual) : that.dsqudsForiegnQual != null)
            return false;
        if (dsdqmgRecognizedManager != null ? !dsdqmgRecognizedManager.equals(that.dsdqmgRecognizedManager) : that.dsdqmgRecognizedManager != null)
            return false;
        if (dswk1CGrandFatherFlag != null ? !dswk1CGrandFatherFlag.equals(that.dswk1CGrandFatherFlag) : that.dswk1CGrandFatherFlag != null)
            return false;
        if (dsspsNonFederalTaxId != null ? !dsspsNonFederalTaxId.equals(that.dsspsNonFederalTaxId) : that.dsspsNonFederalTaxId != null)
            return false;
        if (dsrslResale != null ? !dsrslResale.equals(that.dsrslResale) : that.dsrslResale != null) return false;
        if (dstitlTitle != null ? !dstitlTitle.equals(that.dstitlTitle) : that.dstitlTitle != null) return false;
        if (dsspfnSpouseFname != null ? !dsspfnSpouseFname.equals(that.dsspfnSpouseFname) : that.dsspfnSpouseFname != null)
            return false;
        if (dssplnSpouseLname != null ? !dssplnSpouseLname.equals(that.dssplnSpouseLname) : that.dssplnSpouseLname != null)
            return false;
        if (dsadd1Add1 != null ? !dsadd1Add1.equals(that.dsadd1Add1) : that.dsadd1Add1 != null) return false;
        if (dsadd2Add2 != null ? !dsadd2Add2.equals(that.dsadd2Add2) : that.dsadd2Add2 != null) return false;
        if (dsadd3Add3 != null ? !dsadd3Add3.equals(that.dsadd3Add3) : that.dsadd3Add3 != null) return false;
        if (dsadd4Add4 != null ? !dsadd4Add4.equals(that.dsadd4Add4) : that.dsadd4Add4 != null) return false;
        if (dscityCity != null ? !dscityCity.equals(that.dscityCity) : that.dscityCity != null) return false;
        if (dsstatState != null ? !dsstatState.equals(that.dsstatState) : that.dsstatState != null) return false;
        if (dszipcZipCode != null ? !dszipcZipCode.equals(that.dszipcZipCode) : that.dszipcZipCode != null)
            return false;
        if (dsctyCounty != null ? !dsctyCounty.equals(that.dsctyCounty) : that.dsctyCounty != null) return false;
        if (dsvtxVertexFlag != null ? !dsvtxVertexFlag.equals(that.dsvtxVertexFlag) : that.dsvtxVertexFlag != null)
            return false;
        if (dsgeocGeoCode != null ? !dsgeocGeoCode.equals(that.dsgeocGeoCode) : that.dsgeocGeoCode != null)
            return false;
        if (dspcntCompany != null ? !dspcntCompany.equals(that.dspcntCompany) : that.dspcntCompany != null)
            return false;
        if (dsphonPhone != null ? !dsphonPhone.equals(that.dsphonPhone) : that.dsphonPhone != null) return false;
        if (dstrfmTransferredMgr != null ? !dstrfmTransferredMgr.equals(that.dstrfmTransferredMgr) : that.dstrfmTransferredMgr != null)
            return false;
        if (dsinhmInheritMgr != null ? !dsinhmInheritMgr.equals(that.dsinhmInheritMgr) : that.dsinhmInheritMgr != null)
            return false;
        if (dsareaWarehouseorArea != null ? !dsareaWarehouseorArea.equals(that.dsareaWarehouseorArea) : that.dsareaWarehouseorArea != null)
            return false;
        if (dswh2020PerWithHold != null ? !dswh2020PerWithHold.equals(that.dswh2020PerWithHold) : that.dswh2020PerWithHold != null)
            return false;
        if (dswh3030PerWithHold != null ? !dswh3030PerWithHold.equals(that.dswh3030PerWithHold) : that.dswh3030PerWithHold != null)
            return false;
        if (dssetdSetUpDate != null ? !dssetdSetUpDate.equals(that.dssetdSetUpDate) : that.dssetdSetUpDate != null)
            return false;
        if (dsamgrTotActiveMgrs != null ? !dsamgrTotActiveMgrs.equals(that.dsamgrTotActiveMgrs) : that.dsamgrTotActiveMgrs != null)
            return false;
        if (dstmgrTotMgrs != null ? !dstmgrTotMgrs.equals(that.dstmgrTotMgrs) : that.dstmgrTotMgrs != null)
            return false;
        if (dschgdLstChgDate != null ? !dschgdLstChgDate.equals(that.dschgdLstChgDate) : that.dschgdLstChgDate != null)
            return false;
        if (dsusidUserId != null ? !dsusidUserId.equals(that.dsusidUserId) : that.dsusidUserId != null) return false;
        if (dsarlkAreaSalesLock != null ? !dsarlkAreaSalesLock.equals(that.dsarlkAreaSalesLock) : that.dsarlkAreaSalesLock != null)
            return false;
        if (dsfspmFrstPurchMnth != null ? !dsfspmFrstPurchMnth.equals(that.dsfspmFrstPurchMnth) : that.dsfspmFrstPurchMnth != null)
            return false;
        if (dsfspyFrstPurchYear != null ? !dsfspyFrstPurchYear.equals(that.dsfspyFrstPurchYear) : that.dsfspyFrstPurchYear != null)
            return false;
        if (dslprfLangPrefCode != null ? !dslprfLangPrefCode.equals(that.dslprfLangPrefCode) : that.dslprfLangPrefCode != null)
            return false;
        if (dsfrdcForiegnDom != null ? !dsfrdcForiegnDom.equals(that.dsfrdcForiegnDom) : that.dsfrdcForiegnDom != null)
            return false;
        if (dsqumgForiegnQualMgr != null ? !dsqumgForiegnQualMgr.equals(that.dsqumgForiegnQualMgr) : that.dsqumgForiegnQualMgr != null)
            return false;
        if (dsfedCorpFedTaxNum != null ? !dsfedCorpFedTaxNum.equals(that.dsfedCorpFedTaxNum) : that.dsfedCorpFedTaxNum != null)
            return false;
        if (dsssrcSponsoringSrc != null ? !dsssrcSponsoringSrc.equals(that.dsssrcSponsoringSrc) : that.dsssrcSponsoringSrc != null)
            return false;
        if (dssssrSponsoringSubSrc != null ? !dssssrSponsoringSubSrc.equals(that.dssssrSponsoringSubSrc) : that.dssssrSponsoringSubSrc != null)
            return false;
        if (dssfdSecFedTaxId != null ? !dssfdSecFedTaxId.equals(that.dssfdSecFedTaxId) : that.dssfdSecFedTaxId != null)
            return false;
        if (dspfdPrimFedTaxId != null ? !dspfdPrimFedTaxId.equals(that.dspfdPrimFedTaxId) : that.dspfdPrimFedTaxId != null)
            return false;
        if (dsadtpAddrType != null ? !dsadtpAddrType.equals(that.dsadtpAddrType) : that.dsadtpAddrType != null)
            return false;
        if (dsw8EdExpiryDate != null ? !dsw8EdExpiryDate.equals(that.dsw8EdExpiryDate) : that.dsw8EdExpiryDate != null)
            return false;
        if (dsmnamMiddleName != null ? !dsmnamMiddleName.equals(that.dsmnamMiddleName) : that.dsmnamMiddleName != null)
            return false;
        if (dsspmnSpouceMiddleName != null ? !dsspmnSpouceMiddleName.equals(that.dsspmnSpouceMiddleName) : that.dsspmnSpouceMiddleName != null)
            return false;

        return true;
    }

    public DsmstpDistributor copy() {
        DsmstpDistributor copy = new DsmstpDistributor();
        copy.setDsctlControl(this.getDsctlControl());
        copy.setDsdidId(this.getDsdidId());
        copy.setDsfnamFirstName(this.getDsfnamFirstName());
        copy.setDslnamLastName(this.getDslnamLastName());
        copy.setDsspnSponsorControl(this.getDsspnSponsorControl());
        copy.setDscntyCountry(this.getDscntyCountry());
        copy.setDsctycCntrCode(this.getDsctycCntrCode());
        copy.setDsstasStatus(this.getDsstasStatus());
        copy.setDswaiv4CcWaiver(this.getDswaiv4CcWaiver());
        copy.setDslevlLevel(this.getDslevlLevel());
        copy.setDsmgrlMgrLevel(this.getDsmgrlMgrLevel());
        copy.setDsgmlvGemMgrLevel(this.getDsgmlvGemMgrLevel());
        copy.setDsqudsForiegnQual(this.getDsqudsForiegnQual());
        copy.setDsdqmgRecognizedManager(this.getDsdqmgRecognizedManager());
        copy.setDswk1CGrandFatherFlag(this.getDswk1CGrandFatherFlag());
        copy.setDsspsNonFederalTaxId(this.getDsspsNonFederalTaxId());
        copy.setDsrslResale(this.getDsrslResale());
        copy.setDstitlTitle(this.getDstitlTitle());
        copy.setDsspfnSpouseFname(this.getDsspfnSpouseFname());
        copy.setDssplnSpouseLname(this.getDssplnSpouseLname());
        copy.setDsadd1Add1(this.getDsadd1Add1());
        copy.setDsadd2Add2(this.getDsadd2Add2());
        copy.setDsadd3Add3(this.getDsadd3Add3());
        copy.setDsadd4Add4(this.getDsadd4Add4());
        copy.setDscityCity(this.getDscityCity());
        copy.setDsstatState(this.getDsstatState());
        copy.setDszipcZipCode(this.getDszipcZipCode());
        copy.setDsctyCounty(this.getDsctyCounty());
        copy.setDsvtxVertexFlag(this.getDsvtxVertexFlag());
        copy.setDsgeocGeoCode(this.getDsgeocGeoCode());
        copy.setDspcntCompany(this.getDspcntCompany());
        copy.setDsphonPhone(this.getDsphonPhone());
        copy.setDstrfmTransferredMgr(this.getDstrfmTransferredMgr());
        copy.setDsinhmInheritMgr(this.getDsinhmInheritMgr());
        copy.setDsareaWarehouseorArea(this.getDsareaWarehouseorArea());
        copy.setDswh2020PerWithHold(this.getDswh2020PerWithHold());
        copy.setDswh3030PerWithHold(this.getDswh3030PerWithHold());
        copy.setDssetdSetUpDate(this.getDssetdSetUpDate());
        copy.setDsamgrTotActiveMgrs(this.getDsamgrTotActiveMgrs());
        copy.setDstmgrTotMgrs(this.getDstmgrTotMgrs());
        copy.setDschgdLstChgDate(this.getDschgdLstChgDate());
        copy.setDsusidUserId(this.getDsusidUserId());
        copy.setDsarlkAreaSalesLock(this.getDsarlkAreaSalesLock());
        copy.setDsfspmFrstPurchMnth(this.getDsfspmFrstPurchMnth());
        copy.setDsfspyFrstPurchYear(this.getDsfspyFrstPurchYear());
        copy.setDslprfLangPrefCode(this.getDslprfLangPrefCode());
        copy.setDsfrdcForiegnDom(this.getDsfrdcForiegnDom());
        copy.setDsqumgForiegnQualMgr(this.getDsqumgForiegnQualMgr());
        copy.setDsfedCorpFedTaxNum(this.getDsfedCorpFedTaxNum());
        copy.setDsssrcSponsoringSrc(this.getDsssrcSponsoringSrc());
        copy.setDssssrSponsoringSubSrc(this.getDssssrSponsoringSubSrc());
        copy.setDssfdSecFedTaxId(this.getDssfdSecFedTaxId());
        copy.setDspfdPrimFedTaxId(this.getDspfdPrimFedTaxId());
        copy.setDsadtpAddrType(this.getDsadtpAddrType());
        copy.setDsw8EdExpiryDate(this.getDsw8EdExpiryDate());
        copy.setDsmnamMiddleName(this.getDsmnamMiddleName());
        copy.setDsspmnSpouceMiddleName(this.getDsspmnSpouceMiddleName());
        return copy;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dsctlControl != null ? dsctlControl.hashCode() : 0);
        result = 31 * result + (dsdidId != null ? dsdidId.hashCode() : 0);
        result = 31 * result + (dsfnamFirstName != null ? dsfnamFirstName.hashCode() : 0);
        result = 31 * result + (dslnamLastName != null ? dslnamLastName.hashCode() : 0);
        result = 31 * result + (dsspnSponsorControl != null ? dsspnSponsorControl.hashCode() : 0);
        result = 31 * result + (dscntyCountry != null ? dscntyCountry.hashCode() : 0);
        result = 31 * result + (dsctycCntrCode != null ? dsctycCntrCode.hashCode() : 0);
        result = 31 * result + (dsstasStatus != null ? dsstasStatus.hashCode() : 0);
        result = 31 * result + (dswaiv4CcWaiver != null ? dswaiv4CcWaiver.hashCode() : 0);
        result = 31 * result + (dslevlLevel != null ? dslevlLevel.hashCode() : 0);
        result = 31 * result + (dsmgrlMgrLevel != null ? dsmgrlMgrLevel.hashCode() : 0);
        result = 31 * result + (dsgmlvGemMgrLevel != null ? dsgmlvGemMgrLevel.hashCode() : 0);
        result = 31 * result + (dsqudsForiegnQual != null ? dsqudsForiegnQual.hashCode() : 0);
        result = 31 * result + (dsdqmgRecognizedManager != null ? dsdqmgRecognizedManager.hashCode() : 0);
        result = 31 * result + (dswk1CGrandFatherFlag != null ? dswk1CGrandFatherFlag.hashCode() : 0);
        result = 31 * result + (dsspsNonFederalTaxId != null ? dsspsNonFederalTaxId.hashCode() : 0);
        result = 31 * result + (dsrslResale != null ? dsrslResale.hashCode() : 0);
        result = 31 * result + (dstitlTitle != null ? dstitlTitle.hashCode() : 0);
        result = 31 * result + (dsspfnSpouseFname != null ? dsspfnSpouseFname.hashCode() : 0);
        result = 31 * result + (dssplnSpouseLname != null ? dssplnSpouseLname.hashCode() : 0);
        result = 31 * result + (dsadd1Add1 != null ? dsadd1Add1.hashCode() : 0);
        result = 31 * result + (dsadd2Add2 != null ? dsadd2Add2.hashCode() : 0);
        result = 31 * result + (dsadd3Add3 != null ? dsadd3Add3.hashCode() : 0);
        result = 31 * result + (dsadd4Add4 != null ? dsadd4Add4.hashCode() : 0);
        result = 31 * result + (dscityCity != null ? dscityCity.hashCode() : 0);
        result = 31 * result + (dsstatState != null ? dsstatState.hashCode() : 0);
        result = 31 * result + (dszipcZipCode != null ? dszipcZipCode.hashCode() : 0);
        result = 31 * result + (dsctyCounty != null ? dsctyCounty.hashCode() : 0);
        result = 31 * result + (dsvtxVertexFlag != null ? dsvtxVertexFlag.hashCode() : 0);
        result = 31 * result + (dsgeocGeoCode != null ? dsgeocGeoCode.hashCode() : 0);
        result = 31 * result + (dspcntCompany != null ? dspcntCompany.hashCode() : 0);
        result = 31 * result + (dsphonPhone != null ? dsphonPhone.hashCode() : 0);
        result = 31 * result + (dstrfmTransferredMgr != null ? dstrfmTransferredMgr.hashCode() : 0);
        result = 31 * result + (dsinhmInheritMgr != null ? dsinhmInheritMgr.hashCode() : 0);
        result = 31 * result + (dsareaWarehouseorArea != null ? dsareaWarehouseorArea.hashCode() : 0);
        result = 31 * result + (dswh2020PerWithHold != null ? dswh2020PerWithHold.hashCode() : 0);
        result = 31 * result + (dswh3030PerWithHold != null ? dswh3030PerWithHold.hashCode() : 0);
        result = 31 * result + (dssetdSetUpDate != null ? dssetdSetUpDate.hashCode() : 0);
        result = 31 * result + (dsamgrTotActiveMgrs != null ? dsamgrTotActiveMgrs.hashCode() : 0);
        result = 31 * result + (dstmgrTotMgrs != null ? dstmgrTotMgrs.hashCode() : 0);
        result = 31 * result + (dschgdLstChgDate != null ? dschgdLstChgDate.hashCode() : 0);
        result = 31 * result + (dsusidUserId != null ? dsusidUserId.hashCode() : 0);
        result = 31 * result + (dsarlkAreaSalesLock != null ? dsarlkAreaSalesLock.hashCode() : 0);
        result = 31 * result + (dsfspmFrstPurchMnth != null ? dsfspmFrstPurchMnth.hashCode() : 0);
        result = 31 * result + (dsfspyFrstPurchYear != null ? dsfspyFrstPurchYear.hashCode() : 0);
        result = 31 * result + (dslprfLangPrefCode != null ? dslprfLangPrefCode.hashCode() : 0);
        result = 31 * result + (dsfrdcForiegnDom != null ? dsfrdcForiegnDom.hashCode() : 0);
        result = 31 * result + (dsqumgForiegnQualMgr != null ? dsqumgForiegnQualMgr.hashCode() : 0);
        result = 31 * result + (dsfedCorpFedTaxNum != null ? dsfedCorpFedTaxNum.hashCode() : 0);
        result = 31 * result + (dsssrcSponsoringSrc != null ? dsssrcSponsoringSrc.hashCode() : 0);
        result = 31 * result + (dssssrSponsoringSubSrc != null ? dssssrSponsoringSubSrc.hashCode() : 0);
        result = 31 * result + (dssfdSecFedTaxId != null ? dssfdSecFedTaxId.hashCode() : 0);
        result = 31 * result + (dspfdPrimFedTaxId != null ? dspfdPrimFedTaxId.hashCode() : 0);
        result = 31 * result + (dsadtpAddrType != null ? dsadtpAddrType.hashCode() : 0);
        result = 31 * result + (dsw8EdExpiryDate != null ? dsw8EdExpiryDate.hashCode() : 0);
        result = 31 * result + (dsspmnSpouceMiddleName != null ? dsspmnSpouceMiddleName.hashCode() : 0);
        result = 31 * result + (dsmnamMiddleName != null ? dsmnamMiddleName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"DsmstpDistributor\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"dsctlControl\":\"" + dsctlControl + "\""
                + ",                         \"dsdidId\":\"" + dsdidId + "\""
                + ",                         \"dsfnamFirstName\":\"" + dsfnamFirstName + "\""
                + ",                         \"dslnamLastName\":\"" + dslnamLastName + "\""
                + ",                         \"dsspnSponsorControl\":\"" + dsspnSponsorControl + "\""
                + ",                         \"dscntyCountry\":\"" + dscntyCountry + "\""
                + ",                         \"dsctycCntrCode\":\"" + dsctycCntrCode + "\""
                + ",                         \"dsstasStatus\":\"" + dsstasStatus + "\""
                + ",                         \"dswaiv4CcWaiver\":\"" + dswaiv4CcWaiver + "\""
                + ",                         \"dslevlLevel\":\"" + dslevlLevel + "\""
                + ",                         \"dsmgrlMgrLevel\":\"" + dsmgrlMgrLevel + "\""
                + ",                         \"dsgmlvGemMgrLevel\":\"" + dsgmlvGemMgrLevel + "\""
                + ",                         \"dsqudsForiegnQual\":\"" + dsqudsForiegnQual + "\""
                + ",                         \"dsdqmgRecognizedManager\":\"" + dsdqmgRecognizedManager + "\""
                + ",                         \"dswk1CGrandFatherFlag\":\"" + dswk1CGrandFatherFlag + "\""
                + ",                         \"dsspsNonFederalTaxId\":\"" + dsspsNonFederalTaxId + "\""
                + ",                         \"dsrslResale\":\"" + dsrslResale + "\""
                + ",                         \"dstitlTitle\":\"" + dstitlTitle + "\""
                + ",                         \"dsspfnSpouseFname\":\"" + dsspfnSpouseFname + "\""
                + ",                         \"dssplnSpouseLname\":\"" + dssplnSpouseLname + "\""
                + ",                         \"dsadd1Add1\":\"" + dsadd1Add1 + "\""
                + ",                         \"dsadd2Add2\":\"" + dsadd2Add2 + "\""
                + ",                         \"dsadd3Add3\":\"" + dsadd3Add3 + "\""
                + ",                         \"dsadd4Add4\":\"" + dsadd4Add4 + "\""
                + ",                         \"dscityCity\":\"" + dscityCity + "\""
                + ",                         \"dsstatState\":\"" + dsstatState + "\""
                + ",                         \"dszipcZipCode\":\"" + dszipcZipCode + "\""
                + ",                         \"dsctyCountry\":\"" + dsctyCounty + "\""
                + ",                         \"dsvtxVertexFlag\":\"" + dsvtxVertexFlag + "\""
                + ",                         \"dsgeocGeoCode\":\"" + dsgeocGeoCode + "\""
                + ",                         \"dspcntCompany\":\"" + dspcntCompany + "\""
                + ",                         \"dsphonPhone\":\"" + dsphonPhone + "\""
                + ",                         \"dstrfmTransferredMgr\":\"" + dstrfmTransferredMgr + "\""
                + ",                         \"dsinhmInheritMgr\":\"" + dsinhmInheritMgr + "\""
                + ",                         \"dsareaWarehouseorArea\":\"" + dsareaWarehouseorArea + "\""
                + ",                         \"dswh2020PerWithHold\":\"" + dswh2020PerWithHold + "\""
                + ",                         \"dswh3030PerWithHold\":\"" + dswh3030PerWithHold + "\""
                + ",                         \"dssetdSetUpDate\":\"" + dssetdSetUpDate + "\""
                + ",                         \"dsamgrTotActiveMgrs\":\"" + dsamgrTotActiveMgrs + "\""
                + ",                         \"dstmgrTotMgrs\":\"" + dstmgrTotMgrs + "\""
                + ",                         \"dschgdLstChgDate\":\"" + dschgdLstChgDate + "\""
                + ",                         \"dsusidUserId\":\"" + dsusidUserId + "\""
                + ",                         \"dsarlkAreaSalesLock\":\"" + dsarlkAreaSalesLock + "\""
                + ",                         \"dsfspmFrstPurchMnth\":\"" + dsfspmFrstPurchMnth + "\""
                + ",                         \"dsfspyFrstPurchYear\":\"" + dsfspyFrstPurchYear + "\""
                + ",                         \"dslprfLangPrefCode\":\"" + dslprfLangPrefCode + "\""
                + ",                         \"dsfrdcForiegnDom\":\"" + dsfrdcForiegnDom + "\""
                + ",                         \"dsqumgForiegnQualMgr\":\"" + dsqumgForiegnQualMgr + "\""
                + ",                         \"dsfedCorpFedTaxNum\":\"" + dsfedCorpFedTaxNum + "\""
                + ",                         \"dsssrcSponsoringSrc\":\"" + dsssrcSponsoringSrc + "\""
                + ",                         \"dssssrSponsoringSubSrc\":\"" + dssssrSponsoringSubSrc + "\""
                + ",                         \"dssfdSecFedTaxId\":\"" + dssfdSecFedTaxId + "\""
                + ",                         \"dspfdPrimFedTaxId\":\"" + dspfdPrimFedTaxId + "\""
                + ",                         \"dsadtpAddrType\":\"" + dsadtpAddrType + "\""
                + ",                         \"dsw8EdExpiryDate\":\"" + dsw8EdExpiryDate + "\""
                + ",                         \"dsmnamMiddleName\":\"" + dsmnamMiddleName + "\""
                + ",                         \"dsspmnSpouceMiddleName\":\"" + dsspmnSpouceMiddleName + "\""
                + "}}";
    }
}
