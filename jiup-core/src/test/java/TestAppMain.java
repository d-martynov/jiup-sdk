import ru.dmartynov.jiup.sdk.core.Application;
import ru.dmartynov.jiup.sdk.core.attributes.BalloonTitleIcon;
import ru.dmartynov.jiup.sdk.core.attributes.Size;
import ru.dmartynov.jiup.sdk.core.components.Dialog;
import ru.dmartynov.jiup.sdk.core.components.containers.HBox;
import ru.dmartynov.jiup.sdk.core.components.controls.Button;
import ru.dmartynov.jiup.sdk.core.components.controls.FlatButton;
import ru.dmartynov.jiup.sdk.core.components.controls.Label;
import ru.dmartynov.jiup.sdk.core.listeners.OnClickListener;

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
        HBox hBox = new HBox();
        final Dialog dialog = new Dialog(hBox);
        dialog.setSize(980, Size.THIRD);

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

        Label label = new Label("Тестовый лейбл");
        hBox.append(label);

        hBox.append(new FlatButton("Flat button"));


        button.addListener((OnClickListener) () -> {
            button.setVisible(false);
            return 0;
        });
//        org.aspectj.apache.bcel.classfile.ClassFormatException cc;

        return dialog;
    }
}
