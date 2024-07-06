package imgui.extension.implot.flag;

public final class ImPlotColormapScale {
    private ImPlotColormapScale() {
    }

    /** default */
    public static final int None = 0;
    /** the colormap axis label will not be displayed */
    public static final int NoLabel = 1;
    /** render the colormap label and tick labels on the opposite side */
    public static final int Opposite = 1 << 1;
    /** invert the colormap bar and axis scale (this only affects rendering; if you only want to reverse the scale mapping, make scale_min > scale_max) */
    public static final int Invert = 1 << 2;
};
