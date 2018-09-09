public enum SexEnum {
    MALE("男",1),
    FEMALE("女",0);

    public int id;
    public String sex;

    public int getId() {
        return id;
    }

    public String getSex() {
        return sex;
    }

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
