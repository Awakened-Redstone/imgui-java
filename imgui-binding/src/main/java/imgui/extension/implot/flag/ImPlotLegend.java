package imgui.extension.implot.flag;

public class ImPlotLegend {
    /** default */
    public static final int None = 0;
    /** legend icons will not function as hide/show buttons */
    public static final int NoButtons = 1;
    /** plot items will not be highlighted when their legend entry is hovered */
    public static final int NoHighlightItem = 1 << 1;
    /** axes will not be highlighted when legend entries are hovered (only relevant if x/y-axis count > 1) */
    public static final int NoHighlightAxis = 1 << 2;
    /** the user will not be able to open context menus with right-click */
    public static final int NoMenus = 1 << 3;
    /** legend will be rendered outside of the plot area */
    public static final int Outside = 1 << 4;
    /** legend entries will be displayed horizontally */
    public static final int Horizontal = 1 << 5;
    /** legend entries will be displayed in alphabetical order */
    public static final int Sort = 1 << 6;
};
