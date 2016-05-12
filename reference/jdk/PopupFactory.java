_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
        void reset(Component owner, Component contents, int ownerX,
                   int ownerY) {

        /**
         * Resets the <code>Popup</code> to an initial state.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
        private static MediumWeightPopup getRecycledMediumWeightPopup() {

        /**
         * Returns a previously used <code>MediumWeightPopup</code>, or null
         * if none of the popups have been recycled.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
        private static void recycleMediumWeightPopup(MediumWeightPopup popup) {

        /**
         * Recycles the MediumWeightPopup <code>popup</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
        private static List<MediumWeightPopup> getMediumWeightPopupCache() {

        /**
         * Returns the cache to use for medium weight popups.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
        static Popup getMediumWeightPopup(Component owner, Component contents,
                                          int ownerX, int ownerY) {

        /**
         * Returns a medium weight <code>Popup</code> implementation. If
         * the <code>Popup</code> needs more space that in available in
         * <code>owner</code>, this will return null.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
        private JRootPane rootPane;

        /** Child of the panel. The contents are added to this. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
    private static class MediumWeightPopup extends ContainerPopup {

    /**
     * Popup implementation that uses a Panel as the popup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
        void reset(Component owner, Component contents, int ownerX,
                   int ownerY) {

        /**
         * Resets the <code>Popup</code> to an initial state.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
        private static LightWeightPopup getRecycledLightWeightPopup() {

        /**
         * Returns a previously used <code>LightWeightPopup</code>, or null
         * if none of the popups have been recycled.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
        private static void recycleLightWeightPopup(LightWeightPopup popup) {

        /**
         * Recycles the LightWeightPopup <code>popup</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
        private static List<LightWeightPopup> getLightWeightPopupCache() {

        /**
         * Returns the cache to use for heavy weight popups.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
        static Popup getLightWeightPopup(Component owner, Component contents,
                                         int ownerX, int ownerY) {

        /**
         * Returns a light weight <code>Popup</code> implementation. If
         * the <code>Popup</code> needs more space that in available in
         * <code>owner</code>, this will return null.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
    private static class LightWeightPopup extends ContainerPopup {

    /**
     * Popup implementation that uses a JPanel as the popup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
    private static class HeadlessPopup extends ContainerPopup {

    /**
     * Popup implementation that is used in headless environment.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
        boolean fitsOnScreen() {

        /**
         * Returns true if popup can fit the screen and the owner's top parent.
         * It determines can popup be lightweight or mediumweight.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
        int x;

        /** Desired x location. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
    private static class ContainerPopup extends Popup {

    /**
     * ContainerPopup consolidates the common code used in the light/medium
     * weight implementations of <code>Popup</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
        void dispose() {

        /**
         * As we recycle the <code>Window</code>, we don't want to dispose it,
         * thus this method does nothing, instead use <code>_dipose</code>
         * which will handle the disposing.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
        void setCacheEnabled(boolean enable) {

        /**
         * Enables or disables cache for current object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
        private static void recycleHeavyWeightPopup(HeavyWeightPopup popup) {

        /**
         * Recycles the passed in <code>HeavyWeightPopup</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
        private static Map<Window, List<HeavyWeightPopup>> getHeavyWeightPopupCache() {

        /**
         * Returns the cache to use for heavy weight popups. Maps from
         * <code>Window</code> to a <code>List</code> of
         * <code>HeavyWeightPopup</code>s.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
        private static HeavyWeightPopup getRecycledHeavyWeightPopup(Window w) {

        /**
         * Returns a previously disposed heavy weight <code>Popup</code>
         * associated with <code>window</code>. This will return null if
         * there is no <code>HeavyWeightPopup</code> associated with
         * <code>window</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
        static Popup getHeavyWeightPopup(Component owner, Component contents,
                                         int ownerX, int ownerY) {

        /**
         * Returns either a new or recycled <code>Popup</code> containing
         * the specified children.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
    private static class HeavyWeightPopup extends Popup {

    /**
     * Popup implementation that uses a Window as the popup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
    private boolean invokerInHeavyWeightPopup(Component i) {

    /**
     * Returns true if the Component <code>i</code> inside a heavy weight
     * <code>Popup</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
    private Popup getHeavyWeightPopup(Component owner, Component contents,
                                         int ownerX, int ownerY) {

    /**
     * Creates a heavy weight popup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
    private Popup getMediumWeightPopup(Component owner, Component contents,
                                          int ownerX, int ownerY) {

    /**
     * Creates a medium weight popup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
    private Popup getLightWeightPopup(Component owner, Component contents,
                                         int ownerX, int ownerY) {

    /**
     * Creates a light weight popup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
    private Popup getHeadlessPopup(Component owner, Component contents,
                                   int ownerX, int ownerY) {

    /**
     * Creates a headless popup
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
    private Popup getPopup(Component owner, Component contents,
                           int ownerX, int ownerY, int popupType) {

    /**
     * Obtains the appropriate <code>Popup</code> based on
     * <code>popupType</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
    private int getPopupType(Component owner, Component contents,
                             int ownerX, int ownerY) {

    /**
     * Returns the popup type to use for the specified parameters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
    public Popup getPopup(Component owner, Component contents,
                          int x, int y) throws IllegalArgumentException {

    /**
     * Creates a <code>Popup</code> for the Component <code>owner</code>
     * containing the Component <code>contents</code>. <code>owner</code>
     * is used to determine which <code>Window</code> the new
     * <code>Popup</code> will parent the <code>Component</code> the
     * <code>Popup</code> creates to. A null <code>owner</code> implies there
     * is no valid parent. <code>x</code> and
     * <code>y</code> specify the preferred initial location to place
     * the <code>Popup</code> at. Based on screen size, or other paramaters,
     * the <code>Popup</code> may not display at <code>x</code> and
     * <code>y</code>.
     *
     * @param owner    Component mouse coordinates are relative to, may be null
     * @param contents Contents of the Popup
     * @param x        Initial x screen coordinate
     * @param y        Initial y screen coordinate
     * @exception IllegalArgumentException if contents is null
     * @return Popup containing Contents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
    int getPopupType() {

    /**
     * Returns the preferred type of Popup to create.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
    void setPopupType(int type) {

    /**
     * Provides a hint as to the type of <code>Popup</code> that should
     * be created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
    public static PopupFactory getSharedInstance() {

    /**
     * Returns the shared <code>PopupFactory</code> which can be used
     * to obtain <code>Popup</code>s.
     *
     * @return Shared PopupFactory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
    public static void setSharedInstance(PopupFactory factory) {

    /**
     * Sets the <code>PopupFactory</code> that will be used to obtain
     * <code>Popup</code>s.
     * This will throw an <code>IllegalArgumentException</code> if
     * <code>factory</code> is null.
     *
     * @param factory Shared PopupFactory
     * @exception IllegalArgumentException if <code>factory</code> is null
     * @see #getPopup
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
    private int popupType = LIGHT_WEIGHT_POPUP;

    /**
     * Default type of Popup to create.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
    static final int MEDIUM_WEIGHT_POPUP  = 1;

    /**
     * Key used to indicate a medium weight Popup should be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
    static final int LIGHT_WEIGHT_POPUP   = 0;

    /**
     * Key used to indicate a light weight popup should be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
    private static final int MAX_CACHE_SIZE = 5;

    /**
     * Max number of items to store in any one particular cache.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/PopupFactory.java
public class PopupFactory {

/**
 * <code>PopupFactory</code>, as the name implies, is used to obtain
 * instances of <code>Popup</code>s. <code>Popup</code>s are used to
 * display a <code>Component</code> above all other <code>Component</code>s
 * in a particular containment hierarchy. The general contract is that
 * once you have obtained a <code>Popup</code> from a
 * <code>PopupFactory</code>, you must invoke <code>hide</code> on the
 * <code>Popup</code>. The typical usage is:
 * <pre>
 *   PopupFactory factory = PopupFactory.getSharedInstance();
 *   Popup popup = factory.getPopup(owner, contents, x, y);
 *   popup.show();
 *   ...
 *   popup.hide();
 * </pre>
 *
 * @see Popup
 *
 * @since 1.4
 */
