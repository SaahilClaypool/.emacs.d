_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
    static String capitalize(String name) {

    /**
     * Reverse operation for java.beans.Introspector.decapitalize.  For any s,
     * capitalize(decapitalize(s)).equals(s).  The reverse is not true:
     * e.g. capitalize("uRL") produces "URL" which is unchanged by
     * decapitalize.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
    public static String decapitalize(String name) {

    /**
     * Utility method to take a string and convert it to normal Java variable
     * name capitalization.  This normally means converting the first
     * character from upper case to lower case, but in the (unusual) special
     * case when there is more than one character and both the first and
     * second characters are upper case, we leave it alone.
     * <p>
     * Thus "FooBah" becomes "fooBah" and "X" becomes "x", but "URL" stays
     * as "URL".
     *
     * @param  name The string to be decapitalized.
     * @return  The decapitalized version of the string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
    private static final class CompositeBuilderViaProxy

    /** Builder for when the target class is an interface and contains
        no methods other than getters.  Then we can make an instance
        using a dynamic proxy that forwards the getters to the source
        CompositeData.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
    private static final class CompositeBuilderViaConstructor

    /** Builder for when the target class has a constructor that is
        annotated with @ConstructorProperties so we can see the correspondence
        to getters.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
    private static class CompositeBuilderViaSetters extends CompositeBuilder {

    /** Builder for when the target class has a setter for every getter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
    private static class CompositeBuilderCheckGetters extends CompositeBuilder {

    /** This builder never actually returns success.  It simply serves
        to check whether the other builders in the same group have any
        chance of success.  If any getter in the targetClass returns
        a type that we don't know how to reconstruct, then we will
        not be able to make a builder, and there is no point in repeating
        the error about the problematic getter as many times as there are
        candidate builders.  Instead, the "applicable" method will return
        an explanatory string, and the other builders will be skipped.
        If all the getters are OK, then the "applicable" method will return
        an empty string and the other builders will be tried.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
    private static final class CompositeBuilderViaFrom

    /** Builder for when the target class has a method "public static
        from(CompositeData)".  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
        Throwable possibleCause() {

        /** If the subclass returns an explanation of why it is not applicable,
            it can additionally indicate an exception with details.  This is
            potentially confusing, because the real problem could be that one
            of the other subclasses is supposed to be applicable but isn't.
            But the advantage of less information loss probably outweighs the
            disadvantage of possible confusion.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
        abstract String applicable(Method[] getters)

        /** If the subclass is appropriate for targetClass, then the
            method returns null.  If the subclass is not appropriate,
            then the method returns an explanation of why not.  If the
            subclass should be appropriate but there is a problem,
            then the method throws InvalidObjectException.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
    private static abstract class CompositeBuilder {

    /** Converts from a CompositeData to an instance of the targetClass.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
        private synchronized void makeCompositeBuilder()

        /** Determine how to convert back from the CompositeData into
            the original Java type.  For a type that is not reconstructible,
            this method will fail every time, and will throw the right
            exception. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
        private final MXBeanMapping elementMapping;

        /**
         * DefaultMXBeanMappingFactory for the elements of this array.  If this is an
         *          array of arrays, the converter converts the second-level arrays,
         *          not the deepest elements.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
    @Override

    /** Get the converter for the given Java type, creating it if necessary. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
    private static final List<MXBeanMapping> permanentMappings = newList();

    /** Following List simply serves to keep a reference to predefined
        MXBeanMappings so they don't get garbage collected. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
        boolean isIdentity() {

        /**
         * <p>True if and only if this MXBeanMapping's toOpenValue and
         * fromOpenValue methods are the identity function.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
public class DefaultMXBeanMappingFactory extends MXBeanMappingFactory {

/**
 *   <p>A converter between Java types and the limited set of classes
 *   defined by Open MBeans.</p>
 *
 *   <p>A Java type is an instance of java.lang.reflect.Type.  For our
 *   purposes, it is either a Class, such as String.class or int.class;
 *   or a ParameterizedType, such as List<String> or Map<Integer,
 *   String[]>.  On J2SE 1.4 and earlier, it can only be a Class.</p>
 *
 *   <p>Each Type is associated with an DefaultMXBeanMappingFactory.  The
 *   DefaultMXBeanMappingFactory defines an OpenType corresponding to the Type, plus a
 *   Java class corresponding to the OpenType.  For example:</p>
 *
 *   <pre>
 *   Type                     Open class     OpenType
 *   ----                     ----------     --------
 *   Integer                Integer        SimpleType.INTEGER
 *   int                            int            SimpleType.INTEGER
 *   Integer[]              Integer[]      ArrayType(1, SimpleType.INTEGER)
 *   int[]                  Integer[]      ArrayType(SimpleType.INTEGER, true)
 *   String[][]             String[][]     ArrayType(2, SimpleType.STRING)
 *   List<String>                   String[]       ArrayType(1, SimpleType.STRING)
 *   ThreadState (an Enum)    String         SimpleType.STRING
 *   Map<Integer, String[]>   TabularData          TabularType(
 *                                           CompositeType(
 *                                             {"key", SimpleType.INTEGER},
 *                                             {"value",
 *                                               ArrayType(1,
 *                                                SimpleType.STRING)}),
 *                                           indexNames={"key"})
 *   </pre>
 *
 *   <p>Apart from simple types, arrays, and collections, Java types are
 *   converted through introspection into CompositeType.  The Java type
 *   must have at least one getter (method such as "int getSize()" or
 *   "boolean isBig()"), and we must be able to deduce how to
 *   reconstruct an instance of the Java class from the values of the
 *   getters using one of various heuristics.</p>
 *
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
    static String capitalize(String name) {

    /**
     * Reverse operation for java.beans.Introspector.decapitalize.  For any s,
     * capitalize(decapitalize(s)).equals(s).  The reverse is not true:
     * e.g. capitalize("uRL") produces "URL" which is unchanged by
     * decapitalize.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
    public static String decapitalize(String name) {

    /**
     * Utility method to take a string and convert it to normal Java variable
     * name capitalization.  This normally means converting the first
     * character from upper case to lower case, but in the (unusual) special
     * case when there is more than one character and both the first and
     * second characters are upper case, we leave it alone.
     * <p>
     * Thus "FooBah" becomes "fooBah" and "X" becomes "x", but "URL" stays
     * as "URL".
     *
     * @param  name The string to be decapitalized.
     * @return  The decapitalized version of the string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
    private static final class CompositeBuilderViaProxy

    /** Builder for when the target class is an interface and contains
        no methods other than getters.  Then we can make an instance
        using a dynamic proxy that forwards the getters to the source
        CompositeData.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
    private static final class CompositeBuilderViaConstructor

    /** Builder for when the target class has a constructor that is
        annotated with @ConstructorProperties so we can see the correspondence
        to getters.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
    private static class CompositeBuilderViaSetters extends CompositeBuilder {

    /** Builder for when the target class has a setter for every getter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
    private static class CompositeBuilderCheckGetters extends CompositeBuilder {

    /** This builder never actually returns success.  It simply serves
        to check whether the other builders in the same group have any
        chance of success.  If any getter in the targetClass returns
        a type that we don't know how to reconstruct, then we will
        not be able to make a builder, and there is no point in repeating
        the error about the problematic getter as many times as there are
        candidate builders.  Instead, the "applicable" method will return
        an explanatory string, and the other builders will be skipped.
        If all the getters are OK, then the "applicable" method will return
        an empty string and the other builders will be tried.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
    private static final class CompositeBuilderViaFrom

    /** Builder for when the target class has a method "public static
        from(CompositeData)".  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
        Throwable possibleCause() {

        /** If the subclass returns an explanation of why it is not applicable,
            it can additionally indicate an exception with details.  This is
            potentially confusing, because the real problem could be that one
            of the other subclasses is supposed to be applicable but isn't.
            But the advantage of less information loss probably outweighs the
            disadvantage of possible confusion.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
        abstract String applicable(Method[] getters)

        /** If the subclass is appropriate for targetClass, then the
            method returns null.  If the subclass is not appropriate,
            then the method returns an explanation of why not.  If the
            subclass should be appropriate but there is a problem,
            then the method throws InvalidObjectException.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
    private static abstract class CompositeBuilder {

    /** Converts from a CompositeData to an instance of the targetClass.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
        private synchronized void makeCompositeBuilder()

        /** Determine how to convert back from the CompositeData into
            the original Java type.  For a type that is not reconstructible,
            this method will fail every time, and will throw the right
            exception. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
        private final MXBeanMapping elementMapping;

        /**
         * DefaultMXBeanMappingFactory for the elements of this array.  If this is an
         *          array of arrays, the converter converts the second-level arrays,
         *          not the deepest elements.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
    @Override

    /** Get the converter for the given Java type, creating it if necessary. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
    private static final List<MXBeanMapping> permanentMappings = newList();

    /** Following List simply serves to keep a reference to predefined
        MXBeanMappings so they don't get garbage collected. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
        boolean isIdentity() {

        /**
         * <p>True if and only if this MXBeanMapping's toOpenValue and
         * fromOpenValue methods are the identity function.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/DefaultMXBeanMappingFactory.java
public class DefaultMXBeanMappingFactory extends MXBeanMappingFactory {

/**
 *   <p>A converter between Java types and the limited set of classes
 *   defined by Open MBeans.</p>
 *
 *   <p>A Java type is an instance of java.lang.reflect.Type.  For our
 *   purposes, it is either a Class, such as String.class or int.class;
 *   or a ParameterizedType, such as List<String> or Map<Integer,
 *   String[]>.  On J2SE 1.4 and earlier, it can only be a Class.</p>
 *
 *   <p>Each Type is associated with an DefaultMXBeanMappingFactory.  The
 *   DefaultMXBeanMappingFactory defines an OpenType corresponding to the Type, plus a
 *   Java class corresponding to the OpenType.  For example:</p>
 *
 *   <pre>
 *   Type                     Open class     OpenType
 *   ----                     ----------     --------
 *   Integer                Integer        SimpleType.INTEGER
 *   int                            int            SimpleType.INTEGER
 *   Integer[]              Integer[]      ArrayType(1, SimpleType.INTEGER)
 *   int[]                  Integer[]      ArrayType(SimpleType.INTEGER, true)
 *   String[][]             String[][]     ArrayType(2, SimpleType.STRING)
 *   List<String>                   String[]       ArrayType(1, SimpleType.STRING)
 *   ThreadState (an Enum)    String         SimpleType.STRING
 *   Map<Integer, String[]>   TabularData          TabularType(
 *                                           CompositeType(
 *                                             {"key", SimpleType.INTEGER},
 *                                             {"value",
 *                                               ArrayType(1,
 *                                                SimpleType.STRING)}),
 *                                           indexNames={"key"})
 *   </pre>
 *
 *   <p>Apart from simple types, arrays, and collections, Java types are
 *   converted through introspection into CompositeType.  The Java type
 *   must have at least one getter (method such as "int getSize()" or
 *   "boolean isBig()"), and we must be able to deduce how to
 *   reconstruct an instance of the Java class from the values of the
 *   getters using one of various heuristics.</p>
 *
 * @since 1.6
 */
