_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/ElementFilter.java
    public static Set<PackageElement>

    /**
     * Returns a set of packages in {@code elements}.
     * @return a set of packages in {@code elements}
     * @param elements the elements to filter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/ElementFilter.java
    public static List<PackageElement>

    /**
     * Returns a list of packages in {@code elements}.
     * @return a list of packages in {@code elements}
     * @param elements the elements to filter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/ElementFilter.java
    public static Set<TypeElement>

    /**
     * Returns a set of types in {@code elements}.
     * @return a set of types in {@code elements}
     * @param elements the elements to filter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/ElementFilter.java
    public static List<TypeElement>

    /**
     * Returns a list of types in {@code elements}.
     * @return a list of types in {@code elements}
     * @param elements the elements to filter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/ElementFilter.java
    public static Set<ExecutableElement>

    /**
     * Returns a set of methods in {@code elements}.
     * @return a set of methods in {@code elements}
     * @param elements the elements to filter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/ElementFilter.java
    public static List<ExecutableElement>

    /**
     * Returns a list of methods in {@code elements}.
     * @return a list of methods in {@code elements}
     * @param elements the elements to filter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/ElementFilter.java
    public static Set<ExecutableElement>

    /**
     * Returns a set of constructors in {@code elements}.
     * @return a set of constructors in {@code elements}
     * @param elements the elements to filter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/ElementFilter.java
    public static List<ExecutableElement>

    /**
     * Returns a list of constructors in {@code elements}.
     * @return a list of constructors in {@code elements}
     * @param elements the elements to filter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/ElementFilter.java
    public static Set<VariableElement>

    /**
     * Returns a set of fields in {@code elements}.
     * @return a set of fields in {@code elements}
     * @param elements the elements to filter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/ElementFilter.java
    public static List<VariableElement>

    /**
     * Returns a list of fields in {@code elements}.
     * @return a list of fields in {@code elements}
     * @param elements the elements to filter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/ElementFilter.java
public class ElementFilter {

/**
 * Filters for selecting just the elements of interest from a
 * collection of elements.  The returned sets and lists are new
 * collections and do use the argument as a backing store.  The
 * methods in this class do not make any attempts to guard against
 * concurrent modifications of the arguments.  The returned sets and
 * lists are mutable but unsafe for concurrent access.  A returned set
 * has the same iteration order as the argument set to a method.
 *
 * <p>If iterables and sets containing {@code null} are passed as
 * arguments to methods in this class, a {@code NullPointerException}
 * will be thrown.
 *
 * <p>Note that a <i>static import</i> statement can make the text of
 * calls to the methods in this class more concise; for example:
 *
 * <blockquote><pre>
 *     import static javax.lang.model.util.ElementFilter.*;
 *     ...
 *         {@code List<VariableElement>} fs = fieldsIn(someClass.getEnclosedElements());
 * </pre></blockquote>
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @author Martin Buchholz
 * @since 1.6
 */
