package pojo;

public enum SexEnum {
    MALE(1,"男"),
    FEMALE(0,"女");

    private Integer id;
    public String sex;

    public Integer getId() { return id; }
    public String getSex() { return sex; }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    SexEnum(Integer id,String sex) {
        this.id = id;
        this.sex = sex;
    }
    public static SexEnum getSexEnumById(Integer id) {
        for(SexEnum sexEnum:SexEnum.values()) {
            if (sexEnum.getId()==id) {
                return sexEnum;
            }
        }
        return null;
    }
}
