_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleExtendedComponent.java
    public AccessibleKeyBinding getAccessibleKeyBinding();

    /**
     * Returns key bindings associated with this object
     *
     * @return the key bindings, if supported, of the object;
     * otherwise, null
     * @see AccessibleKeyBinding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleExtendedComponent.java
    public String getTitledBorderText();

    /**
     * Returns the titled border text
     *
     * @return the titled border text, if supported, of the object;
     * otherwise, null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleExtendedComponent.java
    public String getToolTipText();

    /**
     * Returns the tool tip text
     *
     * @return the tool tip text, if supported, of the object;
     * otherwise, null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleExtendedComponent.java
public interface AccessibleExtendedComponent extends AccessibleComponent {

/**
 * The AccessibleExtendedComponent interface should be supported by any object
 * that is rendered on the screen.  This interface provides the standard
 * mechanism for an assistive technology to determine the extended
 * graphical representation of an object.  Applications can determine
 * if an object supports the AccessibleExtendedComponent interface by first
 * obtaining its AccessibleContext
 * and then calling the
 * {@link AccessibleContext#getAccessibleComponent} method.
 * If the return value is not null and the type of the return value is
 * AccessibleExtendedComponent, the object supports this interface.
 *
 * @see Accessible
 * @see Accessible#getAccessibleContext
 * @see AccessibleContext
 * @see AccessibleContext#getAccessibleComponent
 *
 * @author      Lynn Monsanto
 * @since 1.4
 */
