_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    private static class WeakPCL extends WeakReference<DesktopProperty>

    /**
     * As there is typically only one Toolkit, the PropertyChangeListener
     * is handled via a WeakReference so as not to pin down the
     * DesktopProperty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    protected String getKey() {

    /**
     * Returns the key used to lookup the desktop properties value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    protected Object configureValue(Object value) {

    /**
     * Configures the value as appropriate for a defaults property in
     * the UIDefaults table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    protected void updateUI() {

    /**
     * Requests that all components in the GUI hierarchy be updated
     * to reflect dynamic changes in this look&feel.  This update occurs
     * by uninstalling and re-installing the UI objects. Requests are
     * batched and collapsed into a single update pass because often
     * many desktop properties will change at once.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    public void invalidate() {

    /**
     * Invalides the current value so that the next invocation of
     * <code>createValue</code> will ask for the property again.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    public void invalidate(LookAndFeel laf) {

    /**
     * Invalidates the current value.
     *
     * @param laf the LookAndFeel this DesktopProperty was created with
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    protected Object getDefaultValue() {

    /**
     * Returns the value to use if the desktop property is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    protected Object getValueFromDesktop() {

    /**
     * Returns the value from the desktop.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    public Object createValue(UIDefaults table) {

    /**
     * UIManager.LazyValue method, returns the value from the desktop
     * or the fallback value if the desktop value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    public DesktopProperty(String key, Object fallback) {

    /**
     * Creates a DesktopProperty.
     *
     * @param key Key used in looking up desktop value.
     * @param fallback Value used if desktop property is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    private static void updateWindowUI(Window window) {

    /**
     * Updates the UI of the passed in window and all its children.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    private static void updateAllUIs() {

    /**
     * Updates the UIs of all the known Frames.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    private static synchronized boolean isUpdatePending() {

    /**
     * Returns true if a UI update is pending.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    private static synchronized void setUpdatePending(boolean update) {

    /**
     * Sets whether or not an updateUI call is pending.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    static void flushUnreferencedProperties() {

    /**
     * Cleans up any lingering state held by unrefeernced
     * DesktopProperties.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    private Object value;

    /**
     * Value to return.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    private WeakPCL pcl;

    /**
     * PropertyChangeListener attached to the Toolkit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    private static final ReferenceQueue<DesktopProperty> queue = new ReferenceQueue<DesktopProperty>();

    /**
     * ReferenceQueue of unreferenced WeakPCLs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    private static boolean updatePending;

    /**
     * Indicates if an updateUI call is pending.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
// NOTE: Don't rely on this class staying in this location. It is likely

/**
 * Wrapper for a value from the desktop. The value is lazily looked up, and
 * can be accessed using the <code>UIManager.ActiveValue</code> method
 * <code>createValue</code>. If the underlying desktop property changes this
 * will force the UIs to update all known Frames. You can invoke
 * <code>invalidate</code> to force the value to be fetched again.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    private static class WeakPCL extends WeakReference<DesktopProperty>

    /**
     * As there is typically only one Toolkit, the PropertyChangeListener
     * is handled via a WeakReference so as not to pin down the
     * DesktopProperty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    protected String getKey() {

    /**
     * Returns the key used to lookup the desktop properties value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    protected Object configureValue(Object value) {

    /**
     * Configures the value as appropriate for a defaults property in
     * the UIDefaults table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    protected void updateUI() {

    /**
     * Requests that all components in the GUI hierarchy be updated
     * to reflect dynamic changes in this look&feel.  This update occurs
     * by uninstalling and re-installing the UI objects. Requests are
     * batched and collapsed into a single update pass because often
     * many desktop properties will change at once.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    public void invalidate() {

    /**
     * Invalides the current value so that the next invocation of
     * <code>createValue</code> will ask for the property again.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    public void invalidate(LookAndFeel laf) {

    /**
     * Invalidates the current value.
     *
     * @param laf the LookAndFeel this DesktopProperty was created with
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    protected Object getDefaultValue() {

    /**
     * Returns the value to use if the desktop property is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    protected Object getValueFromDesktop() {

    /**
     * Returns the value from the desktop.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    public Object createValue(UIDefaults table) {

    /**
     * UIManager.LazyValue method, returns the value from the desktop
     * or the fallback value if the desktop value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    public DesktopProperty(String key, Object fallback) {

    /**
     * Creates a DesktopProperty.
     *
     * @param key Key used in looking up desktop value.
     * @param fallback Value used if desktop property is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    private static void updateWindowUI(Window window) {

    /**
     * Updates the UI of the passed in window and all its children.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    private static void updateAllUIs() {

    /**
     * Updates the UIs of all the known Frames.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    private static synchronized boolean isUpdatePending() {

    /**
     * Returns true if a UI update is pending.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    private static synchronized void setUpdatePending(boolean update) {

    /**
     * Sets whether or not an updateUI call is pending.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    static void flushUnreferencedProperties() {

    /**
     * Cleans up any lingering state held by unrefeernced
     * DesktopProperties.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    private Object value;

    /**
     * Value to return.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    private WeakPCL pcl;

    /**
     * PropertyChangeListener attached to the Toolkit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    private static final ReferenceQueue<DesktopProperty> queue = new ReferenceQueue<DesktopProperty>();

    /**
     * ReferenceQueue of unreferenced WeakPCLs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
    private static boolean updatePending;

    /**
     * Indicates if an updateUI call is pending.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/DesktopProperty.java
// NOTE: Don't rely on this class staying in this location. It is likely

/**
 * Wrapper for a value from the desktop. The value is lazily looked up, and
 * can be accessed using the <code>UIManager.ActiveValue</code> method
 * <code>createValue</code>. If the underlying desktop property changes this
 * will force the UIs to update all known Frames. You can invoke
 * <code>invalidate</code> to force the value to be fetched again.
 *
 */
