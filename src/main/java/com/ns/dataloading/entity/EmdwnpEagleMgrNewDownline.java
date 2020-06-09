package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "EMDWNP_EagleMgrNewDownline")
public class EmdwnpEagleMgrNewDownline {
    private Long id;
    private Long edspnSponCtl;
    private Long edctycCountryCode;
    private Long eddidDistId;
    private Long edctlDistControl;
    private BigDecimal ednccNewPerOrNmCc;
    private Integer edlevlLevel;
    private String edsetdSetUpDate;
    private Integer edsumoSetUpMonth;
    private Integer edsuyrSetUpYear;
    private Integer edmvmoMoveUpMonth;
    private Integer edmvyrMoveUpYear;
    private String edchgdLastChangeDate;
    private String eduserLastChangeUser;
    private String edpgmLastChangePgm;

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
    @Column(name = "EDSPN_SponCtl", nullable = true)
    public Long getEdspnSponCtl() {
        return edspnSponCtl;
    }

    public void setEdspnSponCtl(Long edspnSponCtl) {
        this.edspnSponCtl = edspnSponCtl;
    }

    @Basic
    @Column(name = "EDCTYC_CountryCode", nullable = true)
    public Long getEdctycCountryCode() {
        return edctycCountryCode;
    }

    public void setEdctycCountryCode(Long edctycCountryCode) {
        this.edctycCountryCode = edctycCountryCode;
    }

    @Basic
    @Column(name = "EDDID_DistId", nullable = true)
    public Long getEddidDistId() {
        return eddidDistId;
    }

    public void setEddidDistId(Long eddidDistId) {
        this.eddidDistId = eddidDistId;
    }

    @Basic
    @Column(name = "EDCTL_DistControl", nullable = false)
    public Long getEdctlDistControl() {
        return edctlDistControl;
    }

    public void setEdctlDistControl(Long edctlDistControl) {
        this.edctlDistControl = edctlDistControl;
    }

    @Basic
    @Column(name = "EDNCC_NewPerOrNmCc", nullable = true, precision = 3)
    public BigDecimal getEdnccNewPerOrNmCc() {
        return ednccNewPerOrNmCc;
    }

    public void setEdnccNewPerOrNmCc(BigDecimal ednccNewPerOrNmCc) {
        this.ednccNewPerOrNmCc = ednccNewPerOrNmCc;
    }

    @Basic
    @Column(name = "EDLEVL_Level", nullable = true)
    public Integer getEdlevlLevel() {
        return edlevlLevel;
    }

    public void setEdlevlLevel(Integer edlevlLevel) {
        this.edlevlLevel = edlevlLevel;
    }

    @Basic
    @Column(name = "EDSETD_SetUpDate", nullable = true, length = 15)
    public String getEdsetdSetUpDate() {
        return edsetdSetUpDate;
    }

    public void setEdsetdSetUpDate(String edsetdSetUpDate) {
        this.edsetdSetUpDate = edsetdSetUpDate;
    }

    @Basic
    @Column(name = "EDSUMO_SetUpMonth", nullable = true)
    public Integer getEdsumoSetUpMonth() {
        return edsumoSetUpMonth;
    }

    public void setEdsumoSetUpMonth(Integer edsumoSetUpMonth) {
        this.edsumoSetUpMonth = edsumoSetUpMonth;
    }

    @Basic
    @Column(name = "EDSUYR_SetUpYear", nullable = true)
    public Integer getEdsuyrSetUpYear() {
        return edsuyrSetUpYear;
    }

    public void setEdsuyrSetUpYear(Integer edsuyrSetUpYear) {
        this.edsuyrSetUpYear = edsuyrSetUpYear;
    }

    @Basic
    @Column(name = "EDMVMO_MoveUpMonth", nullable = true)
    public Integer getEdmvmoMoveUpMonth() {
        return edmvmoMoveUpMonth;
    }

    public void setEdmvmoMoveUpMonth(Integer edmvmoMoveUpMonth) {
        this.edmvmoMoveUpMonth = edmvmoMoveUpMonth;
    }

    @Basic
    @Column(name = "EDMVYR_MoveUpYear", nullable = true)
    public Integer getEdmvyrMoveUpYear() {
        return edmvyrMoveUpYear;
    }

    public void setEdmvyrMoveUpYear(Integer edmvyrMoveUpYear) {
        this.edmvyrMoveUpYear = edmvyrMoveUpYear;
    }

    @Basic
    @Column(name = "EDCHGD_LastChangeDate", nullable = true, length = 15)
    public String getEdchgdLastChangeDate() {
        return edchgdLastChangeDate;
    }

    public void setEdchgdLastChangeDate(String edchgdLastChangeDate) {
        this.edchgdLastChangeDate = edchgdLastChangeDate;
    }

    @Basic
    @Column(name = "EDUSER_LastChangeUser", nullable = true, length = 255)
    public String getEduserLastChangeUser() {
        return eduserLastChangeUser;
    }

    public void setEduserLastChangeUser(String eduserLastChangeUser) {
        this.eduserLastChangeUser = eduserLastChangeUser;
    }

    @Basic
    @Column(name = "EDPGM_LastChangePgm", nullable = true, length = 255)
    public String getEdpgmLastChangePgm() {
        return edpgmLastChangePgm;
    }

