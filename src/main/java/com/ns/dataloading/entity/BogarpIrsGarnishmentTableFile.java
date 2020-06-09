package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "BOGARP_IRSGarnishmentTableFile")
public class BogarpIrsGarnishmentTableFile {
    private Long id;
    private BigDecimal bgsingSingle;
    private BigDecimal bgmarjMarriageJoint;
    private BigDecimal bgumarUnMarried;
    private BigDecimal bgmarsMarriedSeperate;
    private String bgcdatLastChangeDate;
    private String bgcusrLastChangeUser;

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
    @Column(name = "BGSING_Single", nullable = true, precision = 3)
    public BigDecimal getBgsingSingle() {
        return bgsingSingle;
    }

    public void setBgsingSingle(BigDecimal bgsingSingle) {
        this.bgsingSingle = bgsingSingle;
    }

    @Basic
    @Column(name = "BGMARJ_MarriageJoint", nullable = true, precision = 3)
    public BigDecimal getBgmarjMarriageJoint() {
        return bgmarjMarriageJoint;
    }

    public void setBgmarjMarriageJoint(BigDecimal bgmarjMarriageJoint) {
        this.bgmarjMarriageJoint = bgmarjMarriageJoint;
    }

    @Basic
    @Column(name = "BGUMAR_UnMarried", nullable = true, precision = 3)
    public BigDecimal getBgumarUnMarried() {
        return bgumarUnMarried;
    }

    public void setBgumarUnMarried(BigDecimal bgumarUnMarried) {
        this.bgumarUnMarried = bgumarUnMarried;
    }

    @Basic
    @Column(name = "BGMARS_MarriedSeperate", nullable = true, precision = 3)
    public BigDecimal getBgmarsMarriedSeperate() {
        return bgmarsMarriedSeperate;
    }

    public void setBgmarsMarriedSeperate(BigDecimal bgmarsMarriedSeperate) {
        this.bgmarsMarriedSeperate = bgmarsMarriedSeperate;
    }

    @Basic
    @Column(name = "BGCDAT_LastChangeDate", nullable = true, length = 15)
    public String getBgcdatLastChangeDate() {
        return bgcdatLastChangeDate;
    }

    public void setBgcdatLastChangeDate(String bgcdatLastChangeDate) {
        this.bgcdatLastChangeDate = bgcdatLastChangeDate;
    }

    @Basic
    @Column(name = "BGCUSR_LastChangeUser", nullable = true, length = 255)
    public String getBgcusrLastChangeUser() {
        return bgcusrLastChangeUser;
    }

    public void setBgcusrLastChangeUser(String bgcusrLastChangeUser) {
        this.bgcusrLastChangeUser = bgcusrLastChangeUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BogarpIrsGarnishmentTableFile that = (BogarpIrsGarnishmentTableFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bgsingSingle != null ? !bgsingSingle.equals(that.bgsingSingle) : that.bgsingSingle != null) return false;
        if (bgmarjMarriageJoint != null ? !bgmarjMarriageJoint.equals(that.bgmarjMarriageJoint) : that.bgmarjMarriageJoint != null)
            return false;
        if (bgumarUnMarried != null ? !bgumarUnMarried.equals(that.bgumarUnMarried) : that.bgumarUnMarried != null)
            return false;
        if (bgmarsMarriedSeperate != null ? !bgmarsMarriedSeperate.equals(that.bgmarsMarriedSeperate) : that.bgmarsMarriedSeperate != null)
            return false;
        if (bgcdatLastChangeDate != null ? !bgcdatLastChangeDate.equals(that.bgcdatLastChangeDate) : that.bgcdatLastChangeDate != null)
            return false;
        if (bgcusrLastChangeUser != null ? !bgcusrLastChangeUser.equals(that.bgcusrLastChangeUser) : that.bgcusrLastChangeUser != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bgsingSingle != null ? bgsingSingle.hashCode() : 0);
        result = 31 * result + (bgmarjMarriageJoint != null ? bgmarjMarriageJoint.hashCode() : 0);
        result = 31 * result + (bgumarUnMarried != null ? bgumarUnMarried.hashCode() : 0);
        result = 31 * result + (bgmarsMarriedSeperate != null ? bgmarsMarriedSeperate.hashCode() : 0);
        result = 31 * result + (bgcdatLastChangeDate != null ? bgcdatLastChangeDate.hashCode() : 0);
        result = 31 * result + (bgcusrLastChangeUser != null ? bgcusrLastChangeUser.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"BogarpIrsGarnishmentTableFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"bgsingSingle\":\"" + bgsingSingle + "\""
                + ",                         \"bgmarjMarriageJoint\":\"" + bgmarjMarriageJoint + "\""
                + ",                         \"bgumarUnMarried\":\"" + bgumarUnMarried + "\""
                + ",                         \"bgmarsMarriedSeperate\":\"" + bgmarsMarriedSeperate + "\""
                + ",                         \"bgcdatLastChangeDate\":\"" + bgcdatLastChangeDate + "\""
                + ",                         \"bgcusrLastChangeUser\":\"" + bgcusrLastChangeUser + "\""
                + "}}";
    }
}
