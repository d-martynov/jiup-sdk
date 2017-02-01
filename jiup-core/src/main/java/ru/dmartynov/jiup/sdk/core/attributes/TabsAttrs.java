package ru.dmartynov.jiup.sdk.core.attributes;

import javafx.geometry.Pos;
import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

/**
 * Created by dz on 01.02.17.
 */
public interface TabsAttrs extends BgColorAttr, CommonAttrs, ExpandAttr, FgColorAttr, SizeAttr {

    /**
     * set active tab by index
     * @param index
     */
    default void setActiveTab(int index){
        $.IupSetAttribute(((IupObject)this).getIhandle(),"VALUEPOS", index+"");
    }

    /**
     * set visible close button in each tab
     * @param showCloseAttr
     */
    default void setShowCloseAttr(boolean showCloseAttr){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "SHOWCLOSE", showCloseAttr ? "YES" : "NO");
    }

    /**
     * set title to tab by his position
     * @param title
     * @param position
     */
    default void setTitle(String title, int position){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "TABTITLE"+position, title);

    }

    /**
     * set offset
     * @param x horizontal offset
     * @param y vertical offset
     */
    default void setChildOffset(int x, int y){
        $.IupSetAttribute(((IupObject) this).getIhandle(),"CHILDOFFSET", x+"x"+y);
    }

    /**
     * return tab count
     * @return
     */
    default int getTabsCount(){
        return Integer.parseInt($.IupGetAttribute(((IupObject) this).getIhandle(),"COUNT"));
    }

    /**
     * set multiline support
     */
    default void setMultiline(boolean multiline){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "MULTILINE", multiline ? "YES" : "NO");
    }

    /**
     * set tab orientation (VERTICAL or HORIZONTAL)
     * @param orientation
     */
    default void setTabOrientation(Orientation orientation){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "TABORIENTATION", orientation.getSystemName());
    }

    /**
     * set tab padding value
     * @param padding
     */
    default void setTabPadding(int padding){
        $.IupSetAttribute(((IupObject)this).getIhandle(),"TABPADDING", padding+"");
    }

    /**
     * set type of tab
     * @param position
     */
    default void setTabType(Position position){
        $.IupSetAttribute(((IupObject)this).getIhandle(),"TABTYPE", position.name());
    }

}
