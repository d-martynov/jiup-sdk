import ru.dmartynov.jiup.sdk.core.Application;
import ru.dmartynov.jiup.sdk.core.components.Dialog;
import ru.dmartynov.jiup.sdk.core.attributes.Size;
import ru.dmartynov.jiup.sdk.core.components.containers.HBox;
import ru.dmartynov.jiup.sdk.core.components.controls.Button;

/**
 * Created by Дмитрий on 04.10.2015.
 */
public class TestAppMain extends Application {
    public static void main(String[] args) {
        System.loadLibrary("iup");
        new TestAppMain().start(args);
    }

    @Override
    protected Dialog getMainDialog() {
        HBox hBox = new HBox();
        final Dialog dialog = new Dialog(hBox);
        dialog.setSize(980, Size.THIRD);

        Button button = new Button("Тест");
        button.setSize(90, 90);
        hBox.append(button);
        button.setActive(true);
        button.setBgColor("#dfdfdf");
        return dialog;
    }
}
