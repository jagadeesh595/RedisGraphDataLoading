package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "BOFGVP_ForeverGivingMaster")
public class BofgvpForeverGivingMaster {
    private Long id;
    private String fgisocIsoCode;
    private Long fgctlControl;
    private String fgdstsDonationSts;
    private Integer fgpercPercentOfBonus;
    private BigDecimal fgminaMinimumAmount;
    private BigDecimal fgmaxaMaximumAmount;
    private BigDecimal fgfamtFixedDonationAmount;
    private Integer fgminpMinimumPercent;
    private Integer fgmaxpMaximumPercent;
    private String fgpmyrValidUntilMoYr;
    private String fgcgidLastChangedBy;
    private String fgcdteLastChangeCcDate;

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
    @Column(name = "FGISOC_ISOCode", nullable = true, length = 15)
    public String getFgisocIsoCode() {
        return fgisocIsoCode;
    }

    public void setFgisocIsoCode(String fgisocIsoCode) {
        this.fgisocIsoCode = fgisocIsoCode;
    }

    @Basic
    @Column(name = "FGCTL_Control", nullable = false)
    public Long getFgctlControl() {
        return fgctlControl;
    }

    public void setFgctlControl(Long fgctlControl) {
        this.fgctlControl = fgctlControl;
    }

    @Basic
    @Column(name = "FGDSTS_DonationSts", nullable = true, length = 1)
    public String getFgdstsDonationSts() {
        return fgdstsDonationSts;
    }

    public void setFgdstsDonationSts(String fgdstsDonationSts) {
        this.fgdstsDonationSts = fgdstsDonationSts;
    }

    @Basic
    @Column(name = "FGPERC_PercentOfBonus", nullable = true)
    public Integer getFgpercPercentOfBonus() {
        return fgpercPercentOfBonus;
    }

    public void setFgpercPercentOfBonus(Integer fgpercPercentOfBonus) {
        this.fgpercPercentOfBonus = fgpercPercentOfBonus;
    }

    @Basic
    @Column(name = "FGMINA_MinimumAmount", nullable = true, precision = 2)
    public BigDecimal getFgminaMinimumAmount() {
        return fgminaMinimumAmount;
    }

    public void setFgminaMinimumAmount(BigDecimal fgminaMinimumAmount) {
        this.fgminaMinimumAmount = fgminaMinimumAmount;
    }

    @Basic
    @Column(name = "FGMAXA_MaximumAmount", nullable = true, precision = 2)
    public BigDecimal getFgmaxaMaximumAmount() {
        return fgmaxaMaximumAmount;
    }

    public void setFgmaxaMaximumAmount(BigDecimal fgmaxaMaximumAmount) {
        this.fgmaxaMaximumAmount = fgmaxaMaximumAmount;
    }

    @Basic
    @Column(name = "FGFAMT_FixedDonationAmount", nullable = true, precision = 2)
    public BigDecimal getFgfamtFixedDonationAmount() {
        return fgfamtFixedDonationAmount;
    }

    public void setFgfamtFixedDonationAmount(BigDecimal fgfamtFixedDonationAmount) {
        this.fgfamtFixedDonationAmount = fgfamtFixedDonationAmount;
    }

    @Basic
    @Column(name = "FGMINP_MinimumPercent", nullable = true)
    public Integer getFgminpMinimumPercent() {
        return fgminpMinimumPercent;
    }

    public void setFgminpMinimumPercent(Integer fgminpMinimumPercent) {
        this.fgminpMinimumPercent = fgminpMinimumPercent;
    }

    @Basic
    @Column(name = "FGMAXP_MaximumPercent", nullable = true)
    public Integer getFgmaxpMaximumPercent() {
        return fgmaxpMaximumPercent;
    }

    public void setFgmaxpMaximumPercent(Integer fgmaxpMaximumPercent) {
        this.fgmaxpMaximumPercent = fgmaxpMaximumPercent;
    }

    @Basic
    @Column(name = "FGPMYR_ValidUntilMoYr", nullable = true, length = 15)
    public String getFgpmyrValidUntilMoYr() {
        return fgpmyrValidUntilMoYr;
    }

    public void setFgpmyrValidUntilMoYr(String fgpmyrValidUntilMoYr) {
        this.fgpmyrValidUntilMoYr = fgpmyrValidUntilMoYr;
    }

    @Basic
    @Column(name = "FGCGID_LastChangedBy", nullable = true, length = 15)
    public String getFgcgidLastChangedBy() {
        return fgcgidLastChangedBy;
    }

    public void setFgcgidLastChangedBy(String fgcgidLastChangedBy) {
        this.fgcgidLastChangedBy = fgcgidLastChangedBy;
    }

    @Basic
    @Column(name = "FGCDTE_LastChangeCCDate", nullable = true, length = 15)
    public String getFgcdteLastChangeCcDate() {
        return fgcdteLastChangeCcDate;
    }

