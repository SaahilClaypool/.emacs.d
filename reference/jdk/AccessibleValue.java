_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleValue.java
    public Number getMaximumAccessibleValue();

    /**
     * Get the maximum value of this object as a Number.
     *
     * @return Maximum value of the object; null if this object does not
     * have a maximum value
     * @see #getMinimumAccessibleValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleValue.java
    public Number getMinimumAccessibleValue();

    /**
     * Get the minimum value of this object as a Number.
     *
     * @return Minimum value of the object; null if this object does not
     * have a minimum value
     * @see #getMaximumAccessibleValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleValue.java
//    public String getAccessibleValueDescription();

//    /**
//     * Get the description of the value of this object.
//     *
//     * @return description of the value of the object
//     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleValue.java
    public boolean setCurrentAccessibleValue(Number n);

    /**
     * Set the value of this object as a Number.
     *
     * @param n the number to use for the value
     * @return True if the value was set; else False
     * @see #getCurrentAccessibleValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleValue.java
    public Number getCurrentAccessibleValue();

    /**
     * Get the value of this object as a Number.  If the value has not been
     * set, the return value will be null.
     *
     * @return value of the object
     * @see #setCurrentAccessibleValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleValue.java
public interface AccessibleValue {

/**
 * The AccessibleValue interface should be supported by any object
 * that supports a numerical value (e.g., a scroll bar).  This interface
 * provides the standard mechanism for an assistive technology to determine
 * and set the numerical value as well as get the minimum and maximum values.
 * Applications can determine
 * if an object supports the AccessibleValue interface by first
 * obtaining its AccessibleContext (see
 * {@link Accessible}) and then calling the
 * {@link AccessibleContext#getAccessibleValue} method.
 * If the return value is not null, the object supports this interface.
 *
 * @see Accessible
 * @see Accessible#getAccessibleContext
 * @see AccessibleContext
 * @see AccessibleContext#getAccessibleValue
 *
 * @author      Peter Korn
 * @author      Hans Muller
 * @author      Willie Walker
 */
