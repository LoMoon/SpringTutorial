package main.IBATIS.domain;

public class Packinfo {
    private String signId;
    private String packName;
    private String packType;
    private String packid;

    public String getSignId() {
        return signId;
    }

    public void setSignId(String signId) {
        this.signId = signId;
    }

    public String getPackName() {
        return packName;
    }

    public void setPackName(String packName) {
        this.packName = packName;
    }

    public String getPackType() {
        return packType;
    }

    public void setPackType(String packType) {
        this.packType = packType;
    }

    public String getPackid() {
        return packid;
    }

    public void setPackid(String packid) {
        this.packid = packid;
    }

    public Packinfo(){};

    public Packinfo( String signId, String packName ,String packType,String packid){
        this.packid = packid;
        this.signId = signId;
        this.packName = packName;
        this.packType = packType;
    }
}
