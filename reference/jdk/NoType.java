_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/NoType.java
public interface NoType extends TypeMirror {

/**
 * A pseudo-type used where no actual type is appropriate.
 * The kinds of {@code NoType} are:
 * <ul>
 * <li>{@link TypeKind#VOID VOID} - corresponds to the keyword {@code void}.
 * <li>{@link TypeKind#PACKAGE PACKAGE} - the pseudo-type of a package element.
 * <li>{@link TypeKind#NONE NONE} - used in other cases
 *   where no actual type is appropriate; for example, the superclass
 *   of {@code java.lang.Object}.
 * </ul>
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @see ExecutableElement#getReturnType()
 * @since 1.6
 */
