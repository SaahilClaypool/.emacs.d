_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public double[] getMatrix() {

    /**
     * Returns a transformation matrix that translates user
     * space rendering to the requested orientation
     * of the page.  The values are placed into the
     * array as
     * {&nbsp;m00,&nbsp;m10,&nbsp;m01,&nbsp;m11,&nbsp;m02,&nbsp;m12} in
     * the form required by the {@link AffineTransform}
     * constructor.
     * @return the matrix used to translate user space rendering
     * to the orientation of the page.
     * @see java.awt.geom.AffineTransform
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public int getOrientation() {

    /**
     * Returns the orientation of this <code>PageFormat</code>.
     * @return this <code>PageFormat</code> object's orientation.
     * @see #setOrientation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public void setOrientation(int orientation) throws IllegalArgumentException

    /**
     * Sets the page orientation. <code>orientation</code> must be
     * one of the constants: PORTRAIT, LANDSCAPE,
     * or REVERSE_LANDSCAPE.
     * @param orientation the new orientation for the page
     * @throws IllegalArgumentException if
     *          an unknown orientation was requested
     * @see #getOrientation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
     public void setPaper(Paper paper) {

    /**
     * Sets the <code>Paper</code> object for this
     * <code>PageFormat</code>.
     * @param paper the <code>Paper</code> object to which to set
     * the <code>Paper</code> object for this <code>PageFormat</code>.
     * @exception NullPointerException
     *              a null paper instance was passed as a parameter.
     * @see #getPaper
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public Paper getPaper() {

    /**
     * Returns a copy of the {@link Paper} object associated
     * with this <code>PageFormat</code>.  Changes made to the
     * <code>Paper</code> object returned from this method do not
     * affect the <code>Paper</code> object of this
     * <code>PageFormat</code>.  To update the <code>Paper</code>
     * object of this <code>PageFormat</code>, create a new
     * <code>Paper</code> object and set it into this
     * <code>PageFormat</code> by using the {@link #setPaper(Paper)}
     * method.
     * @return a copy of the <code>Paper</code> object associated
     *          with this <code>PageFormat</code>.
     * @see #setPaper
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public double getImageableHeight() {

    /**
     * Return the height, in 1/72nds of an inch, of the imageable
     * area of the page. This method takes into account the orientation
     * of the page.
     * @return the height of the page.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public double getImageableWidth() {

    /**
     * Returns the width, in 1/72nds of an inch, of the imageable
     * area of the page. This method takes into account the orientation
     * of the page.
     * @return the width of the page.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public double getImageableY() {

    /**
     * Returns the y coordinate of the upper left point of the
     * imageable area of the <code>Paper</code> object
     * associated with this <code>PageFormat</code>.
     * This method takes into account the
     * orientation of the page.
     * @return the y coordinate of the upper left point of the
     * imageable area of the <code>Paper</code> object
     * associated with this <code>PageFormat</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public double getImageableX() {

    /**
     * Returns the x coordinate of the upper left point of the
     * imageable area of the <code>Paper</code> object
     * associated with this <code>PageFormat</code>.
     * This method takes into account the
     * orientation of the page.
     * @return the x coordinate of the upper left point of the
     * imageable area of the <code>Paper</code> object
     * associated with this <code>PageFormat</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public double getHeight() {

    /**
     * Returns the height, in 1/72nds of an inch, of the page.
     * This method takes into account the orientation of the
     * page when determining the height.
     * @return the height of the page.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public double getWidth() {

    /**
     * Returns the width, in 1/72nds of an inch, of the page.
     * This method takes into account the orientation of the
     * page when determining the width.
     * @return the width of the page.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public Object clone() {

    /**
     * Makes a copy of this <code>PageFormat</code> with the same
     * contents as this <code>PageFormat</code>.
     * @return a copy of this <code>PageFormat</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public PageFormat()

    /**
     * Creates a default, portrait-oriented
     * <code>PageFormat</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    private int mOrientation = PORTRAIT;

    /**
     * The orientation of the current page. This will be
     * one of the constants: PORTRIAT, LANDSCAPE, or
     * REVERSE_LANDSCAPE,
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    private Paper mPaper;

    /**
     * A description of the physical piece of paper.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    @Native public static final int REVERSE_LANDSCAPE = 2;

    /**
     *  The origin is at the top right of the paper with x
     *  running top to bottom and y running right to left.
     *  Note that this is the Macintosh landscape.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    @Native public static final int PORTRAIT = 1;

    /**
     *  The origin is at the top left of the paper with
     *  x running to the right and y running down the
     *  paper.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    @Native public static final int LANDSCAPE = 0;

    /**
     *  The origin is at the bottom left of the paper with
     *  x running bottom to top and y running left to right.
     *  Note that this is not the Macintosh landscape but
     *  is the Window's and PostScript landscape.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
public class PageFormat implements Cloneable

/**
 * The <code>PageFormat</code> class describes the size and
 * orientation of a page to be printed.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public double[] getMatrix() {

    /**
     * Returns a transformation matrix that translates user
     * space rendering to the requested orientation
     * of the page.  The values are placed into the
     * array as
     * {&nbsp;m00,&nbsp;m10,&nbsp;m01,&nbsp;m11,&nbsp;m02,&nbsp;m12} in
     * the form required by the {@link AffineTransform}
     * constructor.
     * @return the matrix used to translate user space rendering
     * to the orientation of the page.
     * @see java.awt.geom.AffineTransform
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public int getOrientation() {

    /**
     * Returns the orientation of this <code>PageFormat</code>.
     * @return this <code>PageFormat</code> object's orientation.
     * @see #setOrientation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public void setOrientation(int orientation) throws IllegalArgumentException

    /**
     * Sets the page orientation. <code>orientation</code> must be
     * one of the constants: PORTRAIT, LANDSCAPE,
     * or REVERSE_LANDSCAPE.
     * @param orientation the new orientation for the page
     * @throws IllegalArgumentException if
     *          an unknown orientation was requested
     * @see #getOrientation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
     public void setPaper(Paper paper) {

    /**
     * Sets the <code>Paper</code> object for this
     * <code>PageFormat</code>.
     * @param paper the <code>Paper</code> object to which to set
     * the <code>Paper</code> object for this <code>PageFormat</code>.
     * @exception NullPointerException
     *              a null paper instance was passed as a parameter.
     * @see #getPaper
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public Paper getPaper() {

    /**
     * Returns a copy of the {@link Paper} object associated
     * with this <code>PageFormat</code>.  Changes made to the
     * <code>Paper</code> object returned from this method do not
     * affect the <code>Paper</code> object of this
     * <code>PageFormat</code>.  To update the <code>Paper</code>
     * object of this <code>PageFormat</code>, create a new
     * <code>Paper</code> object and set it into this
     * <code>PageFormat</code> by using the {@link #setPaper(Paper)}
     * method.
     * @return a copy of the <code>Paper</code> object associated
     *          with this <code>PageFormat</code>.
     * @see #setPaper
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public double getImageableHeight() {

    /**
     * Return the height, in 1/72nds of an inch, of the imageable
     * area of the page. This method takes into account the orientation
     * of the page.
     * @return the height of the page.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public double getImageableWidth() {

    /**
     * Returns the width, in 1/72nds of an inch, of the imageable
     * area of the page. This method takes into account the orientation
     * of the page.
     * @return the width of the page.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public double getImageableY() {

    /**
     * Returns the y coordinate of the upper left point of the
     * imageable area of the <code>Paper</code> object
     * associated with this <code>PageFormat</code>.
     * This method takes into account the
     * orientation of the page.
     * @return the y coordinate of the upper left point of the
     * imageable area of the <code>Paper</code> object
     * associated with this <code>PageFormat</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public double getImageableX() {

    /**
     * Returns the x coordinate of the upper left point of the
     * imageable area of the <code>Paper</code> object
     * associated with this <code>PageFormat</code>.
     * This method takes into account the
     * orientation of the page.
     * @return the x coordinate of the upper left point of the
     * imageable area of the <code>Paper</code> object
     * associated with this <code>PageFormat</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public double getHeight() {

    /**
     * Returns the height, in 1/72nds of an inch, of the page.
     * This method takes into account the orientation of the
     * page when determining the height.
     * @return the height of the page.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public double getWidth() {

    /**
     * Returns the width, in 1/72nds of an inch, of the page.
     * This method takes into account the orientation of the
     * page when determining the width.
     * @return the width of the page.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public Object clone() {

    /**
     * Makes a copy of this <code>PageFormat</code> with the same
     * contents as this <code>PageFormat</code>.
     * @return a copy of this <code>PageFormat</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    public PageFormat()

    /**
     * Creates a default, portrait-oriented
     * <code>PageFormat</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    private int mOrientation = PORTRAIT;

    /**
     * The orientation of the current page. This will be
     * one of the constants: PORTRIAT, LANDSCAPE, or
     * REVERSE_LANDSCAPE,
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    private Paper mPaper;

    /**
     * A description of the physical piece of paper.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    @Native public static final int REVERSE_LANDSCAPE = 2;

    /**
     *  The origin is at the top right of the paper with x
     *  running top to bottom and y running right to left.
     *  Note that this is the Macintosh landscape.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    @Native public static final int PORTRAIT = 1;

    /**
     *  The origin is at the top left of the paper with
     *  x running to the right and y running down the
     *  paper.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
    @Native public static final int LANDSCAPE = 0;

    /**
     *  The origin is at the bottom left of the paper with
     *  x running bottom to top and y running left to right.
     *  Note that this is not the Macintosh landscape but
     *  is the Window's and PostScript landscape.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PageFormat.java
public class PageFormat implements Cloneable

/**
 * The <code>PageFormat</code> class describes the size and
 * orientation of a page to be printed.
 */
