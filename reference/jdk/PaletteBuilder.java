_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/common/PaletteBuilder.java
    protected class ColorNode {

    /**
     * The node of color tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/common/PaletteBuilder.java
    public static boolean canCreatePalette(RenderedImage image) {

    /**
     * Returns <code>true</code> if PaletteBuilder is able to create
     * palette for given rendered image.
     *
     * @param image an instance of <code>RenderedImage</code> to be
     * indexed.
     *
     * @return <code>true</code> if the <code>PaletteBuilder</code>
     * is likely to be able to create palette for this image type.
     *
     * @exception IllegalArgumentException if <code>image</code>
     * is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/common/PaletteBuilder.java
    public static boolean canCreatePalette(ImageTypeSpecifier type) {

    /**
     * Returns <code>true</code> if PaletteBuilder is able to create
     * palette for given image type.
     *
     * @param type an instance of <code>ImageTypeSpecifier</code> to be
     * indexed.
     *
     * @return <code>true</code> if the <code>PaletteBuilder</code>
     * is likely to be able to create palette for this image type.
     *
     * @exception IllegalArgumentException if <code>type</code>
     * is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/common/PaletteBuilder.java
    public static IndexColorModel createIndexColorModel(RenderedImage img) {

    /**
     * Creates an palette representing colors from given image
     * <code>img</code>. If number of colors in the given image exceeds
     * maximum palette size closest colors would be merged.
     *
     * @exception IllegalArgumentException if <code>img</code> is
     * <code>null</code>.
     *
     * @exception UnsupportedOperationException if implemented method
     * is unable to create approximation of <code>img</code>
     * and <code>canCreatePalette</code> returns <code>false</code>.
     *
     * @see createIndexedImage
     *
     * @see canCreatePalette
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/common/PaletteBuilder.java
    public static RenderedImage createIndexedImage(RenderedImage src) {

    /**
     * Creates an image representing given image
     * <code>src</code> using <code>IndexColorModel</code>.
     *
     * Lossless conversion is not always possible (e.g. if number
     * of colors in the  given image exceeds maximum palette size).
     * Result image then is an approximation constructed by octree
     * quantization method.
     *
     * @exception IllegalArgumentException if <code>src</code> is
     * <code>null</code>.
     *
     * @exception UnsupportedOperationException if implemented method
     * is unable to create approximation of <code>src</code>
     * and <code>canCreatePalette</code> returns <code>false</code>.
     *
     * @see createIndexColorModel
     *
     * @see canCreatePalette
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/common/PaletteBuilder.java
    protected static final int MAXLEVEL = 8;

    /**
     * maximum of tree depth
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/common/PaletteBuilder.java
public class PaletteBuilder {

/**
 * This class implements the octree quantization method
 *  as it is described in the "Graphics Gems"
 *  (ISBN 0-12-286166-3, Chapter 4, pages 297-293)
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/common/PaletteBuilder.java
    protected class ColorNode {

    /**
     * The node of color tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/common/PaletteBuilder.java
    public static boolean canCreatePalette(RenderedImage image) {

    /**
     * Returns <code>true</code> if PaletteBuilder is able to create
     * palette for given rendered image.
     *
     * @param image an instance of <code>RenderedImage</code> to be
     * indexed.
     *
     * @return <code>true</code> if the <code>PaletteBuilder</code>
     * is likely to be able to create palette for this image type.
     *
     * @exception IllegalArgumentException if <code>image</code>
     * is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/common/PaletteBuilder.java
    public static boolean canCreatePalette(ImageTypeSpecifier type) {

    /**
     * Returns <code>true</code> if PaletteBuilder is able to create
     * palette for given image type.
     *
     * @param type an instance of <code>ImageTypeSpecifier</code> to be
     * indexed.
     *
     * @return <code>true</code> if the <code>PaletteBuilder</code>
     * is likely to be able to create palette for this image type.
     *
     * @exception IllegalArgumentException if <code>type</code>
     * is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/common/PaletteBuilder.java
    public static IndexColorModel createIndexColorModel(RenderedImage img) {

    /**
     * Creates an palette representing colors from given image
     * <code>img</code>. If number of colors in the given image exceeds
     * maximum palette size closest colors would be merged.
     *
     * @exception IllegalArgumentException if <code>img</code> is
     * <code>null</code>.
     *
     * @exception UnsupportedOperationException if implemented method
     * is unable to create approximation of <code>img</code>
     * and <code>canCreatePalette</code> returns <code>false</code>.
     *
     * @see createIndexedImage
     *
     * @see canCreatePalette
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/common/PaletteBuilder.java
    public static RenderedImage createIndexedImage(RenderedImage src) {

    /**
     * Creates an image representing given image
     * <code>src</code> using <code>IndexColorModel</code>.
     *
     * Lossless conversion is not always possible (e.g. if number
     * of colors in the  given image exceeds maximum palette size).
     * Result image then is an approximation constructed by octree
     * quantization method.
     *
     * @exception IllegalArgumentException if <code>src</code> is
     * <code>null</code>.
     *
     * @exception UnsupportedOperationException if implemented method
     * is unable to create approximation of <code>src</code>
     * and <code>canCreatePalette</code> returns <code>false</code>.
     *
     * @see createIndexColorModel
     *
     * @see canCreatePalette
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/common/PaletteBuilder.java
    protected static final int MAXLEVEL = 8;

    /**
     * maximum of tree depth
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/common/PaletteBuilder.java
public class PaletteBuilder {

/**
 * This class implements the octree quantization method
 *  as it is described in the "Graphics Gems"
 *  (ISBN 0-12-286166-3, Chapter 4, pages 297-293)
 */
