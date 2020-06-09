package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by rpalamakula on 16-08-2017.
 */
@Entity
@Table(name = "DSLEVP_DistributorLevels")
public class DslevpDistributorLevels {
    private Long id;
    private Integer dllevlLevel;
    private Integer dlmgrlMgrLev;
    private Integer dlgmlvGemLev;
    private String dldescLevDesc;
    private String dlsdscShortDesc;
    private String dlabbrAbbr;
    private BigDecimal dlccrdMoveUpCc;
    private BigDecimal dlbonpBonPer;
    private Integer dlsmgrNoOfFrstGenMgr;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DLLEVL_Level", nullable = true)
    public Integer getDllevlLevel() {
        return dllevlLevel;
    }

    public void setDllevlLevel(Integer dllevlLevel) {
        this.dllevlLevel = dllevlLevel;
    }

    @Basic
    @Column(name = "DLMGRL_MgrLev", nullable = true)
    public Integer getDlmgrlMgrLev() {
        return dlmgrlMgrLev;
    }

    public void setDlmgrlMgrLev(Integer dlmgrlMgrLev) {
        this.dlmgrlMgrLev = dlmgrlMgrLev;
    }

    @Basic
    @Column(name = "DLGMLV_GemLev", nullable = true)
    public Integer getDlgmlvGemLev() {
        return dlgmlvGemLev;
    }

    public void setDlgmlvGemLev(Integer dlgmlvGemLev) {
        this.dlgmlvGemLev = dlgmlvGemLev;
    }

    @Basic
    @Column(name = "DLDESC_LevDesc", nullable = true, length = 255)
    public String getDldescLevDesc() {
        return dldescLevDesc;
    }

    public void setDldescLevDesc(String dldescLevDesc) {
        this.dldescLevDesc = dldescLevDesc;
    }

    @Basic
    @Column(name = "DLSDSC_ShortDesc", nullable = true, length = 255)
    public String getDlsdscShortDesc() {
        return dlsdscShortDesc;
    }

    public void setDlsdscShortDesc(String dlsdscShortDesc) {
        this.dlsdscShortDesc = dlsdscShortDesc;
    }

    @Basic
    @Column(name = "DLABBR_Abbr", nullable = true, length = 255)
    public String getDlabbrAbbr() {
        return dlabbrAbbr;
    }

    public void setDlabbrAbbr(String dlabbrAbbr) {
        this.dlabbrAbbr = dlabbrAbbr;
    }

    @Basic
    @Column(name = "DLCCRD_MoveUpCC", nullable = true, precision = 3)
    public BigDecimal getDlccrdMoveUpCc() {
        return dlccrdMoveUpCc;
    }

    public void setDlccrdMoveUpCc(BigDecimal dlccrdMoveUpCc) {
        this.dlccrdMoveUpCc = dlccrdMoveUpCc;
    }

    @Basic
    @Column(name = "DLBONP_BonPer", nullable = true, precision = 3)
    public BigDecimal getDlbonpBonPer() {
        return dlbonpBonPer;
    }

    public void setDlbonpBonPer(BigDecimal dlbonpBonPer) {
        this.dlbonpBonPer = dlbonpBonPer;
    }

    @Basic
    @Column(name = "DLSMGR_NoOfFrstGenMgr", nullable = true)
    public Integer getDlsmgrNoOfFrstGenMgr() {
        return dlsmgrNoOfFrstGenMgr;
    }

    public void setDlsmgrNoOfFrstGenMgr(Integer dlsmgrNoOfFrstGenMgr) {
        this.dlsmgrNoOfFrstGenMgr = dlsmgrNoOfFrstGenMgr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DslevpDistributorLevels that = (DslevpDistributorLevels) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dllevlLevel != null ? !dllevlLevel.equals(that.dllevlLevel) : that.dllevlLevel != null) return false;
        if (dlmgrlMgrLev != null ? !dlmgrlMgrLev.equals(that.dlmgrlMgrLev) : that.dlmgrlMgrLev != null) return false;
        if (dlgmlvGemLev != null ? !dlgmlvGemLev.equals(that.dlgmlvGemLev) : that.dlgmlvGemLev != null) return false;
        if (dldescLevDesc != null ? !dldescLevDesc.equals(that.dldescLevDesc) : that.dldescLevDesc != null)
            return false;
        if (dlsdscShortDesc != null ? !dlsdscShortDesc.equals(that.dlsdscShortDesc) : that.dlsdscShortDesc != null)
            return false;
        if (dlabbrAbbr != null ? !dlabbrAbbr.equals(that.dlabbrAbbr) : that.dlabbrAbbr != null) return false;
        if (dlccrdMoveUpCc != null ? !dlccrdMoveUpCc.equals(that.dlccrdMoveUpCc) : that.dlccrdMoveUpCc != null)
            return false;
        if (dlbonpBonPer != null ? !dlbonpBonPer.equals(that.dlbonpBonPer) : that.dlbonpBonPer != null) return false;
        if (dlsmgrNoOfFrstGenMgr != null ? !dlsmgrNoOfFrstGenMgr.equals(that.dlsmgrNoOfFrstGenMgr) : that.dlsmgrNoOfFrstGenMgr != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dllevlLevel != null ? dllevlLevel.hashCode() : 0);
        result = 31 * result + (dlmgrlMgrLev != null ? dlmgrlMgrLev.hashCode() : 0);
        result = 31 * result + (dlgmlvGemLev != null ? dlgmlvGemLev.hashCode() : 0);
        result = 31 * result + (dldescLevDesc != null ? dldescLevDesc.hashCode() : 0);
        result = 31 * result + (dlsdscShortDesc != null ? dlsdscShortDesc.hashCode() : 0);
        result = 31 * result + (dlabbrAbbr != null ? dlabbrAbbr.hashCode() : 0);
        result = 31 * result + (dlccrdMoveUpCc != null ? dlccrdMoveUpCc.hashCode() : 0);
        result = 31 * result + (dlbonpBonPer != null ? dlbonpBonPer.hashCode() : 0);
        result = 31 * result + (dlsmgrNoOfFrstGenMgr != null ? dlsmgrNoOfFrstGenMgr.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"DslevpDistributorLevels\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"dllevlLevel\":\"" + dllevlLevel + "\""
                + ",                         \"dlmgrlMgrLev\":\"" + dlmgrlMgrLev + "\""
                + ",                         \"dlgmlvGemLev\":\"" + dlgmlvGemLev + "\""
                + ",                         \"dldescLevDesc\":\"" + dldescLevDesc + "\""
                + ",                         \"dlsdscShortDesc\":\"" + dlsdscShortDesc + "\""
                + ",                         \"dlabbrAbbr\":\"" + dlabbrAbbr + "\""
                + ",                         \"dlccrdMoveUpCc\":\"" + dlccrdMoveUpCc + "\""
                + ",                         \"dlbonpBonPer\":\"" + dlbonpBonPer + "\""
                + ",                         \"dlsmgrNoOfFrstGenMgr\":\"" + dlsmgrNoOfFrstGenMgr + "\""
                + "}}";
    }
}
