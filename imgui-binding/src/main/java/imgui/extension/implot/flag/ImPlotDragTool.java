package imgui.extension.implot.flag;

public final class ImPlotDragTool {
    private ImPlotDragTool() {
    }

    /** default */
    public static final int None = 0;
    /** drag tools won't change cursor icons when hovered or held */
    public static final int NoCursors = 1;
    /** the drag tool won't be considered for plot fits */
    public static final int NoFit = 1 << 1;
    /** lock the tool from user inputs */
    public static final int NoInputs = 1 << 2;
    /** tool rendering will be delayed one frame; useful when applying position-constraints */
    public static final int Delayed = 1 << 3;
}
