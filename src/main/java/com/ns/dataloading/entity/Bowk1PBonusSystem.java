package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "BOWK1P_BonusSystem")
public class Bowk1PBonusSystem {
    private Long id;
    private String bwcoidCompany;
    private String bwdivDivision;
    private Long bwareaArea;
    private Long bwctlDistributorControl;
    private Long bwctycCountryCode;
    private Long bwdidDistributorId;
    private BigDecimal bwjanpJanPerCc;
    private BigDecimal bwfebpFebPerCc;
    private BigDecimal bwmarpMarPerCc;
    private BigDecimal bwaprpAprPerCc;
    private BigDecimal bwmaypMayPerCc;
    private BigDecimal bwjunpJunPerCc;
    private BigDecimal bwjlypJlyPerCc;
    private BigDecimal bwaugpAugPerCc;
    private BigDecimal bwseppSepPerCc;
    private BigDecimal bwoctpOctPerCc;
    private BigDecimal bwnovpNovPerCc;
    private BigDecimal bwdecpDecPerCc;
    private BigDecimal bwjandJanDistCc;
    private BigDecimal bwfebdFebDistCc;
    private BigDecimal bwmardMarDistCc;
    private BigDecimal bwaprdAprDistCc;
    private BigDecimal bwmaydMayDistCc;
    private BigDecimal bwjundJunDistCc;
    private BigDecimal bwjlydJlyDistCc;
    private BigDecimal bwaugdAugDistCc;
    private BigDecimal bwsepdSepDistCc;
    private BigDecimal bwoctdOctDistCc;
    private BigDecimal bwnovdNovDistCc;
    private BigDecimal bwdecdDecDistCc;
    private BigDecimal bwjannJanNonMgrCc;
    private BigDecimal bwfebnFebNonMgrCc;
    private BigDecimal bwmarnMarNonMgrCc;
    private BigDecimal bwaprnAprNonMgrCc;
    private BigDecimal bwmaynMayNonMgrCc;
    private BigDecimal bwjunnJunNonMgrCc;
    private BigDecimal bwjlynJlyNonMgrCc;
    private BigDecimal bwaugnAugNonMgrCc;
    private BigDecimal bwsepnSepNonMgrCc;
    private BigDecimal bwoctnOctNonMgrCc;
    private BigDecimal bwnovnNovNonMgrCc;
    private BigDecimal bwdecnDecNonMgrCc;
    private BigDecimal bwjantJanTotalCc;
    private BigDecimal bwfebtFebTotalCc;
    private BigDecimal bwmartMarTotalCc;
    private BigDecimal bwaprtAprTotalCc;
    private BigDecimal bwmaytMayTotalCc;
    private BigDecimal bwjuntJunTotalCc;
    private BigDecimal bwjlytJlyTotalCc;
    private BigDecimal bwaugtAugTotalCc;
    private BigDecimal bwseptSepTotalCc;
    private BigDecimal bwocttOctTotalCc;
    private BigDecimal bwnovtNovTotalCc;
    private BigDecimal bwdectDecTotalCc;
    private BigDecimal bwtpccTotalPerCc;
    private BigDecimal bwtdccTotalDistCc;
    private BigDecimal bwtnccTotalNonMgrCc;
    private BigDecimal bwttccTotalCc;

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
    @Column(name = "BWCOID_Company", nullable = true, length = 15)
    public String getBwcoidCompany() {
        return bwcoidCompany;
    }

    public void setBwcoidCompany(String bwcoidCompany) {
        this.bwcoidCompany = bwcoidCompany;
    }

    @Basic
    @Column(name = "BWDIV_Division", nullable = true, length = 15)
    public String getBwdivDivision() {
        return bwdivDivision;
    }

    public void setBwdivDivision(String bwdivDivision) {
        this.bwdivDivision = bwdivDivision;
    }

    @Basic
    @Column(name = "BWAREA_Area", nullable = true)
    public Long getBwareaArea() {
        return bwareaArea;
    }

    public void setBwareaArea(Long bwareaArea) {
        this.bwareaArea = bwareaArea;
    }

    @Basic
    @Column(name = "BWCTL_DistributorControl", nullable = false)
    public Long getBwctlDistributorControl() {
        return bwctlDistributorControl;
    }

    public void setBwctlDistributorControl(Long bwctlDistributorControl) {
        this.bwctlDistributorControl = bwctlDistributorControl;
    }

    @Basic
    @Column(name = "BWCTYC_CountryCode", nullable = true)
    public Long getBwctycCountryCode() {
        return bwctycCountryCode;
    }

    public void setBwctycCountryCode(Long bwctycCountryCode) {
        this.bwctycCountryCode = bwctycCountryCode;
    }

    @Basic
    @Column(name = "BWDID_DistributorId", nullable = true)
    public Long getBwdidDistributorId() {
        return bwdidDistributorId;
    }

    public void setBwdidDistributorId(Long bwdidDistributorId) {
        this.bwdidDistributorId = bwdidDistributorId;
    }

    @Basic
    @Column(name = "BWJANP_JanPerCc", nullable = true, precision = 3)
    public BigDecimal getBwjanpJanPerCc() {
        return bwjanpJanPerCc;
    }

    public void setBwjanpJanPerCc(BigDecimal bwjanpJanPerCc) {
        this.bwjanpJanPerCc = bwjanpJanPerCc;
    }

    @Basic
    @Column(name = "BWFEBP_FebPerCc", nullable = true, precision = 3)
    public BigDecimal getBwfebpFebPerCc() {
        return bwfebpFebPerCc;
    }

    public void setBwfebpFebPerCc(BigDecimal bwfebpFebPerCc) {
        this.bwfebpFebPerCc = bwfebpFebPerCc;
    }

    @Basic
    @Column(name = "BWMARP_MarPerCc", nullable = true, precision = 3)
    public BigDecimal getBwmarpMarPerCc() {
        return bwmarpMarPerCc;
    }

    public void setBwmarpMarPerCc(BigDecimal bwmarpMarPerCc) {
        this.bwmarpMarPerCc = bwmarpMarPerCc;
    }

