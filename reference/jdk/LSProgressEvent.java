_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/ls/LSProgressEvent.java
    public int getTotalSize();

    /**
     * The total size of the document including all external resources, this
     * number might change as a document is being parsed if references to
     * more external resources are seen. A value of <code>0</code> is
     * returned if the total size cannot be determined or estimated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/ls/LSProgressEvent.java
    public int getPosition();

    /**
     * The current position in the input source, including all external
     * entities and other resources that have been read.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/ls/LSProgressEvent.java
public interface LSProgressEvent extends Event {

/**
 *  This interface represents a progress event object that notifies the
 * application about progress as a document is parsed. It extends the
 * <code>Event</code> interface defined in [<a href='http://www.w3.org/TR/2003/NOTE-DOM-Level-3-Events-20031107'>DOM Level 3 Events</a>]
 * .
 * <p> The units used for the attributes <code>position</code> and
 * <code>totalSize</code> are not specified and can be implementation and
 * input dependent.
 * <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-LS-20040407'>Document Object Model (DOM) Level 3 Load
and Save Specification</a>.
 */
