import ru.dmartynov.jiup.sdk.core.Application;
import ru.dmartynov.jiup.sdk.core.attributes.BalloonTitleIcon;
import ru.dmartynov.jiup.sdk.core.attributes.Color;
import ru.dmartynov.jiup.sdk.core.attributes.Size;
import ru.dmartynov.jiup.sdk.core.components.Dialog;
import ru.dmartynov.jiup.sdk.core.components.containers.HBox;
import ru.dmartynov.jiup.sdk.core.components.containers.Tabs;
import ru.dmartynov.jiup.sdk.core.components.containers.VBox;
import ru.dmartynov.jiup.sdk.core.components.controls.Button;
import ru.dmartynov.jiup.sdk.core.components.controls.FlatButton;
import ru.dmartynov.jiup.sdk.core.components.controls.Label;
import ru.dmartynov.jiup.sdk.core.components.controls.Spin;
import ru.dmartynov.jiup.sdk.core.listeners.OnClickListener;
import ru.dmartynov.jiup.sdk.core.listeners.tabs.OnTabRightClickListener;
import ru.dmartynov.jiup.sdk.core.listeners.OnSpinChangeListener;
import ru.dmartynov.jiup.sdk.core.listeners.tabs.OnTabChangeListener;
import ru.dmartynov.jiup.sdk.core.listeners.tabs.OnTabCloseListener;
import ru.dmartynov.jiup.sdk.nativ.Iup;

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
        HBox hBox = new HBox();

        Button button = new Button("Test");
        button.setSize(90, 90);
        hBox.append(button);
        button.setActive(true);
        button.setFgColor("#aaaaaaa");
        button.setImpressBorder(true);
        button.setTip("Подсказка");
        button.setTipBalloon(true);
        button.setTipBalloonTitle("Test title");
        button.setTipBalloonTitleIcon(BalloonTitleIcon.WARNING);

        Spin spin = new Spin();

        VBox vBox = new VBox();
        vBox.append(spin);

        Label label = new Label("Тестовый лейбл");
        hBox.append(label);

        hBox.append(new FlatButton("Flat button"));

        button.addListener((OnClickListener) () -> {
            button.setVisible(false);
            return 0;
        });
//        org.aspectj.apache.bcel.classfile.ClassFormatException cc;

        Tabs tabs = new Tabs();
        tabs.setShowCloseAttr(true);
        tabs.append(hBox);
        tabs.append(vBox);
//        tabs.append(new HBox());

        tabs.setBgColor(new Color(100,0,100));
        tabs.setTitle("ONE",0);
//        tabs.setTitle("TWO",1);
        tabs.setTitle("ТРИ",1);

        tabs.addListener((OnTabChangeListener) () -> {
            System.out.println("tab has be changed");
            return 0;
        });

        tabs.addListener((OnTabCloseListener) (pos) -> {
            System.out.println("tab "+pos+" has be closed");
            return Iup.IUP_CONTINUE;
        });

        tabs.addListener((OnTabRightClickListener) (pos) -> {
            System.out.println("right click on tab "+pos);
            return 0;
        });

        spin.addListener(new OnSpinChangeListener() {
            @Override
            public int onSpinChange(int increment) {
                if(increment > 0){
                    tabs.setActiveTab(increment);
                }else {
                    tabs.setActiveTab(0);
                }
                return increment;
            }
        });

        final Dialog dialog = new Dialog(tabs);
        dialog.setSize(980, Size.THIRD);

        return dialog;
    }
}
