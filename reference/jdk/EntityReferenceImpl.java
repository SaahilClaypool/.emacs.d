_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
} // class EntityReferenceImpl

    /***
    // revisit: enable editing of Entity
    private void synchronize() {
        if (!fEnableSynchronize) {
            return;
        }
        DocumentType doctype;
        NamedNodeMap entities;
        EntityImpl entDef;
        if (null != (doctype = getOwnerDocument().getDoctype()) &&
            null != (entities = doctype.getEntities())) {

            entDef = (EntityImpl)entities.getNamedItem(getNodeName());

            // No Entity by this name. If we had a change count, reset it.
            if(null==entDef)
                entityChanges=-1;

            // If no kids availalble, wipe any pre-existing children.
            // (See discussion above.)
            // Note that we have to use the superclass to avoid recursion
            // through Synchronize.
            readOnly=false;
            if(null==entDef || !entDef.hasChildNodes())
                for(Node kid=super.getFirstChild();
                    kid!=null;
                    kid=super.getFirstChild())
                    removeChild(kid);

            // If entity's definition changed, clone its kids
            // (See discussion above.)
            if(null!=entDef && entDef.changes!=entityChanges) {
                for(Node defkid=entDef.getFirstChild();
                    defkid!=null;
                    defkid=defkid.getNextSibling()) {

                    NodeImpl newkid=(NodeImpl) defkid.cloneNode(true);
                    newkid.setReadOnly(true,true);
                    insertBefore(newkid,null);
                }
                entityChanges=entDef.changes;
            }
            readOnly=true;
        }
    }
     /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    /**

    /**
     * Enable the synchronize method which may do cloning. This method is enabled
     * when the parser is done with an EntityReference.
    /***
    // revisit: enable editing of Entity
    public void enableSynchronize(boolean enableSynchronize) {
        fEnableSynchronize= enableSynchronize;
    }
    /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    public void setReadOnly(boolean readOnly, boolean deep) {

    /**
     * NON-DOM: sets the node and its children value.
     * <P>
     * Note: make sure that entity reference and its kids could be set readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    protected void synchronizeChildren() {

    /**
     * EntityReference's children are a reflection of those defined in the
     * named Entity. This method creates them if they haven't been created yet.
     * This doesn't support editing the Entity though, since this only called
     * once for all.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    protected String getEntityRefValue (){

        /**
         * NON-DOM: compute string representation of the entity reference.
     * This method is used to retrieve a string value for an attribute node that has child nodes.
         * @return String representing a value of this entity ref. or
     *          null if any node other than EntityReference, Text is encountered
     *          during computation
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    public void setBaseURI(String uri){

    /** NON-DOM: set base uri*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    public String getBaseURI() {

    /**
     * Returns the absolute base URI of this node or null if the implementation
     * wasn't able to obtain an absolute URI. Note: If the URI is malformed, a
     * null is returned.
     *
     * @return The absolute base URI of this node or null.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    public Node cloneNode(boolean deep) {

    /** Clone node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    public String getNodeName() {

    /**
     * Returns the name of the entity referenced
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    public short getNodeType() {

    /**
     * A short integer indicating what type of node this is. The named
     * constants for this value are defined in the org.w3c.dom.Node interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    public EntityReferenceImpl(CoreDocumentImpl ownerDoc, String name) {

    /** Factory constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    //protected boolean fEnableSynchronize = false;

    /** Enable synchronize. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    //protected int entityChanges = -1;

    /** Entity changes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    protected String name;

    /** Name of Entity referenced */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    static final long serialVersionUID = -7381452955687102062L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
public class EntityReferenceImpl

