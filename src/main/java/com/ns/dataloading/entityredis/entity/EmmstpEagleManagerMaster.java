package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("EMMSTP_EagleManagerMaster")
public class EmmstpEagleManagerMaster implements Serializable {
    private Long id;
    private Long emctycCountryCode;
    private Long emdidDistId;
    private Long emctlControl;
    private Long emsponSponCtl;
    private BigDecimal emtccTotalCc;
    private BigDecimal emnccNewPerOrNmCc;
    private Integer emsupNewSuperVisors;
    private Integer embmlvBegMgrLvl;
    private Integer emreqEmRequired;
    private Integer ememEagleMgrs;
    private Integer emlinsEagleMgrLines;
    private Integer emlvlEagleLevelAchieved;
    private String emcoidCompanyId;
    private String emregAssignedRegion;
    private String emchgdLastChangeDate;
    private String emuserLastChangeUser;
    private String empgmLastChangePgm;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "EMCTYC_CountryCode", nullable = true)
    public Long getEmctycCountryCode() {
        return emctycCountryCode;
    }

    public void setEmctycCountryCode(Long emctycCountryCode) {
        this.emctycCountryCode = emctycCountryCode;
    }

    // @Basic
    // @Column(name = "EMDID_DistId", nullable = true)
    public Long getEmdidDistId() {
        return emdidDistId;
    }

    public void setEmdidDistId(Long emdidDistId) {
        this.emdidDistId = emdidDistId;
    }

    // @Basic
    // @Column(name = "EMCTL_Control", nullable = false)
    public Long getEmctlControl() {
        return emctlControl;
    }

    public void setEmctlControl(Long emctlControl) {
        this.emctlControl = emctlControl;
    }

    // @Basic
    // @Column(name = "EMSPON_SponCtl", nullable = true)
    public Long getEmsponSponCtl() {
        return emsponSponCtl;
    }

    public void setEmsponSponCtl(Long emsponSponCtl) {
        this.emsponSponCtl = emsponSponCtl;
    }

    // @Basic
    // @Column(name = "EMTCC_TotalCc", nullable = true, precision = 3)
    public BigDecimal getEmtccTotalCc() {
        return emtccTotalCc;
    }

    public void setEmtccTotalCc(BigDecimal emtccTotalCc) {
        this.emtccTotalCc = emtccTotalCc;
    }

    // @Basic
    // @Column(name = "EMNCC_NewPerOrNMCc", nullable = true, precision = 3)
    public BigDecimal getEmnccNewPerOrNmCc() {
        return emnccNewPerOrNmCc;
    }

    public void setEmnccNewPerOrNmCc(BigDecimal emnccNewPerOrNmCc) {
        this.emnccNewPerOrNmCc = emnccNewPerOrNmCc;
    }

    // @Basic
    // @Column(name = "EMSUP_NewSuperVisors", nullable = true)
    public Integer getEmsupNewSuperVisors() {
        return emsupNewSuperVisors;
    }

    public void setEmsupNewSuperVisors(Integer emsupNewSuperVisors) {
        this.emsupNewSuperVisors = emsupNewSuperVisors;
    }

    // @Basic
    // @Column(name = "EMBMLV_BegMgrLvl", nullable = true)
    public Integer getEmbmlvBegMgrLvl() {
        return embmlvBegMgrLvl;
    }

    public void setEmbmlvBegMgrLvl(Integer embmlvBegMgrLvl) {
        this.embmlvBegMgrLvl = embmlvBegMgrLvl;
    }

    // @Basic
    // @Column(name = "EMREQ_EmRequired", nullable = true)
    public Integer getEmreqEmRequired() {
        return emreqEmRequired;
    }

    public void setEmreqEmRequired(Integer emreqEmRequired) {
        this.emreqEmRequired = emreqEmRequired;
    }

    // @Basic
    // @Column(name = "EMEM_EagleMgrs", nullable = true)
    public Integer getEmemEagleMgrs() {
        return ememEagleMgrs;
    }

    public void setEmemEagleMgrs(Integer ememEagleMgrs) {
        this.ememEagleMgrs = ememEagleMgrs;
    }

    // @Basic
    // @Column(name = "EMLINS_EagleMgrLines", nullable = true)
    public Integer getEmlinsEagleMgrLines() {
        return emlinsEagleMgrLines;
    }

    public void setEmlinsEagleMgrLines(Integer emlinsEagleMgrLines) {
        this.emlinsEagleMgrLines = emlinsEagleMgrLines;
    }

    // @Basic
    // @Column(name = "EMLVL_EagleLevelAchieved", nullable = true)
    public Integer getEmlvlEagleLevelAchieved() {
        return emlvlEagleLevelAchieved;
    }

    public void setEmlvlEagleLevelAchieved(Integer emlvlEagleLevelAchieved) {
        this.emlvlEagleLevelAchieved = emlvlEagleLevelAchieved;
    }

    // @Basic
    // @Column(name = "EMCOID_CompanyId", nullable = true, length = 15)
    public String getEmcoidCompanyId() {
        return emcoidCompanyId;
    }

    public void setEmcoidCompanyId(String emcoidCompanyId) {
        this.emcoidCompanyId = emcoidCompanyId;
    }

    // @Basic
    // @Column(name = "EMREG_AssignedRegion", nullable = true, length = 15)
    public String getEmregAssignedRegion() {
        return emregAssignedRegion;
    }

    public void setEmregAssignedRegion(String emregAssignedRegion) {
        this.emregAssignedRegion = emregAssignedRegion;
    }

    // @Basic
    // @Column(name = "EMCHGD_LastChangeDate", nullable = true, length = 15)
    public String getEmchgdLastChangeDate() {
        return emchgdLastChangeDate;
    }

    public void setEmchgdLastChangeDate(String emchgdLastChangeDate) {
        this.emchgdLastChangeDate = emchgdLastChangeDate;
    }

    // @Basic
    // @Column(name = "EMUSER_LastChangeUser", nullable = true, length = 255)
    public String getEmuserLastChangeUser() {
        return emuserLastChangeUser;
    }

    public void setEmuserLastChangeUser(String emuserLastChangeUser) {
        this.emuserLastChangeUser = emuserLastChangeUser;
    }

    // @Basic
    // @Column(name = "EMPGM_LastChangePgm", nullable = true, length = 255)
    public String getEmpgmLastChangePgm() {
        return empgmLastChangePgm;
    }

    public void setEmpgmLastChangePgm(String empgmLastChangePgm) {
        this.empgmLastChangePgm = empgmLastChangePgm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmmstpEagleManagerMaster that = (EmmstpEagleManagerMaster) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (emctycCountryCode != null ? !emctycCountryCode.equals(that.emctycCountryCode) : that.emctycCountryCode != null)
            return false;
        if (emdidDistId != null ? !emdidDistId.equals(that.emdidDistId) : that.emdidDistId != null) return false;
        if (emctlControl != null ? !emctlControl.equals(that.emctlControl) : that.emctlControl != null) return false;
        if (emsponSponCtl != null ? !emsponSponCtl.equals(that.emsponSponCtl) : that.emsponSponCtl != null)
            return false;
        if (emtccTotalCc != null ? !emtccTotalCc.equals(that.emtccTotalCc) : that.emtccTotalCc != null) return false;
        if (emnccNewPerOrNmCc != null ? !emnccNewPerOrNmCc.equals(that.emnccNewPerOrNmCc) : that.emnccNewPerOrNmCc != null)
            return false;
        if (emsupNewSuperVisors != null ? !emsupNewSuperVisors.equals(that.emsupNewSuperVisors) : that.emsupNewSuperVisors != null)
            return false;
        if (embmlvBegMgrLvl != null ? !embmlvBegMgrLvl.equals(that.embmlvBegMgrLvl) : that.embmlvBegMgrLvl != null)
            return false;
        if (emreqEmRequired != null ? !emreqEmRequired.equals(that.emreqEmRequired) : that.emreqEmRequired != null)
            return false;
        if (ememEagleMgrs != null ? !ememEagleMgrs.equals(that.ememEagleMgrs) : that.ememEagleMgrs != null)
            return false;
        if (emlinsEagleMgrLines != null ? !emlinsEagleMgrLines.equals(that.emlinsEagleMgrLines) : that.emlinsEagleMgrLines != null)
            return false;
        if (emlvlEagleLevelAchieved != null ? !emlvlEagleLevelAchieved.equals(that.emlvlEagleLevelAchieved) : that.emlvlEagleLevelAchieved != null)
            return false;
        if (emcoidCompanyId != null ? !emcoidCompanyId.equals(that.emcoidCompanyId) : that.emcoidCompanyId != null)
            return false;
        if (emregAssignedRegion != null ? !emregAssignedRegion.equals(that.emregAssignedRegion) : that.emregAssignedRegion != null)
            return false;
        if (emchgdLastChangeDate != null ? !emchgdLastChangeDate.equals(that.emchgdLastChangeDate) : that.emchgdLastChangeDate != null)
            return false;
        if (emuserLastChangeUser != null ? !emuserLastChangeUser.equals(that.emuserLastChangeUser) : that.emuserLastChangeUser != null)
            return false;
        if (empgmLastChangePgm != null ? !empgmLastChangePgm.equals(that.empgmLastChangePgm) : that.empgmLastChangePgm != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (emctycCountryCode != null ? emctycCountryCode.hashCode() : 0);
        result = 31 * result + (emdidDistId != null ? emdidDistId.hashCode() : 0);
        result = 31 * result + (emctlControl != null ? emctlControl.hashCode() : 0);
        result = 31 * result + (emsponSponCtl != null ? emsponSponCtl.hashCode() : 0);
        result = 31 * result + (emtccTotalCc != null ? emtccTotalCc.hashCode() : 0);
        result = 31 * result + (emnccNewPerOrNmCc != null ? emnccNewPerOrNmCc.hashCode() : 0);
        result = 31 * result + (emsupNewSuperVisors != null ? emsupNewSuperVisors.hashCode() : 0);
        result = 31 * result + (embmlvBegMgrLvl != null ? embmlvBegMgrLvl.hashCode() : 0);
        result = 31 * result + (emreqEmRequired != null ? emreqEmRequired.hashCode() : 0);
        result = 31 * result + (ememEagleMgrs != null ? ememEagleMgrs.hashCode() : 0);
        result = 31 * result + (emlinsEagleMgrLines != null ? emlinsEagleMgrLines.hashCode() : 0);
        result = 31 * result + (emlvlEagleLevelAchieved != null ? emlvlEagleLevelAchieved.hashCode() : 0);
        result = 31 * result + (emcoidCompanyId != null ? emcoidCompanyId.hashCode() : 0);
        result = 31 * result + (emregAssignedRegion != null ? emregAssignedRegion.hashCode() : 0);
        result = 31 * result + (emchgdLastChangeDate != null ? emchgdLastChangeDate.hashCode() : 0);
        result = 31 * result + (emuserLastChangeUser != null ? emuserLastChangeUser.hashCode() : 0);
        result = 31 * result + (empgmLastChangePgm != null ? empgmLastChangePgm.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"EmmstpEagleManagerMaster\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"emctycCountryCode\":\"" + emctycCountryCode + "\""
                + ",                         \"emdidDistId\":\"" + emdidDistId + "\""
                + ",                         \"emctlControl\":\"" + emctlControl + "\""
                + ",                         \"emsponSponCtl\":\"" + emsponSponCtl + "\""
                + ",                         \"emtccTotalCc\":\"" + emtccTotalCc + "\""
                + ",                         \"emnccNewPerOrNmCc\":\"" + emnccNewPerOrNmCc + "\""
                + ",                         \"emsupNewSuperVisors\":\"" + emsupNewSuperVisors + "\""
                + ",                         \"embmlvBegMgrLvl\":\"" + embmlvBegMgrLvl + "\""
                + ",                         \"emreqEmRequired\":\"" + emreqEmRequired + "\""
                + ",                         \"ememEagleMgrs\":\"" + ememEagleMgrs + "\""
                + ",                         \"emlinsEagleMgrLines\":\"" + emlinsEagleMgrLines + "\""
                + ",                         \"emlvlEagleLevelAchieved\":\"" + emlvlEagleLevelAchieved + "\""
                + ",                         \"emcoidCompanyId\":\"" + emcoidCompanyId + "\""
                + ",                         \"emregAssignedRegion\":\"" + emregAssignedRegion + "\""
                + ",                         \"emchgdLastChangeDate\":\"" + emchgdLastChangeDate + "\""
                + ",                         \"emuserLastChangeUser\":\"" + emuserLastChangeUser + "\""
                + ",                         \"empgmLastChangePgm\":\"" + empgmLastChangePgm + "\""
                + "}}";
    }

    public EmmstpEagleManagerMaster copy() {
        EmmstpEagleManagerMaster em = new EmmstpEagleManagerMaster();
        em.emctycCountryCode = emctycCountryCode;
        em.emdidDistId = emdidDistId;
        em.emctlControl = emctlControl;
        em.emsponSponCtl = emsponSponCtl;
        em.emtccTotalCc = emtccTotalCc;
        em.emnccNewPerOrNmCc = emnccNewPerOrNmCc;
        em.emsupNewSuperVisors = emsupNewSuperVisors;
        em.embmlvBegMgrLvl = embmlvBegMgrLvl;
        em.emreqEmRequired = emreqEmRequired;
        em.ememEagleMgrs = ememEagleMgrs;
        em.emlinsEagleMgrLines = emlinsEagleMgrLines;
        em.emlvlEagleLevelAchieved = emlvlEagleLevelAchieved;
        em.emcoidCompanyId = emcoidCompanyId;
        em.emregAssignedRegion = emregAssignedRegion;
        em.emchgdLastChangeDate = emchgdLastChangeDate;
        em.emuserLastChangeUser = emuserLastChangeUser;
        em.empgmLastChangePgm = empgmLastChangePgm;
        return em;
    }

}
