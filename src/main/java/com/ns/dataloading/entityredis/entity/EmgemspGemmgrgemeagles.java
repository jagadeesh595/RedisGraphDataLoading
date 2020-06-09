package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

import static javax.persistence.GenerationType.IDENTITY;

@RedisHash("EMGEMSP_GemMgrGemEagles")
public class EmgemspGemmgrgemeagles implements Serializable {

    private Long id;
    private Integer egpyrProcessingYear;
    private Integer egpmoProcessingMonth;
    private String egisoOperatingCountry;
    private String egdidFboId;
    private String egctlFboControl;
    private String egnameFboName;
    private String egsponSponsorCtl;
    private BigDecimal egtccTotalCc;
    private BigDecimal egnccNewCc;
    private BigDecimal eghmnwccHomeNewCc;
    private BigDecimal egotnwccOtherNewCc;
    private Integer egsupNewSupervisors;
    private Integer egbmlvBegMgrLev;
    private Integer egreqEmrequired;
    private Integer egemEagleMgrs;
    private Integer emlinsEmLines;
    private Integer egglvlGemMgrLvl;
    private Integer egtlvlEagleTargetLvl;
    private String egtdescEagleTargetDesc;
    private Integer egqlvlEagleQualifyLvl;
    private String egqdescEagleQualDesc;
    private String egstmpProcessTimeStamp;
    private String eguserProcessUser;
    private String egpgmProcessPgm;

    public EmgemspGemmgrgemeagles() {
    }

