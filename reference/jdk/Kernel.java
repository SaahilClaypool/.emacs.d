_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/Kernel.java
    public Object clone() {

    /**
     * Clones this object.
     * @return a clone of this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/Kernel.java
    final public float[] getKernelData(float[] data) {

    /**
     * Returns the kernel data in row major order.
     * The <code>data</code> array is returned.  If <code>data</code>
     * is <code>null</code>, a new array is allocated.
     * @param data  if non-null, contains the returned kernel data
     * @return the <code>data</code> array containing the kernel data
     *         in row major order or, if <code>data</code> is
     *         <code>null</code>, a newly allocated array containing
     *         the kernel data in row major order
     * @throws IllegalArgumentException if <code>data</code> is less
     *         than the size of this <code>Kernel</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/Kernel.java
    final public int getHeight() {

    /**
     * Returns the height of this <code>Kernel</code>.
     * @return the height of this <code>Kernel</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/Kernel.java
    final public int getWidth() {

    /**
     * Returns the width of this <code>Kernel</code>.
     * @return the width of this <code>Kernel</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/Kernel.java
    final public int getYOrigin() {

    /**
     * Returns the Y origin of this <code>Kernel</code>.
     * @return the Y origin.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/Kernel.java
    final public int getXOrigin(){

    /**
     * Returns the X origin of this <code>Kernel</code>.
     * @return the X origin.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/Kernel.java
    public Kernel(int width, int height, float data[]) {

    /**
     * Constructs a <code>Kernel</code> object from an array of floats.
     * The first <code>width</code>*<code>height</code> elements of
     * the <code>data</code> array are copied.
     * If the length of the <code>data</code> array is less
     * than width*height, an <code>IllegalArgumentException</code> is thrown.
     * The X origin is (width-1)/2 and the Y origin is (height-1)/2.
     * @param width         width of the kernel
     * @param height        height of the kernel
     * @param data          kernel data in row major order
     * @throws IllegalArgumentException if the length of <code>data</code>
     *         is less than the product of <code>width</code> and
     *         <code>height</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/Kernel.java
public class Kernel implements Cloneable {

/**
 * The <code>Kernel</code> class defines a matrix that describes how a
 * specified pixel and its surrounding pixels affect the value
 * computed for the pixel's position in the output image of a filtering
 * operation.  The X origin and Y origin indicate the kernel matrix element
 * that corresponds to the pixel position for which an output value is
 * being computed.
 *
 * @see ConvolveOp
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/Kernel.java
    public Object clone() {

    /**
     * Clones this object.
     * @return a clone of this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/Kernel.java
    final public float[] getKernelData(float[] data) {

    /**
     * Returns the kernel data in row major order.
     * The <code>data</code> array is returned.  If <code>data</code>
     * is <code>null</code>, a new array is allocated.
     * @param data  if non-null, contains the returned kernel data
     * @return the <code>data</code> array containing the kernel data
     *         in row major order or, if <code>data</code> is
     *         <code>null</code>, a newly allocated array containing
     *         the kernel data in row major order
     * @throws IllegalArgumentException if <code>data</code> is less
     *         than the size of this <code>Kernel</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/Kernel.java
    final public int getHeight() {

    /**
     * Returns the height of this <code>Kernel</code>.
     * @return the height of this <code>Kernel</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/Kernel.java
    final public int getWidth() {

    /**
     * Returns the width of this <code>Kernel</code>.
     * @return the width of this <code>Kernel</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/Kernel.java
    final public int getYOrigin() {

    /**
     * Returns the Y origin of this <code>Kernel</code>.
     * @return the Y origin.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/Kernel.java
    final public int getXOrigin(){

    /**
     * Returns the X origin of this <code>Kernel</code>.
     * @return the X origin.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/Kernel.java
    public Kernel(int width, int height, float data[]) {

    /**
     * Constructs a <code>Kernel</code> object from an array of floats.
     * The first <code>width</code>*<code>height</code> elements of
     * the <code>data</code> array are copied.
     * If the length of the <code>data</code> array is less
     * than width*height, an <code>IllegalArgumentException</code> is thrown.
     * The X origin is (width-1)/2 and the Y origin is (height-1)/2.
     * @param width         width of the kernel
     * @param height        height of the kernel
     * @param data          kernel data in row major order
     * @throws IllegalArgumentException if the length of <code>data</code>
     *         is less than the product of <code>width</code> and
     *         <code>height</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/Kernel.java
public class Kernel implements Cloneable {

/**
 * The <code>Kernel</code> class defines a matrix that describes how a
 * specified pixel and its surrounding pixels affect the value
 * computed for the pixel's position in the output image of a filtering
 * operation.  The X origin and Y origin indicate the kernel matrix element
 * that corresponds to the pixel position for which an output value is
 * being computed.
 *
 * @see ConvolveOp
 */
