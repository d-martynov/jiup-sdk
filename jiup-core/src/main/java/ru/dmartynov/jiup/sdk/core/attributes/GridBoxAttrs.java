package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

/**
 * Created by dz on 03.02.17.
 */
public interface GridBoxAttrs extends SizeAttr,RasterSizeAttr,FontAttr,PositionAttr,MinSizeAttr,MaxSizeAttr, ExpandAttr {

    /**
     * Vertically aligns the elements within each line. Possible values: "ATOP", "ACENTER", "ABOTTOM".
     * Default: "ATOP".
     * @param alignment
     */
    default void setAlignmentVertical(Alignment alignment){
        $.IupSetAttribute(((IupObject) this).getIhandle(),"ALIGNMENTLIN",alignment.name());
    }

    /**
     * Vertically aligns the elements within each line. Possible values: "ATOP", "ACENTER", "ABOTTOM".
     * Default: "ATOP". The alignment of a single line can also be set using "ALIGNMENTLINL",
     * where "L" is the line index, starting at 0 from top to bottom.
     * @param alignment
     */
    default void setAlignmentVerticalByIndex(Alignment alignment, int index){
        $.IupSetAttribute(((IupObject) this).getIhandle(),"ALIGNMENTLIN"+index,alignment.name());
    }

    /**
     * Horizontally aligns the elements within each column. Possible values: "ALEFT", "ACENTER", "ARIGHT".
     * Default: "ALEFT".
     * @param alignment
     */
    default void setAlignmentHorizontal(Alignment alignment){
        $.IupSetAttribute(((IupObject) this).getIhandle(),"ALIGNMENTCOL",alignment.name());
    }

    /**
     * Horizontally aligns the elements within each column. Possible values: "ALEFT", "ACENTER", "ARIGHT".
     * Default: "ALEFT". The alignment of a single column can also be set using "ALIGNMENTCOLC",
     * where "C" is the column index, starting at 0 from left to right.
     * @param alignment
     */
    default void setAlignmentHorizontalByIndex(Alignment alignment, int index){
        $.IupSetAttribute(((IupObject) this).getIhandle(),"ALIGNMENTCOL"+index,alignment.name());
    }

