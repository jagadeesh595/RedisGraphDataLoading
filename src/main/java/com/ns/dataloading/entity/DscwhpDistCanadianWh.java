package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "DSCWHP_DistCanadianWh")
public class DscwhpDistCanadianWh {
    private Long id;
    private Long dcctlDistControl;
    private BigDecimal dcpct1PercentLev1;
    private BigDecimal dcamt1AmountLev1;
    private BigDecimal dcpct2PercentLev2;
    private BigDecimal dcamt2AmountLev2;

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
    @Column(name = "DCCTL_DistControl", nullable = false)
    public Long getDcctlDistControl() {
        return dcctlDistControl;
    }

    public void setDcctlDistControl(Long dcctlDistControl) {
        this.dcctlDistControl = dcctlDistControl;
    }

    @Basic
    @Column(name = "DCPCT1_PercentLev1", nullable = true, precision = 3)
    public BigDecimal getDcpct1PercentLev1() {
        return dcpct1PercentLev1;
    }

    public void setDcpct1PercentLev1(BigDecimal dcpct1PercentLev1) {
        this.dcpct1PercentLev1 = dcpct1PercentLev1;
    }

    @Basic
    @Column(name = "DCAMT1_AmountLev1", nullable = true, precision = 3)
    public BigDecimal getDcamt1AmountLev1() {
        return dcamt1AmountLev1;
    }

    public void setDcamt1AmountLev1(BigDecimal dcamt1AmountLev1) {
        this.dcamt1AmountLev1 = dcamt1AmountLev1;
    }

    @Basic
    @Column(name = "DCPCT2_PercentLev2", nullable = true, precision = 3)
    public BigDecimal getDcpct2PercentLev2() {
        return dcpct2PercentLev2;
    }

    public void setDcpct2PercentLev2(BigDecimal dcpct2PercentLev2) {
        this.dcpct2PercentLev2 = dcpct2PercentLev2;
    }

    @Basic
    @Column(name = "DCAMT2_AmountLev2", nullable = true, precision = 3)
    public BigDecimal getDcamt2AmountLev2() {
        return dcamt2AmountLev2;
    }

    public void setDcamt2AmountLev2(BigDecimal dcamt2AmountLev2) {
        this.dcamt2AmountLev2 = dcamt2AmountLev2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DscwhpDistCanadianWh that = (DscwhpDistCanadianWh) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dcctlDistControl != null ? !dcctlDistControl.equals(that.dcctlDistControl) : that.dcctlDistControl != null)
            return false;
        if (dcpct1PercentLev1 != null ? !dcpct1PercentLev1.equals(that.dcpct1PercentLev1) : that.dcpct1PercentLev1 != null)
            return false;
        if (dcamt1AmountLev1 != null ? !dcamt1AmountLev1.equals(that.dcamt1AmountLev1) : that.dcamt1AmountLev1 != null)
            return false;
        if (dcpct2PercentLev2 != null ? !dcpct2PercentLev2.equals(that.dcpct2PercentLev2) : that.dcpct2PercentLev2 != null)
            return false;
        if (dcamt2AmountLev2 != null ? !dcamt2AmountLev2.equals(that.dcamt2AmountLev2) : that.dcamt2AmountLev2 != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dcctlDistControl != null ? dcctlDistControl.hashCode() : 0);
        result = 31 * result + (dcpct1PercentLev1 != null ? dcpct1PercentLev1.hashCode() : 0);
        result = 31 * result + (dcamt1AmountLev1 != null ? dcamt1AmountLev1.hashCode() : 0);
        result = 31 * result + (dcpct2PercentLev2 != null ? dcpct2PercentLev2.hashCode() : 0);
        result = 31 * result + (dcamt2AmountLev2 != null ? dcamt2AmountLev2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"DscwhpDistCanadianWh\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"dcctlDistControl\":\"" + dcctlDistControl + "\""
                + ",                         \"dcpct1PercentLev1\":\"" + dcpct1PercentLev1 + "\""
                + ",                         \"dcamt1AmountLev1\":\"" + dcamt1AmountLev1 + "\""
                + ",                         \"dcpct2PercentLev2\":\"" + dcpct2PercentLev2 + "\""
                + ",                         \"dcamt2AmountLev2\":\"" + dcamt2AmountLev2 + "\""
                + "}}";
    }
}
