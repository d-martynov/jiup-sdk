package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

/**
 * Created by dz on 03.02.17.
 */
public interface ProgressBarAttrs extends ActiveAttr,ExpandAttr,FontAttr,ScreenPositionAttr,
        PositionAttr,MinSizeAttr,MaxSizeAttr,TipAttr,SizeAttr,ZOrderAttr,VisibleAttr,BgColorAttr,FgColorAttr {

    default void setMaxValue(int max){
        $.IupSetAttribute(((IupObject) this).getIhandle(),"MAX",max+"");
    }

    default void setMinValue(int min){
        $.IupSetAttribute(((IupObject) this).getIhandle(),"MIN",min+"");
    }

    default void setValue(int value){
        $.IupSetAttribute(((IupObject) this).getIhandle(),"VALUE", value+"");
    }
}
