package com.ns.dataloading.entity;

import javax.persistence.*;

@Entity
@Table(name = "DTAARA_DataArea")
public class DtaaraDataArea {
    private Long id;
    private String name;
    private String value;
    private String description;
    private String library;

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
    @Column(name = "Name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Value", nullable = true, length = 255)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "Description", nullable = true, length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "Library", nullable = true, length = 255)
    public String getLibrary() {
        return library;
    }

    public void setLibrary(String library) {
        this.library = library;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DtaaraDataArea that = (DtaaraDataArea) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (library != null ? !library.equals(that.library) : that.library != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (library != null ? library.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"DtaaraDataArea\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"name\":\"" + name + "\""
                + ",                         \"value\":\"" + value + "\""
                + ",                         \"description\":\"" + description + "\""
                + ",                         \"library\":\"" + library + "\""
                + "}}";
    }

    public DtaaraDataArea copy() {
        DtaaraDataArea d = new DtaaraDataArea();
        d.name = name;
        d.value = value;
        d.description = description;
        d.library = library;
        return d;
    }
}