    public void setEdpgmLastChangePgm(String edpgmLastChangePgm) {
        this.edpgmLastChangePgm = edpgmLastChangePgm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmdwnpEagleMgrNewDownline that = (EmdwnpEagleMgrNewDownline) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (edspnSponCtl != null ? !edspnSponCtl.equals(that.edspnSponCtl) : that.edspnSponCtl != null) return false;
        if (edctycCountryCode != null ? !edctycCountryCode.equals(that.edctycCountryCode) : that.edctycCountryCode != null)
            return false;
        if (eddidDistId != null ? !eddidDistId.equals(that.eddidDistId) : that.eddidDistId != null) return false;
        if (edctlDistControl != null ? !edctlDistControl.equals(that.edctlDistControl) : that.edctlDistControl != null)
            return false;
        if (ednccNewPerOrNmCc != null ? !ednccNewPerOrNmCc.equals(that.ednccNewPerOrNmCc) : that.ednccNewPerOrNmCc != null)
            return false;
        if (edlevlLevel != null ? !edlevlLevel.equals(that.edlevlLevel) : that.edlevlLevel != null) return false;
        if (edsetdSetUpDate != null ? !edsetdSetUpDate.equals(that.edsetdSetUpDate) : that.edsetdSetUpDate != null)
            return false;
        if (edsumoSetUpMonth != null ? !edsumoSetUpMonth.equals(that.edsumoSetUpMonth) : that.edsumoSetUpMonth != null)
            return false;
        if (edsuyrSetUpYear != null ? !edsuyrSetUpYear.equals(that.edsuyrSetUpYear) : that.edsuyrSetUpYear != null)
            return false;
        if (edmvmoMoveUpMonth != null ? !edmvmoMoveUpMonth.equals(that.edmvmoMoveUpMonth) : that.edmvmoMoveUpMonth != null)
            return false;
        if (edmvyrMoveUpYear != null ? !edmvyrMoveUpYear.equals(that.edmvyrMoveUpYear) : that.edmvyrMoveUpYear != null)
            return false;
        if (edchgdLastChangeDate != null ? !edchgdLastChangeDate.equals(that.edchgdLastChangeDate) : that.edchgdLastChangeDate != null)
            return false;
        if (eduserLastChangeUser != null ? !eduserLastChangeUser.equals(that.eduserLastChangeUser) : that.eduserLastChangeUser != null)
            return false;
        if (edpgmLastChangePgm != null ? !edpgmLastChangePgm.equals(that.edpgmLastChangePgm) : that.edpgmLastChangePgm != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (edspnSponCtl != null ? edspnSponCtl.hashCode() : 0);
        result = 31 * result + (edctycCountryCode != null ? edctycCountryCode.hashCode() : 0);
        result = 31 * result + (eddidDistId != null ? eddidDistId.hashCode() : 0);
        result = 31 * result + (edctlDistControl != null ? edctlDistControl.hashCode() : 0);
        result = 31 * result + (ednccNewPerOrNmCc != null ? ednccNewPerOrNmCc.hashCode() : 0);
        result = 31 * result + (edlevlLevel != null ? edlevlLevel.hashCode() : 0);
        result = 31 * result + (edsetdSetUpDate != null ? edsetdSetUpDate.hashCode() : 0);
        result = 31 * result + (edsumoSetUpMonth != null ? edsumoSetUpMonth.hashCode() : 0);
        result = 31 * result + (edsuyrSetUpYear != null ? edsuyrSetUpYear.hashCode() : 0);
        result = 31 * result + (edmvmoMoveUpMonth != null ? edmvmoMoveUpMonth.hashCode() : 0);
        result = 31 * result + (edmvyrMoveUpYear != null ? edmvyrMoveUpYear.hashCode() : 0);
        result = 31 * result + (edchgdLastChangeDate != null ? edchgdLastChangeDate.hashCode() : 0);
        result = 31 * result + (eduserLastChangeUser != null ? eduserLastChangeUser.hashCode() : 0);
        result = 31 * result + (edpgmLastChangePgm != null ? edpgmLastChangePgm.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"EmdwnpEagleMgrNewDownline\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"edspnSponCtl\":\"" + edspnSponCtl + "\""
                + ",                         \"edctycCountryCode\":\"" + edctycCountryCode + "\""
                + ",                         \"eddidDistId\":\"" + eddidDistId + "\""
                + ",                         \"edctlDistControl\":\"" + edctlDistControl + "\""
                + ",                         \"ednccNewPerOrNmCc\":\"" + ednccNewPerOrNmCc + "\""
                + ",                         \"edlevlLevel\":\"" + edlevlLevel + "\""
                + ",                         \"edsetdSetUpDate\":\"" + edsetdSetUpDate + "\""
                + ",                         \"edsumoSetUpMonth\":\"" + edsumoSetUpMonth + "\""
                + ",                         \"edsuyrSetUpYear\":\"" + edsuyrSetUpYear + "\""
                + ",                         \"edmvmoMoveUpMonth\":\"" + edmvmoMoveUpMonth + "\""
                + ",                         \"edmvyrMoveUpYear\":\"" + edmvyrMoveUpYear + "\""
                + ",                         \"edchgdLastChangeDate\":\"" + edchgdLastChangeDate + "\""
                + ",                         \"eduserLastChangeUser\":\"" + eduserLastChangeUser + "\""
                + ",                         \"edpgmLastChangePgm\":\"" + edpgmLastChangePgm + "\""
                + "}}";
    }
}