    /**
     * forces all children to expand in the given direction and to fully occupy its space available inside the box.
     * Can be YES (both directions), HORIZONTAL, VERTICAL or NO.
     * Default: "NO". This has the same effect as setting EXPAND on each child.
     * @param expand
     */
    default void setExpandChildren(Expand expand){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "EXPANDCHILDREN", expand.name());
    }

    /**
     * Set the RASTERSIZE attribute of the reference element in the given column or line,
     * so that it will fit the widest element in the column or the highest element in the line.
     * The number of the column or line must be preceded by a character identifying its type,
     * "C" for columns and "L" for lines. For example "C5"=column 5 or "L3"=line 3.
     * Can only be set after the layout of the dialog has been calculated at least 1 time.
     * If FITMAXWIDTHn or FITMAXHEIGHTn are set for the column or line they are used as maximum limit for the size.
     */
    default void setFitToChildrenColumn(int index){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "FITTOCHILDREN", "C"+index);
    }

    /**
     * Set the RASTERSIZE attribute of the reference element in the given column or line,
     * so that it will fit the widest element in the column or the highest element in the line.
     * The number of the column or line must be preceded by a character identifying its type,
     * "C" for columns and "L" for lines. For example "C5"=column 5 or "L3"=line 3.
     * Can only be set after the layout of the dialog has been calculated at least 1 time.
     * If FITMAXWIDTHn or FITMAXHEIGHTn are set for the column or line they are used as maximum limit for the size.
     */
    default void setFitToChildrenLine(int index){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "FITTOCHILDREN", "L"+index);
    }

    /**
     * Defines a vertical space in pixels between lines
     * @param pixels
     */
    default void setGapLine(int pixels){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "GAPLIN", pixels+"");
    }


    /**
     * Defines a vertical space in pixels between lines
     * CGAPLIN is in the same units of the SIZE attribute for the height. Default: "0".
     * @param size
     */
    default void setCGapLine(Size size){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "CGAPLIN", size.name());
    }

    /**
     * Defines a horizontal space in pixels between columns
     * @param pixels
     */
    default void setGapColumn(int pixels){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "GAPCOL", pixels+"");
    }

    /**
     * Defines a horizontal space in pixels between columns
     * CGAPCOL is in the same units of the SIZE attribute for the height. Default: "0".
     * @param size
     */
    default void setCGapColumn(Size size){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "CGAPCOL", size.name());
    }

    /**
     * Defines a vertical space in pixels between lines
     * non inheritable
     * @param pixels
     */
    default void setNGapLine(int pixels){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "NGAPLIN", pixels+"");
    }


    /**
     * Defines a vertical space in pixels between lines
     * CGAPLIN is in the same units of the SIZE attribute for the height. Default: "0".
     * non inheritable
     * @param size
     */
    default void setNCGapLine(Size size){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "NCGAPLIN", size.name());
    }

    /**
     * Defines a horizontal space in pixels between columns
     * non inheritable
     * @param pixels
     */
    default void setNGapColumn(int pixels){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "NGAPCOL", pixels+"");
    }

    /**
     * Defines a horizontal space in pixels between columns
     * CGAPCOL is in the same units of the SIZE attribute for the height. Default: "0".
     * non inheritable
     * @param size
     */
    default void setNCGapColumn(Size size){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "NCGAPCOL", size.name());
    }

    /**
     *  forces all lines to have the same vertical space, or height.
     *  The line height will be based on the highest child of the reference column (See SIZECOL).
     *  Default: "NO".
     *  Notice that this does not changes the children size, only the available space for each one of them to expand.
     * @param forces
     */
    default void setHomoGeneousLine(boolean forces){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "HOMOGENEOUSLIN", forces? "YES" : "NO");
    }

    /**
     * forces all columns to have the same horizontal space, or width.
     * The column width will be based on the widest child of the reference line (See SIZELIN).
     * Default: "NO".
     * Notice that this does not changes the children size, only the available space for each one of them to expand.
     * @param forces
     */
    default void setHomoGeneousColumn(boolean forces){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "HOMOGENEOUSCOL", forces? "YES" : "NO");
    }

    /**
     * Defines a margin in pixels.
     * Its value has the format "widthxheight",
     * where width and height are integer values corresponding to the horizontal and vertical margins,
     * respectively. Default: "0x0" (no margin).
     * @param width
     * @param height
     */
    default void setMargin(int width, int height){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "MARGIN", width+"x"+height);
    }

    /**
     * Defines a margin in pixels.
     * CMARGIN is in the same units of the SIZE attribute
     * Its value has the format "widthxheight",
     * where width and height are integer values corresponding to the horizontal and vertical margins,
     * respectively. Default: "0x0" (no margin).
     * @param width
     * @param height
     */
    default void setCMargin(Size width, Size height){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "CMARGIN", width.name()+"x"+height.name());
    }

    /**
     * Defines a margin in pixels.
     * Its value has the format "widthxheight",
     * where width and height are integer values corresponding to the horizontal and vertical margins,
     * respectively. Default: "0x0" (no margin).
     * non inheritable
     * @param width
     * @param height
     */
    default void setNMargin(int width, int height){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "NMARGIN", width+"x"+height);
    }

    /**
     * Defines a margin in pixels.
     * CMARGIN is in the same units of the SIZE attribute
     * Its value has the format "widthxheight",
     * where width and height are integer values corresponding to the horizontal and vertical margins,
     * respectively. Default: "0x0" (no margin).
     * non inheritable
     * @param width
     * @param height
     */
    default void setNCMargin(Size width, Size height){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "NCMARGIN", width.name()+"x"+height.name());
    }

    /**
     * controls the number of divisions along the distribution according to ORIENTATION.
     * When ORIENTATION=HORIZONTAL, NUMDIV is the number of columns,
     * when ORIENTATION=VERTICAL, NUMDIV is the number of lines.
     * When value is AUTO, its actual value will be calculated to fit the maximum number of elements in the orientation direction.
     * Default: AUTO.
     * @param number
     */
    default void setNumberOfDivs(int number){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "NUMDIV", number+"");
    }

    /**
     * controls the number of divisions along the distribution according to ORIENTATION.
     * When ORIENTATION=HORIZONTAL, NUMDIV is the number of columns,
     * when ORIENTATION=VERTICAL, NUMDIV is the number of lines.
     * When value is AUTO, its actual value will be calculated to fit the maximum number of elements in the orientation direction.
     * Default: AUTO.
     */
    default void setAutoNumberOfDivs(){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "NUMDIV", "AUTO");
    }

    default int getNumberOfColumns(){
        return Integer.parseInt($.IupGetAttribute(((IupObject) this).getIhandle(),"NUMCOL"));
    }

    default int getNumberOfLines(){
        return Integer.parseInt($.IupGetAttribute(((IupObject) this).getIhandle(),"NUMLIN"));
    }

    /**
     * normalizes all children natural size to be the biggest natural size among
     * the reference line and/or the reference column.
     * All natural width will be set to the biggest width,
     * and all natural height will be set to the biggest height according to is value.
     * Can be NO, HORIZONTAL (width only),
     * VERTICAL (height only) or BOTH.
     * Default: "NO". Same as using IupNormalizer.
     * Notice that this is different from the HOMOGENEOUS* attributes in the sense that the children will have their sizes changed.
     * @param normalize
     */
    default void setNormalizeSize(Normalize normalize){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "NORMALIZESIZE", normalize.name());
    }

    /**
     * controls the distribution of the children in lines or in columns. Can be: HORIZONTAL or VERTICAL. Default: HORIZONTAL.
     * @param orientation
     */
    default void setOrientation(Orientation orientation){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "ORIENTATION", orientation.name());
    }

    /**
     * index of the column that will be used as reference when calculating the height of the lines.
     * Default: 0. If set to -1 all columns will contribute for the line height,
     * the highest cell of the line will be the line height (since 3.21).
     * @param index
     */
    default void setSizeColumn(int index){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "SIZECOL", index+"");
    }

    /**
     * index of the line that will be used as reference when calculating the width of the columns.
     * Default: 0. If set to -1 all lines will contribute for the column width,
     * the wideest cell of the column will be the column width (since 3.21).
     * @param index
     */
    default void setSizeLine(int index){
        $.IupSetAttribute(((IupObject) this).getIhandle(), "SIZELIN", index+"");
    }

    /**
     * returns -1 if mapped.
     * @return
     */
    default int getWid(){
        return Integer.parseInt($.IupGetAttribute(((IupObject) this).getIhandle(), "WID"));
    }
}
