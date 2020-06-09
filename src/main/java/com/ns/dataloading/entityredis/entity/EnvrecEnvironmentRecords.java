package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

@RedisHash("ENVREC_EnvironmentRecords")
public class EnvrecEnvironmentRecords implements Serializable {
    private Long id;
    private String cntyCountryCode;
    private String eflagCustomeLibList;
    private String flibPrimaryFilesLibrary;
    private String fflagFilesException;
    private String alibPrimaryApplicationLibrary;
    private String aflagApplException;
    private String tlibPrimaryTransfersLibr;
    private String tflagTransException;
    private String grpcd1GroupingCode1;
    private String grpcd2GroupingCode2;
    private String grpcd3GroupingCode3;
    private String reorgReOrgFlag;
    private String frgnForiegnFlag;
    private String disusrDisableProfiles;
    private String disflgDisableYn;
    private String sysnmSystemName;
    private String comctlCommControl;
    private String ccsidCodedCharacterSet;
    private String renxidWorkStationIds;
    private String descDescription;
    private String bckup1AfternoonBackup;
    private String bckup2NightlyBackup;
    private String bckup3OtherBackup;
    private String bckup4OmitLibraries;
    private String bckup5IncludeLibraries;
    private String misc01Misc1;
    private String misc02Misc2;
    private String wbbypsWebByPassFlag;
    private String boc604Boc604Flag;
    private String dsc051Y;
    private String dsr504Y;
    private String xrr580Y;
    private String inc501Y;
    private String inc503Y;
    private String monthMonthEndFlag;
    private String code01Code1;
    private String code02Code2;
    private String code03Code3;
    private String jobdJobd;
    private String outq1Outq1;
    private String outq2Outq2;
    private String outq3Outq3;
    private String email1Email1;
    private String email2Email2;
    private String email3Email3;
    private String email4Email4;
    private String email5Email5;
    private String email6EWebOrAs400;
    private String statusActiveOrInActive;
    private String serlSerialNumber;
    private Integer meyyMeYearClosed;
    private Integer memmMeMonthClosed;
    private Integer mefdteFirstMeRunDate;
    private Integer meldteLastMeRanDate;
    private Integer melrerMeRunCount;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "CNTY_CountryCode", nullable = true, length = 4)
    public String getCntyCountryCode() {
        return cntyCountryCode;
    }

    public void setCntyCountryCode(String cntyCountryCode) {
        this.cntyCountryCode = cntyCountryCode;
    }

    // @Basic
    // @Column(name = "EFLAG_CustomeLibList", nullable = true, length = 1)
    public String getEflagCustomeLibList() {
        return eflagCustomeLibList;
    }

    public void setEflagCustomeLibList(String eflagCustomeLibList) {
        this.eflagCustomeLibList = eflagCustomeLibList;
    }

    // @Basic
    // @Column(name = "FLIB_PrimaryFilesLibrary", nullable = true, length = 255)
    public String getFlibPrimaryFilesLibrary() {
        return flibPrimaryFilesLibrary;
    }

    public void setFlibPrimaryFilesLibrary(String flibPrimaryFilesLibrary) {
        this.flibPrimaryFilesLibrary = flibPrimaryFilesLibrary;
    }

    // @Basic
    // @Column(name = "FFLAG_FilesException", nullable = true, length = 1)
    public String getFflagFilesException() {
        return fflagFilesException;
    }

    public void setFflagFilesException(String fflagFilesException) {
        this.fflagFilesException = fflagFilesException;
    }

    // @Basic
    // @Column(name = "ALIB_PrimaryApplicationLibrary", nullable = true, length = 255)
    public String getAlibPrimaryApplicationLibrary() {
        return alibPrimaryApplicationLibrary;
    }

    public void setAlibPrimaryApplicationLibrary(String alibPrimaryApplicationLibrary) {
        this.alibPrimaryApplicationLibrary = alibPrimaryApplicationLibrary;
    }

    // @Basic
    // @Column(name = "AFLAG_ApplException", nullable = true, length = 1)
    public String getAflagApplException() {
        return aflagApplException;
    }

    public void setAflagApplException(String aflagApplException) {
        this.aflagApplException = aflagApplException;
    }

    // @Basic
    // @Column(name = "TLIB_PrimaryTransfersLibr", nullable = true, length = 10)
    public String getTlibPrimaryTransfersLibr() {
        return tlibPrimaryTransfersLibr;
    }

    public void setTlibPrimaryTransfersLibr(String tlibPrimaryTransfersLibr) {
        this.tlibPrimaryTransfersLibr = tlibPrimaryTransfersLibr;
    }

    // @Basic
    // @Column(name = "TFLAG_TransException", nullable = true, length = 1)
    public String getTflagTransException() {
        return tflagTransException;
    }

    public void setTflagTransException(String tflagTransException) {
        this.tflagTransException = tflagTransException;
    }

    // @Basic
    // @Column(name = "GRPCD1_GroupingCode1", nullable = true, length = 1)
    public String getGrpcd1GroupingCode1() {
        return grpcd1GroupingCode1;
    }

    public void setGrpcd1GroupingCode1(String grpcd1GroupingCode1) {
        this.grpcd1GroupingCode1 = grpcd1GroupingCode1;
    }

    // @Basic
    // @Column(name = "GRPCD2_GroupingCode2", nullable = true, length = 1)
    public String getGrpcd2GroupingCode2() {
        return grpcd2GroupingCode2;
    }

    public void setGrpcd2GroupingCode2(String grpcd2GroupingCode2) {
        this.grpcd2GroupingCode2 = grpcd2GroupingCode2;
    }

    // @Basic
    // @Column(name = "GRPCD3_GroupingCode3", nullable = true, length = 1)
    public String getGrpcd3GroupingCode3() {
        return grpcd3GroupingCode3;
    }

    public void setGrpcd3GroupingCode3(String grpcd3GroupingCode3) {
        this.grpcd3GroupingCode3 = grpcd3GroupingCode3;
    }

    // @Basic
    // @Column(name = "REORG_ReOrgFlag", nullable = true, length = 1)
    public String getReorgReOrgFlag() {
        return reorgReOrgFlag;
    }

    public void setReorgReOrgFlag(String reorgReOrgFlag) {
        this.reorgReOrgFlag = reorgReOrgFlag;
    }

    // @Basic
    // @Column(name = "FRGN_ForiegnFlag", nullable = true, length = 1)
    public String getFrgnForiegnFlag() {
        return frgnForiegnFlag;
    }

    public void setFrgnForiegnFlag(String frgnForiegnFlag) {
        this.frgnForiegnFlag = frgnForiegnFlag;
    }

    // @Basic
    // @Column(name = "DISUSR_DisableProfiles", nullable = true, length = 3)
    public String getDisusrDisableProfiles() {
        return disusrDisableProfiles;
    }

    public void setDisusrDisableProfiles(String disusrDisableProfiles) {
        this.disusrDisableProfiles = disusrDisableProfiles;
    }

    // @Basic
    // @Column(name = "DISFLG_DisableYN", nullable = true, length = 1)
    public String getDisflgDisableYn() {
        return disflgDisableYn;
    }

    public void setDisflgDisableYn(String disflgDisableYn) {
        this.disflgDisableYn = disflgDisableYn;
    }

    // @Basic
    // @Column(name = "SYSNM_SystemName", nullable = true, length = 10)
    public String getSysnmSystemName() {
        return sysnmSystemName;
    }

    public void setSysnmSystemName(String sysnmSystemName) {
        this.sysnmSystemName = sysnmSystemName;
    }

    // @Basic
    // @Column(name = "COMCTL_CommControl", nullable = true, length = 10)
    public String getComctlCommControl() {
        return comctlCommControl;
    }

    public void setComctlCommControl(String comctlCommControl) {
        this.comctlCommControl = comctlCommControl;
    }

    // @Basic
    // @Column(name = "CCSID_CodedCharacterSet", nullable = true, length = 10)
    public String getCcsidCodedCharacterSet() {
        return ccsidCodedCharacterSet;
    }

    public void setCcsidCodedCharacterSet(String ccsidCodedCharacterSet) {
        this.ccsidCodedCharacterSet = ccsidCodedCharacterSet;
    }

    // @Basic
    // @Column(name = "RENXID_WorkStationIds", nullable = true, length = 10)
    public String getRenxidWorkStationIds() {
        return renxidWorkStationIds;
    }

    public void setRenxidWorkStationIds(String renxidWorkStationIds) {
        this.renxidWorkStationIds = renxidWorkStationIds;
    }

    // @Basic
    // @Column(name = "DESC_Description", nullable = true, length = 30)
    public String getDescDescription() {
        return descDescription;
    }

    public void setDescDescription(String descDescription) {
        this.descDescription = descDescription;
    }

    // @Basic
    // @Column(name = "BCKUP1_AfternoonBackup", nullable = true, length = 1)
    public String getBckup1AfternoonBackup() {
        return bckup1AfternoonBackup;
    }

    public void setBckup1AfternoonBackup(String bckup1AfternoonBackup) {
        this.bckup1AfternoonBackup = bckup1AfternoonBackup;
    }

    // @Basic
    // @Column(name = "BCKUP2_NightlyBackup", nullable = true, length = 1)
    public String getBckup2NightlyBackup() {
        return bckup2NightlyBackup;
    }

    public void setBckup2NightlyBackup(String bckup2NightlyBackup) {
        this.bckup2NightlyBackup = bckup2NightlyBackup;
    }

    // @Basic
    // @Column(name = "BCKUP3_OtherBackup", nullable = true, length = 1)
    public String getBckup3OtherBackup() {
        return bckup3OtherBackup;
    }

    public void setBckup3OtherBackup(String bckup3OtherBackup) {
        this.bckup3OtherBackup = bckup3OtherBackup;
    }

    // @Basic
    // @Column(name = "BCKUP4_OmitLibraries", nullable = true, length = 1)
    public String getBckup4OmitLibraries() {
        return bckup4OmitLibraries;
    }

    public void setBckup4OmitLibraries(String bckup4OmitLibraries) {
        this.bckup4OmitLibraries = bckup4OmitLibraries;
    }

    // @Basic
    // @Column(name = "BCKUP5_IncludeLibraries", nullable = true, length = 1)
    public String getBckup5IncludeLibraries() {
        return bckup5IncludeLibraries;
    }

    public void setBckup5IncludeLibraries(String bckup5IncludeLibraries) {
        this.bckup5IncludeLibraries = bckup5IncludeLibraries;
    }

    // @Basic
    // @Column(name = "MISC01_Misc1", nullable = true, length = 1)
    public String getMisc01Misc1() {
        return misc01Misc1;
    }

    public void setMisc01Misc1(String misc01Misc1) {
        this.misc01Misc1 = misc01Misc1;
    }

    // @Basic
    // @Column(name = "MISC02_Misc2", nullable = true, length = 1)
    public String getMisc02Misc2() {
        return misc02Misc2;
    }

    public void setMisc02Misc2(String misc02Misc2) {
        this.misc02Misc2 = misc02Misc2;
    }

    // @Basic
    // @Column(name = "WBBYPS_WebByPassFlag", nullable = true, length = 1)
    public String getWbbypsWebByPassFlag() {
        return wbbypsWebByPassFlag;
    }

    public void setWbbypsWebByPassFlag(String wbbypsWebByPassFlag) {
        this.wbbypsWebByPassFlag = wbbypsWebByPassFlag;
    }

    // @Basic
    // @Column(name = "BOC604_Boc604Flag", nullable = true, length = 1)
    public String getBoc604Boc604Flag() {
        return boc604Boc604Flag;
    }

    public void setBoc604Boc604Flag(String boc604Boc604Flag) {
        this.boc604Boc604Flag = boc604Boc604Flag;
    }

    // @Basic
    // @Column(name = "DSC051_Y", nullable = true, length = 1)
    public String getDsc051Y() {
        return dsc051Y;
    }

    public void setDsc051Y(String dsc051Y) {
        this.dsc051Y = dsc051Y;
    }

    // @Basic
    // @Column(name = "DSR504_Y", nullable = true, length = 1)
    public String getDsr504Y() {
        return dsr504Y;
    }

    public void setDsr504Y(String dsr504Y) {
        this.dsr504Y = dsr504Y;
    }

    // @Basic
    // @Column(name = "XRR580_Y", nullable = true, length = 1)
    public String getXrr580Y() {
        return xrr580Y;
    }

    public void setXrr580Y(String xrr580Y) {
        this.xrr580Y = xrr580Y;
    }

    // @Basic
    // @Column(name = "INC501_Y", nullable = true, length = 1)
    public String getInc501Y() {
        return inc501Y;
    }

    public void setInc501Y(String inc501Y) {
        this.inc501Y = inc501Y;
    }

    // @Basic
    // @Column(name = "INC503_Y", nullable = true, length = 1)
    public String getInc503Y() {
        return inc503Y;
    }

    public void setInc503Y(String inc503Y) {
        this.inc503Y = inc503Y;
    }

    // @Basic
    // @Column(name = "MONTH_MonthEndFlag", nullable = true, length = 1)
    public String getMonthMonthEndFlag() {
        return monthMonthEndFlag;
    }

    public void setMonthMonthEndFlag(String monthMonthEndFlag) {
        this.monthMonthEndFlag = monthMonthEndFlag;
    }

    // @Basic
    // @Column(name = "CODE01_Code1", nullable = true, length = 1)
    public String getCode01Code1() {
        return code01Code1;
    }

    public void setCode01Code1(String code01Code1) {
        this.code01Code1 = code01Code1;
    }

    // @Basic
    // @Column(name = "CODE02_Code2", nullable = true, length = 1)
    public String getCode02Code2() {
        return code02Code2;
    }

    public void setCode02Code2(String code02Code2) {
        this.code02Code2 = code02Code2;
    }

    // @Basic
    // @Column(name = "CODE03_Code3", nullable = true, length = 1)
    public String getCode03Code3() {
        return code03Code3;
    }

    public void setCode03Code3(String code03Code3) {
        this.code03Code3 = code03Code3;
    }

    // @Basic
    // @Column(name = "JOBD_Jobd", nullable = true, length = 10)
    public String getJobdJobd() {
        return jobdJobd;
    }

    public void setJobdJobd(String jobdJobd) {
        this.jobdJobd = jobdJobd;
    }

    // @Basic
    // @Column(name = "OUTQ1_Outq1", nullable = true, length = 10)
    public String getOutq1Outq1() {
        return outq1Outq1;
    }

    public void setOutq1Outq1(String outq1Outq1) {
        this.outq1Outq1 = outq1Outq1;
    }

    // @Basic
    // @Column(name = "OUTQ2_Outq2", nullable = true, length = 10)
    public String getOutq2Outq2() {
        return outq2Outq2;
    }

    public void setOutq2Outq2(String outq2Outq2) {
        this.outq2Outq2 = outq2Outq2;
    }

    // @Basic
    // @Column(name = "OUTQ3_Outq3", nullable = true, length = 10)
    public String getOutq3Outq3() {
        return outq3Outq3;
    }

    public void setOutq3Outq3(String outq3Outq3) {
        this.outq3Outq3 = outq3Outq3;
    }

    // @Basic
    // @Column(name = "EMAIL1_Email1", nullable = true, length = 60)
    public String getEmail1Email1() {
        return email1Email1;
    }

    public void setEmail1Email1(String email1Email1) {
        this.email1Email1 = email1Email1;
    }

    // @Basic
    // @Column(name = "EMAIL2_Email2", nullable = true, length = 60)
    public String getEmail2Email2() {
        return email2Email2;
    }

    public void setEmail2Email2(String email2Email2) {
        this.email2Email2 = email2Email2;
    }

    // @Basic
    // @Column(name = "EMAIL3_Email3", nullable = true, length = 60)
    public String getEmail3Email3() {
        return email3Email3;
    }

    public void setEmail3Email3(String email3Email3) {
        this.email3Email3 = email3Email3;
    }

    // @Basic
    // @Column(name = "EMAIL4_Email4", nullable = true, length = 60)
    public String getEmail4Email4() {
        return email4Email4;
    }

    public void setEmail4Email4(String email4Email4) {
        this.email4Email4 = email4Email4;
    }

    // @Basic
    // @Column(name = "EMAIL5_Email5", nullable = true, length = 60)
    public String getEmail5Email5() {
        return email5Email5;
    }

    public void setEmail5Email5(String email5Email5) {
        this.email5Email5 = email5Email5;
    }

    // @Basic
    // @Column(name = "EMAIL6_EWebOrAs400", nullable = true, length = 60)
    public String getEmail6EWebOrAs400() {
        return email6EWebOrAs400;
    }

    public void setEmail6EWebOrAs400(String email6EWebOrAs400) {
        this.email6EWebOrAs400 = email6EWebOrAs400;
    }

    // @Basic
    // @Column(name = "STATUS_ActiveOrInActive", nullable = true, length = 1)
    public String getStatusActiveOrInActive() {
        return statusActiveOrInActive;
    }

    public void setStatusActiveOrInActive(String statusActiveOrInActive) {
        this.statusActiveOrInActive = statusActiveOrInActive;
    }

    // @Basic
    // @Column(name = "SERL_SerialNumber", nullable = true, length = 8)
    public String getSerlSerialNumber() {
        return serlSerialNumber;
    }

    public void setSerlSerialNumber(String serlSerialNumber) {
        this.serlSerialNumber = serlSerialNumber;
    }

    // @Basic
    // @Column(name = "MEYY_MeYearClosed", nullable = true)
    public Integer getMeyyMeYearClosed() {
        return meyyMeYearClosed;
    }

    public void setMeyyMeYearClosed(Integer meyyMeYearClosed) {
        this.meyyMeYearClosed = meyyMeYearClosed;
    }

    // @Basic
    // @Column(name = "MEMM_MeMonthClosed", nullable = true)
    public Integer getMemmMeMonthClosed() {
        return memmMeMonthClosed;
    }

    public void setMemmMeMonthClosed(Integer memmMeMonthClosed) {
        this.memmMeMonthClosed = memmMeMonthClosed;
    }

    // @Basic
    // @Column(name = "MEFDTE_FirstMERunDate", nullable = true)
    public Integer getMefdteFirstMeRunDate() {
        return mefdteFirstMeRunDate;
    }

    public void setMefdteFirstMeRunDate(Integer mefdteFirstMeRunDate) {
        this.mefdteFirstMeRunDate = mefdteFirstMeRunDate;
    }

    // @Basic
    // @Column(name = "MELDTE_LastMERanDate", nullable = true)
    public Integer getMeldteLastMeRanDate() {
        return meldteLastMeRanDate;
    }

    public void setMeldteLastMeRanDate(Integer meldteLastMeRanDate) {
        this.meldteLastMeRanDate = meldteLastMeRanDate;
    }

    // @Basic
    // @Column(name = "MELRER_MERunCount", nullable = true)
    public Integer getMelrerMeRunCount() {
        return melrerMeRunCount;
    }

    public void setMelrerMeRunCount(Integer melrerMeRunCount) {
        this.melrerMeRunCount = melrerMeRunCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnvrecEnvironmentRecords that = (EnvrecEnvironmentRecords) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (cntyCountryCode != null ? !cntyCountryCode.equals(that.cntyCountryCode) : that.cntyCountryCode != null)
            return false;
        if (eflagCustomeLibList != null ? !eflagCustomeLibList.equals(that.eflagCustomeLibList) : that.eflagCustomeLibList != null)
            return false;
        if (flibPrimaryFilesLibrary != null ? !flibPrimaryFilesLibrary.equals(that.flibPrimaryFilesLibrary) : that.flibPrimaryFilesLibrary != null)
            return false;
        if (fflagFilesException != null ? !fflagFilesException.equals(that.fflagFilesException) : that.fflagFilesException != null)
            return false;
        if (alibPrimaryApplicationLibrary != null ? !alibPrimaryApplicationLibrary.equals(that.alibPrimaryApplicationLibrary) : that.alibPrimaryApplicationLibrary != null)
            return false;
        if (aflagApplException != null ? !aflagApplException.equals(that.aflagApplException) : that.aflagApplException != null)
            return false;
        if (tlibPrimaryTransfersLibr != null ? !tlibPrimaryTransfersLibr.equals(that.tlibPrimaryTransfersLibr) : that.tlibPrimaryTransfersLibr != null)
            return false;
        if (tflagTransException != null ? !tflagTransException.equals(that.tflagTransException) : that.tflagTransException != null)
            return false;
        if (grpcd1GroupingCode1 != null ? !grpcd1GroupingCode1.equals(that.grpcd1GroupingCode1) : that.grpcd1GroupingCode1 != null)
            return false;
        if (grpcd2GroupingCode2 != null ? !grpcd2GroupingCode2.equals(that.grpcd2GroupingCode2) : that.grpcd2GroupingCode2 != null)
            return false;
        if (grpcd3GroupingCode3 != null ? !grpcd3GroupingCode3.equals(that.grpcd3GroupingCode3) : that.grpcd3GroupingCode3 != null)
            return false;
        if (reorgReOrgFlag != null ? !reorgReOrgFlag.equals(that.reorgReOrgFlag) : that.reorgReOrgFlag != null)
            return false;
        if (frgnForiegnFlag != null ? !frgnForiegnFlag.equals(that.frgnForiegnFlag) : that.frgnForiegnFlag != null)
            return false;
        if (disusrDisableProfiles != null ? !disusrDisableProfiles.equals(that.disusrDisableProfiles) : that.disusrDisableProfiles != null)
            return false;
        if (disflgDisableYn != null ? !disflgDisableYn.equals(that.disflgDisableYn) : that.disflgDisableYn != null)
            return false;
        if (sysnmSystemName != null ? !sysnmSystemName.equals(that.sysnmSystemName) : that.sysnmSystemName != null)
            return false;
        if (comctlCommControl != null ? !comctlCommControl.equals(that.comctlCommControl) : that.comctlCommControl != null)
            return false;
        if (ccsidCodedCharacterSet != null ? !ccsidCodedCharacterSet.equals(that.ccsidCodedCharacterSet) : that.ccsidCodedCharacterSet != null)
            return false;
        if (renxidWorkStationIds != null ? !renxidWorkStationIds.equals(that.renxidWorkStationIds) : that.renxidWorkStationIds != null)
            return false;
        if (descDescription != null ? !descDescription.equals(that.descDescription) : that.descDescription != null)
            return false;
        if (bckup1AfternoonBackup != null ? !bckup1AfternoonBackup.equals(that.bckup1AfternoonBackup) : that.bckup1AfternoonBackup != null)
            return false;
        if (bckup2NightlyBackup != null ? !bckup2NightlyBackup.equals(that.bckup2NightlyBackup) : that.bckup2NightlyBackup != null)
            return false;
        if (bckup3OtherBackup != null ? !bckup3OtherBackup.equals(that.bckup3OtherBackup) : that.bckup3OtherBackup != null)
            return false;
        if (bckup4OmitLibraries != null ? !bckup4OmitLibraries.equals(that.bckup4OmitLibraries) : that.bckup4OmitLibraries != null)
            return false;
        if (bckup5IncludeLibraries != null ? !bckup5IncludeLibraries.equals(that.bckup5IncludeLibraries) : that.bckup5IncludeLibraries != null)
            return false;
        if (misc01Misc1 != null ? !misc01Misc1.equals(that.misc01Misc1) : that.misc01Misc1 != null) return false;
        if (misc02Misc2 != null ? !misc02Misc2.equals(that.misc02Misc2) : that.misc02Misc2 != null) return false;
        if (wbbypsWebByPassFlag != null ? !wbbypsWebByPassFlag.equals(that.wbbypsWebByPassFlag) : that.wbbypsWebByPassFlag != null)
            return false;
        if (boc604Boc604Flag != null ? !boc604Boc604Flag.equals(that.boc604Boc604Flag) : that.boc604Boc604Flag != null)
            return false;
        if (dsc051Y != null ? !dsc051Y.equals(that.dsc051Y) : that.dsc051Y != null) return false;
        if (dsr504Y != null ? !dsr504Y.equals(that.dsr504Y) : that.dsr504Y != null) return false;
        if (xrr580Y != null ? !xrr580Y.equals(that.xrr580Y) : that.xrr580Y != null) return false;
        if (inc501Y != null ? !inc501Y.equals(that.inc501Y) : that.inc501Y != null) return false;
        if (inc503Y != null ? !inc503Y.equals(that.inc503Y) : that.inc503Y != null) return false;
        if (monthMonthEndFlag != null ? !monthMonthEndFlag.equals(that.monthMonthEndFlag) : that.monthMonthEndFlag != null)
            return false;
        if (code01Code1 != null ? !code01Code1.equals(that.code01Code1) : that.code01Code1 != null) return false;
        if (code02Code2 != null ? !code02Code2.equals(that.code02Code2) : that.code02Code2 != null) return false;
        if (code03Code3 != null ? !code03Code3.equals(that.code03Code3) : that.code03Code3 != null) return false;
        if (jobdJobd != null ? !jobdJobd.equals(that.jobdJobd) : that.jobdJobd != null) return false;
        if (outq1Outq1 != null ? !outq1Outq1.equals(that.outq1Outq1) : that.outq1Outq1 != null) return false;
        if (outq2Outq2 != null ? !outq2Outq2.equals(that.outq2Outq2) : that.outq2Outq2 != null) return false;
        if (outq3Outq3 != null ? !outq3Outq3.equals(that.outq3Outq3) : that.outq3Outq3 != null) return false;
        if (email1Email1 != null ? !email1Email1.equals(that.email1Email1) : that.email1Email1 != null) return false;
        if (email2Email2 != null ? !email2Email2.equals(that.email2Email2) : that.email2Email2 != null) return false;
        if (email3Email3 != null ? !email3Email3.equals(that.email3Email3) : that.email3Email3 != null) return false;
        if (email4Email4 != null ? !email4Email4.equals(that.email4Email4) : that.email4Email4 != null) return false;
        if (email5Email5 != null ? !email5Email5.equals(that.email5Email5) : that.email5Email5 != null) return false;
        if (email6EWebOrAs400 != null ? !email6EWebOrAs400.equals(that.email6EWebOrAs400) : that.email6EWebOrAs400 != null)
            return false;
        if (statusActiveOrInActive != null ? !statusActiveOrInActive.equals(that.statusActiveOrInActive) : that.statusActiveOrInActive != null)
            return false;
        if (serlSerialNumber != null ? !serlSerialNumber.equals(that.serlSerialNumber) : that.serlSerialNumber != null)
            return false;
        if (meyyMeYearClosed != null ? !meyyMeYearClosed.equals(that.meyyMeYearClosed) : that.meyyMeYearClosed != null)
            return false;
        if (memmMeMonthClosed != null ? !memmMeMonthClosed.equals(that.memmMeMonthClosed) : that.memmMeMonthClosed != null)
            return false;
        if (mefdteFirstMeRunDate != null ? !mefdteFirstMeRunDate.equals(that.mefdteFirstMeRunDate) : that.mefdteFirstMeRunDate != null)
            return false;
        if (meldteLastMeRanDate != null ? !meldteLastMeRanDate.equals(that.meldteLastMeRanDate) : that.meldteLastMeRanDate != null)
            return false;
        if (melrerMeRunCount != null ? !melrerMeRunCount.equals(that.melrerMeRunCount) : that.melrerMeRunCount != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (cntyCountryCode != null ? cntyCountryCode.hashCode() : 0);
        result = 31 * result + (eflagCustomeLibList != null ? eflagCustomeLibList.hashCode() : 0);
        result = 31 * result + (flibPrimaryFilesLibrary != null ? flibPrimaryFilesLibrary.hashCode() : 0);
        result = 31 * result + (fflagFilesException != null ? fflagFilesException.hashCode() : 0);
        result = 31 * result + (alibPrimaryApplicationLibrary != null ? alibPrimaryApplicationLibrary.hashCode() : 0);
        result = 31 * result + (aflagApplException != null ? aflagApplException.hashCode() : 0);
        result = 31 * result + (tlibPrimaryTransfersLibr != null ? tlibPrimaryTransfersLibr.hashCode() : 0);
        result = 31 * result + (tflagTransException != null ? tflagTransException.hashCode() : 0);
        result = 31 * result + (grpcd1GroupingCode1 != null ? grpcd1GroupingCode1.hashCode() : 0);
        result = 31 * result + (grpcd2GroupingCode2 != null ? grpcd2GroupingCode2.hashCode() : 0);
        result = 31 * result + (grpcd3GroupingCode3 != null ? grpcd3GroupingCode3.hashCode() : 0);
        result = 31 * result + (reorgReOrgFlag != null ? reorgReOrgFlag.hashCode() : 0);
        result = 31 * result + (frgnForiegnFlag != null ? frgnForiegnFlag.hashCode() : 0);
        result = 31 * result + (disusrDisableProfiles != null ? disusrDisableProfiles.hashCode() : 0);
        result = 31 * result + (disflgDisableYn != null ? disflgDisableYn.hashCode() : 0);
        result = 31 * result + (sysnmSystemName != null ? sysnmSystemName.hashCode() : 0);
        result = 31 * result + (comctlCommControl != null ? comctlCommControl.hashCode() : 0);
        result = 31 * result + (ccsidCodedCharacterSet != null ? ccsidCodedCharacterSet.hashCode() : 0);
        result = 31 * result + (renxidWorkStationIds != null ? renxidWorkStationIds.hashCode() : 0);
        result = 31 * result + (descDescription != null ? descDescription.hashCode() : 0);
        result = 31 * result + (bckup1AfternoonBackup != null ? bckup1AfternoonBackup.hashCode() : 0);
        result = 31 * result + (bckup2NightlyBackup != null ? bckup2NightlyBackup.hashCode() : 0);
        result = 31 * result + (bckup3OtherBackup != null ? bckup3OtherBackup.hashCode() : 0);
        result = 31 * result + (bckup4OmitLibraries != null ? bckup4OmitLibraries.hashCode() : 0);
        result = 31 * result + (bckup5IncludeLibraries != null ? bckup5IncludeLibraries.hashCode() : 0);
        result = 31 * result + (misc01Misc1 != null ? misc01Misc1.hashCode() : 0);
        result = 31 * result + (misc02Misc2 != null ? misc02Misc2.hashCode() : 0);
        result = 31 * result + (wbbypsWebByPassFlag != null ? wbbypsWebByPassFlag.hashCode() : 0);
        result = 31 * result + (boc604Boc604Flag != null ? boc604Boc604Flag.hashCode() : 0);
        result = 31 * result + (dsc051Y != null ? dsc051Y.hashCode() : 0);
        result = 31 * result + (dsr504Y != null ? dsr504Y.hashCode() : 0);
        result = 31 * result + (xrr580Y != null ? xrr580Y.hashCode() : 0);
        result = 31 * result + (inc501Y != null ? inc501Y.hashCode() : 0);
        result = 31 * result + (inc503Y != null ? inc503Y.hashCode() : 0);
        result = 31 * result + (monthMonthEndFlag != null ? monthMonthEndFlag.hashCode() : 0);
        result = 31 * result + (code01Code1 != null ? code01Code1.hashCode() : 0);
        result = 31 * result + (code02Code2 != null ? code02Code2.hashCode() : 0);
        result = 31 * result + (code03Code3 != null ? code03Code3.hashCode() : 0);
        result = 31 * result + (jobdJobd != null ? jobdJobd.hashCode() : 0);
        result = 31 * result + (outq1Outq1 != null ? outq1Outq1.hashCode() : 0);
        result = 31 * result + (outq2Outq2 != null ? outq2Outq2.hashCode() : 0);
        result = 31 * result + (outq3Outq3 != null ? outq3Outq3.hashCode() : 0);
        result = 31 * result + (email1Email1 != null ? email1Email1.hashCode() : 0);
        result = 31 * result + (email2Email2 != null ? email2Email2.hashCode() : 0);
        result = 31 * result + (email3Email3 != null ? email3Email3.hashCode() : 0);
        result = 31 * result + (email4Email4 != null ? email4Email4.hashCode() : 0);
        result = 31 * result + (email5Email5 != null ? email5Email5.hashCode() : 0);
        result = 31 * result + (email6EWebOrAs400 != null ? email6EWebOrAs400.hashCode() : 0);
        result = 31 * result + (statusActiveOrInActive != null ? statusActiveOrInActive.hashCode() : 0);
        result = 31 * result + (serlSerialNumber != null ? serlSerialNumber.hashCode() : 0);
        result = 31 * result + (meyyMeYearClosed != null ? meyyMeYearClosed.hashCode() : 0);
        result = 31 * result + (memmMeMonthClosed != null ? memmMeMonthClosed.hashCode() : 0);
        result = 31 * result + (mefdteFirstMeRunDate != null ? mefdteFirstMeRunDate.hashCode() : 0);
        result = 31 * result + (meldteLastMeRanDate != null ? meldteLastMeRanDate.hashCode() : 0);
        result = 31 * result + (melrerMeRunCount != null ? melrerMeRunCount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"EnvrecEnvironmentRecords\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"cntyCountryCode\":\"" + cntyCountryCode + "\""
                + ",                         \"eflagCustomeLibList\":\"" + eflagCustomeLibList + "\""
                + ",                         \"flibPrimaryFilesLibrary\":\"" + flibPrimaryFilesLibrary + "\""
                + ",                         \"fflagFilesException\":\"" + fflagFilesException + "\""
                + ",                         \"alibPrimaryApplicationLibrary\":\"" + alibPrimaryApplicationLibrary + "\""
                + ",                         \"aflagApplException\":\"" + aflagApplException + "\""
                + ",                         \"tlibPrimaryTransfersLibr\":\"" + tlibPrimaryTransfersLibr + "\""
                + ",                         \"tflagTransException\":\"" + tflagTransException + "\""
                + ",                         \"grpcd1GroupingCode1\":\"" + grpcd1GroupingCode1 + "\""
                + ",                         \"grpcd2GroupingCode2\":\"" + grpcd2GroupingCode2 + "\""
                + ",                         \"grpcd3GroupingCode3\":\"" + grpcd3GroupingCode3 + "\""
                + ",                         \"reorgReOrgFlag\":\"" + reorgReOrgFlag + "\""
                + ",                         \"frgnForiegnFlag\":\"" + frgnForiegnFlag + "\""
                + ",                         \"disusrDisableProfiles\":\"" + disusrDisableProfiles + "\""
                + ",                         \"disflgDisableYn\":\"" + disflgDisableYn + "\""
                + ",                         \"sysnmSystemName\":\"" + sysnmSystemName + "\""
                + ",                         \"comctlCommControl\":\"" + comctlCommControl + "\""
                + ",                         \"ccsidCodedCharacterSet\":\"" + ccsidCodedCharacterSet + "\""
                + ",                         \"renxidWorkStationIds\":\"" + renxidWorkStationIds + "\""
                + ",                         \"descDescription\":\"" + descDescription + "\""
                + ",                         \"bckup1AfternoonBackup\":\"" + bckup1AfternoonBackup + "\""
                + ",                         \"bckup2NightlyBackup\":\"" + bckup2NightlyBackup + "\""
                + ",                         \"bckup3OtherBackup\":\"" + bckup3OtherBackup + "\""
                + ",                         \"bckup4OmitLibraries\":\"" + bckup4OmitLibraries + "\""
                + ",                         \"bckup5IncludeLibraries\":\"" + bckup5IncludeLibraries + "\""
                + ",                         \"misc01Misc1\":\"" + misc01Misc1 + "\""
                + ",                         \"misc02Misc2\":\"" + misc02Misc2 + "\""
                + ",                         \"wbbypsWebByPassFlag\":\"" + wbbypsWebByPassFlag + "\""
                + ",                         \"boc604Boc604Flag\":\"" + boc604Boc604Flag + "\""
                + ",                         \"dsc051Y\":\"" + dsc051Y + "\""
                + ",                         \"dsr504Y\":\"" + dsr504Y + "\""
                + ",                         \"xrr580Y\":\"" + xrr580Y + "\""
                + ",                         \"inc501Y\":\"" + inc501Y + "\""
                + ",                         \"inc503Y\":\"" + inc503Y + "\""
                + ",                         \"monthMonthEndFlag\":\"" + monthMonthEndFlag + "\""
                + ",                         \"code01Code1\":\"" + code01Code1 + "\""
                + ",                         \"code02Code2\":\"" + code02Code2 + "\""
                + ",                         \"code03Code3\":\"" + code03Code3 + "\""
                + ",                         \"jobdJobd\":\"" + jobdJobd + "\""
                + ",                         \"outq1Outq1\":\"" + outq1Outq1 + "\""
                + ",                         \"outq2Outq2\":\"" + outq2Outq2 + "\""
                + ",                         \"outq3Outq3\":\"" + outq3Outq3 + "\""
                + ",                         \"email1Email1\":\"" + email1Email1 + "\""
                + ",                         \"email2Email2\":\"" + email2Email2 + "\""
                + ",                         \"email3Email3\":\"" + email3Email3 + "\""
                + ",                         \"email4Email4\":\"" + email4Email4 + "\""
                + ",                         \"email5Email5\":\"" + email5Email5 + "\""
                + ",                         \"email6EWebOrAs400\":\"" + email6EWebOrAs400 + "\""
                + ",                         \"statusActiveOrInActive\":\"" + statusActiveOrInActive + "\""
                + ",                         \"serlSerialNumber\":\"" + serlSerialNumber + "\""
                + ",                         \"meyyMeYearClosed\":\"" + meyyMeYearClosed + "\""
                + ",                         \"memmMeMonthClosed\":\"" + memmMeMonthClosed + "\""
                + ",                         \"mefdteFirstMeRunDate\":\"" + mefdteFirstMeRunDate + "\""
                + ",                         \"meldteLastMeRanDate\":\"" + meldteLastMeRanDate + "\""
                + ",                         \"melrerMeRunCount\":\"" + melrerMeRunCount + "\""
                + "}}";
    }
}