    @Basic
    @Column(name = "BWAPRP_AprPerCc", nullable = true, precision = 3)
    public BigDecimal getBwaprpAprPerCc() {
        return bwaprpAprPerCc;
    }

    public void setBwaprpAprPerCc(BigDecimal bwaprpAprPerCc) {
        this.bwaprpAprPerCc = bwaprpAprPerCc;
    }

    @Basic
    @Column(name = "BWMAYP_MayPerCc", nullable = true, precision = 3)
    public BigDecimal getBwmaypMayPerCc() {
        return bwmaypMayPerCc;
    }

    public void setBwmaypMayPerCc(BigDecimal bwmaypMayPerCc) {
        this.bwmaypMayPerCc = bwmaypMayPerCc;
    }

    @Basic
    @Column(name = "BWJUNP_JunPerCc", nullable = true, precision = 3)
    public BigDecimal getBwjunpJunPerCc() {
        return bwjunpJunPerCc;
    }

    public void setBwjunpJunPerCc(BigDecimal bwjunpJunPerCc) {
        this.bwjunpJunPerCc = bwjunpJunPerCc;
    }

    @Basic
    @Column(name = "BWJLYP_JLYPerCc", nullable = true, precision = 3)
    public BigDecimal getBwjlypJlyPerCc() {
        return bwjlypJlyPerCc;
    }

    public void setBwjlypJlyPerCc(BigDecimal bwjlypJlyPerCc) {
        this.bwjlypJlyPerCc = bwjlypJlyPerCc;
    }

    @Basic
    @Column(name = "BWAUGP_AugPerCc", nullable = true, precision = 3)
    public BigDecimal getBwaugpAugPerCc() {
        return bwaugpAugPerCc;
    }

    public void setBwaugpAugPerCc(BigDecimal bwaugpAugPerCc) {
        this.bwaugpAugPerCc = bwaugpAugPerCc;
    }

    @Basic
    @Column(name = "BWSEPP_SepPerCc", nullable = true, precision = 3)
    public BigDecimal getBwseppSepPerCc() {
        return bwseppSepPerCc;
    }

    public void setBwseppSepPerCc(BigDecimal bwseppSepPerCc) {
        this.bwseppSepPerCc = bwseppSepPerCc;
    }

    @Basic
    @Column(name = "BWOCTP_OctPerCc", nullable = true, precision = 3)
    public BigDecimal getBwoctpOctPerCc() {
        return bwoctpOctPerCc;
    }

    public void setBwoctpOctPerCc(BigDecimal bwoctpOctPerCc) {
        this.bwoctpOctPerCc = bwoctpOctPerCc;
    }

    @Basic
    @Column(name = "BWNOVP_NovPerCc", nullable = true, precision = 3)
    public BigDecimal getBwnovpNovPerCc() {
        return bwnovpNovPerCc;
    }

    public void setBwnovpNovPerCc(BigDecimal bwnovpNovPerCc) {
        this.bwnovpNovPerCc = bwnovpNovPerCc;
    }

    @Basic
    @Column(name = "BWDECP_DecPerCc", nullable = true, precision = 3)
    public BigDecimal getBwdecpDecPerCc() {
        return bwdecpDecPerCc;
    }

    public void setBwdecpDecPerCc(BigDecimal bwdecpDecPerCc) {
        this.bwdecpDecPerCc = bwdecpDecPerCc;
    }

    @Basic
    @Column(name = "BWJAND_JanDistCc", nullable = true, precision = 3)
    public BigDecimal getBwjandJanDistCc() {
        return bwjandJanDistCc;
    }

    public void setBwjandJanDistCc(BigDecimal bwjandJanDistCc) {
        this.bwjandJanDistCc = bwjandJanDistCc;
    }

    @Basic
    @Column(name = "BWFEBD_FebDistCc", nullable = true, precision = 3)
    public BigDecimal getBwfebdFebDistCc() {
        return bwfebdFebDistCc;
    }

    public void setBwfebdFebDistCc(BigDecimal bwfebdFebDistCc) {
        this.bwfebdFebDistCc = bwfebdFebDistCc;
    }

    @Basic
    @Column(name = "BWMARD_MarDistCc", nullable = true, precision = 3)
    public BigDecimal getBwmardMarDistCc() {
        return bwmardMarDistCc;
    }

    public void setBwmardMarDistCc(BigDecimal bwmardMarDistCc) {
        this.bwmardMarDistCc = bwmardMarDistCc;
    }

    @Basic
    @Column(name = "BWAPRD_AprDistCc", nullable = true, precision = 3)
    public BigDecimal getBwaprdAprDistCc() {
        return bwaprdAprDistCc;
    }

    public void setBwaprdAprDistCc(BigDecimal bwaprdAprDistCc) {
        this.bwaprdAprDistCc = bwaprdAprDistCc;
    }

    @Basic
    @Column(name = "BWMAYD_MayDistCc", nullable = true, precision = 3)
    public BigDecimal getBwmaydMayDistCc() {
        return bwmaydMayDistCc;
    }

    public void setBwmaydMayDistCc(BigDecimal bwmaydMayDistCc) {
        this.bwmaydMayDistCc = bwmaydMayDistCc;
    }

    @Basic
    @Column(name = "BWJUND_JunDistCc", nullable = true, precision = 3)
    public BigDecimal getBwjundJunDistCc() {
        return bwjundJunDistCc;
    }

    public void setBwjundJunDistCc(BigDecimal bwjundJunDistCc) {
        this.bwjundJunDistCc = bwjundJunDistCc;
    }

    @Basic
    @Column(name = "BWJLYD_JLYDistCc", nullable = true, precision = 3)
    public BigDecimal getBwjlydJlyDistCc() {
        return bwjlydJlyDistCc;
    }

    public void setBwjlydJlyDistCc(BigDecimal bwjlydJlyDistCc) {
        this.bwjlydJlyDistCc = bwjlydJlyDistCc;
    }

    @Basic
    @Column(name = "BWAUGD_AugDistCc", nullable = true, precision = 3)
    public BigDecimal getBwaugdAugDistCc() {
        return bwaugdAugDistCc;
    }

