package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "BOWRSP_BonusSystemWorkFilebySource")
public class BowrspBonusSystemWorkFilebySource {
    private Long id;
    private String bscoidCompany;
    private String bsdivDivision;
    private Long bsareaArea;
    private Long bsctlDistributorControl;
    private Long bsordsOrderSourceCode;
    private Long bsshpsShippingSourceCode;
    private BigDecimal bsjanJanCc;
    private BigDecimal bsfebFebCc;
    private BigDecimal bsmarMarCc;
    private BigDecimal bsaprAprCc;
    private BigDecimal bsmayMayCc;
    private BigDecimal bsjunJunCc;
    private BigDecimal bsjlyJlyCc;
    private BigDecimal bsaugAugCc;
    private BigDecimal bssepSepCc;
    private BigDecimal bsoctOctCc;
    private BigDecimal bsnovNovCc;
    private BigDecimal bsdecDecCc;
    private BigDecimal bsyrccAreaTotalCc;
    private BigDecimal bsptccPAreaTotalCc;
    private BigDecimal bspphyPAreaPhysical;
    private BigDecimal bspsrpPAreaSrp;
    private BigDecimal bsdtccDAreaTotalCc;
    private BigDecimal bsdphyDAreaPhysical;
    private BigDecimal bsdsrpDAreaSrp;
    private BigDecimal nsptccNpPaTotalCc;
    private BigDecimal nspphyNpPaPhyCas;
    private BigDecimal nspsrpNpPaSrp;
    private BigDecimal nsdtccNpDaTotalCc;
    private BigDecimal nsdphyNpDaTotalCc;
    private BigDecimal nsdsrpNpDaSrp;

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
    @Column(name = "BSCOID_Company", nullable = true, length = 255)
    public String getBscoidCompany() {
        return bscoidCompany;
    }

    public void setBscoidCompany(String bscoidCompany) {
        this.bscoidCompany = bscoidCompany;
    }

    @Basic
    @Column(name = "BSDIV_Division", nullable = true, length = 255)
    public String getBsdivDivision() {
        return bsdivDivision;
    }

    public void setBsdivDivision(String bsdivDivision) {
        this.bsdivDivision = bsdivDivision;
    }

    @Basic
    @Column(name = "BSAREA_Area", nullable = true)
    public Long getBsareaArea() {
        return bsareaArea;
    }

    public void setBsareaArea(Long bsareaArea) {
        this.bsareaArea = bsareaArea;
    }

    @Basic
    @Column(name = "BSCTL_DistributorControl", nullable = true)
    public Long getBsctlDistributorControl() {
        return bsctlDistributorControl;
    }

    public void setBsctlDistributorControl(Long bsctlDistributorControl) {
        this.bsctlDistributorControl = bsctlDistributorControl;
    }

    @Basic
    @Column(name = "BSORDS_OrderSourceCode", nullable = true)
    public Long getBsordsOrderSourceCode() {
        return bsordsOrderSourceCode;
    }

    public void setBsordsOrderSourceCode(Long bsordsOrderSourceCode) {
        this.bsordsOrderSourceCode = bsordsOrderSourceCode;
    }

    @Basic
    @Column(name = "BSSHPS_ShippingSourceCode", nullable = true)
    public Long getBsshpsShippingSourceCode() {
        return bsshpsShippingSourceCode;
    }

    public void setBsshpsShippingSourceCode(Long bsshpsShippingSourceCode) {
        this.bsshpsShippingSourceCode = bsshpsShippingSourceCode;
    }

    @Basic
    @Column(name = "BSJAN_JanCC", nullable = true, precision = 3)
    public BigDecimal getBsjanJanCc() {
        return bsjanJanCc;
    }

    public void setBsjanJanCc(BigDecimal bsjanJanCc) {
        this.bsjanJanCc = bsjanJanCc;
    }

    @Basic
    @Column(name = "BSFEB_FebCC", nullable = true, precision = 3)
    public BigDecimal getBsfebFebCc() {
        return bsfebFebCc;
    }

    public void setBsfebFebCc(BigDecimal bsfebFebCc) {
        this.bsfebFebCc = bsfebFebCc;
    }

