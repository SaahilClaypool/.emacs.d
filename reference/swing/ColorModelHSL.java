_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/ColorModelHSL.java
    static float getHue(float red, float green, float blue, float max, float min) {

    /**
     * Calculates the hue component for HSL and HSV color spaces.
     *
     * @param red    the red component of the color
     * @param green  the green component of the color
     * @param blue   the blue component of the color
     * @param max    the larger of {@code red}, {@code green} and {@code blue}
     * @param min    the smaller of {@code red}, {@code green} and {@code blue}
     * @return the hue component
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/ColorModelHSL.java
    static float max(float red, float green, float blue) {

    /**
     * Returns the larger of three color components.
     *
     * @param red    the red component of the color
     * @param green  the green component of the color
     * @param blue   the blue component of the color
     * @return the larger of {@code red}, {@code green} and {@code blue}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/ColorModelHSL.java
    static float min(float red, float green, float blue) {

    /**
     * Returns the smaller of three color components.
     *
     * @param red    the red component of the color
     * @param green  the green component of the color
     * @param blue   the blue component of the color
     * @return the smaller of {@code red}, {@code green} and {@code blue}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/ColorModelHSL.java
    private static float[] RGBtoHSL(float[] rgb, float[] hsl) {

    /**
     * Converts RGB components of a color to a set of HSL components.
     *
     * @param rgb  a float array with length of at least 3
     *             that contains RGB components of a color
     * @param hsl  a float array with length equal to
     *             the number of HSL components
     * @return a float array that contains HSL components
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/ColorModelHSL.java
    private static float[] HSLtoRGB(float[] hsl, float[] rgb) {

    /**
     * Converts HSL components of a color to a set of RGB components.
     *
     * @param hsl  a float array with length equal to
     *             the number of HSL components
     * @param rgb  a float array with length of at least 3
     *             that contains RGB components of a color
     * @return a float array that contains RGB components
     */
