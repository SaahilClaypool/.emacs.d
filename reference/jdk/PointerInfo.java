_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PointerInfo.java
    public Point getLocation() {

    /**
     * Returns the {@code Point} that represents the coordinates of the pointer
     * on the screen. See {@link MouseInfo#getPointerInfo} for more information
     * about coordinate calculation for multiscreen systems.
     *
     * @return coordinates of mouse pointer
     * @see MouseInfo
     * @see MouseInfo#getPointerInfo
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PointerInfo.java
    public GraphicsDevice getDevice() {

    /**
     * Returns the {@code GraphicsDevice} where the mouse pointer was at the
     * moment this {@code PointerInfo} was created.
     *
     * @return {@code GraphicsDevice} corresponding to the pointer
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PointerInfo.java
    PointerInfo(final GraphicsDevice device, final Point location) {

    /**
     * Package-private constructor to prevent instantiation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PointerInfo.java
public class PointerInfo {

/**
 * A class that describes the pointer position.
 * It provides the {@code GraphicsDevice} where the pointer is and
 * the {@code Point} that represents the coordinates of the pointer.
 * <p>
 * Instances of this class should be obtained via
 * {@link MouseInfo#getPointerInfo}.
 * The {@code PointerInfo} instance is not updated dynamically as the mouse
 * moves. To get the updated location, you must call
 * {@link MouseInfo#getPointerInfo} again.
 *
 * @see MouseInfo#getPointerInfo
 * @author Roman Poborchiy
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PointerInfo.java
    public Point getLocation() {

    /**
     * Returns the {@code Point} that represents the coordinates of the pointer
     * on the screen. See {@link MouseInfo#getPointerInfo} for more information
     * about coordinate calculation for multiscreen systems.
     *
     * @return coordinates of mouse pointer
     * @see MouseInfo
     * @see MouseInfo#getPointerInfo
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PointerInfo.java
    public GraphicsDevice getDevice() {

    /**
     * Returns the {@code GraphicsDevice} where the mouse pointer was at the
     * moment this {@code PointerInfo} was created.
     *
     * @return {@code GraphicsDevice} corresponding to the pointer
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PointerInfo.java
    PointerInfo(final GraphicsDevice device, final Point location) {

    /**
     * Package-private constructor to prevent instantiation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PointerInfo.java
public class PointerInfo {

/**
 * A class that describes the pointer position.
 * It provides the {@code GraphicsDevice} where the pointer is and
 * the {@code Point} that represents the coordinates of the pointer.
 * <p>
 * Instances of this class should be obtained via
 * {@link MouseInfo#getPointerInfo}.
 * The {@code PointerInfo} instance is not updated dynamically as the mouse
 * moves. To get the updated location, you must call
 * {@link MouseInfo#getPointerInfo} again.
 *
 * @see MouseInfo#getPointerInfo
 * @author Roman Poborchiy
 * @since 1.5
 */
