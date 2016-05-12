_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/DialogPeer.java
    void blockWindows(java.util.List<Window> windows);

    /**
     * Block the specified windows. This is used for modal dialogs.
     *
     * @param windows the windows to block
     *
     * @see Dialog#modalShow()
     * @see Dialog#blockWindows()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/DialogPeer.java
    void setResizable(boolean resizeable);

    /**
     * Sets if the dialog should be resizable or not.
     *
     * @param resizeable {@code true} when the dialog should be resizable,
     *        {@code false} if not
     *
     * @see Dialog#setResizable(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/DialogPeer.java
    void setTitle(String title);

    /**
     * Sets the title on the dialog window.
     *
     * @param title the title to set
     *
     * @see Dialog#setTitle(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/DialogPeer.java
public interface DialogPeer extends WindowPeer {

/**
 * The peer interface for {@link Dialog}. This adds a couple of dialog specific
 * features to the {@link WindowPeer} interface.
 *
 * The peer interfaces are intended only for use in porting
 * the AWT. They are not intended for use by application
 * developers, and developers should not implement peers
 * nor invoke any of the peer methods directly on the peer
 * instances.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/DialogPeer.java
    void blockWindows(java.util.List<Window> windows);

    /**
     * Block the specified windows. This is used for modal dialogs.
     *
     * @param windows the windows to block
     *
     * @see Dialog#modalShow()
     * @see Dialog#blockWindows()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/DialogPeer.java
    void setResizable(boolean resizeable);

    /**
     * Sets if the dialog should be resizable or not.
     *
     * @param resizeable {@code true} when the dialog should be resizable,
     *        {@code false} if not
     *
     * @see Dialog#setResizable(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/DialogPeer.java
    void setTitle(String title);

    /**
     * Sets the title on the dialog window.
     *
     * @param title the title to set
     *
     * @see Dialog#setTitle(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/DialogPeer.java
public interface DialogPeer extends WindowPeer {

/**
 * The peer interface for {@link Dialog}. This adds a couple of dialog specific
 * features to the {@link WindowPeer} interface.
 *
 * The peer interfaces are intended only for use in porting
 * the AWT. They are not intended for use by application
 * developers, and developers should not implement peers
 * nor invoke any of the peer methods directly on the peer
 * instances.
 */
