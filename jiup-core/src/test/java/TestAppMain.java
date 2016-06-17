import ru.dmartynov.jiup.sdk.core.Application;
import ru.dmartynov.jiup.sdk.core.IupObject;
import ru.dmartynov.jiup.sdk.core.components.Dialog;
import ru.dmartynov.jiup.sdk.core.components.Size;
import ru.dmartynov.jiup.sdk.core.components.containers.DetachBox;
import ru.dmartynov.jiup.sdk.core.components.containers.HBox;
import ru.dmartynov.jiup.sdk.core.components.controls.Button;
import ru.dmartynov.jiup.sdk.core.listeners.*;
import ru.dmartynov.jiup.sdk.core.listeners.markers.ButtonListener;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;
import ru.dmartynov.jiup.sdk.nativ.Iup;
import ru.dmartynov.jiup.sdk.nativ.callbacks.GLOBALMOTION_CB;

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
        IupObject.$.IupSetGlobal("INPUTCALLBACKS", "YES");
        IupObject.$.IupSetFunction("GLOBALMOTION_CB", new GLOBALMOTION_CB() {
            @Override
            public int function(int x, int y, String status) {
                System.out.println(x + "x" + y);
                return 0;
            }
        });
        final Button button = new Button("Тестовая кнопка");
        final HBox hBox = new HBox();
        final Button child = new Button("001");
        final Ihandle ihandle = IupObject.$.IupElementPropertiesDialog(child.getIhandle());
        hBox.append(child);
        child.addListener(new OnMouseEventListener() {
            @Override
            public int OnMouseEvent(int button, int pressed, int x, int y, String status) {
                System.out.println(x + "x" + y);
                return 1;
            }
        });
        hBox.append(new Button("1"));
        hBox.append(new Button("1"));
        hBox.append(new Button("1"));
        DetachBox detachBox = new DetachBox(hBox);


        final Dialog dialog = new Dialog(detachBox);
        hBox.append(button);
        button.addListener(new OnClickListener() {
            @Override
            public int onClick() {
                hBox.append(new Button("Test..."));
                IupObject.$.IupRefreshChildren(hBox.getIhandle());

                return 1;
            }
        });

        button.addListener(new ButtonListener() {
        });


        dialog.setSize(980, Size.THIRD);

        Iup.INST.IupSetAttribute(dialog.getIhandle(), "DROPFILESTARGET", "YES");


        OnResizeListener onResizeListener = new OnResizeListener() {
            @Override
            public int onResize(int width, int height) {
                System.out.println(width + "x" + height);
                return 1;
            }
        };

        dialog.addListener(new OnCloseListener() {
            @Override
            public int onClose() {
                System.out.println("Closing...");
                return 0;
            }
        });

        dialog.addListener(new OnNextInstanceRunningListener() {
            @Override
            public int onNextInstanceRunning() {
                System.out.println("Next instance running....");
                return 0;
            }
        });
        dialog.addListener(onResizeListener);

        dialog.addListener(new OnMoveListener() {

            @Override
            public int onMove(int x, int y) {
                System.out.println("Moved to " + x + " " + y);
                return 0;
            }
        });

        dialog.addListener(new OnShowListener() {
            @Override
            public int onShow(State state) {
                System.out.println("Show: " + state.name());
                return 0;
            }
        });

        dialog.addListener(new OnFileDroppedListener() {
            @Override
            public int onFileDropped(String fileName, int num, int x, int y) {
                System.out.println(fileName);
                return 0;
            }
        });

        dialog.addListener(new OnMappedListener() {
            @Override
            public int onMapped() {
                System.out.println("Mapped");
                return 0;
            }
        });

        dialog.addListener(new OnUnmappedListener() {
            @Override
            public int onUnMapped() {

                System.out.println("Unmapped");
                return 0;
            }
        });

        dialog.addListener(new OnDestroyListener() {
            @Override
            public int onDestroy() {

                System.out.println("Destroy");
                return 0;
            }
        });

        dialog.addListener(new OnFocusGetListener() {
            @Override
            public int onFocusGet() {
                System.out.println("Get focus");
                return 0;
            }
        });

        dialog.addListener(new OnFocusLossListener() {
            @Override
            public int onFocusLoss() {
                System.out.println("Loss focus");
                return 0;
            }
        });

        dialog.addListener(new OnMouseHoverListener() {
            @Override
            public int inMouseHover() {
                System.out.println("Mouse hover");
                return 0;
            }
        });

        dialog.addListener(new OnMouseLeaveListener() {
            @Override
            public int onMouseLeave() {
                System.out.println("Mouse leave");
                return 0;
            }
        });

        dialog.addListener(new OnKeyboardEventListener() {
            @Override
            public int onKeyboardEvent(int keyIdentifier) {
                System.out.println("Pressed key id: " + keyIdentifier);
                return 0;
            }
        });

        dialog.addListener(new OnFocusLossListener() {
            @Override
            public int onFocusLoss() {
                System.out.println("Focus LOSS");
                return 0;
            }
        });

        return dialog;
    }
}
