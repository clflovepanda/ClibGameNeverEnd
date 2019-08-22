package com.clib.game.nerverend;

import com.clib.game.nerverend.attr.AdvancedAttribute;
import com.clib.game.nerverend.attr.BaseAttribute;
import com.clib.game.nerverend.attr.NormalAttribute;

public class Buff {

    public String name;//buff名称
    public String desc;//buff描述
    public String round;//持续回合数

    public BaseAttribute baseAttribute;
    public NormalAttribute normalAttribute;
    public AdvancedAttribute advancedAttribute;

}
