package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("DSMGRP_AreaManagerMaster")
public class DsmgrpAreaManagerMaster implements Serializable {
    private Long id;
    private Long mgareaArea;
    private String mgdscgAreaDescription;
    private String mgadd1Address1;
    private String mgadd2Address2;
    private String mgadd3Address3;
    private String mgadd4Address4;
    private String mgcityCity;
    private String mgstatState;
    private String mgacntCountry;
    private String mgzipcZipCode;
    private Long mggeocGeographicalCode;
    private Long mgphonPhone;
    private Long mgphn2Phone;
    private Long mgfaxFax;
    private String mgstasStatus;
    private String mgcntyAssignedCompany;
    private String mgtypeAsMorGm;
    private Integer mgstrdStartDate;
    private Integer mgenddTerminationDate;
    private String mgasexAssignedRegion;
    private Integer mgmgbtManagerBirthday;
    private Integer mgspbtSpouseBirthday;
    private String mgerniEarnedIncentive;
    private String mgmiliMillionOrOver;
    private String mghlthHealthInsurance;
    private BigDecimal mghlpyHealthPayment;
    private String mgdntlRuleNumber;
    private BigDecimal mgdntyDentalPayment;
    private String mgbonsGemBonus;
    private BigDecimal mgbnpcGemBonusPercentage;
    private BigDecimal mgbnmtGemBonusAmount;
    private Integer mgpblcPhysicalBonusLevel;
    private Integer mgbntmMoBonusAmountGoodFor;
    private Integer mgspmoGmBonusAmountStrMo;
    private Integer mgspyrGmBonusAmountStrYr;
    private String mgasmfAsmFees;
    private String mgfxflFixedBaseFlag;
    private BigDecimal mgfixbFixedBaseAmount;
    private String mgccJdeCostCenter;
    private String mgchgdChangeDate;
    private String mguserChangeUser;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "MGAREA_Area", nullable = true)
    public Long getMgareaArea() {
        return mgareaArea;
    }

    public void setMgareaArea(Long mgareaArea) {
        this.mgareaArea = mgareaArea;
    }

    // @Basic
    // @Column(name = "MGDSCG_AreaDescription", nullable = true, length = 255)
    public String getMgdscgAreaDescription() {
        return mgdscgAreaDescription;
    }

    public void setMgdscgAreaDescription(String mgdscgAreaDescription) {
        this.mgdscgAreaDescription = mgdscgAreaDescription;
    }

    // @Basic
    // @Column(name = "MGADD1_Address1", nullable = true, length = 255)
    public String getMgadd1Address1() {
        return mgadd1Address1;
    }

    public void setMgadd1Address1(String mgadd1Address1) {
        this.mgadd1Address1 = mgadd1Address1;
    }

    // @Basic
    // @Column(name = "MGADD2_Address2", nullable = true, length = 255)
    public String getMgadd2Address2() {
        return mgadd2Address2;
    }

    public void setMgadd2Address2(String mgadd2Address2) {
        this.mgadd2Address2 = mgadd2Address2;
    }

    // @Basic
    // @Column(name = "MGADD3_Address3", nullable = true, length = 255)
    public String getMgadd3Address3() {
        return mgadd3Address3;
    }

    public void setMgadd3Address3(String mgadd3Address3) {
        this.mgadd3Address3 = mgadd3Address3;
    }

    // @Basic
    // @Column(name = "MGADD4_Address4", nullable = true, length = 255)
    public String getMgadd4Address4() {
        return mgadd4Address4;
    }

    public void setMgadd4Address4(String mgadd4Address4) {
        this.mgadd4Address4 = mgadd4Address4;
    }

    // @Basic
    // @Column(name = "MGCITY_City", nullable = true, length = 255)
    public String getMgcityCity() {
        return mgcityCity;
    }

    public void setMgcityCity(String mgcityCity) {
        this.mgcityCity = mgcityCity;
    }

    // @Basic
    // @Column(name = "MGSTAT_State", nullable = true, length = 255)
    public String getMgstatState() {
        return mgstatState;
    }

    public void setMgstatState(String mgstatState) {
        this.mgstatState = mgstatState;
    }

    // @Basic
    // @Column(name = "MGACNT_Country", nullable = true, length = 255)
    public String getMgacntCountry() {
        return mgacntCountry;
    }

    public void setMgacntCountry(String mgacntCountry) {
        this.mgacntCountry = mgacntCountry;
    }

    // @Basic
    // @Column(name = "MGZIPC_ZipCode", nullable = true, length = 10)
    public String getMgzipcZipCode() {
        return mgzipcZipCode;
    }

    public void setMgzipcZipCode(String mgzipcZipCode) {
        this.mgzipcZipCode = mgzipcZipCode;
    }

    // @Basic
    // @Column(name = "MGGEOC_GeographicalCode", nullable = true)
    public Long getMggeocGeographicalCode() {
        return mggeocGeographicalCode;
    }

    public void setMggeocGeographicalCode(Long mggeocGeographicalCode) {
        this.mggeocGeographicalCode = mggeocGeographicalCode;
    }

    // @Basic
    // @Column(name = "MGPHON_Phone", nullable = true)
    public Long getMgphonPhone() {
        return mgphonPhone;
    }

    public void setMgphonPhone(Long mgphonPhone) {
        this.mgphonPhone = mgphonPhone;
    }

    // @Basic
    // @Column(name = "MGPHN2_Phone", nullable = true)
    public Long getMgphn2Phone() {
        return mgphn2Phone;
    }

    public void setMgphn2Phone(Long mgphn2Phone) {
        this.mgphn2Phone = mgphn2Phone;
    }

    // @Basic
    // @Column(name = "MGFAX_Fax", nullable = true)
    public Long getMgfaxFax() {
        return mgfaxFax;
    }

    public void setMgfaxFax(Long mgfaxFax) {
        this.mgfaxFax = mgfaxFax;
    }

    // @Basic
    // @Column(name = "MGSTAS_Status", nullable = true, length = 1)
    public String getMgstasStatus() {
        return mgstasStatus;
    }

    public void setMgstasStatus(String mgstasStatus) {
        this.mgstasStatus = mgstasStatus;
    }

    // @Basic
    // @Column(name = "MGCNTY_AssignedCompany", nullable = true, length = 4)
    public String getMgcntyAssignedCompany() {
        return mgcntyAssignedCompany;
    }

    public void setMgcntyAssignedCompany(String mgcntyAssignedCompany) {
        this.mgcntyAssignedCompany = mgcntyAssignedCompany;
    }

    // @Basic
    // @Column(name = "MGTYPE_ASMorGM", nullable = true, length = 1)
    public String getMgtypeAsMorGm() {
        return mgtypeAsMorGm;
    }

    public void setMgtypeAsMorGm(String mgtypeAsMorGm) {
        this.mgtypeAsMorGm = mgtypeAsMorGm;
    }

    // @Basic
    // @Column(name = "MGSTRD_StartDate", nullable = true)
    public Integer getMgstrdStartDate() {
        return mgstrdStartDate;
    }

    public void setMgstrdStartDate(Integer mgstrdStartDate) {
        this.mgstrdStartDate = mgstrdStartDate;
    }

    // @Basic
    // @Column(name = "MGENDD_TerminationDate", nullable = true)
    public Integer getMgenddTerminationDate() {
        return mgenddTerminationDate;
    }

    public void setMgenddTerminationDate(Integer mgenddTerminationDate) {
        this.mgenddTerminationDate = mgenddTerminationDate;
    }

    // @Basic
    // @Column(name = "MGASEX_AssignedRegion", nullable = true, length = 3)
    public String getMgasexAssignedRegion() {
        return mgasexAssignedRegion;
    }

    public void setMgasexAssignedRegion(String mgasexAssignedRegion) {
        this.mgasexAssignedRegion = mgasexAssignedRegion;
    }

    // @Basic
    // @Column(name = "MGMGBT_ManagerBirthday", nullable = true)
    public Integer getMgmgbtManagerBirthday() {
        return mgmgbtManagerBirthday;
    }

    public void setMgmgbtManagerBirthday(Integer mgmgbtManagerBirthday) {
        this.mgmgbtManagerBirthday = mgmgbtManagerBirthday;
    }

    // @Basic
    // @Column(name = "MGSPBT_SpouseBirthday", nullable = true)
    public Integer getMgspbtSpouseBirthday() {
        return mgspbtSpouseBirthday;
    }

    public void setMgspbtSpouseBirthday(Integer mgspbtSpouseBirthday) {
        this.mgspbtSpouseBirthday = mgspbtSpouseBirthday;
    }

    // @Basic
    // @Column(name = "MGERNI_EarnedIncentive", nullable = true, length = 1)
    public String getMgerniEarnedIncentive() {
        return mgerniEarnedIncentive;
    }

    public void setMgerniEarnedIncentive(String mgerniEarnedIncentive) {
        this.mgerniEarnedIncentive = mgerniEarnedIncentive;
    }

    // @Basic
    // @Column(name = "MGMILI_MillionOrOver", nullable = true, length = 1)
    public String getMgmiliMillionOrOver() {
        return mgmiliMillionOrOver;
    }

    public void setMgmiliMillionOrOver(String mgmiliMillionOrOver) {
        this.mgmiliMillionOrOver = mgmiliMillionOrOver;
    }

    // @Basic
    // @Column(name = "MGHLTH_HealthInsurance", nullable = true, length = 1)
    public String getMghlthHealthInsurance() {
        return mghlthHealthInsurance;
    }

    public void setMghlthHealthInsurance(String mghlthHealthInsurance) {
        this.mghlthHealthInsurance = mghlthHealthInsurance;
    }

    // @Basic
    // @Column(name = "MGHLPY_HealthPayment", nullable = true, precision = 2)
    public BigDecimal getMghlpyHealthPayment() {
        return mghlpyHealthPayment;
    }

    public void setMghlpyHealthPayment(BigDecimal mghlpyHealthPayment) {
        this.mghlpyHealthPayment = mghlpyHealthPayment;
    }

    // @Basic
    // @Column(name = "MGDNTL_RuleNumber", nullable = true, length = 1)
    public String getMgdntlRuleNumber() {
        return mgdntlRuleNumber;
    }

    public void setMgdntlRuleNumber(String mgdntlRuleNumber) {
        this.mgdntlRuleNumber = mgdntlRuleNumber;
    }

    // @Basic
    // @Column(name = "MGDNTY_DentalPayment", nullable = true, precision = 3)
    public BigDecimal getMgdntyDentalPayment() {
        return mgdntyDentalPayment;
    }

    public void setMgdntyDentalPayment(BigDecimal mgdntyDentalPayment) {
        this.mgdntyDentalPayment = mgdntyDentalPayment;
    }

    // @Basic
    // @Column(name = "MGBONS_GemBonus", nullable = true, length = 1)
    public String getMgbonsGemBonus() {
        return mgbonsGemBonus;
    }

    public void setMgbonsGemBonus(String mgbonsGemBonus) {
        this.mgbonsGemBonus = mgbonsGemBonus;
    }

    // @Basic
    // @Column(name = "MGBNPC_GemBonusPercentage", nullable = true, precision = 3)
    public BigDecimal getMgbnpcGemBonusPercentage() {
        return mgbnpcGemBonusPercentage;
    }

    public void setMgbnpcGemBonusPercentage(BigDecimal mgbnpcGemBonusPercentage) {
        this.mgbnpcGemBonusPercentage = mgbnpcGemBonusPercentage;
    }

    // @Basic
    // @Column(name = "MGBNMT_GemBonusAmount", nullable = true, precision = 3)
    public BigDecimal getMgbnmtGemBonusAmount() {
        return mgbnmtGemBonusAmount;
    }

    public void setMgbnmtGemBonusAmount(BigDecimal mgbnmtGemBonusAmount) {
        this.mgbnmtGemBonusAmount = mgbnmtGemBonusAmount;
    }

    // @Basic
    // @Column(name = "MGPBLC_PhysicalBonusLevel", nullable = true)
    public Integer getMgpblcPhysicalBonusLevel() {
        return mgpblcPhysicalBonusLevel;
    }

    public void setMgpblcPhysicalBonusLevel(Integer mgpblcPhysicalBonusLevel) {
        this.mgpblcPhysicalBonusLevel = mgpblcPhysicalBonusLevel;
    }

    // @Basic
    // @Column(name = "MGBNTM_MOBonusAmountGoodFor", nullable = true)
    public Integer getMgbntmMoBonusAmountGoodFor() {
        return mgbntmMoBonusAmountGoodFor;
    }

    public void setMgbntmMoBonusAmountGoodFor(Integer mgbntmMoBonusAmountGoodFor) {
        this.mgbntmMoBonusAmountGoodFor = mgbntmMoBonusAmountGoodFor;
    }

    // @Basic
    // @Column(name = "MGSPMO_GMBonusAmountStrMo", nullable = true)
    public Integer getMgspmoGmBonusAmountStrMo() {
        return mgspmoGmBonusAmountStrMo;
    }

    public void setMgspmoGmBonusAmountStrMo(Integer mgspmoGmBonusAmountStrMo) {
        this.mgspmoGmBonusAmountStrMo = mgspmoGmBonusAmountStrMo;
    }

    // @Basic
    // @Column(name = "MGSPYR_GMBonusAmountStrYr", nullable = true)
    public Integer getMgspyrGmBonusAmountStrYr() {
        return mgspyrGmBonusAmountStrYr;
    }

    public void setMgspyrGmBonusAmountStrYr(Integer mgspyrGmBonusAmountStrYr) {
        this.mgspyrGmBonusAmountStrYr = mgspyrGmBonusAmountStrYr;
    }

    // @Basic
    // @Column(name = "MGASMF_AsmFees", nullable = true, length = 1)
    public String getMgasmfAsmFees() {
        return mgasmfAsmFees;
    }

    public void setMgasmfAsmFees(String mgasmfAsmFees) {
        this.mgasmfAsmFees = mgasmfAsmFees;
    }

    // @Basic
    // @Column(name = "MGFXFL_FixedBaseFlag", nullable = true, length = 1)
    public String getMgfxflFixedBaseFlag() {
        return mgfxflFixedBaseFlag;
    }

    public void setMgfxflFixedBaseFlag(String mgfxflFixedBaseFlag) {
        this.mgfxflFixedBaseFlag = mgfxflFixedBaseFlag;
    }

    // @Basic
    // @Column(name = "MGFIXB_FixedBaseAmount", nullable = true, precision = 2)
    public BigDecimal getMgfixbFixedBaseAmount() {
        return mgfixbFixedBaseAmount;
    }

    public void setMgfixbFixedBaseAmount(BigDecimal mgfixbFixedBaseAmount) {
        this.mgfixbFixedBaseAmount = mgfixbFixedBaseAmount;
    }

    // @Basic
    // @Column(name = "MGCC_JdeCostCenter", nullable = true, length = 12)
    public String getMgccJdeCostCenter() {
        return mgccJdeCostCenter;
    }

    public void setMgccJdeCostCenter(String mgccJdeCostCenter) {
        this.mgccJdeCostCenter = mgccJdeCostCenter;
    }

    // @Basic
    // @Column(name = "MGCHGD_ChangeDate", nullable = true, length = 10)
    public String getMgchgdChangeDate() {
        return mgchgdChangeDate;
    }

    public void setMgchgdChangeDate(String mgchgdChangeDate) {
        this.mgchgdChangeDate = mgchgdChangeDate;
    }

    // @Basic
    // @Column(name = "MGUSER_ChangeUser", nullable = true, length = 10)
    public String getMguserChangeUser() {
        return mguserChangeUser;
    }

    public void setMguserChangeUser(String mguserChangeUser) {
        this.mguserChangeUser = mguserChangeUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DsmgrpAreaManagerMaster that = (DsmgrpAreaManagerMaster) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (mgareaArea != null ? !mgareaArea.equals(that.mgareaArea) : that.mgareaArea != null) return false;
        if (mgdscgAreaDescription != null ? !mgdscgAreaDescription.equals(that.mgdscgAreaDescription) : that.mgdscgAreaDescription != null)
            return false;
        if (mgadd1Address1 != null ? !mgadd1Address1.equals(that.mgadd1Address1) : that.mgadd1Address1 != null)
            return false;
        if (mgadd2Address2 != null ? !mgadd2Address2.equals(that.mgadd2Address2) : that.mgadd2Address2 != null)
            return false;
        if (mgadd3Address3 != null ? !mgadd3Address3.equals(that.mgadd3Address3) : that.mgadd3Address3 != null)
            return false;
        if (mgadd4Address4 != null ? !mgadd4Address4.equals(that.mgadd4Address4) : that.mgadd4Address4 != null)
            return false;
        if (mgcityCity != null ? !mgcityCity.equals(that.mgcityCity) : that.mgcityCity != null) return false;
        if (mgstatState != null ? !mgstatState.equals(that.mgstatState) : that.mgstatState != null) return false;
        if (mgacntCountry != null ? !mgacntCountry.equals(that.mgacntCountry) : that.mgacntCountry != null)
            return false;
        if (mgzipcZipCode != null ? !mgzipcZipCode.equals(that.mgzipcZipCode) : that.mgzipcZipCode != null)
            return false;
        if (mggeocGeographicalCode != null ? !mggeocGeographicalCode.equals(that.mggeocGeographicalCode) : that.mggeocGeographicalCode != null)
            return false;
        if (mgphonPhone != null ? !mgphonPhone.equals(that.mgphonPhone) : that.mgphonPhone != null) return false;
        if (mgphn2Phone != null ? !mgphn2Phone.equals(that.mgphn2Phone) : that.mgphn2Phone != null) return false;
        if (mgfaxFax != null ? !mgfaxFax.equals(that.mgfaxFax) : that.mgfaxFax != null) return false;
        if (mgstasStatus != null ? !mgstasStatus.equals(that.mgstasStatus) : that.mgstasStatus != null) return false;
        if (mgcntyAssignedCompany != null ? !mgcntyAssignedCompany.equals(that.mgcntyAssignedCompany) : that.mgcntyAssignedCompany != null)
            return false;
        if (mgtypeAsMorGm != null ? !mgtypeAsMorGm.equals(that.mgtypeAsMorGm) : that.mgtypeAsMorGm != null)
            return false;
        if (mgstrdStartDate != null ? !mgstrdStartDate.equals(that.mgstrdStartDate) : that.mgstrdStartDate != null)
            return false;
        if (mgenddTerminationDate != null ? !mgenddTerminationDate.equals(that.mgenddTerminationDate) : that.mgenddTerminationDate != null)
            return false;
        if (mgasexAssignedRegion != null ? !mgasexAssignedRegion.equals(that.mgasexAssignedRegion) : that.mgasexAssignedRegion != null)
            return false;
        if (mgmgbtManagerBirthday != null ? !mgmgbtManagerBirthday.equals(that.mgmgbtManagerBirthday) : that.mgmgbtManagerBirthday != null)
            return false;
        if (mgspbtSpouseBirthday != null ? !mgspbtSpouseBirthday.equals(that.mgspbtSpouseBirthday) : that.mgspbtSpouseBirthday != null)
            return false;
        if (mgerniEarnedIncentive != null ? !mgerniEarnedIncentive.equals(that.mgerniEarnedIncentive) : that.mgerniEarnedIncentive != null)
            return false;
        if (mgmiliMillionOrOver != null ? !mgmiliMillionOrOver.equals(that.mgmiliMillionOrOver) : that.mgmiliMillionOrOver != null)
            return false;
        if (mghlthHealthInsurance != null ? !mghlthHealthInsurance.equals(that.mghlthHealthInsurance) : that.mghlthHealthInsurance != null)
            return false;
        if (mghlpyHealthPayment != null ? !mghlpyHealthPayment.equals(that.mghlpyHealthPayment) : that.mghlpyHealthPayment != null)
            return false;
        if (mgdntlRuleNumber != null ? !mgdntlRuleNumber.equals(that.mgdntlRuleNumber) : that.mgdntlRuleNumber != null)
            return false;
        if (mgdntyDentalPayment != null ? !mgdntyDentalPayment.equals(that.mgdntyDentalPayment) : that.mgdntyDentalPayment != null)
            return false;
        if (mgbonsGemBonus != null ? !mgbonsGemBonus.equals(that.mgbonsGemBonus) : that.mgbonsGemBonus != null)
            return false;
        if (mgbnpcGemBonusPercentage != null ? !mgbnpcGemBonusPercentage.equals(that.mgbnpcGemBonusPercentage) : that.mgbnpcGemBonusPercentage != null)
            return false;
        if (mgbnmtGemBonusAmount != null ? !mgbnmtGemBonusAmount.equals(that.mgbnmtGemBonusAmount) : that.mgbnmtGemBonusAmount != null)
            return false;
        if (mgpblcPhysicalBonusLevel != null ? !mgpblcPhysicalBonusLevel.equals(that.mgpblcPhysicalBonusLevel) : that.mgpblcPhysicalBonusLevel != null)
            return false;
        if (mgbntmMoBonusAmountGoodFor != null ? !mgbntmMoBonusAmountGoodFor.equals(that.mgbntmMoBonusAmountGoodFor) : that.mgbntmMoBonusAmountGoodFor != null)
            return false;
        if (mgspmoGmBonusAmountStrMo != null ? !mgspmoGmBonusAmountStrMo.equals(that.mgspmoGmBonusAmountStrMo) : that.mgspmoGmBonusAmountStrMo != null)
            return false;
        if (mgspyrGmBonusAmountStrYr != null ? !mgspyrGmBonusAmountStrYr.equals(that.mgspyrGmBonusAmountStrYr) : that.mgspyrGmBonusAmountStrYr != null)
            return false;
        if (mgasmfAsmFees != null ? !mgasmfAsmFees.equals(that.mgasmfAsmFees) : that.mgasmfAsmFees != null)
            return false;
        if (mgfxflFixedBaseFlag != null ? !mgfxflFixedBaseFlag.equals(that.mgfxflFixedBaseFlag) : that.mgfxflFixedBaseFlag != null)
            return false;
        if (mgfixbFixedBaseAmount != null ? !mgfixbFixedBaseAmount.equals(that.mgfixbFixedBaseAmount) : that.mgfixbFixedBaseAmount != null)
            return false;
        if (mgccJdeCostCenter != null ? !mgccJdeCostCenter.equals(that.mgccJdeCostCenter) : that.mgccJdeCostCenter != null)
            return false;
        if (mgchgdChangeDate != null ? !mgchgdChangeDate.equals(that.mgchgdChangeDate) : that.mgchgdChangeDate != null)
            return false;
        if (mguserChangeUser != null ? !mguserChangeUser.equals(that.mguserChangeUser) : that.mguserChangeUser != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (mgareaArea != null ? mgareaArea.hashCode() : 0);
        result = 31 * result + (mgdscgAreaDescription != null ? mgdscgAreaDescription.hashCode() : 0);
        result = 31 * result + (mgadd1Address1 != null ? mgadd1Address1.hashCode() : 0);
        result = 31 * result + (mgadd2Address2 != null ? mgadd2Address2.hashCode() : 0);
        result = 31 * result + (mgadd3Address3 != null ? mgadd3Address3.hashCode() : 0);
        result = 31 * result + (mgadd4Address4 != null ? mgadd4Address4.hashCode() : 0);
        result = 31 * result + (mgcityCity != null ? mgcityCity.hashCode() : 0);
        result = 31 * result + (mgstatState != null ? mgstatState.hashCode() : 0);
        result = 31 * result + (mgacntCountry != null ? mgacntCountry.hashCode() : 0);
        result = 31 * result + (mgzipcZipCode != null ? mgzipcZipCode.hashCode() : 0);
        result = 31 * result + (mggeocGeographicalCode != null ? mggeocGeographicalCode.hashCode() : 0);
        result = 31 * result + (mgphonPhone != null ? mgphonPhone.hashCode() : 0);
        result = 31 * result + (mgphn2Phone != null ? mgphn2Phone.hashCode() : 0);
        result = 31 * result + (mgfaxFax != null ? mgfaxFax.hashCode() : 0);
        result = 31 * result + (mgstasStatus != null ? mgstasStatus.hashCode() : 0);
        result = 31 * result + (mgcntyAssignedCompany != null ? mgcntyAssignedCompany.hashCode() : 0);
        result = 31 * result + (mgtypeAsMorGm != null ? mgtypeAsMorGm.hashCode() : 0);
        result = 31 * result + (mgstrdStartDate != null ? mgstrdStartDate.hashCode() : 0);
        result = 31 * result + (mgenddTerminationDate != null ? mgenddTerminationDate.hashCode() : 0);
        result = 31 * result + (mgasexAssignedRegion != null ? mgasexAssignedRegion.hashCode() : 0);
        result = 31 * result + (mgmgbtManagerBirthday != null ? mgmgbtManagerBirthday.hashCode() : 0);
        result = 31 * result + (mgspbtSpouseBirthday != null ? mgspbtSpouseBirthday.hashCode() : 0);
        result = 31 * result + (mgerniEarnedIncentive != null ? mgerniEarnedIncentive.hashCode() : 0);
        result = 31 * result + (mgmiliMillionOrOver != null ? mgmiliMillionOrOver.hashCode() : 0);
        result = 31 * result + (mghlthHealthInsurance != null ? mghlthHealthInsurance.hashCode() : 0);
        result = 31 * result + (mghlpyHealthPayment != null ? mghlpyHealthPayment.hashCode() : 0);
        result = 31 * result + (mgdntlRuleNumber != null ? mgdntlRuleNumber.hashCode() : 0);
        result = 31 * result + (mgdntyDentalPayment != null ? mgdntyDentalPayment.hashCode() : 0);
        result = 31 * result + (mgbonsGemBonus != null ? mgbonsGemBonus.hashCode() : 0);
        result = 31 * result + (mgbnpcGemBonusPercentage != null ? mgbnpcGemBonusPercentage.hashCode() : 0);
        result = 31 * result + (mgbnmtGemBonusAmount != null ? mgbnmtGemBonusAmount.hashCode() : 0);
        result = 31 * result + (mgpblcPhysicalBonusLevel != null ? mgpblcPhysicalBonusLevel.hashCode() : 0);
        result = 31 * result + (mgbntmMoBonusAmountGoodFor != null ? mgbntmMoBonusAmountGoodFor.hashCode() : 0);
        result = 31 * result + (mgspmoGmBonusAmountStrMo != null ? mgspmoGmBonusAmountStrMo.hashCode() : 0);
        result = 31 * result + (mgspyrGmBonusAmountStrYr != null ? mgspyrGmBonusAmountStrYr.hashCode() : 0);
        result = 31 * result + (mgasmfAsmFees != null ? mgasmfAsmFees.hashCode() : 0);
        result = 31 * result + (mgfxflFixedBaseFlag != null ? mgfxflFixedBaseFlag.hashCode() : 0);
        result = 31 * result + (mgfixbFixedBaseAmount != null ? mgfixbFixedBaseAmount.hashCode() : 0);
        result = 31 * result + (mgccJdeCostCenter != null ? mgccJdeCostCenter.hashCode() : 0);
        result = 31 * result + (mgchgdChangeDate != null ? mgchgdChangeDate.hashCode() : 0);
        result = 31 * result + (mguserChangeUser != null ? mguserChangeUser.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"DsmgrpAreaManagerMaster\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"mgareaArea\":\"" + mgareaArea + "\""
                + ",                         \"mgdscgAreaDescription\":\"" + mgdscgAreaDescription + "\""
                + ",                         \"mgadd1Address1\":\"" + mgadd1Address1 + "\""
                + ",                         \"mgadd2Address2\":\"" + mgadd2Address2 + "\""
                + ",                         \"mgadd3Address3\":\"" + mgadd3Address3 + "\""
                + ",                         \"mgadd4Address4\":\"" + mgadd4Address4 + "\""
                + ",                         \"mgcityCity\":\"" + mgcityCity + "\""
                + ",                         \"mgstatState\":\"" + mgstatState + "\""
                + ",                         \"mgacntCountry\":\"" + mgacntCountry + "\""
                + ",                         \"mgzipcZipCode\":\"" + mgzipcZipCode + "\""
                + ",                         \"mggeocGeographicalCode\":\"" + mggeocGeographicalCode + "\""
                + ",                         \"mgphonPhone\":\"" + mgphonPhone + "\""
                + ",                         \"mgphn2Phone\":\"" + mgphn2Phone + "\""
                + ",                         \"mgfaxFax\":\"" + mgfaxFax + "\""
                + ",                         \"mgstasStatus\":\"" + mgstasStatus + "\""
                + ",                         \"mgcntyAssignedCompany\":\"" + mgcntyAssignedCompany + "\""
                + ",                         \"mgtypeAsMorGm\":\"" + mgtypeAsMorGm + "\""
                + ",                         \"mgstrdStartDate\":\"" + mgstrdStartDate + "\""
                + ",                         \"mgenddTerminationDate\":\"" + mgenddTerminationDate + "\""
                + ",                         \"mgasexAssignedRegion\":\"" + mgasexAssignedRegion + "\""
                + ",                         \"mgmgbtManagerBirthday\":\"" + mgmgbtManagerBirthday + "\""
                + ",                         \"mgspbtSpouseBirthday\":\"" + mgspbtSpouseBirthday + "\""
                + ",                         \"mgerniEarnedIncentive\":\"" + mgerniEarnedIncentive + "\""
                + ",                         \"mgmiliMillionOrOver\":\"" + mgmiliMillionOrOver + "\""
                + ",                         \"mghlthHealthInsurance\":\"" + mghlthHealthInsurance + "\""
                + ",                         \"mghlpyHealthPayment\":\"" + mghlpyHealthPayment + "\""
                + ",                         \"mgdntlRuleNumber\":\"" + mgdntlRuleNumber + "\""
                + ",                         \"mgdntyDentalPayment\":\"" + mgdntyDentalPayment + "\""
                + ",                         \"mgbonsGemBonus\":\"" + mgbonsGemBonus + "\""
                + ",                         \"mgbnpcGemBonusPercentage\":\"" + mgbnpcGemBonusPercentage + "\""
                + ",                         \"mgbnmtGemBonusAmount\":\"" + mgbnmtGemBonusAmount + "\""
                + ",                         \"mgpblcPhysicalBonusLevel\":\"" + mgpblcPhysicalBonusLevel + "\""
                + ",                         \"mgbntmMoBonusAmountGoodFor\":\"" + mgbntmMoBonusAmountGoodFor + "\""
                + ",                         \"mgspmoGmBonusAmountStrMo\":\"" + mgspmoGmBonusAmountStrMo + "\""
                + ",                         \"mgspyrGmBonusAmountStrYr\":\"" + mgspyrGmBonusAmountStrYr + "\""
                + ",                         \"mgasmfAsmFees\":\"" + mgasmfAsmFees + "\""
                + ",                         \"mgfxflFixedBaseFlag\":\"" + mgfxflFixedBaseFlag + "\""
                + ",                         \"mgfixbFixedBaseAmount\":\"" + mgfixbFixedBaseAmount + "\""
                + ",                         \"mgccJdeCostCenter\":\"" + mgccJdeCostCenter + "\""
                + ",                         \"mgchgdChangeDate\":\"" + mgchgdChangeDate + "\""
                + ",                         \"mguserChangeUser\":\"" + mguserChangeUser + "\""
                + "}}";
    }
}