    public void setBwaugdAugDistCc(BigDecimal bwaugdAugDistCc) {
        this.bwaugdAugDistCc = bwaugdAugDistCc;
    }

    @Basic
    @Column(name = "BWSEPD_SepDistCc", nullable = true, precision = 3)
    public BigDecimal getBwsepdSepDistCc() {
        return bwsepdSepDistCc;
    }

    public void setBwsepdSepDistCc(BigDecimal bwsepdSepDistCc) {
        this.bwsepdSepDistCc = bwsepdSepDistCc;
    }

    @Basic
    @Column(name = "BWOCTD_OctDistCc", nullable = true, precision = 3)
    public BigDecimal getBwoctdOctDistCc() {
        return bwoctdOctDistCc;
    }

    public void setBwoctdOctDistCc(BigDecimal bwoctdOctDistCc) {
        this.bwoctdOctDistCc = bwoctdOctDistCc;
    }

    @Basic
    @Column(name = "BWNOVD_NovDistCc", nullable = true, precision = 3)
    public BigDecimal getBwnovdNovDistCc() {
        return bwnovdNovDistCc;
    }

    public void setBwnovdNovDistCc(BigDecimal bwnovdNovDistCc) {
        this.bwnovdNovDistCc = bwnovdNovDistCc;
    }

    @Basic
    @Column(name = "BWDECD_DecDistCc", nullable = true, precision = 3)
    public BigDecimal getBwdecdDecDistCc() {
        return bwdecdDecDistCc;
    }

    public void setBwdecdDecDistCc(BigDecimal bwdecdDecDistCc) {
        this.bwdecdDecDistCc = bwdecdDecDistCc;
    }

    @Basic
    @Column(name = "BWJANN_JanNonMgrCc", nullable = true, precision = 3)
    public BigDecimal getBwjannJanNonMgrCc() {
        return bwjannJanNonMgrCc;
    }

    public void setBwjannJanNonMgrCc(BigDecimal bwjannJanNonMgrCc) {
        this.bwjannJanNonMgrCc = bwjannJanNonMgrCc;
    }

    @Basic
    @Column(name = "BWFEBN_FebNonMgrCc", nullable = true, precision = 3)
    public BigDecimal getBwfebnFebNonMgrCc() {
        return bwfebnFebNonMgrCc;
    }

    public void setBwfebnFebNonMgrCc(BigDecimal bwfebnFebNonMgrCc) {
        this.bwfebnFebNonMgrCc = bwfebnFebNonMgrCc;
    }

    @Basic
    @Column(name = "BWMARN_MarNonMgrCc", nullable = true, precision = 3)
    public BigDecimal getBwmarnMarNonMgrCc() {
        return bwmarnMarNonMgrCc;
    }

    public void setBwmarnMarNonMgrCc(BigDecimal bwmarnMarNonMgrCc) {
        this.bwmarnMarNonMgrCc = bwmarnMarNonMgrCc;
    }

    @Basic
    @Column(name = "BWAPRN_AprNonMgrCc", nullable = true, precision = 3)
    public BigDecimal getBwaprnAprNonMgrCc() {
        return bwaprnAprNonMgrCc;
    }

    public void setBwaprnAprNonMgrCc(BigDecimal bwaprnAprNonMgrCc) {
        this.bwaprnAprNonMgrCc = bwaprnAprNonMgrCc;
    }

    @Basic
    @Column(name = "BWMAYN_MayNonMgrCc", nullable = true, precision = 3)
    public BigDecimal getBwmaynMayNonMgrCc() {
        return bwmaynMayNonMgrCc;
    }

    public void setBwmaynMayNonMgrCc(BigDecimal bwmaynMayNonMgrCc) {
        this.bwmaynMayNonMgrCc = bwmaynMayNonMgrCc;
    }

    @Basic
    @Column(name = "BWJUNN_JunNonMgrCc", nullable = true, precision = 3)
    public BigDecimal getBwjunnJunNonMgrCc() {
        return bwjunnJunNonMgrCc;
    }

    public void setBwjunnJunNonMgrCc(BigDecimal bwjunnJunNonMgrCc) {
        this.bwjunnJunNonMgrCc = bwjunnJunNonMgrCc;
    }

    @Basic
    @Column(name = "BWJLYN_JLYNonMgrCc", nullable = true, precision = 3)
    public BigDecimal getBwjlynJlyNonMgrCc() {
        return bwjlynJlyNonMgrCc;
    }

    public void setBwjlynJlyNonMgrCc(BigDecimal bwjlynJlyNonMgrCc) {
        this.bwjlynJlyNonMgrCc = bwjlynJlyNonMgrCc;
    }

    @Basic
    @Column(name = "BWAUGN_AugNonMgrCc", nullable = true, precision = 3)
    public BigDecimal getBwaugnAugNonMgrCc() {
        return bwaugnAugNonMgrCc;
    }

    public void setBwaugnAugNonMgrCc(BigDecimal bwaugnAugNonMgrCc) {
        this.bwaugnAugNonMgrCc = bwaugnAugNonMgrCc;
    }

    @Basic
    @Column(name = "BWSEPN_SepNonMgrCc", nullable = true, precision = 3)
    public BigDecimal getBwsepnSepNonMgrCc() {
        return bwsepnSepNonMgrCc;
    }

    public void setBwsepnSepNonMgrCc(BigDecimal bwsepnSepNonMgrCc) {
        this.bwsepnSepNonMgrCc = bwsepnSepNonMgrCc;
    }

    @Basic
    @Column(name = "BWOCTN_OctNonMgrCc", nullable = true, precision = 3)
    public BigDecimal getBwoctnOctNonMgrCc() {
        return bwoctnOctNonMgrCc;
    }

    public void setBwoctnOctNonMgrCc(BigDecimal bwoctnOctNonMgrCc) {
        this.bwoctnOctNonMgrCc = bwoctnOctNonMgrCc;
    }

    @Basic
    @Column(name = "BWNOVN_NovNonMgrCc", nullable = true, precision = 3)
    public BigDecimal getBwnovnNovNonMgrCc() {
        return bwnovnNovNonMgrCc;
    }

