_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//package-info.java
package java.lang;

/**
 * Provides classes that are fundamental to the design of the Java
 * programming language. The most important classes are {@code
 * Object}, which is the root of the class hierarchy, and {@code
 * Class}, instances of which represent classes at run time.
 *
 * <p>Frequently it is necessary to represent a value of primitive
 * type as if it were an object. The wrapper classes {@code Boolean},
 * {@code Character}, {@code Integer}, {@code Long}, {@code Float},
 * and {@code Double} serve this purpose.  An object of type {@code
 * Double}, for example, contains a field whose type is double,
 * representing that value in such a way that a reference to it can be
 * stored in a variable of reference type.  These classes also provide
 * a number of methods for converting among primitive values, as well
 * as supporting such standard methods as equals and hashCode.  The
 * {@code Void} class is a non-instantiable class that holds a
 * reference to a {@code Class} object representing the type void.
 *
 * <p>The class {@code Math} provides commonly used mathematical
 * functions such as sine, cosine, and square root. The classes {@code
 * String}, {@code StringBuffer}, and {@code StringBuilder} similarly
 * provide commonly used operations on character strings.
 *
 * <p>Classes {@code ClassLoader}, {@code Process}, {@code
 * ProcessBuilder}, {@code Runtime}, {@code SecurityManager}, and
 * {@code System} provide "system operations" that manage the dynamic
 * loading of classes, creation of external processes, host
 * environment inquiries such as the time of day, and enforcement of
 * security policies.
 *
 * <p>Class {@code Throwable} encompasses objects that may be thrown
 * by the {@code throw} statement. Subclasses of {@code Throwable}
 * represent errors and exceptions.
 *
 * <a name="charenc"></a>
 * <h3>Character Encodings</h3>
 *
 * The specification of the {@link java.nio.charset.Charset
 * java.nio.charset.Charset} class describes the naming conventions
 * for character encodings as well as the set of standard encodings
 * that must be supported by every implementation of the Java
 * platform.
 *
 * @since JDK1.0
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//annotation/package-info.java
package java.lang.annotation;

/**
 * Provides library support for the Java programming language
 * annotation facility.
 *
 * @author Josh Bloch
 * @since 1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/package-info.java
package java.lang.invoke;

/**
 * The {@code java.lang.invoke} package contains dynamic language support provided directly by
 * the Java core class libraries and virtual machine.
 *
 * <p>
 * As described in the Java Virtual Machine Specification,
 * certain types in this package have special relations to dynamic
 * language support in the virtual machine:
 * <ul>
 * <li>The class {@link java.lang.invoke.MethodHandle MethodHandle} contains
 * <a href="MethodHandle.html#sigpoly">signature polymorphic methods</a>
 * which can be linked regardless of their type descriptor.
 * Normally, method linkage requires exact matching of type descriptors.
 * </li>
 *
 * <li>The JVM bytecode format supports immediate constants of
 * the classes {@link java.lang.invoke.MethodHandle MethodHandle} and {@link java.lang.invoke.MethodType MethodType}.
 * </li>
 * </ul>
 *
 * <h1><a name="jvm_mods"></a>Summary of relevant Java Virtual Machine changes</h1>
 * The following low-level information summarizes relevant parts of the
 * Java Virtual Machine specification.  For full details, please see the
 * current version of that specification.
 *
 * Each occurrence of an {@code invokedynamic} instruction is called a <em>dynamic call site</em>.
 * <h2><a name="indyinsn"></a>{@code invokedynamic} instructions</h2>
 * A dynamic call site is originally in an unlinked state.  In this state, there is
 * no target method for the call site to invoke.
 * <p>
 * Before the JVM can execute a dynamic call site (an {@code invokedynamic} instruction),
 * the call site must first be <em>linked</em>.
 * Linking is accomplished by calling a <em>bootstrap method</em>
 * which is given the static information content of the call site,
 * and which must produce a {@link java.lang.invoke.MethodHandle method handle}
 * that gives the behavior of the call site.
 * <p>
 * Each {@code invokedynamic} instruction statically specifies its own
 * bootstrap method as a constant pool reference.
 * The constant pool reference also specifies the call site's name and type descriptor,
 * just like {@code invokevirtual} and the other invoke instructions.
 * <p>
 * Linking starts with resolving the constant pool entry for the
 * bootstrap method, and resolving a {@link java.lang.invoke.MethodType MethodType} object for
 * the type descriptor of the dynamic call site.
 * This resolution process may trigger class loading.
 * It may therefore throw an error if a class fails to load.
 * This error becomes the abnormal termination of the dynamic
 * call site execution.
 * Linkage does not trigger class initialization.
 * <p>
 * The bootstrap method is invoked on at least three values:
 * <ul>
 * <li>a {@code MethodHandles.Lookup}, a lookup object on the <em>caller class</em> in which dynamic call site occurs </li>
 * <li>a {@code String}, the method name mentioned in the call site </li>
 * <li>a {@code MethodType}, the resolved type descriptor of the call </li>
 * <li>optionally, between 1 and 251 additional static arguments taken from the constant pool </li>
 * </ul>
 * Invocation is as if by
 * {@link java.lang.invoke.MethodHandle#invoke MethodHandle.invoke}.
 * The returned result must be a {@link java.lang.invoke.CallSite CallSite} (or a subclass).
 * The type of the call site's target must be exactly equal to the type
 * derived from the dynamic call site's type descriptor and passed to
 * the bootstrap method.
 * The call site then becomes permanently linked to the dynamic call site.
 * <p>
 * As documented in the JVM specification, all failures arising from
 * the linkage of a dynamic call site are reported
 * by a {@link java.lang.BootstrapMethodError BootstrapMethodError},
 * which is thrown as the abnormal termination of the dynamic call
 * site execution.
 * If this happens, the same error will the thrown for all subsequent
 * attempts to execute the dynamic call site.
 *
 * <h2>timing of linkage</h2>
 * A dynamic call site is linked just before its first execution.
 * The bootstrap method call implementing the linkage occurs within
 * a thread that is attempting a first execution.
 * <p>
 * If there are several such threads, the bootstrap method may be
 * invoked in several threads concurrently.
 * Therefore, bootstrap methods which access global application
 * data must take the usual precautions against race conditions.
 * In any case, every {@code invokedynamic} instruction is either
 * unlinked or linked to a unique {@code CallSite} object.
 * <p>
 * In an application which requires dynamic call sites with individually
 * mutable behaviors, their bootstrap methods should produce distinct
 * {@link java.lang.invoke.CallSite CallSite} objects, one for each linkage request.
 * Alternatively, an application can link a single {@code CallSite} object
 * to several {@code invokedynamic} instructions, in which case
 * a change to the target method will become visible at each of
 * the instructions.
 * <p>
 * If several threads simultaneously execute a bootstrap method for a single dynamic
 * call site, the JVM must choose one {@code CallSite} object and install it visibly to
 * all threads.  Any other bootstrap method calls are allowed to complete, but their
 * results are ignored, and their dynamic call site invocations proceed with the originally
 * chosen target object.

 * <p style="font-size:smaller;">
 * <em>Discussion:</em>
 * These rules do not enable the JVM to duplicate dynamic call sites,
 * or to issue &ldquo;causeless&rdquo; bootstrap method calls.
 * Every dynamic call site transitions at most once from unlinked to linked,
 * just before its first invocation.
 * There is no way to undo the effect of a completed bootstrap method call.
 *
 * <h2>types of bootstrap methods</h2>
 * As long as each bootstrap method can be correctly invoked
 * by {@code MethodHandle.invoke}, its detailed type is arbitrary.
 * For example, the first argument could be {@code Object}
 * instead of {@code MethodHandles.Lookup}, and the return type
 * could also be {@code Object} instead of {@code CallSite}.
 * (Note that the types and number of the stacked arguments limit
 * the legal kinds of bootstrap methods to appropriately typed
 * static methods and constructors of {@code CallSite} subclasses.)
 * <p>
 * If a given {@code invokedynamic} instruction specifies no static arguments,
 * the instruction's bootstrap method will be invoked on three arguments,
 * conveying the instruction's caller class, name, and method type.
 * If the {@code invokedynamic} instruction specifies one or more static arguments,
 * those values will be passed as additional arguments to the method handle.
 * (Note that because there is a limit of 255 arguments to any method,
 * at most 251 extra arguments can be supplied, since the bootstrap method
 * handle itself and its first three arguments must also be stacked.)
 * The bootstrap method will be invoked as if by either {@code MethodHandle.invoke}
 * or {@code invokeWithArguments}.  (There is no way to tell the difference.)
 * <p>
 * The normal argument conversion rules for {@code MethodHandle.invoke} apply to all stacked arguments.
 * For example, if a pushed value is a primitive type, it may be converted to a reference by boxing conversion.
 * If the bootstrap method is a variable arity method (its modifier bit {@code 0x0080} is set),
 * then some or all of the arguments specified here may be collected into a trailing array parameter.
 * (This is not a special rule, but rather a useful consequence of the interaction
 * between {@code CONSTANT_MethodHandle} constants, the modifier bit for variable arity methods,
 * and the {@link java.lang.invoke.MethodHandle#asVarargsCollector asVarargsCollector} transformation.)
 * <p>
 * Given these rules, here are examples of legal bootstrap method declarations,
 * given various numbers {@code N} of extra arguments.
 * The first rows (marked {@code *}) will work for any number of extra arguments.
 * <table border=1 cellpadding=5 summary="Static argument types">
 * <tr><th>N</th><th>sample bootstrap method</th></tr>
 * <tr><td>*</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, Object... args)</code></td></tr>
 * <tr><td>*</td><td><code>CallSite bootstrap(Object... args)</code></td></tr>
 * <tr><td>*</td><td><code>CallSite bootstrap(Object caller, Object... nameAndTypeWithArgs)</code></td></tr>
 * <tr><td>0</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type)</code></td></tr>
 * <tr><td>0</td><td><code>CallSite bootstrap(Lookup caller, Object... nameAndType)</code></td></tr>
 * <tr><td>1</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, Object arg)</code></td></tr>
 * <tr><td>2</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, Object... args)</code></td></tr>
 * <tr><td>2</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, String... args)</code></td></tr>
 * <tr><td>2</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, String x, int y)</code></td></tr>
 * </table>
 * The last example assumes that the extra arguments are of type
 * {@code CONSTANT_String} and {@code CONSTANT_Integer}, respectively.
 * The second-to-last example assumes that all extra arguments are of type
 * {@code CONSTANT_String}.
 * The other examples work with all types of extra arguments.
 * <p>
 * As noted above, the actual method type of the bootstrap method can vary.
 * For example, the fourth argument could be {@code MethodHandle},
 * if that is the type of the corresponding constant in
 * the {@code CONSTANT_InvokeDynamic} entry.
 * In that case, the {@code MethodHandle.invoke} call will pass the extra method handle
 * constant as an {@code Object}, but the type matching machinery of {@code MethodHandle.invoke}
 * will cast the reference back to {@code MethodHandle} before invoking the bootstrap method.
 * (If a string constant were passed instead, by badly generated code, that cast would then fail,
 * resulting in a {@code BootstrapMethodError}.)
 * <p>
 * Note that, as a consequence of the above rules, the bootstrap method may accept a primitive
 * argument, if it can be represented by a constant pool entry.
 * However, arguments of type {@code boolean}, {@code byte}, {@code short}, or {@code char}
 * cannot be created for bootstrap methods, since such constants cannot be directly
 * represented in the constant pool, and the invocation of the bootstrap method will
 * not perform the necessary narrowing primitive conversions.
 * <p>
 * Extra bootstrap method arguments are intended to allow language implementors
 * to safely and compactly encode metadata.
 * In principle, the name and extra arguments are redundant,
 * since each call site could be given its own unique bootstrap method.
 * Such a practice is likely to produce large class files and constant pools.
 *
 * @author John Rose, JSR 292 EG
 * @since 1.7
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/package-info.java
package java.lang.reflect;

/**
 * Provides classes and interfaces for obtaining reflective
 * information about classes and objects.  Reflection allows
 * programmatic access to information about the fields, methods and
 * constructors of loaded classes, and the use of reflected fields,
 * methods, and constructors to operate on their underlying
 * counterparts, within security restrictions.
 *
 * <p>{@code AccessibleObject} allows suppression of access checks if
 * the necessary {@code ReflectPermission} is available.
 *
 * <p>{@code Array} provides static methods to dynamically create and
 * access arrays.
 *
 * <p>Classes in this package, along with {@code java.lang.Class}
 * accommodate applications such as debuggers, interpreters, object
 * inspectors, class browsers, and services such as Object
 * Serialization and JavaBeans that need access to either the public
 * members of a target object (based on its runtime class) or the
 * members declared by a given class.
 *
 * @since JDK1.1
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/package-info.java
@jdk.Exported

/**
The Doclet API (also called the Javadoc API) provides a mechanism
for clients to inspect the source-level structure of programs and
libraries, including javadoc comments embedded in the source.
This is useful for documentation, program checking, automatic
code generation and many other tools.
<p>

Doclets are invoked by javadoc and use this API to write out
program information to files.  For example, the standard doclet is called
by default and writes out documentation to HTML files.
<p>

The invocation is defined by the abstract {@link com.sun.javadoc.Doclet} class
-- the entry point is the {@link com.sun.javadoc.Doclet#start(RootDoc) start} method:
<pre>
    public static boolean <b>start</b>(RootDoc root)
</pre>
The {@link com.sun.javadoc.RootDoc} instance holds the root of the program structure
information. From this root all other program structure
information can be extracted.
<p>

<a name="terminology"></a>
<h3>Terminology</h3>

<a name="included"></a>
When calling javadoc, you pass in package names and source file names --
these are called the <em>specified</em> packages and classes.
You also pass in Javadoc options; the <em>access control</em> Javadoc options
(<code>-public</code>, <code>-protected</code>, <code>-package</code>,
and <code>-private</code>) filter program elements, producing a
result set, called the <em>included</em> set, or "documented" set.
(The unfiltered set is also available through
{@link com.sun.javadoc.PackageDoc#allClasses(boolean) allClasses(false)}.)
<p>

<a name="class"></a>
Throughout this API, the term <em>class</em> is normally a
shorthand for "class or interface", as in: {@link com.sun.javadoc.ClassDoc},
{@link com.sun.javadoc.PackageDoc#allClasses() allClasses()}, and
{@link com.sun.javadoc.PackageDoc#findClass(String) findClass(String)}.
In only a couple of other places, it means "class, as opposed to interface",
as in:  {@link com.sun.javadoc.Doc#isClass()}.
In the second sense, this API calls out four kinds of classes:
{@linkplain com.sun.javadoc.Doc#isOrdinaryClass() ordinary classes},
{@linkplain com.sun.javadoc.Doc#isEnum() enums},
{@linkplain com.sun.javadoc.Doc#isError() errors} and
{@linkplain com.sun.javadoc.Doc#isException() exceptions}.
Throughout the API, the detailed description of each program element
describes explicitly which meaning is being used.
<p>

<a name="qualified"></a>
A <em>qualified</em> class or interface name is one that has its package
name prepended to it, such as <code>java.lang.String</code>.  A non-qualified
name has no package name, such as <code>String</code>.
<p>

<a name="example"></a>
<h3>Example</h3>

The following is an example doclet that
displays information in the <code>@param</code> tags of the processed
classes:
<pre>
import com.sun.javadoc.*;

public class ListParams extends <font color=red title="Doclet API">Doclet</font> {

    public static boolean start(<font color=red title="Doclet API">RootDoc</font> root) {
        <font color=red title="Doclet API">ClassDoc</font>[] classes = root.<font color=red title="Doclet API">classes</font>();
        for (int i = 0; i < classes.length; ++i) {
            <font color=red title="Doclet API">ClassDoc</font> cd = classes[i];
            printMembers(cd.<font color=red title="Doclet API">constructors</font>());
            printMembers(cd.<font color=red title="Doclet API">methods</font>());
        }
        return true;
    }

    static void printMembers(<font color=red title="Doclet API">ExecutableMemberDoc</font>[] mems) {
        for (int i = 0; i < mems.length; ++i) {
            <font color=red title="Doclet API">ParamTag</font>[] params = mems[i].<font color=red title="Doclet API">paramTags</font>();
            System.out.println(mems[i].<font color=red title="Doclet API">qualifiedName</font>());
            for (int j = 0; j < params.length; ++j) {
                System.out.println("   " + params[j].<font color=red title="Doclet API">parameterName</font>()
                    + " - " + params[j].<font color=red title="Doclet API">parameterComment</font>());
            }
        }
    }
}
</pre>
Interfaces and methods from the Javadoc API are marked in
<font color=red title="Doclet API">red</font>.
{@link com.sun.javadoc.Doclet Doclet} is an abstract class that specifies
the invocation interface for doclets,
{@link com.sun.javadoc.Doclet Doclet} holds class or interface information,
{@link com.sun.javadoc.ExecutableMemberDoc} is a
superinterface of {@link com.sun.javadoc.MethodDoc} and
{@link com.sun.javadoc.ConstructorDoc},
and {@link com.sun.javadoc.ParamTag} holds information
from "<code>@param</code>" tags.
<p>
This doclet when invoked with a command line like:
<pre>
    javadoc -doclet ListParams -sourcepath &lt;source-location&gt; java.util
</pre>
producing output like:
<pre>
    ...
    java.util.ArrayList.add
       index - index at which the specified element is to be inserted.
       element - element to be inserted.
    java.util.ArrayList.remove
       index - the index of the element to removed.
    ...

</pre>
@see com.sun.javadoc.Doclet
@see com.sun.javadoc.RootDoc
*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//package-info.java
package java.lang;

/**
 * Provides classes that are fundamental to the design of the Java
 * programming language. The most important classes are {@code
 * Object}, which is the root of the class hierarchy, and {@code
 * Class}, instances of which represent classes at run time.
 *
 * <p>Frequently it is necessary to represent a value of primitive
 * type as if it were an object. The wrapper classes {@code Boolean},
 * {@code Character}, {@code Integer}, {@code Long}, {@code Float},
 * and {@code Double} serve this purpose.  An object of type {@code
 * Double}, for example, contains a field whose type is double,
 * representing that value in such a way that a reference to it can be
 * stored in a variable of reference type.  These classes also provide
 * a number of methods for converting among primitive values, as well
 * as supporting such standard methods as equals and hashCode.  The
 * {@code Void} class is a non-instantiable class that holds a
 * reference to a {@code Class} object representing the type void.
 *
 * <p>The class {@code Math} provides commonly used mathematical
 * functions such as sine, cosine, and square root. The classes {@code
 * String}, {@code StringBuffer}, and {@code StringBuilder} similarly
 * provide commonly used operations on character strings.
 *
 * <p>Classes {@code ClassLoader}, {@code Process}, {@code
 * ProcessBuilder}, {@code Runtime}, {@code SecurityManager}, and
 * {@code System} provide "system operations" that manage the dynamic
 * loading of classes, creation of external processes, host
 * environment inquiries such as the time of day, and enforcement of
 * security policies.
 *
 * <p>Class {@code Throwable} encompasses objects that may be thrown
 * by the {@code throw} statement. Subclasses of {@code Throwable}
 * represent errors and exceptions.
 *
 * <a name="charenc"></a>
 * <h3>Character Encodings</h3>
 *
 * The specification of the {@link java.nio.charset.Charset
 * java.nio.charset.Charset} class describes the naming conventions
 * for character encodings as well as the set of standard encodings
 * that must be supported by every implementation of the Java
 * platform.
 *
 * @since JDK1.0
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//annotation/package-info.java
package java.lang.annotation;

/**
 * Provides library support for the Java programming language
 * annotation facility.
 *
 * @author Josh Bloch
 * @since 1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/package-info.java
package java.lang.invoke;

/**
 * The {@code java.lang.invoke} package contains dynamic language support provided directly by
 * the Java core class libraries and virtual machine.
 *
 * <p>
 * As described in the Java Virtual Machine Specification,
 * certain types in this package have special relations to dynamic
 * language support in the virtual machine:
 * <ul>
 * <li>The class {@link java.lang.invoke.MethodHandle MethodHandle} contains
 * <a href="MethodHandle.html#sigpoly">signature polymorphic methods</a>
 * which can be linked regardless of their type descriptor.
 * Normally, method linkage requires exact matching of type descriptors.
 * </li>
 *
 * <li>The JVM bytecode format supports immediate constants of
 * the classes {@link java.lang.invoke.MethodHandle MethodHandle} and {@link java.lang.invoke.MethodType MethodType}.
 * </li>
 * </ul>
 *
 * <h1><a name="jvm_mods"></a>Summary of relevant Java Virtual Machine changes</h1>
 * The following low-level information summarizes relevant parts of the
 * Java Virtual Machine specification.  For full details, please see the
 * current version of that specification.
 *
 * Each occurrence of an {@code invokedynamic} instruction is called a <em>dynamic call site</em>.
 * <h2><a name="indyinsn"></a>{@code invokedynamic} instructions</h2>
 * A dynamic call site is originally in an unlinked state.  In this state, there is
 * no target method for the call site to invoke.
 * <p>
 * Before the JVM can execute a dynamic call site (an {@code invokedynamic} instruction),
 * the call site must first be <em>linked</em>.
 * Linking is accomplished by calling a <em>bootstrap method</em>
 * which is given the static information content of the call site,
 * and which must produce a {@link java.lang.invoke.MethodHandle method handle}
 * that gives the behavior of the call site.
 * <p>
 * Each {@code invokedynamic} instruction statically specifies its own
 * bootstrap method as a constant pool reference.
 * The constant pool reference also specifies the call site's name and type descriptor,
 * just like {@code invokevirtual} and the other invoke instructions.
 * <p>
 * Linking starts with resolving the constant pool entry for the
 * bootstrap method, and resolving a {@link java.lang.invoke.MethodType MethodType} object for
 * the type descriptor of the dynamic call site.
 * This resolution process may trigger class loading.
 * It may therefore throw an error if a class fails to load.
 * This error becomes the abnormal termination of the dynamic
 * call site execution.
 * Linkage does not trigger class initialization.
 * <p>
 * The bootstrap method is invoked on at least three values:
 * <ul>
 * <li>a {@code MethodHandles.Lookup}, a lookup object on the <em>caller class</em> in which dynamic call site occurs </li>
 * <li>a {@code String}, the method name mentioned in the call site </li>
 * <li>a {@code MethodType}, the resolved type descriptor of the call </li>
 * <li>optionally, between 1 and 251 additional static arguments taken from the constant pool </li>
 * </ul>
 * Invocation is as if by
 * {@link java.lang.invoke.MethodHandle#invoke MethodHandle.invoke}.
 * The returned result must be a {@link java.lang.invoke.CallSite CallSite} (or a subclass).
 * The type of the call site's target must be exactly equal to the type
 * derived from the dynamic call site's type descriptor and passed to
 * the bootstrap method.
 * The call site then becomes permanently linked to the dynamic call site.
 * <p>
 * As documented in the JVM specification, all failures arising from
 * the linkage of a dynamic call site are reported
 * by a {@link java.lang.BootstrapMethodError BootstrapMethodError},
 * which is thrown as the abnormal termination of the dynamic call
 * site execution.
 * If this happens, the same error will the thrown for all subsequent
 * attempts to execute the dynamic call site.
 *
 * <h2>timing of linkage</h2>
 * A dynamic call site is linked just before its first execution.
 * The bootstrap method call implementing the linkage occurs within
 * a thread that is attempting a first execution.
 * <p>
 * If there are several such threads, the bootstrap method may be
 * invoked in several threads concurrently.
 * Therefore, bootstrap methods which access global application
 * data must take the usual precautions against race conditions.
 * In any case, every {@code invokedynamic} instruction is either
 * unlinked or linked to a unique {@code CallSite} object.
 * <p>
 * In an application which requires dynamic call sites with individually
 * mutable behaviors, their bootstrap methods should produce distinct
 * {@link java.lang.invoke.CallSite CallSite} objects, one for each linkage request.
 * Alternatively, an application can link a single {@code CallSite} object
 * to several {@code invokedynamic} instructions, in which case
 * a change to the target method will become visible at each of
 * the instructions.
 * <p>
 * If several threads simultaneously execute a bootstrap method for a single dynamic
 * call site, the JVM must choose one {@code CallSite} object and install it visibly to
 * all threads.  Any other bootstrap method calls are allowed to complete, but their
 * results are ignored, and their dynamic call site invocations proceed with the originally
 * chosen target object.

 * <p style="font-size:smaller;">
 * <em>Discussion:</em>
 * These rules do not enable the JVM to duplicate dynamic call sites,
 * or to issue &ldquo;causeless&rdquo; bootstrap method calls.
 * Every dynamic call site transitions at most once from unlinked to linked,
 * just before its first invocation.
 * There is no way to undo the effect of a completed bootstrap method call.
 *
 * <h2>types of bootstrap methods</h2>
 * As long as each bootstrap method can be correctly invoked
 * by {@code MethodHandle.invoke}, its detailed type is arbitrary.
 * For example, the first argument could be {@code Object}
 * instead of {@code MethodHandles.Lookup}, and the return type
 * could also be {@code Object} instead of {@code CallSite}.
 * (Note that the types and number of the stacked arguments limit
 * the legal kinds of bootstrap methods to appropriately typed
 * static methods and constructors of {@code CallSite} subclasses.)
 * <p>
 * If a given {@code invokedynamic} instruction specifies no static arguments,
 * the instruction's bootstrap method will be invoked on three arguments,
 * conveying the instruction's caller class, name, and method type.
 * If the {@code invokedynamic} instruction specifies one or more static arguments,
 * those values will be passed as additional arguments to the method handle.
 * (Note that because there is a limit of 255 arguments to any method,
 * at most 251 extra arguments can be supplied, since the bootstrap method
 * handle itself and its first three arguments must also be stacked.)
 * The bootstrap method will be invoked as if by either {@code MethodHandle.invoke}
 * or {@code invokeWithArguments}.  (There is no way to tell the difference.)
 * <p>
 * The normal argument conversion rules for {@code MethodHandle.invoke} apply to all stacked arguments.
 * For example, if a pushed value is a primitive type, it may be converted to a reference by boxing conversion.
 * If the bootstrap method is a variable arity method (its modifier bit {@code 0x0080} is set),
 * then some or all of the arguments specified here may be collected into a trailing array parameter.
 * (This is not a special rule, but rather a useful consequence of the interaction
 * between {@code CONSTANT_MethodHandle} constants, the modifier bit for variable arity methods,
 * and the {@link java.lang.invoke.MethodHandle#asVarargsCollector asVarargsCollector} transformation.)
 * <p>
 * Given these rules, here are examples of legal bootstrap method declarations,
 * given various numbers {@code N} of extra arguments.
 * The first rows (marked {@code *}) will work for any number of extra arguments.
 * <table border=1 cellpadding=5 summary="Static argument types">
 * <tr><th>N</th><th>sample bootstrap method</th></tr>
 * <tr><td>*</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, Object... args)</code></td></tr>
 * <tr><td>*</td><td><code>CallSite bootstrap(Object... args)</code></td></tr>
 * <tr><td>*</td><td><code>CallSite bootstrap(Object caller, Object... nameAndTypeWithArgs)</code></td></tr>
 * <tr><td>0</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type)</code></td></tr>
 * <tr><td>0</td><td><code>CallSite bootstrap(Lookup caller, Object... nameAndType)</code></td></tr>
 * <tr><td>1</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, Object arg)</code></td></tr>
 * <tr><td>2</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, Object... args)</code></td></tr>
 * <tr><td>2</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, String... args)</code></td></tr>
 * <tr><td>2</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, String x, int y)</code></td></tr>
 * </table>
 * The last example assumes that the extra arguments are of type
 * {@code CONSTANT_String} and {@code CONSTANT_Integer}, respectively.
 * The second-to-last example assumes that all extra arguments are of type
 * {@code CONSTANT_String}.
 * The other examples work with all types of extra arguments.
 * <p>
 * As noted above, the actual method type of the bootstrap method can vary.
 * For example, the fourth argument could be {@code MethodHandle},
 * if that is the type of the corresponding constant in
 * the {@code CONSTANT_InvokeDynamic} entry.
 * In that case, the {@code MethodHandle.invoke} call will pass the extra method handle
 * constant as an {@code Object}, but the type matching machinery of {@code MethodHandle.invoke}
 * will cast the reference back to {@code MethodHandle} before invoking the bootstrap method.
 * (If a string constant were passed instead, by badly generated code, that cast would then fail,
 * resulting in a {@code BootstrapMethodError}.)
 * <p>
 * Note that, as a consequence of the above rules, the bootstrap method may accept a primitive
 * argument, if it can be represented by a constant pool entry.
 * However, arguments of type {@code boolean}, {@code byte}, {@code short}, or {@code char}
 * cannot be created for bootstrap methods, since such constants cannot be directly
 * represented in the constant pool, and the invocation of the bootstrap method will
 * not perform the necessary narrowing primitive conversions.
 * <p>
 * Extra bootstrap method arguments are intended to allow language implementors
 * to safely and compactly encode metadata.
 * In principle, the name and extra arguments are redundant,
 * since each call site could be given its own unique bootstrap method.
 * Such a practice is likely to produce large class files and constant pools.
 *
 * @author John Rose, JSR 292 EG
 * @since 1.7
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/package-info.java
package java.lang.reflect;

/**
 * Provides classes and interfaces for obtaining reflective
 * information about classes and objects.  Reflection allows
 * programmatic access to information about the fields, methods and
 * constructors of loaded classes, and the use of reflected fields,
 * methods, and constructors to operate on their underlying
 * counterparts, within security restrictions.
 *
 * <p>{@code AccessibleObject} allows suppression of access checks if
 * the necessary {@code ReflectPermission} is available.
 *
 * <p>{@code Array} provides static methods to dynamically create and
 * access arrays.
 *
 * <p>Classes in this package, along with {@code java.lang.Class}
 * accommodate applications such as debuggers, interpreters, object
 * inspectors, class browsers, and services such as Object
 * Serialization and JavaBeans that need access to either the public
 * members of a target object (based on its runtime class) or the
 * members declared by a given class.
 *
 * @since JDK1.1
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//package-info.java
package java.lang;

/**
 * Provides classes that are fundamental to the design of the Java
 * programming language. The most important classes are {@code
 * Object}, which is the root of the class hierarchy, and {@code
 * Class}, instances of which represent classes at run time.
 *
 * <p>Frequently it is necessary to represent a value of primitive
 * type as if it were an object. The wrapper classes {@code Boolean},
 * {@code Character}, {@code Integer}, {@code Long}, {@code Float},
 * and {@code Double} serve this purpose.  An object of type {@code
 * Double}, for example, contains a field whose type is double,
 * representing that value in such a way that a reference to it can be
 * stored in a variable of reference type.  These classes also provide
 * a number of methods for converting among primitive values, as well
 * as supporting such standard methods as equals and hashCode.  The
 * {@code Void} class is a non-instantiable class that holds a
 * reference to a {@code Class} object representing the type void.
 *
 * <p>The class {@code Math} provides commonly used mathematical
 * functions such as sine, cosine, and square root. The classes {@code
 * String}, {@code StringBuffer}, and {@code StringBuilder} similarly
 * provide commonly used operations on character strings.
 *
 * <p>Classes {@code ClassLoader}, {@code Process}, {@code
 * ProcessBuilder}, {@code Runtime}, {@code SecurityManager}, and
 * {@code System} provide "system operations" that manage the dynamic
 * loading of classes, creation of external processes, host
 * environment inquiries such as the time of day, and enforcement of
 * security policies.
 *
 * <p>Class {@code Throwable} encompasses objects that may be thrown
 * by the {@code throw} statement. Subclasses of {@code Throwable}
 * represent errors and exceptions.
 *
 * <a name="charenc"></a>
 * <h3>Character Encodings</h3>
 *
 * The specification of the {@link java.nio.charset.Charset
 * java.nio.charset.Charset} class describes the naming conventions
 * for character encodings as well as the set of standard encodings
 * that must be supported by every implementation of the Java
 * platform.
 *
 * @since JDK1.0
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//annotation/package-info.java
package java.lang.annotation;

/**
 * Provides library support for the Java programming language
 * annotation facility.
 *
 * @author Josh Bloch
 * @since 1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/package-info.java
package java.lang.invoke;

/**
 * The {@code java.lang.invoke} package contains dynamic language support provided directly by
 * the Java core class libraries and virtual machine.
 *
 * <p>
 * As described in the Java Virtual Machine Specification,
 * certain types in this package have special relations to dynamic
 * language support in the virtual machine:
 * <ul>
 * <li>The class {@link java.lang.invoke.MethodHandle MethodHandle} contains
 * <a href="MethodHandle.html#sigpoly">signature polymorphic methods</a>
 * which can be linked regardless of their type descriptor.
 * Normally, method linkage requires exact matching of type descriptors.
 * </li>
 *
 * <li>The JVM bytecode format supports immediate constants of
 * the classes {@link java.lang.invoke.MethodHandle MethodHandle} and {@link java.lang.invoke.MethodType MethodType}.
 * </li>
 * </ul>
 *
 * <h1><a name="jvm_mods"></a>Summary of relevant Java Virtual Machine changes</h1>
 * The following low-level information summarizes relevant parts of the
 * Java Virtual Machine specification.  For full details, please see the
 * current version of that specification.
 *
 * Each occurrence of an {@code invokedynamic} instruction is called a <em>dynamic call site</em>.
 * <h2><a name="indyinsn"></a>{@code invokedynamic} instructions</h2>
 * A dynamic call site is originally in an unlinked state.  In this state, there is
 * no target method for the call site to invoke.
 * <p>
 * Before the JVM can execute a dynamic call site (an {@code invokedynamic} instruction),
 * the call site must first be <em>linked</em>.
 * Linking is accomplished by calling a <em>bootstrap method</em>
 * which is given the static information content of the call site,
 * and which must produce a {@link java.lang.invoke.MethodHandle method handle}
 * that gives the behavior of the call site.
 * <p>
 * Each {@code invokedynamic} instruction statically specifies its own
 * bootstrap method as a constant pool reference.
 * The constant pool reference also specifies the call site's name and type descriptor,
 * just like {@code invokevirtual} and the other invoke instructions.
 * <p>
 * Linking starts with resolving the constant pool entry for the
 * bootstrap method, and resolving a {@link java.lang.invoke.MethodType MethodType} object for
 * the type descriptor of the dynamic call site.
 * This resolution process may trigger class loading.
 * It may therefore throw an error if a class fails to load.
 * This error becomes the abnormal termination of the dynamic
 * call site execution.
 * Linkage does not trigger class initialization.
 * <p>
 * The bootstrap method is invoked on at least three values:
 * <ul>
 * <li>a {@code MethodHandles.Lookup}, a lookup object on the <em>caller class</em> in which dynamic call site occurs </li>
 * <li>a {@code String}, the method name mentioned in the call site </li>
 * <li>a {@code MethodType}, the resolved type descriptor of the call </li>
 * <li>optionally, between 1 and 251 additional static arguments taken from the constant pool </li>
 * </ul>
 * Invocation is as if by
 * {@link java.lang.invoke.MethodHandle#invoke MethodHandle.invoke}.
 * The returned result must be a {@link java.lang.invoke.CallSite CallSite} (or a subclass).
 * The type of the call site's target must be exactly equal to the type
 * derived from the dynamic call site's type descriptor and passed to
 * the bootstrap method.
 * The call site then becomes permanently linked to the dynamic call site.
 * <p>
 * As documented in the JVM specification, all failures arising from
 * the linkage of a dynamic call site are reported
 * by a {@link java.lang.BootstrapMethodError BootstrapMethodError},
 * which is thrown as the abnormal termination of the dynamic call
 * site execution.
 * If this happens, the same error will the thrown for all subsequent
 * attempts to execute the dynamic call site.
 *
 * <h2>timing of linkage</h2>
 * A dynamic call site is linked just before its first execution.
 * The bootstrap method call implementing the linkage occurs within
 * a thread that is attempting a first execution.
 * <p>
 * If there are several such threads, the bootstrap method may be
 * invoked in several threads concurrently.
 * Therefore, bootstrap methods which access global application
 * data must take the usual precautions against race conditions.
 * In any case, every {@code invokedynamic} instruction is either
 * unlinked or linked to a unique {@code CallSite} object.
 * <p>
 * In an application which requires dynamic call sites with individually
 * mutable behaviors, their bootstrap methods should produce distinct
 * {@link java.lang.invoke.CallSite CallSite} objects, one for each linkage request.
 * Alternatively, an application can link a single {@code CallSite} object
 * to several {@code invokedynamic} instructions, in which case
 * a change to the target method will become visible at each of
 * the instructions.
 * <p>
 * If several threads simultaneously execute a bootstrap method for a single dynamic
 * call site, the JVM must choose one {@code CallSite} object and install it visibly to
 * all threads.  Any other bootstrap method calls are allowed to complete, but their
 * results are ignored, and their dynamic call site invocations proceed with the originally
 * chosen target object.

 * <p style="font-size:smaller;">
 * <em>Discussion:</em>
 * These rules do not enable the JVM to duplicate dynamic call sites,
 * or to issue &ldquo;causeless&rdquo; bootstrap method calls.
 * Every dynamic call site transitions at most once from unlinked to linked,
 * just before its first invocation.
 * There is no way to undo the effect of a completed bootstrap method call.
 *
 * <h2>types of bootstrap methods</h2>
 * As long as each bootstrap method can be correctly invoked
 * by {@code MethodHandle.invoke}, its detailed type is arbitrary.
 * For example, the first argument could be {@code Object}
 * instead of {@code MethodHandles.Lookup}, and the return type
 * could also be {@code Object} instead of {@code CallSite}.
 * (Note that the types and number of the stacked arguments limit
 * the legal kinds of bootstrap methods to appropriately typed
 * static methods and constructors of {@code CallSite} subclasses.)
 * <p>
 * If a given {@code invokedynamic} instruction specifies no static arguments,
 * the instruction's bootstrap method will be invoked on three arguments,
 * conveying the instruction's caller class, name, and method type.
 * If the {@code invokedynamic} instruction specifies one or more static arguments,
 * those values will be passed as additional arguments to the method handle.
 * (Note that because there is a limit of 255 arguments to any method,
 * at most 251 extra arguments can be supplied, since the bootstrap method
 * handle itself and its first three arguments must also be stacked.)
 * The bootstrap method will be invoked as if by either {@code MethodHandle.invoke}
 * or {@code invokeWithArguments}.  (There is no way to tell the difference.)
 * <p>
 * The normal argument conversion rules for {@code MethodHandle.invoke} apply to all stacked arguments.
 * For example, if a pushed value is a primitive type, it may be converted to a reference by boxing conversion.
 * If the bootstrap method is a variable arity method (its modifier bit {@code 0x0080} is set),
 * then some or all of the arguments specified here may be collected into a trailing array parameter.
 * (This is not a special rule, but rather a useful consequence of the interaction
 * between {@code CONSTANT_MethodHandle} constants, the modifier bit for variable arity methods,
 * and the {@link java.lang.invoke.MethodHandle#asVarargsCollector asVarargsCollector} transformation.)
 * <p>
 * Given these rules, here are examples of legal bootstrap method declarations,
 * given various numbers {@code N} of extra arguments.
 * The first rows (marked {@code *}) will work for any number of extra arguments.
 * <table border=1 cellpadding=5 summary="Static argument types">
 * <tr><th>N</th><th>sample bootstrap method</th></tr>
 * <tr><td>*</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, Object... args)</code></td></tr>
 * <tr><td>*</td><td><code>CallSite bootstrap(Object... args)</code></td></tr>
 * <tr><td>*</td><td><code>CallSite bootstrap(Object caller, Object... nameAndTypeWithArgs)</code></td></tr>
 * <tr><td>0</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type)</code></td></tr>
 * <tr><td>0</td><td><code>CallSite bootstrap(Lookup caller, Object... nameAndType)</code></td></tr>
 * <tr><td>1</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, Object arg)</code></td></tr>
 * <tr><td>2</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, Object... args)</code></td></tr>
 * <tr><td>2</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, String... args)</code></td></tr>
 * <tr><td>2</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, String x, int y)</code></td></tr>
 * </table>
 * The last example assumes that the extra arguments are of type
 * {@code CONSTANT_String} and {@code CONSTANT_Integer}, respectively.
 * The second-to-last example assumes that all extra arguments are of type
 * {@code CONSTANT_String}.
 * The other examples work with all types of extra arguments.
 * <p>
 * As noted above, the actual method type of the bootstrap method can vary.
 * For example, the fourth argument could be {@code MethodHandle},
 * if that is the type of the corresponding constant in
 * the {@code CONSTANT_InvokeDynamic} entry.
 * In that case, the {@code MethodHandle.invoke} call will pass the extra method handle
 * constant as an {@code Object}, but the type matching machinery of {@code MethodHandle.invoke}
 * will cast the reference back to {@code MethodHandle} before invoking the bootstrap method.
 * (If a string constant were passed instead, by badly generated code, that cast would then fail,
 * resulting in a {@code BootstrapMethodError}.)
 * <p>
 * Note that, as a consequence of the above rules, the bootstrap method may accept a primitive
 * argument, if it can be represented by a constant pool entry.
 * However, arguments of type {@code boolean}, {@code byte}, {@code short}, or {@code char}
 * cannot be created for bootstrap methods, since such constants cannot be directly
 * represented in the constant pool, and the invocation of the bootstrap method will
 * not perform the necessary narrowing primitive conversions.
 * <p>
 * Extra bootstrap method arguments are intended to allow language implementors
 * to safely and compactly encode metadata.
 * In principle, the name and extra arguments are redundant,
 * since each call site could be given its own unique bootstrap method.
 * Such a practice is likely to produce large class files and constant pools.
 *
 * @author John Rose, JSR 292 EG
 * @since 1.7
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/package-info.java
package java.lang.reflect;

/**
 * Provides classes and interfaces for obtaining reflective
 * information about classes and objects.  Reflection allows
 * programmatic access to information about the fields, methods and
 * constructors of loaded classes, and the use of reflected fields,
 * methods, and constructors to operate on their underlying
 * counterparts, within security restrictions.
 *
 * <p>{@code AccessibleObject} allows suppression of access checks if
 * the necessary {@code ReflectPermission} is available.
 *
 * <p>{@code Array} provides static methods to dynamically create and
 * access arrays.
 *
 * <p>Classes in this package, along with {@code java.lang.Class}
 * accommodate applications such as debuggers, interpreters, object
 * inspectors, class browsers, and services such as Object
 * Serialization and JavaBeans that need access to either the public
 * members of a target object (based on its runtime class) or the
 * members declared by a given class.
 *
 * @since JDK1.1
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//package-info.java
package java.lang;

/**
 * Provides classes that are fundamental to the design of the Java
 * programming language. The most important classes are {@code
 * Object}, which is the root of the class hierarchy, and {@code
 * Class}, instances of which represent classes at run time.
 *
 * <p>Frequently it is necessary to represent a value of primitive
 * type as if it were an object. The wrapper classes {@code Boolean},
 * {@code Character}, {@code Integer}, {@code Long}, {@code Float},
 * and {@code Double} serve this purpose.  An object of type {@code
 * Double}, for example, contains a field whose type is double,
 * representing that value in such a way that a reference to it can be
 * stored in a variable of reference type.  These classes also provide
 * a number of methods for converting among primitive values, as well
 * as supporting such standard methods as equals and hashCode.  The
 * {@code Void} class is a non-instantiable class that holds a
 * reference to a {@code Class} object representing the type void.
 *
 * <p>The class {@code Math} provides commonly used mathematical
 * functions such as sine, cosine, and square root. The classes {@code
 * String}, {@code StringBuffer}, and {@code StringBuilder} similarly
 * provide commonly used operations on character strings.
 *
 * <p>Classes {@code ClassLoader}, {@code Process}, {@code
 * ProcessBuilder}, {@code Runtime}, {@code SecurityManager}, and
 * {@code System} provide "system operations" that manage the dynamic
 * loading of classes, creation of external processes, host
 * environment inquiries such as the time of day, and enforcement of
 * security policies.
 *
 * <p>Class {@code Throwable} encompasses objects that may be thrown
 * by the {@code throw} statement. Subclasses of {@code Throwable}
 * represent errors and exceptions.
 *
 * <a name="charenc"></a>
 * <h3>Character Encodings</h3>
 *
 * The specification of the {@link java.nio.charset.Charset
 * java.nio.charset.Charset} class describes the naming conventions
 * for character encodings as well as the set of standard encodings
 * that must be supported by every implementation of the Java
 * platform.
 *
 * @since JDK1.0
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//annotation/package-info.java
package java.lang.annotation;

/**
 * Provides library support for the Java programming language
 * annotation facility.
 *
 * @author Josh Bloch
 * @since 1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/package-info.java
package java.lang.invoke;

/**
 * The {@code java.lang.invoke} package contains dynamic language support provided directly by
 * the Java core class libraries and virtual machine.
 *
 * <p>
 * As described in the Java Virtual Machine Specification,
 * certain types in this package have special relations to dynamic
 * language support in the virtual machine:
 * <ul>
 * <li>The class {@link java.lang.invoke.MethodHandle MethodHandle} contains
 * <a href="MethodHandle.html#sigpoly">signature polymorphic methods</a>
 * which can be linked regardless of their type descriptor.
 * Normally, method linkage requires exact matching of type descriptors.
 * </li>
 *
 * <li>The JVM bytecode format supports immediate constants of
 * the classes {@link java.lang.invoke.MethodHandle MethodHandle} and {@link java.lang.invoke.MethodType MethodType}.
 * </li>
 * </ul>
 *
 * <h1><a name="jvm_mods"></a>Summary of relevant Java Virtual Machine changes</h1>
 * The following low-level information summarizes relevant parts of the
 * Java Virtual Machine specification.  For full details, please see the
 * current version of that specification.
 *
 * Each occurrence of an {@code invokedynamic} instruction is called a <em>dynamic call site</em>.
 * <h2><a name="indyinsn"></a>{@code invokedynamic} instructions</h2>
 * A dynamic call site is originally in an unlinked state.  In this state, there is
 * no target method for the call site to invoke.
 * <p>
 * Before the JVM can execute a dynamic call site (an {@code invokedynamic} instruction),
 * the call site must first be <em>linked</em>.
 * Linking is accomplished by calling a <em>bootstrap method</em>
 * which is given the static information content of the call site,
 * and which must produce a {@link java.lang.invoke.MethodHandle method handle}
 * that gives the behavior of the call site.
 * <p>
 * Each {@code invokedynamic} instruction statically specifies its own
 * bootstrap method as a constant pool reference.
 * The constant pool reference also specifies the call site's name and type descriptor,
 * just like {@code invokevirtual} and the other invoke instructions.
 * <p>
 * Linking starts with resolving the constant pool entry for the
 * bootstrap method, and resolving a {@link java.lang.invoke.MethodType MethodType} object for
 * the type descriptor of the dynamic call site.
 * This resolution process may trigger class loading.
 * It may therefore throw an error if a class fails to load.
 * This error becomes the abnormal termination of the dynamic
 * call site execution.
 * Linkage does not trigger class initialization.
 * <p>
 * The bootstrap method is invoked on at least three values:
 * <ul>
 * <li>a {@code MethodHandles.Lookup}, a lookup object on the <em>caller class</em> in which dynamic call site occurs </li>
 * <li>a {@code String}, the method name mentioned in the call site </li>
 * <li>a {@code MethodType}, the resolved type descriptor of the call </li>
 * <li>optionally, between 1 and 251 additional static arguments taken from the constant pool </li>
 * </ul>
 * Invocation is as if by
 * {@link java.lang.invoke.MethodHandle#invoke MethodHandle.invoke}.
 * The returned result must be a {@link java.lang.invoke.CallSite CallSite} (or a subclass).
 * The type of the call site's target must be exactly equal to the type
 * derived from the dynamic call site's type descriptor and passed to
 * the bootstrap method.
 * The call site then becomes permanently linked to the dynamic call site.
 * <p>
 * As documented in the JVM specification, all failures arising from
 * the linkage of a dynamic call site are reported
 * by a {@link java.lang.BootstrapMethodError BootstrapMethodError},
 * which is thrown as the abnormal termination of the dynamic call
 * site execution.
 * If this happens, the same error will the thrown for all subsequent
 * attempts to execute the dynamic call site.
 *
 * <h2>timing of linkage</h2>
 * A dynamic call site is linked just before its first execution.
 * The bootstrap method call implementing the linkage occurs within
 * a thread that is attempting a first execution.
 * <p>
 * If there are several such threads, the bootstrap method may be
 * invoked in several threads concurrently.
 * Therefore, bootstrap methods which access global application
 * data must take the usual precautions against race conditions.
 * In any case, every {@code invokedynamic} instruction is either
 * unlinked or linked to a unique {@code CallSite} object.
 * <p>
 * In an application which requires dynamic call sites with individually
 * mutable behaviors, their bootstrap methods should produce distinct
 * {@link java.lang.invoke.CallSite CallSite} objects, one for each linkage request.
 * Alternatively, an application can link a single {@code CallSite} object
 * to several {@code invokedynamic} instructions, in which case
 * a change to the target method will become visible at each of
 * the instructions.
 * <p>
 * If several threads simultaneously execute a bootstrap method for a single dynamic
 * call site, the JVM must choose one {@code CallSite} object and install it visibly to
 * all threads.  Any other bootstrap method calls are allowed to complete, but their
 * results are ignored, and their dynamic call site invocations proceed with the originally
 * chosen target object.

 * <p style="font-size:smaller;">
 * <em>Discussion:</em>
 * These rules do not enable the JVM to duplicate dynamic call sites,
 * or to issue &ldquo;causeless&rdquo; bootstrap method calls.
 * Every dynamic call site transitions at most once from unlinked to linked,
 * just before its first invocation.
 * There is no way to undo the effect of a completed bootstrap method call.
 *
 * <h2>types of bootstrap methods</h2>
 * As long as each bootstrap method can be correctly invoked
 * by {@code MethodHandle.invoke}, its detailed type is arbitrary.
 * For example, the first argument could be {@code Object}
 * instead of {@code MethodHandles.Lookup}, and the return type
 * could also be {@code Object} instead of {@code CallSite}.
 * (Note that the types and number of the stacked arguments limit
 * the legal kinds of bootstrap methods to appropriately typed
 * static methods and constructors of {@code CallSite} subclasses.)
 * <p>
 * If a given {@code invokedynamic} instruction specifies no static arguments,
 * the instruction's bootstrap method will be invoked on three arguments,
 * conveying the instruction's caller class, name, and method type.
 * If the {@code invokedynamic} instruction specifies one or more static arguments,
 * those values will be passed as additional arguments to the method handle.
 * (Note that because there is a limit of 255 arguments to any method,
 * at most 251 extra arguments can be supplied, since the bootstrap method
 * handle itself and its first three arguments must also be stacked.)
 * The bootstrap method will be invoked as if by either {@code MethodHandle.invoke}
 * or {@code invokeWithArguments}.  (There is no way to tell the difference.)
 * <p>
 * The normal argument conversion rules for {@code MethodHandle.invoke} apply to all stacked arguments.
 * For example, if a pushed value is a primitive type, it may be converted to a reference by boxing conversion.
 * If the bootstrap method is a variable arity method (its modifier bit {@code 0x0080} is set),
 * then some or all of the arguments specified here may be collected into a trailing array parameter.
 * (This is not a special rule, but rather a useful consequence of the interaction
 * between {@code CONSTANT_MethodHandle} constants, the modifier bit for variable arity methods,
 * and the {@link java.lang.invoke.MethodHandle#asVarargsCollector asVarargsCollector} transformation.)
 * <p>
 * Given these rules, here are examples of legal bootstrap method declarations,
 * given various numbers {@code N} of extra arguments.
 * The first rows (marked {@code *}) will work for any number of extra arguments.
 * <table border=1 cellpadding=5 summary="Static argument types">
 * <tr><th>N</th><th>sample bootstrap method</th></tr>
 * <tr><td>*</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, Object... args)</code></td></tr>
 * <tr><td>*</td><td><code>CallSite bootstrap(Object... args)</code></td></tr>
 * <tr><td>*</td><td><code>CallSite bootstrap(Object caller, Object... nameAndTypeWithArgs)</code></td></tr>
 * <tr><td>0</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type)</code></td></tr>
 * <tr><td>0</td><td><code>CallSite bootstrap(Lookup caller, Object... nameAndType)</code></td></tr>
 * <tr><td>1</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, Object arg)</code></td></tr>
 * <tr><td>2</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, Object... args)</code></td></tr>
 * <tr><td>2</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, String... args)</code></td></tr>
 * <tr><td>2</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, String x, int y)</code></td></tr>
 * </table>
 * The last example assumes that the extra arguments are of type
 * {@code CONSTANT_String} and {@code CONSTANT_Integer}, respectively.
 * The second-to-last example assumes that all extra arguments are of type
 * {@code CONSTANT_String}.
 * The other examples work with all types of extra arguments.
 * <p>
 * As noted above, the actual method type of the bootstrap method can vary.
 * For example, the fourth argument could be {@code MethodHandle},
 * if that is the type of the corresponding constant in
 * the {@code CONSTANT_InvokeDynamic} entry.
 * In that case, the {@code MethodHandle.invoke} call will pass the extra method handle
 * constant as an {@code Object}, but the type matching machinery of {@code MethodHandle.invoke}
 * will cast the reference back to {@code MethodHandle} before invoking the bootstrap method.
 * (If a string constant were passed instead, by badly generated code, that cast would then fail,
 * resulting in a {@code BootstrapMethodError}.)
 * <p>
 * Note that, as a consequence of the above rules, the bootstrap method may accept a primitive
 * argument, if it can be represented by a constant pool entry.
 * However, arguments of type {@code boolean}, {@code byte}, {@code short}, or {@code char}
 * cannot be created for bootstrap methods, since such constants cannot be directly
 * represented in the constant pool, and the invocation of the bootstrap method will
 * not perform the necessary narrowing primitive conversions.
 * <p>
 * Extra bootstrap method arguments are intended to allow language implementors
 * to safely and compactly encode metadata.
 * In principle, the name and extra arguments are redundant,
 * since each call site could be given its own unique bootstrap method.
 * Such a practice is likely to produce large class files and constant pools.
 *
 * @author John Rose, JSR 292 EG
 * @since 1.7
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/package-info.java
package java.lang.reflect;

/**
 * Provides classes and interfaces for obtaining reflective
 * information about classes and objects.  Reflection allows
 * programmatic access to information about the fields, methods and
 * constructors of loaded classes, and the use of reflected fields,
 * methods, and constructors to operate on their underlying
 * counterparts, within security restrictions.
 *
 * <p>{@code AccessibleObject} allows suppression of access checks if
 * the necessary {@code ReflectPermission} is available.
 *
 * <p>{@code Array} provides static methods to dynamically create and
 * access arrays.
 *
 * <p>Classes in this package, along with {@code java.lang.Class}
 * accommodate applications such as debuggers, interpreters, object
 * inspectors, class browsers, and services such as Object
 * Serialization and JavaBeans that need access to either the public
 * members of a target object (based on its runtime class) or the
 * members declared by a given class.
 *
 * @since JDK1.1
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//package-info.java
package java.lang;

/**
 * Provides classes that are fundamental to the design of the Java
 * programming language. The most important classes are {@code
 * Object}, which is the root of the class hierarchy, and {@code
 * Class}, instances of which represent classes at run time.
 *
 * <p>Frequently it is necessary to represent a value of primitive
 * type as if it were an object. The wrapper classes {@code Boolean},
 * {@code Character}, {@code Integer}, {@code Long}, {@code Float},
 * and {@code Double} serve this purpose.  An object of type {@code
 * Double}, for example, contains a field whose type is double,
 * representing that value in such a way that a reference to it can be
 * stored in a variable of reference type.  These classes also provide
 * a number of methods for converting among primitive values, as well
 * as supporting such standard methods as equals and hashCode.  The
 * {@code Void} class is a non-instantiable class that holds a
 * reference to a {@code Class} object representing the type void.
 *
 * <p>The class {@code Math} provides commonly used mathematical
 * functions such as sine, cosine, and square root. The classes {@code
 * String}, {@code StringBuffer}, and {@code StringBuilder} similarly
 * provide commonly used operations on character strings.
 *
 * <p>Classes {@code ClassLoader}, {@code Process}, {@code
 * ProcessBuilder}, {@code Runtime}, {@code SecurityManager}, and
 * {@code System} provide "system operations" that manage the dynamic
 * loading of classes, creation of external processes, host
 * environment inquiries such as the time of day, and enforcement of
 * security policies.
 *
 * <p>Class {@code Throwable} encompasses objects that may be thrown
 * by the {@code throw} statement. Subclasses of {@code Throwable}
 * represent errors and exceptions.
 *
 * <a name="charenc"></a>
 * <h3>Character Encodings</h3>
 *
 * The specification of the {@link java.nio.charset.Charset
 * java.nio.charset.Charset} class describes the naming conventions
 * for character encodings as well as the set of standard encodings
 * that must be supported by every implementation of the Java
 * platform.
 *
 * @since JDK1.0
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//annotation/package-info.java
package java.lang.annotation;

/**
 * Provides library support for the Java programming language
 * annotation facility.
 *
 * @author Josh Bloch
 * @since 1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/package-info.java
package java.lang.invoke;

/**
 * The {@code java.lang.invoke} package contains dynamic language support provided directly by
 * the Java core class libraries and virtual machine.
 *
 * <p>
 * As described in the Java Virtual Machine Specification,
 * certain types in this package have special relations to dynamic
 * language support in the virtual machine:
 * <ul>
 * <li>The class {@link java.lang.invoke.MethodHandle MethodHandle} contains
 * <a href="MethodHandle.html#sigpoly">signature polymorphic methods</a>
 * which can be linked regardless of their type descriptor.
 * Normally, method linkage requires exact matching of type descriptors.
 * </li>
 *
 * <li>The JVM bytecode format supports immediate constants of
 * the classes {@link java.lang.invoke.MethodHandle MethodHandle} and {@link java.lang.invoke.MethodType MethodType}.
 * </li>
 * </ul>
 *
 * <h1><a name="jvm_mods"></a>Summary of relevant Java Virtual Machine changes</h1>
 * The following low-level information summarizes relevant parts of the
 * Java Virtual Machine specification.  For full details, please see the
 * current version of that specification.
 *
 * Each occurrence of an {@code invokedynamic} instruction is called a <em>dynamic call site</em>.
 * <h2><a name="indyinsn"></a>{@code invokedynamic} instructions</h2>
 * A dynamic call site is originally in an unlinked state.  In this state, there is
 * no target method for the call site to invoke.
 * <p>
 * Before the JVM can execute a dynamic call site (an {@code invokedynamic} instruction),
 * the call site must first be <em>linked</em>.
 * Linking is accomplished by calling a <em>bootstrap method</em>
 * which is given the static information content of the call site,
 * and which must produce a {@link java.lang.invoke.MethodHandle method handle}
 * that gives the behavior of the call site.
 * <p>
 * Each {@code invokedynamic} instruction statically specifies its own
 * bootstrap method as a constant pool reference.
 * The constant pool reference also specifies the call site's name and type descriptor,
 * just like {@code invokevirtual} and the other invoke instructions.
 * <p>
 * Linking starts with resolving the constant pool entry for the
 * bootstrap method, and resolving a {@link java.lang.invoke.MethodType MethodType} object for
 * the type descriptor of the dynamic call site.
 * This resolution process may trigger class loading.
 * It may therefore throw an error if a class fails to load.
 * This error becomes the abnormal termination of the dynamic
 * call site execution.
 * Linkage does not trigger class initialization.
 * <p>
 * The bootstrap method is invoked on at least three values:
 * <ul>
 * <li>a {@code MethodHandles.Lookup}, a lookup object on the <em>caller class</em> in which dynamic call site occurs </li>
 * <li>a {@code String}, the method name mentioned in the call site </li>
 * <li>a {@code MethodType}, the resolved type descriptor of the call </li>
 * <li>optionally, between 1 and 251 additional static arguments taken from the constant pool </li>
 * </ul>
 * Invocation is as if by
 * {@link java.lang.invoke.MethodHandle#invoke MethodHandle.invoke}.
 * The returned result must be a {@link java.lang.invoke.CallSite CallSite} (or a subclass).
 * The type of the call site's target must be exactly equal to the type
 * derived from the dynamic call site's type descriptor and passed to
 * the bootstrap method.
 * The call site then becomes permanently linked to the dynamic call site.
 * <p>
 * As documented in the JVM specification, all failures arising from
 * the linkage of a dynamic call site are reported
 * by a {@link java.lang.BootstrapMethodError BootstrapMethodError},
 * which is thrown as the abnormal termination of the dynamic call
 * site execution.
 * If this happens, the same error will the thrown for all subsequent
 * attempts to execute the dynamic call site.
 *
 * <h2>timing of linkage</h2>
 * A dynamic call site is linked just before its first execution.
 * The bootstrap method call implementing the linkage occurs within
 * a thread that is attempting a first execution.
 * <p>
 * If there are several such threads, the bootstrap method may be
 * invoked in several threads concurrently.
 * Therefore, bootstrap methods which access global application
 * data must take the usual precautions against race conditions.
 * In any case, every {@code invokedynamic} instruction is either
 * unlinked or linked to a unique {@code CallSite} object.
 * <p>
 * In an application which requires dynamic call sites with individually
 * mutable behaviors, their bootstrap methods should produce distinct
 * {@link java.lang.invoke.CallSite CallSite} objects, one for each linkage request.
 * Alternatively, an application can link a single {@code CallSite} object
 * to several {@code invokedynamic} instructions, in which case
 * a change to the target method will become visible at each of
 * the instructions.
 * <p>
 * If several threads simultaneously execute a bootstrap method for a single dynamic
 * call site, the JVM must choose one {@code CallSite} object and install it visibly to
 * all threads.  Any other bootstrap method calls are allowed to complete, but their
 * results are ignored, and their dynamic call site invocations proceed with the originally
 * chosen target object.

 * <p style="font-size:smaller;">
 * <em>Discussion:</em>
 * These rules do not enable the JVM to duplicate dynamic call sites,
 * or to issue &ldquo;causeless&rdquo; bootstrap method calls.
 * Every dynamic call site transitions at most once from unlinked to linked,
 * just before its first invocation.
 * There is no way to undo the effect of a completed bootstrap method call.
 *
 * <h2>types of bootstrap methods</h2>
 * As long as each bootstrap method can be correctly invoked
 * by {@code MethodHandle.invoke}, its detailed type is arbitrary.
 * For example, the first argument could be {@code Object}
 * instead of {@code MethodHandles.Lookup}, and the return type
 * could also be {@code Object} instead of {@code CallSite}.
 * (Note that the types and number of the stacked arguments limit
 * the legal kinds of bootstrap methods to appropriately typed
 * static methods and constructors of {@code CallSite} subclasses.)
 * <p>
 * If a given {@code invokedynamic} instruction specifies no static arguments,
 * the instruction's bootstrap method will be invoked on three arguments,
 * conveying the instruction's caller class, name, and method type.
 * If the {@code invokedynamic} instruction specifies one or more static arguments,
 * those values will be passed as additional arguments to the method handle.
 * (Note that because there is a limit of 255 arguments to any method,
 * at most 251 extra arguments can be supplied, since the bootstrap method
 * handle itself and its first three arguments must also be stacked.)
 * The bootstrap method will be invoked as if by either {@code MethodHandle.invoke}
 * or {@code invokeWithArguments}.  (There is no way to tell the difference.)
 * <p>
 * The normal argument conversion rules for {@code MethodHandle.invoke} apply to all stacked arguments.
 * For example, if a pushed value is a primitive type, it may be converted to a reference by boxing conversion.
 * If the bootstrap method is a variable arity method (its modifier bit {@code 0x0080} is set),
 * then some or all of the arguments specified here may be collected into a trailing array parameter.
 * (This is not a special rule, but rather a useful consequence of the interaction
 * between {@code CONSTANT_MethodHandle} constants, the modifier bit for variable arity methods,
 * and the {@link java.lang.invoke.MethodHandle#asVarargsCollector asVarargsCollector} transformation.)
 * <p>
 * Given these rules, here are examples of legal bootstrap method declarations,
 * given various numbers {@code N} of extra arguments.
 * The first rows (marked {@code *}) will work for any number of extra arguments.
 * <table border=1 cellpadding=5 summary="Static argument types">
 * <tr><th>N</th><th>sample bootstrap method</th></tr>
 * <tr><td>*</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, Object... args)</code></td></tr>
 * <tr><td>*</td><td><code>CallSite bootstrap(Object... args)</code></td></tr>
 * <tr><td>*</td><td><code>CallSite bootstrap(Object caller, Object... nameAndTypeWithArgs)</code></td></tr>
 * <tr><td>0</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type)</code></td></tr>
 * <tr><td>0</td><td><code>CallSite bootstrap(Lookup caller, Object... nameAndType)</code></td></tr>
 * <tr><td>1</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, Object arg)</code></td></tr>
 * <tr><td>2</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, Object... args)</code></td></tr>
 * <tr><td>2</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, String... args)</code></td></tr>
 * <tr><td>2</td><td><code>CallSite bootstrap(Lookup caller, String name, MethodType type, String x, int y)</code></td></tr>
 * </table>
 * The last example assumes that the extra arguments are of type
 * {@code CONSTANT_String} and {@code CONSTANT_Integer}, respectively.
 * The second-to-last example assumes that all extra arguments are of type
 * {@code CONSTANT_String}.
 * The other examples work with all types of extra arguments.
 * <p>
 * As noted above, the actual method type of the bootstrap method can vary.
 * For example, the fourth argument could be {@code MethodHandle},
 * if that is the type of the corresponding constant in
 * the {@code CONSTANT_InvokeDynamic} entry.
 * In that case, the {@code MethodHandle.invoke} call will pass the extra method handle
 * constant as an {@code Object}, but the type matching machinery of {@code MethodHandle.invoke}
 * will cast the reference back to {@code MethodHandle} before invoking the bootstrap method.
 * (If a string constant were passed instead, by badly generated code, that cast would then fail,
 * resulting in a {@code BootstrapMethodError}.)
 * <p>
 * Note that, as a consequence of the above rules, the bootstrap method may accept a primitive
 * argument, if it can be represented by a constant pool entry.
 * However, arguments of type {@code boolean}, {@code byte}, {@code short}, or {@code char}
 * cannot be created for bootstrap methods, since such constants cannot be directly
 * represented in the constant pool, and the invocation of the bootstrap method will
 * not perform the necessary narrowing primitive conversions.
 * <p>
 * Extra bootstrap method arguments are intended to allow language implementors
 * to safely and compactly encode metadata.
 * In principle, the name and extra arguments are redundant,
 * since each call site could be given its own unique bootstrap method.
 * Such a practice is likely to produce large class files and constant pools.
 *
 * @author John Rose, JSR 292 EG
 * @since 1.7
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/package-info.java
package java.lang.reflect;

/**
 * Provides classes and interfaces for obtaining reflective
 * information about classes and objects.  Reflection allows
 * programmatic access to information about the fields, methods and
 * constructors of loaded classes, and the use of reflected fields,
 * methods, and constructors to operate on their underlying
 * counterparts, within security restrictions.
 *
 * <p>{@code AccessibleObject} allows suppression of access checks if
 * the necessary {@code ReflectPermission} is available.
 *
 * <p>{@code Array} provides static methods to dynamically create and
 * access arrays.
 *
 * <p>Classes in this package, along with {@code java.lang.Class}
 * accommodate applications such as debuggers, interpreters, object
 * inspectors, class browsers, and services such as Object
 * Serialization and JavaBeans that need access to either the public
 * members of a target object (based on its runtime class) or the
 * members declared by a given class.
 *
 * @since JDK1.1
 */
