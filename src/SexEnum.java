public enum SexEnum {
    MALE("男",1),
    FEMALE("女",0);

    private int id;
    private String sex;

    public void setId(int id) {
        this.id = id;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public String getSex() { return sex; }

    SexEnum(String sex, int id) {
        this.id = id;
        this.sex = sex;
    }

    public SexEnum getHelloById(int id) {
        for(SexEnum h: SexEnum.values()) {
            if(h.getId() == id) {
                return h;
            }
        }
        return null;
    }

}
