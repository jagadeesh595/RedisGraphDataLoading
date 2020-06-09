package com.ns.dataloading.entity;

import javax.persistence.*;

@Entity
@Table(name = "ORNEXP_OrderDownloadFileExport")
public class OrnexpOrderDownloadFileExport {
    private Long id;
    private String dtafld;

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
    @Column(name = "DTAFLD", nullable = true, length = 255)
    public String getDtafld() {
        return dtafld;
    }

    public void setDtafld(String dtafld) {
        this.dtafld = dtafld;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrnexpOrderDownloadFileExport that = (OrnexpOrderDownloadFileExport) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dtafld != null ? !dtafld.equals(that.dtafld) : that.dtafld != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dtafld != null ? dtafld.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"OrnexpOrderDownloadFileExport\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"dtafld\":\"" + dtafld + "\""
                + "}}";
    }
}
