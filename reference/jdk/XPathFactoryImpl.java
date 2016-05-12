_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
        public void setXPathVariableResolver(XPathVariableResolver resolver) {

        /**
         * <p>Establish a default variable resolver.</p>
         *
         * <p>Any <code>XPath</code> objects constructed from this factory will use
         * the specified resolver by default.</p>
         *
         * <p>A <code>NullPointerException</code> is thrown if <code>resolver</code> is <code>null</code>.</p>
         *
         * @param resolver Variable resolver.
         *
         *  @throws NullPointerException If <code>resolver</code> is
         * <code>null</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
        public void setXPathFunctionResolver(XPathFunctionResolver resolver) {

        /**
         * <p>Establish a default function resolver.</p>
         *
         * <p>Any <code>XPath</code> objects constructed from this factory will use
         * the specified resolver by default.</p>
         *
         * <p>A <code>NullPointerException</code> is thrown if
         * <code>resolver</code> is <code>null</code>.</p>
         *
         * @param resolver XPath function resolver.
         *
         * @throws NullPointerException If <code>resolver</code> is
         * <code>null</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
            String propertyValue = (_featureManager != null) ?

            /** Check to see if the property is managed by the security manager **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
        public boolean getFeature(String name)

        /**
         * <p>Get the state of the named feature.</p>
         *
         * <p>
         * Feature names are fully qualified {@link java.net.URI}s.
         * Implementations may define their own features.
         * An {@link XPathFactoryConfigurationException} is thrown if this
         * <code>XPathFactory</code> or the <code>XPath</code>s
         * it creates cannot support the feature.
         * It is possible for an <code>XPathFactory</code> to expose a feature
         * value but be unable to change its state.
         * </p>
         *
         * @param name Feature name.
         *
         * @return State of the named feature.
         *
         * @throws XPathFactoryConfigurationException if this
         * <code>XPathFactory</code> or the <code>XPath</code>s
         *   it creates cannot support this feature.
         * @throws NullPointerException if <code>name</code> is
         * <code>null</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
        public void setFeature(String name, boolean value)

        /**
         * <p>Set a feature for this <code>XPathFactory</code> and
         * <code>XPath</code>s created by this factory.</p>
         *
         * <p>
         * Feature names are fully qualified {@link java.net.URI}s.
         * Implementations may define their own features.
         * An {@link XPathFactoryConfigurationException} is thrown if this
         * <code>XPathFactory</code> or the <code>XPath</code>s
         *  it creates cannot support the feature.
         * It is possible for an <code>XPathFactory</code> to expose a feature
         * value but be unable to change its state.
         * </p>
         *
         * <p>See {@link javax.xml.xpath.XPathFactory} for full documentation
         * of specific features.</p>
         *
         * @param name Feature name.
         * @param value Is feature state <code>true</code> or <code>false</code>.
         *
         * @throws XPathFactoryConfigurationException if this
         * <code>XPathFactory</code> or the <code>XPath</code>s
         *   it creates cannot support this feature.
         * @throws NullPointerException if <code>name</code> is
         * <code>null</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
        public javax.xml.xpath.XPath newXPath() {

        /**
         * <p>Returns a new <code>XPath</code> object using the underlying
         * object model determined when the factory was instantiated.</p>
         *
         * @return New <code>XPath</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
        public boolean isObjectModelSupported(String objectModel) {

        /**
         * <p>Is specified object model supported by this
         * <code>XPathFactory</code>?</p>
         *
         * @param objectModel Specifies the object model which the returned
         * <code>XPathFactory</code> will understand.
         *
         * @return <code>true</code> if <code>XPathFactory</code> supports
         * <code>objectModel</code>, else <code>false</code>.
         *
         * @throws NullPointerException If <code>objectModel</code> is <code>null</code>.
         * @throws IllegalArgumentException If <code>objectModel.length() == 0</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
        private boolean _useServicesMechanism = true;

        /**
         * javax.xml.xpath.XPathFactory implementation.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
        private boolean _isNotSecureProcessing = true;

        /**
         * <p>State of secure processing feature.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
        private XPathVariableResolver xPathVariableResolver = null;

        /**
         * <p>XPathVariableResolver for this XPathFactory and created XPaths</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
        private XPathFunctionResolver xPathFunctionResolver = null;

        /**
         *<p>XPathFunctionResolver for this XPathFactory and created XPaths.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
        private static final String CLASS_NAME = "XPathFactoryImpl";

        /**
         * <p>Name of class as a constant to use for debugging.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
public  class XPathFactoryImpl extends XPathFactory {

/**
 * The XPathFactory builds XPaths.
 *
 * @version $Revision: 1.11 $
 * @author  Ramesh Mandava
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
        public void setXPathVariableResolver(XPathVariableResolver resolver) {

        /**
         * <p>Establish a default variable resolver.</p>
         *
         * <p>Any <code>XPath</code> objects constructed from this factory will use
         * the specified resolver by default.</p>
         *
         * <p>A <code>NullPointerException</code> is thrown if <code>resolver</code> is <code>null</code>.</p>
         *
         * @param resolver Variable resolver.
         *
         *  @throws NullPointerException If <code>resolver</code> is
         * <code>null</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
        public void setXPathFunctionResolver(XPathFunctionResolver resolver) {

        /**
         * <p>Establish a default function resolver.</p>
         *
         * <p>Any <code>XPath</code> objects constructed from this factory will use
         * the specified resolver by default.</p>
         *
         * <p>A <code>NullPointerException</code> is thrown if
         * <code>resolver</code> is <code>null</code>.</p>
         *
         * @param resolver XPath function resolver.
         *
         * @throws NullPointerException If <code>resolver</code> is
         * <code>null</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
            String propertyValue = (_featureManager != null) ?

            /** Check to see if the property is managed by the security manager **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
        public boolean getFeature(String name)

        /**
         * <p>Get the state of the named feature.</p>
         *
         * <p>
         * Feature names are fully qualified {@link java.net.URI}s.
         * Implementations may define their own features.
         * An {@link XPathFactoryConfigurationException} is thrown if this
         * <code>XPathFactory</code> or the <code>XPath</code>s
         * it creates cannot support the feature.
         * It is possible for an <code>XPathFactory</code> to expose a feature
         * value but be unable to change its state.
         * </p>
         *
         * @param name Feature name.
         *
         * @return State of the named feature.
         *
         * @throws XPathFactoryConfigurationException if this
         * <code>XPathFactory</code> or the <code>XPath</code>s
         *   it creates cannot support this feature.
         * @throws NullPointerException if <code>name</code> is
         * <code>null</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
        public void setFeature(String name, boolean value)

        /**
         * <p>Set a feature for this <code>XPathFactory</code> and
         * <code>XPath</code>s created by this factory.</p>
         *
         * <p>
         * Feature names are fully qualified {@link java.net.URI}s.
         * Implementations may define their own features.
         * An {@link XPathFactoryConfigurationException} is thrown if this
         * <code>XPathFactory</code> or the <code>XPath</code>s
         *  it creates cannot support the feature.
         * It is possible for an <code>XPathFactory</code> to expose a feature
         * value but be unable to change its state.
         * </p>
         *
         * <p>See {@link javax.xml.xpath.XPathFactory} for full documentation
         * of specific features.</p>
         *
         * @param name Feature name.
         * @param value Is feature state <code>true</code> or <code>false</code>.
         *
         * @throws XPathFactoryConfigurationException if this
         * <code>XPathFactory</code> or the <code>XPath</code>s
         *   it creates cannot support this feature.
         * @throws NullPointerException if <code>name</code> is
         * <code>null</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
        public javax.xml.xpath.XPath newXPath() {

        /**
         * <p>Returns a new <code>XPath</code> object using the underlying
         * object model determined when the factory was instantiated.</p>
         *
         * @return New <code>XPath</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
        public boolean isObjectModelSupported(String objectModel) {

        /**
         * <p>Is specified object model supported by this
         * <code>XPathFactory</code>?</p>
         *
         * @param objectModel Specifies the object model which the returned
         * <code>XPathFactory</code> will understand.
         *
         * @return <code>true</code> if <code>XPathFactory</code> supports
         * <code>objectModel</code>, else <code>false</code>.
         *
         * @throws NullPointerException If <code>objectModel</code> is <code>null</code>.
         * @throws IllegalArgumentException If <code>objectModel.length() == 0</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
        private boolean _useServicesMechanism = true;

        /**
         * javax.xml.xpath.XPathFactory implementation.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
        private boolean _isNotSecureProcessing = true;

        /**
         * <p>State of secure processing feature.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
        private XPathVariableResolver xPathVariableResolver = null;

        /**
         * <p>XPathVariableResolver for this XPathFactory and created XPaths</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
        private XPathFunctionResolver xPathFunctionResolver = null;

        /**
         *<p>XPathFunctionResolver for this XPathFactory and created XPaths.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
        private static final String CLASS_NAME = "XPathFactoryImpl";

        /**
         * <p>Name of class as a constant to use for debugging.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathFactoryImpl.java
public  class XPathFactoryImpl extends XPathFactory {

/**
 * The XPathFactory builds XPaths.
 *
 * @version $Revision: 1.11 $
 * @author  Ramesh Mandava
 */
