package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

@RedisHash("DSMBWP_MonthlyBackupWithHoldingFile")
public class DsmbwpMonthlyBackupWithHoldingFile implements Serializable {
    private Long id;
    private Long mbctlDistributorControl;
    private String mbstatState;
    private String mbcntyCountry;
    private Integer mbpyrProcessingYear;
    private Integer mbpmoProcessingMonth;
    private String mbpidcPaidCycle;
    private String mbwh20BackupWh;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "MBCTL_DistributorControl", nullable = false)
    public Long getMbctlDistributorControl() {
        return mbctlDistributorControl;
    }

    public void setMbctlDistributorControl(Long mbctlDistributorControl) {
        this.mbctlDistributorControl = mbctlDistributorControl;
    }

    // @Basic
    // @Column(name = "MBSTAT_State", nullable = true, length = 255)
    public String getMbstatState() {
        return mbstatState;
    }

    public void setMbstatState(String mbstatState) {
        this.mbstatState = mbstatState;
    }

    // @Basic
    // @Column(name = "MBCNTY_Country", nullable = true, length = 255)
    public String getMbcntyCountry() {
        return mbcntyCountry;
    }

    public void setMbcntyCountry(String mbcntyCountry) {
        this.mbcntyCountry = mbcntyCountry;
    }

    // @Basic
    // @Column(name = "MBPYR_ProcessingYear", nullable = true)
    public Integer getMbpyrProcessingYear() {
        return mbpyrProcessingYear;
    }

    public void setMbpyrProcessingYear(Integer mbpyrProcessingYear) {
        this.mbpyrProcessingYear = mbpyrProcessingYear;
    }

    // @Basic
    // @Column(name = "MBPMO_ProcessingMonth", nullable = true)
    public Integer getMbpmoProcessingMonth() {
        return mbpmoProcessingMonth;
    }

    public void setMbpmoProcessingMonth(Integer mbpmoProcessingMonth) {
        this.mbpmoProcessingMonth = mbpmoProcessingMonth;
    }

    // @Basic
    // @Column(name = "MBPIDC_PaidCycle", nullable = true, length = 1)
    public String getMbpidcPaidCycle() {
        return mbpidcPaidCycle;
    }

    public void setMbpidcPaidCycle(String mbpidcPaidCycle) {
        this.mbpidcPaidCycle = mbpidcPaidCycle;
    }

    // @Basic
    // @Column(name = "MBWH20_BackupWH", nullable = true, length = 1)
    public String getMbwh20BackupWh() {
        return mbwh20BackupWh;
    }

    public void setMbwh20BackupWh(String mbwh20BackupWh) {
        this.mbwh20BackupWh = mbwh20BackupWh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DsmbwpMonthlyBackupWithHoldingFile that = (DsmbwpMonthlyBackupWithHoldingFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (mbctlDistributorControl != null ? !mbctlDistributorControl.equals(that.mbctlDistributorControl) : that.mbctlDistributorControl != null)
            return false;
        if (mbstatState != null ? !mbstatState.equals(that.mbstatState) : that.mbstatState != null) return false;
        if (mbcntyCountry != null ? !mbcntyCountry.equals(that.mbcntyCountry) : that.mbcntyCountry != null)
            return false;
        if (mbpyrProcessingYear != null ? !mbpyrProcessingYear.equals(that.mbpyrProcessingYear) : that.mbpyrProcessingYear != null)
            return false;
        if (mbpmoProcessingMonth != null ? !mbpmoProcessingMonth.equals(that.mbpmoProcessingMonth) : that.mbpmoProcessingMonth != null)
            return false;
        if (mbpidcPaidCycle != null ? !mbpidcPaidCycle.equals(that.mbpidcPaidCycle) : that.mbpidcPaidCycle != null)
            return false;
        if (mbwh20BackupWh != null ? !mbwh20BackupWh.equals(that.mbwh20BackupWh) : that.mbwh20BackupWh != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (mbctlDistributorControl != null ? mbctlDistributorControl.hashCode() : 0);
        result = 31 * result + (mbstatState != null ? mbstatState.hashCode() : 0);
        result = 31 * result + (mbcntyCountry != null ? mbcntyCountry.hashCode() : 0);
        result = 31 * result + (mbpyrProcessingYear != null ? mbpyrProcessingYear.hashCode() : 0);
        result = 31 * result + (mbpmoProcessingMonth != null ? mbpmoProcessingMonth.hashCode() : 0);
        result = 31 * result + (mbpidcPaidCycle != null ? mbpidcPaidCycle.hashCode() : 0);
        result = 31 * result + (mbwh20BackupWh != null ? mbwh20BackupWh.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"DsmbwpMonthlyBackupWithHoldingFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"mbctlDistributorControl\":\"" + mbctlDistributorControl + "\""
                + ",                         \"mbstatState\":\"" + mbstatState + "\""
                + ",                         \"mbcntyCountry\":\"" + mbcntyCountry + "\""
                + ",                         \"mbpyrProcessingYear\":\"" + mbpyrProcessingYear + "\""
                + ",                         \"mbpmoProcessingMonth\":\"" + mbpmoProcessingMonth + "\""
                + ",                         \"mbpidcPaidCycle\":\"" + mbpidcPaidCycle + "\""
                + ",                         \"mbwh20BackupWh\":\"" + mbwh20BackupWh + "\""
                + "}}";
    }
}
