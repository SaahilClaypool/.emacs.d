_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    void removeAdjustmentListener(AdjustmentListener l);

    /**
     * Removes an adjustment listener.
     * @param l the listener being removed
     * @see AdjustmentEvent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    void addAdjustmentListener(AdjustmentListener l);

    /**
     * Adds a listener to receive adjustment events when the value of
     * the adjustable object changes.
     * @param l the listener to receive events
     * @see AdjustmentEvent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    int getValue();

    /**
     * Gets the current value of the adjustable object.
     * @return the current value of the adjustable object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    void setValue(int v);

    /**
     * Sets the current value of the adjustable object. If
     * the value supplied is less than <code>minimum</code>
     * or greater than <code>maximum</code> - <code>visibleAmount</code>,
     * then one of those values is substituted, as appropriate.
     * <p>
     * Calling this method does not fire an
     * <code>AdjustmentEvent</code>.
     *
     * @param v the current value, between <code>minimum</code>
     *    and <code>maximum</code> - <code>visibleAmount</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    int getVisibleAmount();

    /**
     * Gets the length of the proportional indicator.
     * @return the length of the proportional indicator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    void setVisibleAmount(int v);

    /**
     * Sets the length of the proportional indicator of the
     * adjustable object.
     * @param v the length of the indicator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    int getBlockIncrement();

    /**
     * Gets the block value increment for the adjustable object.
     * @return the block value increment for the adjustable object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    void setBlockIncrement(int b);

    /**
     * Sets the block value increment for the adjustable object.
     * @param b the block increment
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    int getUnitIncrement();

    /**
     * Gets the unit value increment for the adjustable object.
     * @return the unit value increment for the adjustable object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    void setUnitIncrement(int u);

    /**
     * Sets the unit value increment for the adjustable object.
     * @param u the unit increment
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    int getMaximum();

    /**
     * Gets the maximum value of the adjustable object.
     * @return the maximum value of the adjustable object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    void setMaximum(int max);

    /**
     * Sets the maximum value of the adjustable object.
     * @param max the maximum value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    int getMinimum();

    /**
     * Gets the minimum value of the adjustable object.
     * @return the minimum value of the adjustable object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    void setMinimum(int min);

    /**
     * Sets the minimum value of the adjustable object.
     * @param min the minimum value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    int getOrientation();

    /**
     * Gets the orientation of the adjustable object.
     * @return the orientation of the adjustable object;
     *   either <code>HORIZONTAL</code>, <code>VERTICAL</code>,
     *   or <code>NO_ORIENTATION</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    @Native public static final int NO_ORIENTATION = 2;

    /**
     * Indicates that the <code>Adjustable</code> has no orientation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    @Native public static final int VERTICAL = 1;

    /**
     * Indicates that the <code>Adjustable</code> has vertical orientation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    @Native public static final int HORIZONTAL = 0;

    /**
     * Indicates that the <code>Adjustable</code> has horizontal orientation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
public interface Adjustable {

/**
 * The interface for objects which have an adjustable numeric value
 * contained within a bounded range of values.
 *
 * @author Amy Fowler
 * @author Tim Prinzing
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    void removeAdjustmentListener(AdjustmentListener l);

    /**
     * Removes an adjustment listener.
     * @param l the listener being removed
     * @see AdjustmentEvent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    void addAdjustmentListener(AdjustmentListener l);

    /**
     * Adds a listener to receive adjustment events when the value of
     * the adjustable object changes.
     * @param l the listener to receive events
     * @see AdjustmentEvent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    int getValue();

    /**
     * Gets the current value of the adjustable object.
     * @return the current value of the adjustable object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    void setValue(int v);

    /**
     * Sets the current value of the adjustable object. If
     * the value supplied is less than <code>minimum</code>
     * or greater than <code>maximum</code> - <code>visibleAmount</code>,
     * then one of those values is substituted, as appropriate.
     * <p>
     * Calling this method does not fire an
     * <code>AdjustmentEvent</code>.
     *
     * @param v the current value, between <code>minimum</code>
     *    and <code>maximum</code> - <code>visibleAmount</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    int getVisibleAmount();

    /**
     * Gets the length of the proportional indicator.
     * @return the length of the proportional indicator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    void setVisibleAmount(int v);

    /**
     * Sets the length of the proportional indicator of the
     * adjustable object.
     * @param v the length of the indicator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    int getBlockIncrement();

    /**
     * Gets the block value increment for the adjustable object.
     * @return the block value increment for the adjustable object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    void setBlockIncrement(int b);

    /**
     * Sets the block value increment for the adjustable object.
     * @param b the block increment
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    int getUnitIncrement();

    /**
     * Gets the unit value increment for the adjustable object.
     * @return the unit value increment for the adjustable object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    void setUnitIncrement(int u);

    /**
     * Sets the unit value increment for the adjustable object.
     * @param u the unit increment
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    int getMaximum();

    /**
     * Gets the maximum value of the adjustable object.
     * @return the maximum value of the adjustable object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    void setMaximum(int max);

    /**
     * Sets the maximum value of the adjustable object.
     * @param max the maximum value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    int getMinimum();

    /**
     * Gets the minimum value of the adjustable object.
     * @return the minimum value of the adjustable object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    void setMinimum(int min);

    /**
     * Sets the minimum value of the adjustable object.
     * @param min the minimum value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    int getOrientation();

    /**
     * Gets the orientation of the adjustable object.
     * @return the orientation of the adjustable object;
     *   either <code>HORIZONTAL</code>, <code>VERTICAL</code>,
     *   or <code>NO_ORIENTATION</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    @Native public static final int NO_ORIENTATION = 2;

    /**
     * Indicates that the <code>Adjustable</code> has no orientation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    @Native public static final int VERTICAL = 1;

    /**
     * Indicates that the <code>Adjustable</code> has vertical orientation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
    @Native public static final int HORIZONTAL = 0;

    /**
     * Indicates that the <code>Adjustable</code> has horizontal orientation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Adjustable.java
public interface Adjustable {

/**
 * The interface for objects which have an adjustable numeric value
 * contained within a bounded range of values.
 *
 * @author Amy Fowler
 * @author Tim Prinzing
 */
