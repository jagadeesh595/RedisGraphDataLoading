package com.ns.dataloading.entity;

import javax.persistence.*;

@Entity
@Table(name = "DSDCDP_FLComDistributor")
public class DsdcdpFlComDistributor {
    private Long id;
    private Long dcctlDistributorControl;
    private Integer dcpyrProcessYear;
    private Integer dcpmoProcessMonth;

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
    @Column(name = "DCCTL_DistributorControl", nullable = false)
    public Long getDcctlDistributorControl() {
        return dcctlDistributorControl;
    }

    public void setDcctlDistributorControl(Long dcctlDistributorControl) {
        this.dcctlDistributorControl = dcctlDistributorControl;
    }

    @Basic
    @Column(name = "DCPYR_ProcessYear", nullable = true)
    public Integer getDcpyrProcessYear() {
        return dcpyrProcessYear;
    }

    public void setDcpyrProcessYear(Integer dcpyrProcessYear) {
        this.dcpyrProcessYear = dcpyrProcessYear;
    }

    @Basic
    @Column(name = "DCPMO_ProcessMonth", nullable = true)
    public Integer getDcpmoProcessMonth() {
        return dcpmoProcessMonth;
    }

    public void setDcpmoProcessMonth(Integer dcpmoProcessMonth) {
        this.dcpmoProcessMonth = dcpmoProcessMonth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DsdcdpFlComDistributor that = (DsdcdpFlComDistributor) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dcctlDistributorControl != null ? !dcctlDistributorControl.equals(that.dcctlDistributorControl) : that.dcctlDistributorControl != null)
            return false;
        if (dcpyrProcessYear != null ? !dcpyrProcessYear.equals(that.dcpyrProcessYear) : that.dcpyrProcessYear != null)
            return false;
        if (dcpmoProcessMonth != null ? !dcpmoProcessMonth.equals(that.dcpmoProcessMonth) : that.dcpmoProcessMonth != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dcctlDistributorControl != null ? dcctlDistributorControl.hashCode() : 0);
        result = 31 * result + (dcpyrProcessYear != null ? dcpyrProcessYear.hashCode() : 0);
        result = 31 * result + (dcpmoProcessMonth != null ? dcpmoProcessMonth.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"DsdcdpFlComDistributor\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"dcctlDistributorControl\":\"" + dcctlDistributorControl + "\""
                + ",                         \"dcpyrProcessYear\":\"" + dcpyrProcessYear + "\""
                + ",                         \"dcpmoProcessMonth\":\"" + dcpmoProcessMonth + "\""
                + "}}";
    }
}
