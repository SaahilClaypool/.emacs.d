_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Get the state of this object.
         *
         * @return an instance of AccessibleStateSet containing the current
         * state set of the object
         * @see AccessibleState
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         * @see AccessibleRole
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    protected class AccessibleAWTDialog extends AccessibleAWTWindow

    /**
     * This class implements accessibility support for the
     * <code>Dialog</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to dialog user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this Dialog.
     * For dialogs, the AccessibleContext takes the form of an
     * AccessibleAWTDialog.
     * A new AccessibleAWTDialog instance is created if necessary.
     *
     * @return an AccessibleAWTDialog that serves as the
     *         AccessibleContext of this Dialog
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    protected String paramString() {

    /**
     * Returns a string representing the state of this dialog. This
     * method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return    the parameter string of this dialog window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public boolean isUndecorated() {

    /**
     * Indicates whether this dialog is undecorated.
     * By default, all dialogs are initially decorated.
     * @return    <code>true</code> if dialog is undecorated;
     *                        <code>false</code> otherwise.
     * @see       java.awt.Dialog#setUndecorated
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public void setUndecorated(boolean undecorated) {

    /**
     * Disables or enables decorations for this dialog.
     * <p>
     * This method can only be called while the dialog is not displayable. To
     * make this dialog decorated, it must be opaque and have the default shape,
     * otherwise the {@code IllegalComponentStateException} will be thrown.
     * Refer to {@link Window#setShape}, {@link Window#setOpacity} and {@link
     * Window#setBackground} for details
     *
     * @param  undecorated {@code true} if no dialog decorations are to be
     *         enabled; {@code false} if dialog decorations are to be enabled
     *
     * @throws IllegalComponentStateException if the dialog is displayable
     * @throws IllegalComponentStateException if {@code undecorated} is
     *      {@code false}, and this dialog does not have the default shape
     * @throws IllegalComponentStateException if {@code undecorated} is
     *      {@code false}, and this dialog opacity is less than {@code 1.0f}
     * @throws IllegalComponentStateException if {@code undecorated} is
     *      {@code false}, and the alpha value of this dialog background
     *      color is less than {@code 1.0f}
     *
     * @see    #isUndecorated
     * @see    Component#isDisplayable
     * @see    Window#getShape
     * @see    Window#getOpacity
     * @see    Window#getBackground
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public void setResizable(boolean resizable) {

    /**
     * Sets whether this dialog is resizable by the user.
     * @param     resizable <code>true</code> if the user can
     *                 resize this dialog; <code>false</code> otherwise.
     * @see       java.awt.Dialog#isResizable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public boolean isResizable() {

    /**
     * Indicates whether this dialog is resizable by the user.
     * By default, all dialogs are initially resizable.
     * @return    <code>true</code> if the user can resize the dialog;
     *            <code>false</code> otherwise.
     * @see       java.awt.Dialog#setResizable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public void toBack() {

    /**
     * {@inheritDoc}
     * <p>
     * If this dialog is modal and blocks some windows, then all of them are
     * also sent to the back to keep them below the blocking dialog.
     *
     * @see java.awt.Window#toBack
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    void doDispose() {

    /**
     * Disposes the Dialog and then causes show() to return if it is currently
     * blocked.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    @Deprecated

    /**
     * Hides the Dialog and then causes {@code show} to return if it is currently
     * blocked.
     * @see Window#show
     * @see Window#dispose
     * @see Window#setVisible(boolean)
     * @deprecated As of JDK version 1.5, replaced by
     * {@link #setVisible(boolean) setVisible(boolean)}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    @Deprecated

   /**
     * Makes the {@code Dialog} visible. If the dialog and/or its owner
     * are not yet displayable, both are made displayable.  The
     * dialog will be validated prior to being made visible.
     * If the dialog is already visible, this will bring the dialog
     * to the front.
     * <p>
     * If the dialog is modal and is not already visible, this call
     * will not return until the dialog is hidden by calling hide or
     * dispose. It is permissible to show modal dialogs from the event
     * dispatching thread because the toolkit will ensure that another
     * event pump runs while the one which invoked this method is blocked.
     * @see Component#hide
     * @see Component#isDisplayable
     * @see Component#validate
     * @see #isModal
     * @see Window#setVisible(boolean)
     * @deprecated As of JDK version 1.5, replaced by
     * {@link #setVisible(boolean) setVisible(boolean)}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public void setVisible(boolean b) {

    /**
     * Shows or hides this {@code Dialog} depending on the value of parameter
     * {@code b}.
     * @param b if {@code true}, makes the {@code Dialog} visible,
     * otherwise hides the {@code Dialog}.
     * If the dialog and/or its owner
     * are not yet displayable, both are made displayable.  The
     * dialog will be validated prior to being made visible.
     * If {@code false}, hides the {@code Dialog} and then causes {@code setVisible(true)}
     * to return if it is currently blocked.
     * <p>
     * <b>Notes for modal dialogs</b>.
     * <ul>
     * <li>{@code setVisible(true)}:  If the dialog is not already
     * visible, this call will not return until the dialog is
     * hidden by calling {@code setVisible(false)} or
     * {@code dispose}.
     * <li>{@code setVisible(false)}:  Hides the dialog and then
     * returns on {@code setVisible(true)} if it is currently blocked.
     * <li>It is OK to call this method from the event dispatching
     * thread because the toolkit ensures that other events are
     * not blocked while this method is blocked.
     * </ul>
     * @see java.awt.Window#setVisible
     * @see java.awt.Window#dispose
     * @see java.awt.Component#isDisplayable
     * @see java.awt.Component#validate
     * @see java.awt.Dialog#isModal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    private boolean conditionalShow(Component toFocus, AtomicLong time) {

    /**
     * @return true if we actually showed, false if we just called toFront()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public void setTitle(String title) {

    /**
     * Sets the title of the Dialog.
     * @param title the title displayed in the dialog's border;
         * a null value results in an empty title
     * @see #getTitle
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public String getTitle() {

    /**
     * Gets the title of the dialog. The title is displayed in the
     * dialog's border.
     * @return    the title of this dialog window. The title may be
     *            <code>null</code>.
     * @see       java.awt.Dialog#setTitle
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public void setModalityType(ModalityType type) {

    /**
     * Sets the modality type for this dialog. See {@link
     * java.awt.Dialog.ModalityType ModalityType} for possible modality types.
     * <p>
     * If the given modality type is not supported, <code>MODELESS</code>
     * is used. You may want to call <code>getModalityType()</code> after calling
     * this method to ensure that the modality type has been set.
     * <p>
     * Note: changing modality of the visible dialog may have no effect
     * until it is hidden and then shown again.
     *
     * @param type specifies whether dialog blocks input to other
     *     windows when shown. <code>null</code> value and unsupported modality
     *     types are equivalent to <code>MODELESS</code>
     * @exception SecurityException if the calling thread does not have permission
     *     to create modal dialogs with the given <code>modalityType</code>
     *
     * @see       java.awt.Dialog#getModalityType
     * @see       java.awt.Toolkit#isModalityTypeSupported
     *
     * @since     1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public ModalityType getModalityType() {

    /**
     * Returns the modality type of this dialog.
     *
     * @return modality type of this dialog
     *
     * @see java.awt.Dialog#setModalityType
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public void setModal(boolean modal) {

    /**
     * Specifies whether this dialog should be modal.
     * <p>
     * This method is obsolete and is kept for backwards compatibility only.
     * Use {@link #setModalityType setModalityType()} instead.
     * <p>
     * Note: changing modality of the visible dialog may have no effect
     * until it is hidden and then shown again.
     *
     * @param modal specifies whether dialog blocks input to other windows
     *     when shown; calling to <code>setModal(true)</code> is equivalent to
     *     <code>setModalityType(Dialog.DEFAULT_MODALITY_TYPE)</code>, and
     *     calling to <code>setModal(false)</code> is equvivalent to
     *     <code>setModalityType(Dialog.ModalityType.MODELESS)</code>
     *
     * @see       java.awt.Dialog#DEFAULT_MODALITY_TYPE
     * @see       java.awt.Dialog.ModalityType#MODELESS
     * @see       java.awt.Dialog#isModal
     * @see       java.awt.Dialog#getModalityType
     * @see       java.awt.Dialog#setModalityType
     *
     * @since     1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public boolean isModal() {

    /**
     * Indicates whether the dialog is modal.
     * <p>
     * This method is obsolete and is kept for backwards compatibility only.
     * Use {@link #getModalityType getModalityType()} instead.
     *
     * @return    <code>true</code> if this dialog window is modal;
     *            <code>false</code> otherwise
     *
     * @see       java.awt.Dialog#DEFAULT_MODALITY_TYPE
     * @see       java.awt.Dialog.ModalityType#MODELESS
     * @see       java.awt.Dialog#setModal
     * @see       java.awt.Dialog#getModalityType
     * @see       java.awt.Dialog#setModalityType
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public void addNotify() {

    /**
     * Makes this Dialog displayable by connecting it to
     * a native screen resource.  Making a dialog displayable will
     * cause any of its children to be made displayable.
     * This method is called internally by the toolkit and should
     * not be called directly by programs.
     * @see Component#isDisplayable
     * @see #removeNotify
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    String constructComponentName() {

    /**
     * Construct a name for this component.  Called by getName() when the
     * name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public Dialog(Window owner, String title, ModalityType modalityType,
                  GraphicsConfiguration gc) {

    /**
     * Constructs an initially invisible <code>Dialog</code> with the
     * specified owner <code>Window</code>, title, modality and
     * <code>GraphicsConfiguration</code>.
     *
     * @param owner the owner of the dialog. The owner must be an instance of
     *     {@link java.awt.Dialog Dialog}, {@link java.awt.Frame Frame}, any
     *     of their descendents or <code>null</code>
     * @param title the title of the dialog or <code>null</code> if this dialog
     *     has no title
     * @param modalityType specifies whether dialog blocks input to other
     *    windows when shown. <code>null</code> value and unsupported modality
     *    types are equivalent to <code>MODELESS</code>
     * @param gc the <code>GraphicsConfiguration</code> of the target screen device;
     *     if <code>null</code>, the default system <code>GraphicsConfiguration</code>
     *     is assumed
     *
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>
     *     is not an instance of {@link java.awt.Dialog Dialog} or {@link
     *     java.awt.Frame Frame}
     * @exception java.lang.IllegalArgumentException if <code>gc</code>
     *     is not from a screen device
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     * @exception SecurityException if the calling thread does not have permission
     *     to create modal dialogs with the given <code>modalityType</code>
     *
     * @see java.awt.Dialog.ModalityType
     * @see java.awt.Dialog#setModal
     * @see java.awt.Dialog#setModalityType
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see java.awt.Toolkit#isModalityTypeSupported
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public Dialog(Window owner, String title, ModalityType modalityType) {

    /**
     * Constructs an initially invisible <code>Dialog</code> with the
     * specified owner <code>Window</code>, title and modality.
     *
     * @param owner the owner of the dialog. The owner must be an instance of
     *     {@link java.awt.Dialog Dialog}, {@link java.awt.Frame Frame}, any
     *     of their descendents or <code>null</code>
     * @param title the title of the dialog or <code>null</code> if this dialog
     *     has no title
     * @param modalityType specifies whether dialog blocks input to other
     *    windows when shown. <code>null</code> value and unsupported modality
     *    types are equivalent to <code>MODELESS</code>
     *
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>
     *     is not an instance of {@link java.awt.Dialog Dialog} or {@link
     *     java.awt.Frame Frame}
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>'s
     *     <code>GraphicsConfiguration</code> is not from a screen device
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     * @exception SecurityException if the calling thread does not have permission
     *     to create modal dialogs with the given <code>modalityType</code>
     *
     * @see java.awt.Dialog.ModalityType
     * @see java.awt.Dialog#setModal
     * @see java.awt.Dialog#setModalityType
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see java.awt.Toolkit#isModalityTypeSupported
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public Dialog(Window owner, ModalityType modalityType) {

    /**
     * Constructs an initially invisible <code>Dialog</code> with the
     * specified owner <code>Window</code> and modality and an empty title.
     *
     * @param owner the owner of the dialog. The owner must be an instance of
     *    {@link java.awt.Dialog Dialog}, {@link java.awt.Frame Frame}, any
     *    of their descendents or <code>null</code>
     * @param modalityType specifies whether dialog blocks input to other
     *    windows when shown. <code>null</code> value and unsupported modality
     *    types are equivalent to <code>MODELESS</code>
     *
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>
     *    is not an instance of {@link java.awt.Dialog Dialog} or {@link
     *    java.awt.Frame Frame}
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>'s
     *    <code>GraphicsConfiguration</code> is not from a screen device
     * @exception HeadlessException when
     *    <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     * @exception SecurityException if the calling thread does not have permission
     *    to create modal dialogs with the given <code>modalityType</code>
     *
     * @see java.awt.Dialog.ModalityType
     * @see java.awt.Dialog#setModal
     * @see java.awt.Dialog#setModalityType
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see java.awt.Toolkit#isModalityTypeSupported
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public Dialog(Window owner, String title) {

    /**
     * Constructs an initially invisible, modeless <code>Dialog</code> with
     * the specified owner <code>Window</code> and title.
     *
     * @param owner the owner of the dialog. The owner must be an instance of
     *    {@link java.awt.Dialog Dialog}, {@link java.awt.Frame Frame}, any
     *    of their descendents or <code>null</code>
     * @param title the title of the dialog or <code>null</code> if this dialog
     *    has no title
     *
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>
     *    is not an instance of {@link java.awt.Dialog Dialog} or {@link
     *    java.awt.Frame Frame}
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>'s
     *    <code>GraphicsConfiguration</code> is not from a screen device
     * @exception HeadlessException when
     *    <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public Dialog(Window owner) {

    /**
     * Constructs an initially invisible, modeless <code>Dialog</code> with the
     * specified owner <code>Window</code> and an empty title.
     *
     * @param owner the owner of the dialog. The owner must be an instance of
     *     {@link java.awt.Dialog Dialog}, {@link java.awt.Frame Frame}, any
     *     of their descendents or <code>null</code>
     *
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>
     *     is not an instance of {@link java.awt.Dialog Dialog} or {@link
     *     java.awt.Frame Frame}
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>'s
     *     <code>GraphicsConfiguration</code> is not from a screen device
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
     public Dialog(Dialog owner, String title, boolean modal,
                   GraphicsConfiguration gc) {

    /**
     * Constructs an initially invisible <code>Dialog</code> with the
     * specified owner <code>Dialog</code>, title, modality and
     * <code>GraphicsConfiguration</code>.
     *
     * @param owner the owner of the dialog or <code>null</code> if this
     *     dialog has no owner
     * @param title the title of the dialog or <code>null</code> if this
     *     dialog has no title
     * @param modal specifies whether dialog blocks user input to other top-level
     *     windows when shown. If <code>false</code>, the dialog is <code>MODELESS</code>;
     *     if <code>true</code>, the modality type property is set to
     *     <code>DEFAULT_MODALITY_TYPE</code>
     * @param gc the <code>GraphicsConfiguration</code> of the target screen device;
     *     if <code>null</code>, the default system <code>GraphicsConfiguration</code>
     *     is assumed
     * @exception java.lang.IllegalArgumentException if <code>gc</code>
     *    is not from a screen device
     * @exception HeadlessException when
     *    <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     *
     * @see java.awt.Dialog.ModalityType
     * @see java.awt.Dialog.ModalityType#MODELESS
     * @see java.awt.Dialog#DEFAULT_MODALITY_TYPE
     * @see java.awt.Dialog#setModal
     * @see java.awt.Dialog#setModalityType
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see Component#setSize
     * @see Component#setVisible
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
     public Dialog(Dialog owner, String title, boolean modal) {

    /**
     * Constructs an initially invisible <code>Dialog</code> with the
     * specified owner <code>Dialog</code>, title, and modality.
     *
     * @param owner the owner of the dialog or <code>null</code> if this
     *     dialog has no owner
     * @param title the title of the dialog or <code>null</code> if this
     *     dialog has no title
     * @param modal specifies whether dialog blocks user input to other top-level
     *     windows when shown. If <code>false</code>, the dialog is <code>MODELESS</code>;
     *     if <code>true</code>, the modality type property is set to
     *     <code>DEFAULT_MODALITY_TYPE</code>
     * @exception IllegalArgumentException if the <code>owner</code>'s
     *    <code>GraphicsConfiguration</code> is not from a screen device
     * @exception HeadlessException when
     *    <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     *
     * @see java.awt.Dialog.ModalityType
     * @see java.awt.Dialog.ModalityType#MODELESS
     * @see java.awt.Dialog#DEFAULT_MODALITY_TYPE
     * @see java.awt.Dialog#setModal
     * @see java.awt.Dialog#setModalityType
     * @see java.awt.GraphicsEnvironment#isHeadless
     *
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
     public Dialog(Dialog owner, String title) {

    /**
     * Constructs an initially invisible, modeless <code>Dialog</code>
     * with the specified owner <code>Dialog</code> and title.
     *
     * @param owner the owner of the dialog or <code>null</code> if this
     *     has no owner
     * @param title the title of the dialog or <code>null</code> if this dialog
     *     has no title
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>'s
     *     <code>GraphicsConfiguration</code> is not from a screen device
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
     public Dialog(Dialog owner) {

    /**
     * Constructs an initially invisible, modeless <code>Dialog</code> with
     * the specified owner <code>Dialog</code> and an empty title.
     *
     * @param owner the owner of the dialog or <code>null</code> if this
     *     dialog has no owner
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>'s
     *     <code>GraphicsConfiguration</code> is not from a screen device
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
     public Dialog(Frame owner, String title, boolean modal,
                   GraphicsConfiguration gc) {

    /**
     * Constructs an initially invisible <code>Dialog</code> with the specified owner
     * <code>Frame</code>, title, modality, and <code>GraphicsConfiguration</code>.
     * @param owner the owner of the dialog or <code>null</code> if this dialog
     *     has no owner
     * @param title the title of the dialog or <code>null</code> if this dialog
     *     has no title
     * @param modal specifies whether dialog blocks user input to other top-level
     *     windows when shown. If <code>false</code>, the dialog is <code>MODELESS</code>;
     *     if <code>true</code>, the modality type property is set to
     *     <code>DEFAULT_MODALITY_TYPE</code>
     * @param gc the <code>GraphicsConfiguration</code> of the target screen device;
     *     if <code>null</code>, the default system <code>GraphicsConfiguration</code>
     *     is assumed
     * @exception java.lang.IllegalArgumentException if <code>gc</code>
     *     is not from a screen device
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     *
     * @see java.awt.Dialog.ModalityType
     * @see java.awt.Dialog.ModalityType#MODELESS
     * @see java.awt.Dialog#DEFAULT_MODALITY_TYPE
     * @see java.awt.Dialog#setModal
     * @see java.awt.Dialog#setModalityType
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see Component#setSize
     * @see Component#setVisible
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
     public Dialog(Frame owner, String title, boolean modal) {

    /**
     * Constructs an initially invisible <code>Dialog</code> with the
     * specified owner <code>Frame</code>, title and modality.
     *
     * @param owner the owner of the dialog or <code>null</code> if
     *     this dialog has no owner
     * @param title the title of the dialog or <code>null</code> if this dialog
     *     has no title
     * @param modal specifies whether dialog blocks user input to other top-level
     *     windows when shown. If <code>false</code>, the dialog is <code>MODELESS</code>;
     *     if <code>true</code>, the modality type property is set to
     *     <code>DEFAULT_MODALITY_TYPE</code>
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>'s
     *    <code>GraphicsConfiguration</code> is not from a screen device
     * @exception HeadlessException when
     *    <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     *
     * @see java.awt.Dialog.ModalityType
     * @see java.awt.Dialog.ModalityType#MODELESS
     * @see java.awt.Dialog#DEFAULT_MODALITY_TYPE
     * @see java.awt.Dialog#setModal
     * @see java.awt.Dialog#setModalityType
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see Component#setSize
     * @see Component#setVisible
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
     public Dialog(Frame owner, String title) {

    /**
     * Constructs an initially invisible, modeless <code>Dialog</code> with
     * the specified owner <code>Frame</code> and title.
     *
     * @param owner the owner of the dialog or <code>null</code> if
     *     this dialog has no owner
     * @param title the title of the dialog or <code>null</code> if this dialog
     *     has no title
     * @exception IllegalArgumentException if the <code>owner</code>'s
     *     <code>GraphicsConfiguration</code> is not from a screen device
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see Component#setSize
     * @see Component#setVisible
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
     public Dialog(Frame owner, boolean modal) {

    /**
     * Constructs an initially invisible <code>Dialog</code> with the specified
     * owner <code>Frame</code> and modality and an empty title.
     *
     * @param owner the owner of the dialog or <code>null</code> if
     *     this dialog has no owner
     * @param modal specifies whether dialog blocks user input to other top-level
     *     windows when shown. If <code>false</code>, the dialog is <code>MODELESS</code>;
     *     if <code>true</code>, the modality type property is set to
     *     <code>DEFAULT_MODALITY_TYPE</code>
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>'s
     *    <code>GraphicsConfiguration</code> is not from a screen device
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     *
     * @see java.awt.Dialog.ModalityType
     * @see java.awt.Dialog.ModalityType#MODELESS
     * @see java.awt.Dialog#DEFAULT_MODALITY_TYPE
     * @see java.awt.Dialog#setModal
     * @see java.awt.Dialog#setModalityType
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
     public Dialog(Frame owner) {

    /**
     * Constructs an initially invisible, modeless <code>Dialog</code> with
     * the specified owner <code>Frame</code> and an empty title.
     *
     * @param owner the owner of the dialog or <code>null</code> if
     *     this dialog has no owner
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>'s
     *    <code>GraphicsConfiguration</code> is not from a screen device
     * @exception HeadlessException when
     *    <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see Component#setSize
     * @see Component#setVisible
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    String title;

    /**
     * Specifies the title of the Dialog.
     * This field can be null.
     *
     * @serial
     * @see #getTitle()
     * @see #setTitle(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
        APPLICATION_EXCLUDE,

        /**
         * <code>APPLICATION_EXCLUDE</code> indicates that a top-level window
         * won't be blocked by any application-modal dialogs. Also, it isn't
         * blocked by document-modal dialogs from outside of its child hierarchy.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public static enum ModalExclusionType {

    /**
     * Any top-level window can be marked not to be blocked by modal
     * dialogs. This is called "modal exclusion". This enum specifies
     * the possible modal exclusion types.
     *
     * @see Window#getModalExclusionType
     * @see Window#setModalExclusionType
     * @see Toolkit#isModalExclusionTypeSupported
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    ModalityType modalityType;

    /**
     * Modality type of this dialog. If the dialog's modality type is not
     * {@link Dialog.ModalityType#MODELESS ModalityType.MODELESS}, it blocks all
     * user input to some application top-level windows.
     *
     * @serial
     *
     * @see ModalityType
     * @see #getModalityType
     * @see #setModalityType
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    boolean modal;

    /**
     * True if this dialog is modal, false is the dialog is modeless.
     * A modal dialog blocks user input to some application top-level
     * windows. This field is kept only for backwards compatibility. Use the
     * {@link Dialog.ModalityType ModalityType} enum instead.
     *
     * @serial
     *
     * @see #isModal
     * @see #setModal
     * @see #getModalityType
     * @see #setModalityType
     * @see ModalityType
     * @see ModalityType#MODELESS
     * @see #DEFAULT_MODALITY_TYPE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public final static ModalityType DEFAULT_MODALITY_TYPE = ModalityType.APPLICATION_MODAL;

    /**
     * Default modality type for modal dialogs. The default modality type is
     * <code>APPLICATION_MODAL</code>. Calling the oldstyle <code>setModal(true)</code>
     * is equal to <code>setModalityType(DEFAULT_MODALITY_TYPE)</code>.
     *
     * @see java.awt.Dialog.ModalityType
     * @see java.awt.Dialog#setModal
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
        TOOLKIT_MODAL

        /**
         * A <code>TOOLKIT_MODAL</code> dialog blocks all top-level windows run
         * from the same toolkit except those from its own child hierarchy. If there
         * are several applets launched in a browser, all of them run with the same
         * toolkit; thus, a toolkit-modal dialog displayed by an applet may affect
         * other applets and all windows of the browser instance which embeds the
         * Java runtime environment for this toolkit.
         * Special <code>AWTPermission</code> "toolkitModality" must be granted to use
         * toolkit-modal dialogs. If a <code>TOOLKIT_MODAL</code> dialog is being created
         * and this permission is not granted, a <code>SecurityException</code> will be
         * thrown, and no dialog will be created. If a modality type is being changed
         * to <code>TOOLKIT_MODAL</code> and this permission is not granted, a
         * <code>SecurityException</code> will be thrown, and the modality type will
         * be left unchanged.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
        DOCUMENT_MODAL,

        /**
         * A <code>DOCUMENT_MODAL</code> dialog blocks input to all top-level windows
         * from the same document except those from its own child hierarchy.
         * A document is a top-level window without an owner. It may contain child
         * windows that, together with the top-level window are treated as a single
         * solid document. Since every top-level window must belong to some
         * document, its root can be found as the top-nearest window without an owner.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public static enum ModalityType {

    /**
     * Modal dialogs block all input to some top-level windows.
     * Whether a particular window is blocked depends on dialog's type
     * of modality; this is called the "scope of blocking". The
     * <code>ModalityType</code> enum specifies modal types and their
     * associated scopes.
     *
     * @see Dialog#getModalityType
     * @see Dialog#setModalityType
     * @see Toolkit#isModalityTypeSupported
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    boolean undecorated = false;

    /**
     * This field indicates whether the dialog is undecorated.
     * This property can only be changed while the dialog is not displayable.
     * <code>undecorated</code> will be true if the dialog is
     * undecorated, otherwise it will be false.
     *
     * @serial
     * @see #setUndecorated(boolean)
     * @see #isUndecorated()
     * @see Component#isDisplayable()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    boolean resizable = true;

    /**
     * A dialog's resizable property. Will be true
     * if the Dialog is to be resizable, otherwise
     * it will be false.
     *
     * @serial
     * @see #setResizable(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
public class Dialog extends Window {

/**
 * A Dialog is a top-level window with a title and a border
 * that is typically used to take some form of input from the user.
 *
 * The size of the dialog includes any area designated for the
 * border.  The dimensions of the border area can be obtained
 * using the <code>getInsets</code> method, however, since
 * these dimensions are platform-dependent, a valid insets
 * value cannot be obtained until the dialog is made displayable
 * by either calling <code>pack</code> or <code>show</code>.
 * Since the border area is included in the overall size of the
 * dialog, the border effectively obscures a portion of the dialog,
 * constraining the area available for rendering and/or displaying
 * subcomponents to the rectangle which has an upper-left corner
 * location of <code>(insets.left, insets.top)</code>, and has a size of
 * <code>width - (insets.left + insets.right)</code> by
 * <code>height - (insets.top + insets.bottom)</code>.
 * <p>
 * The default layout for a dialog is <code>BorderLayout</code>.
 * <p>
 * A dialog may have its native decorations (i.e. Frame &amp; Titlebar) turned off
 * with <code>setUndecorated</code>.  This can only be done while the dialog
 * is not {@link Component#isDisplayable() displayable}.
 * <p>
 * A dialog may have another window as its owner when it's constructed.  When
 * the owner window of a visible dialog is minimized, the dialog will
 * automatically be hidden from the user. When the owner window is subsequently
 * restored, the dialog is made visible to the user again.
 * <p>
 * In a multi-screen environment, you can create a <code>Dialog</code>
 * on a different screen device than its owner.  See {@link java.awt.Frame} for
 * more information.
 * <p>
 * A dialog can be either modeless (the default) or modal.  A modal
 * dialog is one which blocks input to some other top-level windows
 * in the application, except for any windows created with the dialog
 * as their owner. See <a href="doc-files/Modality.html">AWT Modality</a>
 * specification for details.
 * <p>
 * Dialogs are capable of generating the following
 * <code>WindowEvents</code>:
 * <code>WindowOpened</code>, <code>WindowClosing</code>,
 * <code>WindowClosed</code>, <code>WindowActivated</code>,
 * <code>WindowDeactivated</code>, <code>WindowGainedFocus</code>,
 * <code>WindowLostFocus</code>.
 *
 * @see WindowEvent
 * @see Window#addWindowListener
 *
 * @author      Sami Shaio
 * @author      Arthur van Hoff
 * @since       JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Get the state of this object.
         *
         * @return an instance of AccessibleStateSet containing the current
         * state set of the object
         * @see AccessibleState
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         * @see AccessibleRole
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    protected class AccessibleAWTDialog extends AccessibleAWTWindow

    /**
     * This class implements accessibility support for the
     * <code>Dialog</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to dialog user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this Dialog.
     * For dialogs, the AccessibleContext takes the form of an
     * AccessibleAWTDialog.
     * A new AccessibleAWTDialog instance is created if necessary.
     *
     * @return an AccessibleAWTDialog that serves as the
     *         AccessibleContext of this Dialog
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    protected String paramString() {

    /**
     * Returns a string representing the state of this dialog. This
     * method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return    the parameter string of this dialog window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public boolean isUndecorated() {

    /**
     * Indicates whether this dialog is undecorated.
     * By default, all dialogs are initially decorated.
     * @return    <code>true</code> if dialog is undecorated;
     *                        <code>false</code> otherwise.
     * @see       java.awt.Dialog#setUndecorated
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public void setUndecorated(boolean undecorated) {

    /**
     * Disables or enables decorations for this dialog.
     * <p>
     * This method can only be called while the dialog is not displayable. To
     * make this dialog decorated, it must be opaque and have the default shape,
     * otherwise the {@code IllegalComponentStateException} will be thrown.
     * Refer to {@link Window#setShape}, {@link Window#setOpacity} and {@link
     * Window#setBackground} for details
     *
     * @param  undecorated {@code true} if no dialog decorations are to be
     *         enabled; {@code false} if dialog decorations are to be enabled
     *
     * @throws IllegalComponentStateException if the dialog is displayable
     * @throws IllegalComponentStateException if {@code undecorated} is
     *      {@code false}, and this dialog does not have the default shape
     * @throws IllegalComponentStateException if {@code undecorated} is
     *      {@code false}, and this dialog opacity is less than {@code 1.0f}
     * @throws IllegalComponentStateException if {@code undecorated} is
     *      {@code false}, and the alpha value of this dialog background
     *      color is less than {@code 1.0f}
     *
     * @see    #isUndecorated
     * @see    Component#isDisplayable
     * @see    Window#getShape
     * @see    Window#getOpacity
     * @see    Window#getBackground
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public void setResizable(boolean resizable) {

    /**
     * Sets whether this dialog is resizable by the user.
     * @param     resizable <code>true</code> if the user can
     *                 resize this dialog; <code>false</code> otherwise.
     * @see       java.awt.Dialog#isResizable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public boolean isResizable() {

    /**
     * Indicates whether this dialog is resizable by the user.
     * By default, all dialogs are initially resizable.
     * @return    <code>true</code> if the user can resize the dialog;
     *            <code>false</code> otherwise.
     * @see       java.awt.Dialog#setResizable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public void toBack() {

    /**
     * {@inheritDoc}
     * <p>
     * If this dialog is modal and blocks some windows, then all of them are
     * also sent to the back to keep them below the blocking dialog.
     *
     * @see java.awt.Window#toBack
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    void doDispose() {

    /**
     * Disposes the Dialog and then causes show() to return if it is currently
     * blocked.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    @Deprecated

    /**
     * Hides the Dialog and then causes {@code show} to return if it is currently
     * blocked.
     * @see Window#show
     * @see Window#dispose
     * @see Window#setVisible(boolean)
     * @deprecated As of JDK version 1.5, replaced by
     * {@link #setVisible(boolean) setVisible(boolean)}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    @Deprecated

   /**
     * Makes the {@code Dialog} visible. If the dialog and/or its owner
     * are not yet displayable, both are made displayable.  The
     * dialog will be validated prior to being made visible.
     * If the dialog is already visible, this will bring the dialog
     * to the front.
     * <p>
     * If the dialog is modal and is not already visible, this call
     * will not return until the dialog is hidden by calling hide or
     * dispose. It is permissible to show modal dialogs from the event
     * dispatching thread because the toolkit will ensure that another
     * event pump runs while the one which invoked this method is blocked.
     * @see Component#hide
     * @see Component#isDisplayable
     * @see Component#validate
     * @see #isModal
     * @see Window#setVisible(boolean)
     * @deprecated As of JDK version 1.5, replaced by
     * {@link #setVisible(boolean) setVisible(boolean)}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public void setVisible(boolean b) {

    /**
     * Shows or hides this {@code Dialog} depending on the value of parameter
     * {@code b}.
     * @param b if {@code true}, makes the {@code Dialog} visible,
     * otherwise hides the {@code Dialog}.
     * If the dialog and/or its owner
     * are not yet displayable, both are made displayable.  The
     * dialog will be validated prior to being made visible.
     * If {@code false}, hides the {@code Dialog} and then causes {@code setVisible(true)}
     * to return if it is currently blocked.
     * <p>
     * <b>Notes for modal dialogs</b>.
     * <ul>
     * <li>{@code setVisible(true)}:  If the dialog is not already
     * visible, this call will not return until the dialog is
     * hidden by calling {@code setVisible(false)} or
     * {@code dispose}.
     * <li>{@code setVisible(false)}:  Hides the dialog and then
     * returns on {@code setVisible(true)} if it is currently blocked.
     * <li>It is OK to call this method from the event dispatching
     * thread because the toolkit ensures that other events are
     * not blocked while this method is blocked.
     * </ul>
     * @see java.awt.Window#setVisible
     * @see java.awt.Window#dispose
     * @see java.awt.Component#isDisplayable
     * @see java.awt.Component#validate
     * @see java.awt.Dialog#isModal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    private boolean conditionalShow(Component toFocus, AtomicLong time) {

    /**
     * @return true if we actually showed, false if we just called toFront()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public void setTitle(String title) {

    /**
     * Sets the title of the Dialog.
     * @param title the title displayed in the dialog's border;
         * a null value results in an empty title
     * @see #getTitle
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public String getTitle() {

    /**
     * Gets the title of the dialog. The title is displayed in the
     * dialog's border.
     * @return    the title of this dialog window. The title may be
     *            <code>null</code>.
     * @see       java.awt.Dialog#setTitle
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public void setModalityType(ModalityType type) {

    /**
     * Sets the modality type for this dialog. See {@link
     * java.awt.Dialog.ModalityType ModalityType} for possible modality types.
     * <p>
     * If the given modality type is not supported, <code>MODELESS</code>
     * is used. You may want to call <code>getModalityType()</code> after calling
     * this method to ensure that the modality type has been set.
     * <p>
     * Note: changing modality of the visible dialog may have no effect
     * until it is hidden and then shown again.
     *
     * @param type specifies whether dialog blocks input to other
     *     windows when shown. <code>null</code> value and unsupported modality
     *     types are equivalent to <code>MODELESS</code>
     * @exception SecurityException if the calling thread does not have permission
     *     to create modal dialogs with the given <code>modalityType</code>
     *
     * @see       java.awt.Dialog#getModalityType
     * @see       java.awt.Toolkit#isModalityTypeSupported
     *
     * @since     1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public ModalityType getModalityType() {

    /**
     * Returns the modality type of this dialog.
     *
     * @return modality type of this dialog
     *
     * @see java.awt.Dialog#setModalityType
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public void setModal(boolean modal) {

    /**
     * Specifies whether this dialog should be modal.
     * <p>
     * This method is obsolete and is kept for backwards compatibility only.
     * Use {@link #setModalityType setModalityType()} instead.
     * <p>
     * Note: changing modality of the visible dialog may have no effect
     * until it is hidden and then shown again.
     *
     * @param modal specifies whether dialog blocks input to other windows
     *     when shown; calling to <code>setModal(true)</code> is equivalent to
     *     <code>setModalityType(Dialog.DEFAULT_MODALITY_TYPE)</code>, and
     *     calling to <code>setModal(false)</code> is equvivalent to
     *     <code>setModalityType(Dialog.ModalityType.MODELESS)</code>
     *
     * @see       java.awt.Dialog#DEFAULT_MODALITY_TYPE
     * @see       java.awt.Dialog.ModalityType#MODELESS
     * @see       java.awt.Dialog#isModal
     * @see       java.awt.Dialog#getModalityType
     * @see       java.awt.Dialog#setModalityType
     *
     * @since     1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public boolean isModal() {

    /**
     * Indicates whether the dialog is modal.
     * <p>
     * This method is obsolete and is kept for backwards compatibility only.
     * Use {@link #getModalityType getModalityType()} instead.
     *
     * @return    <code>true</code> if this dialog window is modal;
     *            <code>false</code> otherwise
     *
     * @see       java.awt.Dialog#DEFAULT_MODALITY_TYPE
     * @see       java.awt.Dialog.ModalityType#MODELESS
     * @see       java.awt.Dialog#setModal
     * @see       java.awt.Dialog#getModalityType
     * @see       java.awt.Dialog#setModalityType
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public void addNotify() {

    /**
     * Makes this Dialog displayable by connecting it to
     * a native screen resource.  Making a dialog displayable will
     * cause any of its children to be made displayable.
     * This method is called internally by the toolkit and should
     * not be called directly by programs.
     * @see Component#isDisplayable
     * @see #removeNotify
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    String constructComponentName() {

    /**
     * Construct a name for this component.  Called by getName() when the
     * name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public Dialog(Window owner, String title, ModalityType modalityType,
                  GraphicsConfiguration gc) {

    /**
     * Constructs an initially invisible <code>Dialog</code> with the
     * specified owner <code>Window</code>, title, modality and
     * <code>GraphicsConfiguration</code>.
     *
     * @param owner the owner of the dialog. The owner must be an instance of
     *     {@link java.awt.Dialog Dialog}, {@link java.awt.Frame Frame}, any
     *     of their descendents or <code>null</code>
     * @param title the title of the dialog or <code>null</code> if this dialog
     *     has no title
     * @param modalityType specifies whether dialog blocks input to other
     *    windows when shown. <code>null</code> value and unsupported modality
     *    types are equivalent to <code>MODELESS</code>
     * @param gc the <code>GraphicsConfiguration</code> of the target screen device;
     *     if <code>null</code>, the default system <code>GraphicsConfiguration</code>
     *     is assumed
     *
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>
     *     is not an instance of {@link java.awt.Dialog Dialog} or {@link
     *     java.awt.Frame Frame}
     * @exception java.lang.IllegalArgumentException if <code>gc</code>
     *     is not from a screen device
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     * @exception SecurityException if the calling thread does not have permission
     *     to create modal dialogs with the given <code>modalityType</code>
     *
     * @see java.awt.Dialog.ModalityType
     * @see java.awt.Dialog#setModal
     * @see java.awt.Dialog#setModalityType
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see java.awt.Toolkit#isModalityTypeSupported
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public Dialog(Window owner, String title, ModalityType modalityType) {

    /**
     * Constructs an initially invisible <code>Dialog</code> with the
     * specified owner <code>Window</code>, title and modality.
     *
     * @param owner the owner of the dialog. The owner must be an instance of
     *     {@link java.awt.Dialog Dialog}, {@link java.awt.Frame Frame}, any
     *     of their descendents or <code>null</code>
     * @param title the title of the dialog or <code>null</code> if this dialog
     *     has no title
     * @param modalityType specifies whether dialog blocks input to other
     *    windows when shown. <code>null</code> value and unsupported modality
     *    types are equivalent to <code>MODELESS</code>
     *
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>
     *     is not an instance of {@link java.awt.Dialog Dialog} or {@link
     *     java.awt.Frame Frame}
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>'s
     *     <code>GraphicsConfiguration</code> is not from a screen device
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     * @exception SecurityException if the calling thread does not have permission
     *     to create modal dialogs with the given <code>modalityType</code>
     *
     * @see java.awt.Dialog.ModalityType
     * @see java.awt.Dialog#setModal
     * @see java.awt.Dialog#setModalityType
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see java.awt.Toolkit#isModalityTypeSupported
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public Dialog(Window owner, ModalityType modalityType) {

    /**
     * Constructs an initially invisible <code>Dialog</code> with the
     * specified owner <code>Window</code> and modality and an empty title.
     *
     * @param owner the owner of the dialog. The owner must be an instance of
     *    {@link java.awt.Dialog Dialog}, {@link java.awt.Frame Frame}, any
     *    of their descendents or <code>null</code>
     * @param modalityType specifies whether dialog blocks input to other
     *    windows when shown. <code>null</code> value and unsupported modality
     *    types are equivalent to <code>MODELESS</code>
     *
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>
     *    is not an instance of {@link java.awt.Dialog Dialog} or {@link
     *    java.awt.Frame Frame}
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>'s
     *    <code>GraphicsConfiguration</code> is not from a screen device
     * @exception HeadlessException when
     *    <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     * @exception SecurityException if the calling thread does not have permission
     *    to create modal dialogs with the given <code>modalityType</code>
     *
     * @see java.awt.Dialog.ModalityType
     * @see java.awt.Dialog#setModal
     * @see java.awt.Dialog#setModalityType
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see java.awt.Toolkit#isModalityTypeSupported
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public Dialog(Window owner, String title) {

    /**
     * Constructs an initially invisible, modeless <code>Dialog</code> with
     * the specified owner <code>Window</code> and title.
     *
     * @param owner the owner of the dialog. The owner must be an instance of
     *    {@link java.awt.Dialog Dialog}, {@link java.awt.Frame Frame}, any
     *    of their descendents or <code>null</code>
     * @param title the title of the dialog or <code>null</code> if this dialog
     *    has no title
     *
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>
     *    is not an instance of {@link java.awt.Dialog Dialog} or {@link
     *    java.awt.Frame Frame}
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>'s
     *    <code>GraphicsConfiguration</code> is not from a screen device
     * @exception HeadlessException when
     *    <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public Dialog(Window owner) {

    /**
     * Constructs an initially invisible, modeless <code>Dialog</code> with the
     * specified owner <code>Window</code> and an empty title.
     *
     * @param owner the owner of the dialog. The owner must be an instance of
     *     {@link java.awt.Dialog Dialog}, {@link java.awt.Frame Frame}, any
     *     of their descendents or <code>null</code>
     *
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>
     *     is not an instance of {@link java.awt.Dialog Dialog} or {@link
     *     java.awt.Frame Frame}
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>'s
     *     <code>GraphicsConfiguration</code> is not from a screen device
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
     public Dialog(Dialog owner, String title, boolean modal,
                   GraphicsConfiguration gc) {

    /**
     * Constructs an initially invisible <code>Dialog</code> with the
     * specified owner <code>Dialog</code>, title, modality and
     * <code>GraphicsConfiguration</code>.
     *
     * @param owner the owner of the dialog or <code>null</code> if this
     *     dialog has no owner
     * @param title the title of the dialog or <code>null</code> if this
     *     dialog has no title
     * @param modal specifies whether dialog blocks user input to other top-level
     *     windows when shown. If <code>false</code>, the dialog is <code>MODELESS</code>;
     *     if <code>true</code>, the modality type property is set to
     *     <code>DEFAULT_MODALITY_TYPE</code>
     * @param gc the <code>GraphicsConfiguration</code> of the target screen device;
     *     if <code>null</code>, the default system <code>GraphicsConfiguration</code>
     *     is assumed
     * @exception java.lang.IllegalArgumentException if <code>gc</code>
     *    is not from a screen device
     * @exception HeadlessException when
     *    <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     *
     * @see java.awt.Dialog.ModalityType
     * @see java.awt.Dialog.ModalityType#MODELESS
     * @see java.awt.Dialog#DEFAULT_MODALITY_TYPE
     * @see java.awt.Dialog#setModal
     * @see java.awt.Dialog#setModalityType
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see Component#setSize
     * @see Component#setVisible
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
     public Dialog(Dialog owner, String title, boolean modal) {

    /**
     * Constructs an initially invisible <code>Dialog</code> with the
     * specified owner <code>Dialog</code>, title, and modality.
     *
     * @param owner the owner of the dialog or <code>null</code> if this
     *     dialog has no owner
     * @param title the title of the dialog or <code>null</code> if this
     *     dialog has no title
     * @param modal specifies whether dialog blocks user input to other top-level
     *     windows when shown. If <code>false</code>, the dialog is <code>MODELESS</code>;
     *     if <code>true</code>, the modality type property is set to
     *     <code>DEFAULT_MODALITY_TYPE</code>
     * @exception IllegalArgumentException if the <code>owner</code>'s
     *    <code>GraphicsConfiguration</code> is not from a screen device
     * @exception HeadlessException when
     *    <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     *
     * @see java.awt.Dialog.ModalityType
     * @see java.awt.Dialog.ModalityType#MODELESS
     * @see java.awt.Dialog#DEFAULT_MODALITY_TYPE
     * @see java.awt.Dialog#setModal
     * @see java.awt.Dialog#setModalityType
     * @see java.awt.GraphicsEnvironment#isHeadless
     *
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
     public Dialog(Dialog owner, String title) {

    /**
     * Constructs an initially invisible, modeless <code>Dialog</code>
     * with the specified owner <code>Dialog</code> and title.
     *
     * @param owner the owner of the dialog or <code>null</code> if this
     *     has no owner
     * @param title the title of the dialog or <code>null</code> if this dialog
     *     has no title
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>'s
     *     <code>GraphicsConfiguration</code> is not from a screen device
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
     public Dialog(Dialog owner) {

    /**
     * Constructs an initially invisible, modeless <code>Dialog</code> with
     * the specified owner <code>Dialog</code> and an empty title.
     *
     * @param owner the owner of the dialog or <code>null</code> if this
     *     dialog has no owner
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>'s
     *     <code>GraphicsConfiguration</code> is not from a screen device
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
     public Dialog(Frame owner, String title, boolean modal,
                   GraphicsConfiguration gc) {

    /**
     * Constructs an initially invisible <code>Dialog</code> with the specified owner
     * <code>Frame</code>, title, modality, and <code>GraphicsConfiguration</code>.
     * @param owner the owner of the dialog or <code>null</code> if this dialog
     *     has no owner
     * @param title the title of the dialog or <code>null</code> if this dialog
     *     has no title
     * @param modal specifies whether dialog blocks user input to other top-level
     *     windows when shown. If <code>false</code>, the dialog is <code>MODELESS</code>;
     *     if <code>true</code>, the modality type property is set to
     *     <code>DEFAULT_MODALITY_TYPE</code>
     * @param gc the <code>GraphicsConfiguration</code> of the target screen device;
     *     if <code>null</code>, the default system <code>GraphicsConfiguration</code>
     *     is assumed
     * @exception java.lang.IllegalArgumentException if <code>gc</code>
     *     is not from a screen device
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     *
     * @see java.awt.Dialog.ModalityType
     * @see java.awt.Dialog.ModalityType#MODELESS
     * @see java.awt.Dialog#DEFAULT_MODALITY_TYPE
     * @see java.awt.Dialog#setModal
     * @see java.awt.Dialog#setModalityType
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see Component#setSize
     * @see Component#setVisible
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
     public Dialog(Frame owner, String title, boolean modal) {

    /**
     * Constructs an initially invisible <code>Dialog</code> with the
     * specified owner <code>Frame</code>, title and modality.
     *
     * @param owner the owner of the dialog or <code>null</code> if
     *     this dialog has no owner
     * @param title the title of the dialog or <code>null</code> if this dialog
     *     has no title
     * @param modal specifies whether dialog blocks user input to other top-level
     *     windows when shown. If <code>false</code>, the dialog is <code>MODELESS</code>;
     *     if <code>true</code>, the modality type property is set to
     *     <code>DEFAULT_MODALITY_TYPE</code>
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>'s
     *    <code>GraphicsConfiguration</code> is not from a screen device
     * @exception HeadlessException when
     *    <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     *
     * @see java.awt.Dialog.ModalityType
     * @see java.awt.Dialog.ModalityType#MODELESS
     * @see java.awt.Dialog#DEFAULT_MODALITY_TYPE
     * @see java.awt.Dialog#setModal
     * @see java.awt.Dialog#setModalityType
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see Component#setSize
     * @see Component#setVisible
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
     public Dialog(Frame owner, String title) {

    /**
     * Constructs an initially invisible, modeless <code>Dialog</code> with
     * the specified owner <code>Frame</code> and title.
     *
     * @param owner the owner of the dialog or <code>null</code> if
     *     this dialog has no owner
     * @param title the title of the dialog or <code>null</code> if this dialog
     *     has no title
     * @exception IllegalArgumentException if the <code>owner</code>'s
     *     <code>GraphicsConfiguration</code> is not from a screen device
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see Component#setSize
     * @see Component#setVisible
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
     public Dialog(Frame owner, boolean modal) {

    /**
     * Constructs an initially invisible <code>Dialog</code> with the specified
     * owner <code>Frame</code> and modality and an empty title.
     *
     * @param owner the owner of the dialog or <code>null</code> if
     *     this dialog has no owner
     * @param modal specifies whether dialog blocks user input to other top-level
     *     windows when shown. If <code>false</code>, the dialog is <code>MODELESS</code>;
     *     if <code>true</code>, the modality type property is set to
     *     <code>DEFAULT_MODALITY_TYPE</code>
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>'s
     *    <code>GraphicsConfiguration</code> is not from a screen device
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     *
     * @see java.awt.Dialog.ModalityType
     * @see java.awt.Dialog.ModalityType#MODELESS
     * @see java.awt.Dialog#DEFAULT_MODALITY_TYPE
     * @see java.awt.Dialog#setModal
     * @see java.awt.Dialog#setModalityType
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
     public Dialog(Frame owner) {

    /**
     * Constructs an initially invisible, modeless <code>Dialog</code> with
     * the specified owner <code>Frame</code> and an empty title.
     *
     * @param owner the owner of the dialog or <code>null</code> if
     *     this dialog has no owner
     * @exception java.lang.IllegalArgumentException if the <code>owner</code>'s
     *    <code>GraphicsConfiguration</code> is not from a screen device
     * @exception HeadlessException when
     *    <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see Component#setSize
     * @see Component#setVisible
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    String title;

    /**
     * Specifies the title of the Dialog.
     * This field can be null.
     *
     * @serial
     * @see #getTitle()
     * @see #setTitle(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
        APPLICATION_EXCLUDE,

        /**
         * <code>APPLICATION_EXCLUDE</code> indicates that a top-level window
         * won't be blocked by any application-modal dialogs. Also, it isn't
         * blocked by document-modal dialogs from outside of its child hierarchy.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public static enum ModalExclusionType {

    /**
     * Any top-level window can be marked not to be blocked by modal
     * dialogs. This is called "modal exclusion". This enum specifies
     * the possible modal exclusion types.
     *
     * @see Window#getModalExclusionType
     * @see Window#setModalExclusionType
     * @see Toolkit#isModalExclusionTypeSupported
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    ModalityType modalityType;

    /**
     * Modality type of this dialog. If the dialog's modality type is not
     * {@link Dialog.ModalityType#MODELESS ModalityType.MODELESS}, it blocks all
     * user input to some application top-level windows.
     *
     * @serial
     *
     * @see ModalityType
     * @see #getModalityType
     * @see #setModalityType
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    boolean modal;

    /**
     * True if this dialog is modal, false is the dialog is modeless.
     * A modal dialog blocks user input to some application top-level
     * windows. This field is kept only for backwards compatibility. Use the
     * {@link Dialog.ModalityType ModalityType} enum instead.
     *
     * @serial
     *
     * @see #isModal
     * @see #setModal
     * @see #getModalityType
     * @see #setModalityType
     * @see ModalityType
     * @see ModalityType#MODELESS
     * @see #DEFAULT_MODALITY_TYPE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public final static ModalityType DEFAULT_MODALITY_TYPE = ModalityType.APPLICATION_MODAL;

    /**
     * Default modality type for modal dialogs. The default modality type is
     * <code>APPLICATION_MODAL</code>. Calling the oldstyle <code>setModal(true)</code>
     * is equal to <code>setModalityType(DEFAULT_MODALITY_TYPE)</code>.
     *
     * @see java.awt.Dialog.ModalityType
     * @see java.awt.Dialog#setModal
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
        TOOLKIT_MODAL

        /**
         * A <code>TOOLKIT_MODAL</code> dialog blocks all top-level windows run
         * from the same toolkit except those from its own child hierarchy. If there
         * are several applets launched in a browser, all of them run with the same
         * toolkit; thus, a toolkit-modal dialog displayed by an applet may affect
         * other applets and all windows of the browser instance which embeds the
         * Java runtime environment for this toolkit.
         * Special <code>AWTPermission</code> "toolkitModality" must be granted to use
         * toolkit-modal dialogs. If a <code>TOOLKIT_MODAL</code> dialog is being created
         * and this permission is not granted, a <code>SecurityException</code> will be
         * thrown, and no dialog will be created. If a modality type is being changed
         * to <code>TOOLKIT_MODAL</code> and this permission is not granted, a
         * <code>SecurityException</code> will be thrown, and the modality type will
         * be left unchanged.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
        DOCUMENT_MODAL,

        /**
         * A <code>DOCUMENT_MODAL</code> dialog blocks input to all top-level windows
         * from the same document except those from its own child hierarchy.
         * A document is a top-level window without an owner. It may contain child
         * windows that, together with the top-level window are treated as a single
         * solid document. Since every top-level window must belong to some
         * document, its root can be found as the top-nearest window without an owner.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    public static enum ModalityType {

    /**
     * Modal dialogs block all input to some top-level windows.
     * Whether a particular window is blocked depends on dialog's type
     * of modality; this is called the "scope of blocking". The
     * <code>ModalityType</code> enum specifies modal types and their
     * associated scopes.
     *
     * @see Dialog#getModalityType
     * @see Dialog#setModalityType
     * @see Toolkit#isModalityTypeSupported
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    boolean undecorated = false;

    /**
     * This field indicates whether the dialog is undecorated.
     * This property can only be changed while the dialog is not displayable.
     * <code>undecorated</code> will be true if the dialog is
     * undecorated, otherwise it will be false.
     *
     * @serial
     * @see #setUndecorated(boolean)
     * @see #isUndecorated()
     * @see Component#isDisplayable()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
    boolean resizable = true;

    /**
     * A dialog's resizable property. Will be true
     * if the Dialog is to be resizable, otherwise
     * it will be false.
     *
     * @serial
     * @see #setResizable(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Dialog.java
public class Dialog extends Window {

/**
 * A Dialog is a top-level window with a title and a border
 * that is typically used to take some form of input from the user.
 *
 * The size of the dialog includes any area designated for the
 * border.  The dimensions of the border area can be obtained
 * using the <code>getInsets</code> method, however, since
 * these dimensions are platform-dependent, a valid insets
 * value cannot be obtained until the dialog is made displayable
 * by either calling <code>pack</code> or <code>show</code>.
 * Since the border area is included in the overall size of the
 * dialog, the border effectively obscures a portion of the dialog,
 * constraining the area available for rendering and/or displaying
 * subcomponents to the rectangle which has an upper-left corner
 * location of <code>(insets.left, insets.top)</code>, and has a size of
 * <code>width - (insets.left + insets.right)</code> by
 * <code>height - (insets.top + insets.bottom)</code>.
 * <p>
 * The default layout for a dialog is <code>BorderLayout</code>.
 * <p>
 * A dialog may have its native decorations (i.e. Frame &amp; Titlebar) turned off
 * with <code>setUndecorated</code>.  This can only be done while the dialog
 * is not {@link Component#isDisplayable() displayable}.
 * <p>
 * A dialog may have another window as its owner when it's constructed.  When
 * the owner window of a visible dialog is minimized, the dialog will
 * automatically be hidden from the user. When the owner window is subsequently
 * restored, the dialog is made visible to the user again.
 * <p>
 * In a multi-screen environment, you can create a <code>Dialog</code>
 * on a different screen device than its owner.  See {@link java.awt.Frame} for
 * more information.
 * <p>
 * A dialog can be either modeless (the default) or modal.  A modal
 * dialog is one which blocks input to some other top-level windows
 * in the application, except for any windows created with the dialog
 * as their owner. See <a href="doc-files/Modality.html">AWT Modality</a>
 * specification for details.
 * <p>
 * Dialogs are capable of generating the following
 * <code>WindowEvents</code>:
 * <code>WindowOpened</code>, <code>WindowClosing</code>,
 * <code>WindowClosed</code>, <code>WindowActivated</code>,
 * <code>WindowDeactivated</code>, <code>WindowGainedFocus</code>,
 * <code>WindowLostFocus</code>.
 *
 * @see WindowEvent
 * @see Window#addWindowListener
 *
 * @author      Sami Shaio
 * @author      Arthur van Hoff
 * @since       JDK1.0
 */
