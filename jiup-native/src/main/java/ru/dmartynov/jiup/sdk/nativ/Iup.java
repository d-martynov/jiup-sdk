package ru.dmartynov.jiup.sdk.nativ;

import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 * Created by Дмитрий on 02.10.2015.
 */
public interface Iup extends Library {
    Iup INST = (Iup) Native.loadLibrary("iup", Iup.class);

    /************************************************************************/
    /*                        Main API                                      */

    /************************************************************************/

    int IupOpen(int argc, String[] argv);

    void IupClose();

    void IupImageLibOpen();

    int IupMainLoop();

    int IupLoopStep();

    int IupLoopStepWait();

    int IupMainLoopLevel();

    void IupFlush();

    void IupExitLoop();

    int IupRecordInput(final String filename, int mode);

    int IupPlayInput(final String filename);

    void IupUpdate(Ihandle ih);

    void IupUpdateChildren(Ihandle ih);

    void IupRedraw(Ihandle ih, int children);

    void IupRefresh(Ihandle ih);

    void IupRefreshChildren(Ihandle ih);

    int IupHelp(final String url);

    String IupLoad(final String filename);

    String IupLoadBuffer(final String buffer);

    String IupVersion();

    String IupVersionDate();

    int IupVersionNumber();

    void IupSetLanguage(final String lng);

    String IupGetLanguage();

    void IupSetLanguageString(final String name, final String str);

    void IupStoreLanguageString(final String name, final String str);

    String IupGetLanguageString(final String name);

    void IupSetLanguagePack(Ihandle ih);

    void IupDestroy(Ihandle ih);

    void IupDetach(Ihandle child);

    Ihandle IupAppend(Ihandle ih, Ihandle child);

    Ihandle IupInsert(Ihandle ih, Ihandle ref_child, Ihandle child);

    Ihandle IupGetChild(Ihandle ih, int pos);

    int IupGetChildPos(Ihandle ih, Ihandle child);

    int IupGetChildCount(Ihandle ih);

    Ihandle IupGetNextChild(Ihandle ih, Ihandle child);

    Ihandle IupGetBrother(Ihandle ih);

    Ihandle IupGetParent(Ihandle ih);

    Ihandle IupGetDialog(Ihandle ih);

    Ihandle IupGetDialogChild(Ihandle ih, final String name);

    int IupReparent(Ihandle ih, Ihandle new_parent, Ihandle ref_child);

    int IupPopup(Ihandle ih, int x, int y);

    int IupShow(Ihandle ih);

    int IupShowXY(Ihandle ih, int x, int y);

    int IupHide(Ihandle ih);

    int IupMap(Ihandle ih);

    void IupUnmap(Ihandle ih);

    void IupResetAttribute(Ihandle ih, final String name);

    int IupGetAllAttributes(Ihandle ih, String names, int n);

    Ihandle IupSetAtt(final String handle_name, Ihandle ih, final String... name);

    Ihandle IupSetAttributes(Ihandle ih, final String str);

    String IupGetAttributes(Ihandle ih);

    void IupSetAttribute(Ihandle ih, final String name, final String value);

    void IupSetStrAttribute(Ihandle ih, final String name, final String value);

    void IupSetStrf(Ihandle ih, final String name, final String... format);

    void IupSetInt(Ihandle ih, final String name, int value);

    void IupSetFloat(Ihandle ih, final String name, float value);

    void IupSetDouble(Ihandle ih, final String name, double value);

    void IupSetRGB(Ihandle ih, final String name, String r, String g, String b);

    String IupGetAttribute(Ihandle ih, final String name);

    int IupGetInt(Ihandle ih, final String name);

    int IupGetInt2(Ihandle ih, final String name);

    int IupGetIntInt(Ihandle ih, final String name, int i1, int i2);

    float IupGetFloat(Ihandle ih, final String name);

    double IupGetDouble(Ihandle ih, final String name);

