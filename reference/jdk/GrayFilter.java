_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/GrayFilter.java
    public int filterRGB(int x, int y, int rgb) {

    /**
     * Overrides <code>RGBImageFilter.filterRGB</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/GrayFilter.java
    public GrayFilter(boolean b, int p) {

    /**
     * Constructs a GrayFilter object that filters a color image to a
     * grayscale image. Used by buttons to create disabled ("grayed out")
     * button images.
     *
     * @param b  a boolean -- true if the pixels should be brightened
     * @param p  an int in the range 0..100 that determines the percentage
     *           of gray, where 100 is the darkest gray, and 0 is the lightest
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/GrayFilter.java
    public static Image createDisabledImage (Image i) {

    /**
     * Creates a disabled image
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/GrayFilter.java
public class GrayFilter extends RGBImageFilter {

/**
 * An image filter that "disables" an image by turning
 * it into a grayscale image, and brightening the pixels
 * in the image. Used by buttons to create an image for
 * a disabled button.
 *
 * @author      Jeff Dinkins
 * @author      Tom Ball
 * @author      Jim Graham
 */
