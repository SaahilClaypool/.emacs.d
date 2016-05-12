_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ScrollPanePeer.java
    void setValue(Adjustable adj, int v);

    /**
     * Sets the value for one of the scroll pane's adjustables.
     *
     * @param adj the scroll pane adjustable object
     * @param v the value to set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ScrollPanePeer.java
    void setUnitIncrement(Adjustable adj, int u);

    /**
     * Sets the unit increment of one of the scroll pane's adjustables.
     *
     * @param adj the scroll pane adjustable object
     * @param u the unit increment
     *
     * @see ScrollPaneAdjustable#setUnitIncrement(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ScrollPanePeer.java
    void childResized(int w, int h);

    /**
     * Called when the child component changes its size.
     *
     * @param w the new width of the child component
     * @param h the new height of the child component
     *
     * @see ScrollPane#layout()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ScrollPanePeer.java
    void setScrollPosition(int x, int y);

    /**
     * Sets the scroll position of the child.
     *
     * @param x the X coordinate of the scroll position
     * @param y the Y coordinate of the scroll position
     *
     * @see ScrollPane#setScrollPosition(int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ScrollPanePeer.java
    int getVScrollbarWidth();

    /**
     * Returns the width of the vertical scroll bar.
     *
     * @return the width of the vertical scroll bar
     *
     * @see ScrollPane#getVScrollbarWidth()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ScrollPanePeer.java
    int getHScrollbarHeight();

    /**
     * Returns the height of the horizontal scroll bar.
     *
     * @return the height of the horizontal scroll bar
     *
     * @see ScrollPane#getHScrollbarHeight()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ScrollPanePeer.java
public interface ScrollPanePeer extends ContainerPeer {

/**
 * The peer interface for {@link ScrollPane}.
 *
 * The peer interfaces are intended only for use in porting
 * the AWT. They are not intended for use by application
 * developers, and developers should not implement peers
 * nor invoke any of the peer methods directly on the peer
 * instances.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ScrollPanePeer.java
    void setValue(Adjustable adj, int v);

    /**
     * Sets the value for one of the scroll pane's adjustables.
     *
     * @param adj the scroll pane adjustable object
     * @param v the value to set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ScrollPanePeer.java
    void setUnitIncrement(Adjustable adj, int u);

    /**
     * Sets the unit increment of one of the scroll pane's adjustables.
     *
     * @param adj the scroll pane adjustable object
     * @param u the unit increment
     *
     * @see ScrollPaneAdjustable#setUnitIncrement(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ScrollPanePeer.java
    void childResized(int w, int h);

    /**
     * Called when the child component changes its size.
     *
     * @param w the new width of the child component
     * @param h the new height of the child component
     *
     * @see ScrollPane#layout()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ScrollPanePeer.java
    void setScrollPosition(int x, int y);

    /**
     * Sets the scroll position of the child.
     *
     * @param x the X coordinate of the scroll position
     * @param y the Y coordinate of the scroll position
     *
     * @see ScrollPane#setScrollPosition(int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ScrollPanePeer.java
    int getVScrollbarWidth();

    /**
     * Returns the width of the vertical scroll bar.
     *
     * @return the width of the vertical scroll bar
     *
     * @see ScrollPane#getVScrollbarWidth()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ScrollPanePeer.java
    int getHScrollbarHeight();

    /**
     * Returns the height of the horizontal scroll bar.
     *
     * @return the height of the horizontal scroll bar
     *
     * @see ScrollPane#getHScrollbarHeight()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ScrollPanePeer.java
public interface ScrollPanePeer extends ContainerPeer {

/**
 * The peer interface for {@link ScrollPane}.
 *
 * The peer interfaces are intended only for use in porting
 * the AWT. They are not intended for use by application
 * developers, and developers should not implement peers
 * nor invoke any of the peer methods directly on the peer
 * instances.
 */