    public void setFgcdteLastChangeCcDate(String fgcdteLastChangeCcDate) {
        this.fgcdteLastChangeCcDate = fgcdteLastChangeCcDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BofgvpForeverGivingMaster that = (BofgvpForeverGivingMaster) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (fgisocIsoCode != null ? !fgisocIsoCode.equals(that.fgisocIsoCode) : that.fgisocIsoCode != null)
            return false;
        if (fgctlControl != null ? !fgctlControl.equals(that.fgctlControl) : that.fgctlControl != null) return false;
        if (fgdstsDonationSts != null ? !fgdstsDonationSts.equals(that.fgdstsDonationSts) : that.fgdstsDonationSts != null)
            return false;
        if (fgpercPercentOfBonus != null ? !fgpercPercentOfBonus.equals(that.fgpercPercentOfBonus) : that.fgpercPercentOfBonus != null)
            return false;
        if (fgminaMinimumAmount != null ? !fgminaMinimumAmount.equals(that.fgminaMinimumAmount) : that.fgminaMinimumAmount != null)
            return false;
        if (fgmaxaMaximumAmount != null ? !fgmaxaMaximumAmount.equals(that.fgmaxaMaximumAmount) : that.fgmaxaMaximumAmount != null)
            return false;
        if (fgfamtFixedDonationAmount != null ? !fgfamtFixedDonationAmount.equals(that.fgfamtFixedDonationAmount) : that.fgfamtFixedDonationAmount != null)
            return false;
        if (fgminpMinimumPercent != null ? !fgminpMinimumPercent.equals(that.fgminpMinimumPercent) : that.fgminpMinimumPercent != null)
            return false;
        if (fgmaxpMaximumPercent != null ? !fgmaxpMaximumPercent.equals(that.fgmaxpMaximumPercent) : that.fgmaxpMaximumPercent != null)
            return false;
        if (fgpmyrValidUntilMoYr != null ? !fgpmyrValidUntilMoYr.equals(that.fgpmyrValidUntilMoYr) : that.fgpmyrValidUntilMoYr != null)
            return false;
        if (fgcgidLastChangedBy != null ? !fgcgidLastChangedBy.equals(that.fgcgidLastChangedBy) : that.fgcgidLastChangedBy != null)
            return false;
        if (fgcdteLastChangeCcDate != null ? !fgcdteLastChangeCcDate.equals(that.fgcdteLastChangeCcDate) : that.fgcdteLastChangeCcDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (fgisocIsoCode != null ? fgisocIsoCode.hashCode() : 0);
        result = 31 * result + (fgctlControl != null ? fgctlControl.hashCode() : 0);
        result = 31 * result + (fgdstsDonationSts != null ? fgdstsDonationSts.hashCode() : 0);
        result = 31 * result + (fgpercPercentOfBonus != null ? fgpercPercentOfBonus.hashCode() : 0);
        result = 31 * result + (fgminaMinimumAmount != null ? fgminaMinimumAmount.hashCode() : 0);
        result = 31 * result + (fgmaxaMaximumAmount != null ? fgmaxaMaximumAmount.hashCode() : 0);
        result = 31 * result + (fgfamtFixedDonationAmount != null ? fgfamtFixedDonationAmount.hashCode() : 0);
        result = 31 * result + (fgminpMinimumPercent != null ? fgminpMinimumPercent.hashCode() : 0);
        result = 31 * result + (fgmaxpMaximumPercent != null ? fgmaxpMaximumPercent.hashCode() : 0);
        result = 31 * result + (fgpmyrValidUntilMoYr != null ? fgpmyrValidUntilMoYr.hashCode() : 0);
        result = 31 * result + (fgcgidLastChangedBy != null ? fgcgidLastChangedBy.hashCode() : 0);
        result = 31 * result + (fgcdteLastChangeCcDate != null ? fgcdteLastChangeCcDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"BofgvpForeverGivingMaster\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"fgisocIsoCode\":\"" + fgisocIsoCode + "\""
                + ",                         \"fgctlControl\":\"" + fgctlControl + "\""
                + ",                         \"fgdstsDonationSts\":\"" + fgdstsDonationSts + "\""
                + ",                         \"fgpercPercentOfBonus\":\"" + fgpercPercentOfBonus + "\""
                + ",                         \"fgminaMinimumAmount\":\"" + fgminaMinimumAmount + "\""
                + ",                         \"fgmaxaMaximumAmount\":\"" + fgmaxaMaximumAmount + "\""
                + ",                         \"fgfamtFixedDonationAmount\":\"" + fgfamtFixedDonationAmount + "\""
                + ",                         \"fgminpMinimumPercent\":\"" + fgminpMinimumPercent + "\""
                + ",                         \"fgmaxpMaximumPercent\":\"" + fgmaxpMaximumPercent + "\""
                + ",                         \"fgpmyrValidUntilMoYr\":\"" + fgpmyrValidUntilMoYr + "\""
                + ",                         \"fgcgidLastChangedBy\":\"" + fgcgidLastChangedBy + "\""
                + ",                         \"fgcdteLastChangeCcDate\":\"" + fgcdteLastChangeCcDate + "\""
                + "}}";
    }
}
