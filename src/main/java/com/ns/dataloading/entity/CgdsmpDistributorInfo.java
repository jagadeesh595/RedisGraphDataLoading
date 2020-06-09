package com.ns.dataloading.entity;

import javax.persistence.*;

@Entity
@Table(name = "CGDSMP_DistributorInfo")
public class CgdsmpDistributorInfo {
    private Long id;
    private String cgctycOprcompanyiso;
    private String cgctlDistributorctl;
    private String cgdid1Distributorid;
    private String cgspnSponsorctl;
    private String cgfnamFirstname;
    private String cgmnamMiddlename;
    private String cglnamLastname;
    private String cgspfnSpousefirstname;
    private String cgspnmSpousemiddlename;
    private String cgsplnSpouselastname;
    private String cgadd1Addressline1;
    private String cgadd2Addressline2;
    private String cgadd3Addressline3;
    private String cgadd4Addressline4;
    private String cgcityCity;
    private String cgstatState;
    private String cgzipcZip;
    private String cgcntyCountry;
    private String cgareaArea;
    private Integer cglevlLevel;
    private String cgemadEmailaddress;
    private String cgemad2Emailaddress2;
    private String cgphn1Phone1;
    private String cgphn2Phone2;
    private String cgphn3Phone3;
    private String  cgsetdSetUpdate;
    private String cgsetuSetUpuserid;
    private String  cgchgdatLastChgdate;
    private String cgchgusrLastChguserid;
    private String  cgtrmdTerminationdate;
    private Integer cgfspyFirstpurchaseyear;
    private Integer cgfspmFirstpurchasemonth;
    private String cgtrfmTransferredmgr;
    private String cginhmInheritedmanager;
    private Integer cgmgrlManagerlevel;
    private Integer cggmlvGemmgrlevel;
    private String cgdqmgRecognizedmanager;
    private String cgstasStatus;
    private String cgpcntHomecompany;
    private String cglddtLoaddate;
    private String cgohcoOveridingoprco;
    private String cgtitlTitle;
    private String cgsufxSuffix;
    private Long cgdidDistid;
    private String cgctyCounty;
    private String cgfspdFirstpurchaseday;
    private String cgwsddtWholesaledistdate;
    private String cgmarstsMaritalstatusmors;
    private String cgdstSsnDistSs;
    private String cgdstDobDistDob;
    private String cgspsSsnSpouseSs;
    private String cgspsDobSpouseDob;
    private String cgdphnsrchDsPhnsrch;
    private String cglangPrfLangPrf;
    private String cgluEnablLUpEnabl;
    private String cgmoblNbMoblNumb;
    private String cgautoShpAutoshpEn;
    private Long cgbndgIdBindingdid;
    private String cgvatregVatregistered;
    private String cgvatidVatid;
    private String cgpswdPassword;
    private String cglordcntyLastorderopco;
    private String cglordcoidLastorderiso;
    private Integer cglordpyrLastorderprocyr;
    private Integer cglordpmoLastorderprocmo;
    private String cglordLastorder;
    private String  cglorddatLastorderdate;
    private String cgstampAddOrchangestamp;
    private String cgdelDeleteflag;
    private Long cgdxtseqDxtransactionsequence;
    private Long cgsfbldSalesforceload;
    private String cgsfblddatSalesforceloaddate;
    private String cgsfbldtimSalesforceloaddate;
    private Long cgsfdelSalesforcedeleteload;
    private String cgsfdeldatSalesforcedeletedate;
    private String cgsfdeltimSalesforcedeletetime;
    private Long cgsfcfmSalesforceconfirm;
    private String cgsfcfmdatSalesforceconfirmdate;
    private String cgsfcfmtimSalesforceconfirmtime;
    private String cgmmadddatMarketingadddate;
    private String cgmmaddtimMarketingaddtime;
    private String cgmmchgdatMarketingchangedate;
    private String cgmmchgtimMarketingchangetime;
    private String cgmmdeldatMarketingdeletedate;
    private String cgmmdeltimMarketingdeletetime;

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
    @Column(name = "CGCTYC_Oprcompanyiso", nullable = true, length = 15)
    public String getCgctycOprcompanyiso() {
        return cgctycOprcompanyiso;
    }

    public void setCgctycOprcompanyiso(String cgctycOprcompanyiso) {
        this.cgctycOprcompanyiso = cgctycOprcompanyiso;
    }

    @Basic
    @Column(name = "CGCTL_distributorctl", nullable = false, length = 15)
    public String getCgctlDistributorctl() {
        return cgctlDistributorctl;
    }

    public void setCgctlDistributorctl(String cgctlDistributorctl) {
        this.cgctlDistributorctl = cgctlDistributorctl;
    }

    @Basic
    @Column(name = "CGDID1_distributorid", nullable = true, length = 15)
    public String getCgdid1Distributorid() {
        return cgdid1Distributorid;
    }

    public void setCgdid1Distributorid(String cgdid1Distributorid) {
        this.cgdid1Distributorid = cgdid1Distributorid;
    }

    @Basic
    @Column(name = "CGSPN_sponsorctl", nullable = true, length = 15)
    public String getCgspnSponsorctl() {
        return cgspnSponsorctl;
    }

    public void setCgspnSponsorctl(String cgspnSponsorctl) {
        this.cgspnSponsorctl = cgspnSponsorctl;
    }

    @Basic
    @Column(name = "CGFNAM_firstname", nullable = true, length = 25)
    public String getCgfnamFirstname() {
        return cgfnamFirstname;
    }

    public void setCgfnamFirstname(String cgfnamFirstname) {
        this.cgfnamFirstname = cgfnamFirstname;
    }

    @Basic
    @Column(name = "CGMNAM_middlename", nullable = true, length = 25)
    public String getCgmnamMiddlename() {
        return cgmnamMiddlename;
    }

    public void setCgmnamMiddlename(String cgmnamMiddlename) {
        this.cgmnamMiddlename = cgmnamMiddlename;
    }

    @Basic
    @Column(name = "CGLNAM_lastname", nullable = true, length = 25)
    public String getCglnamLastname() {
        return cglnamLastname;
    }

    public void setCglnamLastname(String cglnamLastname) {
        this.cglnamLastname = cglnamLastname;
    }

    @Basic
    @Column(name = "CGSPFN_spousefirstname", nullable = true, length = 25)
    public String getCgspfnSpousefirstname() {
        return cgspfnSpousefirstname;
    }

    public void setCgspfnSpousefirstname(String cgspfnSpousefirstname) {
        this.cgspfnSpousefirstname = cgspfnSpousefirstname;
    }

    @Basic
    @Column(name = "CGSPNM_spousemiddlename", nullable = true, length = 25)
    public String getCgspnmSpousemiddlename() {
        return cgspnmSpousemiddlename;
    }

    public void setCgspnmSpousemiddlename(String cgspnmSpousemiddlename) {
        this.cgspnmSpousemiddlename = cgspnmSpousemiddlename;
    }

    @Basic
    @Column(name = "CGSPLN_spouselastname", nullable = true, length = 25)
    public String getCgsplnSpouselastname() {
        return cgsplnSpouselastname;
    }

    public void setCgsplnSpouselastname(String cgsplnSpouselastname) {
        this.cgsplnSpouselastname = cgsplnSpouselastname;
    }

    @Basic
    @Column(name = "CGADD1_addressline1", nullable = true, length = 50)
    public String getCgadd1Addressline1() {
        return cgadd1Addressline1;
    }

    public void setCgadd1Addressline1(String cgadd1Addressline1) {
        this.cgadd1Addressline1 = cgadd1Addressline1;
    }

    @Basic
    @Column(name = "CGADD2_addressline2", nullable = true, length = 50)
    public String getCgadd2Addressline2() {
        return cgadd2Addressline2;
    }

    public void setCgadd2Addressline2(String cgadd2Addressline2) {
        this.cgadd2Addressline2 = cgadd2Addressline2;
    }

    @Basic
    @Column(name = "CGADD3_addressline3", nullable = true, length = 50)
    public String getCgadd3Addressline3() {
        return cgadd3Addressline3;
    }

    public void setCgadd3Addressline3(String cgadd3Addressline3) {
        this.cgadd3Addressline3 = cgadd3Addressline3;
    }

    @Basic
    @Column(name = "CGADD4_addressline4", nullable = true, length = 50)
    public String getCgadd4Addressline4() {
        return cgadd4Addressline4;
    }

    public void setCgadd4Addressline4(String cgadd4Addressline4) {
        this.cgadd4Addressline4 = cgadd4Addressline4;
    }