    @Basic
    @Column(name = "BSMAR_MarCC", nullable = true, precision = 3)
    public BigDecimal getBsmarMarCc() {
        return bsmarMarCc;
    }

    public void setBsmarMarCc(BigDecimal bsmarMarCc) {
        this.bsmarMarCc = bsmarMarCc;
    }

    @Basic
    @Column(name = "BSAPR_AprCC", nullable = true, precision = 3)
    public BigDecimal getBsaprAprCc() {
        return bsaprAprCc;
    }

    public void setBsaprAprCc(BigDecimal bsaprAprCc) {
        this.bsaprAprCc = bsaprAprCc;
    }

    @Basic
    @Column(name = "BSMAY_MayCC", nullable = true, precision = 3)
    public BigDecimal getBsmayMayCc() {
        return bsmayMayCc;
    }

    public void setBsmayMayCc(BigDecimal bsmayMayCc) {
        this.bsmayMayCc = bsmayMayCc;
    }

    @Basic
    @Column(name = "BSJUN_JunCC", nullable = true, precision = 3)
    public BigDecimal getBsjunJunCc() {
        return bsjunJunCc;
    }

    public void setBsjunJunCc(BigDecimal bsjunJunCc) {
        this.bsjunJunCc = bsjunJunCc;
    }

    @Basic
    @Column(name = "BSJLY_JlyCC", nullable = true, precision = 3)
    public BigDecimal getBsjlyJlyCc() {
        return bsjlyJlyCc;
    }

    public void setBsjlyJlyCc(BigDecimal bsjlyJlyCc) {
        this.bsjlyJlyCc = bsjlyJlyCc;
    }

    @Basic
    @Column(name = "BSAUG_AugCC", nullable = true, precision = 3)
    public BigDecimal getBsaugAugCc() {
        return bsaugAugCc;
    }

    public void setBsaugAugCc(BigDecimal bsaugAugCc) {
        this.bsaugAugCc = bsaugAugCc;
    }

    @Basic
    @Column(name = "BSSEP_SepCC", nullable = true, precision = 3)
    public BigDecimal getBssepSepCc() {
        return bssepSepCc;
    }

    public void setBssepSepCc(BigDecimal bssepSepCc) {
        this.bssepSepCc = bssepSepCc;
    }

    @Basic
    @Column(name = "BSOCT_OctCC", nullable = true, precision = 3)
    public BigDecimal getBsoctOctCc() {
        return bsoctOctCc;
    }

    public void setBsoctOctCc(BigDecimal bsoctOctCc) {
        this.bsoctOctCc = bsoctOctCc;
    }

    @Basic
    @Column(name = "BSNOV_NovCC", nullable = true, precision = 3)
    public BigDecimal getBsnovNovCc() {
        return bsnovNovCc;
    }

    public void setBsnovNovCc(BigDecimal bsnovNovCc) {
        this.bsnovNovCc = bsnovNovCc;
    }

    @Basic
    @Column(name = "BSDEC_DecCC", nullable = true, precision = 3)
    public BigDecimal getBsdecDecCc() {
        return bsdecDecCc;
    }

    public void setBsdecDecCc(BigDecimal bsdecDecCc) {
        this.bsdecDecCc = bsdecDecCc;
    }

    @Basic
    @Column(name = "BSYRCC_AreaTotalCC", nullable = true, precision = 3)
    public BigDecimal getBsyrccAreaTotalCc() {
        return bsyrccAreaTotalCc;
    }

    public void setBsyrccAreaTotalCc(BigDecimal bsyrccAreaTotalCc) {
        this.bsyrccAreaTotalCc = bsyrccAreaTotalCc;
    }

    @Basic
    @Column(name = "BSPTCC_PAreaTotalCC", nullable = true, precision = 3)
    public BigDecimal getBsptccPAreaTotalCc() {
        return bsptccPAreaTotalCc;
    }

    public void setBsptccPAreaTotalCc(BigDecimal bsptccPAreaTotalCc) {
        this.bsptccPAreaTotalCc = bsptccPAreaTotalCc;
    }