    void IupGetRGB(Ihandle ih, final String name, String r, String g, String b);

    void IupSetAttributeId(Ihandle ih, final String name, int id, final String value);

    void IupSetStrAttributeId(Ihandle ih, final String name, int id, final String value);

    void IupSetStrfId(Ihandle ih, final String name, int id, final String... format);

    void IupSetIntId(Ihandle ih, final String name, int id, int value);

    void IupSetFloatId(Ihandle ih, final String name, int id, float value);

    void IupSetDoubleId(Ihandle ih, final String name, int id, double value);

    void IupSetRGBId(Ihandle ih, final String name, int id, String r, String g, String b);

    String IupGetAttributeId(Ihandle ih, final String name, int id);

    int IupGetIntId(Ihandle ih, final String name, int id);

    float IupGetFloatId(Ihandle ih, final String name, int id);

    double IupGetDoubleId(Ihandle ih, final String name, int id);

    void IupGetRGBId(Ihandle ih, final String name, int id, String r, String g, String b);

    void IupSetAttributeId2(Ihandle ih, final String name, int lin, int col, final String value);

    void IupSetStrAttributeId2(Ihandle ih, final String name, int lin, int col, final String value);

    void IupSetStrfId2(Ihandle ih, final String name, int lin, int col, final String... format);

    void IupSetIntId2(Ihandle ih, final String name, int lin, int col, int value);

    void IupSetFloatId2(Ihandle ih, final String name, int lin, int col, float value);

    void IupSetDoubleId2(Ihandle ih, final String name, int lin, int col, double value);

    void IupSetRGBId2(Ihandle ih, final String name, int lin, int col, String r, String g, String b);

    String IupGetAttributeId2(Ihandle ih, final String name, int lin, int col);

    int IupGetIntId2(Ihandle ih, final String name, int lin, int col);

    float IupGetFloatId2(Ihandle ih, final String name, int lin, int col);

    double IupGetDoubleId2(Ihandle ih, final String name, int lin, int col);

    void IupGetRGBId2(Ihandle ih, final String name, int lin, int col, String r, String g, String b);

    void IupSetGlobal(final String name, final String value);

    void IupSetStrGlobal(final String name, final String value);

    String IupGetGlobal(final String name);

    Ihandle IupSetFocus(Ihandle ih);

    Ihandle IupGetFocus();

    Ihandle IupPreviousField(Ihandle ih);

    Ihandle IupNextField(Ihandle ih);

    Icallback IupGetCallback(Ihandle ih, final String name);

    Icallback IupSetCallback(Ihandle ih, final String name, Icallback func);

    Ihandle IupSetCallbacks(Ihandle ih, final String name, Icallback... func);

    Icallback IupGetFunction(final String name);

    Icallback IupSetFunction(final String name, Icallback func);

    Ihandle IupGetHandle(final String name);

    Ihandle IupSetHandle(final String name, Ihandle ih);

    int IupGetAllNames(String names, int n);

    int IupGetAllDialogs(String names, int n);

    String IupGetName(Ihandle ih);

    void IupSetAttributeHandle(Ihandle ih, final String name, Ihandle ih_named);

    Ihandle IupGetAttributeHandle(Ihandle ih, final String name);

    String IupGetClassName(Ihandle ih);

    String IupGetClassType(Ihandle ih);

    int IupGetAllClasses(String names, int n);

    int IupGetClassAttributes(final String classname, String names, int n);

    int IupGetClassCallbacks(final String classname, String names, int n);

    void IupSaveClassAttributes(Ihandle ih);

    void IupCopyClassAttributes(Ihandle src_ih, Ihandle dst_ih);

    void IupSetClassDefaultAttribute(final String classname, final String name, final String value);

    int IupClassMatch(Ihandle ih, final String classname);

    Ihandle IupCreate(final String classname);

    Ihandle IupCreatev(final String classname, Callback params);

