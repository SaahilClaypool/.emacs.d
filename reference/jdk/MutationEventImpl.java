_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/MutationEventImpl.java
    public void initMutationEvent(String typeArg, boolean canBubbleArg,
        boolean cancelableArg, Node relatedNodeArg, String prevValueArg,
        String newValueArg, String attrNameArg, short attrChangeArg)

    /** Initialize a mutation event, or overwrite the event's current
        settings with new values of the parameters.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/MutationEventImpl.java
    public Node getRelatedNode()

    /** @return a Node related to this event, other than the target that the
        node was dispatched to. For DOMNodeRemoved, it is the node which
        was removed.
        No other uses are currently defined.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/MutationEventImpl.java
    public String getPrevValue()

    /** @return the previous string value of the Attr for DOMAttrModified events, or
        of the CharacterData node for DOMCharDataModifed events.
        Undefined for others.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/MutationEventImpl.java
    public String getNewValue()

    /** @return the new string value of the Attr for DOMAttrModified events, or
        of the CharacterData node for DOMCharDataModifed events.
        Undefined for others.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/MutationEventImpl.java
    public short getAttrChange()

    /**
     *  <code>attrChange</code> indicates the type of change which triggered
     * the DOMAttrModified event. The values can be <code>MODIFICATION</code>
     * , <code>ADDITION</code>, or <code>REMOVAL</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/MutationEventImpl.java
    public String getAttrName()

    /** @return the name of the Attr which
        changed, for DOMAttrModified events.
        Undefined for others.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/MutationEventImpl.java
public class MutationEventImpl

/**
 * @xerces.internal
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/MutationEventImpl.java
    public void initMutationEvent(String typeArg, boolean canBubbleArg,
        boolean cancelableArg, Node relatedNodeArg, String prevValueArg,
        String newValueArg, String attrNameArg, short attrChangeArg)

    /** Initialize a mutation event, or overwrite the event's current
        settings with new values of the parameters.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/MutationEventImpl.java
    public Node getRelatedNode()

    /** @return a Node related to this event, other than the target that the
        node was dispatched to. For DOMNodeRemoved, it is the node which
        was removed.
        No other uses are currently defined.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/MutationEventImpl.java
    public String getPrevValue()

    /** @return the previous string value of the Attr for DOMAttrModified events, or
        of the CharacterData node for DOMCharDataModifed events.
        Undefined for others.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/MutationEventImpl.java
    public String getNewValue()

    /** @return the new string value of the Attr for DOMAttrModified events, or
        of the CharacterData node for DOMCharDataModifed events.
        Undefined for others.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/MutationEventImpl.java
    public short getAttrChange()

    /**
     *  <code>attrChange</code> indicates the type of change which triggered
     * the DOMAttrModified event. The values can be <code>MODIFICATION</code>
     * , <code>ADDITION</code>, or <code>REMOVAL</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/MutationEventImpl.java
    public String getAttrName()

    /** @return the name of the Attr which
        changed, for DOMAttrModified events.
        Undefined for others.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/MutationEventImpl.java
public class MutationEventImpl

/**
 * @xerces.internal
 *
 */
