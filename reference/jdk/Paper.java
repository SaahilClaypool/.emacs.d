_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    public double getImageableHeight() {

    /**
     * Returns the height of this <code>Paper</code> object's imageable
     * area.
     * @return the height of the imageable area.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    public double getImageableWidth() {

    /**
     * Returns the width of this <code>Paper</code> object's imageable
     * area.
     * @return the width of the imageable area.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    public double getImageableY() {

    /**
     * Returns the y coordinate of the upper-left corner of this
     * <code>Paper</code> object's imageable area.
     * @return the y coordinate of the imageable area.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    public double getImageableX() {

    /**
     * Returns the x coordinate of the upper-left corner of this
     * <code>Paper</code> object's imageable area.
     * @return the x coordinate of the imageable area.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    public void setImageableArea(double x, double y,
                                 double width, double height) {

    /**
     * Sets the imageable area of this <code>Paper</code>.  The
     * imageable area is the area on the page in which printing
     * occurs.
     * @param x the X coordinate to which to set the
     * upper-left corner of the imageable area of this <code>Paper</code>
     * @param y the Y coordinate to which to set the
     * upper-left corner of the imageable area of this <code>Paper</code>
     * @param width the value to which to set the width of the
     * imageable area of this <code>Paper</code>
     * @param height the value to which to set the height of the
     * imageable area of this <code>Paper</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    public double getWidth() {

    /**
     * Returns the width of the page in 1/72nds
     * of an inch.
     * @return the width of the page described by this
     * <code>Paper</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    public void setSize(double width, double height) {

    /**
     * Sets the width and height of this <code>Paper</code>
     * object, which represents the properties of the page onto
     * which printing occurs.
     * The dimensions are supplied in 1/72nds of
     * an inch.
     * @param width the value to which to set this <code>Paper</code>
     * object's width
     * @param height the value to which to set this <code>Paper</code>
     * object's height
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    public double getHeight() {

    /**
     * Returns the height of the page in 1/72nds of an inch.
     * @return the height of the page described by this
     *          <code>Paper</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    public Object clone() {

    /**
     * Creates a copy of this <code>Paper</code> with the same contents
     * as this <code>Paper</code>.
     * @return a copy of this <code>Paper</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    public Paper() {

    /**
     * Creates a letter sized piece of paper
     * with one inch margins.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    private Rectangle2D mImageableArea;

    /**
     * The area of the page on which drawing will
     * be visable. The area outside of this
     * rectangle but on the Page generally
     * reflects the printer's hardware margins.
     * The origin of the physical page is
     * at (0, 0) with this rectangle provided
     * in that coordinate system.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    private double mWidth;

    /**
     * The width of the physical page in 1/72nds
     * of an inch.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    private double mHeight;

    /**
     * The height of the physical page in 1/72nds
     * of an inch. The number is stored as a floating
     * point value rather than as an integer
     * to facilitate the conversion from metric
     * units to 1/72nds of an inch and then back.
     * (This may or may not be a good enough reason
     * for a float).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
public class Paper implements Cloneable {

/**
 * The <code>Paper</code> class describes the physical characteristics of
 * a piece of paper.
 * <p>
 * When creating a <code>Paper</code> object, it is the application's
 * responsibility to ensure that the paper size and the imageable area
 * are compatible.  For example, if the paper size is changed from
 * 11 x 17 to 8.5 x 11, the application might need to reduce the
 * imageable area so that whatever is printed fits on the page.
 * <p>
 * @see #setSize(double, double)
 * @see #setImageableArea(double, double, double, double)
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    public double getImageableHeight() {

    /**
     * Returns the height of this <code>Paper</code> object's imageable
     * area.
     * @return the height of the imageable area.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    public double getImageableWidth() {

    /**
     * Returns the width of this <code>Paper</code> object's imageable
     * area.
     * @return the width of the imageable area.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    public double getImageableY() {

    /**
     * Returns the y coordinate of the upper-left corner of this
     * <code>Paper</code> object's imageable area.
     * @return the y coordinate of the imageable area.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    public double getImageableX() {

    /**
     * Returns the x coordinate of the upper-left corner of this
     * <code>Paper</code> object's imageable area.
     * @return the x coordinate of the imageable area.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    public void setImageableArea(double x, double y,
                                 double width, double height) {

    /**
     * Sets the imageable area of this <code>Paper</code>.  The
     * imageable area is the area on the page in which printing
     * occurs.
     * @param x the X coordinate to which to set the
     * upper-left corner of the imageable area of this <code>Paper</code>
     * @param y the Y coordinate to which to set the
     * upper-left corner of the imageable area of this <code>Paper</code>
     * @param width the value to which to set the width of the
     * imageable area of this <code>Paper</code>
     * @param height the value to which to set the height of the
     * imageable area of this <code>Paper</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    public double getWidth() {

    /**
     * Returns the width of the page in 1/72nds
     * of an inch.
     * @return the width of the page described by this
     * <code>Paper</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    public void setSize(double width, double height) {

    /**
     * Sets the width and height of this <code>Paper</code>
     * object, which represents the properties of the page onto
     * which printing occurs.
     * The dimensions are supplied in 1/72nds of
     * an inch.
     * @param width the value to which to set this <code>Paper</code>
     * object's width
     * @param height the value to which to set this <code>Paper</code>
     * object's height
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    public double getHeight() {

    /**
     * Returns the height of the page in 1/72nds of an inch.
     * @return the height of the page described by this
     *          <code>Paper</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    public Object clone() {

    /**
     * Creates a copy of this <code>Paper</code> with the same contents
     * as this <code>Paper</code>.
     * @return a copy of this <code>Paper</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    public Paper() {

    /**
     * Creates a letter sized piece of paper
     * with one inch margins.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    private Rectangle2D mImageableArea;

    /**
     * The area of the page on which drawing will
     * be visable. The area outside of this
     * rectangle but on the Page generally
     * reflects the printer's hardware margins.
     * The origin of the physical page is
     * at (0, 0) with this rectangle provided
     * in that coordinate system.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    private double mWidth;

    /**
     * The width of the physical page in 1/72nds
     * of an inch.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
    private double mHeight;

    /**
     * The height of the physical page in 1/72nds
     * of an inch. The number is stored as a floating
     * point value rather than as an integer
     * to facilitate the conversion from metric
     * units to 1/72nds of an inch and then back.
     * (This may or may not be a good enough reason
     * for a float).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Paper.java
public class Paper implements Cloneable {

/**
 * The <code>Paper</code> class describes the physical characteristics of
 * a piece of paper.
 * <p>
 * When creating a <code>Paper</code> object, it is the application's
 * responsibility to ensure that the paper size and the imageable area
 * are compatible.  For example, if the paper size is changed from
 * 11 x 17 to 8.5 x 11, the application might need to reduce the
 * imageable area so that whatever is printed fits on the page.
 * <p>
 * @see #setSize(double, double)
 * @see #setImageableArea(double, double, double, double)
 */
