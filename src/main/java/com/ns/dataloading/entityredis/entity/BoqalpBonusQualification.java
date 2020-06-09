package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by rpalamakula on 16-08-2017.
 */
@RedisHash("BOQALP_BonusQualification")
public class BoqalpBonusQualification implements Serializable {
    private  Long id;
    private @Indexed
    Long bqctlDistCtrl;
    private @Indexed Integer bqlayrLastActiveYear;
    private @Indexed Integer bqlamoLastActiveMonth;
    private @Indexed Integer bqcnsaConsecutiveActive;
    private @Indexed Integer bqlqyrLastQualYear;
    private @Indexed Integer bqlqmoLastQualMonth;
    private @Indexed Integer bqcnsqConsecutiveQual;
    private @Indexed String bq4Ccw4CcWaiver;
    private @Indexed String bqldbwLdrshipBonWaiver;
    private @Indexed String bqpaypLdrshipBonElig;
    private @Indexed String memberFile;

    public BoqalpBonusQualification() {
    }

    public BoqalpBonusQualification(Long bqctlDistCtrl, Integer bqlayrLastActiveYear, Integer bqlamoLastActiveMonth, Integer bqcnsaConsecutiveActive, Integer bqlqyrLastQualYear, Integer bqlqmoLastQualMonth, Integer bqcnsqConsecutiveQual, String bq4Ccw4CcWaiver, String bqldbwLdrshipBonWaiver, String bqpaypLdrshipBonElig, String memberFile) {
        this.bqctlDistCtrl = bqctlDistCtrl;
        this.bqlayrLastActiveYear = bqlayrLastActiveYear;
        this.bqlamoLastActiveMonth = bqlamoLastActiveMonth;
        this.bqcnsaConsecutiveActive = bqcnsaConsecutiveActive;
        this.bqlqyrLastQualYear = bqlqyrLastQualYear;
        this.bqlqmoLastQualMonth = bqlqmoLastQualMonth;
        this.bqcnsqConsecutiveQual = bqcnsqConsecutiveQual;
        this.bq4Ccw4CcWaiver = bq4Ccw4CcWaiver;
        this.bqldbwLdrshipBonWaiver = bqldbwLdrshipBonWaiver;
        this.bqpaypLdrshipBonElig = bqpaypLdrshipBonElig;
        this.memberFile = memberFile;
    }

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "BQCTL_DistCtrl", nullable = false)
    public Long getBqctlDistCtrl() {
        return bqctlDistCtrl;
    }

    public void setBqctlDistCtrl(Long bqctlDistCtrl) {
        this.bqctlDistCtrl = bqctlDistCtrl;
    }

    // @Basic
    // @Column(name = "BQLAYR_LastActiveYear", nullable = false)
    public Integer getBqlayrLastActiveYear() {
        return bqlayrLastActiveYear;
    }

    public void setBqlayrLastActiveYear(Integer bqlayrLastActiveYear) {
        this.bqlayrLastActiveYear = bqlayrLastActiveYear;
    }

    // @Basic
    // @Column(name = "BQLAMO_LastActiveMonth", nullable = false)
    public Integer getBqlamoLastActiveMonth() {
        return bqlamoLastActiveMonth;
    }

    public void setBqlamoLastActiveMonth(Integer bqlamoLastActiveMonth) {
        this.bqlamoLastActiveMonth = bqlamoLastActiveMonth;
    }

    // @Basic
    // @Column(name = "BQCNSA_ConsecutiveActive", nullable = false)
    public Integer getBqcnsaConsecutiveActive() {
        return bqcnsaConsecutiveActive;
    }

    public void setBqcnsaConsecutiveActive(Integer bqcnsaConsecutiveActive) {
        this.bqcnsaConsecutiveActive = bqcnsaConsecutiveActive;
    }

    // @Basic
    // @Column(name = "BQLQYR_LastQualYear", nullable = false)
    public Integer getBqlqyrLastQualYear() {
        return bqlqyrLastQualYear;
    }

    public void setBqlqyrLastQualYear(Integer bqlqyrLastQualYear) {
        this.bqlqyrLastQualYear = bqlqyrLastQualYear;
    }

    // @Basic
    // @Column(name = "BQLQMO_LastQualMonth", nullable = false)
    public Integer getBqlqmoLastQualMonth() {
        return bqlqmoLastQualMonth;
    }

    public void setBqlqmoLastQualMonth(Integer bqlqmoLastQualMonth) {
        this.bqlqmoLastQualMonth = bqlqmoLastQualMonth;
    }

    // @Basic
    // @Column(name = "BQCNSQ_ConsecutiveQual", nullable = false)
    public Integer getBqcnsqConsecutiveQual() {
        return bqcnsqConsecutiveQual;
    }

    public void setBqcnsqConsecutiveQual(Integer bqcnsqConsecutiveQual) {
        this.bqcnsqConsecutiveQual = bqcnsqConsecutiveQual;
    }

    // @Basic
    // @Column(name = "BQ4CCW_4ccWaiver", nullable = false, length = 15)
    public String getBq4Ccw4CcWaiver() {
        return bq4Ccw4CcWaiver;
    }

    public void setBq4Ccw4CcWaiver(String bq4Ccw4CcWaiver) {
        this.bq4Ccw4CcWaiver = bq4Ccw4CcWaiver;
    }

    // @Basic
    // @Column(name = "BQLDBW_LdrshipBonWaiver", nullable = false, length = 15)
    public String getBqldbwLdrshipBonWaiver() {
        return bqldbwLdrshipBonWaiver;
    }

    public void setBqldbwLdrshipBonWaiver(String bqldbwLdrshipBonWaiver) {
        this.bqldbwLdrshipBonWaiver = bqldbwLdrshipBonWaiver;
    }

    // @Basic
    // @Column(name = "BQPAYP_LdrshipBonElig", nullable = false, length = 15)
    public String getBqpaypLdrshipBonElig() {
        return bqpaypLdrshipBonElig;
    }

    public void setBqpaypLdrshipBonElig(String bqpaypLdrshipBonElig) {
        this.bqpaypLdrshipBonElig = bqpaypLdrshipBonElig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoqalpBonusQualification that = (BoqalpBonusQualification) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bqctlDistCtrl != null ? !bqctlDistCtrl.equals(that.bqctlDistCtrl) : that.bqctlDistCtrl != null)
            return false;
        if (bqlayrLastActiveYear != null ? !bqlayrLastActiveYear.equals(that.bqlayrLastActiveYear) : that.bqlayrLastActiveYear != null)
            return false;
        if (bqlamoLastActiveMonth != null ? !bqlamoLastActiveMonth.equals(that.bqlamoLastActiveMonth) : that.bqlamoLastActiveMonth != null)
            return false;
        if (bqcnsaConsecutiveActive != null ? !bqcnsaConsecutiveActive.equals(that.bqcnsaConsecutiveActive) : that.bqcnsaConsecutiveActive != null)
            return false;
        if (bqlqyrLastQualYear != null ? !bqlqyrLastQualYear.equals(that.bqlqyrLastQualYear) : that.bqlqyrLastQualYear != null)
            return false;
        if (bqlqmoLastQualMonth != null ? !bqlqmoLastQualMonth.equals(that.bqlqmoLastQualMonth) : that.bqlqmoLastQualMonth != null)
            return false;
        if (bqcnsqConsecutiveQual != null ? !bqcnsqConsecutiveQual.equals(that.bqcnsqConsecutiveQual) : that.bqcnsqConsecutiveQual != null)
            return false;
        if (bq4Ccw4CcWaiver != null ? !bq4Ccw4CcWaiver.equals(that.bq4Ccw4CcWaiver) : that.bq4Ccw4CcWaiver != null)
            return false;
        if (bqldbwLdrshipBonWaiver != null ? !bqldbwLdrshipBonWaiver.equals(that.bqldbwLdrshipBonWaiver) : that.bqldbwLdrshipBonWaiver != null)
            return false;
        if (bqpaypLdrshipBonElig != null ? !bqpaypLdrshipBonElig.equals(that.bqpaypLdrshipBonElig) : that.bqpaypLdrshipBonElig != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bqctlDistCtrl != null ? bqctlDistCtrl.hashCode() : 0);
        result = 31 * result + (bqlayrLastActiveYear != null ? bqlayrLastActiveYear.hashCode() : 0);
        result = 31 * result + (bqlamoLastActiveMonth != null ? bqlamoLastActiveMonth.hashCode() : 0);
        result = 31 * result + (bqcnsaConsecutiveActive != null ? bqcnsaConsecutiveActive.hashCode() : 0);
        result = 31 * result + (bqlqyrLastQualYear != null ? bqlqyrLastQualYear.hashCode() : 0);
        result = 31 * result + (bqlqmoLastQualMonth != null ? bqlqmoLastQualMonth.hashCode() : 0);
        result = 31 * result + (bqcnsqConsecutiveQual != null ? bqcnsqConsecutiveQual.hashCode() : 0);
        result = 31 * result + (bq4Ccw4CcWaiver != null ? bq4Ccw4CcWaiver.hashCode() : 0);
        result = 31 * result + (bqldbwLdrshipBonWaiver != null ? bqldbwLdrshipBonWaiver.hashCode() : 0);
        result = 31 * result + (bqpaypLdrshipBonElig != null ? bqpaypLdrshipBonElig.hashCode() : 0);
        return result;
    }


    // @Basic
    // @Column(name = "MemberFile", nullable = true, length = 10)
    public String getMemberFile() {
        return memberFile;
    }

    public void setMemberFile(String memberFile) {
        this.memberFile = memberFile;
    }

    @Override
    public String toString() {
        return "{\"BoqalpBonusQualification\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"bqctlDistCtrl\":\"" + bqctlDistCtrl + "\""
                + ",                         \"bqlayrLastActiveYear\":\"" + bqlayrLastActiveYear + "\""
                + ",                         \"bqlamoLastActiveMonth\":\"" + bqlamoLastActiveMonth + "\""
                + ",                         \"bqcnsaConsecutiveActive\":\"" + bqcnsaConsecutiveActive + "\""
                + ",                         \"bqlqyrLastQualYear\":\"" + bqlqyrLastQualYear + "\""
                + ",                         \"bqlqmoLastQualMonth\":\"" + bqlqmoLastQualMonth + "\""
                + ",                         \"bqcnsqConsecutiveQual\":\"" + bqcnsqConsecutiveQual + "\""
                + ",                         \"bq4Ccw4CcWaiver\":\"" + bq4Ccw4CcWaiver + "\""
                + ",                         \"bqldbwLdrshipBonWaiver\":\"" + bqldbwLdrshipBonWaiver + "\""
                + ",                         \"bqpaypLdrshipBonElig\":\"" + bqpaypLdrshipBonElig + "\""
                + ",                         \"memberFile\":\"" + memberFile + "\""
                + "}}";
    }

}
