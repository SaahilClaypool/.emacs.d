_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    private static class TextAndMnemonicHashMap extends HashMap<String, Object> {

    /**
     * <code>TextAndMnemonicHashMap</code> stores swing resource strings. Many of strings
     * can have a mnemonic. For example:
     *   FileChooser.saveButton.textAndMnemonic=&Save
     * For this case method get returns "Save" for the key "FileChooser.saveButtonText" and
     * mnemonic "S" for the key "FileChooser.saveButtonMnemonic"
     *
     * There are several patterns for the text and mnemonic suffixes which are checked by the
     * <code>TextAndMnemonicHashMap</code> class.
     * Patterns which are converted to the xxx.textAndMnemonic key:
     * (xxxNameText, xxxNameMnemonic)
     * (xxxNameText, xxxMnemonic)
     * (xxx.nameText, xxx.mnemonic)
     * (xxxText, xxxMnemonic)
     *
     * These patterns can have a mnemonic index in format
     * (xxxDisplayedMnemonicIndex)
     *
     * Pattern which is converted to the xxx.titleAndMnemonic key:
     * (xxxTitle, xxxMnemonic)
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
        public Object createValue(UIDefaults table) {

        /**
         * Creates an <code>InputMap</code> with the bindings that are
         * passed in.
         *
         * @param table a <code>UIDefaults</code> table
         * @return the <code>InputMap</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public static class LazyInputMap implements LazyValue {

    /**
     * <code>LazyInputMap</code> will create a <code>InputMap</code>
     * in its <code>createValue</code>
     * method. The bindings are passed in in the constructor.
     * The bindings are an array with
     * the even number entries being string <code>KeyStrokes</code>
     * (eg "alt SPACE") and
     * the odd number entries being the value to use in the
     * <code>InputMap</code> (and the key in the <code>ActionMap</code>).
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
        public Object createValue(final UIDefaults table) {

        /**
         * Creates the value retrieved from the <code>UIDefaults</code> table.
         * The object is created each time it is accessed.
         *
         * @param table  a <code>UIDefaults</code> table
         * @return the created <code>Object</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
        public ProxyLazyValue(String c, String m, Object[] o) {

        /**
         * Creates a <code>LazyValue</code> which will construct an instance
         * when asked.
         *
         * @param c    a <code>String</code> specifying the classname
         *              of the class
         *              containing a static method to be called for
         *              instance creation.
         * @param m    a <code>String</code> specifying the static method
         *              to be called on class c
         * @param o    an array of <code>Objects</code> to be passed as
         *              paramaters to the static method in class c
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
        public ProxyLazyValue(String c, Object[] o) {

        /**
         * Creates a <code>LazyValue</code> which will construct an instance
         * when asked.
         *
         * @param c    a <code>String</code> specifying the classname
         *              of the instance to be created on demand
         * @param o    an array of <code>Objects</code> to be passed as
         *              paramaters to the constructor in class c
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
        public ProxyLazyValue(String c, String m) {

        /**
         * Creates a <code>LazyValue</code> which will construct an instance
         * when asked.
         *
         * @param c    a <code>String</code> specifying the classname of
         *              the class
         *              containing a static method to be called for
         *              instance creation
         * @param m    a <code>String</code> specifying the static
         *              method to be called on class c
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
        public ProxyLazyValue(String c) {

        /**
         * Creates a <code>LazyValue</code> which will construct an instance
         * when asked.
         *
         * @param c    a <code>String</code> specifying the classname
         *             of the instance to be created on demand
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public static class ProxyLazyValue implements LazyValue {

    /**
     * This class provides an implementation of <code>LazyValue</code>
     * which can be
     * used to delay loading of the Class for the instance to be created.
     * It also avoids creation of an anonymous inner class for the
     * <code>LazyValue</code>
     * subclass.  Both of these improve performance at the time that a
     * a Look and Feel is loaded, at the cost of a slight performance
     * reduction the first time <code>createValue</code> is called
     * (since Reflection APIs are used).
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public interface ActiveValue {

    /**
     * This class enables one to store an entry in the defaults
     * table that's constructed each time it's looked up with one of
     * the <code>getXXX(key)</code> methods. Here's an example of
     * an <code>ActiveValue</code> that constructs a
     * <code>DefaultListCellRenderer</code>:
     * <pre>
     *  Object cellRendererActiveValue = new UIDefaults.ActiveValue() {
     *      public Object createValue(UIDefaults table) {
     *          return new DefaultListCellRenderer();
     *      }
     *  };
     *
     *  uiDefaultsTable.put("MyRenderer", cellRendererActiveValue);
     * </pre>
     *
     * @see UIDefaults#get
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public interface LazyValue {

    /**
     * This class enables one to store an entry in the defaults
     * table that isn't constructed until the first time it's
     * looked up with one of the <code>getXXX(key)</code> methods.
     * Lazy values are useful for defaults that are expensive
     * to construct or are seldom retrieved.  The first time
     * a <code>LazyValue</code> is retrieved its "real value" is computed
     * by calling <code>LazyValue.createValue()</code> and the real
     * value is used to replace the <code>LazyValue</code> in the
     * <code>UIDefaults</code>
     * table.  Subsequent lookups for the same key return
     * the real value.  Here's an example of a <code>LazyValue</code>
     * that constructs a <code>Border</code>:
     * <pre>
     *  Object borderLazyValue = new UIDefaults.LazyValue() {
     *      public Object createValue(UIDefaults table) {
     *          return new BorderFactory.createLoweredBevelBorder();
     *      }
     *  };
     *
     *  uiDefaultsTable.put("MyBorder", borderLazyValue);
     * </pre>
     *
     * @see UIDefaults#get
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public Locale getDefaultLocale() {

    /**
     * Returns the default locale.  The default locale is used in retrieving
     * localized values via <code>get</code> methods that do not take a
     * locale argument.  As of release 1.4, Swing UI objects should retrieve
     * localized values using the locale of their component rather than the
     * default locale.  The default locale exists to provide compatibility with
     * pre 1.4 behaviour.
     *
     * @return the default locale
     * @see #setDefaultLocale
     * @see #get(Object)
     * @see #get(Object,Locale)
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public void setDefaultLocale( Locale l ) {

    /**
     * Sets the default locale.  The default locale is used in retrieving
     * localized values via <code>get</code> methods that do not take a
     * locale argument.  As of release 1.4, Swing UI objects should retrieve
     * localized values using the locale of their component rather than the
     * default locale.  The default locale exists to provide compatibility with
     * pre 1.4 behaviour.
     *
     * @param l the new default locale
     * @see #getDefaultLocale
     * @see #get(Object)
     * @see #get(Object,Locale)
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public synchronized void removeResourceBundle( String bundleName ) {

    /**
     * Removes a resource bundle from the list of resource bundles that are
     * searched for localized defaults.
     *
     * @param bundleName  the base name of the resource bundle to be removed
     * @see java.util.ResourceBundle
     * @see #addResourceBundle
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public synchronized void addResourceBundle( String bundleName ) {

    /**
     * Adds a resource bundle to the list of resource bundles that are
     * searched for localized values.  Resource bundles are searched in the
     * reverse order they were added.  In other words, the most recently added
     * bundle is searched first.
     *
     * @param bundleName  the base name of the resource bundle to be added
     * @see java.util.ResourceBundle
     * @see #removeResourceBundle
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {

    /**
     * Support for reporting bound property changes.  If oldValue and
     * newValue are not equal and the <code>PropertyChangeEvent</code>x
     * listener list isn't empty, then fire a
     * <code>PropertyChange</code> event to each listener.
     *
     * @param propertyName  the programmatic name of the property
     *          that was changed
     * @param oldValue  the old value of the property
     * @param newValue  the new value of the property
     * @see java.beans.PropertyChangeSupport
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public synchronized PropertyChangeListener[] getPropertyChangeListeners() {

    /**
     * Returns an array of all the <code>PropertyChangeListener</code>s added
     * to this UIDefaults with addPropertyChangeListener().
     *
     * @return all of the <code>PropertyChangeListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public synchronized void removePropertyChangeListener(PropertyChangeListener listener) {

    /**
     * Removes a <code>PropertyChangeListener</code> from the listener list.
     * This removes a <code>PropertyChangeListener</code> that was registered
     * for all properties.
     *
     * @param listener  the <code>PropertyChangeListener</code> to be removed
     * @see java.beans.PropertyChangeSupport
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public synchronized void addPropertyChangeListener(PropertyChangeListener listener) {

    /**
     * Adds a <code>PropertyChangeListener</code> to the listener list.
     * The listener is registered for all properties.
     * <p>
     * A <code>PropertyChangeEvent</code> will get fired whenever a default
     * is changed.
     *
     * @param listener  the <code>PropertyChangeListener</code> to be added
     * @see java.beans.PropertyChangeSupport
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public ComponentUI getUI(JComponent target) {

    /**
     * Creates an <code>ComponentUI</code> implementation for the
     * specified component.  In other words create the look
     * and feel specific delegate object for <code>target</code>.
     * This is done in two steps:
     * <ul>
     * <li> Look up the name of the <code>ComponentUI</code> implementation
     * class under the value returned by <code>target.getUIClassID()</code>.
     * <li> Use the implementation classes static <code>createUI()</code>
     * method to construct a look and feel delegate.
     * </ul>
     * @param target  the <code>JComponent</code> which needs a UI
     * @return the <code>ComponentUI</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    protected void getUIError(String msg) {

    /**
     * If <code>getUI()</code> fails for any reason,
     * it calls this method before returning <code>null</code>.
     * Subclasses may choose to do more or less here.
     *
     * @param msg message string to print
     * @see #getUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public Class<? extends ComponentUI> getUIClass(String uiClassID) {

    /**
     * Returns the L&amp;F class that renders this component.
     *
     * @param uiClassID a string containing the class ID
     * @return the Class object returned by
     *          <code>getUIClass(uiClassID, null)</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public Class<? extends ComponentUI>

    /**
     * The value of <code>get(uidClassID)</code> must be the
     * <code>String</code> name of a
     * class that implements the corresponding <code>ComponentUI</code>
     * class.  If the class hasn't been loaded before, this method looks
     * up the class with <code>uiClassLoader.loadClass()</code> if a non
     * <code>null</code>
     * class loader is provided, <code>classForName()</code> otherwise.
     * <p>
     * If a mapping for <code>uiClassID</code> exists or if the specified
     * class can't be found, return <code>null</code>.
     * <p>
     * This method is used by <code>getUI</code>, it's usually
     * not necessary to call it directly.
     *
     * @param uiClassID  a string containing the class ID
     * @param uiClassLoader the object which will load the class
     * @return the value of <code>Class.forName(get(uidClassID))</code>
     * @see #getUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public Dimension getDimension(Object key, Locale l) {

    /**
     * If the value of <code>key</code> for the given <code>Locale</code>
     * is a <code>Dimension</code> return it, otherwise return <code>null</code>.
     * @param key the desired key
     * @param l the desired locale
     * @return if the value for <code>key</code> and <code>Locale</code>
     *          is a <code>Dimension</code>,
     *          return the <code>Dimension</code> object; otherwise return
     *          <code>null</code>
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public Dimension getDimension(Object key) {

    /**
     * If the value of <code>key</code> is a <code>Dimension</code> return it,
     * otherwise return <code>null</code>.
     * @param key the desired key
     * @return if the value for <code>key</code> is a <code>Dimension</code>,
     *          return the <code>Dimension</code> object; otherwise return
     *          <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public Insets getInsets(Object key, Locale l) {

    /**
     * If the value of <code>key</code> for the given <code>Locale</code>
     * is an <code>Insets</code> return it, otherwise return <code>null</code>.
     * @param key the desired key
     * @param l the desired locale
     * @return if the value for <code>key</code> and <code>Locale</code>
     *          is an <code>Insets</code>,
     *          return the <code>Insets</code> object; otherwise return
     *          <code>null</code>
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public Insets getInsets(Object key) {

    /**
     * If the value of <code>key</code> is an <code>Insets</code> return it,
     * otherwise return <code>null</code>.
     * @param key the desired key
     * @return if the value for <code>key</code> is an <code>Insets</code>,
     *          return the <code>Insets</code> object; otherwise return
     *          <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public boolean getBoolean(Object key, Locale l) {

    /**
     * If the value of <code>key</code> for the given <code>Locale</code>
     * is boolean, return the boolean value, otherwise return false.
     *
     * @param key an <code>Object</code> specifying the key for the desired boolean value
     * @param l the desired locale
     * @return if the value for <code>key</code> and <code>Locale</code>
     *         is boolean, return the
     *         boolean value, otherwise return false.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public boolean getBoolean(Object key) {

    /**
     * If the value of <code>key</code> is boolean, return the
     * boolean value, otherwise return false.
     *
     * @param key an <code>Object</code> specifying the key for the desired boolean value
     * @return if the value of <code>key</code> is boolean, return the
     *         boolean value, otherwise return false.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public int getInt(Object key, Locale l) {

    /**
     * If the value of <code>key</code> for the given <code>Locale</code>
     * is an <code>Integer</code> return its integer value, otherwise return 0.
     * @param key the desired key
     * @param l the desired locale
     * @return if the value for <code>key</code> and <code>Locale</code>
     *          is an <code>Integer</code>,
     *          return its value, otherwise return 0
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public int getInt(Object key) {

    /**
     * If the value of <code>key</code> is an <code>Integer</code> return its
     * integer value, otherwise return 0.
     * @param key the desired key
     * @return if the value for <code>key</code> is an <code>Integer</code>,
     *          return its value, otherwise return 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public String getString(Object key, Locale l) {

    /**
     * If the value of <code>key</code> for the given <code>Locale</code>
     * is a <code>String</code> return it, otherwise return <code>null</code>.
     * @param key the desired key
     * @param l the desired <code>Locale</code>
     * @return if the value for <code>key</code> for the given
     *          <code>Locale</code> is a <code>String</code>,
     *          return the <code>String</code> object; otherwise return
     *          <code>null</code>
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public String getString(Object key) {

    /**
     * If the value of <code>key</code> is a <code>String</code> return it,
     * otherwise return <code>null</code>.
     * @param key the desired key
     * @return if the value for <code>key</code> is a <code>String</code>,
     *          return the <code>String</code> object; otherwise return
     *          <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public Border getBorder(Object key, Locale l)  {

    /**
     * If the value of <code>key</code> for the given <code>Locale</code>
     * is a <code>Border</code> return it, otherwise return <code>null</code>.
     * @param key the desired key
     * @param l the desired locale
     * @return if the value for <code>key</code> and <code>Locale</code>
     *          is a <code>Border</code>,
     *          return the <code>Border</code> object; otherwise return
     *          <code>null</code>
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public Border getBorder(Object key) {

    /**
     * If the value of <code>key</code> is a <code>Border</code> return it,
     * otherwise return <code>null</code>.
     * @param key the desired key
     * @return if the value for <code>key</code> is a <code>Border</code>,
     *          return the <code>Border</code> object; otherwise return
     *          <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public Icon getIcon(Object key, Locale l) {

    /**
     * If the value of <code>key</code> for the given <code>Locale</code>
     * is an <code>Icon</code> return it, otherwise return <code>null</code>.
     * @param key the desired key
     * @param l the desired locale
     * @return if the value for <code>key</code> and <code>Locale</code>
     *          is an <code>Icon</code>,
     *          return the <code>Icon</code> object; otherwise return
     *          <code>null</code>
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public Icon getIcon(Object key) {

    /**
     * If the value of <code>key</code> is an <code>Icon</code> return it,
     * otherwise return <code>null</code>.
     * @param key the desired key
     * @return if the value for <code>key</code> is an <code>Icon</code>,
     *          return the <code>Icon</code> object; otherwise return
     *          <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public Color getColor(Object key, Locale l) {

    /**
     * If the value of <code>key</code> for the given <code>Locale</code>
     * is a <code>Color</code> return it, otherwise return <code>null</code>.
     * @param key the desired key
     * @param l the desired locale
     * @return if the value for <code>key</code> and <code>Locale</code>
     *          is a <code>Color</code>,
     *          return the <code>Color</code> object; otherwise return
     *          <code>null</code>
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public Color getColor(Object key) {

    /**
     * If the value of <code>key</code> is a <code>Color</code> return it,
     * otherwise return <code>null</code>.
     * @param key the desired key
     * @return if the value for <code>key</code> is a <code>Color</code>,
     *          return the <code>Color</code> object; otherwise return
     *          <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public Font getFont(Object key, Locale l) {

    /**
     * If the value of <code>key</code> for the given <code>Locale</code>
     * is a <code>Font</code> return it, otherwise return <code>null</code>.
     * @param key the desired key
     * @param l the desired locale
     * @return if the value for <code>key</code> and <code>Locale</code>
     *          is a <code>Font</code>,
     *          return the <code>Font</code> object; otherwise return
     *          <code>null</code>
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public Font getFont(Object key) {

    /**
     * If the value of <code>key</code> is a <code>Font</code> return it,
     * otherwise return <code>null</code>.
     * @param key the desired key
     * @return if the value for <code>key</code> is a <code>Font</code>,
     *          return the <code>Font</code> object; otherwise return
     *          <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public void putDefaults(Object[] keyValueList) {

    /**
     * Puts all of the key/value pairs in the database and
     * unconditionally generates one <code>PropertyChangeEvent</code>.
     * The events oldValue and newValue will be <code>null</code> and its
     * <code>propertyName</code> will be "UIDefaults".  The key/value pairs are
     * added for all locales.
     *
     * @param keyValueList  an array of key/value pairs
     * @see #put
     * @see java.util.Hashtable#put
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public Object put(Object key, Object value) {

    /**
     * Sets the value of <code>key</code> to <code>value</code> for all locales.
     * If <code>key</code> is a string and the new value isn't
     * equal to the old one, fire a <code>PropertyChangeEvent</code>.
     * If value is <code>null</code>, the key is removed from the table.
     *
     * @param key    the unique <code>Object</code> who's value will be used
     *          to retrieve the data value associated with it
     * @param value  the new <code>Object</code> to store as data under
     *          that key
     * @return the previous <code>Object</code> value, or <code>null</code>
     * @see #putDefaults
     * @see java.util.Hashtable#put
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    private Map<String, Object> getResourceCache(Locale l) {

    /**
     * Returns a Map of the known resources for the given locale.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    private Object getFromResourceBundle(Object key, Locale l) {

    /**
     * Looks up given key in our resource bundles.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public Object get(Object key, Locale l) {

    /**
     * Returns the value for key associated with the given locale.
     * If the value is a <code>UIDefaults.LazyValue</code> then the real
     * value is computed with <code>LazyValue.createValue()</code>,
     * the table entry is replaced, and the real value is returned.
     * If the value is an <code>UIDefaults.ActiveValue</code>
     * the table entry is not replaced - the value is computed
     * with <code>ActiveValue.createValue()</code> for each
     * <code>get()</code> call.
     *
     * If the key is not found in the table then it is searched for in the list
     * of resource bundles maintained by this object.  The resource bundles are
     * searched most recently added first using the given locale.
     * <code>LazyValues</code> and <code>ActiveValues</code> are not supported
     * in the resource bundles.
     *
     * @param key the desired key
     * @param l the desired <code>locale</code>
     * @return the value for <code>key</code>
     * @see LazyValue
     * @see ActiveValue
     * @see java.util.Hashtable#get
     * @see #addResourceBundle
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    private Object getFromHashtable(final Object key) {

    /**
     * Looks up up the given key in our Hashtable and resolves LazyValues
     * or ActiveValues.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public Object get(Object key) {

    /**
     * Returns the value for key.  If the value is a
     * <code>UIDefaults.LazyValue</code> then the real
     * value is computed with <code>LazyValue.createValue()</code>,
     * the table entry is replaced, and the real value is returned.
     * If the value is an <code>UIDefaults.ActiveValue</code>
     * the table entry is not replaced - the value is computed
     * with <code>ActiveValue.createValue()</code> for each
     * <code>get()</code> call.
     *
     * If the key is not found in the table then it is searched for in the list
     * of resource bundles maintained by this object.  The resource bundles are
     * searched most recently added first using the locale returned by
     * <code>getDefaultLocale</code>.  <code>LazyValues</code> and
     * <code>ActiveValues</code> are not supported in the resource bundles.

     *
     * @param key the desired key
     * @return the value for <code>key</code>
     * @see LazyValue
     * @see ActiveValue
     * @see java.util.Hashtable#get
     * @see #getDefaultLocale
     * @see #addResourceBundle
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public UIDefaults(Object[] keyValueList) {

    /**
     * Creates a defaults table initialized with the specified
     * key/value pairs.  For example:
     * <pre>
        Object[] uiDefaults = {
             "Font", new Font("Dialog", Font.BOLD, 12),
            "Color", Color.red,
             "five", new Integer(5)
        }
        UIDefaults myDefaults = new UIDefaults(uiDefaults);
     * </pre>
     * @param keyValueList  an array of objects containing the key/value
     *          pairs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public UIDefaults(int initialCapacity, float loadFactor) {

    /**
     * Creates an empty defaults table with the specified initial capacity and
     * load factor.
     *
     * @param initialCapacity   the initial capacity of the defaults table
     * @param loadFactor        the load factor of the defaults table
     * @see java.util.Hashtable
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    public UIDefaults() {

    /**
     * Creates an empty defaults table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
    private Map<Locale, Map<String, Object>> resourceCache;

    /**
     * Maps from a Locale to a cached Map of the ResourceBundle. This is done
     * so as to avoid an exception being thrown when a value is asked for.
     * Access to this should be done while holding a lock on the
     * UIDefaults, eg synchronized(this).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/UIDefaults.java
public class UIDefaults extends Hashtable<Object,Object>

/**
 * A table of defaults for Swing components.  Applications can set/get
 * default values via the <code>UIManager</code>.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @see UIManager
 * @author Hans Muller
 */
