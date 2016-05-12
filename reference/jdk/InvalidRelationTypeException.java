_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/InvalidRelationTypeException.java
    public InvalidRelationTypeException(String message) {

    /**
     * Constructor with given message put in exception.
     *
     * @param message the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/InvalidRelationTypeException.java
    public InvalidRelationTypeException() {

    /**
     * Default constructor, no message put in exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/InvalidRelationTypeException.java
public class InvalidRelationTypeException extends RelationException {

/**
 * Invalid relation type.
 * This exception is raised when, in a relation type, there is already a
 * relation type with that name, or the same name has been used for two
 * different role infos, or no role info provided, or one null role info
 * provided.
 *
 * @since 1.5
 */
