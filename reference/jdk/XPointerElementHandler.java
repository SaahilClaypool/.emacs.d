_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    /////   START OF IMPLEMTATION OF XMLDocumentHandler methods //////////

    ///////////  END TOKEN PLAYGROUND ///////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    //////////// Tokens Playground ///////////////////

    ///////////End Implementation of XPointerSchema Methods //////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public String getXPointerSchemaPointer(){

    /**
     * Return the XPointer Schema.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public void setXPointerSchemaPointer(String content){

    /**
     * Content of the XPointer Schema. Xpath to be resolved.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public Object getParent(){

    /**
     * return the Parent Contenthandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public void setParent(Object parent){

    /**
     * Parent Contenhandler for the this contenthandler.
     * // not sure about the parameter type. It can be Contenthandler instead of Object type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public String getXpointerSchemaName(){

    /**
     * Return  Schema Name  eg element , xpointer
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public void setXPointerSchemaName(String schemaName){

    /**
     * set the Schema Name  eg element , xpointer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    /////////////// Implementation of XPointerSchema Methods //////////////////////

    ///////   END OF IMPLENTATION OF XMLDOCUMENTSOURCE INTERFACE ///////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    //////// START OF  IMPLEMENTATION OF XMLDOCUMENTSOURCE INTERFACE /////////

    ///////// END OF IMPLEMENTATION  OF XMLComponents methods. //////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public Object getPropertyDefault(String propertyId) {

    /**
     * Returns the default state for a property, or null if this
     * component does not want to report a default value for this
     * property.
     *
     * @param propertyId The property identifier.
     *
     * @since Xerces 2.2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public Boolean getFeatureDefault(String featureId) {

    /**
     * Returns the default state for a feature, or null if this
     * component does not want to report a default value for this
     * feature.
     *
     * @param featureId The feature identifier.
     *
     * @since Xerces 2.2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public void setProperty(String propertyId, Object value)

    /**
     * Sets the value of a property. This method is called by the component
     * manager any time after reset when a property changes value.
     * <p>
     * <strong>Note:</strong> Components should silently ignore properties
     * that do not affect the operation of the component.
     *
     * @param propertyId The property identifier.
     * @param value      The value of the property.
     *
     * @throws SAXNotRecognizedException The component should not throw
     *                                   this exception.
     * @throws SAXNotSupportedException The component should not throw
     *                                  this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public String[] getRecognizedProperties() {

    /**
     * Returns a list of property identifiers that are recognized by
     * this component. This method may return null if no properties
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public void setFeature(String featureId, boolean state)

    /**
     * Sets the state of a feature. This method is called by the component
     * manager any time after reset when a feature changes state.
     * <p>
     * <strong>Note:</strong> Components should silently ignore features
     * that do not affect the operation of the component.
     *
     * @param featureId The feature identifier.
     * @param state     The state of the feature.
     *
     * @throws SAXNotRecognizedException The component should not throw
     *                                   this exception.
     * @throws SAXNotSupportedException The component should not throw
     *                                  this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public String[] getRecognizedFeatures() {

    /**
     * Returns a list of feature identifiers that are recognized by
     * this component. This method may return null if no features
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public void reset(){

    // START OF IMPLEMENTATION OF XMLComponent methods //////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    private static final Object[] PROPERTY_DEFAULTS = { null, null, null,null };

    /** Property defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    private static final String[] RECOGNIZED_PROPERTIES =

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    private static final Boolean[] FEATURE_DEFAULTS = {

    /** Feature defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    private static final String[] RECOGNIZED_FEATURES = {

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    protected static final String ENTITY_RESOLVER =

    /** Property identifier: grammar pool . */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    protected static final String GRAMMAR_POOL =

    /** Property identifier: grammar pool . */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
public class XPointerElementHandler implements XPointerSchema {

/**
 * @author Arun Yadav, Sun Microsystem
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    /////   START OF IMPLEMTATION OF XMLDocumentHandler methods //////////

    ///////////  END TOKEN PLAYGROUND ///////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    //////////// Tokens Playground ///////////////////

    ///////////End Implementation of XPointerSchema Methods //////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public String getXPointerSchemaPointer(){

    /**
     * Return the XPointer Schema.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public void setXPointerSchemaPointer(String content){

    /**
     * Content of the XPointer Schema. Xpath to be resolved.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public Object getParent(){

    /**
     * return the Parent Contenthandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public void setParent(Object parent){

    /**
     * Parent Contenhandler for the this contenthandler.
     * // not sure about the parameter type. It can be Contenthandler instead of Object type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public String getXpointerSchemaName(){

    /**
     * Return  Schema Name  eg element , xpointer
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public void setXPointerSchemaName(String schemaName){

    /**
     * set the Schema Name  eg element , xpointer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    /////////////// Implementation of XPointerSchema Methods //////////////////////

    ///////   END OF IMPLENTATION OF XMLDOCUMENTSOURCE INTERFACE ///////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    //////// START OF  IMPLEMENTATION OF XMLDOCUMENTSOURCE INTERFACE /////////

    ///////// END OF IMPLEMENTATION  OF XMLComponents methods. //////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public Object getPropertyDefault(String propertyId) {

    /**
     * Returns the default state for a property, or null if this
     * component does not want to report a default value for this
     * property.
     *
     * @param propertyId The property identifier.
     *
     * @since Xerces 2.2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public Boolean getFeatureDefault(String featureId) {

    /**
     * Returns the default state for a feature, or null if this
     * component does not want to report a default value for this
     * feature.
     *
     * @param featureId The feature identifier.
     *
     * @since Xerces 2.2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public void setProperty(String propertyId, Object value)

    /**
     * Sets the value of a property. This method is called by the component
     * manager any time after reset when a property changes value.
     * <p>
     * <strong>Note:</strong> Components should silently ignore properties
     * that do not affect the operation of the component.
     *
     * @param propertyId The property identifier.
     * @param value      The value of the property.
     *
     * @throws SAXNotRecognizedException The component should not throw
     *                                   this exception.
     * @throws SAXNotSupportedException The component should not throw
     *                                  this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public String[] getRecognizedProperties() {

    /**
     * Returns a list of property identifiers that are recognized by
     * this component. This method may return null if no properties
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public void setFeature(String featureId, boolean state)

    /**
     * Sets the state of a feature. This method is called by the component
     * manager any time after reset when a feature changes state.
     * <p>
     * <strong>Note:</strong> Components should silently ignore features
     * that do not affect the operation of the component.
     *
     * @param featureId The feature identifier.
     * @param state     The state of the feature.
     *
     * @throws SAXNotRecognizedException The component should not throw
     *                                   this exception.
     * @throws SAXNotSupportedException The component should not throw
     *                                  this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public String[] getRecognizedFeatures() {

    /**
     * Returns a list of feature identifiers that are recognized by
     * this component. This method may return null if no features
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    public void reset(){

    // START OF IMPLEMENTATION OF XMLComponent methods //////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    private static final Object[] PROPERTY_DEFAULTS = { null, null, null,null };

    /** Property defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    private static final String[] RECOGNIZED_PROPERTIES =

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    private static final Boolean[] FEATURE_DEFAULTS = {

    /** Feature defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    private static final String[] RECOGNIZED_FEATURES = {

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    protected static final String ENTITY_RESOLVER =

    /** Property identifier: grammar pool . */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    protected static final String GRAMMAR_POOL =

    /** Property identifier: grammar pool . */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XPointerElementHandler.java
public class XPointerElementHandler implements XPointerSchema {

/**
 * @author Arun Yadav, Sun Microsystem
 */
