_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Customizer.java
    void removePropertyChangeListener(PropertyChangeListener listener);

    /**
     * Remove a listener for the PropertyChange event.
     *
     * @param listener  The PropertyChange listener to be removed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Customizer.java
     void addPropertyChangeListener(PropertyChangeListener listener);

    /**
     * Register a listener for the PropertyChange event.  The customizer
     * should fire a PropertyChange event whenever it changes the target
     * bean in a way that might require the displayed properties to be
     * refreshed.
     *
     * @param listener  An object to be invoked when a PropertyChange
     *          event is fired.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Customizer.java
    void setObject(Object bean);

    /**
     * Set the object to be customized.  This method should be called only
     * once, before the Customizer has been added to any parent AWT container.
     * @param bean  The object to be customized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Customizer.java
public interface Customizer {

/**
 * A customizer class provides a complete custom GUI for customizing
 * a target Java Bean.
 * <P>
 * Each customizer should inherit from the java.awt.Component class so
 * it can be instantiated inside an AWT dialog or panel.
 * <P>
 * Each customizer should have a null constructor.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Customizer.java
    void removePropertyChangeListener(PropertyChangeListener listener);

    /**
     * Remove a listener for the PropertyChange event.
     *
     * @param listener  The PropertyChange listener to be removed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Customizer.java
     void addPropertyChangeListener(PropertyChangeListener listener);

    /**
     * Register a listener for the PropertyChange event.  The customizer
     * should fire a PropertyChange event whenever it changes the target
     * bean in a way that might require the displayed properties to be
     * refreshed.
     *
     * @param listener  An object to be invoked when a PropertyChange
     *          event is fired.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Customizer.java
    void setObject(Object bean);

    /**
     * Set the object to be customized.  This method should be called only
     * once, before the Customizer has been added to any parent AWT container.
     * @param bean  The object to be customized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Customizer.java
public interface Customizer {

/**
 * A customizer class provides a complete custom GUI for customizing
 * a target Java Bean.
 * <P>
 * Each customizer should inherit from the java.awt.Component class so
 * it can be instantiated inside an AWT dialog or panel.
 * <P>
 * Each customizer should have a null constructor.
 */
