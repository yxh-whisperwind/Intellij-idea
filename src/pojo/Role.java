package pojo;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("role")
public class Role implements Serializable {
    private Integer id;
    private String roleName;
    private String note;
    private SexEnum sexEnum;

    public SexEnum getSexEnum() { return sexEnum; }

    public Integer getId() {
        return id;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getNote() {
        return note;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setSexEnum(SexEnum sexEnum) { this.sexEnum = sexEnum; }



}
