package com.clib.game.nerverend.core;

import com.clib.game.nerverend.core.attr.BaseAttribute;
import com.clib.game.nerverend.core.attr.NormalAttribute;

import java.util.List;

public class Player {

    public long id;
    public String name;
    public int level;
    public long exp;

    public NormalAttribute totalAttribute;

    public NormalAttribute baseNormalAttribute;
    public BaseAttribute baseAttribute;
    public List<Skill> skillList;
    public List<Buff> buffList;
    public List<Equipment> equipmentList;

    public void computeTotalAttribute() {

    }

}

