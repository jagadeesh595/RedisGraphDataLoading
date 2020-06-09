package com.ns.dataloading.entity;

import javax.persistence.*;

@Entity
@Table(name = "RunConfig")
public class RunConfig {
    private Long id;
    private String group;
    private String key;
    private String value;

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
    @Column(name = "Group", nullable = true, length = 255)
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Basic
    @Column(name = "Key", nullable = true, length = 255)
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Basic
    @Column(name = "Value", nullable = true, length = 255)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RunConfig runConfig = (RunConfig) o;

        if (id != null ? !id.equals(runConfig.id) : runConfig.id != null) return false;
        if (group != null ? !group.equals(runConfig.group) : runConfig.group != null) return false;
        if (key != null ? !key.equals(runConfig.key) : runConfig.key != null) return false;
        if (value != null ? !value.equals(runConfig.value) : runConfig.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (group != null ? group.hashCode() : 0);
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"RunConfig\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"group\":\"" + group + "\""
                + ",                         \"key\":\"" + key + "\""
                + ",                         \"value\":\"" + value + "\""
                + "}}";
    }
}