    public EmgemspGemmgrgemeagles(Integer egpyrProcessingYear, Integer egpmoProcessingMonth,
                                  String egisoOperatingCountry, String egdidFboId, String egctlFboControl, String egnameFboName,
                                  String egsponSponsorCtl, BigDecimal egtccTotalCc, BigDecimal egnccNewCc, BigDecimal eghmnwccHomeNewCc,
                                  BigDecimal egotnwccOtherNewCc, Integer egsupNewSupervisors, Integer egbmlvBegMgrLev,
                                  Integer egreqEmrequired, Integer egemEagleMgrs, Integer emlinsEmLines, Integer egglvlGemMgrLvl,
                                  Integer egtlvlEagleTargetLvl, String egtdescEagleTargetDesc, Integer egqlvlEagleQualifyLvl,
                                  String egqdescEagleQualDesc, String egstmpProcessTimeStamp, String eguserProcessUser,
                                  String egpgmProcessPgm) {
        this.egpyrProcessingYear = egpyrProcessingYear;
        this.egpmoProcessingMonth = egpmoProcessingMonth;
        this.egisoOperatingCountry = egisoOperatingCountry;
        this.egdidFboId = egdidFboId;
        this.egctlFboControl = egctlFboControl;
        this.egnameFboName = egnameFboName;
        this.egsponSponsorCtl = egsponSponsorCtl;
        this.egtccTotalCc = egtccTotalCc;
        this.egnccNewCc = egnccNewCc;
        this.eghmnwccHomeNewCc = eghmnwccHomeNewCc;
        this.egotnwccOtherNewCc = egotnwccOtherNewCc;
        this.egsupNewSupervisors = egsupNewSupervisors;
        this.egbmlvBegMgrLev = egbmlvBegMgrLev;
        this.egreqEmrequired = egreqEmrequired;
        this.egemEagleMgrs = egemEagleMgrs;
        this.emlinsEmLines = emlinsEmLines;
        this.egglvlGemMgrLvl = egglvlGemMgrLvl;
        this.egtlvlEagleTargetLvl = egtlvlEagleTargetLvl;
        this.egtdescEagleTargetDesc = egtdescEagleTargetDesc;
        this.egqlvlEagleQualifyLvl = egqlvlEagleQualifyLvl;
        this.egqdescEagleQualDesc = egqdescEagleQualDesc;
        this.egstmpProcessTimeStamp = egstmpProcessTimeStamp;
        this.eguserProcessUser = eguserProcessUser;
        this.egpgmProcessPgm = egpgmProcessPgm;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    // @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Column(name = "EGPYR_ProcessingYear")
    public Integer getEgpyrProcessingYear() {
        return this.egpyrProcessingYear;
    }

    public void setEgpyrProcessingYear(Integer egpyrProcessingYear) {
        this.egpyrProcessingYear = egpyrProcessingYear;
    }

    // @Column(name = "EGPMO_ProcessingMonth")
    public Integer getEgpmoProcessingMonth() {
        return this.egpmoProcessingMonth;
    }

    public void setEgpmoProcessingMonth(Integer egpmoProcessingMonth) {
        this.egpmoProcessingMonth = egpmoProcessingMonth;
    }

    // @Column(name = "EGISO_OperatingCountry")
    public String getEgisoOperatingCountry() {
        return this.egisoOperatingCountry;
    }

    public void setEgisoOperatingCountry(String egisoOperatingCountry) {
        this.egisoOperatingCountry = egisoOperatingCountry;
    }

    // @Column(name = "EGDID_FboId")
    public String getEgdidFboId() {
        return this.egdidFboId;
    }

    public void setEgdidFboId(String egdidFboId) {
        this.egdidFboId = egdidFboId;
    }

    // @Column(name = "EGCTL_FboControl")
    public String getEgctlFboControl() {
        return this.egctlFboControl;
    }

    public void setEgctlFboControl(String egctlFboControl) {
        this.egctlFboControl = egctlFboControl;
    }

    // @Column(name = "EGNAME_FboName")
    public String getEgnameFboName() {
        return this.egnameFboName;
    }

    public void setEgnameFboName(String egnameFboName) {
        this.egnameFboName = egnameFboName;
    }

    // @Column(name = "EGSPON_SponsorCtl")
    public String getEgsponSponsorCtl() {
        return this.egsponSponsorCtl;
    }

    public void setEgsponSponsorCtl(String egsponSponsorCtl) {
        this.egsponSponsorCtl = egsponSponsorCtl;
    }

    // @Column(name = "EGTCC_TotalCC", precision = 10, scale = 3)
    public BigDecimal getEgtccTotalCc() {
        return this.egtccTotalCc;
    }

    public void setEgtccTotalCc(BigDecimal egtccTotalCc) {
        this.egtccTotalCc = egtccTotalCc;
    }

    // @Column(name = "EGNCC_NewCC", precision = 10, scale = 3)
    public BigDecimal getEgnccNewCc() {
        return this.egnccNewCc;
    }

    public void setEgnccNewCc(BigDecimal egnccNewCc) {
        this.egnccNewCc = egnccNewCc;
    }

    // @Column(name = "EGHMNWCC_HomeNewCC", precision = 10, scale = 3)
    public BigDecimal getEghmnwccHomeNewCc() {
        return this.eghmnwccHomeNewCc;
    }

    public void setEghmnwccHomeNewCc(BigDecimal eghmnwccHomeNewCc) {
        this.eghmnwccHomeNewCc = eghmnwccHomeNewCc;
    }

    // @Column(name = "EGOTNWCC_OtherNewCC", precision = 10, scale = 3)
    public BigDecimal getEgotnwccOtherNewCc() {
        return this.egotnwccOtherNewCc;
    }

    public void setEgotnwccOtherNewCc(BigDecimal egotnwccOtherNewCc) {
        this.egotnwccOtherNewCc = egotnwccOtherNewCc;
    }

    // @Column(name = "EGSUP_NewSupervisors")
    public Integer getEgsupNewSupervisors() {
        return this.egsupNewSupervisors;
    }

    public void setEgsupNewSupervisors(Integer egsupNewSupervisors) {
        this.egsupNewSupervisors = egsupNewSupervisors;
    }

    // @Column(name = "EGBMLV_BegMgrLev")
    public Integer getEgbmlvBegMgrLev() {
        return this.egbmlvBegMgrLev;
    }

    public void setEgbmlvBegMgrLev(Integer egbmlvBegMgrLev) {
        this.egbmlvBegMgrLev = egbmlvBegMgrLev;
    }

    // @Column(name = "EGREQ_EMrequired")
    public Integer getEgreqEmrequired() {
        return this.egreqEmrequired;
    }

    public void setEgreqEmrequired(Integer egreqEmrequired) {
        this.egreqEmrequired = egreqEmrequired;
    }

    // @Column(name = "EGEM_EagleMgrs")
    public Integer getEgemEagleMgrs() {
        return this.egemEagleMgrs;
    }

    public void setEgemEagleMgrs(Integer egemEagleMgrs) {
        this.egemEagleMgrs = egemEagleMgrs;
    }

    // @Column(name = "EMLINS_EmLines")
    public Integer getEmlinsEmLines() {
        return this.emlinsEmLines;
    }

    public void setEmlinsEmLines(Integer emlinsEmLines) {
        this.emlinsEmLines = emlinsEmLines;
    }

    // @Column(name = "EGGLVL_GemMgrLvl")
    public Integer getEgglvlGemMgrLvl() {
        return this.egglvlGemMgrLvl;
    }

    public void setEgglvlGemMgrLvl(Integer egglvlGemMgrLvl) {
        this.egglvlGemMgrLvl = egglvlGemMgrLvl;
    }

    // @Column(name = "EGTLVL_EagleTargetLvl")
    public Integer getEgtlvlEagleTargetLvl() {
        return this.egtlvlEagleTargetLvl;
    }

    public void setEgtlvlEagleTargetLvl(Integer egtlvlEagleTargetLvl) {
        this.egtlvlEagleTargetLvl = egtlvlEagleTargetLvl;
    }

    // @Column(name = "EGTDESC_EagleTargetDesc")
    public String getEgtdescEagleTargetDesc() {
        return this.egtdescEagleTargetDesc;
    }

    public void setEgtdescEagleTargetDesc(String egtdescEagleTargetDesc) {
        this.egtdescEagleTargetDesc = egtdescEagleTargetDesc;
    }

    // @Column(name = "EGQLVL_EagleQualifyLvl")
    public Integer getEgqlvlEagleQualifyLvl() {
        return this.egqlvlEagleQualifyLvl;
    }

    public void setEgqlvlEagleQualifyLvl(Integer egqlvlEagleQualifyLvl) {
        this.egqlvlEagleQualifyLvl = egqlvlEagleQualifyLvl;
    }

    // @Column(name = "EGQDESC_EagleQualDesc")
    public String getEgqdescEagleQualDesc() {
        return this.egqdescEagleQualDesc;
    }

    public void setEgqdescEagleQualDesc(String egqdescEagleQualDesc) {
        this.egqdescEagleQualDesc = egqdescEagleQualDesc;
    }

    // @Column(name = "EGSTMP_ProcessTimeStamp")
    public String getEgstmpProcessTimeStamp() {
        return this.egstmpProcessTimeStamp;
    }

    public void setEgstmpProcessTimeStamp(String egstmpProcessTimeStamp) {
        this.egstmpProcessTimeStamp = egstmpProcessTimeStamp;
    }

    // @Column(name = "EGUSER_ProcessUser")
    public String getEguserProcessUser() {
        return this.eguserProcessUser;
    }

    public void setEguserProcessUser(String eguserProcessUser) {
        this.eguserProcessUser = eguserProcessUser;
    }

    // @Column(name = "EGPGM_ProcessPgm")
    public String getEgpgmProcessPgm() {
        return this.egpgmProcessPgm;
    }

    public void setEgpgmProcessPgm(String egpgmProcessPgm) {
        this.egpgmProcessPgm = egpgmProcessPgm;
    }

}
