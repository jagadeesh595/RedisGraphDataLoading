package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "BWREQP_RequalificationWorkTable")
public class BwreqpRequalificationWorkTable {

    private Long id;
    private Long xctlDistCtrl;
    private String xinhmInheritedMgr;
    private String xtrfmTransferredMgr;
    private String xdqmgRecMgr;
    private Integer xlevlLevel;
    private Integer xmgrlMgrLevel;
    private String xactf2ActiveFlag;
    private BigDecimal xtcc2TotCasCre;
    private BigDecimal xnca2NonMgrCasCre;
    private BigDecimal xpca2PerCasCre;
    private BigDecimal xpuc2PushUpCasCre;
    private String xactf3ActiveFlag;
    private BigDecimal xtcc3TotCasCre;
    private BigDecimal xnca3NonMgrCasCre;
    private BigDecimal xpca3PerCasCre;
    private BigDecimal xpuc3PushUpCasCre;
    private String xactf4ActiveFlag;
    private BigDecimal xtcc4TotCasCre;
    private BigDecimal xnca4NonMgrCasCre;
    private BigDecimal xpca4PerCasCre;
    private BigDecimal xpuc4PushUpCasCre;
    private String xyrmodsqDisqualifiedYrMonth;

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
    @Column(name="XCTL_DistCtrl",nullable = false)
    public Long getXctlDistCtrl() {
        return xctlDistCtrl;
    }

    public void setXctlDistCtrl(Long xctlDistCtrl) {
        this.xctlDistCtrl = xctlDistCtrl;
    }

    @Basic
    @Column(name="XINHM_InheritedMgr",nullable = true, length = 1)
    public String getXinhmInheritedMgr() {
        return xinhmInheritedMgr;
    }

    public void setXinhmInheritedMgr(String xinhmInheritedMgr) {
        this.xinhmInheritedMgr = xinhmInheritedMgr;
    }

    @Basic
    @Column(name="XTRFM_TransferredMgr",nullable = true, length = 1)
    public String getXtrfmTransferredMgr() {
        return xtrfmTransferredMgr;
    }

    public void setXtrfmTransferredMgr(String xtrfmTransferredMgr) {
        this.xtrfmTransferredMgr = xtrfmTransferredMgr;
    }

    @Basic
    @Column(name="XDQMG_RecMgr",nullable = true, length = 1)
    public String getXdqmgRecMgr() {
        return xdqmgRecMgr;
    }

    public void setXdqmgRecMgr(String xdqmgRecMgr) {
        this.xdqmgRecMgr = xdqmgRecMgr;
    }

    @Basic
    @Column(name="XLEVL_Level",nullable = true)
    public Integer getXlevlLevel() {
        return xlevlLevel;
    }

    public void setXlevlLevel(Integer xlevlLevel) {
        this.xlevlLevel = xlevlLevel;
    }

    @Basic
    @Column(name="XMGRL_MGRLevel",nullable = true)
    public Integer getXmgrlMgrLevel() {
        return xmgrlMgrLevel;
    }

    public void setXmgrlMgrLevel(Integer xmgrlMgrLevel) {
        this.xmgrlMgrLevel = xmgrlMgrLevel;
    }

    @Basic
    @Column(name="XACTF2_ActiveFlag",nullable = true, length = 1)
    public String getXactf2ActiveFlag() {
        return xactf2ActiveFlag;
    }

    public void setXactf2ActiveFlag(String xactf2ActiveFlag) {
        this.xactf2ActiveFlag = xactf2ActiveFlag;
    }

    @Basic
    @Column(name="XTCC2_TotCasCre",nullable = false, precision = 3)
    public BigDecimal getXtcc2TotCasCre() {
        return xtcc2TotCasCre;
    }

    public void setXtcc2TotCasCre(BigDecimal xtcc2TotCasCre) {
        this.xtcc2TotCasCre = xtcc2TotCasCre;
    }

    @Basic
    @Column(name="XNCA2_NonMgrCasCre",nullable = true, precision = 3)
    public BigDecimal getXnca2NonMgrCasCre() {
        return xnca2NonMgrCasCre;
    }

    public void setXnca2NonMgrCasCre(BigDecimal xnca2NonMgrCasCre) {
        this.xnca2NonMgrCasCre = xnca2NonMgrCasCre;
    }

    @Basic
    @Column(name="XPCA2_PerCasCre",nullable = true, precision = 3)
    public BigDecimal getXpca2PerCasCre() {
        return xpca2PerCasCre;
    }

    public void setXpca2PerCasCre(BigDecimal xpca2PerCasCre) {
        this.xpca2PerCasCre = xpca2PerCasCre;
    }

    @Basic
    @Column(name="XPUC2_PushUpCasCre",nullable = true, precision = 3)
    public BigDecimal getXpuc2PushUpCasCre() {
        return xpuc2PushUpCasCre;
    }

    public void setXpuc2PushUpCasCre(BigDecimal xpuc2PushUpCasCre) {
        this.xpuc2PushUpCasCre = xpuc2PushUpCasCre;
    }

    @Basic
    @Column(name="XACTF3_ActiveFlag",nullable = true, length = 1)
    public String getXactf3ActiveFlag() {
        return xactf3ActiveFlag;
    }

    public void setXactf3ActiveFlag(String xactf3ActiveFlag) {
        this.xactf3ActiveFlag = xactf3ActiveFlag;
    }

    @Basic
    @Column(name="XTCC3_TotCasCre",nullable = false, precision = 3)
    public BigDecimal getXtcc3TotCasCre() {
        return xtcc3TotCasCre;
    }

