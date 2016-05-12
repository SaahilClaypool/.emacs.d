_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    boolean active = true;

    /**
     * <code>true</code> if the DropTarget is accepting Drag &amp; Drop operations.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    int     actions = DnDConstants.ACTION_COPY_OR_MOVE;

    /**
     * Default permissible actions supported by this DropTarget.
     *
     * @see #setDefaultActions
     * @see #getDefaultActions
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    private Component component;

    /**
     * The Component associated with this DropTarget.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    private DropTargetContext dropTargetContext = createDropTargetContext();

    /**
     * The DropTargetContext associated with this DropTarget.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    protected void clearAutoscroll() {

    /**
     * clear autoscrolling
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    protected void updateAutoscroll(Point dragCursorLocn) {

    /**
     * update autoscrolling with current cursor location
     * <P>
     * @param dragCursorLocn the <code>Point</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    protected void initializeAutoscrolling(Point p) {

    /**
     * initialize autoscrolling
     * <P>
     * @param p the <code>Point</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    /**

    /*********************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
        public synchronized void actionPerformed(ActionEvent e) {

        /**
         * cause autoscroll to occur
         * <P>
         * @param e the <code>ActionEvent</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
        protected void stop() { timer.stop(); }

        /**
         * cause autoscrolling to stop
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
        protected synchronized void updateLocation(Point newLocn) {

        /**
         * cause autoscroll to occur
         * <P>
         * @param newLocn the <code>Point</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
        private void updateRegion() {

        /**
         * update the geometry of the autoscroll region
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
        protected DropTargetAutoScroller(Component c, Point p) {

        /**
         * construct a DropTargetAutoScroller
         * <P>
         * @param c the <code>Component</code>
         * @param p the <code>Point</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    /**

    /*********************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    private void readObject(ObjectInputStream s)

    /**
     * Deserializes this <code>DropTarget</code>. This method first performs
     * default deserialization for all non-<code>transient</code> fields. An
     * attempt is then made to deserialize this object's
     * <code>DropTargetListener</code> as well. This is first attempted by
     * deserializing the field <code>dtListener</code>, because, in releases
     * prior to 1.4, a non-<code>transient</code> field of this name stored the
     * <code>DropTargetListener</code>. If this fails, the next object in the
     * stream is used instead.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * Serializes this <code>DropTarget</code>. Performs default serialization,
     * and then writes out this object's <code>DropTargetListener</code> if and
     * only if it can be serialized. If not, <code>null</code> is written
     * instead.
     *
     * @serialData The default serializable fields, in alphabetical order,
     *             followed by either a <code>DropTargetListener</code>
     *             instance, or <code>null</code>.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    protected DropTargetContext createDropTargetContext() {

    /**
     * Creates the DropTargetContext associated with this DropTarget.
     * Subclasses may override this method to instantiate their own
     * DropTargetContext subclass.
     *
     * This call is typically *only* called by the platform's
     * DropTargetContextPeer as a drag operation encounters this
     * DropTarget. Accessing the Context while no Drag is current
     * has undefined results.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public DropTargetContext getDropTargetContext() {

    /**
     * Gets the <code>DropTargetContext</code> associated
     * with this <code>DropTarget</code>.
     * <P>
     * @return the <code>DropTargetContext</code> associated with this <code>DropTarget</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public void removeNotify(ComponentPeer peer) {

    /**
     * Notify the DropTarget that it has been disassociated from a Component
     *
     **********************************************************************
     * This method is usually called from java.awt.Component.removeNotify() of
     * the Component associated with this DropTarget to notify the DropTarget
     * that a ComponentPeer has been disassociated with that Component.
     *
     * Calling this method, other than to notify this DropTarget of the
     * disassociation of the ComponentPeer from the Component may result in
     * a malfunction of the DnD system.
     **********************************************************************
     * <P>
     * @param peer The Peer of the Component we are being disassociated from!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public void addNotify(ComponentPeer peer) {

    /**
     * Notify the DropTarget that it has been associated with a Component
     *
     **********************************************************************
     * This method is usually called from java.awt.Component.addNotify() of
     * the Component associated with this DropTarget to notify the DropTarget
     * that a ComponentPeer has been associated with that Component.
     *
     * Calling this method, other than to notify this DropTarget of the
     * association of the ComponentPeer with the Component may result in
     * a malfunction of the DnD system.
     **********************************************************************
     * <P>
     * @param peer The Peer of the Component we are associated with!
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public void setFlavorMap(FlavorMap fm) {

    /**
     * Sets the <code>FlavorMap</code> associated
     * with this <code>DropTarget</code>.
     * <P>
     * @param fm the new <code>FlavorMap</code>, or null to
     * associate the default FlavorMap with this DropTarget.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public FlavorMap getFlavorMap() { return flavorMap; }

    /**
     * Gets the <code>FlavorMap</code>
     * associated with this <code>DropTarget</code>.
     * If no <code>FlavorMap</code> has been set for this
     * <code>DropTarget</code>, it is associated with the default
     * <code>FlavorMap</code>.
     * <P>
     * @return the FlavorMap for this DropTarget
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public synchronized void drop(DropTargetDropEvent dtde) {

    /**
     * Calls <code>drop</code> on the registered
     * <code>DropTargetListener</code> and passes it
     * the specified <code>DropTargetDropEvent</code>
     * if this <code>DropTarget</code> is active.
     *
     * @param dtde the <code>DropTargetDropEvent</code>
     *
     * @throws NullPointerException if <code>dtde</code> is null
     *         and at least one of the following is true: this
     *         <code>DropTarget</code> is not active, or there is
     *         no a <code>DropTargetListener</code> registered.
     *
     * @see #isActive
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public synchronized void dragExit(DropTargetEvent dte) {

    /**
     * Calls <code>dragExit</code> on the registered
     * <code>DropTargetListener</code> and passes it
     * the specified <code>DropTargetEvent</code>.
     * Has no effect if this <code>DropTarget</code>
     * is not active.
     * <p>
     * This method itself does not throw any exception
     * for null parameter but for exceptions thrown by
     * the respective method of the listener.
     *
     * @param dte the <code>DropTargetEvent</code>
     *
     * @see #isActive
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public synchronized void dropActionChanged(DropTargetDragEvent dtde) {

    /**
     * Calls <code>dropActionChanged</code> on the registered
     * <code>DropTargetListener</code> and passes it
     * the specified <code>DropTargetDragEvent</code>.
     * Has no effect if this <code>DropTarget</code>
     * is not active.
     *
     * @param dtde the <code>DropTargetDragEvent</code>
     *
     * @throws NullPointerException if this <code>DropTarget</code>
     *         is active and <code>dtde</code> is <code>null</code>
     *
     * @see #isActive
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public synchronized void dragOver(DropTargetDragEvent dtde) {

    /**
     * Calls <code>dragOver</code> on the registered
     * <code>DropTargetListener</code> and passes it
     * the specified <code>DropTargetDragEvent</code>.
     * Has no effect if this <code>DropTarget</code>
     * is not active.
     *
     * @param dtde the <code>DropTargetDragEvent</code>
     *
     * @throws NullPointerException if this <code>DropTarget</code>
     *         is active and <code>dtde</code> is <code>null</code>
     *
     * @see #isActive
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public synchronized void dragEnter(DropTargetDragEvent dtde) {

    /**
     * Calls <code>dragEnter</code> on the registered
     * <code>DropTargetListener</code> and passes it
     * the specified <code>DropTargetDragEvent</code>.
     * Has no effect if this <code>DropTarget</code>
     * is not active.
     *
     * @param dtde the <code>DropTargetDragEvent</code>
     *
     * @throws NullPointerException if this <code>DropTarget</code>
     *         is active and <code>dtde</code> is <code>null</code>
     *
     * @see #isActive
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public synchronized void removeDropTargetListener(DropTargetListener dtl) {

    /**
     * Removes the current <code>DropTargetListener</code> (UNICAST SOURCE).
     * <P>
     * @param dtl the DropTargetListener to deregister.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public synchronized void addDropTargetListener(DropTargetListener dtl) throws TooManyListenersException {

    /**
     * Adds a new <code>DropTargetListener</code> (UNICAST SOURCE).
     * <P>
     * @param dtl The new <code>DropTargetListener</code>
     * <P>
     * @throws TooManyListenersException if a
     * <code>DropTargetListener</code> is already added to this
     * <code>DropTarget</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public boolean isActive() {

    /**
     * Reports whether or not
     * this <code>DropTarget</code>
     * is currently active (ready to accept drops).
     * <P>
     * @return <CODE>true</CODE> if active, <CODE>false</CODE> if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public synchronized void setActive(boolean isActive) {

    /**
     * Sets the DropTarget active if <code>true</code>,
     * inactive if <code>false</code>.
     * <P>
     * @param isActive sets the <code>DropTarget</code> (in)active.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public int getDefaultActions() {

    /**
     * Gets an <code>int</code> representing the
     * current action(s) supported by this <code>DropTarget</code>.
     * <P>
     * @return the current default actions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public void setDefaultActions(int ops) {

    /**
     * Sets the default acceptable actions for this <code>DropTarget</code>
     * <P>
     * @param ops the default actions
     * @see java.awt.dnd.DnDConstants
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public synchronized Component getComponent() {

    /**
     * Gets the <code>Component</code> associated
     * with this <code>DropTarget</code>.
     * <P>
     * @return the current <code>Component</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public synchronized void setComponent(Component c) {

    /**
     * Note: this interface is required to permit the safe association
     * of a DropTarget with a Component in one of two ways, either:
     * <code> component.setDropTarget(droptarget); </code>
     * or <code> droptarget.setComponent(component); </code>
     * <P>
     * The Component will receive drops only if it is enabled.
     * @param c The new <code>Component</code> this <code>DropTarget</code>
     * is to be associated with.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public DropTarget(Component c, int ops, DropTargetListener dtl)

    /**
     * Creates a <code>DropTarget</code> given the <code>Component</code>
     * to associate itself with, an <code>int</code> representing
     * the default acceptable action(s) to support, and a
     * <code>DropTargetListener</code> to handle event processing.
     * <P>
     * The Component will receive drops only if it is enabled.
     * @param c         The <code>Component</code> with which this <code>DropTarget</code> is associated
     * @param ops       The default acceptable actions for this <code>DropTarget</code>
     * @param dtl       The <code>DropTargetListener</code> for this <code>DropTarget</code>
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     *            returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public DropTarget(Component c, DropTargetListener dtl)

    /**
     * Creates a <code>DropTarget</code> given the <code>Component</code>
     * to associate itself with, and the <code>DropTargetListener</code>
     * to handle event processing.
     * <P>
     * The Component will receive drops only if it is enabled.
     * @param c         The <code>Component</code> with which this <code>DropTarget</code> is associated
     * @param dtl       The <code>DropTargetListener</code> for this <code>DropTarget</code>
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     *            returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public DropTarget() throws HeadlessException {

    /**
     * Creates a <code>DropTarget</code>.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     *            returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public DropTarget(Component c, int ops, DropTargetListener dtl,
                      boolean act)

    /**
     * Creates a <code>DropTarget</code> given the <code>Component</code>
     * to associate itself with, an <code>int</code> representing
     * the default acceptable action(s)
     * to support, a <code>DropTargetListener</code>
     * to handle event processing, and a <code>boolean</code> indicating
     * if the <code>DropTarget</code> is currently accepting drops.
     * <P>
     * The Component will receive drops only if it is enabled.
     * @param c         The <code>Component</code> with which this <code>DropTarget</code> is associated
     * @param ops       The default acceptable actions for this <code>DropTarget</code>
     * @param dtl       The <code>DropTargetListener</code> for this <code>DropTarget</code>
     * @param act       Is the <code>DropTarget</code> accepting drops.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     *            returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public DropTarget(Component c, int ops, DropTargetListener dtl,
                      boolean act, FlavorMap fm)

    /**
     * Creates a new DropTarget given the <code>Component</code>
     * to associate itself with, an <code>int</code> representing
     * the default acceptable action(s) to
     * support, a <code>DropTargetListener</code>
     * to handle event processing, a <code>boolean</code> indicating
     * if the <code>DropTarget</code> is currently accepting drops, and
     * a <code>FlavorMap</code> to use (or null for the default <CODE>FlavorMap</CODE>).
     * <P>
     * The Component will receive drops only if it is enabled.
     * @param c         The <code>Component</code> with which this <code>DropTarget</code> is associated
     * @param ops       The default acceptable actions for this <code>DropTarget</code>
     * @param dtl       The <code>DropTargetListener</code> for this <code>DropTarget</code>
     * @param act       Is the <code>DropTarget</code> accepting drops.
     * @param fm        The <code>FlavorMap</code> to use, or null for the default <CODE>FlavorMap</CODE>
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     *            returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
public class DropTarget implements DropTargetListener, Serializable {

/**
 * The <code>DropTarget</code> is associated
 * with a <code>Component</code> when that <code>Component</code>
 * wishes
 * to accept drops during Drag and Drop operations.
 * <P>
 *  Each
 * <code>DropTarget</code> is associated with a <code>FlavorMap</code>.
 * The default <code>FlavorMap</code> hereafter designates the
 * <code>FlavorMap</code> returned by <code>SystemFlavorMap.getDefaultFlavorMap()</code>.
 *
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    boolean active = true;

    /**
     * <code>true</code> if the DropTarget is accepting Drag &amp; Drop operations.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    int     actions = DnDConstants.ACTION_COPY_OR_MOVE;

    /**
     * Default permissible actions supported by this DropTarget.
     *
     * @see #setDefaultActions
     * @see #getDefaultActions
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    private Component component;

    /**
     * The Component associated with this DropTarget.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    private DropTargetContext dropTargetContext = createDropTargetContext();

    /**
     * The DropTargetContext associated with this DropTarget.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    protected void clearAutoscroll() {

    /**
     * clear autoscrolling
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    protected void updateAutoscroll(Point dragCursorLocn) {

    /**
     * update autoscrolling with current cursor location
     * <P>
     * @param dragCursorLocn the <code>Point</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    protected void initializeAutoscrolling(Point p) {

    /**
     * initialize autoscrolling
     * <P>
     * @param p the <code>Point</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    /**

    /*********************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
        public synchronized void actionPerformed(ActionEvent e) {

        /**
         * cause autoscroll to occur
         * <P>
         * @param e the <code>ActionEvent</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
        protected void stop() { timer.stop(); }

        /**
         * cause autoscrolling to stop
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
        protected synchronized void updateLocation(Point newLocn) {

        /**
         * cause autoscroll to occur
         * <P>
         * @param newLocn the <code>Point</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
        private void updateRegion() {

        /**
         * update the geometry of the autoscroll region
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
        protected DropTargetAutoScroller(Component c, Point p) {

        /**
         * construct a DropTargetAutoScroller
         * <P>
         * @param c the <code>Component</code>
         * @param p the <code>Point</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    /**

    /*********************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    private void readObject(ObjectInputStream s)

    /**
     * Deserializes this <code>DropTarget</code>. This method first performs
     * default deserialization for all non-<code>transient</code> fields. An
     * attempt is then made to deserialize this object's
     * <code>DropTargetListener</code> as well. This is first attempted by
     * deserializing the field <code>dtListener</code>, because, in releases
     * prior to 1.4, a non-<code>transient</code> field of this name stored the
     * <code>DropTargetListener</code>. If this fails, the next object in the
     * stream is used instead.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * Serializes this <code>DropTarget</code>. Performs default serialization,
     * and then writes out this object's <code>DropTargetListener</code> if and
     * only if it can be serialized. If not, <code>null</code> is written
     * instead.
     *
     * @serialData The default serializable fields, in alphabetical order,
     *             followed by either a <code>DropTargetListener</code>
     *             instance, or <code>null</code>.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    protected DropTargetContext createDropTargetContext() {

    /**
     * Creates the DropTargetContext associated with this DropTarget.
     * Subclasses may override this method to instantiate their own
     * DropTargetContext subclass.
     *
     * This call is typically *only* called by the platform's
     * DropTargetContextPeer as a drag operation encounters this
     * DropTarget. Accessing the Context while no Drag is current
     * has undefined results.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public DropTargetContext getDropTargetContext() {

    /**
     * Gets the <code>DropTargetContext</code> associated
     * with this <code>DropTarget</code>.
     * <P>
     * @return the <code>DropTargetContext</code> associated with this <code>DropTarget</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public void removeNotify(ComponentPeer peer) {

    /**
     * Notify the DropTarget that it has been disassociated from a Component
     *
     **********************************************************************
     * This method is usually called from java.awt.Component.removeNotify() of
     * the Component associated with this DropTarget to notify the DropTarget
     * that a ComponentPeer has been disassociated with that Component.
     *
     * Calling this method, other than to notify this DropTarget of the
     * disassociation of the ComponentPeer from the Component may result in
     * a malfunction of the DnD system.
     **********************************************************************
     * <P>
     * @param peer The Peer of the Component we are being disassociated from!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public void addNotify(ComponentPeer peer) {

    /**
     * Notify the DropTarget that it has been associated with a Component
     *
     **********************************************************************
     * This method is usually called from java.awt.Component.addNotify() of
     * the Component associated with this DropTarget to notify the DropTarget
     * that a ComponentPeer has been associated with that Component.
     *
     * Calling this method, other than to notify this DropTarget of the
     * association of the ComponentPeer with the Component may result in
     * a malfunction of the DnD system.
     **********************************************************************
     * <P>
     * @param peer The Peer of the Component we are associated with!
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public void setFlavorMap(FlavorMap fm) {

    /**
     * Sets the <code>FlavorMap</code> associated
     * with this <code>DropTarget</code>.
     * <P>
     * @param fm the new <code>FlavorMap</code>, or null to
     * associate the default FlavorMap with this DropTarget.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public FlavorMap getFlavorMap() { return flavorMap; }

    /**
     * Gets the <code>FlavorMap</code>
     * associated with this <code>DropTarget</code>.
     * If no <code>FlavorMap</code> has been set for this
     * <code>DropTarget</code>, it is associated with the default
     * <code>FlavorMap</code>.
     * <P>
     * @return the FlavorMap for this DropTarget
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public synchronized void drop(DropTargetDropEvent dtde) {

    /**
     * Calls <code>drop</code> on the registered
     * <code>DropTargetListener</code> and passes it
     * the specified <code>DropTargetDropEvent</code>
     * if this <code>DropTarget</code> is active.
     *
     * @param dtde the <code>DropTargetDropEvent</code>
     *
     * @throws NullPointerException if <code>dtde</code> is null
     *         and at least one of the following is true: this
     *         <code>DropTarget</code> is not active, or there is
     *         no a <code>DropTargetListener</code> registered.
     *
     * @see #isActive
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public synchronized void dragExit(DropTargetEvent dte) {

    /**
     * Calls <code>dragExit</code> on the registered
     * <code>DropTargetListener</code> and passes it
     * the specified <code>DropTargetEvent</code>.
     * Has no effect if this <code>DropTarget</code>
     * is not active.
     * <p>
     * This method itself does not throw any exception
     * for null parameter but for exceptions thrown by
     * the respective method of the listener.
     *
     * @param dte the <code>DropTargetEvent</code>
     *
     * @see #isActive
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public synchronized void dropActionChanged(DropTargetDragEvent dtde) {

    /**
     * Calls <code>dropActionChanged</code> on the registered
     * <code>DropTargetListener</code> and passes it
     * the specified <code>DropTargetDragEvent</code>.
     * Has no effect if this <code>DropTarget</code>
     * is not active.
     *
     * @param dtde the <code>DropTargetDragEvent</code>
     *
     * @throws NullPointerException if this <code>DropTarget</code>
     *         is active and <code>dtde</code> is <code>null</code>
     *
     * @see #isActive
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public synchronized void dragOver(DropTargetDragEvent dtde) {

    /**
     * Calls <code>dragOver</code> on the registered
     * <code>DropTargetListener</code> and passes it
     * the specified <code>DropTargetDragEvent</code>.
     * Has no effect if this <code>DropTarget</code>
     * is not active.
     *
     * @param dtde the <code>DropTargetDragEvent</code>
     *
     * @throws NullPointerException if this <code>DropTarget</code>
     *         is active and <code>dtde</code> is <code>null</code>
     *
     * @see #isActive
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public synchronized void dragEnter(DropTargetDragEvent dtde) {

    /**
     * Calls <code>dragEnter</code> on the registered
     * <code>DropTargetListener</code> and passes it
     * the specified <code>DropTargetDragEvent</code>.
     * Has no effect if this <code>DropTarget</code>
     * is not active.
     *
     * @param dtde the <code>DropTargetDragEvent</code>
     *
     * @throws NullPointerException if this <code>DropTarget</code>
     *         is active and <code>dtde</code> is <code>null</code>
     *
     * @see #isActive
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public synchronized void removeDropTargetListener(DropTargetListener dtl) {

    /**
     * Removes the current <code>DropTargetListener</code> (UNICAST SOURCE).
     * <P>
     * @param dtl the DropTargetListener to deregister.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public synchronized void addDropTargetListener(DropTargetListener dtl) throws TooManyListenersException {

    /**
     * Adds a new <code>DropTargetListener</code> (UNICAST SOURCE).
     * <P>
     * @param dtl The new <code>DropTargetListener</code>
     * <P>
     * @throws TooManyListenersException if a
     * <code>DropTargetListener</code> is already added to this
     * <code>DropTarget</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public boolean isActive() {

    /**
     * Reports whether or not
     * this <code>DropTarget</code>
     * is currently active (ready to accept drops).
     * <P>
     * @return <CODE>true</CODE> if active, <CODE>false</CODE> if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public synchronized void setActive(boolean isActive) {

    /**
     * Sets the DropTarget active if <code>true</code>,
     * inactive if <code>false</code>.
     * <P>
     * @param isActive sets the <code>DropTarget</code> (in)active.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public int getDefaultActions() {

    /**
     * Gets an <code>int</code> representing the
     * current action(s) supported by this <code>DropTarget</code>.
     * <P>
     * @return the current default actions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public void setDefaultActions(int ops) {

    /**
     * Sets the default acceptable actions for this <code>DropTarget</code>
     * <P>
     * @param ops the default actions
     * @see java.awt.dnd.DnDConstants
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public synchronized Component getComponent() {

    /**
     * Gets the <code>Component</code> associated
     * with this <code>DropTarget</code>.
     * <P>
     * @return the current <code>Component</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public synchronized void setComponent(Component c) {

    /**
     * Note: this interface is required to permit the safe association
     * of a DropTarget with a Component in one of two ways, either:
     * <code> component.setDropTarget(droptarget); </code>
     * or <code> droptarget.setComponent(component); </code>
     * <P>
     * The Component will receive drops only if it is enabled.
     * @param c The new <code>Component</code> this <code>DropTarget</code>
     * is to be associated with.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public DropTarget(Component c, int ops, DropTargetListener dtl)

    /**
     * Creates a <code>DropTarget</code> given the <code>Component</code>
     * to associate itself with, an <code>int</code> representing
     * the default acceptable action(s) to support, and a
     * <code>DropTargetListener</code> to handle event processing.
     * <P>
     * The Component will receive drops only if it is enabled.
     * @param c         The <code>Component</code> with which this <code>DropTarget</code> is associated
     * @param ops       The default acceptable actions for this <code>DropTarget</code>
     * @param dtl       The <code>DropTargetListener</code> for this <code>DropTarget</code>
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     *            returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public DropTarget(Component c, DropTargetListener dtl)

    /**
     * Creates a <code>DropTarget</code> given the <code>Component</code>
     * to associate itself with, and the <code>DropTargetListener</code>
     * to handle event processing.
     * <P>
     * The Component will receive drops only if it is enabled.
     * @param c         The <code>Component</code> with which this <code>DropTarget</code> is associated
     * @param dtl       The <code>DropTargetListener</code> for this <code>DropTarget</code>
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     *            returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public DropTarget() throws HeadlessException {

    /**
     * Creates a <code>DropTarget</code>.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     *            returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public DropTarget(Component c, int ops, DropTargetListener dtl,
                      boolean act)

    /**
     * Creates a <code>DropTarget</code> given the <code>Component</code>
     * to associate itself with, an <code>int</code> representing
     * the default acceptable action(s)
     * to support, a <code>DropTargetListener</code>
     * to handle event processing, and a <code>boolean</code> indicating
     * if the <code>DropTarget</code> is currently accepting drops.
     * <P>
     * The Component will receive drops only if it is enabled.
     * @param c         The <code>Component</code> with which this <code>DropTarget</code> is associated
     * @param ops       The default acceptable actions for this <code>DropTarget</code>
     * @param dtl       The <code>DropTargetListener</code> for this <code>DropTarget</code>
     * @param act       Is the <code>DropTarget</code> accepting drops.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     *            returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
    public DropTarget(Component c, int ops, DropTargetListener dtl,
                      boolean act, FlavorMap fm)

    /**
     * Creates a new DropTarget given the <code>Component</code>
     * to associate itself with, an <code>int</code> representing
     * the default acceptable action(s) to
     * support, a <code>DropTargetListener</code>
     * to handle event processing, a <code>boolean</code> indicating
     * if the <code>DropTarget</code> is currently accepting drops, and
     * a <code>FlavorMap</code> to use (or null for the default <CODE>FlavorMap</CODE>).
     * <P>
     * The Component will receive drops only if it is enabled.
     * @param c         The <code>Component</code> with which this <code>DropTarget</code> is associated
     * @param ops       The default acceptable actions for this <code>DropTarget</code>
     * @param dtl       The <code>DropTargetListener</code> for this <code>DropTarget</code>
     * @param act       Is the <code>DropTarget</code> accepting drops.
     * @param fm        The <code>FlavorMap</code> to use, or null for the default <CODE>FlavorMap</CODE>
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     *            returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTarget.java
public class DropTarget implements DropTargetListener, Serializable {

/**
 * The <code>DropTarget</code> is associated
 * with a <code>Component</code> when that <code>Component</code>
 * wishes
 * to accept drops during Drag and Drop operations.
 * <P>
 *  Each
 * <code>DropTarget</code> is associated with a <code>FlavorMap</code>.
 * The default <code>FlavorMap</code> hereafter designates the
 * <code>FlavorMap</code> returned by <code>SystemFlavorMap.getDefaultFlavorMap()</code>.
 *
 * @since 1.2
 */
