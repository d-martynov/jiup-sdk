package ru.dmartynov.jiup.sdk.core.components.controls;

import ru.dmartynov.jiup.sdk.core.attributes.CommonAttrs;
import ru.dmartynov.jiup.sdk.core.components.Control;

public class Link extends Control implements CommonAttrs {
    public Link(String url, String title) {
        super($.IupLink(url, title));
    }
}
