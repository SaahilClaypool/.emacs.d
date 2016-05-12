_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/IntersectionType.java
    List<? extends TypeMirror> getBounds();

    /**
     * Return the bounds comprising this intersection type.
     *
     * @return the bounds of this intersection types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/IntersectionType.java
public interface IntersectionType extends TypeMirror {

/**
 * Represents an intersection type.
 *
 * <p>An intersection type can be either implicitly or explicitly
 * declared in a program. For example, the bound of the type parameter
 * {@code <T extends Number & Runnable>} is an (implicit) intersection
 * type.  As of {@link javax.lang.model.SourceVersion#RELEASE_8
 * RELEASE_8}, this is represented by an {@code IntersectionType} with
 * {@code Number} and {@code Runnable} as its bounds.
 *
 * @implNote Also as of {@link
 * javax.lang.model.SourceVersion#RELEASE_8 RELEASE_8}, in the
 * reference implementation an {@code IntersectionType} is used to
 * model the explicit target type of a cast expression.
 *
 * @since 1.8
 */