    public void setBwnovnNovNonMgrCc(BigDecimal bwnovnNovNonMgrCc) {
        this.bwnovnNovNonMgrCc = bwnovnNovNonMgrCc;
    }

    @Basic
    @Column(name = "BWDECN_DecNonMgrCc", nullable = true, precision = 3)
    public BigDecimal getBwdecnDecNonMgrCc() {
        return bwdecnDecNonMgrCc;
    }

    public void setBwdecnDecNonMgrCc(BigDecimal bwdecnDecNonMgrCc) {
        this.bwdecnDecNonMgrCc = bwdecnDecNonMgrCc;
    }

    @Basic
    @Column(name = "BWJANT_JanTotalCc", nullable = true, precision = 3)
    public BigDecimal getBwjantJanTotalCc() {
        return bwjantJanTotalCc;
    }

    public void setBwjantJanTotalCc(BigDecimal bwjantJanTotalCc) {
        this.bwjantJanTotalCc = bwjantJanTotalCc;
    }

    @Basic
    @Column(name = "BWFEBT_FebTotalCc", nullable = true, precision = 3)
    public BigDecimal getBwfebtFebTotalCc() {
        return bwfebtFebTotalCc;
    }

    public void setBwfebtFebTotalCc(BigDecimal bwfebtFebTotalCc) {
        this.bwfebtFebTotalCc = bwfebtFebTotalCc;
    }

    @Basic
    @Column(name = "BWMART_MarTotalCc", nullable = true, precision = 3)
    public BigDecimal getBwmartMarTotalCc() {
        return bwmartMarTotalCc;
    }

    public void setBwmartMarTotalCc(BigDecimal bwmartMarTotalCc) {
        this.bwmartMarTotalCc = bwmartMarTotalCc;
    }

    @Basic
    @Column(name = "BWAPRT_AprTotalCc", nullable = true, precision = 3)
    public BigDecimal getBwaprtAprTotalCc() {
        return bwaprtAprTotalCc;
    }

    public void setBwaprtAprTotalCc(BigDecimal bwaprtAprTotalCc) {
        this.bwaprtAprTotalCc = bwaprtAprTotalCc;
    }

    @Basic
    @Column(name = "BWMAYT_MayTotalCc", nullable = true, precision = 3)
    public BigDecimal getBwmaytMayTotalCc() {
        return bwmaytMayTotalCc;
    }

    public void setBwmaytMayTotalCc(BigDecimal bwmaytMayTotalCc) {
        this.bwmaytMayTotalCc = bwmaytMayTotalCc;
    }

    @Basic
    @Column(name = "BWJUNT_JunTotalCc", nullable = true, precision = 3)
    public BigDecimal getBwjuntJunTotalCc() {
        return bwjuntJunTotalCc;
    }

    public void setBwjuntJunTotalCc(BigDecimal bwjuntJunTotalCc) {
        this.bwjuntJunTotalCc = bwjuntJunTotalCc;
    }

    @Basic
    @Column(name = "BWJLYT_JLYTotalCc", nullable = true, precision = 3)
    public BigDecimal getBwjlytJlyTotalCc() {
        return bwjlytJlyTotalCc;
    }

    public void setBwjlytJlyTotalCc(BigDecimal bwjlytJlyTotalCc) {
        this.bwjlytJlyTotalCc = bwjlytJlyTotalCc;
    }

    @Basic
    @Column(name = "BWAUGT_AugTotalCc", nullable = true, precision = 3)
    public BigDecimal getBwaugtAugTotalCc() {
        return bwaugtAugTotalCc;
    }

    public void setBwaugtAugTotalCc(BigDecimal bwaugtAugTotalCc) {
        this.bwaugtAugTotalCc = bwaugtAugTotalCc;
    }

    @Basic
    @Column(name = "BWSEPT_SepTotalCc", nullable = true, precision = 3)
    public BigDecimal getBwseptSepTotalCc() {
        return bwseptSepTotalCc;
    }

    public void setBwseptSepTotalCc(BigDecimal bwseptSepTotalCc) {
        this.bwseptSepTotalCc = bwseptSepTotalCc;
    }

    @Basic
    @Column(name = "BWOCTT_OctTotalCc", nullable = true, precision = 3)
    public BigDecimal getBwocttOctTotalCc() {
        return bwocttOctTotalCc;
    }

    public void setBwocttOctTotalCc(BigDecimal bwocttOctTotalCc) {
        this.bwocttOctTotalCc = bwocttOctTotalCc;
    }

    @Basic
    @Column(name = "BWNOVT_NovTotalCc", nullable = true, precision = 3)
    public BigDecimal getBwnovtNovTotalCc() {
        return bwnovtNovTotalCc;
    }

    public void setBwnovtNovTotalCc(BigDecimal bwnovtNovTotalCc) {
        this.bwnovtNovTotalCc = bwnovtNovTotalCc;
    }

    @Basic
    @Column(name = "BWDECT_DecTotalCc", nullable = true, precision = 3)
    public BigDecimal getBwdectDecTotalCc() {
        return bwdectDecTotalCc;
    }

    public void setBwdectDecTotalCc(BigDecimal bwdectDecTotalCc) {
        this.bwdectDecTotalCc = bwdectDecTotalCc;
    }

    @Basic
    @Column(name = "BWTPCC_TotalPerCc", nullable = true, precision = 3)
    public BigDecimal getBwtpccTotalPerCc() {
        return bwtpccTotalPerCc;
    }

    public void setBwtpccTotalPerCc(BigDecimal bwtpccTotalPerCc) {
        this.bwtpccTotalPerCc = bwtpccTotalPerCc;
    }

    @Basic
    @Column(name = "BWTDCC_TotalDistCc", nullable = true, precision = 3)
    public BigDecimal getBwtdccTotalDistCc() {
        return bwtdccTotalDistCc;
    }

    public void setBwtdccTotalDistCc(BigDecimal bwtdccTotalDistCc) {
        this.bwtdccTotalDistCc = bwtdccTotalDistCc;
    }