    @Basic
    @Column(name = "CGCITY_city", nullable = true, length = 50)
    public String getCgcityCity() {
        return cgcityCity;
    }

    public void setCgcityCity(String cgcityCity) {
        this.cgcityCity = cgcityCity;
    }

    @Basic
    @Column(name = "CGSTAT_state", nullable = true, length = 50)
    public String getCgstatState() {
        return cgstatState;
    }

    public void setCgstatState(String cgstatState) {
        this.cgstatState = cgstatState;
    }

    @Basic
    @Column(name = "CGZIPC_zip", nullable = true, length = 10)
    public String getCgzipcZip() {
        return cgzipcZip;
    }

    public void setCgzipcZip(String cgzipcZip) {
        this.cgzipcZip = cgzipcZip;
    }

    @Basic
    @Column(name = "CGCNTY_country", nullable = true, length = 30)
    public String getCgcntyCountry() {
        return cgcntyCountry;
    }

    public void setCgcntyCountry(String cgcntyCountry) {
        this.cgcntyCountry = cgcntyCountry;
    }

    @Basic
    @Column(name = "CGAREA_area", nullable = true, length = 10)
    public String getCgareaArea() {
        return cgareaArea;
    }

    public void setCgareaArea(String cgareaArea) {
        this.cgareaArea = cgareaArea;
    }

    @Basic
    @Column(name = "CGLEVL_level", nullable = true)
    public Integer getCglevlLevel() {
        return cglevlLevel;
    }

    public void setCglevlLevel(Integer cglevlLevel) {
        this.cglevlLevel = cglevlLevel;
    }

    @Basic
    @Column(name = "CGEMAD_emailaddress", nullable = true, length = 50)
    public String getCgemadEmailaddress() {
        return cgemadEmailaddress;
    }

    public void setCgemadEmailaddress(String cgemadEmailaddress) {
        this.cgemadEmailaddress = cgemadEmailaddress;
    }

    @Basic
    @Column(name = "CGEMAD2_emailaddress2", nullable = true, length = 50)
    public String getCgemad2Emailaddress2() {
        return cgemad2Emailaddress2;
    }

    public void setCgemad2Emailaddress2(String cgemad2Emailaddress2) {
        this.cgemad2Emailaddress2 = cgemad2Emailaddress2;
    }

    @Basic
    @Column(name = "CGPHN1_phone1", nullable = true, length = 50)
    public String getCgphn1Phone1() {
        return cgphn1Phone1;
    }

    public void setCgphn1Phone1(String cgphn1Phone1) {
        this.cgphn1Phone1 = cgphn1Phone1;
    }

    @Basic
    @Column(name = "CGPHN2_phone2", nullable = true, length = 50)
    public String getCgphn2Phone2() {
        return cgphn2Phone2;
    }

    public void setCgphn2Phone2(String cgphn2Phone2) {
        this.cgphn2Phone2 = cgphn2Phone2;
    }

    @Basic
    @Column(name = "CGPHN3_phone3", nullable = true, length = 50)
    public String getCgphn3Phone3() {
        return cgphn3Phone3;
    }

    public void setCgphn3Phone3(String cgphn3Phone3) {
        this.cgphn3Phone3 = cgphn3Phone3;
    }

    @Basic
    @Column(name = "CGSETD_set_update", nullable = true)
    public String  getCgsetdSetUpdate() {
        return cgsetdSetUpdate;
    }

    public void setCgsetdSetUpdate(String  cgsetdSetUpdate) {
        this.cgsetdSetUpdate = cgsetdSetUpdate;
    }

    @Basic
    @Column(name = "CGSETU_set_upuserid", nullable = true, length = 15)
    public String getCgsetuSetUpuserid() {
        return cgsetuSetUpuserid;
    }

    public void setCgsetuSetUpuserid(String cgsetuSetUpuserid) {
        this.cgsetuSetUpuserid = cgsetuSetUpuserid;
    }

    @Basic
    @Column(name = "CGCHGDAT_last_chgdate", nullable = true)
    public String  getCgchgdatLastChgdate() {
        return cgchgdatLastChgdate;
    }

    public void setCgchgdatLastChgdate(String  cgchgdatLastChgdate) {
        this.cgchgdatLastChgdate = cgchgdatLastChgdate;
    }

    @Basic
    @Column(name = "CGCHGUSR_last_chguserid", nullable = true, length = 15)
    public String getCgchgusrLastChguserid() {
        return cgchgusrLastChguserid;
    }

    public void setCgchgusrLastChguserid(String cgchgusrLastChguserid) {
        this.cgchgusrLastChguserid = cgchgusrLastChguserid;
    }

    @Basic
    @Column(name = "CGTRMD_terminationdate", nullable = true)
    public String  getCgtrmdTerminationdate() {
        return cgtrmdTerminationdate;
    }

    public void setCgtrmdTerminationdate(String  cgtrmdTerminationdate) {
        this.cgtrmdTerminationdate = cgtrmdTerminationdate;
    }

    @Basic
    @Column(name = "CGFSPY_firstpurchaseyear", nullable = true)
    public Integer getCgfspyFirstpurchaseyear() {
        return cgfspyFirstpurchaseyear;
    }

    public void setCgfspyFirstpurchaseyear(Integer cgfspyFirstpurchaseyear) {
        this.cgfspyFirstpurchaseyear = cgfspyFirstpurchaseyear;
    }

    @Basic
    @Column(name = "CGFSPM_firstpurchasemonth", nullable = true)
    public Integer getCgfspmFirstpurchasemonth() {
        return cgfspmFirstpurchasemonth;
    }

    public void setCgfspmFirstpurchasemonth(Integer cgfspmFirstpurchasemonth) {
        this.cgfspmFirstpurchasemonth = cgfspmFirstpurchasemonth;
    }

    @Basic
    @Column(name = "CGTRFM_transferredmgr", nullable = true, length = 1)
    public String getCgtrfmTransferredmgr() {
        return cgtrfmTransferredmgr;
    }

    public void setCgtrfmTransferredmgr(String cgtrfmTransferredmgr) {
        this.cgtrfmTransferredmgr = cgtrfmTransferredmgr;
    }

    @Basic
    @Column(name = "CGINHM_inheritedmanager", nullable = true, length = 1)
    public String getCginhmInheritedmanager() {
        return cginhmInheritedmanager;
    }

    public void setCginhmInheritedmanager(String cginhmInheritedmanager) {
        this.cginhmInheritedmanager = cginhmInheritedmanager;
    }

    @Basic
    @Column(name = "CGMGRL_managerlevel", nullable = true)
    public Integer getCgmgrlManagerlevel() {
        return cgmgrlManagerlevel;
    }

    public void setCgmgrlManagerlevel(Integer cgmgrlManagerlevel) {
        this.cgmgrlManagerlevel = cgmgrlManagerlevel;
    }

    @Basic
    @Column(name = "CGGMLV_gemmgrlevel", nullable = true)
    public Integer getCggmlvGemmgrlevel() {
        return cggmlvGemmgrlevel;
    }

    public void setCggmlvGemmgrlevel(Integer cggmlvGemmgrlevel) {
        this.cggmlvGemmgrlevel = cggmlvGemmgrlevel;
    }

    @Basic
    @Column(name = "CGDQMG_recognizedmanager", nullable = true, length = 1)
    public String getCgdqmgRecognizedmanager() {
        return cgdqmgRecognizedmanager;
    }

    public void setCgdqmgRecognizedmanager(String cgdqmgRecognizedmanager) {
        this.cgdqmgRecognizedmanager = cgdqmgRecognizedmanager;
    }

    @Basic
    @Column(name = "CGSTAS_status", nullable = true, length = 1)
    public String getCgstasStatus() {
        return cgstasStatus;
    }

    public void setCgstasStatus(String cgstasStatus) {
        this.cgstasStatus = cgstasStatus;
    }

    @Basic
    @Column(name = "CGPCNT_homecompany", nullable = true, length = 15)
    public String getCgpcntHomecompany() {
        return cgpcntHomecompany;
    }

    public void setCgpcntHomecompany(String cgpcntHomecompany) {
        this.cgpcntHomecompany = cgpcntHomecompany;
    }

    @Basic
    @Column(name = "CGLDDT_loaddate", nullable = true, length = 15)
    public String getCglddtLoaddate() {
        return cglddtLoaddate;
    }

    public void setCglddtLoaddate(String cglddtLoaddate) {
        this.cglddtLoaddate = cglddtLoaddate;
    }

    @Basic
    @Column(name = "CGOHCO_overidingoprco", nullable = true, length = 15)
    public String getCgohcoOveridingoprco() {
        return cgohcoOveridingoprco;
    }