/**
 * EntityReference models the XML &entityname; syntax, when used for
 * entities defined by the DOM. Entities hardcoded into XML, such as
 * character entities, should instead have been translated into text
 * by the code which generated the DOM tree.
 * <P>
 * An XML processor has the alternative of fully expanding Entities
 * into the normal document tree. If it does so, no EntityReference nodes
 * will appear.
 * <P>
 * Similarly, non-validating XML processors are not required to read
 * or process entity declarations made in the external subset or
 * declared in external parameter entities. Hence, some applications
 * may not make the replacement value available for Parsed Entities
 * of these types.
 * <P>
 * EntityReference behaves as a read-only node, and the children of
 * the EntityReference (which reflect those of the Entity, and should
 * also be read-only) give its replacement value, if any. They are
 * supposed to automagically stay in synch if the DocumentType is
 * updated with new values for the Entity.
 * <P>
 * The defined behavior makes efficient storage difficult for the DOM
 * implementor. We can't just look aside to the Entity's definition
 * in the DocumentType since those nodes have the wrong parent (unless
 * we can come up with a clever "imaginary parent" mechanism). We
 * must at least appear to clone those children... which raises the
 * issue of keeping the reference synchronized with its parent.
 * This leads me back to the "cached image of centrally defined data"
 * solution, much as I dislike it.
 * <P>
 * For now I have decided, since REC-DOM-Level-1-19980818 doesn't
 * cover this in much detail, that synchronization doesn't have to be
 * considered while the user is deep in the tree. That is, if you're
 * looking within one of the EntityReferennce's children and the Entity
 * changes, you won't be informed; instead, you will continue to access
 * the same object -- which may or may not still be part of the tree.
 * This is the same behavior that obtains elsewhere in the DOM if the
 * subtree you're looking at is deleted from its parent, so it's
 * acceptable here. (If it really bothers folks, we could set things
 * up so deleted subtrees are walked and marked invalid, but that's
 * not part of the DOM's defined behavior.)
 * <P>
 * As a result, only the EntityReference itself has to be aware of
 * changes in the Entity. And it can take advantage of the same
 * structure-change-monitoring code I implemented to support
 * DeepNodeList.
 *
 * @xerces.internal
 *
 * @author Arnaud  Le Hors, IBM
 * @author Joe Kesselman, IBM
 * @author Andy Clark, IBM
 * @author Ralf Pfeiffer, IBM
 * @since  PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
} // class EntityReferenceImpl

    /***
    // revisit: enable editing of Entity
    private void synchronize() {
        if (!fEnableSynchronize) {
            return;
        }
        DocumentType doctype;
        NamedNodeMap entities;
        EntityImpl entDef;
        if (null != (doctype = getOwnerDocument().getDoctype()) &&
            null != (entities = doctype.getEntities())) {

            entDef = (EntityImpl)entities.getNamedItem(getNodeName());

            // No Entity by this name. If we had a change count, reset it.
            if(null==entDef)
                entityChanges=-1;

            // If no kids availalble, wipe any pre-existing children.
            // (See discussion above.)
            // Note that we have to use the superclass to avoid recursion
            // through Synchronize.
            readOnly=false;
            if(null==entDef || !entDef.hasChildNodes())
                for(Node kid=super.getFirstChild();
                    kid!=null;
                    kid=super.getFirstChild())
                    removeChild(kid);

            // If entity's definition changed, clone its kids
            // (See discussion above.)
            if(null!=entDef && entDef.changes!=entityChanges) {
                for(Node defkid=entDef.getFirstChild();
                    defkid!=null;
                    defkid=defkid.getNextSibling()) {

                    NodeImpl newkid=(NodeImpl) defkid.cloneNode(true);
                    newkid.setReadOnly(true,true);
                    insertBefore(newkid,null);
                }
                entityChanges=entDef.changes;
            }
            readOnly=true;
        }
    }
     /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    /**

    /**
     * Enable the synchronize method which may do cloning. This method is enabled
     * when the parser is done with an EntityReference.
    /***
    // revisit: enable editing of Entity
    public void enableSynchronize(boolean enableSynchronize) {
        fEnableSynchronize= enableSynchronize;
    }
    /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    public void setReadOnly(boolean readOnly, boolean deep) {

    /**
     * NON-DOM: sets the node and its children value.
     * <P>
     * Note: make sure that entity reference and its kids could be set readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    protected void synchronizeChildren() {

    /**
     * EntityReference's children are a reflection of those defined in the
     * named Entity. This method creates them if they haven't been created yet.
     * This doesn't support editing the Entity though, since this only called
     * once for all.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    protected String getEntityRefValue (){

        /**
         * NON-DOM: compute string representation of the entity reference.
     * This method is used to retrieve a string value for an attribute node that has child nodes.
         * @return String representing a value of this entity ref. or
     *          null if any node other than EntityReference, Text is encountered
     *          during computation
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    public void setBaseURI(String uri){

    /** NON-DOM: set base uri*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    public String getBaseURI() {

    /**
     * Returns the absolute base URI of this node or null if the implementation
     * wasn't able to obtain an absolute URI. Note: If the URI is malformed, a
     * null is returned.
     *
     * @return The absolute base URI of this node or null.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    public Node cloneNode(boolean deep) {

    /** Clone node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    public String getNodeName() {

    /**
     * Returns the name of the entity referenced
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    public short getNodeType() {

    /**
     * A short integer indicating what type of node this is. The named
     * constants for this value are defined in the org.w3c.dom.Node interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    public EntityReferenceImpl(CoreDocumentImpl ownerDoc, String name) {

    /** Factory constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    //protected boolean fEnableSynchronize = false;

    /** Enable synchronize. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    //protected int entityChanges = -1;

    /** Entity changes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    protected String name;

    /** Name of Entity referenced */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
    static final long serialVersionUID = -7381452955687102062L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityReferenceImpl.java