    Ihandle IupCreatep(final String classname, Callback... first);

/************************************************************************/
/*                        Elements                                      */

    /************************************************************************/

    Ihandle IupFill();

    Ihandle IupRadio(Ihandle child);

    Ihandle IupVbox(Ihandle... child);

    Ihandle IupVboxv(Ihandle children);

    Ihandle IupZbox(Ihandle... child);

    Ihandle IupZboxv(Ihandle children);

    Ihandle IupHbox(Ihandle... child);

    Ihandle IupHboxv(Ihandle children);

    Ihandle IupNormalizer(Ihandle... ih_first);

    Ihandle IupNormalizerv(Ihandle ih_list);

    Ihandle IupCbox(Ihandle... child);

    Ihandle IupCboxv(Ihandle children);

    Ihandle IupSbox(Ihandle child);

    Ihandle IupSplit(Ihandle child1, Ihandle child2);

    Ihandle IupScrollBox(Ihandle child);

    Ihandle IupGridBox(Ihandle... child);

    Ihandle IupGridBoxv(Ihandle children);

    Ihandle IupExpander(Ihandle child);

    Ihandle IupDetachBox(Ihandle child);

    Ihandle IupBackgroundBox(Ihandle child);

    Ihandle IupFrame(Ihandle child);

    Ihandle IupImage(int width, int height, final String pixmap);

    Ihandle IupImageRGB(int width, int height, final String pixmap);

    Ihandle IupImageRGBA(int width, int height, final String pixmap);

    Ihandle IupItem(final String title, final String action);

    Ihandle IupSubmenu(final String title, Ihandle child);

    Ihandle IupSeparator();

    Ihandle IupMenu(Ihandle... child);

    Ihandle IupMenuv(Ihandle children);

    Ihandle IupButton(final String title, final String action);

    Ihandle IupCanvas(final String action);

    Ihandle IupDialog(Ihandle child);

    Ihandle IupUser();

    Ihandle IupLabel(final String title);

    Ihandle IupList(final String action);

    Ihandle IupText(final String action);

    Ihandle IupMultiLine(final String action);

    Ihandle IupToggle(final String title, final String action);

    Ihandle IupTimer();

    Ihandle IupClipboard();

    Ihandle IupProgressBar();

    Ihandle IupVal(final String type);

    Ihandle IupTabs(Ihandle... child);

    Ihandle IupTabsv(Ihandle children);

    Ihandle IupTree();

    Ihandle IupLink(final String url, final String title);

    Ihandle IupFlatButton(final String title);

    /* Old controls, use SPIN attribute of IupText */
    Ihandle IupSpin();

    Ihandle IupSpinbox(Ihandle child);


/************************************************************************/
/*                      Utilities                                       */

    /************************************************************************/

/* IupImage utility */
    int IupSaveImageAsText(Ihandle ih, final String file_name, final String format, final String name);

    /* IupText and IupScintilla utilities */
    void IupTextConvertLinColToPos(Ihandle ih, int lin, int col, int pos);

    void IupTextConvertPosToLinCol(Ihandle ih, int pos, int lin, int col);

    /* IupText, IupList, IupTree, IupMatrix and IupScintilla utility */
    int IupConvertXYToPos(Ihandle ih, int x, int y);

    /* OLD names, kept for backward compatibility, will never be removed. */
    void IupStoreGlobal(final String name, final String value);

    void IupStoreAttribute(Ihandle ih, final String name, final String value);

    void IupSetfAttribute(Ihandle ih, final String name, final String... format);

    void IupStoreAttributeId(Ihandle ih, final String name, int id, final String value);

    void IupSetfAttributeId(Ihandle ih, final String name, int id, final String... f);

    void IupStoreAttributeId2(Ihandle ih, final String name, int lin, int col, final String value);

    void IupSetfAttributeId2(Ihandle ih, final String name, int lin, int col, final String... format);

    /* IupTree utilities */
    int IupTreeSetUserId(Ihandle ih, int id, Callback userid);