    public void setCgohcoOveridingoprco(String cgohcoOveridingoprco) {
        this.cgohcoOveridingoprco = cgohcoOveridingoprco;
    }

    @Basic
    @Column(name = "CGTITL_title", nullable = true, length = 15)
    public String getCgtitlTitle() {
        return cgtitlTitle;
    }

    public void setCgtitlTitle(String cgtitlTitle) {
        this.cgtitlTitle = cgtitlTitle;
    }

    @Basic
    @Column(name = "CGSUFX_suffix", nullable = true, length = 15)
    public String getCgsufxSuffix() {
        return cgsufxSuffix;
    }

    public void setCgsufxSuffix(String cgsufxSuffix) {
        this.cgsufxSuffix = cgsufxSuffix;
    }

    @Basic
    @Column(name = "CGDID_distid", nullable = true)
    public Long getCgdidDistid() {
        return cgdidDistid;
    }

    public void setCgdidDistid(Long cgdidDistid) {
        this.cgdidDistid = cgdidDistid;
    }

    @Basic
    @Column(name = "CGCTY_county", nullable = true, length = 25)
    public String getCgctyCounty() {
        return cgctyCounty;
    }

    public void setCgctyCounty(String cgctyCounty) {
        this.cgctyCounty = cgctyCounty;
    }

    @Basic
    @Column(name = "CGFSPD_firstpurchaseday", nullable = true, length = 15)
    public String getCgfspdFirstpurchaseday() {
        return cgfspdFirstpurchaseday;
    }

    public void setCgfspdFirstpurchaseday(String cgfspdFirstpurchaseday) {
        this.cgfspdFirstpurchaseday = cgfspdFirstpurchaseday;
    }

    @Basic
    @Column(name = "CGWSDDT_wholesaledistdate", nullable = true, length = 15)
    public String getCgwsddtWholesaledistdate() {
        return cgwsddtWholesaledistdate;
    }

    public void setCgwsddtWholesaledistdate(String cgwsddtWholesaledistdate) {
        this.cgwsddtWholesaledistdate = cgwsddtWholesaledistdate;
    }

    @Basic
    @Column(name = "CGMARSTS_maritalstatusmors", nullable = true, length = 1)
    public String getCgmarstsMaritalstatusmors() {
        return cgmarstsMaritalstatusmors;
    }

    public void setCgmarstsMaritalstatusmors(String cgmarstsMaritalstatusmors) {
        this.cgmarstsMaritalstatusmors = cgmarstsMaritalstatusmors;
    }

    @Basic
    @Column(name = "CGDST_SSN_dist_ss", nullable = true, length = 20)
    public String getCgdstSsnDistSs() {
        return cgdstSsnDistSs;
    }

    public void setCgdstSsnDistSs(String cgdstSsnDistSs) {
        this.cgdstSsnDistSs = cgdstSsnDistSs;
    }

    @Basic
    @Column(name = "CGDST_DOB_dist_dob", nullable = true, length = 15)
    public String getCgdstDobDistDob() {
        return cgdstDobDistDob;
    }

    public void setCgdstDobDistDob(String cgdstDobDistDob) {
        this.cgdstDobDistDob = cgdstDobDistDob;
    }

    @Basic
    @Column(name = "CGSPS_SSN_spouse_ss", nullable = true, length = 20)
    public String getCgspsSsnSpouseSs() {
        return cgspsSsnSpouseSs;
    }

    public void setCgspsSsnSpouseSs(String cgspsSsnSpouseSs) {
        this.cgspsSsnSpouseSs = cgspsSsnSpouseSs;
    }

    @Basic
    @Column(name = "CGSPS_DOB_spouse_dob", nullable = true, length = 15)
    public String getCgspsDobSpouseDob() {
        return cgspsDobSpouseDob;
    }

    public void setCgspsDobSpouseDob(String cgspsDobSpouseDob) {
        this.cgspsDobSpouseDob = cgspsDobSpouseDob;
    }

    @Basic
    @Column(name = "CGDPHNSRCH_ds_phnsrch", nullable = true, length = 1)
    public String getCgdphnsrchDsPhnsrch() {
        return cgdphnsrchDsPhnsrch;
    }

    public void setCgdphnsrchDsPhnsrch(String cgdphnsrchDsPhnsrch) {
        this.cgdphnsrchDsPhnsrch = cgdphnsrchDsPhnsrch;
    }

    @Basic
    @Column(name = "CGLANG_PRF_lang_prf", nullable = true, length = 2)
    public String getCglangPrfLangPrf() {
        return cglangPrfLangPrf;
    }

    public void setCglangPrfLangPrf(String cglangPrfLangPrf) {
        this.cglangPrfLangPrf = cglangPrfLangPrf;
    }

    @Basic
    @Column(name = "CGLU_ENABL_l_up_enabl", nullable = true, length = 1)
    public String getCgluEnablLUpEnabl() {
        return cgluEnablLUpEnabl;
    }

    public void setCgluEnablLUpEnabl(String cgluEnablLUpEnabl) {
        this.cgluEnablLUpEnabl = cgluEnablLUpEnabl;
    }

    @Basic
    @Column(name = "CGMOBL_NB_mobl_numb", nullable = true, length = 15)
    public String getCgmoblNbMoblNumb() {
        return cgmoblNbMoblNumb;
    }

    public void setCgmoblNbMoblNumb(String cgmoblNbMoblNumb) {
        this.cgmoblNbMoblNumb = cgmoblNbMoblNumb;
    }

    @Basic
    @Column(name = "CGAUTO_SHP_autoshp_en", nullable = true, length = 1)
    public String getCgautoShpAutoshpEn() {
        return cgautoShpAutoshpEn;
    }

    public void setCgautoShpAutoshpEn(String cgautoShpAutoshpEn) {
        this.cgautoShpAutoshpEn = cgautoShpAutoshpEn;
    }

    @Basic
    @Column(name = "CGBNDG_ID_bindingdid", nullable = true)
    public Long getCgbndgIdBindingdid() {
        return cgbndgIdBindingdid;
    }

    public void setCgbndgIdBindingdid(Long cgbndgIdBindingdid) {
        this.cgbndgIdBindingdid = cgbndgIdBindingdid;
    }

    @Basic
    @Column(name = "CGVATREG_vatregistered", nullable = true, length = 1)
    public String getCgvatregVatregistered() {
        return cgvatregVatregistered;
    }

    public void setCgvatregVatregistered(String cgvatregVatregistered) {
        this.cgvatregVatregistered = cgvatregVatregistered;
    }

    @Basic
    @Column(name = "CGVATID_vatid", nullable = true, length = 20)
    public String getCgvatidVatid() {
        return cgvatidVatid;
    }

    public void setCgvatidVatid(String cgvatidVatid) {
        this.cgvatidVatid = cgvatidVatid;
    }

    @Basic
    @Column(name = "CGPSWD_password", nullable = true, length = 20)
    public String getCgpswdPassword() {
        return cgpswdPassword;
    }

    public void setCgpswdPassword(String cgpswdPassword) {
        this.cgpswdPassword = cgpswdPassword;
    }

    @Basic
    @Column(name = "CGLORDCNTY_lastorderopco", nullable = true, length = 20)
    public String getCglordcntyLastorderopco() {
        return cglordcntyLastorderopco;
    }

    public void setCglordcntyLastorderopco(String cglordcntyLastorderopco) {
        this.cglordcntyLastorderopco = cglordcntyLastorderopco;
    }

    @Basic
    @Column(name = "CGLORDCOID_lastorderiso", nullable = true, length = 20)
    public String getCglordcoidLastorderiso() {
        return cglordcoidLastorderiso;
    }

    public void setCglordcoidLastorderiso(String cglordcoidLastorderiso) {
        this.cglordcoidLastorderiso = cglordcoidLastorderiso;
    }

    @Basic
    @Column(name = "CGLORDPYR_lastorderprocyr", nullable = true)
    public Integer getCglordpyrLastorderprocyr() {
        return cglordpyrLastorderprocyr;
    }

    public void setCglordpyrLastorderprocyr(Integer cglordpyrLastorderprocyr) {
        this.cglordpyrLastorderprocyr = cglordpyrLastorderprocyr;
    }

    @Basic
    @Column(name = "CGLORDPMO_lastorderprocmo", nullable = true)
    public Integer getCglordpmoLastorderprocmo() {
        return cglordpmoLastorderprocmo;
    }

    public void setCglordpmoLastorderprocmo(Integer cglordpmoLastorderprocmo) {
        this.cglordpmoLastorderprocmo = cglordpmoLastorderprocmo;
    }