public class EntityReferenceImpl

/**
 * EntityReference models the XML &entityname; syntax, when used for
 * entities defined by the DOM. Entities hardcoded into XML, such as
 * character entities, should instead have been translated into text
 * by the code which generated the DOM tree.
 * <P>
 * An XML processor has the alternative of fully expanding Entities
 * into the normal document tree. If it does so, no EntityReference nodes
 * will appear.
 * <P>
 * Similarly, non-validating XML processors are not required to read
 * or process entity declarations made in the external subset or
 * declared in external parameter entities. Hence, some applications
 * may not make the replacement value available for Parsed Entities
 * of these types.
 * <P>
 * EntityReference behaves as a read-only node, and the children of
 * the EntityReference (which reflect those of the Entity, and should
 * also be read-only) give its replacement value, if any. They are
 * supposed to automagically stay in synch if the DocumentType is
 * updated with new values for the Entity.
 * <P>
 * The defined behavior makes efficient storage difficult for the DOM
 * implementor. We can't just look aside to the Entity's definition
 * in the DocumentType since those nodes have the wrong parent (unless
 * we can come up with a clever "imaginary parent" mechanism). We
 * must at least appear to clone those children... which raises the
 * issue of keeping the reference synchronized with its parent.
 * This leads me back to the "cached image of centrally defined data"
 * solution, much as I dislike it.
 * <P>
 * For now I have decided, since REC-DOM-Level-1-19980818 doesn't
 * cover this in much detail, that synchronization doesn't have to be
 * considered while the user is deep in the tree. That is, if you're
 * looking within one of the EntityReferennce's children and the Entity
 * changes, you won't be informed; instead, you will continue to access
 * the same object -- which may or may not still be part of the tree.
 * This is the same behavior that obtains elsewhere in the DOM if the
 * subtree you're looking at is deleted from its parent, so it's
 * acceptable here. (If it really bothers folks, we could set things
 * up so deleted subtrees are walked and marked invalid, but that's
 * not part of the DOM's defined behavior.)
 * <P>
 * As a result, only the EntityReference itself has to be aware of
 * changes in the Entity. And it can take advantage of the same
 * structure-change-monitoring code I implemented to support
 * DeepNodeList.
 *
 * @xerces.internal
 *
 * @author Arnaud  Le Hors, IBM
 * @author Joe Kesselman, IBM
 * @author Andy Clark, IBM
 * @author Ralf Pfeiffer, IBM
 * @since  PR-DOM-Level-1-19980818.
 */
