_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/FramePeer.java
    void emulateActivation(boolean activate);

    /**
     * Requests the peer to emulate window activation.
     *
     * @param activate activate or deactivate the window
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/FramePeer.java
    // TODO: This is only used in EmbeddedFrame, and should probably be moved

    /**
     * Returns the size and location for embedded frames. (On embedded frames,
     * setLocation() and setBounds() always set the frame to (0,0) for
     * backwards compatibility.
     *
     * @return the bounds of an embedded frame
     *
     * @see EmbeddedFrame#getBoundsPrivate()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/FramePeer.java
    // TODO: This is only used in EmbeddedFrame, and should probably be moved

    /**
     * Sets the size and location for embedded frames. (On embedded frames,
     * setLocation() and setBounds() always set the frame to (0,0) for
     * backwards compatibility.
     *
     * @param x the X location
     * @param y the Y location
     * @param width the width of the frame
     * @param height the height of the frame
     *
     * @see EmbeddedFrame#setBoundsPrivate(int, int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/FramePeer.java
    void setMaximizedBounds(Rectangle bounds);

    /**
     * Sets the bounds of the frame when it becomes maximized.
     *
     * @param bounds the maximized bounds of the frame
     *
     * @see Frame#setMaximizedBounds(Rectangle)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/FramePeer.java
    int getState();

    /**
     * Returns the current state of the frame.
     *
     * @return the current state of the frame
     *
     * @see Frame#getExtendedState()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/FramePeer.java
    void setState(int state);

    /**
     * Changes the state of the frame.
     *
     * @param state the new state
     *
     * @see Frame#setExtendedState(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/FramePeer.java
    void setResizable(boolean resizeable);

    /**
     * Sets if the frame should be resizable or not.
     *
     * @param resizeable {@code true} when the frame should be resizable,
     *        {@code false} if not
     *
     * @see Frame#setResizable(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/FramePeer.java
    void setMenuBar(MenuBar mb);

    /**
     * Sets the menu bar for the frame.
     *
     * @param mb the menu bar to set
     *
     * @see Frame#setMenuBar(MenuBar)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/FramePeer.java
    void setTitle(String title);

    /**
     * Sets the title on the frame.
     *
     * @param title the title to set
     *
     * @see Frame#setTitle(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/FramePeer.java
public interface FramePeer extends WindowPeer {

/**
 * The peer interface for {@link Frame}. This adds a couple of frame specific
 * methods to the {@link WindowPeer} interface.
 *
 * The peer interfaces are intended only for use in porting
 * the AWT. They are not intended for use by application
 * developers, and developers should not implement peers
 * nor invoke any of the peer methods directly on the peer
 * instances.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/FramePeer.java
    void emulateActivation(boolean activate);

    /**
     * Requests the peer to emulate window activation.
     *
     * @param activate activate or deactivate the window
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/FramePeer.java
    // TODO: This is only used in EmbeddedFrame, and should probably be moved

    /**
     * Returns the size and location for embedded frames. (On embedded frames,
     * setLocation() and setBounds() always set the frame to (0,0) for
     * backwards compatibility.
     *
     * @return the bounds of an embedded frame
     *
     * @see EmbeddedFrame#getBoundsPrivate()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/FramePeer.java
    // TODO: This is only used in EmbeddedFrame, and should probably be moved

    /**
     * Sets the size and location for embedded frames. (On embedded frames,
     * setLocation() and setBounds() always set the frame to (0,0) for
     * backwards compatibility.
     *
     * @param x the X location
     * @param y the Y location
     * @param width the width of the frame
     * @param height the height of the frame
     *
     * @see EmbeddedFrame#setBoundsPrivate(int, int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/FramePeer.java
    void setMaximizedBounds(Rectangle bounds);

    /**
     * Sets the bounds of the frame when it becomes maximized.
     *
     * @param bounds the maximized bounds of the frame
     *
     * @see Frame#setMaximizedBounds(Rectangle)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/FramePeer.java
    int getState();

    /**
     * Returns the current state of the frame.
     *
     * @return the current state of the frame
     *
     * @see Frame#getExtendedState()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/FramePeer.java
    void setState(int state);

    /**
     * Changes the state of the frame.
     *
     * @param state the new state
     *
     * @see Frame#setExtendedState(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/FramePeer.java
    void setResizable(boolean resizeable);

    /**
     * Sets if the frame should be resizable or not.
     *
     * @param resizeable {@code true} when the frame should be resizable,
     *        {@code false} if not
     *
     * @see Frame#setResizable(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/FramePeer.java
    void setMenuBar(MenuBar mb);

    /**
     * Sets the menu bar for the frame.
     *
     * @param mb the menu bar to set
     *
     * @see Frame#setMenuBar(MenuBar)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/FramePeer.java
    void setTitle(String title);

    /**
     * Sets the title on the frame.
     *
     * @param title the title to set
     *
     * @see Frame#setTitle(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/FramePeer.java
public interface FramePeer extends WindowPeer {

/**
 * The peer interface for {@link Frame}. This adds a couple of frame specific
 * methods to the {@link WindowPeer} interface.
 *
 * The peer interfaces are intended only for use in porting
 * the AWT. They are not intended for use by application
 * developers, and developers should not implement peers
 * nor invoke any of the peer methods directly on the peer
 * instances.
 */