    @Basic
    @Column(name = "CGLORD_lastorder", nullable = true, length = 15)
    public String getCglordLastorder() {
        return cglordLastorder;
    }

    public void setCglordLastorder(String cglordLastorder) {
        this.cglordLastorder = cglordLastorder;
    }

    @Basic
    @Column(name = "CGLORDDAT_lastorderdate", nullable = true)
    public String  getCglorddatLastorderdate() {
        return cglorddatLastorderdate;
    }

    public void setCglorddatLastorderdate(String  cglorddatLastorderdate) {
        this.cglorddatLastorderdate = cglorddatLastorderdate;
    }

    @Basic
    @Column(name = "CGSTAMP_addOrchangestamp", nullable = true, length = 30)
    public String getCgstampAddOrchangestamp() {
        return cgstampAddOrchangestamp;
    }

    public void setCgstampAddOrchangestamp(String cgstampAddOrchangestamp) {
        this.cgstampAddOrchangestamp = cgstampAddOrchangestamp;
    }

    @Basic
    @Column(name = "CGDEL_deleteflag", nullable = true, length = 1)
    public String getCgdelDeleteflag() {
        return cgdelDeleteflag;
    }

    public void setCgdelDeleteflag(String cgdelDeleteflag) {
        this.cgdelDeleteflag = cgdelDeleteflag;
    }

    @Basic
    @Column(name = "CGDXTSEQ_dxtransactionsequence", nullable = true)
    public Long getCgdxtseqDxtransactionsequence() {
        return cgdxtseqDxtransactionsequence;
    }

    public void setCgdxtseqDxtransactionsequence(Long cgdxtseqDxtransactionsequence) {
        this.cgdxtseqDxtransactionsequence = cgdxtseqDxtransactionsequence;
    }

    @Basic
    @Column(name = "CGSFBLD_salesforceload", nullable = true)
    public Long getCgsfbldSalesforceload() {
        return cgsfbldSalesforceload;
    }

    public void setCgsfbldSalesforceload(Long cgsfbldSalesforceload) {
        this.cgsfbldSalesforceload = cgsfbldSalesforceload;
    }

    @Basic
    @Column(name = "CGSFBLDDAT_salesforceloaddate", nullable = true, length = 15)
    public String getCgsfblddatSalesforceloaddate() {
        return cgsfblddatSalesforceloaddate;
    }

    public void setCgsfblddatSalesforceloaddate(String cgsfblddatSalesforceloaddate) {
        this.cgsfblddatSalesforceloaddate = cgsfblddatSalesforceloaddate;
    }

    @Basic
    @Column(name = "CGSFBLDTIM_salesforceloaddate", nullable = true, length = 15)
    public String getCgsfbldtimSalesforceloaddate() {
        return cgsfbldtimSalesforceloaddate;
    }

    public void setCgsfbldtimSalesforceloaddate(String cgsfbldtimSalesforceloaddate) {
        this.cgsfbldtimSalesforceloaddate = cgsfbldtimSalesforceloaddate;
    }

    @Basic
    @Column(name = "CGSFDEL_salesforcedeleteload", nullable = true)
    public Long getCgsfdelSalesforcedeleteload() {
        return cgsfdelSalesforcedeleteload;
    }

    public void setCgsfdelSalesforcedeleteload(Long cgsfdelSalesforcedeleteload) {
        this.cgsfdelSalesforcedeleteload = cgsfdelSalesforcedeleteload;
    }

    @Basic
    @Column(name = "CGSFDELDAT_salesforcedeletedate", nullable = true, length = 15)
    public String getCgsfdeldatSalesforcedeletedate() {
        return cgsfdeldatSalesforcedeletedate;
    }

    public void setCgsfdeldatSalesforcedeletedate(String cgsfdeldatSalesforcedeletedate) {
        this.cgsfdeldatSalesforcedeletedate = cgsfdeldatSalesforcedeletedate;
    }

    @Basic
    @Column(name = "CGSFDELTIM_salesforcedeletetime", nullable = true, length = 15)
    public String getCgsfdeltimSalesforcedeletetime() {
        return cgsfdeltimSalesforcedeletetime;
    }

    public void setCgsfdeltimSalesforcedeletetime(String cgsfdeltimSalesforcedeletetime) {
        this.cgsfdeltimSalesforcedeletetime = cgsfdeltimSalesforcedeletetime;
    }

    @Basic
    @Column(name = "CGSFCFM_salesforceconfirm", nullable = true)
    public Long getCgsfcfmSalesforceconfirm() {
        return cgsfcfmSalesforceconfirm;
    }

    public void setCgsfcfmSalesforceconfirm(Long cgsfcfmSalesforceconfirm) {
        this.cgsfcfmSalesforceconfirm = cgsfcfmSalesforceconfirm;
    }

    @Basic
    @Column(name = "CGSFCFMDAT_salesforceconfirmdate", nullable = true, length = 15)
    public String getCgsfcfmdatSalesforceconfirmdate() {
        return cgsfcfmdatSalesforceconfirmdate;
    }

    public void setCgsfcfmdatSalesforceconfirmdate(String cgsfcfmdatSalesforceconfirmdate) {
        this.cgsfcfmdatSalesforceconfirmdate = cgsfcfmdatSalesforceconfirmdate;
    }

    @Basic
    @Column(name = "CGSFCFMTIM_salesforceconfirmtime", nullable = true, length = 15)
    public String getCgsfcfmtimSalesforceconfirmtime() {
        return cgsfcfmtimSalesforceconfirmtime;
    }

    public void setCgsfcfmtimSalesforceconfirmtime(String cgsfcfmtimSalesforceconfirmtime) {
        this.cgsfcfmtimSalesforceconfirmtime = cgsfcfmtimSalesforceconfirmtime;
    }

    @Basic
    @Column(name = "CGMMADDDAT_marketingadddate", nullable = true, length = 15)
    public String getCgmmadddatMarketingadddate() {
        return cgmmadddatMarketingadddate;
    }

    public void setCgmmadddatMarketingadddate(String cgmmadddatMarketingadddate) {
        this.cgmmadddatMarketingadddate = cgmmadddatMarketingadddate;
    }

    @Basic
    @Column(name = "CGMMADDTIM_marketingaddtime", nullable = true, length = 15)
    public String getCgmmaddtimMarketingaddtime() {
        return cgmmaddtimMarketingaddtime;
    }

    public void setCgmmaddtimMarketingaddtime(String cgmmaddtimMarketingaddtime) {
        this.cgmmaddtimMarketingaddtime = cgmmaddtimMarketingaddtime;
    }

    @Basic
    @Column(name = "CGMMCHGDAT_marketingchangedate", nullable = true, length = 15)
    public String getCgmmchgdatMarketingchangedate() {
        return cgmmchgdatMarketingchangedate;
    }

    public void setCgmmchgdatMarketingchangedate(String cgmmchgdatMarketingchangedate) {
        this.cgmmchgdatMarketingchangedate = cgmmchgdatMarketingchangedate;
    }

    @Basic
    @Column(name = "CGMMCHGTIM_marketingchangetime", nullable = true, length = 15)
    public String getCgmmchgtimMarketingchangetime() {
        return cgmmchgtimMarketingchangetime;
    }

    public void setCgmmchgtimMarketingchangetime(String cgmmchgtimMarketingchangetime) {
        this.cgmmchgtimMarketingchangetime = cgmmchgtimMarketingchangetime;
    }

    @Basic
    @Column(name = "CGMMDELDAT_marketingdeletedate", nullable = true, length = 15)
    public String getCgmmdeldatMarketingdeletedate() {
        return cgmmdeldatMarketingdeletedate;
    }

    public void setCgmmdeldatMarketingdeletedate(String cgmmdeldatMarketingdeletedate) {
        this.cgmmdeldatMarketingdeletedate = cgmmdeldatMarketingdeletedate;
    }

    @Basic
    @Column(name = "CGMMDELTIM_marketingdeletetime", nullable = true, length = 15)
    public String getCgmmdeltimMarketingdeletetime() {
        return cgmmdeltimMarketingdeletetime;
    }