    Callback IupTreeGetUserId(Ihandle ih, int id);

    int IupTreeGetId(Ihandle ih, Callback userid);

    void IupTreeSetAttributeHandle(Ihandle ih, final String name, int id, Ihandle ih_named);

    /* DEPRECATED IupTree utilities, use Iup*AttributeId functions. It will be removed in a future version.  */
    void IupTreeSetAttribute(Ihandle ih, final String name, int id, final String value);

    void IupTreeStoreAttribute(Ihandle ih, final String name, int id, final String value);

    String IupTreeGetAttribute(Ihandle ih, final String name, int id);

    int IupTreeGetInt(Ihandle ih, final String name, int id);

    float IupTreeGetFloat(Ihandle ih, final String name, int id);

    void IupTreeSetfAttribute(Ihandle ih, final String name, int id, final String... format);

    /* DEPRECATED callback management. It will be removed in a future version. */
    String IupGetActionName();

    /* DEPRECATED font names. It will be removed in a future version.  */
    String IupMapFont(final String iupfont);

    String IupUnMapFont(final String driverfont);


/************************************************************************/
/*                      Pre-defined dialogs                           */

    /************************************************************************/

    Ihandle IupFileDlg();

    Ihandle IupMessageDlg();

    Ihandle IupColorDlg();

    Ihandle IupFontDlg();

    Ihandle IupProgressDlg();

    int IupGetFile(String arq);

    void IupMessage(final String title, final String msg);

    void IupMessagef(final String title, final String... format);

    int IupAlarm(final String title, final String msg, final String b1, final String b2, final String b3);

    int IupScanf(final String... format);

    int IupListDialog(int type, final String title, int size, final String list,
                      int op, int max_col, int max_lin, int marks);

    int IupGetText(final String title, String text);

    int IupGetColor(int x, int y, String r, String g, String b);

    int IupGetParam(final String title, Icallback action, Callback user_data, final String... format);

    int IupGetParamv(final String title, Icallback action, Callback user_data, final String format, int param_count, int param_extra, Callback param_data);

    Ihandle IupParamf(final String format);

    Ihandle IupParamBox(Ihandle parent, Ihandle params, int count);

    Ihandle IupLayoutDialog(Ihandle dialog);

    Ihandle IupElementPropertiesDialog(Ihandle elem);


/************************************************************************/
/*                   Common Flags and Return Values                     */
    /************************************************************************/
    int IUP_ERROR = 1;
    int IUP_NOERROR = 0;
    int IUP_OPENED = -1;
    int IUP_INVALID = -1;
    int IUP_INVALID_ID = -10;


/************************************************************************/
/*                   Callback Return Values                             */
    /************************************************************************/
    int IUP_IGNORE = -1;
    int IUP_DEFAULT = -2;
    int IUP_CLOSE = -3;
    int IUP_CONTINUE = -4;

/************************************************************************/
/*           IupPopup and IupShowXY Parameter Values                    */
    /************************************************************************/
    int IUP_CENTER = 0xFFFF;  /* 65535 */
    int IUP_LEFT = 0xFFFE;  /* 65534 */
    int IUP_RIGHT = 0xFFFD;  /* 65533 */
    int IUP_MOUSEPOS = 0xFFFC;  /* 65532 */
    int IUP_CURRENT = 0xFFFB;  /* 65531 */
    int IUP_CENTERPARENT = 0xFFFA;  /* 65530 */
    int IUP_TOP = IUP_LEFT;
    int IUP_BOTTOM = IUP_RIGHT;

/************************************************************************/
/*               SHOW_CB Callback Values                                */
/************************************************************************/
/*enum{IUP_SHOW, IUP_RESTORE, IUP_MINIMIZE, IUP_MAXIMIZE, IUP_HIDE};*/

/************************************************************************/
/*               SCROLL_CB Callback Values                              */
/************************************************************************/
/*
enum{IUP_SBUP,   IUP_SBDN,    IUP_SBPGUP,   IUP_SBPGDN,    IUP_SBPOSV, IUP_SBDRAGV,
        IUP_SBLEFT, IUP_SBRIGHT, IUP_SBPGLEFT, IUP_SBPGRIGHT, IUP_SBPOSH, IUP_SBDRAGH};
*/

/************************************************************************/
/*               Mouse Button Values and Macros                         */
    /************************************************************************/
    String IUP_BUTTON1 = "1";
    String IUP_BUTTON2 = "2";
    String IUP_BUTTON3 = "3";
    String IUP_BUTTON4 = "4";
    String IUP_BUTTON5 = "5";

