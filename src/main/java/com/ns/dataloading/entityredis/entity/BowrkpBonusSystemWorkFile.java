package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("BOWRKP_BonusSystemWorkFile")
public class BowrkpBonusSystemWorkFile implements Serializable {
    private Long id;
    private String bwcoidCompany;
    private String bwdivDivision;
    private Long bwareaArea;
    private Long bwctlDistributorControl;
    private BigDecimal bwjanJanCc;
    private BigDecimal bwfebFebCc;
    private BigDecimal bwmarMarCc;
    private BigDecimal bwaprAprCc;
    private BigDecimal bwmayMayCc;
    private BigDecimal bwjunJunCc;
    private BigDecimal bwjlyJlyCc;
    private BigDecimal bwaugAugCc;
    private BigDecimal bwsepSepCc;
    private BigDecimal bwoctOctCc;
    private BigDecimal bwnovNovCc;
    private BigDecimal bwdecDecCc;
    private BigDecimal bwyrccAreaTotalCc;
    private BigDecimal bwptccPAreaTotalCc;
    private BigDecimal bwpphyAreaPhysical;
    private BigDecimal bwpsrpPAreaSrp;
    private BigDecimal bwdtccDAreaTotalCc;
    private BigDecimal bwdphyDAreaPhysical;
    private BigDecimal bwdsrpDAreaSrp;
    private BigDecimal nwptccNpPaTotalCc;
    private BigDecimal nwpphyNpPaPhysicalCc;
    private BigDecimal nwpsrpNpPaSrp;
    private BigDecimal nwdtccNpDaTotalCc;
    private BigDecimal nwdphyNpDaPhyCas;
    private BigDecimal nwdsrpNpDaSrp;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "BWCOID_Company", nullable = true, length = 255)
    public String getBwcoidCompany() {
        return bwcoidCompany;
    }

    public void setBwcoidCompany(String bwcoidCompany) {
        this.bwcoidCompany = bwcoidCompany;
    }

    // @Basic
    // @Column(name = "BWDIV_Division", nullable = true, length = 255)
    public String getBwdivDivision() {
        return bwdivDivision;
    }

    public void setBwdivDivision(String bwdivDivision) {
        this.bwdivDivision = bwdivDivision;
    }

    // @Basic
    // @Column(name = "BWAREA_Area", nullable = true)
    public Long getBwareaArea() {
        return bwareaArea;
    }

    public void setBwareaArea(Long bwareaArea) {
        this.bwareaArea = bwareaArea;
    }

    // @Basic
    // @Column(name = "BWCTL_DistributorControl", nullable = true)
    public Long getBwctlDistributorControl() {
        return bwctlDistributorControl;
    }

    public void setBwctlDistributorControl(Long bwctlDistributorControl) {
        this.bwctlDistributorControl = bwctlDistributorControl;
    }

    // @Basic
    // @Column(name = "BWJAN_JanCC", nullable = true, precision = 3)
    public BigDecimal getBwjanJanCc() {
        return bwjanJanCc;
    }

    public void setBwjanJanCc(BigDecimal bwjanJanCc) {
        this.bwjanJanCc = bwjanJanCc;
    }

    // @Basic
    // @Column(name = "BWFEB_FebCC", nullable = true, precision = 3)
    public BigDecimal getBwfebFebCc() {
        return bwfebFebCc;
    }

    public void setBwfebFebCc(BigDecimal bwfebFebCc) {
        this.bwfebFebCc = bwfebFebCc;
    }

    // @Basic
    // @Column(name = "BWMAR_MarCC", nullable = true, precision = 3)
    public BigDecimal getBwmarMarCc() {
        return bwmarMarCc;
    }

    public void setBwmarMarCc(BigDecimal bwmarMarCc) {
        this.bwmarMarCc = bwmarMarCc;
    }

    // @Basic
    // @Column(name = "BWAPR_AprCC", nullable = true, precision = 3)
    public BigDecimal getBwaprAprCc() {
        return bwaprAprCc;
    }

    public void setBwaprAprCc(BigDecimal bwaprAprCc) {
        this.bwaprAprCc = bwaprAprCc;
    }

    // @Basic
    // @Column(name = "BWMAY_MayCC", nullable = true, precision = 3)
    public BigDecimal getBwmayMayCc() {
        return bwmayMayCc;
    }

    public void setBwmayMayCc(BigDecimal bwmayMayCc) {
        this.bwmayMayCc = bwmayMayCc;
    }

    // @Basic
    // @Column(name = "BWJUN_JunCC", nullable = true, precision = 3)
    public BigDecimal getBwjunJunCc() {
        return bwjunJunCc;
    }

    public void setBwjunJunCc(BigDecimal bwjunJunCc) {
        this.bwjunJunCc = bwjunJunCc;
    }

    // @Basic
    // @Column(name = "BWJLY_JlyCC", nullable = true, precision = 3)
    public BigDecimal getBwjlyJlyCc() {
        return bwjlyJlyCc;
    }

    public void setBwjlyJlyCc(BigDecimal bwjlyJlyCc) {
        this.bwjlyJlyCc = bwjlyJlyCc;
    }

    // @Basic
    // @Column(name = "BWAUG_AugCC", nullable = true, precision = 3)
    public BigDecimal getBwaugAugCc() {
        return bwaugAugCc;
    }

    public void setBwaugAugCc(BigDecimal bwaugAugCc) {
        this.bwaugAugCc = bwaugAugCc;
    }

    // @Basic
    // @Column(name = "BWSEP_SepCC", nullable = true, precision = 3)
    public BigDecimal getBwsepSepCc() {
        return bwsepSepCc;
    }

    public void setBwsepSepCc(BigDecimal bwsepSepCc) {
        this.bwsepSepCc = bwsepSepCc;
    }

    // @Basic
    // @Column(name = "BWOCT_OctCC", nullable = true, precision = 3)
    public BigDecimal getBwoctOctCc() {
        return bwoctOctCc;
    }

    public void setBwoctOctCc(BigDecimal bwoctOctCc) {
        this.bwoctOctCc = bwoctOctCc;
    }

    // @Basic
    // @Column(name = "BWNOV_NovCC", nullable = true, precision = 3)
    public BigDecimal getBwnovNovCc() {
        return bwnovNovCc;
    }

    public void setBwnovNovCc(BigDecimal bwnovNovCc) {
        this.bwnovNovCc = bwnovNovCc;
    }

    // @Basic
    // @Column(name = "BWDEC_DecCC", nullable = true, precision = 3)
    public BigDecimal getBwdecDecCc() {
        return bwdecDecCc;
    }

    public void setBwdecDecCc(BigDecimal bwdecDecCc) {
        this.bwdecDecCc = bwdecDecCc;
    }

    // @Basic
    // @Column(name = "BWYRCC_AreaTotalCC", nullable = true, precision = 3)
    public BigDecimal getBwyrccAreaTotalCc() {
        return bwyrccAreaTotalCc;
    }

    public void setBwyrccAreaTotalCc(BigDecimal bwyrccAreaTotalCc) {
        this.bwyrccAreaTotalCc = bwyrccAreaTotalCc;
    }

    // @Basic
    // @Column(name = "BWPTCC_PAreaTotalCC", nullable = true, precision = 3)
    public BigDecimal getBwptccPAreaTotalCc() {
        return bwptccPAreaTotalCc;
    }

    public void setBwptccPAreaTotalCc(BigDecimal bwptccPAreaTotalCc) {
        this.bwptccPAreaTotalCc = bwptccPAreaTotalCc;
    }

    // @Basic
    // @Column(name = "BWPPHY_AreaPhysical", nullable = true, precision = 3)
    public BigDecimal getBwpphyAreaPhysical() {
        return bwpphyAreaPhysical;
    }

    public void setBwpphyAreaPhysical(BigDecimal bwpphyAreaPhysical) {
        this.bwpphyAreaPhysical = bwpphyAreaPhysical;
    }

    // @Basic
    // @Column(name = "BWPSRP_PAreaSrp", nullable = true, precision = 3)
    public BigDecimal getBwpsrpPAreaSrp() {
        return bwpsrpPAreaSrp;
    }

    public void setBwpsrpPAreaSrp(BigDecimal bwpsrpPAreaSrp) {
        this.bwpsrpPAreaSrp = bwpsrpPAreaSrp;
    }

    // @Basic
    // @Column(name = "BWDTCC_DAreaTotalCC", nullable = true, precision = 3)
    public BigDecimal getBwdtccDAreaTotalCc() {
        return bwdtccDAreaTotalCc;
    }

    public void setBwdtccDAreaTotalCc(BigDecimal bwdtccDAreaTotalCc) {
        this.bwdtccDAreaTotalCc = bwdtccDAreaTotalCc;
    }

    // @Basic
    // @Column(name = "BWDPHY_DAreaPhysical", nullable = true, precision = 3)
    public BigDecimal getBwdphyDAreaPhysical() {
        return bwdphyDAreaPhysical;
    }

    public void setBwdphyDAreaPhysical(BigDecimal bwdphyDAreaPhysical) {
        this.bwdphyDAreaPhysical = bwdphyDAreaPhysical;
    }

    // @Basic
    // @Column(name = "BWDSRP_DAreaSrp", nullable = true, precision = 3)
    public BigDecimal getBwdsrpDAreaSrp() {
        return bwdsrpDAreaSrp;
    }

    public void setBwdsrpDAreaSrp(BigDecimal bwdsrpDAreaSrp) {
        this.bwdsrpDAreaSrp = bwdsrpDAreaSrp;
    }

    // @Basic
    // @Column(name = "NWPTCC_NpPaTotalCC", nullable = true, precision = 3)
    public BigDecimal getNwptccNpPaTotalCc() {
        return nwptccNpPaTotalCc;
    }

    public void setNwptccNpPaTotalCc(BigDecimal nwptccNpPaTotalCc) {
        this.nwptccNpPaTotalCc = nwptccNpPaTotalCc;
    }

    // @Basic
    // @Column(name = "NWPPHY_NpPaPhysicalCc", nullable = true, precision = 3)
    public BigDecimal getNwpphyNpPaPhysicalCc() {
        return nwpphyNpPaPhysicalCc;
    }

    public void setNwpphyNpPaPhysicalCc(BigDecimal nwpphyNpPaPhysicalCc) {
        this.nwpphyNpPaPhysicalCc = nwpphyNpPaPhysicalCc;
    }

    // @Basic
    // @Column(name = "NWPSRP_NpPaSrp", nullable = true, precision = 3)
    public BigDecimal getNwpsrpNpPaSrp() {
        return nwpsrpNpPaSrp;
    }

    public void setNwpsrpNpPaSrp(BigDecimal nwpsrpNpPaSrp) {
        this.nwpsrpNpPaSrp = nwpsrpNpPaSrp;
    }

    // @Basic
    // @Column(name = "NWDTCC_NpDaTotalCC", nullable = true, precision = 3)
    public BigDecimal getNwdtccNpDaTotalCc() {
        return nwdtccNpDaTotalCc;
    }

    public void setNwdtccNpDaTotalCc(BigDecimal nwdtccNpDaTotalCc) {
        this.nwdtccNpDaTotalCc = nwdtccNpDaTotalCc;
    }

    // @Basic
    // @Column(name = "NWDPHY_NpDaPhyCas", nullable = true, precision = 3)
    public BigDecimal getNwdphyNpDaPhyCas() {
        return nwdphyNpDaPhyCas;
    }

    public void setNwdphyNpDaPhyCas(BigDecimal nwdphyNpDaPhyCas) {
        this.nwdphyNpDaPhyCas = nwdphyNpDaPhyCas;
    }

    // @Basic
    // @Column(name = "NWDSRP_NpDaSrp", nullable = true, precision = 3)
    public BigDecimal getNwdsrpNpDaSrp() {
        return nwdsrpNpDaSrp;
    }

    public void setNwdsrpNpDaSrp(BigDecimal nwdsrpNpDaSrp) {
        this.nwdsrpNpDaSrp = nwdsrpNpDaSrp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BowrkpBonusSystemWorkFile that = (BowrkpBonusSystemWorkFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bwcoidCompany != null ? !bwcoidCompany.equals(that.bwcoidCompany) : that.bwcoidCompany != null)
            return false;
        if (bwdivDivision != null ? !bwdivDivision.equals(that.bwdivDivision) : that.bwdivDivision != null)
            return false;
        if (bwareaArea != null ? !bwareaArea.equals(that.bwareaArea) : that.bwareaArea != null) return false;
        if (bwctlDistributorControl != null ? !bwctlDistributorControl.equals(that.bwctlDistributorControl) : that.bwctlDistributorControl != null)
            return false;
        if (bwjanJanCc != null ? !bwjanJanCc.equals(that.bwjanJanCc) : that.bwjanJanCc != null) return false;
        if (bwfebFebCc != null ? !bwfebFebCc.equals(that.bwfebFebCc) : that.bwfebFebCc != null) return false;
        if (bwmarMarCc != null ? !bwmarMarCc.equals(that.bwmarMarCc) : that.bwmarMarCc != null) return false;
        if (bwaprAprCc != null ? !bwaprAprCc.equals(that.bwaprAprCc) : that.bwaprAprCc != null) return false;
        if (bwmayMayCc != null ? !bwmayMayCc.equals(that.bwmayMayCc) : that.bwmayMayCc != null) return false;
        if (bwjunJunCc != null ? !bwjunJunCc.equals(that.bwjunJunCc) : that.bwjunJunCc != null) return false;
        if (bwjlyJlyCc != null ? !bwjlyJlyCc.equals(that.bwjlyJlyCc) : that.bwjlyJlyCc != null) return false;
        if (bwaugAugCc != null ? !bwaugAugCc.equals(that.bwaugAugCc) : that.bwaugAugCc != null) return false;
        if (bwsepSepCc != null ? !bwsepSepCc.equals(that.bwsepSepCc) : that.bwsepSepCc != null) return false;
        if (bwoctOctCc != null ? !bwoctOctCc.equals(that.bwoctOctCc) : that.bwoctOctCc != null) return false;
        if (bwnovNovCc != null ? !bwnovNovCc.equals(that.bwnovNovCc) : that.bwnovNovCc != null) return false;
        if (bwdecDecCc != null ? !bwdecDecCc.equals(that.bwdecDecCc) : that.bwdecDecCc != null) return false;
        if (bwyrccAreaTotalCc != null ? !bwyrccAreaTotalCc.equals(that.bwyrccAreaTotalCc) : that.bwyrccAreaTotalCc != null)
            return false;
        if (bwptccPAreaTotalCc != null ? !bwptccPAreaTotalCc.equals(that.bwptccPAreaTotalCc) : that.bwptccPAreaTotalCc != null)
            return false;
        if (bwpphyAreaPhysical != null ? !bwpphyAreaPhysical.equals(that.bwpphyAreaPhysical) : that.bwpphyAreaPhysical != null)
            return false;
        if (bwpsrpPAreaSrp != null ? !bwpsrpPAreaSrp.equals(that.bwpsrpPAreaSrp) : that.bwpsrpPAreaSrp != null)
            return false;
        if (bwdtccDAreaTotalCc != null ? !bwdtccDAreaTotalCc.equals(that.bwdtccDAreaTotalCc) : that.bwdtccDAreaTotalCc != null)
            return false;
        if (bwdphyDAreaPhysical != null ? !bwdphyDAreaPhysical.equals(that.bwdphyDAreaPhysical) : that.bwdphyDAreaPhysical != null)
            return false;
        if (bwdsrpDAreaSrp != null ? !bwdsrpDAreaSrp.equals(that.bwdsrpDAreaSrp) : that.bwdsrpDAreaSrp != null)
            return false;
        if (nwptccNpPaTotalCc != null ? !nwptccNpPaTotalCc.equals(that.nwptccNpPaTotalCc) : that.nwptccNpPaTotalCc != null)
            return false;
        if (nwpphyNpPaPhysicalCc != null ? !nwpphyNpPaPhysicalCc.equals(that.nwpphyNpPaPhysicalCc) : that.nwpphyNpPaPhysicalCc != null)
            return false;
        if (nwpsrpNpPaSrp != null ? !nwpsrpNpPaSrp.equals(that.nwpsrpNpPaSrp) : that.nwpsrpNpPaSrp != null)
            return false;
        if (nwdtccNpDaTotalCc != null ? !nwdtccNpDaTotalCc.equals(that.nwdtccNpDaTotalCc) : that.nwdtccNpDaTotalCc != null)
            return false;
        if (nwdphyNpDaPhyCas != null ? !nwdphyNpDaPhyCas.equals(that.nwdphyNpDaPhyCas) : that.nwdphyNpDaPhyCas != null)
            return false;
        if (nwdsrpNpDaSrp != null ? !nwdsrpNpDaSrp.equals(that.nwdsrpNpDaSrp) : that.nwdsrpNpDaSrp != null)
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
        result = 31 * result + (bwjanJanCc != null ? bwjanJanCc.hashCode() : 0);
        result = 31 * result + (bwfebFebCc != null ? bwfebFebCc.hashCode() : 0);
        result = 31 * result + (bwmarMarCc != null ? bwmarMarCc.hashCode() : 0);
        result = 31 * result + (bwaprAprCc != null ? bwaprAprCc.hashCode() : 0);
        result = 31 * result + (bwmayMayCc != null ? bwmayMayCc.hashCode() : 0);
        result = 31 * result + (bwjunJunCc != null ? bwjunJunCc.hashCode() : 0);
        result = 31 * result + (bwjlyJlyCc != null ? bwjlyJlyCc.hashCode() : 0);
        result = 31 * result + (bwaugAugCc != null ? bwaugAugCc.hashCode() : 0);
        result = 31 * result + (bwsepSepCc != null ? bwsepSepCc.hashCode() : 0);
        result = 31 * result + (bwoctOctCc != null ? bwoctOctCc.hashCode() : 0);
        result = 31 * result + (bwnovNovCc != null ? bwnovNovCc.hashCode() : 0);
        result = 31 * result + (bwdecDecCc != null ? bwdecDecCc.hashCode() : 0);
        result = 31 * result + (bwyrccAreaTotalCc != null ? bwyrccAreaTotalCc.hashCode() : 0);
        result = 31 * result + (bwptccPAreaTotalCc != null ? bwptccPAreaTotalCc.hashCode() : 0);
        result = 31 * result + (bwpphyAreaPhysical != null ? bwpphyAreaPhysical.hashCode() : 0);
        result = 31 * result + (bwpsrpPAreaSrp != null ? bwpsrpPAreaSrp.hashCode() : 0);
        result = 31 * result + (bwdtccDAreaTotalCc != null ? bwdtccDAreaTotalCc.hashCode() : 0);
        result = 31 * result + (bwdphyDAreaPhysical != null ? bwdphyDAreaPhysical.hashCode() : 0);
        result = 31 * result + (bwdsrpDAreaSrp != null ? bwdsrpDAreaSrp.hashCode() : 0);
        result = 31 * result + (nwptccNpPaTotalCc != null ? nwptccNpPaTotalCc.hashCode() : 0);
        result = 31 * result + (nwpphyNpPaPhysicalCc != null ? nwpphyNpPaPhysicalCc.hashCode() : 0);
        result = 31 * result + (nwpsrpNpPaSrp != null ? nwpsrpNpPaSrp.hashCode() : 0);
        result = 31 * result + (nwdtccNpDaTotalCc != null ? nwdtccNpDaTotalCc.hashCode() : 0);
        result = 31 * result + (nwdphyNpDaPhyCas != null ? nwdphyNpDaPhyCas.hashCode() : 0);
        result = 31 * result + (nwdsrpNpDaSrp != null ? nwdsrpNpDaSrp.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"BowrkpBonusSystemWorkFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"bwcoidCompany\":\"" + bwcoidCompany + "\""
                + ",                         \"bwdivDivision\":\"" + bwdivDivision + "\""
                + ",                         \"bwareaArea\":\"" + bwareaArea + "\""
                + ",                         \"bwctlDistributorControl\":\"" + bwctlDistributorControl + "\""
                + ",                         \"bwjanJanCc\":\"" + bwjanJanCc + "\""
                + ",                         \"bwfebFebCc\":\"" + bwfebFebCc + "\""
                + ",                         \"bwmarMarCc\":\"" + bwmarMarCc + "\""
                + ",                         \"bwaprAprCc\":\"" + bwaprAprCc + "\""
                + ",                         \"bwmayMayCc\":\"" + bwmayMayCc + "\""
                + ",                         \"bwjunJunCc\":\"" + bwjunJunCc + "\""
                + ",                         \"bwjlyJlyCc\":\"" + bwjlyJlyCc + "\""
                + ",                         \"bwaugAugCc\":\"" + bwaugAugCc + "\""
                + ",                         \"bwsepSepCc\":\"" + bwsepSepCc + "\""
                + ",                         \"bwoctOctCc\":\"" + bwoctOctCc + "\""
                + ",                         \"bwnovNovCc\":\"" + bwnovNovCc + "\""
                + ",                         \"bwdecDecCc\":\"" + bwdecDecCc + "\""
                + ",                         \"bwyrccAreaTotalCc\":\"" + bwyrccAreaTotalCc + "\""
                + ",                         \"bwptccPAreaTotalCc\":\"" + bwptccPAreaTotalCc + "\""
                + ",                         \"bwpphyAreaPhysical\":\"" + bwpphyAreaPhysical + "\""
                + ",                         \"bwpsrpPAreaSrp\":\"" + bwpsrpPAreaSrp + "\""
                + ",                         \"bwdtccDAreaTotalCc\":\"" + bwdtccDAreaTotalCc + "\""
                + ",                         \"bwdphyDAreaPhysical\":\"" + bwdphyDAreaPhysical + "\""
                + ",                         \"bwdsrpDAreaSrp\":\"" + bwdsrpDAreaSrp + "\""
                + ",                         \"nwptccNpPaTotalCc\":\"" + nwptccNpPaTotalCc + "\""
                + ",                         \"nwpphyNpPaPhysicalCc\":\"" + nwpphyNpPaPhysicalCc + "\""
                + ",                         \"nwpsrpNpPaSrp\":\"" + nwpsrpNpPaSrp + "\""
                + ",                         \"nwdtccNpDaTotalCc\":\"" + nwdtccNpDaTotalCc + "\""
                + ",                         \"nwdphyNpDaPhyCas\":\"" + nwdphyNpDaPhyCas + "\""
                + ",                         \"nwdsrpNpDaSrp\":\"" + nwdsrpNpDaSrp + "\""
                + "}}";
    }
}
