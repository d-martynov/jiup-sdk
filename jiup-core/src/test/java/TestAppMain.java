import ru.dmartynov.jiup.sdk.core.Application;
import ru.dmartynov.jiup.sdk.core.attributes.*;
import ru.dmartynov.jiup.sdk.core.components.Dialog;
import ru.dmartynov.jiup.sdk.core.components.containers.*;
import ru.dmartynov.jiup.sdk.core.components.controls.*;
import ru.dmartynov.jiup.sdk.core.listeners.OnClickListener;
import ru.dmartynov.jiup.sdk.core.listeners.tabs.OnTabRightClickListener;
import ru.dmartynov.jiup.sdk.core.listeners.OnSpinChangeListener;
import ru.dmartynov.jiup.sdk.core.listeners.tabs.OnTabChangeListener;
import ru.dmartynov.jiup.sdk.core.listeners.tabs.OnTabCloseListener;
import ru.dmartynov.jiup.sdk.nativ.Iup;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

/**
 * Created by Дмитрий on 04.10.2015.
 */
public class TestAppMain extends Application {
    static {
        System.loadLibrary("iup");
    }

    public static void main(String[] args) {
        new TestAppMain().start(args);
    }

    @Override
    protected Dialog getMainDialog() {
//        HBox root = new HBox();
//        HBox hBox = new HBox();
//
//        Button button = new Button("Test");
//        button.setSize(90, 90);
//        hBox.append(button);
//        button.setActive(true);
//        button.setFgColor("#aaaaaaa");
//        button.setImpressBorder(true);
//        button.setTip("Подсказка");
//        button.setTipBalloon(true);
//        button.setTipBalloonTitle("Test title");
//        button.setTipBalloonTitleIcon(BalloonTitleIcon.WARNING);
//
//        Spin spin = new Spin();
//
//        VBox vBox = new VBox();
//        vBox.append(spin);
//
//        Label label = new Label("Тестовый лейбл");
//        hBox.append(label);
//
//        hBox.append(new FlatButton("Flat button"));
//
//        button.addListener((OnClickListener) () -> {
//            button.setVisible(false);
//            return 0;
//        });
//        org.aspectj.apache.bcel.classfile.ClassFormatException cc;

//        Tabs tabs = new Tabs();
//        tabs.setShowCloseAttr(true);
//        tabs.append(hBox);
//        tabs.append(vBox);
//        tabs.append(new HBox());

//        tabs.setBgColor(new Color(100,0,100));
//        tabs.setTitle("ONE",0);
//        tabs.setTitle("TWO",1);
//        tabs.setTitle("ТРИ",1);

//        tabs.addListener((OnTabChangeListener) () -> {
//            System.out.println("tab has be changed");
//            return 0;
//        });
//
//        tabs.addListener((OnTabCloseListener) (pos) -> {
//            System.out.println("tab "+pos+" has be closed");
//            return Iup.IUP_CONTINUE;
//        });
//
//        tabs.addListener((OnTabRightClickListener) (pos) -> {
//            System.out.println("right click on tab "+pos);
//            return 0;
//        });
//
//        spin.addListener(new OnSpinChangeListener() {
//            @Override
//            public int onSpinChange(int increment) {
//                if(increment > 0){
//                    tabs.setActiveTab(increment);
//                }else {
//                    tabs.setActiveTab(0);
//                }
//                return increment;
//            }
//        });

        VBox root = new VBox();


        GridBox gridBox = new GridBox();
        gridBox.setExpand(Expand.HORIZONTAL);
        gridBox.append(new Label("C1L1"));
        gridBox.append(new Label("C1L2"));
        $.IupAppend(gridBox.getIhandle(),$.IupText("C1L3"));
        gridBox.append(new Button("C1L4 BTN1"));
        gridBox.append(new Label("C2L1"));
        gridBox.append(new Label("C2L2"));
        $.IupAppend(gridBox.getIhandle(),$.IupText("C2L3"));
        gridBox.append(new Button("C2L4 BTN2"));
        gridBox.append(new Label("C3L1"));
        gridBox.append(new Label("C3L2"));
        gridBox.append(new Button("C3L4 BTN3"));
        gridBox.append(new Button("C3L4 BTN4"));

        gridBox.setOrientation(Orientation.HORIZONTAL);
        gridBox.setNumberOfDivs(4);
        gridBox.setSizeLine(-1);
        gridBox.setSizeColumn(-1);
        gridBox.setMargin(30,30);
        gridBox.setGapColumn(30);
        gridBox.setGapLine(30);
        gridBox.setAlignmentHorizontal(Alignment.ACENTER);
        gridBox.setAlignmentVertical(Alignment.ARIGHT);

        root.append(gridBox);

        ProgressBar progressBar = new ProgressBar();
        progressBar.setExpand(Expand.HORIZONTAL);
        progressBar.setMinValue(0);
        progressBar.setMaxValue(100);
        progressBar.setValue(50);

        root.append(progressBar);

        final Dialog dialog = new Dialog(root);
//        dialog.setSize(450, Size.THIRD);

        return dialog;
    }
}
