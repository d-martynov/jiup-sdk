import ru.dmartynov.jiup.sdk.core.Application;
import ru.dmartynov.jiup.sdk.core.components.Dialog;
import ru.dmartynov.jiup.sdk.core.components.Size;
import ru.dmartynov.jiup.sdk.core.components.controls.Button;
import ru.dmartynov.jiup.sdk.core.listeners.*;
import ru.dmartynov.jiup.sdk.nativ.Iup;

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
        button.setOnClickListener(new OnClickListener() {
            @Override
            public int onClick() {
                System.out.println("Button clicked");

                return 1;
            }
        });

        final Dialog dialog = new Dialog(button);
        dialog.setSize(980, Size.THIRD);

        Iup.INST.IupSetAttribute(dialog.getIhandle(), "DROPFILESTARGET", "YES");


        OnResizeListener onResizeListener = new OnResizeListener() {
            @Override
            public int onResize(int width, int height) {
                System.out.println(width + "x" + height);
                return 0;
            }
        };

        dialog.setOnCloseListener(new OnCloseListener() {
            @Override
            public int onClose() {
                System.out.println("Closing...");
                return 0;
            }
        });

        dialog.setOnNextInstanceRunningListener(new OnNextInstanceRunningListener() {
            @Override
            public int onNextInstanceRunning() {
                System.out.println("Next instance running....");
                return 0;
            }
        });
        dialog.setOnResizeListener(onResizeListener);

        dialog.setOnMoveListener(new OnMoveListener() {

            @Override
            public int onMove(int x, int y) {
                System.out.println("Moved to " + x + " " + y);
                return 0;
            }
        });

        dialog.setOnShowListener(new OnShowListener() {
            @Override
            public int onShow(State state) {
                System.out.println("Show: " + state.name());
                return 0;
            }
        });

        dialog.setOnFileDroppedListener(new OnFileDroppedListener() {
            @Override
            public int onFileDropped(String fileName, int num, int x, int y) {
                System.out.println(fileName);
                return 0;
            }
        });

        dialog.setOnMappedListener(new OnMappedListener() {
            @Override
            public int onMapped() {
                System.out.println("Mapped");
                return 0;
            }
        });

        dialog.setOnUnmappedListener(new OnUnmappedListener() {
            @Override
            public int onUnMapped() {

                System.out.println("Unmapped");
                return 0;
            }
        });

        dialog.setOnDestroyListener(new OnDestroyListener() {
            @Override
            public int onDestroy() {

                System.out.println("Destroy");
                return 0;
            }
        });

        dialog.setOnGetFocusListener(new OnFocusGetListener() {
            @Override
            public int onFocusGet() {
                System.out.println("Get focus");
                return 0;
            }
        });

        dialog.setOnFocusLossListener(new OnFocusLossListener() {
            @Override
            public int onFocusLoss() {
                System.out.println("Loss focus");
                return 0;
            }
        });

        dialog.setOnMouseHoverListener(new OnMouseHoverListener() {
            @Override
            public int inMouseHover() {
                System.out.println("Mouse hover");
                return 0;
            }
        });

        dialog.setOnMouseLeaveListener(new OnMouseLeaveListener() {
            @Override
            public int onMouseLeave() {
                System.out.println("Mouse leave");
                return 0;
            }
        });

        dialog.setOnKeyboardEventListener(new OnKeyboardEventListener() {
            @Override
            public int onKeyboardEvent(int keyIdentifier) {
                System.out.println("Pressed key id: " + keyIdentifier);
                return 0;
            }
        });


        return dialog;
    }
}
