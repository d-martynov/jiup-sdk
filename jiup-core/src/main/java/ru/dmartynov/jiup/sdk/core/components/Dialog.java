package ru.dmartynov.jiup.sdk.core.components;

import ru.dmartynov.jiup.sdk.core.IupObject;
import ru.dmartynov.jiup.sdk.core.listeners.*;
import ru.dmartynov.jiup.sdk.nativ.Iup;

/**
 * Created by Дмитрий on 04.10.2015.
 */
public class Dialog extends IupObject implements OnCloseListener.Have, OnNextInstanceRunningListener.Have,
        OnMdiActiveListener.Have, OnShowListener.Have, OnMoveListener.Have, OnFileDroppedListener.Have,
        OnTrayClickListener.Have, OnResizeListener.Have {
    private int x = Iup.IUP_CENTER;
    private int y = Iup.IUP_CENTER;

    private Component child;

    public Dialog(Component child) {
        super($.IupDialog(child.getIhandle()));
        this.child = child;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Component getChild() {
        return child;
    }

    public void setChild(Component child) {
        this.child = child;
    }


    @Override
    public void setOnCloseListener(OnCloseListener onCloseListener) {
        /**
         * Auto Implemented by Aspect
         */
    }

    @Override
    public void setOnNextInstanceRunningListener(OnNextInstanceRunningListener onNextInstanceRunningListener) {
        /**
         * Auto Implemented by Aspect
         */
    }

    @Override
    public void setOnMdiActivateListener(OnMdiActiveListener onMdiActivateListener) {
        /**
         * Auto Implemented by Aspect
         */
    }

    @Override
    public void setOnShowListener(OnShowListener onShowListener) {
        /**
         * Auto Implemented by Aspect
         */
    }

    @Override
    public void setOnMoveListener(OnMoveListener onMoveListener) {
        /*
         * Auto Implemented by Aspect
         */
    }

    @Override
    public void setOnFileDroppedListener(OnFileDroppedListener onFileDropped) {
        /**
         * Auto Implemented by Aspect
         */
    }

    @Override
    public void setOnTrayClickListener(OnTrayClickListener onTrayClickListener) {
        /**
         * Auto Implemented by Aspect
         */
    }

    @Override
    public void setOnResizeListener(OnResizeListener onResizeListener) {
        /**
         * Auto Implemented by Aspect
         */
    }
}
