package com.clib.game.nerverend.domain.attr;

import com.clib.game.nerverend.enums.AttrDesc;

public class BaseAttribute {

    @AttrDesc(name = "力量", affix = {"致命", "绝情", "凶暴", "残忍", "战神"})
    public int STR;//力量,影响物理攻击与物理防御
    @AttrDesc(name = "智力", affix = {"冷静", "聪慧", "睿智", "智慧", "法神"})
    public int INT;//智力，影响魔法攻击与魔法防御
    @AttrDesc(name = "敏捷", affix = {"迅捷", "聚焦", "精准", "鹰眼", "月神"})
    public int AGI;//敏捷，影响命中率
    @AttrDesc(name = "灵巧", affix = {"灵敏", "分身", "残影", "虚无", "风神"})
    public int DEX;//灵巧，影响闪避值
    @AttrDesc(name = "耐力", affix = {"持久", "不倦", "沉稳", "青山", "山神"})
    public int VIT;//耐力，影响生命值与物理防御与魔法防御
    @AttrDesc(name = "幸运值", affix = {"幸运", "祈福", "赐福", "天眷", "爱神"})
    public int LUK;//幸运值，影响暴击率和暴击伤害

}
