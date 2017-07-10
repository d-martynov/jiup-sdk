package ru.dmartynov.jiup.sdk.core.components.containers;

import ru.dmartynov.jiup.sdk.core.IupObject;
import ru.dmartynov.jiup.sdk.core.attributes.ExpandAttr;
import ru.dmartynov.jiup.sdk.core.attributes.NMarginAttr;
import ru.dmartynov.jiup.sdk.core.components.Component;
import ru.dmartynov.jiup.sdk.core.components.Control;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Дмитрий on 02.10.2015.
 */
public abstract class Container extends Control implements ExpandAttr, NMarginAttr {
    private List<Component> childs = new LinkedList<Component>();

    public Container(Ihandle ihandle) {
        super(ihandle);
    }

    public List<Component> getChilds() {
        return childs;
    }


    public IupObject getChild(int position) {
        return childs.get(position);
    }


    public void append(Component child) {
        $.IupAppend(getIhandle(), child.getIhandle());
        $.IupMap(child.getIhandle());
        childs.add(child);
    }

    //TODO работает некорректно
    public void insert(Component child, int position) {
        IupObject.$.IupInsert(getIhandle(), childs.size() > 1 ? childs.get(position - 1).getIhandle() : null,
                child.getIhandle());
        childs.add(position, child);
    }
}
