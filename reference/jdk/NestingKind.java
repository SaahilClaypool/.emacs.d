_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/NestingKind.java
    public boolean isNested() {

    /**
     * Does this constant correspond to a nested type element?
     * A <i>nested</i> type element is any that is not top-level.
     * An <i>inner</i> type element is any nested type element that
     * is not {@linkplain Modifier#STATIC static}.
     * @return whether or not the constant is nested
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/NestingKind.java
    ANONYMOUS;

    /**
     * A type without a name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/NestingKind.java
    LOCAL,

    /**
     * A named type declared within a construct other than a type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/NestingKind.java
    MEMBER,

    /**
     * A type that is a named member of another type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/NestingKind.java
public enum NestingKind {

/**
 * The <i>nesting kind</i> of a type element.
 * Type elements come in four varieties:
 * top-level, member, local, and anonymous.
 * <i>Nesting kind</i> is a non-standard term used here to denote this
 * classification.
 *
 * <p>Note that it is possible additional nesting kinds will be added
 * in future versions of the platform.
 *
 * <p><b>Example:</b> The classes below are annotated with their nesting kind.
 * <blockquote><pre>
 *
 * import java.lang.annotation.*;
 * import static java.lang.annotation.RetentionPolicy.*;
 * import javax.lang.model.element.*;
 * import static javax.lang.model.element.NestingKind.*;
 *
 * &#64;Nesting(TOP_LEVEL)
 * public class NestingExamples {
 *     &#64;Nesting(MEMBER)
 *     static class MemberClass1{}
 *
 *     &#64;Nesting(MEMBER)
 *     class MemberClass2{}
 *
 *     public static void main(String... argv) {
 *         &#64;Nesting(LOCAL)
 *         class LocalClass{};
 *
 *         Class&lt;?&gt;[] classes = {
 *             NestingExamples.class,
 *             MemberClass1.class,
 *             MemberClass2.class,
 *             LocalClass.class
 *         };
 *
 *         for(Class&lt;?&gt; clazz : classes) {
 *             System.out.format("%s is %s%n",
 *                               clazz.getName(),
 *                               clazz.getAnnotation(Nesting.class).value());
 *         }
 *     }
 * }
 *
 * &#64;Retention(RUNTIME)
 * &#64;interface Nesting {
 *     NestingKind value();
 * }
 * </pre></blockquote>
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @since 1.6
 */
