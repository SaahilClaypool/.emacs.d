_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private static class ColorAction extends AbstractAction {

    /**
     * Action class used for colors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        void incrementHue(boolean positive) {

        /**
         * Increments the hue.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private int colorWheelLocationToRGB(int x, int y, double rad) {

        /**
         * Returns the RGB color to use for the specified location. The
         * passed in point must be on the color wheel and be relative to the
         * origin of the color wheel.
         *
         * @param x X location to get color for
         * @param y Y location to get color for
         * @param rad Radius from center of color wheel
         * @return integer with red, green and blue components
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private boolean isSet(int flag) {

        /**
         * Returns true if a particular flag has been set.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private void setFlag(int flag, boolean value) {

        /**
         * Updates the flags bitmask.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private int getWheelRadius() {

        /**
         * Returns the radius of the wheel.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private void setFocusType(int type) {

        /**
         * Sets the focus to one of: 0 no one, 1 the wheel or 2 the triangle.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private int getWheelWidth() {

        /**
         * Returns the width of the wheel.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private int getWheelYOrigin() {

        /**
         * Returns y origin of the wheel and triangle.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private int getWheelXOrigin() {

        /**
         * Returns the x origin of the wheel and triangle.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private int getTriangleCircumscribedRadius() {

        /**
         * Returns the circumscribed radius of the triangle.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private int getIndicatorSize() {

        /**
         * Returns the size of the color indicator.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private void setHueAngle(double angle) {

        /**
         * Sets the angle representing the hue.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private void setAngleFromHue(float hue) {

        /**
         * Rotates the triangle to accommodate the passed in hue.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private boolean adjustHue(int x, int y, boolean check) {

        /**
         * Adjusts the hue based on the passed in location.
         *
         * @param x X location to adjust to, relative to the origin of the
         *        wheel
         * @param y Y location to adjust to, relative to the origin of the
         *        wheel
         * @param check if true the location is checked to make sure
         *        it is contained in the wheel, if false the location is
         *        constrained to fit in the wheel
         * @return true if the location is valid.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private void setSaturationAndBrightness(float s, float b,
                                             int newCircleX, int newCircleY) {

        /**
         * Sets the saturation and brightness.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private void setSaturationAndBrightness(float s, float b) {

        /**
         * Sets the saturation and brightness.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        boolean adjustSB(int x, int y, boolean checkLoc) {

        /**
         * Adjusts the saturation and brightness. <code>x</code> and
         * <code>y</code> give the location to adjust to and are relative
         * to the origin of the wheel/triangle.
         *
         * @param x X coordinate on the triangle to adjust to
         * @param y Y coordinate on the triangle to adjust to
         * @param checkLoc if true the location is checked to make sure
         *        it is contained in the triangle, if false the location is
         *        constrained to fit in the triangle.
         * @return true if the location is valid
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private Image getWheelImage(int size) {

        /**
         * Returns a color wheel image for the specified size.
         *
         * @param size Integer giving size of color wheel.
         * @return Color wheel image
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private Image getImage(int size) {

        /**
         * Returns an image representing the triangle and wheel.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        int getColorY() {

        /**
         * Returns the y location of the selected color indicator.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        int getColorX() {

        /**
         * Returns the x location of the selected color indicator.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        public Color getColor() {

        /**
         * Returns the selected color.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        public void setColor(float h, float s, float b) {

        /**
         * Resets the selected color.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        boolean isWheelFocused() {

        /**
         * Returns true if the wheel currently has focus.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        void focusTriangle() {

        /**
         * Gives focus to the triangle.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        void focusWheel() {

        /**
         * Gives focus to the wheel.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        GTKColorChooserPanel getGTKColorChooserPanel() {

        /**
         * Returns the GTKColorChooserPanel.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private int circleX;

        /**
         * X location of selected color indicator.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private int flags;

        /**
         * Boolean bitmask.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private double angle;

        /**
         * Angle triangle is rotated by.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private Image triangleImage;

        /**
         * Cached image of the triangle.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private class ColorTriangle extends JPanel {

    /**
     * Class responsible for rendering a color wheel and color triangle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private static final int FLAGS_FOCUSED_WHEEL = 1 << 4;

    /**
     * Indicates the wheel has focus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private static final int FLAGS_DRAGGING_TRIANGLE = 1 << 2;

    /**
     * Indicates the triangle is being dragged.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private static final int FLAGS_CHANGED_ANGLE = 1 << 0;

    /**
     * Flag indicating the angle, or hue, has changed and the triangle
     * needs to be recreated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    public void stateChanged(ChangeEvent e) {

    /**
     * ChangeListener method, updates the necessary display widgets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void setColor(Color color, boolean updateSpinners,
                          boolean updateHSB, boolean updateModel) {

    /**
     * Rests the color.
     *
     * @param color new Color
     * @param updateSpinners whether or not to update the spinners.
     * @param updateHSB if true, the hsb fields are updated based on the
     *                  new color
     * @param updateModel if true, the model is set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void setHSB(float h, float s, float b) {

    /**
     * Resets the hsb values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void setRGB(int rgb) {

    /**
     * Resets the rgb values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void setSaturationAndBrightness(float s, float b, boolean update) {

    /**
     * Sets the saturation and brightness and updates the display if
     * necessary.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private float getBrightness() {

    /**
     * Returns the brightness.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void setBrightness(float brightness) {

    /**
     * Sets the brightness.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private float getSaturation() {

    /**
     * Returns the saturation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void setSaturation(float saturation) {

    /**
     * Resets the saturation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private float getHue() {

    /**
     * Returns the current amount of hue.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void setHue(float hue, boolean update) {

    /**
     * Sets the hue of the selected color and updates the display if
     * necessary.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void setBlue(int blue) {

    /**
     * Resets the blue component of the selected color.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void setGreen(int green) {

    /**
     * Resets the green component of the selected color.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void setRed(int red) {

    /**
     * Resets the red component of the selected color.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    public void updateChooser() {

    /**
     * Refreshes the display from the model.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void add(Container parent, String key, JComponent widget,
                     int x, int y) {

    /**
     * Adds the widget creating a JLabel with the specified name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void configureSpinner(JSpinner spinner, String name) {

    /**
     * Configures the spinner.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    protected void buildChooser() {

    /**
     * Builds and configures the widgets for the GTKColorChooserPanel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    public int getDisplayedMnemonicIndex() {

    /**
     * Character to underline that represents the mnemonic.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    public int getMnemonic() {

    /**
     * Returns the mnemonic to use with <code>getDisplayName</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    public String getDisplayName() {

    /**
     * Returns a user presentable description of this GTKColorChooserPane.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    // PENDING: remove this when a variant of this is added to awt.

    /**
     * Convenience method to transfer focus to the next child of component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
class GTKColorChooserPanel extends AbstractColorChooserPanel implements

/**
 * A color chooser panel mimicking that of GTK's: a color wheel showing
 * hue and a triangle that varies saturation and brightness.
 *
 * @author Scott Violet
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private static class ColorAction extends AbstractAction {

    /**
     * Action class used for colors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        void incrementHue(boolean positive) {

        /**
         * Increments the hue.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private int colorWheelLocationToRGB(int x, int y, double rad) {

        /**
         * Returns the RGB color to use for the specified location. The
         * passed in point must be on the color wheel and be relative to the
         * origin of the color wheel.
         *
         * @param x X location to get color for
         * @param y Y location to get color for
         * @param rad Radius from center of color wheel
         * @return integer with red, green and blue components
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private boolean isSet(int flag) {

        /**
         * Returns true if a particular flag has been set.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private void setFlag(int flag, boolean value) {

        /**
         * Updates the flags bitmask.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private int getWheelRadius() {

        /**
         * Returns the radius of the wheel.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private void setFocusType(int type) {

        /**
         * Sets the focus to one of: 0 no one, 1 the wheel or 2 the triangle.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private int getWheelWidth() {

        /**
         * Returns the width of the wheel.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private int getWheelYOrigin() {

        /**
         * Returns y origin of the wheel and triangle.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private int getWheelXOrigin() {

        /**
         * Returns the x origin of the wheel and triangle.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private int getTriangleCircumscribedRadius() {

        /**
         * Returns the circumscribed radius of the triangle.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private int getIndicatorSize() {

        /**
         * Returns the size of the color indicator.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private void setHueAngle(double angle) {

        /**
         * Sets the angle representing the hue.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private void setAngleFromHue(float hue) {

        /**
         * Rotates the triangle to accommodate the passed in hue.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private boolean adjustHue(int x, int y, boolean check) {

        /**
         * Adjusts the hue based on the passed in location.
         *
         * @param x X location to adjust to, relative to the origin of the
         *        wheel
         * @param y Y location to adjust to, relative to the origin of the
         *        wheel
         * @param check if true the location is checked to make sure
         *        it is contained in the wheel, if false the location is
         *        constrained to fit in the wheel
         * @return true if the location is valid.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private void setSaturationAndBrightness(float s, float b,
                                             int newCircleX, int newCircleY) {

        /**
         * Sets the saturation and brightness.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private void setSaturationAndBrightness(float s, float b) {

        /**
         * Sets the saturation and brightness.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        boolean adjustSB(int x, int y, boolean checkLoc) {

        /**
         * Adjusts the saturation and brightness. <code>x</code> and
         * <code>y</code> give the location to adjust to and are relative
         * to the origin of the wheel/triangle.
         *
         * @param x X coordinate on the triangle to adjust to
         * @param y Y coordinate on the triangle to adjust to
         * @param checkLoc if true the location is checked to make sure
         *        it is contained in the triangle, if false the location is
         *        constrained to fit in the triangle.
         * @return true if the location is valid
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private Image getWheelImage(int size) {

        /**
         * Returns a color wheel image for the specified size.
         *
         * @param size Integer giving size of color wheel.
         * @return Color wheel image
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private Image getImage(int size) {

        /**
         * Returns an image representing the triangle and wheel.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        int getColorY() {

        /**
         * Returns the y location of the selected color indicator.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        int getColorX() {

        /**
         * Returns the x location of the selected color indicator.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        public Color getColor() {

        /**
         * Returns the selected color.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        public void setColor(float h, float s, float b) {

        /**
         * Resets the selected color.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        boolean isWheelFocused() {

        /**
         * Returns true if the wheel currently has focus.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        void focusTriangle() {

        /**
         * Gives focus to the triangle.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        void focusWheel() {

        /**
         * Gives focus to the wheel.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        GTKColorChooserPanel getGTKColorChooserPanel() {

        /**
         * Returns the GTKColorChooserPanel.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private int circleX;

        /**
         * X location of selected color indicator.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private int flags;

        /**
         * Boolean bitmask.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private double angle;

        /**
         * Angle triangle is rotated by.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
        private Image triangleImage;

        /**
         * Cached image of the triangle.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private class ColorTriangle extends JPanel {

    /**
     * Class responsible for rendering a color wheel and color triangle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private static final int FLAGS_FOCUSED_WHEEL = 1 << 4;

    /**
     * Indicates the wheel has focus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private static final int FLAGS_DRAGGING_TRIANGLE = 1 << 2;

    /**
     * Indicates the triangle is being dragged.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private static final int FLAGS_CHANGED_ANGLE = 1 << 0;

    /**
     * Flag indicating the angle, or hue, has changed and the triangle
     * needs to be recreated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    public void stateChanged(ChangeEvent e) {

    /**
     * ChangeListener method, updates the necessary display widgets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void setColor(Color color, boolean updateSpinners,
                          boolean updateHSB, boolean updateModel) {

    /**
     * Rests the color.
     *
     * @param color new Color
     * @param updateSpinners whether or not to update the spinners.
     * @param updateHSB if true, the hsb fields are updated based on the
     *                  new color
     * @param updateModel if true, the model is set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void setHSB(float h, float s, float b) {

    /**
     * Resets the hsb values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void setRGB(int rgb) {

    /**
     * Resets the rgb values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void setSaturationAndBrightness(float s, float b, boolean update) {

    /**
     * Sets the saturation and brightness and updates the display if
     * necessary.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private float getBrightness() {

    /**
     * Returns the brightness.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void setBrightness(float brightness) {

    /**
     * Sets the brightness.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private float getSaturation() {

    /**
     * Returns the saturation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void setSaturation(float saturation) {

    /**
     * Resets the saturation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private float getHue() {

    /**
     * Returns the current amount of hue.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void setHue(float hue, boolean update) {

    /**
     * Sets the hue of the selected color and updates the display if
     * necessary.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void setBlue(int blue) {

    /**
     * Resets the blue component of the selected color.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void setGreen(int green) {

    /**
     * Resets the green component of the selected color.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void setRed(int red) {

    /**
     * Resets the red component of the selected color.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    public void updateChooser() {

    /**
     * Refreshes the display from the model.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void add(Container parent, String key, JComponent widget,
                     int x, int y) {

    /**
     * Adds the widget creating a JLabel with the specified name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    private void configureSpinner(JSpinner spinner, String name) {

    /**
     * Configures the spinner.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    protected void buildChooser() {

    /**
     * Builds and configures the widgets for the GTKColorChooserPanel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    public int getDisplayedMnemonicIndex() {

    /**
     * Character to underline that represents the mnemonic.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    public int getMnemonic() {

    /**
     * Returns the mnemonic to use with <code>getDisplayName</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    public String getDisplayName() {

    /**
     * Returns a user presentable description of this GTKColorChooserPane.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
    // PENDING: remove this when a variant of this is added to awt.

    /**
     * Convenience method to transfer focus to the next child of component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKColorChooserPanel.java
class GTKColorChooserPanel extends AbstractColorChooserPanel implements

/**
 * A color chooser panel mimicking that of GTK's: a color wheel showing
 * hue and a triangle that varies saturation and brightness.
 *
 * @author Scott Violet
 */
