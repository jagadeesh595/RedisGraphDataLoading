package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("BOMNQP_MgrsNotQualForLBDailyCC")
public class BomnqpMgrsNotQualForLbDailyCc implements Serializable {
    private Long id;
    private String bncoidCompanyid;
    private Long bnctlDistribitorcontrol;
    private Long bnctycCountrycode;
    private Long bndidDistributorid;
    private String bnfrdcForeigndomdist;
    private String bnwk1CGrandfatherflag;
    private String bndqmgDisqualmgr;
    private String bnwaiv4Ccwaiver;
    private String bnldbwLdrbonuswaiver;
    private String bnpaypLdrbonuseligible;
    private String bnqumgLbqualified;
    private BigDecimal bnpcasPersonalcasecredits;
    private BigDecimal bndcasDistcasecredits;
    private BigDecimal bntacsTotalactivecasecredits;
    private BigDecimal bnncasNonmanagercasecredits;
    private BigDecimal bnneedCasecreditsneeded;
    private Integer bntmgrTotalmanagers;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "BNCOID_COMPANYID", nullable = true, length = 255)
    public String getBncoidCompanyid() {
        return bncoidCompanyid;
    }

    public void setBncoidCompanyid(String bncoidCompanyid) {
        this.bncoidCompanyid = bncoidCompanyid;
    }

    // @Basic
    // @Column(name = "BNCTL_DISTRIBITORCONTROL", nullable = false)
    public Long getBnctlDistribitorcontrol() {
        return bnctlDistribitorcontrol;
    }

    public void setBnctlDistribitorcontrol(Long bnctlDistribitorcontrol) {
        this.bnctlDistribitorcontrol = bnctlDistribitorcontrol;
    }

    // @Basic
    // @Column(name = "BNCTYC_COUNTRYCODE", nullable = true)
    public Long getBnctycCountrycode() {
        return bnctycCountrycode;
    }

    public void setBnctycCountrycode(Long bnctycCountrycode) {
        this.bnctycCountrycode = bnctycCountrycode;
    }

    // @Basic
    // @Column(name = "BNDID_DISTRIBUTORID", nullable = false)
    public Long getBndidDistributorid() {
        return bndidDistributorid;
    }

    public void setBndidDistributorid(Long bndidDistributorid) {
        this.bndidDistributorid = bndidDistributorid;
    }

    // @Basic
    // @Column(name = "BNFRDC_FOREIGNDOMDIST", nullable = true, length = 15)
    public String getBnfrdcForeigndomdist() {
        return bnfrdcForeigndomdist;
    }

    public void setBnfrdcForeigndomdist(String bnfrdcForeigndomdist) {
        this.bnfrdcForeigndomdist = bnfrdcForeigndomdist;
    }

    // @Basic
    // @Column(name = "BNWK1C_GRANDFATHERFLAG", nullable = true, length = 15)
    public String getBnwk1CGrandfatherflag() {
        return bnwk1CGrandfatherflag;
    }

    public void setBnwk1CGrandfatherflag(String bnwk1CGrandfatherflag) {
        this.bnwk1CGrandfatherflag = bnwk1CGrandfatherflag;
    }

    // @Basic
    // @Column(name = "BNDQMG_DISQUALMGR", nullable = true, length = 15)
    public String getBndqmgDisqualmgr() {
        return bndqmgDisqualmgr;
    }

    public void setBndqmgDisqualmgr(String bndqmgDisqualmgr) {
        this.bndqmgDisqualmgr = bndqmgDisqualmgr;
    }

    // @Basic
    // @Column(name = "BNWAIV_4CCWAIVER", nullable = true, length = 15)
    public String getBnwaiv4Ccwaiver() {
        return bnwaiv4Ccwaiver;
    }

    public void setBnwaiv4Ccwaiver(String bnwaiv4Ccwaiver) {
        this.bnwaiv4Ccwaiver = bnwaiv4Ccwaiver;
    }

    // @Basic
    // @Column(name = "BNLDBW_LDRBONUSWAIVER", nullable = true, length = 15)
    public String getBnldbwLdrbonuswaiver() {
        return bnldbwLdrbonuswaiver;
    }

    public void setBnldbwLdrbonuswaiver(String bnldbwLdrbonuswaiver) {
        this.bnldbwLdrbonuswaiver = bnldbwLdrbonuswaiver;
    }

    // @Basic
    // @Column(name = "BNPAYP_LDRBONUSELIGIBLE", nullable = true, length = 15)
    public String getBnpaypLdrbonuseligible() {
        return bnpaypLdrbonuseligible;
    }

    public void setBnpaypLdrbonuseligible(String bnpaypLdrbonuseligible) {
        this.bnpaypLdrbonuseligible = bnpaypLdrbonuseligible;
    }

    // @Basic
    // @Column(name = "BNQUMG_LBQUALIFIED", nullable = true, length = 15)
    public String getBnqumgLbqualified() {
        return bnqumgLbqualified;
    }

    public void setBnqumgLbqualified(String bnqumgLbqualified) {
        this.bnqumgLbqualified = bnqumgLbqualified;
    }

    // @Basic
    // @Column(name = "BNPCAS_PERSONALCASECREDITS", nullable = true, precision = 3)
    public BigDecimal getBnpcasPersonalcasecredits() {
        return bnpcasPersonalcasecredits;
    }

    public void setBnpcasPersonalcasecredits(BigDecimal bnpcasPersonalcasecredits) {
        this.bnpcasPersonalcasecredits = bnpcasPersonalcasecredits;
    }

    // @Basic
    // @Column(name = "BNDCAS_DISTCASECREDITS", nullable = true, precision = 3)
    public BigDecimal getBndcasDistcasecredits() {
        return bndcasDistcasecredits;
    }

    public void setBndcasDistcasecredits(BigDecimal bndcasDistcasecredits) {
        this.bndcasDistcasecredits = bndcasDistcasecredits;
    }

    // @Basic
    // @Column(name = "BNTACS_TOTALACTIVECASECREDITS", nullable = true, precision = 3)
    public BigDecimal getBntacsTotalactivecasecredits() {
        return bntacsTotalactivecasecredits;
    }

    public void setBntacsTotalactivecasecredits(BigDecimal bntacsTotalactivecasecredits) {
        this.bntacsTotalactivecasecredits = bntacsTotalactivecasecredits;
    }

    // @Basic
    // @Column(name = "BNNCAS_NONMANAGERCASECREDITS", nullable = true, precision = 3)
    public BigDecimal getBnncasNonmanagercasecredits() {
        return bnncasNonmanagercasecredits;
    }

    public void setBnncasNonmanagercasecredits(BigDecimal bnncasNonmanagercasecredits) {
        this.bnncasNonmanagercasecredits = bnncasNonmanagercasecredits;
    }

    // @Basic
    // @Column(name = "BNNEED_CASECREDITSNEEDED", nullable = true, precision = 3)
    public BigDecimal getBnneedCasecreditsneeded() {
        return bnneedCasecreditsneeded;
    }

    public void setBnneedCasecreditsneeded(BigDecimal bnneedCasecreditsneeded) {
        this.bnneedCasecreditsneeded = bnneedCasecreditsneeded;
    }

    // @Basic
    // @Column(name = "BNTMGR_TOTALMANAGERS", nullable = true)
    public Integer getBntmgrTotalmanagers() {
        return bntmgrTotalmanagers;
    }

    public void setBntmgrTotalmanagers(Integer bntmgrTotalmanagers) {
        this.bntmgrTotalmanagers = bntmgrTotalmanagers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BomnqpMgrsNotQualForLbDailyCc that = (BomnqpMgrsNotQualForLbDailyCc) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bncoidCompanyid != null ? !bncoidCompanyid.equals(that.bncoidCompanyid) : that.bncoidCompanyid != null)
            return false;
        if (bnctlDistribitorcontrol != null ? !bnctlDistribitorcontrol.equals(that.bnctlDistribitorcontrol) : that.bnctlDistribitorcontrol != null)
            return false;
        if (bnctycCountrycode != null ? !bnctycCountrycode.equals(that.bnctycCountrycode) : that.bnctycCountrycode != null)
            return false;
        if (bndidDistributorid != null ? !bndidDistributorid.equals(that.bndidDistributorid) : that.bndidDistributorid != null)
            return false;
        if (bnfrdcForeigndomdist != null ? !bnfrdcForeigndomdist.equals(that.bnfrdcForeigndomdist) : that.bnfrdcForeigndomdist != null)
            return false;
        if (bnwk1CGrandfatherflag != null ? !bnwk1CGrandfatherflag.equals(that.bnwk1CGrandfatherflag) : that.bnwk1CGrandfatherflag != null)
            return false;
        if (bndqmgDisqualmgr != null ? !bndqmgDisqualmgr.equals(that.bndqmgDisqualmgr) : that.bndqmgDisqualmgr != null)
            return false;
        if (bnwaiv4Ccwaiver != null ? !bnwaiv4Ccwaiver.equals(that.bnwaiv4Ccwaiver) : that.bnwaiv4Ccwaiver != null)
            return false;
        if (bnldbwLdrbonuswaiver != null ? !bnldbwLdrbonuswaiver.equals(that.bnldbwLdrbonuswaiver) : that.bnldbwLdrbonuswaiver != null)
            return false;
        if (bnpaypLdrbonuseligible != null ? !bnpaypLdrbonuseligible.equals(that.bnpaypLdrbonuseligible) : that.bnpaypLdrbonuseligible != null)
            return false;
        if (bnqumgLbqualified != null ? !bnqumgLbqualified.equals(that.bnqumgLbqualified) : that.bnqumgLbqualified != null)
            return false;
        if (bnpcasPersonalcasecredits != null ? !bnpcasPersonalcasecredits.equals(that.bnpcasPersonalcasecredits) : that.bnpcasPersonalcasecredits != null)
            return false;
        if (bndcasDistcasecredits != null ? !bndcasDistcasecredits.equals(that.bndcasDistcasecredits) : that.bndcasDistcasecredits != null)
            return false;
        if (bntacsTotalactivecasecredits != null ? !bntacsTotalactivecasecredits.equals(that.bntacsTotalactivecasecredits) : that.bntacsTotalactivecasecredits != null)
            return false;
        if (bnncasNonmanagercasecredits != null ? !bnncasNonmanagercasecredits.equals(that.bnncasNonmanagercasecredits) : that.bnncasNonmanagercasecredits != null)
            return false;
        if (bnneedCasecreditsneeded != null ? !bnneedCasecreditsneeded.equals(that.bnneedCasecreditsneeded) : that.bnneedCasecreditsneeded != null)
            return false;
        if (bntmgrTotalmanagers != null ? !bntmgrTotalmanagers.equals(that.bntmgrTotalmanagers) : that.bntmgrTotalmanagers != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bncoidCompanyid != null ? bncoidCompanyid.hashCode() : 0);
        result = 31 * result + (bnctlDistribitorcontrol != null ? bnctlDistribitorcontrol.hashCode() : 0);
        result = 31 * result + (bnctycCountrycode != null ? bnctycCountrycode.hashCode() : 0);
        result = 31 * result + (bndidDistributorid != null ? bndidDistributorid.hashCode() : 0);
        result = 31 * result + (bnfrdcForeigndomdist != null ? bnfrdcForeigndomdist.hashCode() : 0);
        result = 31 * result + (bnwk1CGrandfatherflag != null ? bnwk1CGrandfatherflag.hashCode() : 0);
        result = 31 * result + (bndqmgDisqualmgr != null ? bndqmgDisqualmgr.hashCode() : 0);
        result = 31 * result + (bnwaiv4Ccwaiver != null ? bnwaiv4Ccwaiver.hashCode() : 0);
        result = 31 * result + (bnldbwLdrbonuswaiver != null ? bnldbwLdrbonuswaiver.hashCode() : 0);
        result = 31 * result + (bnpaypLdrbonuseligible != null ? bnpaypLdrbonuseligible.hashCode() : 0);
        result = 31 * result + (bnqumgLbqualified != null ? bnqumgLbqualified.hashCode() : 0);
        result = 31 * result + (bnpcasPersonalcasecredits != null ? bnpcasPersonalcasecredits.hashCode() : 0);
        result = 31 * result + (bndcasDistcasecredits != null ? bndcasDistcasecredits.hashCode() : 0);
        result = 31 * result + (bntacsTotalactivecasecredits != null ? bntacsTotalactivecasecredits.hashCode() : 0);
        result = 31 * result + (bnncasNonmanagercasecredits != null ? bnncasNonmanagercasecredits.hashCode() : 0);
        result = 31 * result + (bnneedCasecreditsneeded != null ? bnneedCasecreditsneeded.hashCode() : 0);
        result = 31 * result + (bntmgrTotalmanagers != null ? bntmgrTotalmanagers.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"BomnqpMgrsNotQualForLbDailyCc\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"bncoidCompanyid\":\"" + bncoidCompanyid + "\""
                + ",                         \"bnctlDistribitorcontrol\":\"" + bnctlDistribitorcontrol + "\""
                + ",                         \"bnctycCountrycode\":\"" + bnctycCountrycode + "\""
                + ",                         \"bndidDistributorid\":\"" + bndidDistributorid + "\""
                + ",                         \"bnfrdcForeigndomdist\":\"" + bnfrdcForeigndomdist + "\""
                + ",                         \"bnwk1CGrandfatherflag\":\"" + bnwk1CGrandfatherflag + "\""
                + ",                         \"bndqmgDisqualmgr\":\"" + bndqmgDisqualmgr + "\""
                + ",                         \"bnwaiv4Ccwaiver\":\"" + bnwaiv4Ccwaiver + "\""
                + ",                         \"bnldbwLdrbonuswaiver\":\"" + bnldbwLdrbonuswaiver + "\""
                + ",                         \"bnpaypLdrbonuseligible\":\"" + bnpaypLdrbonuseligible + "\""
                + ",                         \"bnqumgLbqualified\":\"" + bnqumgLbqualified + "\""
                + ",                         \"bnpcasPersonalcasecredits\":\"" + bnpcasPersonalcasecredits + "\""
                + ",                         \"bndcasDistcasecredits\":\"" + bndcasDistcasecredits + "\""
                + ",                         \"bntacsTotalactivecasecredits\":\"" + bntacsTotalactivecasecredits + "\""
                + ",                         \"bnncasNonmanagercasecredits\":\"" + bnncasNonmanagercasecredits + "\""
                + ",                         \"bnneedCasecreditsneeded\":\"" + bnneedCasecreditsneeded + "\""
                + ",                         \"bntmgrTotalmanagers\":\"" + bntmgrTotalmanagers + "\""
                + "}}";
    }

}