    public void setXtcc3TotCasCre(BigDecimal xtcc3TotCasCre) {
        this.xtcc3TotCasCre = xtcc3TotCasCre;
    }

    @Basic
    @Column(name="XNCA3_NonMgrCasCre",nullable = true, precision = 3)
    public BigDecimal getXnca3NonMgrCasCre() {
        return xnca3NonMgrCasCre;
    }

    public void setXnca3NonMgrCasCre(BigDecimal xnca3NonMgrCasCre) {
        this.xnca3NonMgrCasCre = xnca3NonMgrCasCre;
    }

    @Basic
    @Column(name="XPCA3_PerCasCre",nullable = true, precision = 3)
    public BigDecimal getXpca3PerCasCre() {
        return xpca3PerCasCre;
    }

    public void setXpca3PerCasCre(BigDecimal xpca3PerCasCre) {
        this.xpca3PerCasCre = xpca3PerCasCre;
    }

    @Basic
    @Column(name="XPUC3_PushUpCasCre",nullable = true, precision = 3)
    public BigDecimal getXpuc3PushUpCasCre() {
        return xpuc3PushUpCasCre;
    }

    public void setXpuc3PushUpCasCre(BigDecimal xpuc3PushUpCasCre) {
        this.xpuc3PushUpCasCre = xpuc3PushUpCasCre;
    }

    @Basic
    @Column(name="XACTF4_ActiveFlag",nullable = true, precision = 3)
    public String getXactf4ActiveFlag() {
        return xactf4ActiveFlag;
    }

    public void setXactf4ActiveFlag(String xactf4ActiveFlag) {
        this.xactf4ActiveFlag = xactf4ActiveFlag;
    }

    @Basic
    @Column(name="XTCC4_TotCasCre",nullable = false, precision = 3)
    public BigDecimal getXtcc4TotCasCre() {
        return xtcc4TotCasCre;
    }

    public void setXtcc4TotCasCre(BigDecimal xtcc4TotCasCre) {
        this.xtcc4TotCasCre = xtcc4TotCasCre;
    }

    @Basic
    @Column(name="XNCA4_NonMgrCasCre",nullable = true, precision = 3)
    public BigDecimal getXnca4NonMgrCasCre() {
        return xnca4NonMgrCasCre;
    }

    public void setXnca4NonMgrCasCre(BigDecimal xnca4NonMgrCasCre) {
        this.xnca4NonMgrCasCre = xnca4NonMgrCasCre;
    }

    @Basic
    @Column(name="XPCA4_PerCasCre",nullable = true, precision = 3)
    public BigDecimal getXpca4PerCasCre() {
        return xpca4PerCasCre;
    }

    public void setXpca4PerCasCre(BigDecimal xpca4PerCasCre) {
        this.xpca4PerCasCre = xpca4PerCasCre;
    }

    @Basic
    @Column(name="XPUC4_PushUpCasCre",nullable = true, precision = 3)
    public BigDecimal getXpuc4PushUpCasCre() {
        return xpuc4PushUpCasCre;
    }

    public void setXpuc4PushUpCasCre(BigDecimal xpuc4PushUpCasCre) {
        this.xpuc4PushUpCasCre = xpuc4PushUpCasCre;
    }

    @Basic
    @Column(name="XYRMODSQ_DisqualifiedYrMonth",nullable = true, length = 50)
    public String getXyrmodsqDisqualifiedYrMonth() {
        return xyrmodsqDisqualifiedYrMonth;
    }

    public void setXyrmodsqDisqualifiedYrMonth(String xyrmodsqDisqualifiedYrMonth) {
        this.xyrmodsqDisqualifiedYrMonth = xyrmodsqDisqualifiedYrMonth;
    }


    @Override
    public String toString() {
        return "BwreqpRequalificationWorkTable{" +
                "id=" + id +
                ", xctlDistCtrl=" + xctlDistCtrl +
                ", xinhmInheritedMgr='" + xinhmInheritedMgr + '\'' +
                ", xtrfmTransferredMgr='" + xtrfmTransferredMgr + '\'' +
                ", xdqmgRecMgr='" + xdqmgRecMgr + '\'' +
                ", xlevlLevel=" + xlevlLevel +
                ", xmgrlMgrLevel=" + xmgrlMgrLevel +
                ", xactf2ActiveFlag='" + xactf2ActiveFlag + '\'' +
                ", xtcc2TotCasCre=" + xtcc2TotCasCre +
                ", xnca2NonMgrCasCre=" + xnca2NonMgrCasCre +
                ", xpca2PerCasCre=" + xpca2PerCasCre +
                ", xpuc2PushUpCasCre=" + xpuc2PushUpCasCre +
                ", xactf3ActiveFlag='" + xactf3ActiveFlag + '\'' +
                ", xtcc3TotCasCre=" + xtcc3TotCasCre +
                ", xnca3NonMgrCasCre=" + xnca3NonMgrCasCre +
                ", xpca3PerCasCre=" + xpca3PerCasCre +
                ", xpuc3PushUpCasCre=" + xpuc3PushUpCasCre +
                ", xactf4ActiveFlag='" + xactf4ActiveFlag + '\'' +
                ", xtcc4TotCasCre=" + xtcc4TotCasCre +
                ", xnca4NonMgrCasCre=" + xnca4NonMgrCasCre +
                ", xpca4PerCasCre=" + xpca4PerCasCre +
                ", xpuc4PushUpCasCre=" + xpuc4PushUpCasCre +
                ", xyrmodsqDisqualifiedYrMonth='" + xyrmodsqDisqualifiedYrMonth + '\'' +
                '}';
    }
}