    @Basic
    @Column(name = "BSPPHY_PAreaPhysical", nullable = true, precision = 3)
    public BigDecimal getBspphyPAreaPhysical() {
        return bspphyPAreaPhysical;
    }

    public void setBspphyPAreaPhysical(BigDecimal bspphyPAreaPhysical) {
        this.bspphyPAreaPhysical = bspphyPAreaPhysical;
    }

    @Basic
    @Column(name = "BSPSRP_PAreaSrp", nullable = true, precision = 3)
    public BigDecimal getBspsrpPAreaSrp() {
        return bspsrpPAreaSrp;
    }

    public void setBspsrpPAreaSrp(BigDecimal bspsrpPAreaSrp) {
        this.bspsrpPAreaSrp = bspsrpPAreaSrp;
    }

    @Basic
    @Column(name = "BSDTCC_DAreaTotalCC", nullable = true, precision = 3)
    public BigDecimal getBsdtccDAreaTotalCc() {
        return bsdtccDAreaTotalCc;
    }

    public void setBsdtccDAreaTotalCc(BigDecimal bsdtccDAreaTotalCc) {
        this.bsdtccDAreaTotalCc = bsdtccDAreaTotalCc;
    }

    @Basic
    @Column(name = "BSDPHY_DAreaPhysical", nullable = true, precision = 3)
    public BigDecimal getBsdphyDAreaPhysical() {
        return bsdphyDAreaPhysical;
    }

    public void setBsdphyDAreaPhysical(BigDecimal bsdphyDAreaPhysical) {
        this.bsdphyDAreaPhysical = bsdphyDAreaPhysical;
    }

    @Basic
    @Column(name = "BSDSRP_DAreaSrp", nullable = true, precision = 3)
    public BigDecimal getBsdsrpDAreaSrp() {
        return bsdsrpDAreaSrp;
    }

    public void setBsdsrpDAreaSrp(BigDecimal bsdsrpDAreaSrp) {
        this.bsdsrpDAreaSrp = bsdsrpDAreaSrp;
    }

    @Basic
    @Column(name = "NSPTCC_NpPaTotalCC", nullable = true, precision = 3)
    public BigDecimal getNsptccNpPaTotalCc() {
        return nsptccNpPaTotalCc;
    }

    public void setNsptccNpPaTotalCc(BigDecimal nsptccNpPaTotalCc) {
        this.nsptccNpPaTotalCc = nsptccNpPaTotalCc;
    }

    @Basic
    @Column(name = "NSPPHY_NpPaPhyCas", nullable = true, precision = 3)
    public BigDecimal getNspphyNpPaPhyCas() {
        return nspphyNpPaPhyCas;
    }

    public void setNspphyNpPaPhyCas(BigDecimal nspphyNpPaPhyCas) {
        this.nspphyNpPaPhyCas = nspphyNpPaPhyCas;
    }

    @Basic
    @Column(name = "NSPSRP_NpPaSrp", nullable = true, precision = 3)
    public BigDecimal getNspsrpNpPaSrp() {
        return nspsrpNpPaSrp;
    }

    public void setNspsrpNpPaSrp(BigDecimal nspsrpNpPaSrp) {
        this.nspsrpNpPaSrp = nspsrpNpPaSrp;
    }

    @Basic
    @Column(name = "NSDTCC_NpDaTotalCC", nullable = true, precision = 3)
    public BigDecimal getNsdtccNpDaTotalCc() {
        return nsdtccNpDaTotalCc;
    }

    public void setNsdtccNpDaTotalCc(BigDecimal nsdtccNpDaTotalCc) {
        this.nsdtccNpDaTotalCc = nsdtccNpDaTotalCc;
    }

    @Basic
    @Column(name = "NSDPHY_NpDaTotalCC", nullable = true, precision = 3)
    public BigDecimal getNsdphyNpDaTotalCc() {
        return nsdphyNpDaTotalCc;
    }

    public void setNsdphyNpDaTotalCc(BigDecimal nsdphyNpDaTotalCc) {
        this.nsdphyNpDaTotalCc = nsdphyNpDaTotalCc;
    }

