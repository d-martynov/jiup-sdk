import ru.dmartynov.jiup.sdk.core.Application;
import ru.dmartynov.jiup.sdk.core.components.Dialog;
import ru.dmartynov.jiup.sdk.core.components.Size;
import ru.dmartynov.jiup.sdk.core.components.controls.Button;
import ru.dmartynov.jiup.sdk.core.listeners.OnClickListener;

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
        Button button = new Button("Test button");
        button.setSize(10, 20);
        Dialog dialog = new Dialog(button);
        dialog.setSize(980, Size.THIRD);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public int onClick() {
                System.out.println("Button clicked");

                return 1;
            }
        });
        return dialog;
    }
}
