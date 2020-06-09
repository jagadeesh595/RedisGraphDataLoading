package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "EMREQP_EagleManagerReq")
public class EmreqpEagleManagerReq {
    private Long id;
    private Integer ermgrlManagerLevel;
    private Integer erminMinEagleManagers;
    private BigDecimal ertccrMinTotalCc;
    private BigDecimal ernwccMinNewCc;
    private Integer ernsupMinNewSupv;

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
    @Column(name = "ERMGRL_ManagerLevel", nullable = true)
    public Integer getErmgrlManagerLevel() {
        return ermgrlManagerLevel;
    }

    public void setErmgrlManagerLevel(Integer ermgrlManagerLevel) {
        this.ermgrlManagerLevel = ermgrlManagerLevel;
    }

    @Basic
    @Column(name = "ERMIN_MinEagleManagers", nullable = true)
    public Integer getErminMinEagleManagers() {
        return erminMinEagleManagers;
    }

    public void setErminMinEagleManagers(Integer erminMinEagleManagers) {
        this.erminMinEagleManagers = erminMinEagleManagers;
    }

    @Basic
    @Column(name = "ERTCCR_MinTotalCc", nullable = true, precision = 3)
    public BigDecimal getErtccrMinTotalCc() {
        return ertccrMinTotalCc;
    }

    public void setErtccrMinTotalCc(BigDecimal ertccrMinTotalCc) {
        this.ertccrMinTotalCc = ertccrMinTotalCc;
    }

    @Basic
    @Column(name = "ERNWCC_MinNewCc", nullable = true, precision = 3)
    public BigDecimal getErnwccMinNewCc() {
        return ernwccMinNewCc;
    }

    public void setErnwccMinNewCc(BigDecimal ernwccMinNewCc) {
        this.ernwccMinNewCc = ernwccMinNewCc;
    }

    @Basic
    @Column(name = "ERNSUP_MinNewSupv", nullable = true)
    public Integer getErnsupMinNewSupv() {
        return ernsupMinNewSupv;
    }

    public void setErnsupMinNewSupv(Integer ernsupMinNewSupv) {
        this.ernsupMinNewSupv = ernsupMinNewSupv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmreqpEagleManagerReq that = (EmreqpEagleManagerReq) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ermgrlManagerLevel != null ? !ermgrlManagerLevel.equals(that.ermgrlManagerLevel) : that.ermgrlManagerLevel != null)
            return false;
        if (erminMinEagleManagers != null ? !erminMinEagleManagers.equals(that.erminMinEagleManagers) : that.erminMinEagleManagers != null)
            return false;
        if (ertccrMinTotalCc != null ? !ertccrMinTotalCc.equals(that.ertccrMinTotalCc) : that.ertccrMinTotalCc != null)
            return false;
        if (ernwccMinNewCc != null ? !ernwccMinNewCc.equals(that.ernwccMinNewCc) : that.ernwccMinNewCc != null)
            return false;
        if (ernsupMinNewSupv != null ? !ernsupMinNewSupv.equals(that.ernsupMinNewSupv) : that.ernsupMinNewSupv != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ermgrlManagerLevel != null ? ermgrlManagerLevel.hashCode() : 0);
        result = 31 * result + (erminMinEagleManagers != null ? erminMinEagleManagers.hashCode() : 0);
        result = 31 * result + (ertccrMinTotalCc != null ? ertccrMinTotalCc.hashCode() : 0);
        result = 31 * result + (ernwccMinNewCc != null ? ernwccMinNewCc.hashCode() : 0);
        result = 31 * result + (ernsupMinNewSupv != null ? ernsupMinNewSupv.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"EmreqpEagleManagerReq\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"ermgrlManagerLevel\":\"" + ermgrlManagerLevel + "\""
                + ",                         \"erminMinEagleManagers\":\"" + erminMinEagleManagers + "\""
                + ",                         \"ertccrMinTotalCc\":\"" + ertccrMinTotalCc + "\""
                + ",                         \"ernwccMinNewCc\":\"" + ernwccMinNewCc + "\""
                + ",                         \"ernsupMinNewSupv\":\"" + ernsupMinNewSupv + "\""
                + "}}";
    }
}
