package ru.dmartynov.jiup.sdk.core;

import ru.dmartynov.jiup.sdk.core.annotations.TypeTransformer;
import ru.dmartynov.jiup.sdk.core.listeners.OnShowListener;

/**
 * Created by d.martynov on 05.10.2015.
 */
public class StateTransformer implements TypeTransformer<Integer, OnShowListener.State> {
    @Override
    public OnShowListener.State transform(Integer val) {
        return OnShowListener.State.values()[val];
    }
}
