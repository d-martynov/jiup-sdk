package ru.dmartynov.jiup.sdk.core.containers;

import ru.dmartynov.jiup.sdk.core.IupObject;
import ru.dmartynov.jiup.sdk.core.components.Control;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ִלטענטי on 02.10.2015.
 */
public abstract class Container extends Control {
    private List<Control> childs = new LinkedList<Control>();

    public Container(Ihandle ihandle) {
        super(ihandle);
    }

    public List<Control> getChilds() {
        return childs;
    }


    public IupObject getChild(int position) {
        return childs.get(position);
    }


    public void append(Control child) {
        IupObject.$.IupAppend(getIhandle(), child.getIhandle());
        childs.add(child);
    }

    public void insert(Control child, int position) {
        IupObject.$.IupInsert(getIhandle(), childs.size() > 1 ? childs.get(position - 1).getIhandle() : null,
                child.getIhandle());
        childs.add(position, child);
    }
}