       /* #define iup_isshift(_s)    (_s[0]=='S')
        #define iup_iscontrol(_s)  (_s[1]=='C')
        #define iup_isbutton1(_s)  (_s[2]=='1')
        #define iup_isbutton2(_s)  (_s[3]=='2')
        #define iup_isbutton3(_s)  (_s[4]=='3')
        #define iup_isdouble(_s)   (_s[5]=='D')
        #define iup_isalt(_s)      (_s[6]=='A')
        #define iup_issys(_s)      (_s[7]=='Y')
        #define iup_isbutton4(_s)  (_s[8]=='4')
        #define iup_isbutton5(_s)  (_s[9]=='5')*/

/* Old definitions for backward compatibility */
      /*  #define isshift     iup_isshift
        #define iscontrol   iup_iscontrol
        #define isbutton1   iup_isbutton1
        #define isbutton2   iup_isbutton2
        #define isbutton3   iup_isbutton3
        #define isdouble    iup_isdouble
        #define isalt       iup_isalt
        #define issys       iup_issys
        #define isbutton4   iup_isbutton4
        #define isbutton5   iup_isbutton5*/


/************************************************************************/
/*                      Pre-Defined Masks                               */
    /************************************************************************/
    String IUP_MASK_FLOAT = "[+/-]?(/d+/.?/d*|/./d+)";
    String IUP_MASK_UFLOAT = "(/d+/.?/d*|/./d+)";
    String IUP_MASK_EFLOAT = "[+/-]?(/d+/.?/d*|/./d+)([eE][+/-]?/d+)?";
    String IUP_MASK_FLOATCOMMA = "[+/-]?(/d+/,?/d*|/,/d+)";
    String IUP_MASK_UFLOATCOMMA = "(/d+/,?/d*|/,/d+)";
    String IUP_MASK_INT = "[+/-]?/d+";
    String IUP_MASK_UINT = "/d+";

    /* Old definitions for backward compatibility */
    String IUPMASK_FLOAT = IUP_MASK_FLOAT;
    String IUPMASK_UFLOAT = IUP_MASK_UFLOAT;
    String IUPMASK_EFLOAT = IUP_MASK_EFLOAT;
    String IUPMASK_INT = IUP_MASK_INT;
    String IUPMASK_UINT = IUP_MASK_UINT;


/************************************************************************/
/*                   IupGetParam Callback situations                    */
    /************************************************************************/
    int IUP_GETPARAM_BUTTON1 = -1;
    int IUP_GETPARAM_INIT = -2;
    int IUP_GETPARAM_BUTTON2 = -3;
    int IUP_GETPARAM_BUTTON3 = -4;
    int IUP_GETPARAM_CLOSE = -5;
    int IUP_GETPARAM_OK = IUP_GETPARAM_BUTTON1;
    int IUP_GETPARAM_CANCEL = IUP_GETPARAM_BUTTON2;
    int IUP_GETPARAM_HELP = IUP_GETPARAM_BUTTON3;

    Ihandle IupAnimatedLabel(Ihandle... animation);


/************************************************************************/
/*                   Record Input Modes                                 */
/************************************************************************/
/*enum {IUP_RECBINARY, IUP_RECTEXT};*/

}