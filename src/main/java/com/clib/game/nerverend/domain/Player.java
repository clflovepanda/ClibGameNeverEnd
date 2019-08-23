package com.clib.game.nerverend.domain;

import com.clib.game.nerverend.domain.attr.AdvancedAttribute;
import com.clib.game.nerverend.domain.attr.BaseAttribute;
import com.clib.game.nerverend.domain.attr.NormalAttribute;

public class Player {

    public long id;
    public String name;
    public int level;
    public long exp;
    public BaseAttribute baseAttribute;
    public NormalAttribute normalAttribute;
    public AdvancedAttribute advancedAttribute;

}

