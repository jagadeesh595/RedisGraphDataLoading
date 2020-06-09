package com.ns.dataloading.entityredis.entity;


import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by rpalamakula on 16-01-2018.
 */
@RedisHash("DSNMOP_TerminatedMgrs")
public class DsnmopTerminatedMgrs implements Serializable {
    private Long id;
    private Long nmctlDistCtl;
    private Long nmspnSponsorCtl;

    @Id
    // @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "NMCTL_DistCtl", nullable = false)
    public Long getNmctlDistCtl() {
        return nmctlDistCtl;
    }

    public void setNmctlDistCtl(Long nmctlDistCtl) {
        this.nmctlDistCtl = nmctlDistCtl;
    }

    // @Basic
    // @Column(name = "NMSPN_SponsorCtl", nullable = false)
    public Long getNmspnSponsorCtl() {
        return nmspnSponsorCtl;
    }

    public void setNmspnSponsorCtl(Long nmspnSponsorCtl) {
        this.nmspnSponsorCtl = nmspnSponsorCtl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DsnmopTerminatedMgrs that = (DsnmopTerminatedMgrs) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nmctlDistCtl != null ? !nmctlDistCtl.equals(that.nmctlDistCtl) : that.nmctlDistCtl != null) return false;
        if (nmspnSponsorCtl != null ? !nmspnSponsorCtl.equals(that.nmspnSponsorCtl) : that.nmspnSponsorCtl != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nmctlDistCtl != null ? nmctlDistCtl.hashCode() : 0);
        result = 31 * result + (nmspnSponsorCtl != null ? nmspnSponsorCtl.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"DsnmopTerminatedMgrs\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"nmctlDistCtl\":\"" + nmctlDistCtl + "\""
                + ",                         \"nmspnSponsorCtl\":\"" + nmspnSponsorCtl + "\""
                + "}}";
    }

    public DsnmopTerminatedMgrs copy() {
        DsnmopTerminatedMgrs d = new DsnmopTerminatedMgrs();
        d.nmctlDistCtl = nmctlDistCtl;
        d.nmspnSponsorCtl = nmspnSponsorCtl;
        return d;
    }

}
