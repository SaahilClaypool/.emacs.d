_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
    void dropComplete(boolean success);

    /**
     * signal complete
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
    void rejectDrop();

    /**
     * reject the Drop
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
    void acceptDrop(int dropAction);

    /**
     * accept the Drop
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
    void rejectDrag();

    /**
     * reject the Drag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
    void acceptDrag(int dragAction);

    /**
     * accept the Drag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
    boolean isTransferableJVMLocal();

    /**
     * @return if the DragSource Transferable is in the same JVM as the Target
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
    Transferable getTransferable() throws InvalidDnDOperationException;

    /**
     * get an input stream to the remote data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
    DataFlavor[] getTransferDataFlavors();

    /**
     * get the (remote) DataFlavors from the peer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
    DropTarget getDropTarget();

    /**
     * get the DropTarget associated with this peer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
    int getTargetActions();

    /**
     * get the current Target actions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
    void setTargetActions(int actions);

    /**
     * update the peer's notion of the Target's actions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
public interface DropTargetContextPeer {

/**
 * <p>
 * This interface is exposed by the underlying window system platform to
 * enable control of platform DnD operations
 * </p>
 *
 * @since 1.2
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
    void dropComplete(boolean success);

    /**
     * signal complete
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
    void rejectDrop();

    /**
     * reject the Drop
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
    void acceptDrop(int dropAction);

    /**
     * accept the Drop
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
    void rejectDrag();

    /**
     * reject the Drag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
    void acceptDrag(int dragAction);

    /**
     * accept the Drag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
    boolean isTransferableJVMLocal();

    /**
     * @return if the DragSource Transferable is in the same JVM as the Target
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
    Transferable getTransferable() throws InvalidDnDOperationException;

    /**
     * get an input stream to the remote data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
    DataFlavor[] getTransferDataFlavors();

    /**
     * get the (remote) DataFlavors from the peer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
    DropTarget getDropTarget();

    /**
     * get the DropTarget associated with this peer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
    int getTargetActions();

    /**
     * get the current Target actions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
    void setTargetActions(int actions);

    /**
     * update the peer's notion of the Target's actions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/peer/DropTargetContextPeer.java
public interface DropTargetContextPeer {

/**
 * <p>
 * This interface is exposed by the underlying window system platform to
 * enable control of platform DnD operations
 * </p>
 *
 * @since 1.2
 *
 */
