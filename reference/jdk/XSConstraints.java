_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSConstraints.java
    public static void fullSchemaChecking(XSGrammarBucket grammarBucket,
            SubstitutionGroupHandler SGHandler,
            CMBuilder cmBuilder,
            XMLErrorReporter errorReporter) {

    /**
     * used to check the 3 constraints against each complex type
     * (should be each model group):
     * Unique Particle Attribution, Particle Derivation (Restriction),
     * Element Declrations Consistent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSConstraints.java
    public static Object ElementDefaultValidImmediate(XSTypeDefinition type, String value, ValidationContext context, ValidatedInfo vinfo) {

    /**
     * check whether a value is a valid default for some type
     * returns the compiled form of the value
     * The parameter value could be either a String or a ValidatedInfo object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSConstraints.java
    private static boolean checkComplexDerivation(XSComplexTypeDecl derived, XSTypeDefinition base, short block) {

    /**
     * Note: this will be a private method, and it assumes that derived is not
     *       anyType. Another method will be introduced for public use,
     *       which will call this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSConstraints.java
    private static boolean checkSimpleDerivation(XSSimpleType derived, XSSimpleType base, short block) {

    /**
     * Note: this will be a private method, and it assumes that derived is not
     *       anySimpleType, and base is not anyType. Another method will be
     *       introduced for public use, which will call this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSConstraints.java
    public static boolean checkComplexDerivationOk(XSComplexTypeDecl derived, XSTypeDefinition base, short block) {

    /**
     * check whether complex type derived is valid derived from base,
     * given a subset of {restriction, extension}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSConstraints.java
    public static boolean checkSimpleDerivationOk(XSSimpleType derived, XSTypeDefinition base, short block) {

    /**
     * check whether simple type derived is valid derived from base,
     * given a subset of {restriction, extension}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSConstraints.java
    public static boolean checkTypeDerivationOk(XSTypeDefinition derived, XSTypeDefinition base, short block) {

    /**
     * check whether derived is valid derived from base, given a subset
     * of {restriction, extension}.B
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSConstraints.java
public class XSConstraints {

/**
 * Constaints shared by traversers and validator
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 * @version $Id: XSConstraints.java,v 1.7 2010-11-01 04:39:55 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSConstraints.java
    public static void fullSchemaChecking(XSGrammarBucket grammarBucket,
            SubstitutionGroupHandler SGHandler,
            CMBuilder cmBuilder,
            XMLErrorReporter errorReporter) {

    /**
     * used to check the 3 constraints against each complex type
     * (should be each model group):
     * Unique Particle Attribution, Particle Derivation (Restriction),
     * Element Declrations Consistent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSConstraints.java
    public static Object ElementDefaultValidImmediate(XSTypeDefinition type, String value, ValidationContext context, ValidatedInfo vinfo) {

    /**
     * check whether a value is a valid default for some type
     * returns the compiled form of the value
     * The parameter value could be either a String or a ValidatedInfo object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSConstraints.java
    private static boolean checkComplexDerivation(XSComplexTypeDecl derived, XSTypeDefinition base, short block) {

    /**
     * Note: this will be a private method, and it assumes that derived is not
     *       anyType. Another method will be introduced for public use,
     *       which will call this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSConstraints.java
    private static boolean checkSimpleDerivation(XSSimpleType derived, XSSimpleType base, short block) {

    /**
     * Note: this will be a private method, and it assumes that derived is not
     *       anySimpleType, and base is not anyType. Another method will be
     *       introduced for public use, which will call this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSConstraints.java
    public static boolean checkComplexDerivationOk(XSComplexTypeDecl derived, XSTypeDefinition base, short block) {

    /**
     * check whether complex type derived is valid derived from base,
     * given a subset of {restriction, extension}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSConstraints.java
    public static boolean checkSimpleDerivationOk(XSSimpleType derived, XSTypeDefinition base, short block) {

    /**
     * check whether simple type derived is valid derived from base,
     * given a subset of {restriction, extension}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSConstraints.java
    public static boolean checkTypeDerivationOk(XSTypeDefinition derived, XSTypeDefinition base, short block) {

    /**
     * check whether derived is valid derived from base, given a subset
     * of {restriction, extension}.B
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSConstraints.java
public class XSConstraints {

/**
 * Constaints shared by traversers and validator
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 * @version $Id: XSConstraints.java,v 1.7 2010-11-01 04:39:55 joehw Exp $
 */
