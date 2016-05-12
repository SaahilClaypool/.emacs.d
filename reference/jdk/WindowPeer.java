_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
    void repositionSecurityWarning();

    /**
     * Instructs the peer to update the position of the security warning.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
    void updateWindow();

    /**
     * Updates the native part of non-opaque window.
     *
     * @see Window#setBackground(Color)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
    void setOpaque(boolean isOpaque);

    /**
     * Enables the per-pixel alpha support for the window.
     *
     * @see Window#setBackground(Color)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
    void setOpacity(float opacity);

    /**
     * Sets the level of opacity for the window.
     *
     * @see Window#setOpacity(float)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
    void updateIconImages();

    /**
     * Updates the icons for the window.
     *
     * @see Window#setIconImages(java.util.List)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
    void updateMinimumSize();

    /**
     * Updates the minimum size on the peer.
     *
     * @see Window#setMinimumSize(Dimension)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
    void setModalBlocked(Dialog blocker, boolean blocked);

    /**
     * Sets if this window is blocked by a modal dialog or not.
     *
     * @param blocker the blocking modal dialog
     * @param blocked {@code true} to block the window, {@code false}
     *        to unblock it
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
    void updateFocusableWindowState();

    /**
     * Updates the window's focusable state.
     *
     * @see Window#setFocusableWindowState(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
    void updateAlwaysOnTopState();

    /**
     * Updates the window's always-on-top state.
     * Sets if the window should always stay
     * on top of all other windows or not.
     *
     * @see Window#getAlwaysOnTop()
     * @see Window#setAlwaysOnTop(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
    void toBack();

    /**
     * Makes this window the bottommost window on the desktop.
     *
     * @see Window#toBack()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
    void toFront();

    /**
     * Makes this window the topmost window on the desktop.
     *
     * @see Window#toFront()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
public interface WindowPeer extends ContainerPeer {

/**
 * The peer interface for {@link Window}.
 *
 * The peer interfaces are intended only for use in porting
 * the AWT. They are not intended for use by application
 * developers, and developers should not implement peers
 * nor invoke any of the peer methods directly on the peer
 * instances.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
    void repositionSecurityWarning();

    /**
     * Instructs the peer to update the position of the security warning.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
    void updateWindow();

    /**
     * Updates the native part of non-opaque window.
     *
     * @see Window#setBackground(Color)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
    void setOpaque(boolean isOpaque);

    /**
     * Enables the per-pixel alpha support for the window.
     *
     * @see Window#setBackground(Color)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
    void setOpacity(float opacity);

    /**
     * Sets the level of opacity for the window.
     *
     * @see Window#setOpacity(float)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
    void updateIconImages();

    /**
     * Updates the icons for the window.
     *
     * @see Window#setIconImages(java.util.List)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
    void updateMinimumSize();

    /**
     * Updates the minimum size on the peer.
     *
     * @see Window#setMinimumSize(Dimension)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
    void setModalBlocked(Dialog blocker, boolean blocked);

    /**
     * Sets if this window is blocked by a modal dialog or not.
     *
     * @param blocker the blocking modal dialog
     * @param blocked {@code true} to block the window, {@code false}
     *        to unblock it
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
    void updateFocusableWindowState();

    /**
     * Updates the window's focusable state.
     *
     * @see Window#setFocusableWindowState(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
    void updateAlwaysOnTopState();

    /**
     * Updates the window's always-on-top state.
     * Sets if the window should always stay
     * on top of all other windows or not.
     *
     * @see Window#getAlwaysOnTop()
     * @see Window#setAlwaysOnTop(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
    void toBack();

    /**
     * Makes this window the bottommost window on the desktop.
     *
     * @see Window#toBack()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
    void toFront();

    /**
     * Makes this window the topmost window on the desktop.
     *
     * @see Window#toFront()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/WindowPeer.java
public interface WindowPeer extends ContainerPeer {

/**
 * The peer interface for {@link Window}.
 *
 * The peer interfaces are intended only for use in porting
 * the AWT. They are not intended for use by application
 * developers, and developers should not implement peers
 * nor invoke any of the peer methods directly on the peer
 * instances.
 */
