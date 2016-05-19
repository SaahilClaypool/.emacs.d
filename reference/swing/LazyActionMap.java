_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/LazyActionMap.java
    static ActionMap getActionMap(Class loaderClass,
                                  String defaultsKey) {

    /**
     * Returns an ActionMap that will be populated by invoking the
     * <code>loadActionMap</code> method on the specified Class
     * when necessary.
     * <p>
     * This should be used if the ActionMap can be shared.
     *
     * @param c JComponent to install the ActionMap on.
     * @param loaderClass Class object that gets loadActionMap invoked
     *                    on.
     * @param defaultsKey Key to use to defaults table to check for
     *        existing map and what resulting Map will be registered on.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/LazyActionMap.java
    static void installLazyActionMap(JComponent c, Class loaderClass,
                                     String defaultsKey) {

    /**
     * Installs an ActionMap that will be populated by invoking the
     * <code>loadActionMap</code> method on the specified Class
     * when necessary.
     * <p>
     * This should be used if the ActionMap can be shared.
     *
     * @param c JComponent to install the ActionMap on.
     * @param loaderClass Class object that gets loadActionMap invoked
     *                    on.
     * @param defaultsKey Key to use to defaults table to check for
     *        existing map and what resulting Map will be registered on.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/LazyActionMap.java
    private transient Object _loader;

    /**
     * Object to invoke <code>loadActionMap</code> on. This may be
     * a Class object.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/LazyActionMap.java
class LazyActionMap extends ActionMapUIResource {

/**
 * An ActionMap that populates its contents as necessary. The
 * contents are populated by invoking the <code>loadActionMap</code>
 * method on the passed in Object.
 *
 * @author Scott Violet
 */
