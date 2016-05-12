_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
        public XSNamespaceItem getNamespaceItem() {

        /**
         * @see com.sun.org.apache.xerces.internal.xs.XSObject#getNamespaceItem()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public XSObjectList getAnnotations() {

    /**
     * Optional. Annotation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public XSIDCDefinition getRefKey() {

    /**
     * {referenced key} Required if {identity-constraint category} is keyref,
     * forbidden otherwise. An identity-constraint definition with
     * {identity-constraint category} equal to key or unique.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public StringList getFieldStrs() {

    /**
     * {fields} A non-empty list of restricted XPath ([XPath]) expressions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public String getSelectorStr() {

    /**
     * {selector} A restricted XPath ([XPath]) expression
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public short getCategory() {

    /**
     * {identity-constraint category} One of key, keyref or unique.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public String getNamespace() {

    /**
     * The namespace URI of this node, or <code>null</code> if it is
     * unspecified.  defines how a namespace URI is attached to schema
     * components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public String getName() {

    /**
     * The <code>name</code> of this <code>XSObject</code> depending on the
     * <code>XSObject</code> type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public short getType() {

    /**
     * Get the type of the object, i.e ELEMENT_DECLARATION.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public String toString() {

    /** Returns a string representation of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public Field getFieldAt(int index) {

    /** Returns the field at the specified index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public int getFieldCount() {

    /** Returns the field count. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public void addField(Field field) {

    /** Adds a field. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public Selector getSelector() {

    /** Returns the selector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public void setSelector(Selector selector) {

    /** Sets the selector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public String getIdentityConstraintName() {

    /** Returns the identity constraint name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    protected IdentityConstraint(String namespace, String identityConstraintName, String elemName) {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    protected Field[] fFields;

    /** Fields. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    protected int fFieldCount;

    /** Field count. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    protected Selector fSelector;

    /** Selector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    protected String fElementName;

    /** name of owning element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    protected String fIdentityConstraintName;

    /** Identity constraint name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    protected String fNamespace;

    /** target namespace */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    protected short type;

    /** type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
public abstract class IdentityConstraint implements XSIDCDefinition {

/**
 * Base class of Schema identity constraint.
 *
 * @xerces.internal
 *
 * @author Andy Clark, IBM
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
        public XSNamespaceItem getNamespaceItem() {

        /**
         * @see com.sun.org.apache.xerces.internal.xs.XSObject#getNamespaceItem()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public XSObjectList getAnnotations() {

    /**
     * Optional. Annotation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public XSIDCDefinition getRefKey() {

    /**
     * {referenced key} Required if {identity-constraint category} is keyref,
     * forbidden otherwise. An identity-constraint definition with
     * {identity-constraint category} equal to key or unique.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public StringList getFieldStrs() {

    /**
     * {fields} A non-empty list of restricted XPath ([XPath]) expressions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public String getSelectorStr() {

    /**
     * {selector} A restricted XPath ([XPath]) expression
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public short getCategory() {

    /**
     * {identity-constraint category} One of key, keyref or unique.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public String getNamespace() {

    /**
     * The namespace URI of this node, or <code>null</code> if it is
     * unspecified.  defines how a namespace URI is attached to schema
     * components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public String getName() {

    /**
     * The <code>name</code> of this <code>XSObject</code> depending on the
     * <code>XSObject</code> type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public short getType() {

    /**
     * Get the type of the object, i.e ELEMENT_DECLARATION.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public String toString() {

    /** Returns a string representation of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public Field getFieldAt(int index) {

    /** Returns the field at the specified index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public int getFieldCount() {

    /** Returns the field count. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public void addField(Field field) {

    /** Adds a field. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public Selector getSelector() {

    /** Returns the selector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public void setSelector(Selector selector) {

    /** Sets the selector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    public String getIdentityConstraintName() {

    /** Returns the identity constraint name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    protected IdentityConstraint(String namespace, String identityConstraintName, String elemName) {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    protected Field[] fFields;

    /** Fields. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    protected int fFieldCount;

    /** Field count. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    protected Selector fSelector;

    /** Selector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    protected String fElementName;

    /** name of owning element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    protected String fIdentityConstraintName;

    /** Identity constraint name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    protected String fNamespace;

    /** target namespace */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
    protected short type;

    /** type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/IdentityConstraint.java
public abstract class IdentityConstraint implements XSIDCDefinition {

/**
 * Base class of Schema identity constraint.
 *
 * @xerces.internal
 *
 * @author Andy Clark, IBM
 */
