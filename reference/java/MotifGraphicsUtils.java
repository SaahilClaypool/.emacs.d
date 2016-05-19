_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/motif/MotifGraphicsUtils.java
    private static String layoutMenuItem(
        JComponent c,
        FontMetrics fm,
        String text,
        FontMetrics fmAccel,
        String acceleratorText,
        Icon icon,
        Icon checkIcon,
        Icon arrowIcon,
        int verticalAlignment,
        int horizontalAlignment,
        int verticalTextPosition,
        int horizontalTextPosition,
        Rectangle viewR,
        Rectangle iconR,
        Rectangle textR,
        Rectangle acceleratorR,
        Rectangle checkIconR,
        Rectangle arrowIconR,
        int textIconGap,
        int menuItemGap
        )

    /**
     * Compute and return the location of the icons origin, the
     * location of origin of the text baseline, and a possibly clipped
     * version of the compound labels string.  Locations are computed
     * relative to the viewR rectangle.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/motif/MotifGraphicsUtils.java
  public static void paintMenuItem(Graphics g, JComponent c,
                                   Icon checkIcon, Icon arrowIcon,
                                   Color background, Color foreground,
                                   int defaultTextIconGap)

  /**
   * This method is not being used to paint menu item since
   * 6.0 This code left for compatibility only. Do not use or
   * override it, this will not cause any visible effect.
   */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/motif/MotifGraphicsUtils.java
    public static void drawStringInRect(Graphics g, String aString, int x, int y,
                                 int width, int height, int justification) {

    /** Draws <b>aString</b> in the rectangle defined by
      * (<b>x</b>, <b>y</b>, <b>width</b>, <b>height</b>).
      * <b>justification</b> specifies the text's justification, one of
      * LEFT, CENTER, or RIGHT.
      * <b>drawStringInRect()</b> does not clip to the rectangle, but instead
      * uses this rectangle and the desired justification to compute the point
      * at which to begin drawing the text.
      * @see #drawString
      */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/motif/MotifGraphicsUtils.java
    static void drawPoint(Graphics g, int x, int y) {

    /**
     * Draws the point (<b>x</b>, <b>y</b>) in the current color.
     */