    @Basic
    @Column(name = "BWTNCC_TotalNonMgrCc", nullable = true, precision = 3)
    public BigDecimal getBwtnccTotalNonMgrCc() {
        return bwtnccTotalNonMgrCc;
    }

    public void setBwtnccTotalNonMgrCc(BigDecimal bwtnccTotalNonMgrCc) {
        this.bwtnccTotalNonMgrCc = bwtnccTotalNonMgrCc;
    }

    @Basic
    @Column(name = "BWTTCC_TotalCc", nullable = true, precision = 3)
    public BigDecimal getBwttccTotalCc() {
        return bwttccTotalCc;
    }

    public void setBwttccTotalCc(BigDecimal bwttccTotalCc) {
        this.bwttccTotalCc = bwttccTotalCc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bowk1PBonusSystem that = (Bowk1PBonusSystem) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bwcoidCompany != null ? !bwcoidCompany.equals(that.bwcoidCompany) : that.bwcoidCompany != null)
            return false;
        if (bwdivDivision != null ? !bwdivDivision.equals(that.bwdivDivision) : that.bwdivDivision != null)
            return false;
        if (bwareaArea != null ? !bwareaArea.equals(that.bwareaArea) : that.bwareaArea != null) return false;
        if (bwctlDistributorControl != null ? !bwctlDistributorControl.equals(that.bwctlDistributorControl) : that.bwctlDistributorControl != null)
            return false;
        if (bwctycCountryCode != null ? !bwctycCountryCode.equals(that.bwctycCountryCode) : that.bwctycCountryCode != null)
            return false;
        if (bwdidDistributorId != null ? !bwdidDistributorId.equals(that.bwdidDistributorId) : that.bwdidDistributorId != null)
            return false;
        if (bwjanpJanPerCc != null ? !bwjanpJanPerCc.equals(that.bwjanpJanPerCc) : that.bwjanpJanPerCc != null)
            return false;
        if (bwfebpFebPerCc != null ? !bwfebpFebPerCc.equals(that.bwfebpFebPerCc) : that.bwfebpFebPerCc != null)
            return false;
        if (bwmarpMarPerCc != null ? !bwmarpMarPerCc.equals(that.bwmarpMarPerCc) : that.bwmarpMarPerCc != null)
            return false;
        if (bwaprpAprPerCc != null ? !bwaprpAprPerCc.equals(that.bwaprpAprPerCc) : that.bwaprpAprPerCc != null)
            return false;
        if (bwmaypMayPerCc != null ? !bwmaypMayPerCc.equals(that.bwmaypMayPerCc) : that.bwmaypMayPerCc != null)
            return false;
        if (bwjunpJunPerCc != null ? !bwjunpJunPerCc.equals(that.bwjunpJunPerCc) : that.bwjunpJunPerCc != null)
            return false;
        if (bwjlypJlyPerCc != null ? !bwjlypJlyPerCc.equals(that.bwjlypJlyPerCc) : that.bwjlypJlyPerCc != null)
            return false;
        if (bwaugpAugPerCc != null ? !bwaugpAugPerCc.equals(that.bwaugpAugPerCc) : that.bwaugpAugPerCc != null)
            return false;
        if (bwseppSepPerCc != null ? !bwseppSepPerCc.equals(that.bwseppSepPerCc) : that.bwseppSepPerCc != null)
            return false;
        if (bwoctpOctPerCc != null ? !bwoctpOctPerCc.equals(that.bwoctpOctPerCc) : that.bwoctpOctPerCc != null)
            return false;
        if (bwnovpNovPerCc != null ? !bwnovpNovPerCc.equals(that.bwnovpNovPerCc) : that.bwnovpNovPerCc != null)
            return false;
        if (bwdecpDecPerCc != null ? !bwdecpDecPerCc.equals(that.bwdecpDecPerCc) : that.bwdecpDecPerCc != null)
            return false;
        if (bwjandJanDistCc != null ? !bwjandJanDistCc.equals(that.bwjandJanDistCc) : that.bwjandJanDistCc != null)
            return false;
        if (bwfebdFebDistCc != null ? !bwfebdFebDistCc.equals(that.bwfebdFebDistCc) : that.bwfebdFebDistCc != null)
            return false;
        if (bwmardMarDistCc != null ? !bwmardMarDistCc.equals(that.bwmardMarDistCc) : that.bwmardMarDistCc != null)
            return false;
        if (bwaprdAprDistCc != null ? !bwaprdAprDistCc.equals(that.bwaprdAprDistCc) : that.bwaprdAprDistCc != null)
            return false;
        if (bwmaydMayDistCc != null ? !bwmaydMayDistCc.equals(that.bwmaydMayDistCc) : that.bwmaydMayDistCc != null)
            return false;
        if (bwjundJunDistCc != null ? !bwjundJunDistCc.equals(that.bwjundJunDistCc) : that.bwjundJunDistCc != null)
            return false;
        if (bwjlydJlyDistCc != null ? !bwjlydJlyDistCc.equals(that.bwjlydJlyDistCc) : that.bwjlydJlyDistCc != null)
            return false;
        if (bwaugdAugDistCc != null ? !bwaugdAugDistCc.equals(that.bwaugdAugDistCc) : that.bwaugdAugDistCc != null)
            return false;
        if (bwsepdSepDistCc != null ? !bwsepdSepDistCc.equals(that.bwsepdSepDistCc) : that.bwsepdSepDistCc != null)
            return false;
        if (bwoctdOctDistCc != null ? !bwoctdOctDistCc.equals(that.bwoctdOctDistCc) : that.bwoctdOctDistCc != null)
            return false;
        if (bwnovdNovDistCc != null ? !bwnovdNovDistCc.equals(that.bwnovdNovDistCc) : that.bwnovdNovDistCc != null)
            return false;
        if (bwdecdDecDistCc != null ? !bwdecdDecDistCc.equals(that.bwdecdDecDistCc) : that.bwdecdDecDistCc != null)
            return false;
        if (bwjannJanNonMgrCc != null ? !bwjannJanNonMgrCc.equals(that.bwjannJanNonMgrCc) : that.bwjannJanNonMgrCc != null)
            return false;
        if (bwfebnFebNonMgrCc != null ? !bwfebnFebNonMgrCc.equals(that.bwfebnFebNonMgrCc) : that.bwfebnFebNonMgrCc != null)
            return false;
        if (bwmarnMarNonMgrCc != null ? !bwmarnMarNonMgrCc.equals(that.bwmarnMarNonMgrCc) : that.bwmarnMarNonMgrCc != null)
            return false;
        if (bwaprnAprNonMgrCc != null ? !bwaprnAprNonMgrCc.equals(that.bwaprnAprNonMgrCc) : that.bwaprnAprNonMgrCc != null)
            return false;
        if (bwmaynMayNonMgrCc != null ? !bwmaynMayNonMgrCc.equals(that.bwmaynMayNonMgrCc) : that.bwmaynMayNonMgrCc != null)
            return false;
        if (bwjunnJunNonMgrCc != null ? !bwjunnJunNonMgrCc.equals(that.bwjunnJunNonMgrCc) : that.bwjunnJunNonMgrCc != null)
            return false;
        if (bwjlynJlyNonMgrCc != null ? !bwjlynJlyNonMgrCc.equals(that.bwjlynJlyNonMgrCc) : that.bwjlynJlyNonMgrCc != null)
            return false;
        if (bwaugnAugNonMgrCc != null ? !bwaugnAugNonMgrCc.equals(that.bwaugnAugNonMgrCc) : that.bwaugnAugNonMgrCc != null)
            return false;
        if (bwsepnSepNonMgrCc != null ? !bwsepnSepNonMgrCc.equals(that.bwsepnSepNonMgrCc) : that.bwsepnSepNonMgrCc != null)
            return false;
        if (bwoctnOctNonMgrCc != null ? !bwoctnOctNonMgrCc.equals(that.bwoctnOctNonMgrCc) : that.bwoctnOctNonMgrCc != null)
            return false;
        if (bwnovnNovNonMgrCc != null ? !bwnovnNovNonMgrCc.equals(that.bwnovnNovNonMgrCc) : that.bwnovnNovNonMgrCc != null)
            return false;
        if (bwdecnDecNonMgrCc != null ? !bwdecnDecNonMgrCc.equals(that.bwdecnDecNonMgrCc) : that.bwdecnDecNonMgrCc != null)
            return false;
        if (bwjantJanTotalCc != null ? !bwjantJanTotalCc.equals(that.bwjantJanTotalCc) : that.bwjantJanTotalCc != null)
            return false;
        if (bwfebtFebTotalCc != null ? !bwfebtFebTotalCc.equals(that.bwfebtFebTotalCc) : that.bwfebtFebTotalCc != null)
            return false;
        if (bwmartMarTotalCc != null ? !bwmartMarTotalCc.equals(that.bwmartMarTotalCc) : that.bwmartMarTotalCc != null)
            return false;
        if (bwaprtAprTotalCc != null ? !bwaprtAprTotalCc.equals(that.bwaprtAprTotalCc) : that.bwaprtAprTotalCc != null)
            return false;
        if (bwmaytMayTotalCc != null ? !bwmaytMayTotalCc.equals(that.bwmaytMayTotalCc) : that.bwmaytMayTotalCc != null)
            return false;
        if (bwjuntJunTotalCc != null ? !bwjuntJunTotalCc.equals(that.bwjuntJunTotalCc) : that.bwjuntJunTotalCc != null)
            return false;
        if (bwjlytJlyTotalCc != null ? !bwjlytJlyTotalCc.equals(that.bwjlytJlyTotalCc) : that.bwjlytJlyTotalCc != null)
            return false;
        if (bwaugtAugTotalCc != null ? !bwaugtAugTotalCc.equals(that.bwaugtAugTotalCc) : that.bwaugtAugTotalCc != null)
            return false;
        if (bwseptSepTotalCc != null ? !bwseptSepTotalCc.equals(that.bwseptSepTotalCc) : that.bwseptSepTotalCc != null)
            return false;
        if (bwocttOctTotalCc != null ? !bwocttOctTotalCc.equals(that.bwocttOctTotalCc) : that.bwocttOctTotalCc != null)
            return false;
        if (bwnovtNovTotalCc != null ? !bwnovtNovTotalCc.equals(that.bwnovtNovTotalCc) : that.bwnovtNovTotalCc != null)
            return false;
        if (bwdectDecTotalCc != null ? !bwdectDecTotalCc.equals(that.bwdectDecTotalCc) : that.bwdectDecTotalCc != null)
            return false;
        if (bwtpccTotalPerCc != null ? !bwtpccTotalPerCc.equals(that.bwtpccTotalPerCc) : that.bwtpccTotalPerCc != null)
            return false;
        if (bwtdccTotalDistCc != null ? !bwtdccTotalDistCc.equals(that.bwtdccTotalDistCc) : that.bwtdccTotalDistCc != null)
            return false;
        if (bwtnccTotalNonMgrCc != null ? !bwtnccTotalNonMgrCc.equals(that.bwtnccTotalNonMgrCc) : that.bwtnccTotalNonMgrCc != null)
            return false;
        if (bwttccTotalCc != null ? !bwttccTotalCc.equals(that.bwttccTotalCc) : that.bwttccTotalCc != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bwcoidCompany != null ? bwcoidCompany.hashCode() : 0);
        result = 31 * result + (bwdivDivision != null ? bwdivDivision.hashCode() : 0);
        result = 31 * result + (bwareaArea != null ? bwareaArea.hashCode() : 0);
        result = 31 * result + (bwctlDistributorControl != null ? bwctlDistributorControl.hashCode() : 0);
        result = 31 * result + (bwctycCountryCode != null ? bwctycCountryCode.hashCode() : 0);
        result = 31 * result + (bwdidDistributorId != null ? bwdidDistributorId.hashCode() : 0);
        result = 31 * result + (bwjanpJanPerCc != null ? bwjanpJanPerCc.hashCode() : 0);
        result = 31 * result + (bwfebpFebPerCc != null ? bwfebpFebPerCc.hashCode() : 0);
        result = 31 * result + (bwmarpMarPerCc != null ? bwmarpMarPerCc.hashCode() : 0);
        result = 31 * result + (bwaprpAprPerCc != null ? bwaprpAprPerCc.hashCode() : 0);
        result = 31 * result + (bwmaypMayPerCc != null ? bwmaypMayPerCc.hashCode() : 0);
        result = 31 * result + (bwjunpJunPerCc != null ? bwjunpJunPerCc.hashCode() : 0);
        result = 31 * result + (bwjlypJlyPerCc != null ? bwjlypJlyPerCc.hashCode() : 0);
        result = 31 * result + (bwaugpAugPerCc != null ? bwaugpAugPerCc.hashCode() : 0);
        result = 31 * result + (bwseppSepPerCc != null ? bwseppSepPerCc.hashCode() : 0);
        result = 31 * result + (bwoctpOctPerCc != null ? bwoctpOctPerCc.hashCode() : 0);
        result = 31 * result + (bwnovpNovPerCc != null ? bwnovpNovPerCc.hashCode() : 0);
        result = 31 * result + (bwdecpDecPerCc != null ? bwdecpDecPerCc.hashCode() : 0);
        result = 31 * result + (bwjandJanDistCc != null ? bwjandJanDistCc.hashCode() : 0);
        result = 31 * result + (bwfebdFebDistCc != null ? bwfebdFebDistCc.hashCode() : 0);
        result = 31 * result + (bwmardMarDistCc != null ? bwmardMarDistCc.hashCode() : 0);
        result = 31 * result + (bwaprdAprDistCc != null ? bwaprdAprDistCc.hashCode() : 0);
        result = 31 * result + (bwmaydMayDistCc != null ? bwmaydMayDistCc.hashCode() : 0);
        result = 31 * result + (bwjundJunDistCc != null ? bwjundJunDistCc.hashCode() : 0);
        result = 31 * result + (bwjlydJlyDistCc != null ? bwjlydJlyDistCc.hashCode() : 0);
        result = 31 * result + (bwaugdAugDistCc != null ? bwaugdAugDistCc.hashCode() : 0);
        result = 31 * result + (bwsepdSepDistCc != null ? bwsepdSepDistCc.hashCode() : 0);
        result = 31 * result + (bwoctdOctDistCc != null ? bwoctdOctDistCc.hashCode() : 0);
        result = 31 * result + (bwnovdNovDistCc != null ? bwnovdNovDistCc.hashCode() : 0);
        result = 31 * result + (bwdecdDecDistCc != null ? bwdecdDecDistCc.hashCode() : 0);
        result = 31 * result + (bwjannJanNonMgrCc != null ? bwjannJanNonMgrCc.hashCode() : 0);
        result = 31 * result + (bwfebnFebNonMgrCc != null ? bwfebnFebNonMgrCc.hashCode() : 0);
        result = 31 * result + (bwmarnMarNonMgrCc != null ? bwmarnMarNonMgrCc.hashCode() : 0);
        result = 31 * result + (bwaprnAprNonMgrCc != null ? bwaprnAprNonMgrCc.hashCode() : 0);
        result = 31 * result + (bwmaynMayNonMgrCc != null ? bwmaynMayNonMgrCc.hashCode() : 0);
        result = 31 * result + (bwjunnJunNonMgrCc != null ? bwjunnJunNonMgrCc.hashCode() : 0);
        result = 31 * result + (bwjlynJlyNonMgrCc != null ? bwjlynJlyNonMgrCc.hashCode() : 0);
        result = 31 * result + (bwaugnAugNonMgrCc != null ? bwaugnAugNonMgrCc.hashCode() : 0);
        result = 31 * result + (bwsepnSepNonMgrCc != null ? bwsepnSepNonMgrCc.hashCode() : 0);
        result = 31 * result + (bwoctnOctNonMgrCc != null ? bwoctnOctNonMgrCc.hashCode() : 0);
        result = 31 * result + (bwnovnNovNonMgrCc != null ? bwnovnNovNonMgrCc.hashCode() : 0);
        result = 31 * result + (bwdecnDecNonMgrCc != null ? bwdecnDecNonMgrCc.hashCode() : 0);
        result = 31 * result + (bwjantJanTotalCc != null ? bwjantJanTotalCc.hashCode() : 0);
        result = 31 * result + (bwfebtFebTotalCc != null ? bwfebtFebTotalCc.hashCode() : 0);
        result = 31 * result + (bwmartMarTotalCc != null ? bwmartMarTotalCc.hashCode() : 0);
        result = 31 * result + (bwaprtAprTotalCc != null ? bwaprtAprTotalCc.hashCode() : 0);
        result = 31 * result + (bwmaytMayTotalCc != null ? bwmaytMayTotalCc.hashCode() : 0);
        result = 31 * result + (bwjuntJunTotalCc != null ? bwjuntJunTotalCc.hashCode() : 0);
        result = 31 * result + (bwjlytJlyTotalCc != null ? bwjlytJlyTotalCc.hashCode() : 0);
        result = 31 * result + (bwaugtAugTotalCc != null ? bwaugtAugTotalCc.hashCode() : 0);
        result = 31 * result + (bwseptSepTotalCc != null ? bwseptSepTotalCc.hashCode() : 0);
        result = 31 * result + (bwocttOctTotalCc != null ? bwocttOctTotalCc.hashCode() : 0);
        result = 31 * result + (bwnovtNovTotalCc != null ? bwnovtNovTotalCc.hashCode() : 0);
        result = 31 * result + (bwdectDecTotalCc != null ? bwdectDecTotalCc.hashCode() : 0);
        result = 31 * result + (bwtpccTotalPerCc != null ? bwtpccTotalPerCc.hashCode() : 0);
        result = 31 * result + (bwtdccTotalDistCc != null ? bwtdccTotalDistCc.hashCode() : 0);
        result = 31 * result + (bwtnccTotalNonMgrCc != null ? bwtnccTotalNonMgrCc.hashCode() : 0);
        result = 31 * result + (bwttccTotalCc != null ? bwttccTotalCc.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"Bowk1PBonusSystem\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"bwcoidCompany\":\"" + bwcoidCompany + "\""
                + ",                         \"bwdivDivision\":\"" + bwdivDivision + "\""
                + ",                         \"bwareaArea\":\"" + bwareaArea + "\""
                + ",                         \"bwctlDistributorControl\":\"" + bwctlDistributorControl + "\""
                + ",                         \"bwctycCountryCode\":\"" + bwctycCountryCode + "\""
                + ",                         \"bwdidDistributorId\":\"" + bwdidDistributorId + "\""
                + ",                         \"bwjanpJanPerCc\":\"" + bwjanpJanPerCc + "\""
                + ",                         \"bwfebpFebPerCc\":\"" + bwfebpFebPerCc + "\""
                + ",                         \"bwmarpMarPerCc\":\"" + bwmarpMarPerCc + "\""
                + ",                         \"bwaprpAprPerCc\":\"" + bwaprpAprPerCc + "\""
                + ",                         \"bwmaypMayPerCc\":\"" + bwmaypMayPerCc + "\""
                + ",                         \"bwjunpJunPerCc\":\"" + bwjunpJunPerCc + "\""
                + ",                         \"bwjlypJlyPerCc\":\"" + bwjlypJlyPerCc + "\""
                + ",                         \"bwaugpAugPerCc\":\"" + bwaugpAugPerCc + "\""
                + ",                         \"bwseppSepPerCc\":\"" + bwseppSepPerCc + "\""
                + ",                         \"bwoctpOctPerCc\":\"" + bwoctpOctPerCc + "\""
                + ",                         \"bwnovpNovPerCc\":\"" + bwnovpNovPerCc + "\""
                + ",                         \"bwdecpDecPerCc\":\"" + bwdecpDecPerCc + "\""
                + ",                         \"bwjandJanDistCc\":\"" + bwjandJanDistCc + "\""
                + ",                         \"bwfebdFebDistCc\":\"" + bwfebdFebDistCc + "\""
                + ",                         \"bwmardMarDistCc\":\"" + bwmardMarDistCc + "\""
                + ",                         \"bwaprdAprDistCc\":\"" + bwaprdAprDistCc + "\""
                + ",                         \"bwmaydMayDistCc\":\"" + bwmaydMayDistCc + "\""
                + ",                         \"bwjundJunDistCc\":\"" + bwjundJunDistCc + "\""
                + ",                         \"bwjlydJlyDistCc\":\"" + bwjlydJlyDistCc + "\""
                + ",                         \"bwaugdAugDistCc\":\"" + bwaugdAugDistCc + "\""
                + ",                         \"bwsepdSepDistCc\":\"" + bwsepdSepDistCc + "\""
                + ",                         \"bwoctdOctDistCc\":\"" + bwoctdOctDistCc + "\""
                + ",                         \"bwnovdNovDistCc\":\"" + bwnovdNovDistCc + "\""
                + ",                         \"bwdecdDecDistCc\":\"" + bwdecdDecDistCc + "\""
                + ",                         \"bwjannJanNonMgrCc\":\"" + bwjannJanNonMgrCc + "\""
                + ",                         \"bwfebnFebNonMgrCc\":\"" + bwfebnFebNonMgrCc + "\""
                + ",                         \"bwmarnMarNonMgrCc\":\"" + bwmarnMarNonMgrCc + "\""
                + ",                         \"bwaprnAprNonMgrCc\":\"" + bwaprnAprNonMgrCc + "\""
                + ",                         \"bwmaynMayNonMgrCc\":\"" + bwmaynMayNonMgrCc + "\""
                + ",                         \"bwjunnJunNonMgrCc\":\"" + bwjunnJunNonMgrCc + "\""
                + ",                         \"bwjlynJlyNonMgrCc\":\"" + bwjlynJlyNonMgrCc + "\""
                + ",                         \"bwaugnAugNonMgrCc\":\"" + bwaugnAugNonMgrCc + "\""
                + ",                         \"bwsepnSepNonMgrCc\":\"" + bwsepnSepNonMgrCc + "\""
                + ",                         \"bwoctnOctNonMgrCc\":\"" + bwoctnOctNonMgrCc + "\""
                + ",                         \"bwnovnNovNonMgrCc\":\"" + bwnovnNovNonMgrCc + "\""
                + ",                         \"bwdecnDecNonMgrCc\":\"" + bwdecnDecNonMgrCc + "\""
                + ",                         \"bwjantJanTotalCc\":\"" + bwjantJanTotalCc + "\""
                + ",                         \"bwfebtFebTotalCc\":\"" + bwfebtFebTotalCc + "\""
                + ",                         \"bwmartMarTotalCc\":\"" + bwmartMarTotalCc + "\""
                + ",                         \"bwaprtAprTotalCc\":\"" + bwaprtAprTotalCc + "\""
                + ",                         \"bwmaytMayTotalCc\":\"" + bwmaytMayTotalCc + "\""
                + ",                         \"bwjuntJunTotalCc\":\"" + bwjuntJunTotalCc + "\""
                + ",                         \"bwjlytJlyTotalCc\":\"" + bwjlytJlyTotalCc + "\""
                + ",                         \"bwaugtAugTotalCc\":\"" + bwaugtAugTotalCc + "\""
                + ",                         \"bwseptSepTotalCc\":\"" + bwseptSepTotalCc + "\""
                + ",                         \"bwocttOctTotalCc\":\"" + bwocttOctTotalCc + "\""
                + ",                         \"bwnovtNovTotalCc\":\"" + bwnovtNovTotalCc + "\""
                + ",                         \"bwdectDecTotalCc\":\"" + bwdectDecTotalCc + "\""
                + ",                         \"bwtpccTotalPerCc\":\"" + bwtpccTotalPerCc + "\""
                + ",                         \"bwtdccTotalDistCc\":\"" + bwtdccTotalDistCc + "\""
                + ",                         \"bwtnccTotalNonMgrCc\":\"" + bwtnccTotalNonMgrCc + "\""
                + ",                         \"bwttccTotalCc\":\"" + bwttccTotalCc + "\""
                + "}}";
    }
}
