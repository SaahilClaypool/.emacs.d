_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    static JPEGHuffmanTable [] getDefaultHuffmanTables(boolean wantDC) {

    /**
     * Return an array of default Huffman tables.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    static JPEGQTable [] getDefaultQTables() {

    /**
     * Return an array of default, visually lossless quantization tables.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    static float convertToLinearQuality(float quality) {

    /**
     * Converts an ImageWriteParam (i.e. IJG) non-linear quality value
     * to a float suitable for passing to JPEGQTable.getScaledInstance().
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    static int transformForType(ImageTypeSpecifier imageType, boolean input) {

    /**
     * Given an image type, return the Adobe transform corresponding to
     * that type, or ADOBE_IMPOSSIBLE if the image type is incompatible
     * with an Adobe marker segment.  If <code>input</code> is true, then
     * the image type is considered before colorspace conversion.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    static boolean isJFIFcompliant(ImageTypeSpecifier imageType,
                                   boolean input) {

    /**
     * Returns <code>true</code> if the given imageType can be used
     * in a JFIF file.  If <code>input</code> is true, then the
     * image type is considered before colorspace conversion.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    static boolean isNonStandardICC(ColorSpace cs) {

    /**
     * Returns <code>true</code> if the given <code>ColorSpace</code>
     * object is an instance of ICC_ColorSpace but is not one of the
     * standard <code>ColorSpaces</code> returned by
     * <code>ColorSpace.getInstance()</code>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    static final int [] [] bandOffsets = {{0},

    /** IJG can handle up to 4-channel JPEGs */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int NUM_DENSITY_UNIT = 3;

    /** The max known value for DENSITY_UNIT */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int DENSITY_UNIT_DOTS_CM      = 2;

    /** Pixel density is in pixels per centemeter. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int DENSITY_UNIT_DOTS_INCH    = 1;

    /** Pixel density is in pixels per inch. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int DENSITY_UNIT_ASPECT_RATIO = 0;

    /** The X and Y units simply indicate the aspect ratio of the pixels. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int COM = 0xFE;

    /** Comment marker */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int APP14 = 0xEE;

    /** APP14 used by Adobe */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int APP0 = 0xE0;

    /** APP0 used by JFIF */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int EXP = 0xDF;

    /** Expand reference image(s) */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int DHP = 0xDE;

    /** Define Heirarchical progression */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int DRI = 0xDD;

    /** Define Restart Interval */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int DNL = 0xDC;

    /** Define Number of lines */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int DQT = 0xDB;

    /** Define Quantisation Tables */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int SOS = 0xDA;

    /** Start of Scan */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int EOI = 0xD9;

    /** End of Image */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int SOI = 0xD8;

    /** Start of Image */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int RESTART_RANGE = 8;

    /** Number of restart markers */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int SOF15 = 0xCF;

    /** Differential Lossless, Arithmetic coding */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int SOF14 = 0xCE;

    /** Differential Progressive DCT, Arithmetic coding */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int SOF13 = 0xCD;

    /** Differential Sequential DCT, Arithmetic coding */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int DAC = 0xCC;

    /** Define Arithmetic conditioning tables */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int SOF11 = 0xCB;

    /** Lossless Sequential, Arithmetic coding */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int SOF10 = 0xCA;

    /** Progressive DCT, Arithmetic coding */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int SOF9 = 0xC9;

    /** Extended Sequential DCT, Arithmetic coding */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int JPG = 0xC8;

    /** Reserved for JPEG extensions */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int SOF7 = 0xC7;

    /** Differential Lossless */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int SOF6 = 0xC6;

    /** Differential Progressive DCT */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int SOF5 = 0xC5;

    /** Differential Sequential DCT */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int DHT = 0xC4;

    /** Define Huffman Tables */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int SOF3 = 0xC3;

    /** Lossless Sequential */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int SOF2 = 0xC2;

    /** Progressive DCT */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int SOF1 = 0xC1;

    /** Extended Sequential DCT */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int SOF0 = 0xC0;

    /** Baseline DCT */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
    public static final int TEM = 0x01;

    /** For temporary use in arithmetic coding */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEG.java
public class JPEG {

/**
 * A class containing JPEG-related constants, definitions, and
 * static methods.  This class and its constants must be public so that
 * <code>JPEGImageWriteParam</code> can see it.
 */
