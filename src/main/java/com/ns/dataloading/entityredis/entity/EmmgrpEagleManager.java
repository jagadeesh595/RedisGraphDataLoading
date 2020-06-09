package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

@RedisHash("EMMGRP_EagleManager")
public class EmmgrpEagleManager implements Serializable {
    private Long id;
    private Long emctycCountryCode;
    private Long emdidDistId;
    private Long emctlControl;
    private Long emsponSponCtl;
    private Integer emsupNewSupervisors;
    private Integer embmlvBegMgrLev;
    private Integer emreqEmRequired;

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
    // @Column(name = "EMSUP_NewSupervisors", nullable = true)
    public Integer getEmsupNewSupervisors() {
        return emsupNewSupervisors;
    }

    public void setEmsupNewSupervisors(Integer emsupNewSupervisors) {
        this.emsupNewSupervisors = emsupNewSupervisors;
    }

    // @Basic
    // @Column(name = "EMBMLV_BegMgrLev", nullable = true)
    public Integer getEmbmlvBegMgrLev() {
        return embmlvBegMgrLev;
    }

    public void setEmbmlvBegMgrLev(Integer embmlvBegMgrLev) {
        this.embmlvBegMgrLev = embmlvBegMgrLev;
    }

    // @Basic
    // @Column(name = "EMREQ_EmRequired", nullable = true)
    public Integer getEmreqEmRequired() {
        return emreqEmRequired;
    }

    public void setEmreqEmRequired(Integer emreqEmRequired) {
        this.emreqEmRequired = emreqEmRequired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmmgrpEagleManager that = (EmmgrpEagleManager) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (emctycCountryCode != null ? !emctycCountryCode.equals(that.emctycCountryCode) : that.emctycCountryCode != null)
            return false;
        if (emdidDistId != null ? !emdidDistId.equals(that.emdidDistId) : that.emdidDistId != null) return false;
        if (emctlControl != null ? !emctlControl.equals(that.emctlControl) : that.emctlControl != null) return false;
        if (emsponSponCtl != null ? !emsponSponCtl.equals(that.emsponSponCtl) : that.emsponSponCtl != null)
            return false;
        if (emsupNewSupervisors != null ? !emsupNewSupervisors.equals(that.emsupNewSupervisors) : that.emsupNewSupervisors != null)
            return false;
        if (embmlvBegMgrLev != null ? !embmlvBegMgrLev.equals(that.embmlvBegMgrLev) : that.embmlvBegMgrLev != null)
            return false;
        if (emreqEmRequired != null ? !emreqEmRequired.equals(that.emreqEmRequired) : that.emreqEmRequired != null)
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
        result = 31 * result + (emsupNewSupervisors != null ? emsupNewSupervisors.hashCode() : 0);
        result = 31 * result + (embmlvBegMgrLev != null ? embmlvBegMgrLev.hashCode() : 0);
        result = 31 * result + (emreqEmRequired != null ? emreqEmRequired.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"EmmgrpEagleManager\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"emctycCountryCode\":\"" + emctycCountryCode + "\""
                + ",                         \"emdidDistId\":\"" + emdidDistId + "\""
                + ",                         \"emctlControl\":\"" + emctlControl + "\""
                + ",                         \"emsponSponCtl\":\"" + emsponSponCtl + "\""
                + ",                         \"emsupNewSupervisors\":\"" + emsupNewSupervisors + "\""
                + ",                         \"embmlvBegMgrLev\":\"" + embmlvBegMgrLev + "\""
                + ",                         \"emreqEmRequired\":\"" + emreqEmRequired + "\""
                + "}}";
    }
}
