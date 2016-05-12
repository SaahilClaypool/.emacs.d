_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public String toString() {

    /** Returns a string representation of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public int hashCode() {

    /** Returns a hash code for this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public String getNamespace() {

    /** Returns the namespace of the resource. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public String getExpandedSystemId() {

    /** Returns the expanded system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public String getBaseSystemId() {

    /**
     * Returns the base URI against which the literal SystemId is to be resolved.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public String getLiteralSystemId() {

    /** Returns the literal system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public String getPublicId() {

    /** Returns the public identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public void setNamespace(String namespace) {

    /** Sets the namespace of the resource. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public void setExpandedSystemId(String expandedSystemId) {

    /** Sets the expanded system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public void setBaseSystemId(String baseSystemId) {

    /** Sets the base system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public void setLiteralSystemId(String literalSystemId) {

    /** Sets the literal system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public void setPublicId(String publicId) {

    /** Sets the public identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public void clear() {

    /** Clears the values. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public void setValues(String publicId, String literalSystemId,
                          String baseSystemId, String expandedSystemId,
                          String namespace) {

    /** Sets the values of the resource identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public void setValues(String publicId, String literalSystemId,
                          String baseSystemId, String expandedSystemId) {

    /** Sets the values of the resource identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public XMLResourceIdentifierImpl(String publicId, String literalSystemId,
                                     String baseSystemId, String expandedSystemId,
                                     String namespace) {

    /**
     * Constructs a resource identifier.
     *
     * @param publicId The public identifier.
     * @param literalSystemId The literal system identifier.
     * @param baseSystemId The base system identifier.
     * @param expandedSystemId The expanded system identifier.
     * @param namespace The namespace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public XMLResourceIdentifierImpl(String publicId,
                                     String literalSystemId, String baseSystemId,
                                     String expandedSystemId) {

    /**
     * Constructs a resource identifier.
     *
     * @param publicId The public identifier.
     * @param literalSystemId The literal system identifier.
     * @param baseSystemId The base system identifier.
     * @param expandedSystemId The expanded system identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public XMLResourceIdentifierImpl() {} // <init>()

    /** Constructs an empty resource identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    protected String fNamespace;

    /** The namespace of the resource. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    protected String fExpandedSystemId;

    /** The expanded system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    protected String fBaseSystemId;

    /** The base system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    protected String fLiteralSystemId;

    /** The literal system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    protected String fPublicId;

    /** The public identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
public class XMLResourceIdentifierImpl

/**
 * The XMLResourceIdentifierImpl class is an implementation of the
 * XMLResourceIdentifier interface which defines the location identity
 * of a resource.
 *
 * @author Andy Clark
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public String toString() {

    /** Returns a string representation of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public int hashCode() {

    /** Returns a hash code for this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public String getNamespace() {

    /** Returns the namespace of the resource. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public String getExpandedSystemId() {

    /** Returns the expanded system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public String getBaseSystemId() {

    /**
     * Returns the base URI against which the literal SystemId is to be resolved.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public String getLiteralSystemId() {

    /** Returns the literal system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public String getPublicId() {

    /** Returns the public identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public void setNamespace(String namespace) {

    /** Sets the namespace of the resource. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public void setExpandedSystemId(String expandedSystemId) {

    /** Sets the expanded system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public void setBaseSystemId(String baseSystemId) {

    /** Sets the base system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public void setLiteralSystemId(String literalSystemId) {

    /** Sets the literal system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public void setPublicId(String publicId) {

    /** Sets the public identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public void clear() {

    /** Clears the values. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public void setValues(String publicId, String literalSystemId,
                          String baseSystemId, String expandedSystemId,
                          String namespace) {

    /** Sets the values of the resource identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public void setValues(String publicId, String literalSystemId,
                          String baseSystemId, String expandedSystemId) {

    /** Sets the values of the resource identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public XMLResourceIdentifierImpl(String publicId, String literalSystemId,
                                     String baseSystemId, String expandedSystemId,
                                     String namespace) {

    /**
     * Constructs a resource identifier.
     *
     * @param publicId The public identifier.
     * @param literalSystemId The literal system identifier.
     * @param baseSystemId The base system identifier.
     * @param expandedSystemId The expanded system identifier.
     * @param namespace The namespace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public XMLResourceIdentifierImpl(String publicId,
                                     String literalSystemId, String baseSystemId,
                                     String expandedSystemId) {

    /**
     * Constructs a resource identifier.
     *
     * @param publicId The public identifier.
     * @param literalSystemId The literal system identifier.
     * @param baseSystemId The base system identifier.
     * @param expandedSystemId The expanded system identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    public XMLResourceIdentifierImpl() {} // <init>()

    /** Constructs an empty resource identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    protected String fNamespace;

    /** The namespace of the resource. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    protected String fExpandedSystemId;

    /** The expanded system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    protected String fBaseSystemId;

    /** The base system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    protected String fLiteralSystemId;

    /** The literal system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
    protected String fPublicId;

    /** The public identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLResourceIdentifierImpl.java
public class XMLResourceIdentifierImpl

/**
 * The XMLResourceIdentifierImpl class is an implementation of the
 * XMLResourceIdentifier interface which defines the location identity
 * of a resource.
 *
 * @author Andy Clark
 *
 */