    @Basic
    @Column(name = "NSDSRP_NpDaSrp", nullable = true, precision = 3)
    public BigDecimal getNsdsrpNpDaSrp() {
        return nsdsrpNpDaSrp;
    }

    public void setNsdsrpNpDaSrp(BigDecimal nsdsrpNpDaSrp) {
        this.nsdsrpNpDaSrp = nsdsrpNpDaSrp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BowrspBonusSystemWorkFilebySource that = (BowrspBonusSystemWorkFilebySource) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bscoidCompany != null ? !bscoidCompany.equals(that.bscoidCompany) : that.bscoidCompany != null)
            return false;
        if (bsdivDivision != null ? !bsdivDivision.equals(that.bsdivDivision) : that.bsdivDivision != null)
            return false;
        if (bsareaArea != null ? !bsareaArea.equals(that.bsareaArea) : that.bsareaArea != null) return false;
        if (bsctlDistributorControl != null ? !bsctlDistributorControl.equals(that.bsctlDistributorControl) : that.bsctlDistributorControl != null)
            return false;
        if (bsordsOrderSourceCode != null ? !bsordsOrderSourceCode.equals(that.bsordsOrderSourceCode) : that.bsordsOrderSourceCode != null)
            return false;
        if (bsshpsShippingSourceCode != null ? !bsshpsShippingSourceCode.equals(that.bsshpsShippingSourceCode) : that.bsshpsShippingSourceCode != null)
            return false;
        if (bsjanJanCc != null ? !bsjanJanCc.equals(that.bsjanJanCc) : that.bsjanJanCc != null) return false;
        if (bsfebFebCc != null ? !bsfebFebCc.equals(that.bsfebFebCc) : that.bsfebFebCc != null) return false;
        if (bsmarMarCc != null ? !bsmarMarCc.equals(that.bsmarMarCc) : that.bsmarMarCc != null) return false;
        if (bsaprAprCc != null ? !bsaprAprCc.equals(that.bsaprAprCc) : that.bsaprAprCc != null) return false;
        if (bsmayMayCc != null ? !bsmayMayCc.equals(that.bsmayMayCc) : that.bsmayMayCc != null) return false;
        if (bsjunJunCc != null ? !bsjunJunCc.equals(that.bsjunJunCc) : that.bsjunJunCc != null) return false;
        if (bsjlyJlyCc != null ? !bsjlyJlyCc.equals(that.bsjlyJlyCc) : that.bsjlyJlyCc != null) return false;
        if (bsaugAugCc != null ? !bsaugAugCc.equals(that.bsaugAugCc) : that.bsaugAugCc != null) return false;
        if (bssepSepCc != null ? !bssepSepCc.equals(that.bssepSepCc) : that.bssepSepCc != null) return false;
        if (bsoctOctCc != null ? !bsoctOctCc.equals(that.bsoctOctCc) : that.bsoctOctCc != null) return false;
        if (bsnovNovCc != null ? !bsnovNovCc.equals(that.bsnovNovCc) : that.bsnovNovCc != null) return false;
        if (bsdecDecCc != null ? !bsdecDecCc.equals(that.bsdecDecCc) : that.bsdecDecCc != null) return false;
        if (bsyrccAreaTotalCc != null ? !bsyrccAreaTotalCc.equals(that.bsyrccAreaTotalCc) : that.bsyrccAreaTotalCc != null)
            return false;
        if (bsptccPAreaTotalCc != null ? !bsptccPAreaTotalCc.equals(that.bsptccPAreaTotalCc) : that.bsptccPAreaTotalCc != null)
            return false;
        if (bspphyPAreaPhysical != null ? !bspphyPAreaPhysical.equals(that.bspphyPAreaPhysical) : that.bspphyPAreaPhysical != null)
            return false;
        if (bspsrpPAreaSrp != null ? !bspsrpPAreaSrp.equals(that.bspsrpPAreaSrp) : that.bspsrpPAreaSrp != null)
            return false;
        if (bsdtccDAreaTotalCc != null ? !bsdtccDAreaTotalCc.equals(that.bsdtccDAreaTotalCc) : that.bsdtccDAreaTotalCc != null)
            return false;
        if (bsdphyDAreaPhysical != null ? !bsdphyDAreaPhysical.equals(that.bsdphyDAreaPhysical) : that.bsdphyDAreaPhysical != null)
            return false;
        if (bsdsrpDAreaSrp != null ? !bsdsrpDAreaSrp.equals(that.bsdsrpDAreaSrp) : that.bsdsrpDAreaSrp != null)
            return false;
        if (nsptccNpPaTotalCc != null ? !nsptccNpPaTotalCc.equals(that.nsptccNpPaTotalCc) : that.nsptccNpPaTotalCc != null)
            return false;
        if (nspphyNpPaPhyCas != null ? !nspphyNpPaPhyCas.equals(that.nspphyNpPaPhyCas) : that.nspphyNpPaPhyCas != null)
            return false;
        if (nspsrpNpPaSrp != null ? !nspsrpNpPaSrp.equals(that.nspsrpNpPaSrp) : that.nspsrpNpPaSrp != null)
            return false;
        if (nsdtccNpDaTotalCc != null ? !nsdtccNpDaTotalCc.equals(that.nsdtccNpDaTotalCc) : that.nsdtccNpDaTotalCc != null)
            return false;
        if (nsdphyNpDaTotalCc != null ? !nsdphyNpDaTotalCc.equals(that.nsdphyNpDaTotalCc) : that.nsdphyNpDaTotalCc != null)
            return false;
        if (nsdsrpNpDaSrp != null ? !nsdsrpNpDaSrp.equals(that.nsdsrpNpDaSrp) : that.nsdsrpNpDaSrp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bscoidCompany != null ? bscoidCompany.hashCode() : 0);
        result = 31 * result + (bsdivDivision != null ? bsdivDivision.hashCode() : 0);
        result = 31 * result + (bsareaArea != null ? bsareaArea.hashCode() : 0);
        result = 31 * result + (bsctlDistributorControl != null ? bsctlDistributorControl.hashCode() : 0);
        result = 31 * result + (bsordsOrderSourceCode != null ? bsordsOrderSourceCode.hashCode() : 0);
        result = 31 * result + (bsshpsShippingSourceCode != null ? bsshpsShippingSourceCode.hashCode() : 0);
        result = 31 * result + (bsjanJanCc != null ? bsjanJanCc.hashCode() : 0);
        result = 31 * result + (bsfebFebCc != null ? bsfebFebCc.hashCode() : 0);
        result = 31 * result + (bsmarMarCc != null ? bsmarMarCc.hashCode() : 0);
        result = 31 * result + (bsaprAprCc != null ? bsaprAprCc.hashCode() : 0);
        result = 31 * result + (bsmayMayCc != null ? bsmayMayCc.hashCode() : 0);
        result = 31 * result + (bsjunJunCc != null ? bsjunJunCc.hashCode() : 0);
        result = 31 * result + (bsjlyJlyCc != null ? bsjlyJlyCc.hashCode() : 0);
        result = 31 * result + (bsaugAugCc != null ? bsaugAugCc.hashCode() : 0);
        result = 31 * result + (bssepSepCc != null ? bssepSepCc.hashCode() : 0);
        result = 31 * result + (bsoctOctCc != null ? bsoctOctCc.hashCode() : 0);
        result = 31 * result + (bsnovNovCc != null ? bsnovNovCc.hashCode() : 0);
        result = 31 * result + (bsdecDecCc != null ? bsdecDecCc.hashCode() : 0);
        result = 31 * result + (bsyrccAreaTotalCc != null ? bsyrccAreaTotalCc.hashCode() : 0);
        result = 31 * result + (bsptccPAreaTotalCc != null ? bsptccPAreaTotalCc.hashCode() : 0);
        result = 31 * result + (bspphyPAreaPhysical != null ? bspphyPAreaPhysical.hashCode() : 0);
        result = 31 * result + (bspsrpPAreaSrp != null ? bspsrpPAreaSrp.hashCode() : 0);
        result = 31 * result + (bsdtccDAreaTotalCc != null ? bsdtccDAreaTotalCc.hashCode() : 0);
        result = 31 * result + (bsdphyDAreaPhysical != null ? bsdphyDAreaPhysical.hashCode() : 0);
        result = 31 * result + (bsdsrpDAreaSrp != null ? bsdsrpDAreaSrp.hashCode() : 0);
        result = 31 * result + (nsptccNpPaTotalCc != null ? nsptccNpPaTotalCc.hashCode() : 0);
        result = 31 * result + (nspphyNpPaPhyCas != null ? nspphyNpPaPhyCas.hashCode() : 0);
        result = 31 * result + (nspsrpNpPaSrp != null ? nspsrpNpPaSrp.hashCode() : 0);
        result = 31 * result + (nsdtccNpDaTotalCc != null ? nsdtccNpDaTotalCc.hashCode() : 0);
        result = 31 * result + (nsdphyNpDaTotalCc != null ? nsdphyNpDaTotalCc.hashCode() : 0);
        result = 31 * result + (nsdsrpNpDaSrp != null ? nsdsrpNpDaSrp.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"BowrspBonusSystemWorkFilebySource\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"bscoidCompany\":\"" + bscoidCompany + "\""
                + ",                         \"bsdivDivision\":\"" + bsdivDivision + "\""
                + ",                         \"bsareaArea\":\"" + bsareaArea + "\""
                + ",                         \"bsctlDistributorControl\":\"" + bsctlDistributorControl + "\""
                + ",                         \"bsordsOrderSourceCode\":\"" + bsordsOrderSourceCode + "\""
                + ",                         \"bsshpsShippingSourceCode\":\"" + bsshpsShippingSourceCode + "\""
                + ",                         \"bsjanJanCc\":\"" + bsjanJanCc + "\""
                + ",                         \"bsfebFebCc\":\"" + bsfebFebCc + "\""
                + ",                         \"bsmarMarCc\":\"" + bsmarMarCc + "\""
                + ",                         \"bsaprAprCc\":\"" + bsaprAprCc + "\""
                + ",                         \"bsmayMayCc\":\"" + bsmayMayCc + "\""
                + ",                         \"bsjunJunCc\":\"" + bsjunJunCc + "\""
                + ",                         \"bsjlyJlyCc\":\"" + bsjlyJlyCc + "\""
                + ",                         \"bsaugAugCc\":\"" + bsaugAugCc + "\""
                + ",                         \"bssepSepCc\":\"" + bssepSepCc + "\""
                + ",                         \"bsoctOctCc\":\"" + bsoctOctCc + "\""
                + ",                         \"bsnovNovCc\":\"" + bsnovNovCc + "\""
                + ",                         \"bsdecDecCc\":\"" + bsdecDecCc + "\""
                + ",                         \"bsyrccAreaTotalCc\":\"" + bsyrccAreaTotalCc + "\""
                + ",                         \"bsptccPAreaTotalCc\":\"" + bsptccPAreaTotalCc + "\""
                + ",                         \"bspphyPAreaPhysical\":\"" + bspphyPAreaPhysical + "\""
                + ",                         \"bspsrpPAreaSrp\":\"" + bspsrpPAreaSrp + "\""
                + ",                         \"bsdtccDAreaTotalCc\":\"" + bsdtccDAreaTotalCc + "\""
                + ",                         \"bsdphyDAreaPhysical\":\"" + bsdphyDAreaPhysical + "\""
                + ",                         \"bsdsrpDAreaSrp\":\"" + bsdsrpDAreaSrp + "\""
                + ",                         \"nsptccNpPaTotalCc\":\"" + nsptccNpPaTotalCc + "\""
                + ",                         \"nspphyNpPaPhyCas\":\"" + nspphyNpPaPhyCas + "\""
                + ",                         \"nspsrpNpPaSrp\":\"" + nspsrpNpPaSrp + "\""
                + ",                         \"nsdtccNpDaTotalCc\":\"" + nsdtccNpDaTotalCc + "\""
                + ",                         \"nsdphyNpDaTotalCc\":\"" + nsdphyNpDaTotalCc + "\""
                + ",                         \"nsdsrpNpDaSrp\":\"" + nsdsrpNpDaSrp + "\""
                + "}}";
    }
}
