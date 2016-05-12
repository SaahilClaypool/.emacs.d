_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/package-info.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/package-info.java
@jdk.Exported

/**
 * Provides interfaces to represent documentation comments as abstract syntax
 * trees (AST).
 *
 * @author Jonathan Gibbons
 * @since 1.8
 * @see <a href="https://docs.oracle.com/javase/6/docs/technotes/tools/solaris/javadoc.html#javadoctags">https://docs.oracle.com/javase/6/docs/technotes/tools/solaris/javadoc.html#javadoctags</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/package-info.java
@jdk.Exported

/**
 * Provides interfaces to represent source code as abstract syntax
 * trees (AST).
 *
 * @author Peter von der Ah&eacute;
 * @author Jonathan Gibbons
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/package-info.java
@jdk.Exported

/**
 * Provides utilities for operations on abstract syntax trees (AST).
 *
 * @author Peter von der Ah&eacute;
 * @author Jonathan Gibbons
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/package-info.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/annotation/package-info.java
package java.lang.annotation;

/**
 * Provides library support for the Java programming language
 * annotation facility.
 *
 * @author Josh Bloch
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/package-info.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/package-info.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/package-info.java
@jdk.Exported

/**
 * Provides interfaces to represent documentation comments as abstract syntax
 * trees (AST).
 *
 * @author Jonathan Gibbons
 * @since 1.8
 * @see <a href="https://docs.oracle.com/javase/6/docs/technotes/tools/solaris/javadoc.html#javadoctags">https://docs.oracle.com/javase/6/docs/technotes/tools/solaris/javadoc.html#javadoctags</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/package-info.java
@jdk.Exported

/**
 * Provides interfaces to represent source code as abstract syntax
 * trees (AST).
 *
 * @author Peter von der Ah&eacute;
 * @author Jonathan Gibbons
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/package-info.java
@jdk.Exported

/**
 * Provides utilities for operations on abstract syntax trees (AST).
 *
 * @author Peter von der Ah&eacute;
 * @author Jonathan Gibbons
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/package-info.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/annotation/package-info.java
package java.lang.annotation;

/**
 * Provides library support for the Java programming language
 * annotation facility.
 *
 * @author Josh Bloch
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/package-info.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/package-info.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/package-info.java
package java.math;

/**
 * Provides classes for performing arbitrary-precision integer
 * arithmetic ({@code BigInteger}) and arbitrary-precision decimal
 * arithmetic ({@code BigDecimal}).  {@code BigInteger} is analogous
 * to the primitive integer types except that it provides arbitrary
 * precision, hence operations on {@code BigInteger}s do not overflow
 * or lose precision.  In addition to standard arithmetic operations,
 * {@code BigInteger} provides modular arithmetic, GCD calculation,
 * primality testing, prime generation, bit manipulation, and a few
 * other miscellaneous operations.
 *
 * {@code BigDecimal} provides arbitrary-precision signed decimal
 * numbers suitable for currency calculations and the like.  {@code
 * BigDecimal} gives the user complete control over rounding behavior,
 * allowing the user to choose from a comprehensive set of eight
 * rounding modes.
 *
 * @since JDK1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/package-info.java
package java.net;

/**
 * Provides the classes for implementing networking applications.
 *
 * <p> The java.net package can be roughly divided in two sections:</p>
 * <ul>
 *     <li><p><i>A Low Level API</i>, which deals with the
 *               following abstractions:</p>
 *     <ul>
 *       <li><p><i>Addresses</i>, which are networking identifiers,
 *              like IP addresses.</p></li>
 *       <li><p><i>Sockets</i>, which are basic bidirectional data communication
 *              mechanisms.</p></li>
 *       <li><p><i>Interfaces</i>, which describe network interfaces. </p></li>
 *     </ul></li>
 *     <li> <p><i>A High Level API</i>, which deals with the following
 *          abstractions:</p>
 *     <ul>
 *       <li><p><i>URIs</i>, which represent
 *               Universal Resource Identifiers.</p></li>
 *       <li><p><i>URLs</i>, which represent
 *               Universal Resource Locators.</p></li>
 *       <li><p><i>Connections</i>, which represents connections to the resource
 *               pointed to by <i>URLs</i>.</p></li>
 *       </ul></li>
 * </ul>
 * <h2>Addresses</h2>
 * <p>Addresses are used throughout the java.net APIs as either host
 *    identifiers, or socket endpoint identifiers.</p>
 * <p>The {@link java.net.InetAddress} class is the abstraction representing an
 *    IP (Internet Protocol) address.  It has two subclasses:
 * <ul>
 *       <li>{@link java.net.Inet4Address} for IPv4 addresses.</li>
 *       <li>{@link java.net.Inet6Address} for IPv6 addresses.</li>
 * </ul>
 * <p>But, in most cases, there is no need to deal directly with the subclasses,
 *    as the InetAddress abstraction should cover most of the needed
 *    functionality.</p>
 * <h3><b>About IPv6</b></h3>
 * <p>Not all systems have support for the IPv6 protocol, and while the Java
 *    networking stack will attempt to detect it and use it transparently when
 *    available, it is also possible to disable its use with a system property.
 *    In the case where IPv6 is not available, or explicitly disabled,
 *    Inet6Address are not valid arguments for most networking operations any
 *    more. While methods like {@link java.net.InetAddress#getByName} are
 *    guaranteed not to return an Inet6Address when looking up host names, it
 *    is possible, by passing literals, to create such an object. In which
 *    case, most methods, when called with an Inet6Address will throw an
 *    Exception.</p>
 * <h2>Sockets</h2>
 * <p>Sockets are means to establish a communication link between machines over
 *    the network. The java.net package provides 4 kinds of Sockets:</p>
 * <ul>
 *       <li>{@link java.net.Socket} is a TCP client API, and will typically
 *            be used to {@linkplain java.net.Socket#connect(SocketAddress)
 *            connect} to a remote host.</li>
 *       <li>{@link java.net.ServerSocket} is a TCP server API, and will
 *            typically {@linkplain java.net.ServerSocket#accept accept}
 *            connections from client sockets.</li>
 *       <li>{@link java.net.DatagramSocket} is a UDP endpoint API and is used
 *            to {@linkplain java.net.DatagramSocket#send send} and
 *            {@linkplain java.net.DatagramSocket#receive receive}
 *            {@linkplain java.net.DatagramPacket datagram packets}.</li>
 *       <li>{@link java.net.MulticastSocket} is a subclass of
 *            {@code DatagramSocket} used when dealing with multicast
 *            groups.</li>
 * </ul>
 * <p>Sending and receiving with TCP sockets is done through InputStreams and
 *    OutputStreams which can be obtained via the
 *    {@link java.net.Socket#getInputStream} and
 *    {@link java.net.Socket#getOutputStream} methods.</p>
 * <h2>Interfaces</h2>
 * <p>The {@link java.net.NetworkInterface} class provides APIs to browse and
 *    query all the networking interfaces (e.g. ethernet connection or PPP
 *    endpoint) of the local machine. It is through that class that you can
 *    check if any of the local interfaces is configured to support IPv6.</p>
 * <p>Note, all conforming implementations must support at least one
 *    {@code NetworkInterface} object, which must either be connected to a
 *    network, or be a "loopback" interface that can only communicate with
 *    entities on the same machine.</p>
 *
 * <h2>High level API</h2>
 * <p>A number of classes in the java.net package do provide for a much higher
 *    level of abstraction and allow for easy access to resources on the
 *    network. The classes are:
 * <ul>
 *       <li>{@link java.net.URI} is the class representing a
 *            Universal Resource Identifier, as specified in RFC 2396.
 *            As the name indicates, this is just an Identifier and doesn't
 *            provide directly the means to access the resource.</li>
 *       <li>{@link java.net.URL} is the class representing a
 *            Universal Resource Locator, which is both an older concept for
 *            URIs and a means to access the resources.</li>
 *       <li>{@link java.net.URLConnection} is created from a URL and is the
 *            communication link used to access the resource pointed by the
 *            URL. This abstract class will delegate most of the work to the
 *            underlying protocol handlers like http or https.</li>
 *       <li>{@link java.net.HttpURLConnection} is a subclass of URLConnection
 *            and provides some additional functionalities specific to the
 *            HTTP protocol.</li>
 * </ul>
 * <p>The recommended usage is to use {@link java.net.URI} to identify
 *    resources, then convert it into a {@link java.net.URL} when it is time to
 *    access the resource. From that URL, you can either get the
 *    {@link java.net.URLConnection} for fine control, or get directly the
 *    InputStream.
 * <p>Here is an example:</p>
 * <pre>
 * URI uri = new URI("http://java.sun.com/");
 * URL url = uri.toURL();
 * InputStream in = url.openStream();
 * </pre>
 * <h2>Protocol Handlers</h2>
 * As mentioned, URL and URLConnection rely on protocol handlers which must be
 * present, otherwise an Exception is thrown. This is the major difference with
 * URIs which only identify resources, and therefore don't need to have access
 * to the protocol handler. So, while it is possible to create an URI with any
 * kind of protocol scheme (e.g. {@code myproto://myhost.mydomain/resource/}),
 * a similar URL will try to instantiate the handler for the specified protocol;
 * if it doesn't exist an exception will be thrown.
 * <p>By default the protocol handlers are loaded dynamically from the default
 *    location. It is, however, possible to add to the search path by setting
 *    the {@code java.protocol.handler.pkgs} system property. For instance if
 *    it is set to {@code myapp.protocols}, then the URL code will try, in the
 *    case of http, first to load {@code myapp.protocols.http.Handler}, then,
 *    if this fails, {@code http.Handler} from the default location.
 * <p>Note that the Handler class <b>has to</b> be a subclass of the abstract
 *    class {@link java.net.URLStreamHandler}.</p>
 * <h2>Additional Specification</h2>
 * <ul>
 *       <li><a href="doc-files/net-properties.html">
 *            Networking System Properties</a></li>
 * </ul>
 *
 * @since JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/package-info.java
package java.nio.channels;

/**
 * Defines channels, which represent connections to entities that are capable of
 * performing I/O operations, such as files and sockets; defines selectors, for
 * multiplexed, non-blocking I/O operations.
 *
 * <a name="channels"></a>
 *
 * <blockquote><table cellspacing=1 cellpadding=0 summary="Lists channels and their descriptions">
 * <tr><th align="left">Channels</th><th align="left">Description</th></tr>
 * <tr><td valign=top><tt><i>{@link java.nio.channels.Channel}</i></tt></td>
 *     <td>A nexus for I/O operations</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;<i>{@link java.nio.channels.ReadableByteChannel}</i></tt></td>
 *     <td>Can read into a buffer</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;&nbsp;&nbsp;<i>{@link java.nio.channels.ScatteringByteChannel}&nbsp;&nbsp;</i></tt></td>
 *     <td>Can read into a sequence of&nbsp;buffers</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;<i>{@link java.nio.channels.WritableByteChannel}</i></tt></td>
 *     <td>Can write from a buffer</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;&nbsp;&nbsp;<i>{@link java.nio.channels.GatheringByteChannel}</i></tt></td>
 *     <td>Can write from a sequence of&nbsp;buffers</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;<i>{@link java.nio.channels.ByteChannel}</i></tt></td>
 *     <td>Can read/write to/from a&nbsp;buffer</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;&nbsp;&nbsp;<i>{@link java.nio.channels.SeekableByteChannel}</i></tt></td>
 *     <td>A {@code ByteChannel} connected to an entity that contains a variable-length sequence of bytes</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;<i>{@link java.nio.channels.AsynchronousChannel}</i></tt></td>
 *     <td>Supports asynchronous I/O operations.</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;&nbsp;&nbsp;<i>{@link java.nio.channels.AsynchronousByteChannel}</i></tt></td>
 *     <td>Can read and write bytes asynchronously</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;<i>{@link java.nio.channels.NetworkChannel}</i></tt></td>
 *     <td>A channel to a network socket</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;&nbsp;&nbsp;<i>{@link java.nio.channels.MulticastChannel}</i></tt></td>
 *     <td>Can join Internet Protocol (IP) multicast groups</td></tr>
 * <tr><td valign=top><tt>{@link java.nio.channels.Channels}</tt></td>
 *     <td>Utility methods for channel/stream interoperation</td></tr>
 * </table></blockquote>
 *
 * <p> A <i>channel</i> represents an open connection to an entity such as a
 * hardware device, a file, a network socket, or a program component that is
 * capable of performing one or more distinct I/O operations, for example reading
 * or writing.  As specified in the {@link java.nio.channels.Channel} interface,
 * channels are either open or closed, and they are both <i>asynchronously
 * closeable</i> and <i>interruptible</i>.
 *
 * <p> The {@link java.nio.channels.Channel} interface is extended by several
 * other interfaces.
 *
 * <p> The {@link java.nio.channels.ReadableByteChannel} interface specifies a
 * {@link java.nio.channels.ReadableByteChannel#read read} method that reads bytes
 * from the channel into a buffer; similarly, the {@link
 * java.nio.channels.WritableByteChannel} interface specifies a {@link
 * java.nio.channels.WritableByteChannel#write write} method that writes bytes
 * from a buffer to the channel. The {@link java.nio.channels.ByteChannel}
 * interface unifies these two interfaces for the common case of channels that can
 * both read and write bytes. The {@link java.nio.channels.SeekableByteChannel}
 * interface extends the {@code ByteChannel} interface with methods to {@link
 * java.nio.channels.SeekableByteChannel#position() query} and {@link
 * java.nio.channels.SeekableByteChannel#position(long) modify} the channel's
 * current position, and its {@link java.nio.channels.SeekableByteChannel#size
 * size}.
 *
 * <p> The {@link java.nio.channels.ScatteringByteChannel} and {@link
 * java.nio.channels.GatheringByteChannel} interfaces extend the {@link
 * java.nio.channels.ReadableByteChannel} and {@link
 * java.nio.channels.WritableByteChannel} interfaces, respectively, adding {@link
 * java.nio.channels.ScatteringByteChannel#read read} and {@link
 * java.nio.channels.GatheringByteChannel#write write} methods that take a
 * sequence of buffers rather than a single buffer.
 *
 * <p> The {@link java.nio.channels.NetworkChannel} interface specifies methods
 * to {@link java.nio.channels.NetworkChannel#bind bind} the channel's socket,
 * obtain the address to which the socket is bound, and methods to {@link
 * java.nio.channels.NetworkChannel#getOption get} and {@link
 * java.nio.channels.NetworkChannel#setOption set} socket options. The {@link
 * java.nio.channels.MulticastChannel} interface specifies methods to join
 * Internet Protocol (IP) multicast groups.
 *
 * <p> The {@link java.nio.channels.Channels} utility class defines static methods
 * that support the interoperation of the stream classes of the <tt>{@link
 * java.io}</tt> package with the channel classes of this package.  An appropriate
 * channel can be constructed from an {@link java.io.InputStream} or an {@link
 * java.io.OutputStream}, and conversely an {@link java.io.InputStream} or an
 * {@link java.io.OutputStream} can be constructed from a channel.  A {@link
 * java.io.Reader} can be constructed that uses a given charset to decode bytes
 * from a given readable byte channel, and conversely a {@link java.io.Writer} can
 * be constructed that uses a given charset to encode characters into bytes and
 * write them to a given writable byte channel.
 *
 * <blockquote><table cellspacing=1 cellpadding=0 summary="Lists file channels and their descriptions">
 * <tr><th align="left">File channels</th><th align="left">Description</th></tr>
 * <tr><td valign=top><tt>{@link java.nio.channels.FileChannel}</tt></td>
 *     <td>Reads, writes, maps, and manipulates files</td></tr>
 * <tr><td valign=top><tt>{@link java.nio.channels.FileLock}</tt></td>
 *     <td>A lock on a (region of a) file</td></tr>
 * <tr><td valign=top><tt>{@link java.nio.MappedByteBuffer}&nbsp;&nbsp;</tt></td>
 *     <td>A direct byte buffer mapped to a region of a&nbsp;file</td></tr>
 * </table></blockquote>
 *
 * <p> The {@link java.nio.channels.FileChannel} class supports the usual
 * operations of reading bytes from, and writing bytes to, a channel connected to
 * a file, as well as those of querying and modifying the current file position
 * and truncating the file to a specific size.  It defines methods for acquiring
 * locks on the whole file or on a specific region of a file; these methods return
 * instances of the {@link java.nio.channels.FileLock} class.  Finally, it defines
 * methods for forcing updates to the file to be written to the storage device that
 * contains it, for efficiently transferring bytes between the file and other
 * channels, and for mapping a region of the file directly into memory.
 *
 * <p> A {@code FileChannel} is created by invoking one of its static {@link
 * java.nio.channels.FileChannel#open open} methods, or by invoking the {@code
 * getChannel} method of a {@link java.io.FileInputStream}, {@link
 * java.io.FileOutputStream}, or {@link java.io.RandomAccessFile} to return a
 * file channel connected to the same underlying file as the <tt>{@link java.io}</tt>
 * class.
 *
 * <a name="multiplex"></a>
 * <blockquote><table cellspacing=1 cellpadding=0 summary="Lists multiplexed, non-blocking channels and their descriptions">
 * <tr><th align="left">Multiplexed, non-blocking I/O</th><th align="left"><p>Description</th></tr>
 * <tr><td valign=top><tt>{@link java.nio.channels.SelectableChannel}</tt></td>
 *     <td>A channel that can be multiplexed</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;{@link java.nio.channels.DatagramChannel}</tt></td>
 *     <td>A channel to a datagram-oriented socket</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;{@link java.nio.channels.Pipe.SinkChannel}</tt></td>
 *     <td>The write end of a pipe</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;{@link java.nio.channels.Pipe.SourceChannel}</tt></td>
 *     <td>The read end of a pipe</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;{@link java.nio.channels.ServerSocketChannel}&nbsp;&nbsp;</tt></td>
 *     <td>A channel to a stream-oriented listening socket</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;{@link java.nio.channels.SocketChannel}</tt></td>
 *     <td>A channel for a stream-oriented connecting socket</td></tr>
 * <tr><td valign=top><tt>{@link java.nio.channels.Selector}</tt></td>
 *     <td>A multiplexor of selectable channels</td></tr>
 * <tr><td valign=top><tt>{@link java.nio.channels.SelectionKey}</tt></td>
 *     <td>A token representing the registration <br> of a channel
 *     with&nbsp;a&nbsp;selector</td></tr>
 * <tr><td valign=top><tt>{@link java.nio.channels.Pipe}</tt></td>
 *     <td>Two channels that form a unidirectional&nbsp;pipe</td></tr>
 * </table></blockquote>
 *
 * <p> Multiplexed, non-blocking I/O, which is much more scalable than
 * thread-oriented, blocking I/O, is provided by <i>selectors</i>, <i>selectable
 * channels</i>, and <i>selection keys</i>.
 *
 * <p> A <a href="Selector.html"><i>selector</i></a> is a multiplexor of <a
 * href="SelectableChannel.html"><i>selectable channels</i></a>, which in turn are
 * a special type of channel that can be put into <a
 * href="SelectableChannel.html#bm"><i>non-blocking mode</i></a>.  To perform
 * multiplexed I/O operations, one or more selectable channels are first created,
 * put into non-blocking mode, and {@link
 * java.nio.channels.SelectableChannel#register <i>registered</i>}
 * with a selector.  Registering a channel specifies the set of I/O operations
 * that will be tested for readiness by the selector, and returns a <a
 * href="SelectionKey.html"><i>selection key</i></a> that represents the
 * registration.
 *
 * <p> Once some channels have been registered with a selector, a <a
 * href="Selector.html#selop"><i>selection operation</i></a> can be performed in
 * order to discover which channels, if any, have become ready to perform one or
 * more of the operations in which interest was previously declared.  If a channel
 * is ready then the key returned when it was registered will be added to the
 * selector's <i>selected-key set</i>.  The key set, and the keys within it, can
 * be examined in order to determine the operations for which each channel is
 * ready.  From each key one can retrieve the corresponding channel in order to
 * perform whatever I/O operations are required.
 *
 * <p> That a selection key indicates that its channel is ready for some operation
 * is a hint, but not a guarantee, that such an operation can be performed by a
 * thread without causing the thread to block.  It is imperative that code that
 * performs multiplexed I/O be written so as to ignore these hints when they prove
 * to be incorrect.
 *
 * <p> This package defines selectable-channel classes corresponding to the {@link
 * java.net.DatagramSocket}, {@link java.net.ServerSocket}, and {@link
 * java.net.Socket} classes defined in the <tt>{@link java.net}</tt> package.
 * Minor changes to these classes have been made in order to support sockets that
 * are associated with channels.  This package also defines a simple class that
 * implements unidirectional pipes.  In all cases, a new selectable channel is
 * created by invoking the static <tt>open</tt> method of the corresponding class.
 * If a channel needs an associated socket then a socket will be created as a side
 * effect of this operation.
 *
 * <p> The implementation of selectors, selectable channels, and selection keys
 * can be replaced by "plugging in" an alternative definition or instance of the
 * {@link java.nio.channels.spi.SelectorProvider} class defined in the <tt>{@link
 * java.nio.channels.spi}</tt> package.  It is not expected that many developers
 * will actually make use of this facility; it is provided primarily so that
 * sophisticated users can take advantage of operating-system-specific
 * I/O-multiplexing mechanisms when very high performance is required.
 *
 * <p> Much of the bookkeeping and synchronization required to implement the
 * multiplexed-I/O abstractions is performed by the {@link
 * java.nio.channels.spi.AbstractInterruptibleChannel}, {@link
 * java.nio.channels.spi.AbstractSelectableChannel}, {@link
 * java.nio.channels.spi.AbstractSelectionKey}, and {@link
 * java.nio.channels.spi.AbstractSelector} classes in the <tt>{@link
 * java.nio.channels.spi}</tt> package.  When defining a custom selector provider,
 * only the {@link java.nio.channels.spi.AbstractSelector} and {@link
 * java.nio.channels.spi.AbstractSelectionKey} classes should be subclassed
 * directly; custom channel classes should extend the appropriate {@link
 * java.nio.channels.SelectableChannel} subclasses defined in this package.
 *
 * <a name="async"></a>
 *
 * <blockquote><table cellspacing=1 cellpadding=0 summary="Lists asynchronous channels and their descriptions">
 * <tr><th align="left">Asynchronous I/O</th><th align="left">Description</th></tr>
 * <tr><td valign=top><tt>{@link java.nio.channels.AsynchronousFileChannel}</tt></td>
 *     <td>An asynchronous channel for reading, writing, and manipulating a file</td></tr>
 * <tr><td valign=top><tt>{@link java.nio.channels.AsynchronousSocketChannel}</tt></td>
 *     <td>An asynchronous channel to a stream-oriented connecting socket</td></tr>
 * <tr><td valign=top><tt>{@link java.nio.channels.AsynchronousServerSocketChannel}&nbsp;&nbsp;</tt></td>
 *     <td>An asynchronous channel to a stream-oriented listening socket</td></tr>
 * <tr><td valign=top><tt>{@link java.nio.channels.CompletionHandler}</tt></td>
 *     <td>A handler for consuming the result of an asynchronous operation</td></tr>
 * <tr><td valign=top><tt>{@link java.nio.channels.AsynchronousChannelGroup}</tt></td>
 *     <td>A grouping of asynchronous channels for the purpose of resource sharing</td></tr>
 * </table></blockquote>
 *
 * <p> {@link java.nio.channels.AsynchronousChannel Asynchronous channels} are a
 * special type of channel capable of asynchronous I/O operations. Asynchronous
 * channels are non-blocking and define methods to initiate asynchronous
 * operations, returning a {@link java.util.concurrent.Future} representing the
 * pending result of each operation. The {@code Future} can be used to poll or
 * wait for the result of the operation. Asynchronous I/O operations can also
 * specify a {@link java.nio.channels.CompletionHandler} to invoke when the
 * operation completes. A completion handler is user provided code that is executed
 * to consume the result of I/O operation.
 *
 * <p> This package defines asynchronous-channel classes that are connected to
 * a stream-oriented connecting or listening socket, or a datagram-oriented socket.
 * It also defines the {@link java.nio.channels.AsynchronousFileChannel} class
 * for asynchronous reading, writing, and manipulating a file. As with the {@link
 * java.nio.channels.FileChannel} it supports operations to truncate the file
 * to a specific size, force updates to the file to be written to the storage
 * device, or acquire locks on the whole file or on a specific region of the file.
 * Unlike the {@code FileChannel} it does not define methods for mapping a
 * region of the file directly into memory. Where memory mapped I/O is required,
 * then a {@code FileChannel} can be used.
 *
 * <p> Asynchronous channels are bound to an asynchronous channel group for the
 * purpose of resource sharing. A group has an associated {@link
 * java.util.concurrent.ExecutorService} to which tasks are submitted to handle
 * I/O events and dispatch to completion handlers that consume the result of
 * asynchronous operations performed on channels in the group. The group can
 * optionally be specified when creating the channel or the channel can be bound
 * to a <em>default group</em>. Sophisticated users may wish to create their
 * own asynchronous channel groups or configure the {@code ExecutorService}
 * that will be used for the default group.
 *
 * <p> As with selectors, the implementation of asynchronous channels can be
 * replaced by "plugging in" an alternative definition or instance of the {@link
 * java.nio.channels.spi.AsynchronousChannelProvider} class defined in the
 * <tt>{@link java.nio.channels.spi}</tt> package.  It is not expected that many
 * developers will actually make use of this facility; it is provided primarily
 * so that sophisticated users can take advantage of operating-system-specific
 * asynchronous I/O mechanisms when very high performance is required.
 *
 * <hr width="80%">
 * <p> Unless otherwise noted, passing a <tt>null</tt> argument to a constructor
 * or method in any class or interface in this package will cause a {@link
 * java.lang.NullPointerException NullPointerException} to be thrown.
 *
 * @since 1.4
 * @author Mark Reinhold
 * @author JSR-51 Expert Group
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/package-info.java
package java.nio.file;

/**
 * Defines interfaces and classes for the Java virtual machine to access files,
 * file attributes, and file systems.
 *
 * <p> The java.nio.file package defines classes to access files and file
 * systems. The API to access file and file system attributes is defined in the
 * {@link java.nio.file.attribute} package. The {@link java.nio.file.spi}
 * package is used by service provider implementors wishing to extend the
 * platform default provider, or to construct other provider implementations. </p>
 *
 * <h3><a name="links">Symbolic Links</a></h3>
 * <p> Many operating systems and file systems support for <em>symbolic links</em>.
 * A symbolic link is a special file that serves as a reference to another file.
 * For the most part, symbolic links are transparent to applications and
 * operations on symbolic links are automatically redirected to the <em>target</em>
 * of the link. Exceptions to this are when a symbolic link is deleted or
 * renamed/moved in which case the link is deleted or removed rather than the
 * target of the link. This package includes support for symbolic links where
 * implementations provide these semantics. File systems may support other types
 * that are semantically close but support for these other types of links is
 * not included in this package. </p>
 *
 * <h3><a name="interop">Interoperability</a></h3>
 * <p> The {@link java.io.File} class defines the {@link java.io.File#toPath
 * toPath} method to construct a {@link java.nio.file.Path} by converting
 * the abstract path represented by the {@code java.io.File} object. The resulting
 * {@code Path} can be used to operate on the same file as the {@code File}
 * object. The {@code Path} specification provides further information
 * on the <a href="Path.html#interop">interoperability</a> between {@code Path}
 * and {@code java.io.File} objects. </p>
 *
 * <h3>Visibility</h3>
 * <p> The view of the files and file system provided by classes in this package are
 * guaranteed to be consistent with other views provided by other instances in the
 * same Java virtual machine.  The view may or may not, however, be consistent with
 * the view of the file system as seen by other concurrently running programs due
 * to caching performed by the underlying operating system and delays induced by
 * network-filesystem protocols. This is true regardless of the language in which
 * these other programs are written, and whether they are running on the same machine
 * or on some other machine.  The exact nature of any such inconsistencies are
 * system-dependent and are therefore unspecified. </p>
 *
 * <h3><a name="integrity">Synchronized I/O File Integrity</a></h3>
 * <p> The {@link java.nio.file.StandardOpenOption#SYNC SYNC} and {@link
 * java.nio.file.StandardOpenOption#DSYNC DSYNC} options are used when opening a file
 * to require that updates to the file are written synchronously to the underlying
 * storage device. In the case of the default provider, and the file resides on
 * a local storage device, and the {@link java.nio.channels.SeekableByteChannel
 * seekable} channel is connected to a file that was opened with one of these
 * options, then an invocation of the {@link
 * java.nio.channels.WritableByteChannel#write(java.nio.ByteBuffer) write}
 * method is only guaranteed to return when all changes made to the file
 * by that invocation have been written to the device. These options are useful
 * for ensuring that critical information is not lost in the event of a system
 * crash. If the file does not reside on a local device then no such guarantee
 * is made. Whether this guarantee is possible with other {@link
 * java.nio.file.spi.FileSystemProvider provider} implementations is provider
 * specific. </p>
 *
 * <h3>General Exceptions</h3>
 * <p> Unless otherwise noted, passing a {@code null} argument to a constructor
 * or method of any class or interface in this package will cause a {@link
 * java.lang.NullPointerException NullPointerException} to be thrown. Additionally,
 * invoking a method with a collection containing a {@code null} element will
 * cause a {@code NullPointerException}, unless otherwise specified. </p>
 *
 * <p> Unless otherwise noted, methods that attempt to access the file system
 * will throw {@link java.nio.file.ClosedFileSystemException} when invoked on
 * objects associated with a {@link java.nio.file.FileSystem} that has been
 * {@link java.nio.file.FileSystem#close closed}. Additionally, any methods
 * that attempt write access to a file system will throw {@link
 * java.nio.file.ReadOnlyFileSystemException} when invoked on an object associated
 * with a {@link java.nio.file.FileSystem} that only provides read-only
 * access. </p>
 *
 * <p> Unless otherwise noted, invoking a method of any class or interface in
 * this package created by one {@link java.nio.file.spi.FileSystemProvider
 * provider} with a parameter that is an object created by another provider,
 * will throw {@link java.nio.file.ProviderMismatchException}. </p>
 *
 * <h3>Optional Specific Exceptions</h3>
 * Most of the methods defined by classes in this package that access the
 * file system specify that {@link java.io.IOException} be thrown when an I/O
 * error occurs. In some cases, these methods define specific I/O exceptions
 * for common cases. These exceptions, noted as <i>optional specific exceptions</i>,
 * are thrown by the implementation where it can detect the specific error.
 * Where the specific error cannot be detected then the more general {@code
 * IOException} is thrown.
 *
 * @since 1.7
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/package-info.java
package java.nio.file.attribute;

/**
 * Interfaces and classes providing access to file and file system attributes.
 *
 * <blockquote><table cellspacing=1 cellpadding=0 summary="Attribute views">
 * <tr><th align="left">Attribute views</th><th align="left">Description</th></tr>
 * <tr><td valign=top><tt><i>{@link java.nio.file.attribute.AttributeView}</i></tt></td>
 *     <td>Can read or update non-opaque values associated with objects in a file system</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;<i>{@link java.nio.file.attribute.FileAttributeView}</i></tt></td>
 *     <td>Can read or update file attributes</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;&nbsp;&nbsp;<i>{@link java.nio.file.attribute.BasicFileAttributeView}&nbsp;&nbsp;</i></tt></td>
 *     <td>Can read or update a basic set of file attributes</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i>{@link java.nio.file.attribute.PosixFileAttributeView}&nbsp;&nbsp;</i></tt></td>
 *     <td>Can read or update POSIX defined file attributes</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i>{@link java.nio.file.attribute.DosFileAttributeView}&nbsp;&nbsp;</i></tt></td>
 *     <td>Can read or update FAT file attributes</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;&nbsp;&nbsp;<i>{@link java.nio.file.attribute.FileOwnerAttributeView}&nbsp;&nbsp;</i></tt></td>
 *     <td>Can read or update the owner of a file</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i>{@link java.nio.file.attribute.AclFileAttributeView}&nbsp;&nbsp;</i></tt></td>
 *     <td>Can read or update Access Control Lists</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;&nbsp;&nbsp;<i>{@link java.nio.file.attribute.UserDefinedFileAttributeView}&nbsp;&nbsp;</i></tt></td>
 *     <td>Can read or update user-defined file attributes</td></tr>
 * <tr><td valign=top><tt>&nbsp;&nbsp;<i>{@link java.nio.file.attribute.FileStoreAttributeView}</i></tt></td>
 *     <td>Can read or update file system attributes</td></tr>
 * </table></blockquote>
 *
 * <p> An attribute view provides a read-only or updatable view of the non-opaque
 * values, or <em>metadata</em>, associated with objects in a file system.
 * The {@link java.nio.file.attribute.FileAttributeView} interface is
 * extended by several other interfaces that that views to specific sets of file
 * attributes. {@code FileAttributeViews} are selected by invoking the {@link
 * java.nio.file.Files#getFileAttributeView} method with a
 * <em>type-token</em> to identify the required view. Views can also be identified
 * by name. The {@link java.nio.file.attribute.FileStoreAttributeView} interface
 * provides access to file store attributes. A {@code FileStoreAttributeView} of
 * a given type is obtained by invoking the {@link
 * java.nio.file.FileStore#getFileStoreAttributeView} method.
 *
 * <p> The {@link java.nio.file.attribute.BasicFileAttributeView}
 * class defines methods to read and update a <em>basic</em> set of file
 * attributes that are common to many file systems.
 *
 * <p> The {@link java.nio.file.attribute.PosixFileAttributeView}
 * interface extends {@code BasicFileAttributeView} by defining methods
 * to access the file attributes commonly used by file systems and operating systems
 * that implement the Portable Operating System Interface (POSIX) family of
 * standards.
 *
 * <p> The {@link java.nio.file.attribute.DosFileAttributeView}
 * class extends {@code BasicFileAttributeView} by defining methods to
 * access the legacy "DOS" file attributes supported on file systems such as File
 * Allocation Tabl (FAT), commonly used in consumer devices.
 *
 * <p> The {@link java.nio.file.attribute.AclFileAttributeView}
 * class defines methods to read and write the Access Control List (ACL)
 * file attribute. The ACL model used by this file attribute view is based
 * on the model defined by <a href="http://www.ietf.org/rfc/rfc3530.txt">
 * <i>RFC&nbsp;3530: Network File System (NFS) version 4 Protocol</i></a>.
 *
 * <p> In addition to attribute views, this package also defines classes and
 * interfaces that are used when accessing attributes:
 *
 * <ul>
 *
 *   <li> The {@link java.nio.file.attribute.UserPrincipal} and
 *   {@link java.nio.file.attribute.GroupPrincipal} interfaces represent an
 *   identity or group identity. </li>
 *
 *   <li> The {@link java.nio.file.attribute.UserPrincipalLookupService}
 *   interface defines methods to lookup user or group principals. </li>
 *
 *   <li> The {@link java.nio.file.attribute.FileAttribute} interface
 *   represents the value of an attribute for cases where the attribute value is
 *   required to be set atomically when creating an object in the file system. </li>
 *
 * </ul>
 *
 *
 * <p> Unless otherwise noted, passing a <tt>null</tt> argument to a constructor
 * or method in any class or interface in this package will cause a {@link
 * java.lang.NullPointerException NullPointerException} to be thrown.
 *
 * @since 1.7
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/spi/package-info.java
package java.nio.file.spi;

/**
 * Service-provider classes for the <tt>{@link java.nio.file}</tt> package.
 *
 * <p> Only developers who are defining new file system providers or file type
 * detectors should need to make direct use of this package.  </p>
 *
 * <p> Unless otherwise noted, passing a <tt>null</tt> argument to a constructor
 * or method in any class or interface in this package will cause a {@link
 * java.lang.NullPointerException NullPointerException} to be thrown.
 *
 * @since 1.7
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/package-info.java
package java.security;

/**
 * Provides the classes and interfaces for the security framework.
 * This includes classes that implement an easily configurable,
 * fine-grained access control security architecture.
 * This package also supports
 * the generation and storage of cryptographic public key pairs,
 * as well as a number of exportable cryptographic operations
 * including those for message digest and signature generation.  Finally,
 * this package provides classes that support signed/guarded objects
 * and secure random number generation.
 *
 * Many of the classes provided in this package (the cryptographic
 * and secure random number generator classes in particular) are
 * provider-based.  The class itself defines a programming interface
 * to which applications may write.  The implementations themselves may
 * then be written by independent third-party vendors and plugged
 * in seamlessly as needed.  Therefore application developers may
 * take advantage of any number of provider-based implementations
 * without having to add or rewrite code.
 *
 * <h2>Package Specification</h2>
 *
 * <ul>
 *   <li><a href="{@docRoot}/../technotes/guides/security/crypto/CryptoSpec.html">
 *     <b>Java&trade;
 *     Cryptography Architecture (JCA) Reference Guide</b></a></li>
 *
 *   <li>PKCS #8: Private-Key Information Syntax Standard, Version 1.2,
 *     November 1993</li>
 *
 *   <li><a href="{@docRoot}/../technotes/guides/security/StandardNames.html">
 *     <b>Java&trade;
 *     Cryptography Architecture Standard Algorithm Name
 *     Documentation</b></a></li>
 * </ul>
 *
 * <h2>Related Documentation</h2>
 *
 * For further documentation, please see:
 * <ul>
 *   <li><a href=
 *     "{@docRoot}/../technotes/guides/security/spec/security-spec.doc.html">
 *     <b>Java&trade;
 *     SE Platform Security Architecture</b></a></li>
 *
 *   <li><a href=
 *     "{@docRoot}/../technotes/guides/security/crypto/HowToImplAProvider.html">
 *     <b>How to Implement a Provider in the
 *     Java&trade; Cryptography Architecture
 *     </b></a></li>
 *
 *   <li><a href=
 *     "{@docRoot}/../technotes/guides/security/PolicyFiles.html"><b>
 *     Default Policy Implementation and Policy File Syntax
 *     </b></a></li>
 *
 *   <li><a href=
 *     "{@docRoot}/../technotes/guides/security/permissions.html"><b>
 *     Permissions in the
 *     Java&trade; SE Development Kit (JDK)
 *     </b></a></li>
 *
 *   <li><a href=
 *     "{@docRoot}/../technotes/guides/security/SecurityToolsSummary.html"><b>
 *     Summary of Tools for
 *     Java&trade; Platform Security
 *     </b></a></li>
 *
 *   <li><b>keytool</b>
 *     (<a href="{@docRoot}/../technotes/tools/unix/keytool.html">
 *       for Solaris/Linux</a>)
 *     (<a href="{@docRoot}/../technotes/tools/windows/keytool.html">
 *       for Windows</a>)
 *     </li>
 *
 *   <li><b>jarsigner</b>
 *     (<a href="{@docRoot}/../technotes/tools/unix/jarsigner.html">
 *       for Solaris/Linux</a>)
 *     (<a href="{@docRoot}/../technotes/tools/windows/jarsigner.html">
 *       for Windows</a>)
 *     </li>
 *
 * </ul>
 *
 * @since 1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/acl/package-info.java
package java.security.acl;

/**
 * The classes and interfaces in this package have been
 * superseded by classes in the java.security package.
 * See that package and, for example, java.security.Permission for details.
 *
 * @since JDK1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/package-info.java
package java.security.cert;

/**
 * Provides classes and interfaces for parsing and managing
 * certificates, certificate revocation lists (CRLs), and
 * certification paths. It contains support for X.509 v3
 * certificates and X.509 v2 CRLs.
 *
 * <h2>Package Specification</h2>
 *
 * <ul>
 *   <li><a href="{@docRoot}/../technotes/guides/security/crypto/CryptoSpec.html">
 *     <b>Java&trade;
 *     Cryptography Architecture (JCA) Reference Guide</b></a>
 *   <li>RFC 5280: Internet X.509 Public Key Infrastructure Certificate and
 *     Certificate Revocation List (CRL) Profile
 *   <li>RFC 2560: X.509 Internet Public Key Infrastructure Online Certificate
 *     Status Protocol - OCSP
 *   <li><a href="{@docRoot}/../technotes/guides/security/StandardNames.html">
 *     <b>Java&trade;
 *     Cryptography Architecture Standard Algorithm Name
 *     Documentation</b></a></li>
 * </ul>
 *
 * <h2>Related Documentation</h2>
 *
 * For information about X.509 certificates and CRLs, please see:
 * <ul>
 *   <li><a href="http://www.ietf.org/rfc/rfc5280.txt">
 *     http://www.ietf.org/rfc/rfc5280.txt</a>
 *   <li><a href=
 *     "{@docRoot}/../technotes/guides/security/certpath/CertPathProgGuide.html">
 *     <b>Java&trade;
 *     PKI Programmer's Guide</b></a>
 *   <li><a href="{@docRoot}/../technotes/guides/security/cert3.html">
 *     <b>X.509 Certificates and Certificate Revocation Lists (CRLs)</b></a>
 * </ul>
 *
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/interfaces/package-info.java
package java.security.interfaces;

/**
 * Provides interfaces for generating RSA (Rivest, Shamir and
 * Adleman AsymmetricCipher algorithm)
 * keys as defined in the RSA Laboratory Technical Note
 * PKCS#1, and DSA (Digital Signature
 * Algorithm) keys as defined in NIST's FIPS-186.
 * <P>
 * Note that these interfaces are intended only for key
 * implementations whose key material is accessible and
 * available. These interfaces are not intended for key
 * implementations whose key material resides in
 * inaccessible, protected storage (such as in a
 * hardware device).
 * <P>
 * For more developer information on how to use these
 * interfaces, including information on how to design
 * {@code Key} classes for hardware devices, please refer
 * to these cryptographic provider developer guides:
 * <ul>
 *   <li><a href=
 *     "{@docRoot}/../technotes/guides/security/crypto/HowToImplAProvider.html">
 *     <b>How to Implement a Provider for the
 *     Java&trade; Cryptography Architecture
 *     </b></a></li>
 * </ul>
 *
 * <h2>Package Specification</h2>
 *
 * <ul>
 *   <li>PKCS #1: RSA Encryption Standard, Version 1.5, November 1993 </li>
 *   <li>Federal Information Processing Standards Publication (FIPS PUB) 186:
 *     Digital Signature Standard (DSS) </li>
 * </ul>
 *
 * <h2>Related Documentation</h2>
 *
 * For further documentation, please see:
 * <ul>
 *   <li>
 *     <a href=
 *       "{@docRoot}/../technotes/guides/security/crypto/CryptoSpec.html">
 *       <b>Java&trade;
 *       Cryptography Architecture API Specification and Reference
 *       </b></a></li>
 * </ul>
 *
 * @since JDK1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/package-info.java
package java.security.spec;

/**
 * Provides classes and interfaces for key specifications and algorithm
 * parameter specifications.
 *
 * <p>A key specification is a transparent representation of the key material
 * that constitutes a key. A key may be specified in an algorithm-specific
 * way, or in an algorithm-independent encoding format (such as ASN.1).
 * This package contains key specifications for DSA public and private keys,
 * RSA public and private keys, PKCS #8 private keys in DER-encoded format,
 * and X.509 public and private keys in DER-encoded format.
 *
 * <p>An algorithm parameter specification is a transparent representation
 * of the sets of parameters used with an algorithm. This package contains
 * an algorithm parameter specification for parameters used with the
 * DSA algorithm.
 *
 * <h2>Package Specification</h2>
 *
 * <ul>
 *   <li>PKCS #1: RSA Encryption Standard, Version 1.5, November 1993</li>
 *   <li>PKCS #8: Private-Key Information Syntax Standard,
 *     Version 1.2, November 1993</li>
 *   <li>Federal Information Processing Standards Publication (FIPS PUB) 186:
 *     Digital Signature Standard (DSS)</li>
 * </ul>
 *
 * <h2>Related Documentation</h2>
 *
 * For documentation that includes information about algorithm parameter
 * and key specifications, please see:
 * <ul>
 *   <li>
 *     <a href=
 *       "{@docRoot}/../technotes/guides/security/crypto/CryptoSpec.html">
 *       <b>Java&trade;
 *       Cryptography Architecture API Specification and Reference
 *       </b></a></li>
 *   <li>
 *     <a href=
 *       "{@docRoot}/../technotes/guides/security/crypto/HowToImplAProvider.html">
 *       <b>How to Implement a Provider for the
 *       Java&trade; Cryptography Architecture
 *       </b></a></li>
 * </ul>
 *
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/package-info.java
package java.time;

/**
 * <p>
 * The main API for dates, times, instants, and durations.
 * </p>
 * <p>
 * The classes defined here represent the principle date-time concepts,
 * including instants, durations, dates, times, time-zones and periods.
 * They are based on the ISO calendar system, which is the <i>de facto</i> world
 * calendar following the proleptic Gregorian rules.
 * All the classes are immutable and thread-safe.
 * </p>
 * <p>
 * Each date time instance is composed of fields that are conveniently
 * made available by the APIs.  For lower level access to the fields refer
 * to the {@code java.time.temporal} package.
 * Each class includes support for printing and parsing all manner of dates and times.
 * Refer to the {@code java.time.format} package for customization options.
 * </p>
 * <p>
 * The {@code java.time.chrono} package contains the calendar neutral API
 * {@link java.time.chrono.ChronoLocalDate ChronoLocalDate},
 * {@link java.time.chrono.ChronoLocalDateTime ChronoLocalDateTime},
 * {@link java.time.chrono.ChronoZonedDateTime ChronoZonedDateTime} and
 * {@link java.time.chrono.Era Era}.
 * This is intended for use by applications that need to use localized calendars.
 * It is recommended that applications use the ISO-8601 date and time classes from
 * this package across system boundaries, such as to the database or across the network.
 * The calendar neutral API should be reserved for interactions with users.
 * </p>
 *
 * <h3>Dates and Times</h3>
 * <p>
 * {@link java.time.Instant} is essentially a numeric timestamp.
 * The current Instant can be retrieved from a {@link java.time.Clock}.
 * This is useful for logging and persistence of a point in time
 * and has in the past been associated with storing the result
 * from {@link java.lang.System#currentTimeMillis()}.
 * </p>
 * <p>
 * {@link java.time.LocalDate} stores a date without a time.
 * This stores a date like '2010-12-03' and could be used to store a birthday.
 * </p>
 * <p>
 * {@link java.time.LocalTime} stores a time without a date.
 * This stores a time like '11:30' and could be used to store an opening or closing time.
 * </p>
 * <p>
 * {@link java.time.LocalDateTime} stores a date and time.
 * This stores a date-time like '2010-12-03T11:30'.
 * </p>
 * <p>
 * {@link java.time.ZonedDateTime} stores a date and time with a time-zone.
 * This is useful if you want to perform accurate calculations of
 * dates and times taking into account the {@link java.time.ZoneId}, such as 'Europe/Paris'.
 * Where possible, it is recommended to use a simpler class without a time-zone.
 * The widespread use of time-zones tends to add considerable complexity to an application.
 * </p>
 *
 * <h3>Duration and Period</h3>
 * <p>
 * Beyond dates and times, the API also allows the storage of periods and durations of time.
 * A {@link java.time.Duration} is a simple measure of time along the time-line in nanoseconds.
 * A {@link java.time.Period} expresses an amount of time in units meaningful
 * to humans, such as years or days.
 * </p>
 *
 * <h3>Additional value types</h3>
 * <p>
 * {@link java.time.Month} stores a month on its own.
 * This stores a single month-of-year in isolation, such as 'DECEMBER'.
 * </p>
 * <p>
 * {@link java.time.DayOfWeek} stores a day-of-week on its own.
 * This stores a single day-of-week in isolation, such as 'TUESDAY'.
 * </p>
 * <p>
 * {@link java.time.Year} stores a year on its own.
 * This stores a single year in isolation, such as '2010'.
 * </p>
 * <p>
 * {@link java.time.YearMonth} stores a year and month without a day or time.
 * This stores a year and month, such as '2010-12' and could be used for a credit card expiry.
 * </p>
 * <p>
 * {@link java.time.MonthDay} stores a month and day without a year or time.
 * This stores a month and day-of-month, such as '--12-03' and
 * could be used to store an annual event like a birthday without storing the year.
 * </p>
 * <p>
 * {@link java.time.OffsetTime} stores a time and offset from UTC without a date.
 * This stores a date like '11:30+01:00'.
 * The {@link java.time.ZoneOffset ZoneOffset} is of the form '+01:00'.
 * </p>
 * <p>
 * {@link java.time.OffsetDateTime} stores a date and time and offset from UTC.
 * This stores a date-time like '2010-12-03T11:30+01:00'.
 * This is sometimes found in XML messages and other forms of persistence,
 * but contains less information than a full time-zone.
 * </p>
 *
 * <h3>Package specification</h3>
 * <p>
 * Unless otherwise noted, passing a null argument to a constructor or method in any class or interface
 * in this package will cause a {@link java.lang.NullPointerException NullPointerException} to be thrown.
 * The Javadoc "@param" definition is used to summarise the null-behavior.
 * The "@throws {@link java.lang.NullPointerException}" is not explicitly documented in each method.
 * </p>
 * <p>
 * All calculations should check for numeric overflow and throw either an {@link java.lang.ArithmeticException}
 * or a {@link java.time.DateTimeException}.
 * </p>
 *
 * <h3>Design notes (non normative)</h3>
 * <p>
 * The API has been designed to reject null early and to be clear about this behavior.
 * A key exception is any method that takes an object and returns a boolean, for the purpose
 * of checking or validating, will generally return false for null.
 * </p>
 * <p>
 * The API is designed to be type-safe where reasonable in the main high-level API.
 * Thus, there are separate classes for the distinct concepts of date, time and date-time,
 * plus variants for offset and time-zone.
 * This can seem like a lot of classes, but most applications can begin with just five date/time types.
 * <ul>
 * <li>{@link java.time.Instant} - a timestamp</li>
 * <li>{@link java.time.LocalDate} - a date without a time, or any reference to an offset or time-zone</li>
 * <li>{@link java.time.LocalTime} - a time without a date, or any reference to an offset or time-zone</li>
 * <li>{@link java.time.LocalDateTime} - combines date and time, but still without any offset or time-zone</li>
 * <li>{@link java.time.ZonedDateTime} - a "full" date-time with time-zone and resolved offset from UTC/Greenwich</li>
 * </ul>
 * <p>
 * {@code Instant} is the closest equivalent class to {@code java.util.Date}.
 * {@code ZonedDateTime} is the closest equivalent class to {@code java.util.GregorianCalendar}.
 * </p>
 * <p>
 * Where possible, applications should use {@code LocalDate}, {@code LocalTime} and {@code LocalDateTime}
 * to better model the domain. For example, a birthday should be stored in a code {@code LocalDate}.
 * Bear in mind that any use of a {@linkplain java.time.ZoneId time-zone}, such as 'Europe/Paris', adds
 * considerable complexity to a calculation.
 * Many applications can be written only using {@code LocalDate}, {@code LocalTime} and {@code Instant},
 * with the time-zone added at the user interface (UI) layer.
 * </p>
 * <p>
 * The offset-based date-time types {@code OffsetTime} and {@code OffsetDateTime},
 * are intended primarily for use with network protocols and database access.
 * For example, most databases cannot automatically store a time-zone like 'Europe/Paris', but
 * they can store an offset like '+02:00'.
 * </p>
 * <p>
 * Classes are also provided for the most important sub-parts of a date, including {@code Month},
 * {@code DayOfWeek}, {@code Year}, {@code YearMonth} and {@code MonthDay}.
 * These can be used to model more complex date-time concepts.
 * For example, {@code YearMonth} is useful for representing a credit card expiry.
 * </p>
 * <p>
 * Note that while there are a large number of classes representing different aspects of dates,
 * there are relatively few dealing with different aspects of time.
 * Following type-safety to its logical conclusion would have resulted in classes for
 * hour-minute, hour-minute-second and hour-minute-second-nanosecond.
 * While logically pure, this was not a practical option as it would have almost tripled the
 * number of classes due to the combinations of date and time.
 * Thus, {@code LocalTime} is used for all precisions of time, with zeroes used to imply lower precision.
 * </p>
 * <p>
 * Following full type-safety to its ultimate conclusion might also argue for a separate class
 * for each field in date-time, such as a class for HourOfDay and another for DayOfMonth.
 * This approach was tried, but was excessively complicated in the Java language, lacking usability.
 * A similar problem occurs with periods.
 * There is a case for a separate class for each period unit, such as a type for Years and a type for Minutes.
 * However, this yields a lot of classes and a problem of type conversion.
 * Thus, the set of date-time types provided is a compromise between purity and practicality.
 * </p>
 * <p>
 * The API has a relatively large surface area in terms of number of methods.
 * This is made manageable through the use of consistent method prefixes.
 * <ul>
 * <li>{@code of} - static factory method</li>
 * <li>{@code parse} - static factory method focussed on parsing</li>
 * <li>{@code get} - gets the value of something</li>
 * <li>{@code is} - checks if something is true</li>
 * <li>{@code with} - the immutable equivalent of a setter</li>
 * <li>{@code plus} - adds an amount to an object</li>
 * <li>{@code minus} - subtracts an amount from an object</li>
 * <li>{@code to} - converts this object to another type</li>
 * <li>{@code at} - combines this object with another, such as {@code date.atTime(time)}</li>
 * </ul>
 * <p>
 * Multiple calendar systems is an awkward addition to the design challenges.
 * The first principle is that most users want the standard ISO calendar system.
 * As such, the main classes are ISO-only. The second principle is that most of those that want a
 * non-ISO calendar system want it for user interaction, thus it is a UI localization issue.
 * As such, date and time objects should be held as ISO objects in the data model and persistent
 * storage, only being converted to and from a local calendar for display.
 * The calendar system would be stored separately in the user preferences.
 * </p>
 * <p>
 * There are, however, some limited use cases where users believe they need to store and use
 * dates in arbitrary calendar systems throughout the application.
 * This is supported by {@link java.time.chrono.ChronoLocalDate}, however it is vital to read
 * all the associated warnings in the Javadoc of that interface before using it.
 * In summary, applications that require general interoperation between multiple calendar systems
 * typically need to be written in a very different way to those only using the ISO calendar,
 * thus most applications should just use ISO and avoid {@code ChronoLocalDate}.
 * </p>
 * <p>
 * The API is also designed for user extensibility, as there are many ways of calculating time.
 * The {@linkplain java.time.temporal.TemporalField field} and {@linkplain java.time.temporal.TemporalUnit unit}
 * API, accessed via {@link java.time.temporal.TemporalAccessor TemporalAccessor} and
 * {@link java.time.temporal.Temporal Temporal} provide considerable flexibility to applications.
 * In addition, the {@link java.time.temporal.TemporalQuery TemporalQuery} and
 * {@link java.time.temporal.TemporalAdjuster TemporalAdjuster} interfaces provide day-to-day
 * power, allowing code to read close to business requirements:
 * </p>
 * <pre>
 *   LocalDate customerBirthday = customer.loadBirthdayFromDatabase();
 *   LocalDate today = LocalDate.now();
 *   if (customerBirthday.equals(today)) {
 *     LocalDate specialOfferExpiryDate = today.plusWeeks(2).with(next(FRIDAY));
 *     customer.sendBirthdaySpecialOffer(specialOfferExpiryDate);
 *   }
 *
 * </pre>
 *
 * @since JDK1.8
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/package-info.java
package java.time.chrono;

/**
 * <p>
 * Generic API for calendar systems other than the default ISO.
 * </p>
 * <p>
 * The main API is based around the calendar system defined in ISO-8601.
 * However, there are other calendar systems, and this package provides basic support for them.
 * The alternate calendars are provided in the {@link java.time.chrono} package.
 * </p>
 * <p>
 * A calendar system is defined by the {@link java.time.chrono.Chronology} interface,
 * while a date in a calendar system is defined by the {@link java.time.chrono.ChronoLocalDate} interface.
 * </p>
 * <p>
 * It is intended that applications use the main API whenever possible, including code to read and write
 * from a persistent data store, such as a database, and to send dates and times across a network.
 * The "chrono" classes are then used at the user interface level to deal with localized input/output.
 * See {@link java.time.chrono.ChronoLocalDate ChronoLocalDate}
 * for a full discussion of the issues.
 * </p>
 * <p>
 * Using non-ISO calendar systems in an application introduces significant extra complexity.
 * Ensure that the warnings and recommendations in {@code ChronoLocalDate} have been read before
 * working with the "chrono" interfaces.
 * </p>
 * <p>
 * The supported calendar systems includes:
 * </p>
 * <ul>
 * <li>{@link java.time.chrono.HijrahChronology Hijrah calendar}</li>
 * <li>{@link java.time.chrono.JapaneseChronology Japanese calendar}</li>
 * <li>{@link java.time.chrono.MinguoChronology Minguo calendar}</li>
 * <li>{@link java.time.chrono.ThaiBuddhistChronology Thai Buddhist calendar}</li>
 * </ul>
 *
 * <h3>Example</h3>
 * <p>
 * This example lists todays date for all of the available calendars.
 * </p>
 * <pre>
 *   // Enumerate the list of available calendars and print todays date for each.
 *       Set&lt;Chronology&gt; chronos = Chronology.getAvailableChronologies();
 *       for (Chronology chrono : chronos) {
 *           ChronoLocalDate date = chrono.dateNow();
 *           System.out.printf("   %20s: %s%n", chrono.getId(), date.toString());
 *       }
 * </pre>
 *
 * <p>
 * This example creates and uses a date in a named non-ISO calendar system.
 * </p>
 * <pre>
 *   // Print the Thai Buddhist date
 *       ChronoLocalDate now1 = Chronology.of("ThaiBuddhist").dateNow();
 *       int day = now1.get(ChronoField.DAY_OF_MONTH);
 *       int dow = now1.get(ChronoField.DAY_OF_WEEK);
 *       int month = now1.get(ChronoField.MONTH_OF_YEAR);
 *       int year = now1.get(ChronoField.YEAR);
 *       System.out.printf("  Today is %s %s %d-%s-%d%n", now1.getChronology().getId(),
 *                 dow, day, month, year);
 *   // Print today's date and the last day of the year for the Thai Buddhist Calendar.
 *       ChronoLocalDate first = now1
 *                 .with(ChronoField.DAY_OF_MONTH, 1)
 *                 .with(ChronoField.MONTH_OF_YEAR, 1);
 *       ChronoLocalDate last = first
 *                 .plus(1, ChronoUnit.YEARS)
 *                 .minus(1, ChronoUnit.DAYS);
 *       System.out.printf("  %s: 1st of year: %s; end of year: %s%n", last.getChronology().getId(),
 *                 first, last);
 *  </pre>
 *
 * <p>
 * This example creates and uses a date in a specific ThaiBuddhist calendar system.
 * </p>
 * <pre>
 *   // Print the Thai Buddhist date
 *       ThaiBuddhistDate now1 = ThaiBuddhistDate.now();
 *       int day = now1.get(ChronoField.DAY_OF_MONTH);
 *       int dow = now1.get(ChronoField.DAY_OF_WEEK);
 *       int month = now1.get(ChronoField.MONTH_OF_YEAR);
 *       int year = now1.get(ChronoField.YEAR);
 *       System.out.printf("  Today is %s %s %d-%s-%d%n", now1.getChronology().getId(),
 *                 dow, day, month, year);
 *
 *   // Print today's date and the last day of the year for the Thai Buddhist Calendar.
 *       ThaiBuddhistDate first = now1
 *                 .with(ChronoField.DAY_OF_MONTH, 1)
 *                 .with(ChronoField.MONTH_OF_YEAR, 1);
 *       ThaiBuddhistDate last = first
 *                 .plus(1, ChronoUnit.YEARS)
 *                 .minus(1, ChronoUnit.DAYS);
 *       System.out.printf("  %s: 1st of year: %s; end of year: %s%n", last.getChronology().getId(),
 *                 first, last);
 *  </pre>
 *
 * <h3>Package specification</h3>
 * <p>
 * Unless otherwise noted, passing a null argument to a constructor or method in any class or interface
 * in this package will cause a {@link java.lang.NullPointerException NullPointerException} to be thrown.
 * The Javadoc "@param" definition is used to summarise the null-behavior.
 * The "@throws {@link java.lang.NullPointerException}" is not explicitly documented in each method.
 * </p>
 * <p>
 * All calculations should check for numeric overflow and throw either an {@link java.lang.ArithmeticException}
 * or a {@link java.time.DateTimeException}.
 * </p>
 * @since JDK1.8
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/package-info.java
package java.time.format;

/**
 * <p>
 * Provides classes to print and parse dates and times.
 * </p>
 * <p>
 * Printing and parsing is based around the
 * {@link java.time.format.DateTimeFormatter DateTimeFormatter} class.
 * Instances are generally obtained from
 * {@link java.time.format.DateTimeFormatter DateTimeFormatter}, however
 * {@link java.time.format.DateTimeFormatterBuilder DateTimeFormatterBuilder}
 * can be used if more power is needed.
 * </p>
 * <p>
 * Localization occurs by calling
 * {@link java.time.format.DateTimeFormatter#withLocale(java.util.Locale) withLocale(Locale)}
 * on the formatter. Further customization is possible using
 * {@link java.time.format.DecimalStyle DecimalStyle}.
 * </p>
 *
 * <h3>Package specification</h3>
 * <p>
 * Unless otherwise noted, passing a null argument to a constructor or method in any class or interface
 * in this package will cause a {@link java.lang.NullPointerException NullPointerException} to be thrown.
 * The Javadoc "@param" definition is used to summarise the null-behavior.
 * The "@throws {@link java.lang.NullPointerException}" is not explicitly documented in each method.
 * </p>
 * <p>
 * All calculations should check for numeric overflow and throw either an {@link java.lang.ArithmeticException}
 * or a {@link java.time.DateTimeException}.
 * </p>
 * @since JDK1.8
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/package-info.java
package java.time.temporal;

/**
 * <p>
 * Access to date and time using fields and units, and date time adjusters.
 * </p>
 * <p>
 * This package expands on the base package to provide additional functionality for
 * more powerful use cases. Support is included for:
 * </p>
 * <ul>
 * <li>Units of date-time, such as years, months, days and hours</li>
 * <li>Fields of date-time, such as month-of-year, day-of-week or hour-of-day</li>
 * <li>Date-time adjustment functions</li>
 * <li>Different definitions of weeks</li>
 * </ul>
 *
 * <h3>Fields and Units</h3>
 * <p>
 * Dates and times are expressed in terms of fields and units.
 * A unit is used to measure an amount of time, such as years, days or minutes.
 * All units implement {@link java.time.temporal.TemporalUnit}.
 * The set of well known units is defined in {@link java.time.temporal.ChronoUnit}, such as {@code DAYS}.
 * The unit interface is designed to allow application defined units.
 * </p>
 * <p>
 * A field is used to express part of a larger date-time, such as year, month-of-year or second-of-minute.
 * All fields implement {@link java.time.temporal.TemporalField}.
 * The set of well known fields are defined in {@link java.time.temporal.ChronoField}, such as {@code HOUR_OF_DAY}.
 * Additional fields are defined by {@link java.time.temporal.JulianFields}, {@link java.time.temporal.WeekFields}
 * and {@link java.time.temporal.IsoFields}.
 * The field interface is designed to allow application defined fields.
 * </p>
 * <p>
 * This package provides tools that allow the units and fields of date and time to be accessed
 * in a general way most suited for frameworks.
 * {@link java.time.temporal.Temporal} provides the abstraction for date time types that support fields.
 * Its methods support getting the value of a field, creating a new date time with the value of
 * a field modified, and querying for additional information, typically used to extract the offset or time-zone.
 * </p>
 * <p>
 * One use of fields in application code is to retrieve fields for which there is no convenience method.
 * For example, getting the day-of-month is common enough that there is a method on {@code LocalDate}
 * called {@code getDayOfMonth()}. However for more unusual fields it is necessary to use the field.
 * For example, {@code date.get(ChronoField.ALIGNED_WEEK_OF_MONTH)}.
 * The fields also provide access to the range of valid values.
 * </p>
 *
 * <h3>Adjustment and Query</h3>
 * <p>
 * A key part of the date-time problem space is adjusting a date to a new, related value,
 * such as the "last day of the month", or "next Wednesday".
 * These are modeled as functions that adjust a base date-time.
 * The functions implement {@link java.time.temporal.TemporalAdjuster} and operate on {@code Temporal}.
 * A set of common functions are provided in {@link java.time.temporal.TemporalAdjusters}.
 * For example, to find the first occurrence of a day-of-week after a given date, use
 * {@link java.time.temporal.TemporalAdjusters#next(DayOfWeek)}, such as
 * {@code date.with(next(MONDAY))}.
 * Applications can also define adjusters by implementing {@link java.time.temporal.TemporalAdjuster}.
 * </p>
 * <p>
 * The {@link java.time.temporal.TemporalAmount} interface models amounts of relative time.
 * </p>
 * <p>
 * In addition to adjusting a date-time, an interface is provided to enable querying via
 * {@link java.time.temporal.TemporalQuery}.
 * The most common implementations of the query interface are method references.
 * The {@code from(TemporalAccessor)} methods on major classes can all be used, such as
 * {@code LocalDate::from} or {@code Month::from}.
 * Further implementations are provided in {@link java.time.temporal.TemporalQueries} as static methods.
 * Applications can also define queries by implementing {@link java.time.temporal.TemporalQuery}.
 * </p>
 *
 * <h3>Weeks</h3>
 * <p>
 * Different locales have different definitions of the week.
 * For example, in Europe the week typically starts on a Monday, while in the US it starts on a Sunday.
 * The {@link java.time.temporal.WeekFields} class models this distinction.
 * </p>
 * <p>
 * The ISO calendar system defines an additional week-based division of years.
 * This defines a year based on whole Monday to Monday weeks.
 * This is modeled in {@link java.time.temporal.IsoFields}.
 * </p>
 *
 * <h3>Package specification</h3>
 * <p>
 * Unless otherwise noted, passing a null argument to a constructor or method in any class or interface
 * in this package will cause a {@link java.lang.NullPointerException NullPointerException} to be thrown.
 * The Javadoc "@param" definition is used to summarise the null-behavior.
 * The "@throws {@link java.lang.NullPointerException}" is not explicitly documented in each method.
 * </p>
 * <p>
 * All calculations should check for numeric overflow and throw either an {@link java.lang.ArithmeticException}
 * or a {@link java.time.DateTimeException}.
 * </p>
 * @since JDK1.8
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/package-info.java
package java.time.zone;

/**
 * <p>
 * Support for time-zones and their rules.
 * </p>
 * <p>
 * Daylight Saving Time and Time-Zones are concepts used by Governments to alter local time.
 * This package provides support for time-zones, their rules and the resulting
 * gaps and overlaps in the local time-line typically caused by Daylight Saving Time.
 * </p>
 *
 * <h3>Package specification</h3>
 * <p>
 * Unless otherwise noted, passing a null argument to a constructor or method in any class or interface
 * in this package will cause a {@link java.lang.NullPointerException NullPointerException} to be thrown.
 * The Javadoc "@param" definition is used to summarise the null-behavior.
 * The "@throws {@link java.lang.NullPointerException}" is not explicitly documented in each method.
 * </p>
 * <p>
 * All calculations should check for numeric overflow and throw either an {@link java.lang.ArithmeticException}
 * or a {@link java.time.DateTimeException}.
 * </p>
 * @since JDK1.8
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/package-info.java
package java.util.concurrent;

/**
 * Utility classes commonly useful in concurrent programming.  This
 * package includes a few small standardized extensible frameworks, as
 * well as some classes that provide useful functionality and are
 * otherwise tedious or difficult to implement.  Here are brief
 * descriptions of the main components.  See also the
 * {@link java.util.concurrent.locks} and
 * {@link java.util.concurrent.atomic} packages.
 *
 * <h2>Executors</h2>
 *
 * <b>Interfaces.</b>
 *
 * {@link java.util.concurrent.Executor} is a simple standardized
 * interface for defining custom thread-like subsystems, including
 * thread pools, asynchronous I/O, and lightweight task frameworks.
 * Depending on which concrete Executor class is being used, tasks may
 * execute in a newly created thread, an existing task-execution thread,
 * or the thread calling {@link java.util.concurrent.Executor#execute
 * execute}, and may execute sequentially or concurrently.
 *
 * {@link java.util.concurrent.ExecutorService} provides a more
 * complete asynchronous task execution framework.  An
 * ExecutorService manages queuing and scheduling of tasks,
 * and allows controlled shutdown.
 *
 * The {@link java.util.concurrent.ScheduledExecutorService}
 * subinterface and associated interfaces add support for
 * delayed and periodic task execution.  ExecutorServices
 * provide methods arranging asynchronous execution of any
 * function expressed as {@link java.util.concurrent.Callable},
 * the result-bearing analog of {@link java.lang.Runnable}.
 *
 * A {@link java.util.concurrent.Future} returns the results of
 * a function, allows determination of whether execution has
 * completed, and provides a means to cancel execution.
 *
 * A {@link java.util.concurrent.RunnableFuture} is a {@code Future}
 * that possesses a {@code run} method that upon execution,
 * sets its results.
 *
 * <p>
 *
 * <b>Implementations.</b>
 *
 * Classes {@link java.util.concurrent.ThreadPoolExecutor} and
 * {@link java.util.concurrent.ScheduledThreadPoolExecutor}
 * provide tunable, flexible thread pools.
 *
 * The {@link java.util.concurrent.Executors} class provides
 * factory methods for the most common kinds and configurations
 * of Executors, as well as a few utility methods for using
 * them.  Other utilities based on {@code Executors} include the
 * concrete class {@link java.util.concurrent.FutureTask}
 * providing a common extensible implementation of Futures, and
 * {@link java.util.concurrent.ExecutorCompletionService}, that
 * assists in coordinating the processing of groups of
 * asynchronous tasks.
 *
 * <p>Class {@link java.util.concurrent.ForkJoinPool} provides an
 * Executor primarily designed for processing instances of {@link
 * java.util.concurrent.ForkJoinTask} and its subclasses.  These
 * classes employ a work-stealing scheduler that attains high
 * throughput for tasks conforming to restrictions that often hold in
 * computation-intensive parallel processing.
 *
 * <h2>Queues</h2>
 *
 * The {@link java.util.concurrent.ConcurrentLinkedQueue} class
 * supplies an efficient scalable thread-safe non-blocking FIFO queue.
 * The {@link java.util.concurrent.ConcurrentLinkedDeque} class is
 * similar, but additionally supports the {@link java.util.Deque}
 * interface.
 *
 * <p>Five implementations in {@code java.util.concurrent} support
 * the extended {@link java.util.concurrent.BlockingQueue}
 * interface, that defines blocking versions of put and take:
 * {@link java.util.concurrent.LinkedBlockingQueue},
 * {@link java.util.concurrent.ArrayBlockingQueue},
 * {@link java.util.concurrent.SynchronousQueue},
 * {@link java.util.concurrent.PriorityBlockingQueue}, and
 * {@link java.util.concurrent.DelayQueue}.
 * The different classes cover the most common usage contexts
 * for producer-consumer, messaging, parallel tasking, and
 * related concurrent designs.
 *
 * <p>Extended interface {@link java.util.concurrent.TransferQueue},
 * and implementation {@link java.util.concurrent.LinkedTransferQueue}
 * introduce a synchronous {@code transfer} method (along with related
 * features) in which a producer may optionally block awaiting its
 * consumer.
 *
 * <p>The {@link java.util.concurrent.BlockingDeque} interface
 * extends {@code BlockingQueue} to support both FIFO and LIFO
 * (stack-based) operations.
 * Class {@link java.util.concurrent.LinkedBlockingDeque}
 * provides an implementation.
 *
 * <h2>Timing</h2>
 *
 * The {@link java.util.concurrent.TimeUnit} class provides
 * multiple granularities (including nanoseconds) for
 * specifying and controlling time-out based operations.  Most
 * classes in the package contain operations based on time-outs
 * in addition to indefinite waits.  In all cases that
 * time-outs are used, the time-out specifies the minimum time
 * that the method should wait before indicating that it
 * timed-out.  Implementations make a &quot;best effort&quot;
 * to detect time-outs as soon as possible after they occur.
 * However, an indefinite amount of time may elapse between a
 * time-out being detected and a thread actually executing
 * again after that time-out.  All methods that accept timeout
 * parameters treat values less than or equal to zero to mean
 * not to wait at all.  To wait "forever", you can use a value
 * of {@code Long.MAX_VALUE}.
 *
 * <h2>Synchronizers</h2>
 *
 * Five classes aid common special-purpose synchronization idioms.
 * <ul>
 *
 * <li>{@link java.util.concurrent.Semaphore} is a classic concurrency tool.
 *
 * <li>{@link java.util.concurrent.CountDownLatch} is a very simple yet
 * very common utility for blocking until a given number of signals,
 * events, or conditions hold.
 *
 * <li>A {@link java.util.concurrent.CyclicBarrier} is a resettable
 * multiway synchronization point useful in some styles of parallel
 * programming.
 *
 * <li>A {@link java.util.concurrent.Phaser} provides
 * a more flexible form of barrier that may be used to control phased
 * computation among multiple threads.
 *
 * <li>An {@link java.util.concurrent.Exchanger} allows two threads to
 * exchange objects at a rendezvous point, and is useful in several
 * pipeline designs.
 *
 * </ul>
 *
 * <h2>Concurrent Collections</h2>
 *
 * Besides Queues, this package supplies Collection implementations
 * designed for use in multithreaded contexts:
 * {@link java.util.concurrent.ConcurrentHashMap},
 * {@link java.util.concurrent.ConcurrentSkipListMap},
 * {@link java.util.concurrent.ConcurrentSkipListSet},
 * {@link java.util.concurrent.CopyOnWriteArrayList}, and
 * {@link java.util.concurrent.CopyOnWriteArraySet}.
 * When many threads are expected to access a given collection, a
 * {@code ConcurrentHashMap} is normally preferable to a synchronized
 * {@code HashMap}, and a {@code ConcurrentSkipListMap} is normally
 * preferable to a synchronized {@code TreeMap}.
 * A {@code CopyOnWriteArrayList} is preferable to a synchronized
 * {@code ArrayList} when the expected number of reads and traversals
 * greatly outnumber the number of updates to a list.
 *
 * <p>The "Concurrent" prefix used with some classes in this package
 * is a shorthand indicating several differences from similar
 * "synchronized" classes.  For example {@code java.util.Hashtable} and
 * {@code Collections.synchronizedMap(new HashMap())} are
 * synchronized.  But {@link
 * java.util.concurrent.ConcurrentHashMap} is "concurrent".  A
 * concurrent collection is thread-safe, but not governed by a
 * single exclusion lock.  In the particular case of
 * ConcurrentHashMap, it safely permits any number of
 * concurrent reads as well as a tunable number of concurrent
 * writes.  "Synchronized" classes can be useful when you need
 * to prevent all access to a collection via a single lock, at
 * the expense of poorer scalability.  In other cases in which
 * multiple threads are expected to access a common collection,
 * "concurrent" versions are normally preferable.  And
 * unsynchronized collections are preferable when either
 * collections are unshared, or are accessible only when
 * holding other locks.
 *
 * <p id="Weakly">Most concurrent Collection implementations
 * (including most Queues) also differ from the usual {@code java.util}
 * conventions in that their {@linkplain java.util.Iterator Iterators}
 * and {@linkplain java.util.Spliterator Spliterators} provide
 * <em>weakly consistent</em> rather than fast-fail traversal:
 * <ul>
 * <li>they may proceed concurrently with other operations
 * <li>they will never throw {@link java.util.ConcurrentModificationException
 * ConcurrentModificationException}
 * <li>they are guaranteed to traverse elements as they existed upon
 * construction exactly once, and may (but are not guaranteed to)
 * reflect any modifications subsequent to construction.
 * </ul>
 *
 * <h2 id="MemoryVisibility">Memory Consistency Properties</h2>
 *
 * <a href="https://docs.oracle.com/javase/specs/jls/se7/html/jls-17.html#jls-17.4.5">
 * Chapter 17 of the Java Language Specification</a> defines the
 * <i>happens-before</i> relation on memory operations such as reads and
 * writes of shared variables.  The results of a write by one thread are
 * guaranteed to be visible to a read by another thread only if the write
 * operation <i>happens-before</i> the read operation.  The
 * {@code synchronized} and {@code volatile} constructs, as well as the
 * {@code Thread.start()} and {@code Thread.join()} methods, can form
 * <i>happens-before</i> relationships.  In particular:
 *
 * <ul>
 *   <li>Each action in a thread <i>happens-before</i> every action in that
 *   thread that comes later in the program's order.
 *
 *   <li>An unlock ({@code synchronized} block or method exit) of a
 *   monitor <i>happens-before</i> every subsequent lock ({@code synchronized}
 *   block or method entry) of that same monitor.  And because
 *   the <i>happens-before</i> relation is transitive, all actions
 *   of a thread prior to unlocking <i>happen-before</i> all actions
 *   subsequent to any thread locking that monitor.
 *
 *   <li>A write to a {@code volatile} field <i>happens-before</i> every
 *   subsequent read of that same field.  Writes and reads of
 *   {@code volatile} fields have similar memory consistency effects
 *   as entering and exiting monitors, but do <em>not</em> entail
 *   mutual exclusion locking.
 *
 *   <li>A call to {@code start} on a thread <i>happens-before</i> any
 *   action in the started thread.
 *
 *   <li>All actions in a thread <i>happen-before</i> any other thread
 *   successfully returns from a {@code join} on that thread.
 *
 * </ul>
 *
 *
 * The methods of all classes in {@code java.util.concurrent} and its
 * subpackages extend these guarantees to higher-level
 * synchronization.  In particular:
 *
 * <ul>
 *
 *   <li>Actions in a thread prior to placing an object into any concurrent
 *   collection <i>happen-before</i> actions subsequent to the access or
 *   removal of that element from the collection in another thread.
 *
 *   <li>Actions in a thread prior to the submission of a {@code Runnable}
 *   to an {@code Executor} <i>happen-before</i> its execution begins.
 *   Similarly for {@code Callables} submitted to an {@code ExecutorService}.
 *
 *   <li>Actions taken by the asynchronous computation represented by a
 *   {@code Future} <i>happen-before</i> actions subsequent to the
 *   retrieval of the result via {@code Future.get()} in another thread.
 *
 *   <li>Actions prior to "releasing" synchronizer methods such as
 *   {@code Lock.unlock}, {@code Semaphore.release}, and
 *   {@code CountDownLatch.countDown} <i>happen-before</i> actions
 *   subsequent to a successful "acquiring" method such as
 *   {@code Lock.lock}, {@code Semaphore.acquire},
 *   {@code Condition.await}, and {@code CountDownLatch.await} on the
 *   same synchronizer object in another thread.
 *
 *   <li>For each pair of threads that successfully exchange objects via
 *   an {@code Exchanger}, actions prior to the {@code exchange()}
 *   in each thread <i>happen-before</i> those subsequent to the
 *   corresponding {@code exchange()} in another thread.
 *
 *   <li>Actions prior to calling {@code CyclicBarrier.await} and
 *   {@code Phaser.awaitAdvance} (as well as its variants)
 *   <i>happen-before</i> actions performed by the barrier action, and
 *   actions performed by the barrier action <i>happen-before</i> actions
 *   subsequent to a successful return from the corresponding {@code await}
 *   in other threads.
 *
 * </ul>
 *
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/package-info.java
package java.util.concurrent.atomic;

/**
 * A small toolkit of classes that support lock-free thread-safe
 * programming on single variables.  In essence, the classes in this
 * package extend the notion of {@code volatile} values, fields, and
 * array elements to those that also provide an atomic conditional update
 * operation of the form:
 *
 *  <pre> {@code boolean compareAndSet(expectedValue, updateValue);}</pre>
 *
 * <p>This method (which varies in argument types across different
 * classes) atomically sets a variable to the {@code updateValue} if it
 * currently holds the {@code expectedValue}, reporting {@code true} on
 * success.  The classes in this package also contain methods to get and
 * unconditionally set values, as well as a weaker conditional atomic
 * update operation {@code weakCompareAndSet} described below.
 *
 * <p>The specifications of these methods enable implementations to
 * employ efficient machine-level atomic instructions that are available
 * on contemporary processors.  However on some platforms, support may
 * entail some form of internal locking.  Thus the methods are not
 * strictly guaranteed to be non-blocking --
 * a thread may block transiently before performing the operation.
 *
 * <p>Instances of classes
 * {@link java.util.concurrent.atomic.AtomicBoolean},
 * {@link java.util.concurrent.atomic.AtomicInteger},
 * {@link java.util.concurrent.atomic.AtomicLong}, and
 * {@link java.util.concurrent.atomic.AtomicReference}
 * each provide access and updates to a single variable of the
 * corresponding type.  Each class also provides appropriate utility
 * methods for that type.  For example, classes {@code AtomicLong} and
 * {@code AtomicInteger} provide atomic increment methods.  One
 * application is to generate sequence numbers, as in:
 *
 *  <pre> {@code
 * class Sequencer {
 *   private final AtomicLong sequenceNumber
 *     = new AtomicLong(0);
 *   public long next() {
 *     return sequenceNumber.getAndIncrement();
 *   }
 * }}</pre>
 *
 * <p>It is straightforward to define new utility functions that, like
 * {@code getAndIncrement}, apply a function to a value atomically.
 * For example, given some transformation
 * <pre> {@code long transform(long input)}</pre>
 *
 * write your utility method as follows:
 *  <pre> {@code
 * long getAndTransform(AtomicLong var) {
 *   long prev, next;
 *   do {
 *     prev = var.get();
 *     next = transform(prev);
 *   } while (!var.compareAndSet(prev, next));
 *   return prev; // return next; for transformAndGet
 * }}</pre>
 *
 * <p>The memory effects for accesses and updates of atomics generally
 * follow the rules for volatiles, as stated in
 * <a href="https://docs.oracle.com/javase/specs/jls/se7/html/jls-17.html#jls-17.4">
 * The Java Language Specification (17.4 Memory Model)</a>:
 *
 * <ul>
 *
 *   <li> {@code get} has the memory effects of reading a
 * {@code volatile} variable.
 *
 *   <li> {@code set} has the memory effects of writing (assigning) a
 * {@code volatile} variable.
 *
 *   <li> {@code lazySet} has the memory effects of writing (assigning)
 *   a {@code volatile} variable except that it permits reorderings with
 *   subsequent (but not previous) memory actions that do not themselves
 *   impose reordering constraints with ordinary non-{@code volatile}
 *   writes.  Among other usage contexts, {@code lazySet} may apply when
 *   nulling out, for the sake of garbage collection, a reference that is
 *   never accessed again.
 *
 *   <li>{@code weakCompareAndSet} atomically reads and conditionally
 *   writes a variable but does <em>not</em>
 *   create any happens-before orderings, so provides no guarantees
 *   with respect to previous or subsequent reads and writes of any
 *   variables other than the target of the {@code weakCompareAndSet}.
 *
 *   <li> {@code compareAndSet}
 *   and all other read-and-update operations such as {@code getAndIncrement}
 *   have the memory effects of both reading and
 *   writing {@code volatile} variables.
 * </ul>
 *
 * <p>In addition to classes representing single values, this package
 * contains <em>Updater</em> classes that can be used to obtain
 * {@code compareAndSet} operations on any selected {@code volatile}
 * field of any selected class.
 *
 * {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater},
 * {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater}, and
 * {@link java.util.concurrent.atomic.AtomicLongFieldUpdater} are
 * reflection-based utilities that provide access to the associated
 * field types.  These are mainly of use in atomic data structures in
 * which several {@code volatile} fields of the same node (for
 * example, the links of a tree node) are independently subject to
 * atomic updates.  These classes enable greater flexibility in how
 * and when to use atomic updates, at the expense of more awkward
 * reflection-based setup, less convenient usage, and weaker
 * guarantees.
 *
 * <p>The
 * {@link java.util.concurrent.atomic.AtomicIntegerArray},
 * {@link java.util.concurrent.atomic.AtomicLongArray}, and
 * {@link java.util.concurrent.atomic.AtomicReferenceArray} classes
 * further extend atomic operation support to arrays of these types.
 * These classes are also notable in providing {@code volatile} access
 * semantics for their array elements, which is not supported for
 * ordinary arrays.
 *
 * <p id="weakCompareAndSet">The atomic classes also support method
 * {@code weakCompareAndSet}, which has limited applicability.  On some
 * platforms, the weak version may be more efficient than {@code
 * compareAndSet} in the normal case, but differs in that any given
 * invocation of the {@code weakCompareAndSet} method may return {@code
 * false} <em>spuriously</em> (that is, for no apparent reason).  A
 * {@code false} return means only that the operation may be retried if
 * desired, relying on the guarantee that repeated invocation when the
 * variable holds {@code expectedValue} and no other thread is also
 * attempting to set the variable will eventually succeed.  (Such
 * spurious failures may for example be due to memory contention effects
 * that are unrelated to whether the expected and current values are
 * equal.)  Additionally {@code weakCompareAndSet} does not provide
 * ordering guarantees that are usually needed for synchronization
 * control.  However, the method may be useful for updating counters and
 * statistics when such updates are unrelated to the other
 * happens-before orderings of a program.  When a thread sees an update
 * to an atomic variable caused by a {@code weakCompareAndSet}, it does
 * not necessarily see updates to any <em>other</em> variables that
 * occurred before the {@code weakCompareAndSet}.  This may be
 * acceptable when, for example, updating performance statistics, but
 * rarely otherwise.
 *
 * <p>The {@link java.util.concurrent.atomic.AtomicMarkableReference}
 * class associates a single boolean with a reference.  For example, this
 * bit might be used inside a data structure to mean that the object
 * being referenced has logically been deleted.
 *
 * The {@link java.util.concurrent.atomic.AtomicStampedReference}
 * class associates an integer value with a reference.  This may be
 * used for example, to represent version numbers corresponding to
 * series of updates.
 *
 * <p>Atomic classes are designed primarily as building blocks for
 * implementing non-blocking data structures and related infrastructure
 * classes.  The {@code compareAndSet} method is not a general
 * replacement for locking.  It applies only when critical updates for an
 * object are confined to a <em>single</em> variable.
 *
 * <p>Atomic classes are not general purpose replacements for
 * {@code java.lang.Integer} and related classes.  They do <em>not</em>
 * define methods such as {@code equals}, {@code hashCode} and
 * {@code compareTo}.  (Because atomic variables are expected to be
 * mutated, they are poor choices for hash table keys.)  Additionally,
 * classes are provided only for those types that are commonly useful in
 * intended applications.  For example, there is no atomic class for
 * representing {@code byte}.  In those infrequent cases where you would
 * like to do so, you can use an {@code AtomicInteger} to hold
 * {@code byte} values, and cast appropriately.
 *
 * You can also hold floats using
 * {@link java.lang.Float#floatToRawIntBits} and
 * {@link java.lang.Float#intBitsToFloat} conversions, and doubles using
 * {@link java.lang.Double#doubleToRawLongBits} and
 * {@link java.lang.Double#longBitsToDouble} conversions.
 *
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/locks/package-info.java
package java.util.concurrent.locks;

/**
 * Interfaces and classes providing a framework for locking and waiting
 * for conditions that is distinct from built-in synchronization and
 * monitors.  The framework permits much greater flexibility in the use of
 * locks and conditions, at the expense of more awkward syntax.
 *
 * <p>The {@link java.util.concurrent.locks.Lock} interface supports
 * locking disciplines that differ in semantics (reentrant, fair, etc),
 * and that can be used in non-block-structured contexts including
 * hand-over-hand and lock reordering algorithms.  The main implementation
 * is {@link java.util.concurrent.locks.ReentrantLock}.
 *
 * <p>The {@link java.util.concurrent.locks.ReadWriteLock} interface
 * similarly defines locks that may be shared among readers but are
 * exclusive to writers.  Only a single implementation, {@link
 * java.util.concurrent.locks.ReentrantReadWriteLock}, is provided, since
 * it covers most standard usage contexts.  But programmers may create
 * their own implementations to cover nonstandard requirements.
 *
 * <p>The {@link java.util.concurrent.locks.Condition} interface
 * describes condition variables that may be associated with Locks.
 * These are similar in usage to the implicit monitors accessed using
 * {@code Object.wait}, but offer extended capabilities.
 * In particular, multiple {@code Condition} objects may be associated
 * with a single {@code Lock}.  To avoid compatibility issues, the
 * names of {@code Condition} methods are different from the
 * corresponding {@code Object} versions.
 *
 * <p>The {@link java.util.concurrent.locks.AbstractQueuedSynchronizer}
 * class serves as a useful superclass for defining locks and other
 * synchronizers that rely on queuing blocked threads.  The {@link
 * java.util.concurrent.locks.AbstractQueuedLongSynchronizer} class
 * provides the same functionality but extends support to 64 bits of
 * synchronization state.  Both extend class {@link
 * java.util.concurrent.locks.AbstractOwnableSynchronizer}, a simple
 * class that helps record the thread currently holding exclusive
 * synchronization.  The {@link java.util.concurrent.locks.LockSupport}
 * class provides lower-level blocking and unblocking support that is
 * useful for those developers implementing their own customized lock
 * classes.
 *
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/function/package-info.java
package java.util.function;

/**
 * <em>Functional interfaces</em> provide target types for lambda expressions
 * and method references.  Each functional interface has a single abstract
 * method, called the <em>functional method</em> for that functional interface,
 * to which the lambda expression's parameter and return types are matched or
 * adapted.  Functional interfaces can provide a target type in multiple
 * contexts, such as assignment context, method invocation, or cast context:
 *
 * <pre>{@code
 *     // Assignment context
 *     Predicate<String> p = String::isEmpty;
 *
 *     // Method invocation context
 *     stream.filter(e -> e.getSize() > 10)...
 *
 *     // Cast context
 *     stream.map((ToIntFunction) e -> e.getSize())...
 * }</pre>
 *
 * <p>The interfaces in this package are general purpose functional interfaces
 * used by the JDK, and are available to be used by user code as well.  While
 * they do not identify a complete set of function shapes to which lambda
 * expressions might be adapted, they provide enough to cover common
 * requirements. Other functional interfaces provided for specific purposes,
 * such as {@link java.io.FileFilter}, are defined in the packages where they
 * are used.
 *
 * <p>The interfaces in this package are annotated with
 * {@link java.lang.FunctionalInterface}. This annotation is not a requirement
 * for the compiler to recognize an interface as a functional interface, but
 * merely an aid to capture design intent and enlist the help of the compiler in
 * identifying accidental violations of design intent.
 *
 * <p>Functional interfaces often represent abstract concepts like functions,
 * actions, or predicates.  In documenting functional interfaces, or referring
 * to variables typed as functional interfaces, it is common to refer directly
 * to those abstract concepts, for example using "this function" instead of
 * "the function represented by this object".  When an API method is said to
 * accept or return a functional interface in this manner, such as "applies the
 * provided function to...", this is understood to mean a <i>non-null</i>
 * reference to an object implementing the appropriate functional interface,
 * unless potential nullity is explicitly specified.
 *
 * <p>The functional interfaces in this package follow an extensible naming
 * convention, as follows:
 *
 * <ul>
 *     <li>There are several basic function shapes, including
 *     {@link java.util.function.Function} (unary function from {@code T} to {@code R}),
 *     {@link java.util.function.Consumer} (unary function from {@code T} to {@code void}),
 *     {@link java.util.function.Predicate} (unary function from {@code T} to {@code boolean}),
 *     and {@link java.util.function.Supplier} (nilary function to {@code R}).
 *     </li>
 *
 *     <li>Function shapes have a natural arity based on how they are most
 *     commonly used.  The basic shapes can be modified by an arity prefix to
 *     indicate a different arity, such as
 *     {@link java.util.function.BiFunction} (binary function from {@code T} and
 *     {@code U} to {@code R}).
 *     </li>
 *
 *     <li>There are additional derived function shapes which extend the basic
 *     function shapes, including {@link java.util.function.UnaryOperator}
 *     (extends {@code Function}) and {@link java.util.function.BinaryOperator}
 *     (extends {@code BiFunction}).
 *     </li>
 *
 *     <li>Type parameters of functional interfaces can be specialized to
 *     primitives with additional type prefixes.  To specialize the return type
 *     for a type that has both generic return type and generic arguments, we
 *     prefix {@code ToXxx}, as in {@link java.util.function.ToIntFunction}.
 *     Otherwise, type arguments are specialized left-to-right, as in
 *     {@link java.util.function.DoubleConsumer}
 *     or {@link java.util.function.ObjIntConsumer}.
 *     (The type prefix {@code Obj} is used to indicate that we don't want to
 *     specialize this parameter, but want to move on to the next parameter,
 *     as in {@link java.util.function.ObjIntConsumer}.)
 *     These schemes can be combined, as in {@code IntToDoubleFunction}.
 *     </li>
 *
 *     <li>If there are specialization prefixes for all arguments, the arity
 *     prefix may be left out (as in {@link java.util.function.ObjIntConsumer}).
 *     </li>
 * </ul>
 *
 * @see java.lang.FunctionalInterface
 * @since 1.8
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/package-info.java
package java.util.stream;

/**
 * Classes to support functional-style operations on streams of elements, such
 * as map-reduce transformations on collections.  For example:
 *
 * <pre>{@code
 *     int sum = widgets.stream()
 *                      .filter(b -> b.getColor() == RED)
 *                      .mapToInt(b -> b.getWeight())
 *                      .sum();
 * }</pre>
 *
 * <p>Here we use {@code widgets}, a {@code Collection<Widget>},
 * as a source for a stream, and then perform a filter-map-reduce on the stream
 * to obtain the sum of the weights of the red widgets.  (Summation is an
 * example of a <a href="package-summary.html#Reduction">reduction</a>
 * operation.)
 *
 * <p>The key abstraction introduced in this package is <em>stream</em>.  The
 * classes {@link java.util.stream.Stream}, {@link java.util.stream.IntStream},
 * {@link java.util.stream.LongStream}, and {@link java.util.stream.DoubleStream}
 * are streams over objects and the primitive {@code int}, {@code long} and
 * {@code double} types.  Streams differ from collections in several ways:
 *
 * <ul>
 *     <li>No storage.  A stream is not a data structure that stores elements;
 *     instead, it conveys elements from a source such as a data structure,
 *     an array, a generator function, or an I/O channel, through a pipeline of
 *     computational operations.</li>
 *     <li>Functional in nature.  An operation on a stream produces a result,
 *     but does not modify its source.  For example, filtering a {@code Stream}
 *     obtained from a collection produces a new {@code Stream} without the
 *     filtered elements, rather than removing elements from the source
 *     collection.</li>
 *     <li>Laziness-seeking.  Many stream operations, such as filtering, mapping,
 *     or duplicate removal, can be implemented lazily, exposing opportunities
 *     for optimization.  For example, "find the first {@code String} with
 *     three consecutive vowels" need not examine all the input strings.
 *     Stream operations are divided into intermediate ({@code Stream}-producing)
 *     operations and terminal (value- or side-effect-producing) operations.
 *     Intermediate operations are always lazy.</li>
 *     <li>Possibly unbounded.  While collections have a finite size, streams
 *     need not.  Short-circuiting operations such as {@code limit(n)} or
 *     {@code findFirst()} can allow computations on infinite streams to
 *     complete in finite time.</li>
 *     <li>Consumable. The elements of a stream are only visited once during
 *     the life of a stream. Like an {@link java.util.Iterator}, a new stream
 *     must be generated to revisit the same elements of the source.
 *     </li>
 * </ul>
 *
 * Streams can be obtained in a number of ways. Some examples include:
 * <ul>
 *     <li>From a {@link java.util.Collection} via the {@code stream()} and
 *     {@code parallelStream()} methods;</li>
 *     <li>From an array via {@link java.util.Arrays#stream(Object[])};</li>
 *     <li>From static factory methods on the stream classes, such as
 *     {@link java.util.stream.Stream#of(Object[])},
 *     {@link java.util.stream.IntStream#range(int, int)}
 *     or {@link java.util.stream.Stream#iterate(Object, UnaryOperator)};</li>
 *     <li>The lines of a file can be obtained from {@link java.io.BufferedReader#lines()};</li>
 *     <li>Streams of file paths can be obtained from methods in {@link java.nio.file.Files};</li>
 *     <li>Streams of random numbers can be obtained from {@link java.util.Random#ints()};</li>
 *     <li>Numerous other stream-bearing methods in the JDK, including
 *     {@link java.util.BitSet#stream()},
 *     {@link java.util.regex.Pattern#splitAsStream(java.lang.CharSequence)},
 *     and {@link java.util.jar.JarFile#stream()}.</li>
 * </ul>
 *
 * <p>Additional stream sources can be provided by third-party libraries using
 * <a href="package-summary.html#StreamSources">these techniques</a>.
 *
 * <h2><a name="StreamOps">Stream operations and pipelines</a></h2>
 *
 * <p>Stream operations are divided into <em>intermediate</em> and
 * <em>terminal</em> operations, and are combined to form <em>stream
 * pipelines</em>.  A stream pipeline consists of a source (such as a
 * {@code Collection}, an array, a generator function, or an I/O channel);
 * followed by zero or more intermediate operations such as
 * {@code Stream.filter} or {@code Stream.map}; and a terminal operation such
 * as {@code Stream.forEach} or {@code Stream.reduce}.
 *
 * <p>Intermediate operations return a new stream.  They are always
 * <em>lazy</em>; executing an intermediate operation such as
 * {@code filter()} does not actually perform any filtering, but instead
 * creates a new stream that, when traversed, contains the elements of
 * the initial stream that match the given predicate.  Traversal
 * of the pipeline source does not begin until the terminal operation of the
 * pipeline is executed.
 *
 * <p>Terminal operations, such as {@code Stream.forEach} or
 * {@code IntStream.sum}, may traverse the stream to produce a result or a
 * side-effect. After the terminal operation is performed, the stream pipeline
 * is considered consumed, and can no longer be used; if you need to traverse
 * the same data source again, you must return to the data source to get a new
 * stream.  In almost all cases, terminal operations are <em>eager</em>,
 * completing their traversal of the data source and processing of the pipeline
 * before returning.  Only the terminal operations {@code iterator()} and
 * {@code spliterator()} are not; these are provided as an "escape hatch" to enable
 * arbitrary client-controlled pipeline traversals in the event that the
 * existing operations are not sufficient to the task.
 *
 * <p> Processing streams lazily allows for significant efficiencies; in a
 * pipeline such as the filter-map-sum example above, filtering, mapping, and
 * summing can be fused into a single pass on the data, with minimal
 * intermediate state. Laziness also allows avoiding examining all the data
 * when it is not necessary; for operations such as "find the first string
 * longer than 1000 characters", it is only necessary to examine just enough
 * strings to find one that has the desired characteristics without examining
 * all of the strings available from the source. (This behavior becomes even
 * more important when the input stream is infinite and not merely large.)
 *
 * <p>Intermediate operations are further divided into <em>stateless</em>
 * and <em>stateful</em> operations. Stateless operations, such as {@code filter}
 * and {@code map}, retain no state from previously seen element when processing
 * a new element -- each element can be processed
 * independently of operations on other elements.  Stateful operations, such as
 * {@code distinct} and {@code sorted}, may incorporate state from previously
 * seen elements when processing new elements.
 *
 * <p>Stateful operations may need to process the entire input
 * before producing a result.  For example, one cannot produce any results from
 * sorting a stream until one has seen all elements of the stream.  As a result,
 * under parallel computation, some pipelines containing stateful intermediate
 * operations may require multiple passes on the data or may need to buffer
 * significant data.  Pipelines containing exclusively stateless intermediate
 * operations can be processed in a single pass, whether sequential or parallel,
 * with minimal data buffering.
 *
 * <p>Further, some operations are deemed <em>short-circuiting</em> operations.
 * An intermediate operation is short-circuiting if, when presented with
 * infinite input, it may produce a finite stream as a result.  A terminal
 * operation is short-circuiting if, when presented with infinite input, it may
 * terminate in finite time.  Having a short-circuiting operation in the pipeline
 * is a necessary, but not sufficient, condition for the processing of an infinite
 * stream to terminate normally in finite time.
 *
 * <h3>Parallelism</h3>
 *
 * <p>Processing elements with an explicit {@code for-}loop is inherently serial.
 * Streams facilitate parallel execution by reframing the computation as a pipeline of
 * aggregate operations, rather than as imperative operations on each individual
 * element.  All streams operations can execute either in serial or in parallel.
 * The stream implementations in the JDK create serial streams unless parallelism is
 * explicitly requested.  For example, {@code Collection} has methods
 * {@link java.util.Collection#stream} and {@link java.util.Collection#parallelStream},
 * which produce sequential and parallel streams respectively; other
 * stream-bearing methods such as {@link java.util.stream.IntStream#range(int, int)}
 * produce sequential streams but these streams can be efficiently parallelized by
 * invoking their {@link java.util.stream.BaseStream#parallel()} method.
 * To execute the prior "sum of weights of widgets" query in parallel, we would
 * do:
 *
 * <pre>{@code
 *     int sumOfWeights = widgets.}<code><b>parallelStream()</b></code>{@code
 *                               .filter(b -> b.getColor() == RED)
 *                               .mapToInt(b -> b.getWeight())
 *                               .sum();
 * }</pre>
 *
 * <p>The only difference between the serial and parallel versions of this
 * example is the creation of the initial stream, using "{@code parallelStream()}"
 * instead of "{@code stream()}".  When the terminal operation is initiated,
 * the stream pipeline is executed sequentially or in parallel depending on the
 * orientation of the stream on which it is invoked.  Whether a stream will execute in serial or
 * parallel can be determined with the {@code isParallel()} method, and the
 * orientation of a stream can be modified with the
 * {@link java.util.stream.BaseStream#sequential()} and
 * {@link java.util.stream.BaseStream#parallel()} operations.  When the terminal
 * operation is initiated, the stream pipeline is executed sequentially or in
 * parallel depending on the mode of the stream on which it is invoked.
 *
 * <p>Except for operations identified as explicitly nondeterministic, such
 * as {@code findAny()}, whether a stream executes sequentially or in parallel
 * should not change the result of the computation.
 *
 * <p>Most stream operations accept parameters that describe user-specified
 * behavior, which are often lambda expressions.  To preserve correct behavior,
 * these <em>behavioral parameters</em> must be <em>non-interfering</em>, and in
 * most cases must be <em>stateless</em>.  Such parameters are always instances
 * of a <a href="../function/package-summary.html">functional interface</a> such
 * as {@link java.util.function.Function}, and are often lambda expressions or
 * method references.
 *
 * <h3><a name="NonInterference">Non-interference</a></h3>
 *
 * Streams enable you to execute possibly-parallel aggregate operations over a
 * variety of data sources, including even non-thread-safe collections such as
 * {@code ArrayList}. This is possible only if we can prevent
 * <em>interference</em> with the data source during the execution of a stream
 * pipeline.  Except for the escape-hatch operations {@code iterator()} and
 * {@code spliterator()}, execution begins when the terminal operation is
 * invoked, and ends when the terminal operation completes.  For most data
 * sources, preventing interference means ensuring that the data source is
 * <em>not modified at all</em> during the execution of the stream pipeline.
 * The notable exception to this are streams whose sources are concurrent
 * collections, which are specifically designed to handle concurrent modification.
 * Concurrent stream sources are those whose {@code Spliterator} reports the
 * {@code CONCURRENT} characteristic.
 *
 * <p>Accordingly, behavioral parameters in stream pipelines whose source might
 * not be concurrent should never modify the stream's data source.
 * A behavioral parameter is said to <em>interfere</em> with a non-concurrent
 * data source if it modifies, or causes to be
 * modified, the stream's data source.  The need for non-interference applies
 * to all pipelines, not just parallel ones.  Unless the stream source is
 * concurrent, modifying a stream's data source during execution of a stream
 * pipeline can cause exceptions, incorrect answers, or nonconformant behavior.
 *
 * For well-behaved stream sources, the source can be modified before the
 * terminal operation commences and those modifications will be reflected in
 * the covered elements.  For example, consider the following code:
 *
 * <pre>{@code
 *     List<String> l = new ArrayList(Arrays.asList("one", "two"));
 *     Stream<String> sl = l.stream();
 *     l.add("three");
 *     String s = sl.collect(joining(" "));
 * }</pre>
 *
 * First a list is created consisting of two strings: "one"; and "two". Then a
 * stream is created from that list. Next the list is modified by adding a third
 * string: "three". Finally the elements of the stream are collected and joined
 * together. Since the list was modified before the terminal {@code collect}
 * operation commenced the result will be a string of "one two three". All the
 * streams returned from JDK collections, and most other JDK classes,
 * are well-behaved in this manner; for streams generated by other libraries, see
 * <a href="package-summary.html#StreamSources">Low-level stream
 * construction</a> for requirements for building well-behaved streams.
 *
 * <h3><a name="Statelessness">Stateless behaviors</a></h3>
 *
 * Stream pipeline results may be nondeterministic or incorrect if the behavioral
 * parameters to the stream operations are <em>stateful</em>.  A stateful lambda
 * (or other object implementing the appropriate functional interface) is one
 * whose result depends on any state which might change during the execution
 * of the stream pipeline.  An example of a stateful lambda is the parameter
 * to {@code map()} in:
 *
 * <pre>{@code
 *     Set<Integer> seen = Collections.synchronizedSet(new HashSet<>());
 *     stream.parallel().map(e -> { if (seen.add(e)) return 0; else return e; })...
 * }</pre>
 *
 * Here, if the mapping operation is performed in parallel, the results for the
 * same input could vary from run to run, due to thread scheduling differences,
 * whereas, with a stateless lambda expression the results would always be the
 * same.
 *
 * <p>Note also that attempting to access mutable state from behavioral parameters
 * presents you with a bad choice with respect to safety and performance; if
 * you do not synchronize access to that state, you have a data race and
 * therefore your code is broken, but if you do synchronize access to that
 * state, you risk having contention undermine the parallelism you are seeking
 * to benefit from.  The best approach is to avoid stateful behavioral
 * parameters to stream operations entirely; there is usually a way to
 * restructure the stream pipeline to avoid statefulness.
 *
 * <h3>Side-effects</h3>
 *
 * Side-effects in behavioral parameters to stream operations are, in general,
 * discouraged, as they can often lead to unwitting violations of the
 * statelessness requirement, as well as other thread-safety hazards.
 *
 * <p>If the behavioral parameters do have side-effects, unless explicitly
 * stated, there are no guarantees as to the
 * <a href="../concurrent/package-summary.html#MemoryVisibility"><i>visibility</i></a>
 * of those side-effects to other threads, nor are there any guarantees that
 * different operations on the "same" element within the same stream pipeline
 * are executed in the same thread.  Further, the ordering of those effects
 * may be surprising.  Even when a pipeline is constrained to produce a
 * <em>result</em> that is consistent with the encounter order of the stream
 * source (for example, {@code IntStream.range(0,5).parallel().map(x -> x*2).toArray()}
 * must produce {@code [0, 2, 4, 6, 8]}), no guarantees are made as to the order
 * in which the mapper function is applied to individual elements, or in what
 * thread any behavioral parameter is executed for a given element.
 *
 * <p>Many computations where one might be tempted to use side effects can be more
 * safely and efficiently expressed without side-effects, such as using
 * <a href="package-summary.html#Reduction">reduction</a> instead of mutable
 * accumulators. However, side-effects such as using {@code println()} for debugging
 * purposes are usually harmless.  A small number of stream operations, such as
 * {@code forEach()} and {@code peek()}, can operate only via side-effects;
 * these should be used with care.
 *
 * <p>As an example of how to transform a stream pipeline that inappropriately
 * uses side-effects to one that does not, the following code searches a stream
 * of strings for those matching a given regular expression, and puts the
 * matches in a list.
 *
 * <pre>{@code
 *     ArrayList<String> results = new ArrayList<>();
 *     stream.filter(s -> pattern.matcher(s).matches())
 *           .forEach(s -> results.add(s));  // Unnecessary use of side-effects!
 * }</pre>
 *
 * This code unnecessarily uses side-effects.  If executed in parallel, the
 * non-thread-safety of {@code ArrayList} would cause incorrect results, and
 * adding needed synchronization would cause contention, undermining the
 * benefit of parallelism.  Furthermore, using side-effects here is completely
 * unnecessary; the {@code forEach()} can simply be replaced with a reduction
 * operation that is safer, more efficient, and more amenable to
 * parallelization:
 *
 * <pre>{@code
 *     List<String>results =
 *         stream.filter(s -> pattern.matcher(s).matches())
 *               .collect(Collectors.toList());  // No side-effects!
 * }</pre>
 *
 * <h3><a name="Ordering">Ordering</a></h3>
 *
 * <p>Streams may or may not have a defined <em>encounter order</em>.  Whether
 * or not a stream has an encounter order depends on the source and the
 * intermediate operations.  Certain stream sources (such as {@code List} or
 * arrays) are intrinsically ordered, whereas others (such as {@code HashSet})
 * are not.  Some intermediate operations, such as {@code sorted()}, may impose
 * an encounter order on an otherwise unordered stream, and others may render an
 * ordered stream unordered, such as {@link java.util.stream.BaseStream#unordered()}.
 * Further, some terminal operations may ignore encounter order, such as
 * {@code forEach()}.
 *
 * <p>If a stream is ordered, most operations are constrained to operate on the
 * elements in their encounter order; if the source of a stream is a {@code List}
 * containing {@code [1, 2, 3]}, then the result of executing {@code map(x -> x*2)}
 * must be {@code [2, 4, 6]}.  However, if the source has no defined encounter
 * order, then any permutation of the values {@code [2, 4, 6]} would be a valid
 * result.
 *
 * <p>For sequential streams, the presence or absence of an encounter order does
 * not affect performance, only determinism.  If a stream is ordered, repeated
 * execution of identical stream pipelines on an identical source will produce
 * an identical result; if it is not ordered, repeated execution might produce
 * different results.
 *
 * <p>For parallel streams, relaxing the ordering constraint can sometimes enable
 * more efficient execution.  Certain aggregate operations,
 * such as filtering duplicates ({@code distinct()}) or grouped reductions
 * ({@code Collectors.groupingBy()}) can be implemented more efficiently if ordering of elements
 * is not relevant.  Similarly, operations that are intrinsically tied to encounter order,
 * such as {@code limit()}, may require
 * buffering to ensure proper ordering, undermining the benefit of parallelism.
 * In cases where the stream has an encounter order, but the user does not
 * particularly <em>care</em> about that encounter order, explicitly de-ordering
 * the stream with {@link java.util.stream.BaseStream#unordered() unordered()} may
 * improve parallel performance for some stateful or terminal operations.
 * However, most stream pipelines, such as the "sum of weight of blocks" example
 * above, still parallelize efficiently even under ordering constraints.
 *
 * <h2><a name="Reduction">Reduction operations</a></h2>
 *
 * A <em>reduction</em> operation (also called a <em>fold</em>) takes a sequence
 * of input elements and combines them into a single summary result by repeated
 * application of a combining operation, such as finding the sum or maximum of
 * a set of numbers, or accumulating elements into a list.  The streams classes have
 * multiple forms of general reduction operations, called
 * {@link java.util.stream.Stream#reduce(java.util.function.BinaryOperator) reduce()}
 * and {@link java.util.stream.Stream#collect(java.util.stream.Collector) collect()},
 * as well as multiple specialized reduction forms such as
 * {@link java.util.stream.IntStream#sum() sum()}, {@link java.util.stream.IntStream#max() max()},
 * or {@link java.util.stream.IntStream#count() count()}.
 *
 * <p>Of course, such operations can be readily implemented as simple sequential
 * loops, as in:
 * <pre>{@code
 *    int sum = 0;
 *    for (int x : numbers) {
 *       sum += x;
 *    }
 * }</pre>
 * However, there are good reasons to prefer a reduce operation
 * over a mutative accumulation such as the above.  Not only is a reduction
 * "more abstract" -- it operates on the stream as a whole rather than individual
 * elements -- but a properly constructed reduce operation is inherently
 * parallelizable, so long as the function(s) used to process the elements
 * are <a href="package-summary.html#Associativity">associative</a> and
 * <a href="package-summary.html#NonInterfering">stateless</a>.
 * For example, given a stream of numbers for which we want to find the sum, we
 * can write:
 * <pre>{@code
 *    int sum = numbers.stream().reduce(0, (x,y) -> x+y);
 * }</pre>
 * or:
 * <pre>{@code
 *    int sum = numbers.stream().reduce(0, Integer::sum);
 * }</pre>
 *
 * <p>These reduction operations can run safely in parallel with almost no
 * modification:
 * <pre>{@code
 *    int sum = numbers.parallelStream().reduce(0, Integer::sum);
 * }</pre>
 *
 * <p>Reduction parallellizes well because the implementation
 * can operate on subsets of the data in parallel, and then combine the
 * intermediate results to get the final correct answer.  (Even if the language
 * had a "parallel for-each" construct, the mutative accumulation approach would
 * still required the developer to provide
 * thread-safe updates to the shared accumulating variable {@code sum}, and
 * the required synchronization would then likely eliminate any performance gain from
 * parallelism.)  Using {@code reduce()} instead removes all of the
 * burden of parallelizing the reduction operation, and the library can provide
 * an efficient parallel implementation with no additional synchronization
 * required.
 *
 * <p>The "widgets" examples shown earlier shows how reduction combines with
 * other operations to replace for loops with bulk operations.  If {@code widgets}
 * is a collection of {@code Widget} objects, which have a {@code getWeight} method,
 * we can find the heaviest widget with:
 * <pre>{@code
 *     OptionalInt heaviest = widgets.parallelStream()
 *                                   .mapToInt(Widget::getWeight)
 *                                   .max();
 * }</pre>
 *
 * <p>In its more general form, a {@code reduce} operation on elements of type
 * {@code <T>} yielding a result of type {@code <U>} requires three parameters:
 * <pre>{@code
 * <U> U reduce(U identity,
 *              BiFunction<U, ? super T, U> accumulator,
 *              BinaryOperator<U> combiner);
 * }</pre>
 * Here, the <em>identity</em> element is both an initial seed value for the reduction
 * and a default result if there are no input elements. The <em>accumulator</em>
 * function takes a partial result and the next element, and produces a new
 * partial result. The <em>combiner</em> function combines two partial results
 * to produce a new partial result.  (The combiner is necessary in parallel
 * reductions, where the input is partitioned, a partial accumulation computed
 * for each partition, and then the partial results are combined to produce a
 * final result.)
 *
 * <p>More formally, the {@code identity} value must be an <em>identity</em> for
 * the combiner function. This means that for all {@code u},
 * {@code combiner.apply(identity, u)} is equal to {@code u}. Additionally, the
 * {@code combiner} function must be <a href="package-summary.html#Associativity">associative</a> and
 * must be compatible with the {@code accumulator} function: for all {@code u}
 * and {@code t}, {@code combiner.apply(u, accumulator.apply(identity, t))} must
 * be {@code equals()} to {@code accumulator.apply(u, t)}.
 *
 * <p>The three-argument form is a generalization of the two-argument form,
 * incorporating a mapping step into the accumulation step.  We could
 * re-cast the simple sum-of-weights example using the more general form as
 * follows:
 * <pre>{@code
 *     int sumOfWeights = widgets.stream()
 *                               .reduce(0,
 *                                       (sum, b) -> sum + b.getWeight())
 *                                       Integer::sum);
 * }</pre>
 * though the explicit map-reduce form is more readable and therefore should
 * usually be preferred. The generalized form is provided for cases where
 * significant work can be optimized away by combining mapping and reducing
 * into a single function.
 *
 * <h3><a name="MutableReduction">Mutable reduction</a></h3>
 *
 * A <em>mutable reduction operation</em> accumulates input elements into a
 * mutable result container, such as a {@code Collection} or {@code StringBuilder},
 * as it processes the elements in the stream.
 *
 * <p>If we wanted to take a stream of strings and concatenate them into a
 * single long string, we <em>could</em> achieve this with ordinary reduction:
 * <pre>{@code
 *     String concatenated = strings.reduce("", String::concat)
 * }</pre>
 *
 * <p>We would get the desired result, and it would even work in parallel.  However,
 * we might not be happy about the performance!  Such an implementation would do
 * a great deal of string copying, and the run time would be <em>O(n^2)</em> in
 * the number of characters.  A more performant approach would be to accumulate
 * the results into a {@link java.lang.StringBuilder}, which is a mutable
 * container for accumulating strings.  We can use the same technique to
 * parallelize mutable reduction as we do with ordinary reduction.
 *
 * <p>The mutable reduction operation is called
 * {@link java.util.stream.Stream#collect(Collector) collect()},
 * as it collects together the desired results into a result container such
 * as a {@code Collection}.
 * A {@code collect} operation requires three functions:
 * a supplier function to construct new instances of the result container, an
 * accumulator function to incorporate an input element into a result
 * container, and a combining function to merge the contents of one result
 * container into another.  The form of this is very similar to the general
 * form of ordinary reduction:
 * <pre>{@code
 * <R> R collect(Supplier<R> supplier,
 *               BiConsumer<R, ? super T> accumulator,
 *               BiConsumer<R, R> combiner);
 * }</pre>
 * <p>As with {@code reduce()}, a benefit of expressing {@code collect} in this
 * abstract way is that it is directly amenable to parallelization: we can
 * accumulate partial results in parallel and then combine them, so long as the
 * accumulation and combining functions satisfy the appropriate requirements.
 * For example, to collect the String representations of the elements in a
 * stream into an {@code ArrayList}, we could write the obvious sequential
 * for-each form:
 * <pre>{@code
 *     ArrayList<String> strings = new ArrayList<>();
 *     for (T element : stream) {
 *         strings.add(element.toString());
 *     }
 * }</pre>
 * Or we could use a parallelizable collect form:
 * <pre>{@code
 *     ArrayList<String> strings = stream.collect(() -> new ArrayList<>(),
 *                                                (c, e) -> c.add(e.toString()),
 *                                                (c1, c2) -> c1.addAll(c2));
 * }</pre>
 * or, pulling the mapping operation out of the accumulator function, we could
 * express it more succinctly as:
 * <pre>{@code
 *     List<String> strings = stream.map(Object::toString)
 *                                  .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
 * }</pre>
 * Here, our supplier is just the {@link java.util.ArrayList#ArrayList()
 * ArrayList constructor}, the accumulator adds the stringified element to an
 * {@code ArrayList}, and the combiner simply uses {@link java.util.ArrayList#addAll addAll}
 * to copy the strings from one container into the other.
 *
 * <p>The three aspects of {@code collect} -- supplier, accumulator, and
 * combiner -- are tightly coupled.  We can use the abstraction of a
 * {@link java.util.stream.Collector} to capture all three aspects.  The
 * above example for collecting strings into a {@code List} can be rewritten
 * using a standard {@code Collector} as:
 * <pre>{@code
 *     List<String> strings = stream.map(Object::toString)
 *                                  .collect(Collectors.toList());
 * }</pre>
 *
 * <p>Packaging mutable reductions into a Collector has another advantage:
 * composability.  The class {@link java.util.stream.Collectors} contains a
 * number of predefined factories for collectors, including combinators
 * that transform one collector into another.  For example, suppose we have a
 * collector that computes the sum of the salaries of a stream of
 * employees, as follows:
 *
 * <pre>{@code
 *     Collector<Employee, ?, Integer> summingSalaries
 *         = Collectors.summingInt(Employee::getSalary);
 * }</pre>
 *
 * (The {@code ?} for the second type parameter merely indicates that we don't
 * care about the intermediate representation used by this collector.)
 * If we wanted to create a collector to tabulate the sum of salaries by
 * department, we could reuse {@code summingSalaries} using
 * {@link java.util.stream.Collectors#groupingBy(java.util.function.Function, java.util.stream.Collector) groupingBy}:
 *
 * <pre>{@code
 *     Map<Department, Integer> salariesByDept
 *         = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
 *                                                            summingSalaries));
 * }</pre>
 *
 * <p>As with the regular reduction operation, {@code collect()} operations can
 * only be parallelized if appropriate conditions are met.  For any partially
 * accumulated result, combining it with an empty result container must
 * produce an equivalent result.  That is, for a partially accumulated result
 * {@code p} that is the result of any series of accumulator and combiner
 * invocations, {@code p} must be equivalent to
 * {@code combiner.apply(p, supplier.get())}.
 *
 * <p>Further, however the computation is split, it must produce an equivalent
 * result.  For any input elements {@code t1} and {@code t2}, the results
 * {@code r1} and {@code r2} in the computation below must be equivalent:
 * <pre>{@code
 *     A a1 = supplier.get();
 *     accumulator.accept(a1, t1);
 *     accumulator.accept(a1, t2);
 *     R r1 = finisher.apply(a1);  // result without splitting
 *
 *     A a2 = supplier.get();
 *     accumulator.accept(a2, t1);
 *     A a3 = supplier.get();
 *     accumulator.accept(a3, t2);
 *     R r2 = finisher.apply(combiner.apply(a2, a3));  // result with splitting
 * }</pre>
 *
 * <p>Here, equivalence generally means according to {@link java.lang.Object#equals(Object)}.
 * but in some cases equivalence may be relaxed to account for differences in
 * order.
 *
 * <h3><a name="ConcurrentReduction">Reduction, concurrency, and ordering</a></h3>
 *
 * With some complex reduction operations, for example a {@code collect()} that
 * produces a {@code Map}, such as:
 * <pre>{@code
 *     Map<Buyer, List<Transaction>> salesByBuyer
 *         = txns.parallelStream()
 *               .collect(Collectors.groupingBy(Transaction::getBuyer));
 * }</pre>
 * it may actually be counterproductive to perform the operation in parallel.
 * This is because the combining step (merging one {@code Map} into another by
 * key) can be expensive for some {@code Map} implementations.
 *
 * <p>Suppose, however, that the result container used in this reduction
 * was a concurrently modifiable collection -- such as a
 * {@link java.util.concurrent.ConcurrentHashMap}. In that case, the parallel
 * invocations of the accumulator could actually deposit their results
 * concurrently into the same shared result container, eliminating the need for
 * the combiner to merge distinct result containers. This potentially provides
 * a boost to the parallel execution performance. We call this a
 * <em>concurrent</em> reduction.
 *
 * <p>A {@link java.util.stream.Collector} that supports concurrent reduction is
 * marked with the {@link java.util.stream.Collector.Characteristics#CONCURRENT}
 * characteristic.  However, a concurrent collection also has a downside.  If
 * multiple threads are depositing results concurrently into a shared container,
 * the order in which results are deposited is non-deterministic. Consequently,
 * a concurrent reduction is only possible if ordering is not important for the
 * stream being processed. The {@link java.util.stream.Stream#collect(Collector)}
 * implementation will only perform a concurrent reduction if
 * <ul>
 * <li>The stream is parallel;</li>
 * <li>The collector has the
 * {@link java.util.stream.Collector.Characteristics#CONCURRENT} characteristic,
 * and;</li>
 * <li>Either the stream is unordered, or the collector has the
 * {@link java.util.stream.Collector.Characteristics#UNORDERED} characteristic.
 * </ul>
 * You can ensure the stream is unordered by using the
 * {@link java.util.stream.BaseStream#unordered()} method.  For example:
 * <pre>{@code
 *     Map<Buyer, List<Transaction>> salesByBuyer
 *         = txns.parallelStream()
 *               .unordered()
 *               .collect(groupingByConcurrent(Transaction::getBuyer));
 * }</pre>
 * (where {@link java.util.stream.Collectors#groupingByConcurrent} is the
 * concurrent equivalent of {@code groupingBy}).
 *
 * <p>Note that if it is important that the elements for a given key appear in
 * the order they appear in the source, then we cannot use a concurrent
 * reduction, as ordering is one of the casualties of concurrent insertion.
 * We would then be constrained to implement either a sequential reduction or
 * a merge-based parallel reduction.
 *
 * <h3><a name="Associativity">Associativity</a></h3>
 *
 * An operator or function {@code op} is <em>associative</em> if the following
 * holds:
 * <pre>{@code
 *     (a op b) op c == a op (b op c)
 * }</pre>
 * The importance of this to parallel evaluation can be seen if we expand this
 * to four terms:
 * <pre>{@code
 *     a op b op c op d == (a op b) op (c op d)
 * }</pre>
 * So we can evaluate {@code (a op b)} in parallel with {@code (c op d)}, and
 * then invoke {@code op} on the results.
 *
 * <p>Examples of associative operations include numeric addition, min, and
 * max, and string concatenation.
 *
 * <h2><a name="StreamSources">Low-level stream construction</a></h2>
 *
 * So far, all the stream examples have used methods like
 * {@link java.util.Collection#stream()} or {@link java.util.Arrays#stream(Object[])}
 * to obtain a stream.  How are those stream-bearing methods implemented?
 *
 * <p>The class {@link java.util.stream.StreamSupport} has a number of
 * low-level methods for creating a stream, all using some form of a
 * {@link java.util.Spliterator}. A spliterator is the parallel analogue of an
 * {@link java.util.Iterator}; it describes a (possibly infinite) collection of
 * elements, with support for sequentially advancing, bulk traversal, and
 * splitting off some portion of the input into another spliterator which can
 * be processed in parallel.  At the lowest level, all streams are driven by a
 * spliterator.
 *
 * <p>There are a number of implementation choices in implementing a
 * spliterator, nearly all of which are tradeoffs between simplicity of
 * implementation and runtime performance of streams using that spliterator.
 * The simplest, but least performant, way to create a spliterator is to
 * create one from an iterator using
 * {@link java.util.Spliterators#spliteratorUnknownSize(java.util.Iterator, int)}.
 * While such a spliterator will work, it will likely offer poor parallel
 * performance, since we have lost sizing information (how big is the
 * underlying data set), as well as being constrained to a simplistic
 * splitting algorithm.
 *
 * <p>A higher-quality spliterator will provide balanced and known-size
 * splits, accurate sizing information, and a number of other
 * {@link java.util.Spliterator#characteristics() characteristics} of the
 * spliterator or data that can be used by implementations to optimize
 * execution.
 *
 * <p>Spliterators for mutable data sources have an additional challenge;
 * timing of binding to the data, since the data could change between the time
 * the spliterator is created and the time the stream pipeline is executed.
 * Ideally, a spliterator for a stream would report a characteristic of

 * {@code IMMUTABLE} or {@code CONCURRENT}; if not it should be
 * <a href="../Spliterator.html#binding"><em>late-binding</em></a>. If a source
 * cannot directly supply a recommended spliterator, it may indirectly supply
 * a spliterator using a {@code Supplier}, and construct a stream via the
 * {@code Supplier}-accepting versions of
 * {@link java.util.stream.StreamSupport#stream(Supplier, int, boolean) stream()}.
 * The spliterator is obtained from the supplier only after the terminal
 * operation of the stream pipeline commences.
 *
 * <p>These requirements significantly reduce the scope of potential
 * interference between mutations of the stream source and execution of stream
 * pipelines. Streams based on spliterators with the desired characteristics,
 * or those using the Supplier-based factory forms, are immune to
 * modifications of the data source prior to commencement of the terminal
 * operation (provided the behavioral parameters to the stream operations meet
 * the required criteria for non-interference and statelessness).  See
 * <a href="package-summary.html#NonInterference">Non-Interference</a>
 * for more details.
 *
 * @since 1.8
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/package-info.java
package javax.annotation.processing;

/**
 * Facilities for declaring annotation processors and for
 * allowing annotation processors to communicate with an annotation processing
 * tool environment.
 *
 * <p> Unless otherwise specified in a particular implementation, the
 * collections returned by methods in this package should be expected
 * to be unmodifiable by the caller and unsafe for concurrent access.
 *
 * <p> Unless otherwise specified, methods in this package will throw
 * a {@code NullPointerException} if given a {@code null} argument.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/package-info.java
package javax.lang.model;

/**
 * Classes and hierarchies of packages used to model the Java
 * programming language.
 *
 * The members of this package and its subpackages are for use in
 * language modeling and language processing tasks and APIs including,
 * but not limited to, the {@linkplain javax.annotation.processing
 * annotation processing} framework.
 *
 * <p> This language model follows a <i>mirror</i>-based design; see
 *
 * <blockquote>
 * Gilad Bracha and David Ungar. <i>Mirrors: Design Principles for
 * Meta-level Facilities of Object-Oriented Programming Languages</i>.
 * In Proc. of the ACM Conf. on Object-Oriented Programming, Systems,
 * Languages and Applications, October 2004.
 * </blockquote>
 *
 * In particular, the model makes a distinction between static
 * language constructs, like the {@linkplain javax.lang.model.element
 * element} representing {@code java.util.Set}, and the family of
 * {@linkplain javax.lang.model.type types} that may be associated
 * with an element, like the raw type {@code java.util.Set}, {@code
 * java.util.Set<String>}, and {@code java.util.Set<T>}.
 *
 * <p> Unless otherwise specified, methods in this package will throw
 * a {@code NullPointerException} if given a {@code null} argument.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/package-info.java
package javax.lang.model.element;

/**
 * Interfaces used to model elements of the Java programming language.
 *
 * The term "element" in this package is used to refer to program
 * elements, the declared entities that make up a program.  Elements
 * include classes, interfaces, methods, constructors, and fields.
 * The interfaces in this package do not model the structure of a
 * program inside a method body; for example there is no
 * representation of a {@code for} loop or {@code try}-{@code finally}
 * block.  However, the interfaces can model some structures only
 * appearing inside method bodies, such as local variables and
 * anonymous classes.
 *
 * <p>When used in the context of annotation processing, an accurate
 * model of the element being represented must be returned.  As this
 * is a language model, the source code provides the fiducial
 * (reference) representation of the construct in question rather than
 * a representation in an executable output like a class file.
 * Executable output may serve as the basis for creating a modeling
 * element.  However, the process of translating source code to
 * executable output may not permit recovering some aspects of the
 * source code representation.  For example, annotations with
 * {@linkplain java.lang.annotation.RetentionPolicy#SOURCE source}
 * {@linkplain java.lang.annotation.Retention retention} cannot be
 * recovered from class files and class files might not be able to
 * provide source position information.
 *
 * Names of parameters may not be recoverable from class files.
 *
 * The {@linkplain javax.lang.model.element.Modifier modifiers} on an
 * element may differ in some cases including:
 *
 * <ul>
 * <li> {@code strictfp} on a class or interface
 * <li> {@code final} on a parameter
 * <li> {@code protected}, {@code private}, and {@code static} on classes and interfaces
 * </ul>
 *
 * Additionally, synthetic constructs in a class file, such as
 * accessor methods used in implementing nested classes and bridge
 * methods used in implementing covariant returns, are translation
 * artifacts outside of this model.
 *
 * <p>During annotation processing, operating on incomplete or
 * erroneous programs is necessary; however, there are fewer
 * guarantees about the nature of the resulting model.  If the source
 * code is not syntactically well-formed or has some other
 * irrecoverable error that could not be removed by the generation of
 * new types, a model may or may not be provided as a quality of
 * implementation issue.
 * If a program is syntactically valid but erroneous in some other
 * fashion, any returned model must have no less information than if
 * all the method bodies in the program were replaced by {@code "throw
 * new RuntimeException();"}.  If a program refers to a missing type XYZ,
 * the returned model must contain no less information than if the
 * declaration of type XYZ were assumed to be {@code "class XYZ {}"},
 * {@code "interface XYZ {}"}, {@code "enum XYZ {}"}, or {@code
 * "@interface XYZ {}"}. If a program refers to a missing type {@code
 * XYZ<K1, ... ,Kn>}, the returned model must contain no less
 * information than if the declaration of XYZ were assumed to be
 * {@code "class XYZ<T1, ... ,Tn> {}"} or {@code "interface XYZ<T1,
 * ... ,Tn> {}"}
 *
 * <p> Unless otherwise specified in a particular implementation, the
 * collections returned by methods in this package should be expected
 * to be unmodifiable by the caller and unsafe for concurrent access.
 *
 * <p> Unless otherwise specified, methods in this package will throw
 * a {@code NullPointerException} if given a {@code null} argument.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/package-info.java
package javax.lang.model.type;

/**
 * Interfaces used to model Java programming language types.
 *
 * <p> Unless otherwise specified in a particular implementation, the
 * collections returned by methods in this package should be expected
 * to be unmodifiable by the caller and unsafe for concurrent access.
 *
 * <p> Unless otherwise specified, methods in this package will throw
 * a {@code NullPointerException} if given a {@code null} argument.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/package-info.java
package javax.lang.model.util;

/**
 * Utilities to assist in the processing of
 * {@linkplain javax.lang.model.element program elements} and
 * {@linkplain javax.lang.model.type types}.
 *
 * <p> Unless otherwise specified in a particular implementation, the
 * collections returned by methods in this package should be expected
 * to be unmodifiable by the caller and unsafe for concurrent access.
 *
 * <p> Unless otherwise specified, methods in this package will throw
 * a {@code NullPointerException} if given a {@code null} argument.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/package-info.java
package javax.security.auth;

/**
 * This package provides a framework for authentication and
 * authorization. The framework allows
 * authentication to be performed in pluggable fashion. Different
 * authentication modules can be plugged under an application without
 * requiring modifications to the application itself. The
 * authorization component allows specification of access controls
 * based on code location, code signers and code executors
 * (Subjects).
 *
 * @since JDK1.4
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/package-info.java
package javax.security.auth.callback;

/**
 * This package provides the classes necessary for services
 * to interact with applications in order to retrieve
 * information (authentication data including usernames
 * or passwords, for example) or to display information
 * (error and warning messages, for example).
 *
 * @since JDK1.4
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/package-info.java
package javax.security.auth.kerberos;

/**
 * This package contains utility classes related to the Kerberos network
 * authentication protocol. They do not provide much Kerberos support
 * themselves.<p>
 *
 * The Kerberos network authentication protocol is defined in
 * <a href=http://www.ietf.org/rfc/rfc4120.txt>RFC 4120</a>. The Java
 * platform contains support for the client side of Kerberos via the
 * {@link org.ietf.jgss} package. There might also be
 * a login module that implements
 * {@link javax.security.auth.spi.LoginModule LoginModule} to authenticate
 * Kerberos principals.<p>
 *
 * You can provide the name of your default realm and Key Distribution
 * Center (KDC) host for that realm using the system properties
 * {@code java.security.krb5.realm} and {@code java.security.krb5.kdc}.
 * Both properties must be set.
 * Alternatively, the {@code java.security.krb5.conf} system property can
 * be set to the location of an MIT style {@code krb5.conf} configuration
 * file. If none of these system properties are set, the {@code krb5.conf}
 * file is searched for in an implementation-specific manner. Typically,
 * an implementation will first look for a {@code krb5.conf} file in
 * {@code <java-home>/lib/security} and failing that, in an OS-specific
 * location.<p>
 *
 * @since JDK1.4
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/login/package-info.java
package javax.security.auth.login;

/**
 * This package provides a pluggable authentication framework.
 * <h2>Package Specification</h2>
 *
 * <ul>
 *   <li><a href="{@docRoot}/../technotes/guides/security/StandardNames.html">
 *     <b>Java&trade;
 *     Cryptography Architecture Standard Algorithm Name
 *     Documentation</b></a></li>
 * </ul>
 *
 * @since 1.4
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/spi/package-info.java
package javax.security.auth.spi;

/**
 * This package provides the interface to be used for
 * implementing pluggable authentication modules.
 *
 * @since JDK1.4
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/package-info.java
package javax.security.auth.x500;

/**
 * This package contains the classes that should be used to store
 * X500 Principal and X500 Private Credentials in a
 * <i>Subject</i>.
 *
 * <h2>Package Specification</h2>
 *
 * <ul>
 *   <li><a href="http://www.ietf.org/rfc/rfc1779.txt">
 *     RFC 1779: A String Representation of Distinguished Names</a></li>
 *   <li><a href="http://www.ietf.org/rfc/rfc2253.txt">
 *     RFC 2253: Lightweight Directory Access Protocol (v3):
 *     UTF-8 String Representation of Distinguished Names</a></li>
 *   <li><a href="http://www.ietf.org/rfc/rfc3280.txt">
 *     RFC 3280: Internet X.509 Public Key Infrastructure
 *     Certificate and Certificate Revocation List (CRL) Profile</a></li>
 *   <li><a href="http://www.ietf.org/rfc/rfc4512.txt">
 *     RFC 4512: Lightweight Directory Access Protocol (LDAP):
 *     Directory Information Models</a></li>
 * </ul>
 *
 * @since JDK1.4
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/cert/package-info.java
package javax.security.cert;

/**
 * Provides classes for public key certificates.
 *
 * These classes include a simplified version of the
 * java.security.cert package.  These classes were developed
 * as part of the Java Secure Socket
 * Extension (JSSE).  When JSSE was added to the J2SE version 1.4, this
 * package was added for backward-compatibility reasons only.
 *
 * New applications should not use this package, but rather
 * java.security.cert.
 *
 * @since 1.4
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/package-info.java
package javax.security.sasl;

/**
 * Contains class and interfaces for supporting SASL.
 *
 * This package defines classes and interfaces for SASL mechanisms.
 * It is used by developers to add authentication support for
 * connection-based protocols that use SASL.
 *
 * <h3>SASL Overview</h3>
 *
 * Simple Authentication and Security Layer (SASL) specifies a
 * challenge-response protocol in which data is exchanged between the
 * client and the server for the purposes of
 * authentication and (optional) establishment of a security layer on
 * which to carry on subsequent communications.  It is used with
 * connection-based protocols such as LDAPv3 or IMAPv4.  SASL is
 * described in
 * <A HREF="http://www.ietf.org/rfc/rfc2222.txt">RFC 2222</A>.
 *
 *
 * There are various <em>mechanisms</em> defined for SASL.
 * Each mechanism defines the data that must be exchanged between the
 * client and server in order for the authentication to succeed.
 * This data exchange required for a particular mechanism is referred to
 * to as its <em>protocol profile</em>.
 * The following are some examples of mechanisms that have been defined by
 * the Internet standards community.
 * <ul>
 * <li>DIGEST-MD5 (<A HREF="http://www.ietf.org/rfc/rfc2831.txt">RFC 2831</a>).
 * This mechanism defines how HTTP Digest Authentication can be used as a SASL
 * mechanism.
 * <li>Anonymous (<A HREF="http://www.ietf.org/rfc/rfc2245.txt">RFC 2245</a>).
 * This mechanism is anonymous authentication in which no credentials are
 * necessary.
 * <li>External (<A HREF="http://www.ietf.org/rfc/rfc2222.txt">RFC 2222</A>).
 * This mechanism obtains authentication information
 * from an external source (such as TLS or IPsec).
 * <li>S/Key (<A HREF="http://www.ietf.org/rfc/rfc2222.txt">RFC 2222</A>).
 * This mechanism uses the MD4 digest algorithm to exchange data based on
 * a shared secret.
 * <li>GSSAPI (<A HREF="http://www.ietf.org/rfc/rfc2222.txt">RFC 2222</A>).
 * This mechanism uses the
 * <A HREF="http://www.ietf.org/rfc/rfc2078.txt">GSSAPI</A>
 * for obtaining authentication information.
 * </ul>
 *
 * Some of these mechanisms provide both authentication and establishment
 * of a security layer, others only authentication.  Anonymous and
 * S/Key do not provide for any security layers.  GSSAPI and DIGEST-MD5
 * allow negotiation of the security layer.  For External, the
 * security layer is determined by the external protocol.
 *
 * <h3>Usage</h3>
 *
 * Users of this API are typically developers who produce
 * client library implementations for connection-based protocols,
 * such as LDAPv3 and IMAPv4,
 * and developers who write servers (such as LDAP servers and IMAP servers).
 * Developers who write client libraries use the
 * {@code SaslClient} and {@code SaslClientFactory} interfaces.
 * Developers who write servers use the
 * {@code SaslServer} and {@code SaslServerFactory} interfaces.
 *
 * Among these two groups of users, each can be further divided into two groups:
 * those who <em>produce</em> the SASL mechanisms and those
 * who <em>use</em> the SASL mechanisms.
 * The producers of SASL mechanisms need to provide implementations
 * for these interfaces, while users of the SASL mechanisms use
 * the APIs in this package to access those implementations.
 *
 * <h2>Related Documentation</h2>
 *
 * Please refer to the
 * <a href="../../../../technotes/guides/security/sasl/sasl-refguide.html">Java
 * SASL Programming Guide</a> for information on how to use this API.
 *
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/package-info.java
package javax.tools;

/**
 * Provides interfaces for tools which can be invoked from a program,
 * for example, compilers.
 *
 * <p>These interfaces and classes are required as part of the
 * Java&trade; Platform, Standard Edition (Java SE),
 * but there is no requirement to provide any tools implementing them.
 *
 * <p>Unless explicitly allowed, all methods in this package might
 * throw a {@linkplain java.lang.NullPointerException} if given a
 * {@code null} argument or if given a
 * {@linkplain java.lang.Iterable list or collection} containing
 * {@code null} elements.  Similarly, no method may return
 * {@code null} unless explicitly allowed.
 *
 * <p>This package is the home of the Java programming language compiler framework.  This
 * framework allows clients of the framework to locate and run
 * compilers from programs.  The framework also provides Service
 * Provider Interfaces (SPI) for structured access to diagnostics
 * ({@linkplain javax.tools.DiagnosticListener}) as well as a file
 * abstraction for overriding file access ({@linkplain
 * javax.tools.JavaFileManager} and {@linkplain
 * javax.tools.JavaFileObject}).  See {@linkplain
 * javax.tools.JavaCompiler} for more details on using the SPI.
 *
 * <p>There is no requirement for a compiler at runtime.  However, if
 * a default compiler is provided, it can be located using the
 * {@linkplain javax.tools.ToolProvider}, for example:
 *
 * <p>{@code JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();}
 *
 * <p>It is possible to provide alternative compilers or tools
 * through the {@linkplain java.util.ServiceLoader service provider
 * mechanism}.
 *
 * <p>For example, if {@code com.vendor.VendorJavaCompiler} is a
 * provider of the {@code JavaCompiler} tool then its jar file
 * would contain the file {@code
 * META-INF/services/javax.tools.JavaCompiler}.  This file would
 * contain the single line:
 *
 * <p>{@code com.vendor.VendorJavaCompiler}
 *
 * <p>If the jar file is on the class path, VendorJavaCompiler can be
 * located using code like this:
 *
 * <p>{@code JavaCompiler compiler = ServiceLoader.load(JavaCompiler.class).iterator().next();}
 *
 * @author Peter von der Ah&eacute;
 * @author Jonathan Gibbons
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/http/package-info.java
package javax.xml.ws.spi.http;

/**
  Provides HTTP SPI that is used for portable deployment of JAX-WS
  web services in containers(for e.g. servlet containers). This SPI
  is not for end developers but provides a way for the container
  developers to deploy JAX-WS services portably.

  <p>
  The portable deployment is done as below:
  <ol>
  <li>Container creates {@link javax.xml.ws.Endpoint} objects for an
  application. The necessary information to create Endpoint objects
  may be got from web service deployment descriptor files.</li>
  <li>Container needs to create {@link javax.xml.ws.spi.http.HttpContext}
  objects for the deployment. For example, a HttpContext could be
  created using servlet configuration(for e.g url-pattern) for the
  web service in servlet container case.</li>
  <li>Then publishes all the endpoints using
  {@link javax.xml.ws.Endpoint#publish(HttpContext)}. During publish(),
  JAX-WS runtime registers a {@link javax.xml.ws.spi.http.HttpHandler}
  callback to handle incoming requests or
  {@link javax.xml.ws.spi.http.HttpExchange} objects. The HttpExchange
  object encapsulates a HTTP request and a response.
  </ol>

  <pre>
  Container                               JAX-WS runtime
  ---------                               --------------
  1. Creates Invoker1, ... InvokerN
  2. Provider.createEndpoint(...)     --> 3. creates Endpoint1
     configures Endpoint1
     ...
  4. Provider.createEndpoint(...)     --> 5. creates EndpointN
     configures EndpointN
  6. Creates ApplicationContext
  7. creates HttpContext1, ... HttpContextN
  8. Endpoint1.publish(HttpContext1)  --> 9. creates HttpHandler1
                                          HttpContext1.setHandler(HttpHandler1)
     ...
 10. EndpointN.publish(HttpContextN)  --> 11. creates HttpHandlerN
                                         HttpContextN.setHandler(HttpHandlerN)

  </pre>

  The request processing is done as below(for every request):
  <pre>
  Container                               JAX-WS runtime
  ---------                               --------------
  1. Creates a HttpExchange
  2. Gets handler from HttpContext
  3. HttpHandler.handle(HttpExchange) --> 4. reads request from HttpExchange
                                      <-- 5. Calls Invoker
  6. Invokes the actual instance
                                          7. Writes the response to HttpExchange
  </pre>

  <p>
  The portable undeployment is done as below:
  <pre>
  Container
  ---------
  1. @preDestroy on instances
  2. Endpoint1.stop()
  ...
  3. EndpointN.stop()
  </pre>

  @author Jitendra Kotamraju
  @since JAX-WS 2.2
 */
