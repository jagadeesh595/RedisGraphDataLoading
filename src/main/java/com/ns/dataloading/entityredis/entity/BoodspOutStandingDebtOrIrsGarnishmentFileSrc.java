package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("BOODSP_OutStandingDebtOrIrsGarnishmentFileSrc")
public class BoodspOutStandingDebtOrIrsGarnishmentFileSrc  implements Serializable {
    private Long id;
    private Long bsctlDistributorControl;
    private String bstypeRecordType;
    private Long bsordsOrderSourceCode;
    private Long bsshpsShippingSourceCode;
    private BigDecimal bsbalCurrentBalance;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "BSCTL_DistributorControl", nullable = false)
    public Long getBsctlDistributorControl() {
        return bsctlDistributorControl;
    }

    public void setBsctlDistributorControl(Long bsctlDistributorControl) {
        this.bsctlDistributorControl = bsctlDistributorControl;
    }

    // @Basic
    // @Column(name = "BSTYPE_RecordType", nullable = true, length = 1)
    public String getBstypeRecordType() {
        return bstypeRecordType;
    }

    public void setBstypeRecordType(String bstypeRecordType) {
        this.bstypeRecordType = bstypeRecordType;
    }

    // @Basic
    // @Column(name = "BSORDS_OrderSourceCode", nullable = true)
    public Long getBsordsOrderSourceCode() {
        return bsordsOrderSourceCode;
    }

    public void setBsordsOrderSourceCode(Long bsordsOrderSourceCode) {
        this.bsordsOrderSourceCode = bsordsOrderSourceCode;
    }

    // @Basic
    // @Column(name = "BSSHPS_ShippingSourceCode", nullable = true)
    public Long getBsshpsShippingSourceCode() {
        return bsshpsShippingSourceCode;
    }

    public void setBsshpsShippingSourceCode(Long bsshpsShippingSourceCode) {
        this.bsshpsShippingSourceCode = bsshpsShippingSourceCode;
    }

    // @Basic
    // @Column(name = "BSBAL_CurrentBalance", nullable = true, precision = 3)
    public BigDecimal getBsbalCurrentBalance() {
        return bsbalCurrentBalance;
    }

    public void setBsbalCurrentBalance(BigDecimal bsbalCurrentBalance) {
        this.bsbalCurrentBalance = bsbalCurrentBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoodspOutStandingDebtOrIrsGarnishmentFileSrc that = (BoodspOutStandingDebtOrIrsGarnishmentFileSrc) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bsctlDistributorControl != null ? !bsctlDistributorControl.equals(that.bsctlDistributorControl) : that.bsctlDistributorControl != null)
            return false;
        if (bstypeRecordType != null ? !bstypeRecordType.equals(that.bstypeRecordType) : that.bstypeRecordType != null)
            return false;
        if (bsordsOrderSourceCode != null ? !bsordsOrderSourceCode.equals(that.bsordsOrderSourceCode) : that.bsordsOrderSourceCode != null)
            return false;
        if (bsshpsShippingSourceCode != null ? !bsshpsShippingSourceCode.equals(that.bsshpsShippingSourceCode) : that.bsshpsShippingSourceCode != null)
            return false;
        if (bsbalCurrentBalance != null ? !bsbalCurrentBalance.equals(that.bsbalCurrentBalance) : that.bsbalCurrentBalance != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bsctlDistributorControl != null ? bsctlDistributorControl.hashCode() : 0);
        result = 31 * result + (bstypeRecordType != null ? bstypeRecordType.hashCode() : 0);
        result = 31 * result + (bsordsOrderSourceCode != null ? bsordsOrderSourceCode.hashCode() : 0);
        result = 31 * result + (bsshpsShippingSourceCode != null ? bsshpsShippingSourceCode.hashCode() : 0);
        result = 31 * result + (bsbalCurrentBalance != null ? bsbalCurrentBalance.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"BoodspOutStandingDebtOrIrsGarnishmentFileSrc\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"bsctlDistributorControl\":\"" + bsctlDistributorControl + "\""
                + ",                         \"bstypeRecordType\":\"" + bstypeRecordType + "\""
                + ",                         \"bsordsOrderSourceCode\":\"" + bsordsOrderSourceCode + "\""
                + ",                         \"bsshpsShippingSourceCode\":\"" + bsshpsShippingSourceCode + "\""
                + ",                         \"bsbalCurrentBalance\":\"" + bsbalCurrentBalance + "\""
                + "}}";
    }
}