    public void setCgmmdeltimMarketingdeletetime(String cgmmdeltimMarketingdeletetime) {
        this.cgmmdeltimMarketingdeletetime = cgmmdeltimMarketingdeletetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CgdsmpDistributorInfo that = (CgdsmpDistributorInfo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (cgctycOprcompanyiso != null ? !cgctycOprcompanyiso.equals(that.cgctycOprcompanyiso) : that.cgctycOprcompanyiso != null)
            return false;
        if (cgctlDistributorctl != null ? !cgctlDistributorctl.equals(that.cgctlDistributorctl) : that.cgctlDistributorctl != null)
            return false;
        if (cgdid1Distributorid != null ? !cgdid1Distributorid.equals(that.cgdid1Distributorid) : that.cgdid1Distributorid != null)
            return false;
        if (cgspnSponsorctl != null ? !cgspnSponsorctl.equals(that.cgspnSponsorctl) : that.cgspnSponsorctl != null)
            return false;
        if (cgfnamFirstname != null ? !cgfnamFirstname.equals(that.cgfnamFirstname) : that.cgfnamFirstname != null)
            return false;
        if (cgmnamMiddlename != null ? !cgmnamMiddlename.equals(that.cgmnamMiddlename) : that.cgmnamMiddlename != null)
            return false;
        if (cglnamLastname != null ? !cglnamLastname.equals(that.cglnamLastname) : that.cglnamLastname != null)
            return false;
        if (cgspfnSpousefirstname != null ? !cgspfnSpousefirstname.equals(that.cgspfnSpousefirstname) : that.cgspfnSpousefirstname != null)
            return false;
        if (cgspnmSpousemiddlename != null ? !cgspnmSpousemiddlename.equals(that.cgspnmSpousemiddlename) : that.cgspnmSpousemiddlename != null)
            return false;
        if (cgsplnSpouselastname != null ? !cgsplnSpouselastname.equals(that.cgsplnSpouselastname) : that.cgsplnSpouselastname != null)
            return false;
        if (cgadd1Addressline1 != null ? !cgadd1Addressline1.equals(that.cgadd1Addressline1) : that.cgadd1Addressline1 != null)
            return false;
        if (cgadd2Addressline2 != null ? !cgadd2Addressline2.equals(that.cgadd2Addressline2) : that.cgadd2Addressline2 != null)
            return false;
        if (cgadd3Addressline3 != null ? !cgadd3Addressline3.equals(that.cgadd3Addressline3) : that.cgadd3Addressline3 != null)
            return false;
        if (cgadd4Addressline4 != null ? !cgadd4Addressline4.equals(that.cgadd4Addressline4) : that.cgadd4Addressline4 != null)
            return false;
        if (cgcityCity != null ? !cgcityCity.equals(that.cgcityCity) : that.cgcityCity != null) return false;
        if (cgstatState != null ? !cgstatState.equals(that.cgstatState) : that.cgstatState != null) return false;
        if (cgzipcZip != null ? !cgzipcZip.equals(that.cgzipcZip) : that.cgzipcZip != null) return false;
        if (cgcntyCountry != null ? !cgcntyCountry.equals(that.cgcntyCountry) : that.cgcntyCountry != null)
            return false;
        if (cgareaArea != null ? !cgareaArea.equals(that.cgareaArea) : that.cgareaArea != null) return false;
        if (cglevlLevel != null ? !cglevlLevel.equals(that.cglevlLevel) : that.cglevlLevel != null) return false;
        if (cgemadEmailaddress != null ? !cgemadEmailaddress.equals(that.cgemadEmailaddress) : that.cgemadEmailaddress != null)
            return false;
        if (cgemad2Emailaddress2 != null ? !cgemad2Emailaddress2.equals(that.cgemad2Emailaddress2) : that.cgemad2Emailaddress2 != null)
            return false;
        if (cgphn1Phone1 != null ? !cgphn1Phone1.equals(that.cgphn1Phone1) : that.cgphn1Phone1 != null) return false;
        if (cgphn2Phone2 != null ? !cgphn2Phone2.equals(that.cgphn2Phone2) : that.cgphn2Phone2 != null) return false;
        if (cgphn3Phone3 != null ? !cgphn3Phone3.equals(that.cgphn3Phone3) : that.cgphn3Phone3 != null) return false;
        if (cgsetdSetUpdate != null ? !cgsetdSetUpdate.equals(that.cgsetdSetUpdate) : that.cgsetdSetUpdate != null)
            return false;
        if (cgsetuSetUpuserid != null ? !cgsetuSetUpuserid.equals(that.cgsetuSetUpuserid) : that.cgsetuSetUpuserid != null)
            return false;
        if (cgchgdatLastChgdate != null ? !cgchgdatLastChgdate.equals(that.cgchgdatLastChgdate) : that.cgchgdatLastChgdate != null)
            return false;
        if (cgchgusrLastChguserid != null ? !cgchgusrLastChguserid.equals(that.cgchgusrLastChguserid) : that.cgchgusrLastChguserid != null)
            return false;
        if (cgtrmdTerminationdate != null ? !cgtrmdTerminationdate.equals(that.cgtrmdTerminationdate) : that.cgtrmdTerminationdate != null)
            return false;
        if (cgfspyFirstpurchaseyear != null ? !cgfspyFirstpurchaseyear.equals(that.cgfspyFirstpurchaseyear) : that.cgfspyFirstpurchaseyear != null)
            return false;
        if (cgfspmFirstpurchasemonth != null ? !cgfspmFirstpurchasemonth.equals(that.cgfspmFirstpurchasemonth) : that.cgfspmFirstpurchasemonth != null)
            return false;
        if (cgtrfmTransferredmgr != null ? !cgtrfmTransferredmgr.equals(that.cgtrfmTransferredmgr) : that.cgtrfmTransferredmgr != null)
            return false;
        if (cginhmInheritedmanager != null ? !cginhmInheritedmanager.equals(that.cginhmInheritedmanager) : that.cginhmInheritedmanager != null)
            return false;
        if (cgmgrlManagerlevel != null ? !cgmgrlManagerlevel.equals(that.cgmgrlManagerlevel) : that.cgmgrlManagerlevel != null)
            return false;
        if (cggmlvGemmgrlevel != null ? !cggmlvGemmgrlevel.equals(that.cggmlvGemmgrlevel) : that.cggmlvGemmgrlevel != null)
            return false;
        if (cgdqmgRecognizedmanager != null ? !cgdqmgRecognizedmanager.equals(that.cgdqmgRecognizedmanager) : that.cgdqmgRecognizedmanager != null)
            return false;
        if (cgstasStatus != null ? !cgstasStatus.equals(that.cgstasStatus) : that.cgstasStatus != null) return false;
        if (cgpcntHomecompany != null ? !cgpcntHomecompany.equals(that.cgpcntHomecompany) : that.cgpcntHomecompany != null)
            return false;
        if (cglddtLoaddate != null ? !cglddtLoaddate.equals(that.cglddtLoaddate) : that.cglddtLoaddate != null)
            return false;
        if (cgohcoOveridingoprco != null ? !cgohcoOveridingoprco.equals(that.cgohcoOveridingoprco) : that.cgohcoOveridingoprco != null)
            return false;
        if (cgtitlTitle != null ? !cgtitlTitle.equals(that.cgtitlTitle) : that.cgtitlTitle != null) return false;
        if (cgsufxSuffix != null ? !cgsufxSuffix.equals(that.cgsufxSuffix) : that.cgsufxSuffix != null) return false;
        if (cgdidDistid != null ? !cgdidDistid.equals(that.cgdidDistid) : that.cgdidDistid != null) return false;
        if (cgctyCounty != null ? !cgctyCounty.equals(that.cgctyCounty) : that.cgctyCounty != null) return false;
        if (cgfspdFirstpurchaseday != null ? !cgfspdFirstpurchaseday.equals(that.cgfspdFirstpurchaseday) : that.cgfspdFirstpurchaseday != null)
            return false;
        if (cgwsddtWholesaledistdate != null ? !cgwsddtWholesaledistdate.equals(that.cgwsddtWholesaledistdate) : that.cgwsddtWholesaledistdate != null)
            return false;
        if (cgmarstsMaritalstatusmors != null ? !cgmarstsMaritalstatusmors.equals(that.cgmarstsMaritalstatusmors) : that.cgmarstsMaritalstatusmors != null)
            return false;
        if (cgdstSsnDistSs != null ? !cgdstSsnDistSs.equals(that.cgdstSsnDistSs) : that.cgdstSsnDistSs != null)
            return false;
        if (cgdstDobDistDob != null ? !cgdstDobDistDob.equals(that.cgdstDobDistDob) : that.cgdstDobDistDob != null)
            return false;
        if (cgspsSsnSpouseSs != null ? !cgspsSsnSpouseSs.equals(that.cgspsSsnSpouseSs) : that.cgspsSsnSpouseSs != null)
            return false;
        if (cgspsDobSpouseDob != null ? !cgspsDobSpouseDob.equals(that.cgspsDobSpouseDob) : that.cgspsDobSpouseDob != null)
            return false;
        if (cgdphnsrchDsPhnsrch != null ? !cgdphnsrchDsPhnsrch.equals(that.cgdphnsrchDsPhnsrch) : that.cgdphnsrchDsPhnsrch != null)
            return false;
        if (cglangPrfLangPrf != null ? !cglangPrfLangPrf.equals(that.cglangPrfLangPrf) : that.cglangPrfLangPrf != null)
            return false;
        if (cgluEnablLUpEnabl != null ? !cgluEnablLUpEnabl.equals(that.cgluEnablLUpEnabl) : that.cgluEnablLUpEnabl != null)
            return false;
        if (cgmoblNbMoblNumb != null ? !cgmoblNbMoblNumb.equals(that.cgmoblNbMoblNumb) : that.cgmoblNbMoblNumb != null)
            return false;
        if (cgautoShpAutoshpEn != null ? !cgautoShpAutoshpEn.equals(that.cgautoShpAutoshpEn) : that.cgautoShpAutoshpEn != null)
            return false;
        if (cgbndgIdBindingdid != null ? !cgbndgIdBindingdid.equals(that.cgbndgIdBindingdid) : that.cgbndgIdBindingdid != null)
            return false;
        if (cgvatregVatregistered != null ? !cgvatregVatregistered.equals(that.cgvatregVatregistered) : that.cgvatregVatregistered != null)
            return false;
        if (cgvatidVatid != null ? !cgvatidVatid.equals(that.cgvatidVatid) : that.cgvatidVatid != null) return false;
        if (cgpswdPassword != null ? !cgpswdPassword.equals(that.cgpswdPassword) : that.cgpswdPassword != null)
            return false;
        if (cglordcntyLastorderopco != null ? !cglordcntyLastorderopco.equals(that.cglordcntyLastorderopco) : that.cglordcntyLastorderopco != null)
            return false;
        if (cglordcoidLastorderiso != null ? !cglordcoidLastorderiso.equals(that.cglordcoidLastorderiso) : that.cglordcoidLastorderiso != null)
            return false;
        if (cglordpyrLastorderprocyr != null ? !cglordpyrLastorderprocyr.equals(that.cglordpyrLastorderprocyr) : that.cglordpyrLastorderprocyr != null)
            return false;
        if (cglordpmoLastorderprocmo != null ? !cglordpmoLastorderprocmo.equals(that.cglordpmoLastorderprocmo) : that.cglordpmoLastorderprocmo != null)
            return false;
        if (cglordLastorder != null ? !cglordLastorder.equals(that.cglordLastorder) : that.cglordLastorder != null)
            return false;
        if (cglorddatLastorderdate != null ? !cglorddatLastorderdate.equals(that.cglorddatLastorderdate) : that.cglorddatLastorderdate != null)
            return false;
        if (cgstampAddOrchangestamp != null ? !cgstampAddOrchangestamp.equals(that.cgstampAddOrchangestamp) : that.cgstampAddOrchangestamp != null)
            return false;
        if (cgdelDeleteflag != null ? !cgdelDeleteflag.equals(that.cgdelDeleteflag) : that.cgdelDeleteflag != null)
            return false;
        if (cgdxtseqDxtransactionsequence != null ? !cgdxtseqDxtransactionsequence.equals(that.cgdxtseqDxtransactionsequence) : that.cgdxtseqDxtransactionsequence != null)
            return false;
        if (cgsfbldSalesforceload != null ? !cgsfbldSalesforceload.equals(that.cgsfbldSalesforceload) : that.cgsfbldSalesforceload != null)
            return false;
        if (cgsfblddatSalesforceloaddate != null ? !cgsfblddatSalesforceloaddate.equals(that.cgsfblddatSalesforceloaddate) : that.cgsfblddatSalesforceloaddate != null)
            return false;
        if (cgsfbldtimSalesforceloaddate != null ? !cgsfbldtimSalesforceloaddate.equals(that.cgsfbldtimSalesforceloaddate) : that.cgsfbldtimSalesforceloaddate != null)
            return false;
        if (cgsfdelSalesforcedeleteload != null ? !cgsfdelSalesforcedeleteload.equals(that.cgsfdelSalesforcedeleteload) : that.cgsfdelSalesforcedeleteload != null)
            return false;
        if (cgsfdeldatSalesforcedeletedate != null ? !cgsfdeldatSalesforcedeletedate.equals(that.cgsfdeldatSalesforcedeletedate) : that.cgsfdeldatSalesforcedeletedate != null)
            return false;
        if (cgsfdeltimSalesforcedeletetime != null ? !cgsfdeltimSalesforcedeletetime.equals(that.cgsfdeltimSalesforcedeletetime) : that.cgsfdeltimSalesforcedeletetime != null)
            return false;
        if (cgsfcfmSalesforceconfirm != null ? !cgsfcfmSalesforceconfirm.equals(that.cgsfcfmSalesforceconfirm) : that.cgsfcfmSalesforceconfirm != null)
            return false;
        if (cgsfcfmdatSalesforceconfirmdate != null ? !cgsfcfmdatSalesforceconfirmdate.equals(that.cgsfcfmdatSalesforceconfirmdate) : that.cgsfcfmdatSalesforceconfirmdate != null)
            return false;
        if (cgsfcfmtimSalesforceconfirmtime != null ? !cgsfcfmtimSalesforceconfirmtime.equals(that.cgsfcfmtimSalesforceconfirmtime) : that.cgsfcfmtimSalesforceconfirmtime != null)
            return false;
        if (cgmmadddatMarketingadddate != null ? !cgmmadddatMarketingadddate.equals(that.cgmmadddatMarketingadddate) : that.cgmmadddatMarketingadddate != null)
            return false;
        if (cgmmaddtimMarketingaddtime != null ? !cgmmaddtimMarketingaddtime.equals(that.cgmmaddtimMarketingaddtime) : that.cgmmaddtimMarketingaddtime != null)
            return false;
        if (cgmmchgdatMarketingchangedate != null ? !cgmmchgdatMarketingchangedate.equals(that.cgmmchgdatMarketingchangedate) : that.cgmmchgdatMarketingchangedate != null)
            return false;
        if (cgmmchgtimMarketingchangetime != null ? !cgmmchgtimMarketingchangetime.equals(that.cgmmchgtimMarketingchangetime) : that.cgmmchgtimMarketingchangetime != null)
            return false;
        if (cgmmdeldatMarketingdeletedate != null ? !cgmmdeldatMarketingdeletedate.equals(that.cgmmdeldatMarketingdeletedate) : that.cgmmdeldatMarketingdeletedate != null)
            return false;
        if (cgmmdeltimMarketingdeletetime != null ? !cgmmdeltimMarketingdeletetime.equals(that.cgmmdeltimMarketingdeletetime) : that.cgmmdeltimMarketingdeletetime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (cgctycOprcompanyiso != null ? cgctycOprcompanyiso.hashCode() : 0);
        result = 31 * result + (cgctlDistributorctl != null ? cgctlDistributorctl.hashCode() : 0);
        result = 31 * result + (cgdid1Distributorid != null ? cgdid1Distributorid.hashCode() : 0);
        result = 31 * result + (cgspnSponsorctl != null ? cgspnSponsorctl.hashCode() : 0);
        result = 31 * result + (cgfnamFirstname != null ? cgfnamFirstname.hashCode() : 0);
        result = 31 * result + (cgmnamMiddlename != null ? cgmnamMiddlename.hashCode() : 0);
        result = 31 * result + (cglnamLastname != null ? cglnamLastname.hashCode() : 0);
        result = 31 * result + (cgspfnSpousefirstname != null ? cgspfnSpousefirstname.hashCode() : 0);
        result = 31 * result + (cgspnmSpousemiddlename != null ? cgspnmSpousemiddlename.hashCode() : 0);
        result = 31 * result + (cgsplnSpouselastname != null ? cgsplnSpouselastname.hashCode() : 0);
        result = 31 * result + (cgadd1Addressline1 != null ? cgadd1Addressline1.hashCode() : 0);
        result = 31 * result + (cgadd2Addressline2 != null ? cgadd2Addressline2.hashCode() : 0);
        result = 31 * result + (cgadd3Addressline3 != null ? cgadd3Addressline3.hashCode() : 0);
        result = 31 * result + (cgadd4Addressline4 != null ? cgadd4Addressline4.hashCode() : 0);
        result = 31 * result + (cgcityCity != null ? cgcityCity.hashCode() : 0);
        result = 31 * result + (cgstatState != null ? cgstatState.hashCode() : 0);
        result = 31 * result + (cgzipcZip != null ? cgzipcZip.hashCode() : 0);
        result = 31 * result + (cgcntyCountry != null ? cgcntyCountry.hashCode() : 0);
        result = 31 * result + (cgareaArea != null ? cgareaArea.hashCode() : 0);
        result = 31 * result + (cglevlLevel != null ? cglevlLevel.hashCode() : 0);
        result = 31 * result + (cgemadEmailaddress != null ? cgemadEmailaddress.hashCode() : 0);
        result = 31 * result + (cgemad2Emailaddress2 != null ? cgemad2Emailaddress2.hashCode() : 0);
        result = 31 * result + (cgphn1Phone1 != null ? cgphn1Phone1.hashCode() : 0);
        result = 31 * result + (cgphn2Phone2 != null ? cgphn2Phone2.hashCode() : 0);
        result = 31 * result + (cgphn3Phone3 != null ? cgphn3Phone3.hashCode() : 0);
        result = 31 * result + (cgsetdSetUpdate != null ? cgsetdSetUpdate.hashCode() : 0);
        result = 31 * result + (cgsetuSetUpuserid != null ? cgsetuSetUpuserid.hashCode() : 0);
        result = 31 * result + (cgchgdatLastChgdate != null ? cgchgdatLastChgdate.hashCode() : 0);
        result = 31 * result + (cgchgusrLastChguserid != null ? cgchgusrLastChguserid.hashCode() : 0);
        result = 31 * result + (cgtrmdTerminationdate != null ? cgtrmdTerminationdate.hashCode() : 0);
        result = 31 * result + (cgfspyFirstpurchaseyear != null ? cgfspyFirstpurchaseyear.hashCode() : 0);
        result = 31 * result + (cgfspmFirstpurchasemonth != null ? cgfspmFirstpurchasemonth.hashCode() : 0);
        result = 31 * result + (cgtrfmTransferredmgr != null ? cgtrfmTransferredmgr.hashCode() : 0);
        result = 31 * result + (cginhmInheritedmanager != null ? cginhmInheritedmanager.hashCode() : 0);
        result = 31 * result + (cgmgrlManagerlevel != null ? cgmgrlManagerlevel.hashCode() : 0);
        result = 31 * result + (cggmlvGemmgrlevel != null ? cggmlvGemmgrlevel.hashCode() : 0);
        result = 31 * result + (cgdqmgRecognizedmanager != null ? cgdqmgRecognizedmanager.hashCode() : 0);
        result = 31 * result + (cgstasStatus != null ? cgstasStatus.hashCode() : 0);
        result = 31 * result + (cgpcntHomecompany != null ? cgpcntHomecompany.hashCode() : 0);
        result = 31 * result + (cglddtLoaddate != null ? cglddtLoaddate.hashCode() : 0);
        result = 31 * result + (cgohcoOveridingoprco != null ? cgohcoOveridingoprco.hashCode() : 0);
        result = 31 * result + (cgtitlTitle != null ? cgtitlTitle.hashCode() : 0);
        result = 31 * result + (cgsufxSuffix != null ? cgsufxSuffix.hashCode() : 0);
        result = 31 * result + (cgdidDistid != null ? cgdidDistid.hashCode() : 0);
        result = 31 * result + (cgctyCounty != null ? cgctyCounty.hashCode() : 0);
        result = 31 * result + (cgfspdFirstpurchaseday != null ? cgfspdFirstpurchaseday.hashCode() : 0);
        result = 31 * result + (cgwsddtWholesaledistdate != null ? cgwsddtWholesaledistdate.hashCode() : 0);
        result = 31 * result + (cgmarstsMaritalstatusmors != null ? cgmarstsMaritalstatusmors.hashCode() : 0);
        result = 31 * result + (cgdstSsnDistSs != null ? cgdstSsnDistSs.hashCode() : 0);
        result = 31 * result + (cgdstDobDistDob != null ? cgdstDobDistDob.hashCode() : 0);
        result = 31 * result + (cgspsSsnSpouseSs != null ? cgspsSsnSpouseSs.hashCode() : 0);
        result = 31 * result + (cgspsDobSpouseDob != null ? cgspsDobSpouseDob.hashCode() : 0);
        result = 31 * result + (cgdphnsrchDsPhnsrch != null ? cgdphnsrchDsPhnsrch.hashCode() : 0);
        result = 31 * result + (cglangPrfLangPrf != null ? cglangPrfLangPrf.hashCode() : 0);
        result = 31 * result + (cgluEnablLUpEnabl != null ? cgluEnablLUpEnabl.hashCode() : 0);
        result = 31 * result + (cgmoblNbMoblNumb != null ? cgmoblNbMoblNumb.hashCode() : 0);
        result = 31 * result + (cgautoShpAutoshpEn != null ? cgautoShpAutoshpEn.hashCode() : 0);
        result = 31 * result + (cgbndgIdBindingdid != null ? cgbndgIdBindingdid.hashCode() : 0);
        result = 31 * result + (cgvatregVatregistered != null ? cgvatregVatregistered.hashCode() : 0);
        result = 31 * result + (cgvatidVatid != null ? cgvatidVatid.hashCode() : 0);
        result = 31 * result + (cgpswdPassword != null ? cgpswdPassword.hashCode() : 0);
        result = 31 * result + (cglordcntyLastorderopco != null ? cglordcntyLastorderopco.hashCode() : 0);
        result = 31 * result + (cglordcoidLastorderiso != null ? cglordcoidLastorderiso.hashCode() : 0);
        result = 31 * result + (cglordpyrLastorderprocyr != null ? cglordpyrLastorderprocyr.hashCode() : 0);
        result = 31 * result + (cglordpmoLastorderprocmo != null ? cglordpmoLastorderprocmo.hashCode() : 0);
        result = 31 * result + (cglordLastorder != null ? cglordLastorder.hashCode() : 0);
        result = 31 * result + (cglorddatLastorderdate != null ? cglorddatLastorderdate.hashCode() : 0);
        result = 31 * result + (cgstampAddOrchangestamp != null ? cgstampAddOrchangestamp.hashCode() : 0);
        result = 31 * result + (cgdelDeleteflag != null ? cgdelDeleteflag.hashCode() : 0);
        result = 31 * result + (cgdxtseqDxtransactionsequence != null ? cgdxtseqDxtransactionsequence.hashCode() : 0);
        result = 31 * result + (cgsfbldSalesforceload != null ? cgsfbldSalesforceload.hashCode() : 0);
        result = 31 * result + (cgsfblddatSalesforceloaddate != null ? cgsfblddatSalesforceloaddate.hashCode() : 0);
        result = 31 * result + (cgsfbldtimSalesforceloaddate != null ? cgsfbldtimSalesforceloaddate.hashCode() : 0);
        result = 31 * result + (cgsfdelSalesforcedeleteload != null ? cgsfdelSalesforcedeleteload.hashCode() : 0);
        result = 31 * result + (cgsfdeldatSalesforcedeletedate != null ? cgsfdeldatSalesforcedeletedate.hashCode() : 0);
        result = 31 * result + (cgsfdeltimSalesforcedeletetime != null ? cgsfdeltimSalesforcedeletetime.hashCode() : 0);
        result = 31 * result + (cgsfcfmSalesforceconfirm != null ? cgsfcfmSalesforceconfirm.hashCode() : 0);
        result = 31 * result + (cgsfcfmdatSalesforceconfirmdate != null ? cgsfcfmdatSalesforceconfirmdate.hashCode() : 0);
        result = 31 * result + (cgsfcfmtimSalesforceconfirmtime != null ? cgsfcfmtimSalesforceconfirmtime.hashCode() : 0);
        result = 31 * result + (cgmmadddatMarketingadddate != null ? cgmmadddatMarketingadddate.hashCode() : 0);
        result = 31 * result + (cgmmaddtimMarketingaddtime != null ? cgmmaddtimMarketingaddtime.hashCode() : 0);
        result = 31 * result + (cgmmchgdatMarketingchangedate != null ? cgmmchgdatMarketingchangedate.hashCode() : 0);
        result = 31 * result + (cgmmchgtimMarketingchangetime != null ? cgmmchgtimMarketingchangetime.hashCode() : 0);
        result = 31 * result + (cgmmdeldatMarketingdeletedate != null ? cgmmdeldatMarketingdeletedate.hashCode() : 0);
        result = 31 * result + (cgmmdeltimMarketingdeletetime != null ? cgmmdeltimMarketingdeletetime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"CgdsmpDistributorInfo\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"cgctycOprcompanyiso\":\"" + cgctycOprcompanyiso + "\""
                + ",                         \"cgctlDistributorctl\":\"" + cgctlDistributorctl + "\""
                + ",                         \"cgdid1Distributorid\":\"" + cgdid1Distributorid + "\""
                + ",                         \"cgspnSponsorctl\":\"" + cgspnSponsorctl + "\""
                + ",                         \"cgfnamFirstname\":\"" + cgfnamFirstname + "\""
                + ",                         \"cgmnamMiddlename\":\"" + cgmnamMiddlename + "\""
                + ",                         \"cglnamLastname\":\"" + cglnamLastname + "\""
                + ",                         \"cgspfnSpousefirstname\":\"" + cgspfnSpousefirstname + "\""
                + ",                         \"cgspnmSpousemiddlename\":\"" + cgspnmSpousemiddlename + "\""
                + ",                         \"cgsplnSpouselastname\":\"" + cgsplnSpouselastname + "\""
                + ",                         \"cgadd1Addressline1\":\"" + cgadd1Addressline1 + "\""
                + ",                         \"cgadd2Addressline2\":\"" + cgadd2Addressline2 + "\""
                + ",                         \"cgadd3Addressline3\":\"" + cgadd3Addressline3 + "\""
                + ",                         \"cgadd4Addressline4\":\"" + cgadd4Addressline4 + "\""
                + ",                         \"cgcityCity\":\"" + cgcityCity + "\""
                + ",                         \"cgstatState\":\"" + cgstatState + "\""
                + ",                         \"cgzipcZip\":\"" + cgzipcZip + "\""
                + ",                         \"cgcntyCountry\":\"" + cgcntyCountry + "\""
                + ",                         \"cgareaArea\":\"" + cgareaArea + "\""
                + ",                         \"cglevlLevel\":\"" + cglevlLevel + "\""
                + ",                         \"cgemadEmailaddress\":\"" + cgemadEmailaddress + "\""
                + ",                         \"cgemad2Emailaddress2\":\"" + cgemad2Emailaddress2 + "\""
                + ",                         \"cgphn1Phone1\":\"" + cgphn1Phone1 + "\""
                + ",                         \"cgphn2Phone2\":\"" + cgphn2Phone2 + "\""
                + ",                         \"cgphn3Phone3\":\"" + cgphn3Phone3 + "\""
                + ",                         \"cgsetdSetUpdate\":" + cgsetdSetUpdate
                + ",                         \"cgsetuSetUpuserid\":\"" + cgsetuSetUpuserid + "\""
                + ",                         \"cgchgdatLastChgdate\":" + cgchgdatLastChgdate
                + ",                         \"cgchgusrLastChguserid\":\"" + cgchgusrLastChguserid + "\""
                + ",                         \"cgtrmdTerminationdate\":" + cgtrmdTerminationdate
                + ",                         \"cgfspyFirstpurchaseyear\":\"" + cgfspyFirstpurchaseyear + "\""
                + ",                         \"cgfspmFirstpurchasemonth\":\"" + cgfspmFirstpurchasemonth + "\""
                + ",                         \"cgtrfmTransferredmgr\":\"" + cgtrfmTransferredmgr + "\""
                + ",                         \"cginhmInheritedmanager\":\"" + cginhmInheritedmanager + "\""
                + ",                         \"cgmgrlManagerlevel\":\"" + cgmgrlManagerlevel + "\""
                + ",                         \"cggmlvGemmgrlevel\":\"" + cggmlvGemmgrlevel + "\""
                + ",                         \"cgdqmgRecognizedmanager\":\"" + cgdqmgRecognizedmanager + "\""
                + ",                         \"cgstasStatus\":\"" + cgstasStatus + "\""
                + ",                         \"cgpcntHomecompany\":\"" + cgpcntHomecompany + "\""
                + ",                         \"cglddtLoaddate\":\"" + cglddtLoaddate + "\""
                + ",                         \"cgohcoOveridingoprco\":\"" + cgohcoOveridingoprco + "\""
                + ",                         \"cgtitlTitle\":\"" + cgtitlTitle + "\""
                + ",                         \"cgsufxSuffix\":\"" + cgsufxSuffix + "\""
                + ",                         \"cgdidDistid\":\"" + cgdidDistid + "\""
                + ",                         \"cgctyCounty\":\"" + cgctyCounty + "\""
                + ",                         \"cgfspdFirstpurchaseday\":\"" + cgfspdFirstpurchaseday + "\""
                + ",                         \"cgwsddtWholesaledistdate\":\"" + cgwsddtWholesaledistdate + "\""
                + ",                         \"cgmarstsMaritalstatusmors\":\"" + cgmarstsMaritalstatusmors + "\""
                + ",                         \"cgdstSsnDistSs\":\"" + cgdstSsnDistSs + "\""
                + ",                         \"cgdstDobDistDob\":\"" + cgdstDobDistDob + "\""
                + ",                         \"cgspsSsnSpouseSs\":\"" + cgspsSsnSpouseSs + "\""
                + ",                         \"cgspsDobSpouseDob\":\"" + cgspsDobSpouseDob + "\""
                + ",                         \"cgdphnsrchDsPhnsrch\":\"" + cgdphnsrchDsPhnsrch + "\""
                + ",                         \"cglangPrfLangPrf\":\"" + cglangPrfLangPrf + "\""
                + ",                         \"cgluEnablLUpEnabl\":\"" + cgluEnablLUpEnabl + "\""
                + ",                         \"cgmoblNbMoblNumb\":\"" + cgmoblNbMoblNumb + "\""
                + ",                         \"cgautoShpAutoshpEn\":\"" + cgautoShpAutoshpEn + "\""
                + ",                         \"cgbndgIdBindingdid\":\"" + cgbndgIdBindingdid + "\""
                + ",                         \"cgvatregVatregistered\":\"" + cgvatregVatregistered + "\""
                + ",                         \"cgvatidVatid\":\"" + cgvatidVatid + "\""
                + ",                         \"cgpswdPassword\":\"" + cgpswdPassword + "\""
                + ",                         \"cglordcntyLastorderopco\":\"" + cglordcntyLastorderopco + "\""
                + ",                         \"cglordcoidLastorderiso\":\"" + cglordcoidLastorderiso + "\""
                + ",                         \"cglordpyrLastorderprocyr\":\"" + cglordpyrLastorderprocyr + "\""
                + ",                         \"cglordpmoLastorderprocmo\":\"" + cglordpmoLastorderprocmo + "\""
                + ",                         \"cglordLastorder\":\"" + cglordLastorder + "\""
                + ",                         \"cglorddatLastorderdate\":" + cglorddatLastorderdate
                + ",                         \"cgstampAddOrchangestamp\":\"" + cgstampAddOrchangestamp + "\""
                + ",                         \"cgdelDeleteflag\":\"" + cgdelDeleteflag + "\""
                + ",                         \"cgdxtseqDxtransactionsequence\":\"" + cgdxtseqDxtransactionsequence + "\""
                + ",                         \"cgsfbldSalesforceload\":\"" + cgsfbldSalesforceload + "\""
                + ",                         \"cgsfblddatSalesforceloaddate\":\"" + cgsfblddatSalesforceloaddate + "\""
                + ",                         \"cgsfbldtimSalesforceloaddate\":\"" + cgsfbldtimSalesforceloaddate + "\""
                + ",                         \"cgsfdelSalesforcedeleteload\":\"" + cgsfdelSalesforcedeleteload + "\""
                + ",                         \"cgsfdeldatSalesforcedeletedate\":\"" + cgsfdeldatSalesforcedeletedate + "\""
                + ",                         \"cgsfdeltimSalesforcedeletetime\":\"" + cgsfdeltimSalesforcedeletetime + "\""
                + ",                         \"cgsfcfmSalesforceconfirm\":\"" + cgsfcfmSalesforceconfirm + "\""
                + ",                         \"cgsfcfmdatSalesforceconfirmdate\":\"" + cgsfcfmdatSalesforceconfirmdate + "\""
                + ",                         \"cgsfcfmtimSalesforceconfirmtime\":\"" + cgsfcfmtimSalesforceconfirmtime + "\""
                + ",                         \"cgmmadddatMarketingadddate\":\"" + cgmmadddatMarketingadddate + "\""
                + ",                         \"cgmmaddtimMarketingaddtime\":\"" + cgmmaddtimMarketingaddtime + "\""
                + ",                         \"cgmmchgdatMarketingchangedate\":\"" + cgmmchgdatMarketingchangedate + "\""
                + ",                         \"cgmmchgtimMarketingchangetime\":\"" + cgmmchgtimMarketingchangetime + "\""
                + ",                         \"cgmmdeldatMarketingdeletedate\":\"" + cgmmdeldatMarketingdeletedate + "\""
                + ",                         \"cgmmdeltimMarketingdeletetime\":\"" + cgmmdeltimMarketingdeletetime + "\""
                + "}}";
    }
}
