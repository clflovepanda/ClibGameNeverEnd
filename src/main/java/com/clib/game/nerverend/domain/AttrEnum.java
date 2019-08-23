package com.clib.game.nerverend.domain;

public enum  AttrEnum {
    STR("STR"), INT("INT"), AGI("AGI"), DEX("DEX"), VIT("VIT"), LUK("LUK"),
    HP("HP"), MP("MP"), ATK("ATK"), MATK("MATK"), DEF("DEF"), MDEF("MDEF"), HIT("HIT"), AAR("AAR"), SAR("SAR"), SPD("SPD"),
    CRT("CRT"), CRTD("CRTD"), CRTDEF("CRTDEF"), CRTDDEF("CRTDDEF"), SCK("SCK"), CMB("CMB"), CATK("CATK");

    private String attrName;
    AttrEnum(String attrName) {
        this.attrName = attrName;
    }
}
