package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("GMBONP_BonusSystemWorkFile")
public class GmbonpBonusSystemWorkFile implements Serializable {
    private Long id;
    private String gbcoidCompany;
    private Long gbareaArea;
    private Long gbctlDistributorControl;
    private BigDecimal gbyrccAreaTotalCc;
    private BigDecimal gbptccPAreaTotalCc;
    private BigDecimal gbpphyPAreaPhysical;
    private BigDecimal gbbsrpBelowLevelSrp;
    private BigDecimal gbasrpAboveLevelSrp;
    private BigDecimal gbdtccDAreaTotalCc;
    private Integer gbatofTotalOfProduct;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "GBCOID_Company", nullable = true, length = 15)
    public String getGbcoidCompany() {
        return gbcoidCompany;
    }

    public void setGbcoidCompany(String gbcoidCompany) {
        this.gbcoidCompany = gbcoidCompany;
    }

    // @Basic
    // @Column(name = "GBAREA_Area", nullable = true)
    public Long getGbareaArea() {
        return gbareaArea;
    }

    public void setGbareaArea(Long gbareaArea) {
        this.gbareaArea = gbareaArea;
    }

    // @Basic
    // @Column(name = "GBCTL_DistributorControl", nullable = false)
    public Long getGbctlDistributorControl() {
        return gbctlDistributorControl;
    }

    public void setGbctlDistributorControl(Long gbctlDistributorControl) {
        this.gbctlDistributorControl = gbctlDistributorControl;
    }

    // @Basic
    // @Column(name = "GBYRCC_AreaTotalCC", nullable = true, precision = 3)
    public BigDecimal getGbyrccAreaTotalCc() {
        return gbyrccAreaTotalCc;
    }

    public void setGbyrccAreaTotalCc(BigDecimal gbyrccAreaTotalCc) {
        this.gbyrccAreaTotalCc = gbyrccAreaTotalCc;
    }

    // @Basic
    // @Column(name = "GBPTCC_PAreaTotalCC", nullable = true, precision = 3)
    public BigDecimal getGbptccPAreaTotalCc() {
        return gbptccPAreaTotalCc;
    }

    public void setGbptccPAreaTotalCc(BigDecimal gbptccPAreaTotalCc) {
        this.gbptccPAreaTotalCc = gbptccPAreaTotalCc;
    }

    // @Basic
    // @Column(name = "GBPPHY_PAreaPhysical", nullable = true, precision = 3)
    public BigDecimal getGbpphyPAreaPhysical() {
        return gbpphyPAreaPhysical;
    }

    public void setGbpphyPAreaPhysical(BigDecimal gbpphyPAreaPhysical) {
        this.gbpphyPAreaPhysical = gbpphyPAreaPhysical;
    }

    // @Basic
    // @Column(name = "GBBSRP_BelowLevelSrp", nullable = true, precision = 3)
    public BigDecimal getGbbsrpBelowLevelSrp() {
        return gbbsrpBelowLevelSrp;
    }

    public void setGbbsrpBelowLevelSrp(BigDecimal gbbsrpBelowLevelSrp) {
        this.gbbsrpBelowLevelSrp = gbbsrpBelowLevelSrp;
    }

    // @Basic
    // @Column(name = "GBASRP_AboveLevelSrp", nullable = true, precision = 3)
    public BigDecimal getGbasrpAboveLevelSrp() {
        return gbasrpAboveLevelSrp;
    }

    public void setGbasrpAboveLevelSrp(BigDecimal gbasrpAboveLevelSrp) {
        this.gbasrpAboveLevelSrp = gbasrpAboveLevelSrp;
    }

    // @Basic
    // @Column(name = "GBDTCC_DAreaTotalCC", nullable = true, precision = 3)
    public BigDecimal getGbdtccDAreaTotalCc() {
        return gbdtccDAreaTotalCc;
    }

    public void setGbdtccDAreaTotalCc(BigDecimal gbdtccDAreaTotalCc) {
        this.gbdtccDAreaTotalCc = gbdtccDAreaTotalCc;
    }

    // @Basic
    // @Column(name = "GBATOF_TotalOfProduct", nullable = true)
    public Integer getGbatofTotalOfProduct() {
        return gbatofTotalOfProduct;
    }

    public void setGbatofTotalOfProduct(Integer gbatofTotalOfProduct) {
        this.gbatofTotalOfProduct = gbatofTotalOfProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GmbonpBonusSystemWorkFile that = (GmbonpBonusSystemWorkFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (gbcoidCompany != null ? !gbcoidCompany.equals(that.gbcoidCompany) : that.gbcoidCompany != null)
            return false;
        if (gbareaArea != null ? !gbareaArea.equals(that.gbareaArea) : that.gbareaArea != null) return false;
        if (gbctlDistributorControl != null ? !gbctlDistributorControl.equals(that.gbctlDistributorControl) : that.gbctlDistributorControl != null)
            return false;
        if (gbyrccAreaTotalCc != null ? !gbyrccAreaTotalCc.equals(that.gbyrccAreaTotalCc) : that.gbyrccAreaTotalCc != null)
            return false;
        if (gbptccPAreaTotalCc != null ? !gbptccPAreaTotalCc.equals(that.gbptccPAreaTotalCc) : that.gbptccPAreaTotalCc != null)
            return false;
        if (gbpphyPAreaPhysical != null ? !gbpphyPAreaPhysical.equals(that.gbpphyPAreaPhysical) : that.gbpphyPAreaPhysical != null)
            return false;
        if (gbbsrpBelowLevelSrp != null ? !gbbsrpBelowLevelSrp.equals(that.gbbsrpBelowLevelSrp) : that.gbbsrpBelowLevelSrp != null)
            return false;
        if (gbasrpAboveLevelSrp != null ? !gbasrpAboveLevelSrp.equals(that.gbasrpAboveLevelSrp) : that.gbasrpAboveLevelSrp != null)
            return false;
        if (gbdtccDAreaTotalCc != null ? !gbdtccDAreaTotalCc.equals(that.gbdtccDAreaTotalCc) : that.gbdtccDAreaTotalCc != null)
            return false;
        if (gbatofTotalOfProduct != null ? !gbatofTotalOfProduct.equals(that.gbatofTotalOfProduct) : that.gbatofTotalOfProduct != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (gbcoidCompany != null ? gbcoidCompany.hashCode() : 0);
        result = 31 * result + (gbareaArea != null ? gbareaArea.hashCode() : 0);
        result = 31 * result + (gbctlDistributorControl != null ? gbctlDistributorControl.hashCode() : 0);
        result = 31 * result + (gbyrccAreaTotalCc != null ? gbyrccAreaTotalCc.hashCode() : 0);
        result = 31 * result + (gbptccPAreaTotalCc != null ? gbptccPAreaTotalCc.hashCode() : 0);
        result = 31 * result + (gbpphyPAreaPhysical != null ? gbpphyPAreaPhysical.hashCode() : 0);
        result = 31 * result + (gbbsrpBelowLevelSrp != null ? gbbsrpBelowLevelSrp.hashCode() : 0);
        result = 31 * result + (gbasrpAboveLevelSrp != null ? gbasrpAboveLevelSrp.hashCode() : 0);
        result = 31 * result + (gbdtccDAreaTotalCc != null ? gbdtccDAreaTotalCc.hashCode() : 0);
        result = 31 * result + (gbatofTotalOfProduct != null ? gbatofTotalOfProduct.hashCode() : 0);
        return result;
    }

    public GmbonpBonusSystemWorkFile copy() {
        GmbonpBonusSystemWorkFile gmbonp = new GmbonpBonusSystemWorkFile();
        gmbonp.setGbcoidCompany(gbcoidCompany);
        gmbonp.setGbareaArea(gbareaArea);
        gmbonp.setGbctlDistributorControl(gbctlDistributorControl);
        gmbonp.setGbyrccAreaTotalCc(gbyrccAreaTotalCc);
        gmbonp.setGbptccPAreaTotalCc(gbptccPAreaTotalCc);
        gmbonp.setGbpphyPAreaPhysical(gbpphyPAreaPhysical);
        gmbonp.setGbbsrpBelowLevelSrp(gbbsrpBelowLevelSrp);
        gmbonp.setGbbsrpBelowLevelSrp(gbbsrpBelowLevelSrp);
        gmbonp.setGbasrpAboveLevelSrp(getGbasrpAboveLevelSrp());
        gmbonp.setGbdtccDAreaTotalCc(gbdtccDAreaTotalCc);
        gmbonp.setGbatofTotalOfProduct(gbatofTotalOfProduct);
        return gmbonp;
    }

    @Override
    public String toString() {
        return "{\"GmbonpBonusSystemWorkFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"gbcoidCompany\":\"" + gbcoidCompany + "\""
                + ",                         \"gbareaArea\":\"" + gbareaArea + "\""
                + ",                         \"gbctlDistributorControl\":\"" + gbctlDistributorControl + "\""
                + ",                         \"gbyrccAreaTotalCc\":\"" + gbyrccAreaTotalCc + "\""
                + ",                         \"gbptccPAreaTotalCc\":\"" + gbptccPAreaTotalCc + "\""
                + ",                         \"gbpphyPAreaPhysical\":\"" + gbpphyPAreaPhysical + "\""
                + ",                         \"gbbsrpBelowLevelSrp\":\"" + gbbsrpBelowLevelSrp + "\""
                + ",                         \"gbasrpAboveLevelSrp\":\"" + gbasrpAboveLevelSrp + "\""
                + ",                         \"gbdtccDAreaTotalCc\":\"" + gbdtccDAreaTotalCc + "\""
                + ",                         \"gbatofTotalOfProduct\":\"" + gbatofTotalOfProduct + "\""
                + "}}";
    }
}
