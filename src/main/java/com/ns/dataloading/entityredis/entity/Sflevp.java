package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

@RedisHash("SFLEVP")
public class Sflevp implements Serializable {
    private Long id;
    private Integer lvlId;
    private Integer distLvl;
    private Integer mgrLvl;
    private Integer gemLvl;
    private String lvlDsc;
    private String shortDsc;
    private String abbrev;
    private String altLvldsc;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "LVL_ID", nullable = true)
    public Integer getLvlId() {
        return lvlId;
    }

    public void setLvlId(Integer lvlId) {
        this.lvlId = lvlId;
    }

    // @Basic
    // @Column(name = "DIST_LVL", nullable = true)
    public Integer getDistLvl() {
        return distLvl;
    }

    public void setDistLvl(Integer distLvl) {
        this.distLvl = distLvl;
    }

    // @Basic
    // @Column(name = "MGR_LVL", nullable = true)
    public Integer getMgrLvl() {
        return mgrLvl;
    }

    public void setMgrLvl(Integer mgrLvl) {
        this.mgrLvl = mgrLvl;
    }

    // @Basic
    // @Column(name = "GEM_LVL", nullable = true)
    public Integer getGemLvl() {
        return gemLvl;
    }

    public void setGemLvl(Integer gemLvl) {
        this.gemLvl = gemLvl;
    }

    // @Basic
    // @Column(name = "LVL_DSC", nullable = true, length = 35)
    public String getLvlDsc() {
        return lvlDsc;
    }

    public void setLvlDsc(String lvlDsc) {
        this.lvlDsc = lvlDsc;
    }

    // @Basic
    // @Column(name = "SHORT_DSC", nullable = true, length = 35)
    public String getShortDsc() {
        return shortDsc;
    }

    public void setShortDsc(String shortDsc) {
        this.shortDsc = shortDsc;
    }

    // @Basic
    // @Column(name = "ABBREV", nullable = true, length = 35)
    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    // @Basic
    // @Column(name = "ALT_LVLDSC", nullable = true, length = 45)
    public String getAltLvldsc() {
        return altLvldsc;
    }

    public void setAltLvldsc(String altLvldsc) {
        this.altLvldsc = altLvldsc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sflevp sflevp = (Sflevp) o;

        if (id != null ? !id.equals(sflevp.id) : sflevp.id != null) return false;
        if (lvlId != null ? !lvlId.equals(sflevp.lvlId) : sflevp.lvlId != null) return false;
        if (distLvl != null ? !distLvl.equals(sflevp.distLvl) : sflevp.distLvl != null) return false;
        if (mgrLvl != null ? !mgrLvl.equals(sflevp.mgrLvl) : sflevp.mgrLvl != null) return false;
        if (gemLvl != null ? !gemLvl.equals(sflevp.gemLvl) : sflevp.gemLvl != null) return false;
        if (lvlDsc != null ? !lvlDsc.equals(sflevp.lvlDsc) : sflevp.lvlDsc != null) return false;
        if (shortDsc != null ? !shortDsc.equals(sflevp.shortDsc) : sflevp.shortDsc != null) return false;
        if (abbrev != null ? !abbrev.equals(sflevp.abbrev) : sflevp.abbrev != null) return false;
        if (altLvldsc != null ? !altLvldsc.equals(sflevp.altLvldsc) : sflevp.altLvldsc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (lvlId != null ? lvlId.hashCode() : 0);
        result = 31 * result + (distLvl != null ? distLvl.hashCode() : 0);
        result = 31 * result + (mgrLvl != null ? mgrLvl.hashCode() : 0);
        result = 31 * result + (gemLvl != null ? gemLvl.hashCode() : 0);
        result = 31 * result + (lvlDsc != null ? lvlDsc.hashCode() : 0);
        result = 31 * result + (shortDsc != null ? shortDsc.hashCode() : 0);
        result = 31 * result + (abbrev != null ? abbrev.hashCode() : 0);
        result = 31 * result + (altLvldsc != null ? altLvldsc.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"Sflevp\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"lvlId\":\"" + lvlId + "\""
                + ",                         \"distLvl\":\"" + distLvl + "\""
                + ",                         \"mgrLvl\":\"" + mgrLvl + "\""
                + ",                         \"gemLvl\":\"" + gemLvl + "\""
                + ",                         \"lvlDsc\":\"" + lvlDsc + "\""
                + ",                         \"shortDsc\":\"" + shortDsc + "\""
                + ",                         \"abbrev\":\"" + abbrev + "\""
                + ",                         \"altLvldsc\":\"" + altLvldsc + "\""
                + "}}";
    }
}
