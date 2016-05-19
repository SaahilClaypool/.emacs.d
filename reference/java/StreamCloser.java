_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/stream/StreamCloser.java
public class StreamCloser {

/**
 * This class provide means to properly close hanging
 * image input/output streams on VM shutdown.
 * This might be useful for proper cleanup such as removal
 * of temporary files.
 *
 * Addition of stream do not prevent it from being garbage collected
 * if no other references to it exists. Stream can be closed
 * explicitly without removal from StreamCloser queue.
 * Explicit removal from the queue only helps to save some memory.
 */
