package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

@RedisHash("WJPNRCP")

public class Wjpnrcp implements Serializable {
    private Long id;
    private String mscoidCompanyId;
    private String idDistributorId;
    private String name;
    private String email;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "MSCOID_CompanyId", nullable = true, length = 15)
    public String getMscoidCompanyId() {
        return mscoidCompanyId;
    }

    public void setMscoidCompanyId(String mscoidCompanyId) {
        this.mscoidCompanyId = mscoidCompanyId;
    }

    // @Basic
    // @Column(name = "ID_DistributorId", nullable = true, length = 15)
    public String getIdDistributorId() {
        return idDistributorId;
    }

    public void setIdDistributorId(String idDistributorId) {
        this.idDistributorId = idDistributorId;
    }

    // @Basic
    // @Column(name = "NAME", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // @Basic
    // @Column(name = "EMAIL", nullable = true, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wjpnrcp wjpnrcp = (Wjpnrcp) o;

        if (id != null ? !id.equals(wjpnrcp.id) : wjpnrcp.id != null) return false;
        if (mscoidCompanyId != null ? !mscoidCompanyId.equals(wjpnrcp.mscoidCompanyId) : wjpnrcp.mscoidCompanyId != null)
            return false;
        if (idDistributorId != null ? !idDistributorId.equals(wjpnrcp.idDistributorId) : wjpnrcp.idDistributorId != null)
            return false;
        if (name != null ? !name.equals(wjpnrcp.name) : wjpnrcp.name != null) return false;
        if (email != null ? !email.equals(wjpnrcp.email) : wjpnrcp.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (mscoidCompanyId != null ? mscoidCompanyId.hashCode() : 0);
        result = 31 * result + (idDistributorId != null ? idDistributorId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"Wjpnrcp\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"mscoidCompanyId\":\"" + mscoidCompanyId + "\""
                + ",                         \"idDistributorId\":\"" + idDistributorId + "\""
                + ",                         \"name\":\"" + name + "\""
                + ",                         \"email\":\"" + email + "\""
                + "}}";
    }
}
