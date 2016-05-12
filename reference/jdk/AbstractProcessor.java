_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/AbstractProcessor.java
    protected synchronized boolean isInitialized() {

    /**
     * Returns {@code true} if this object has been {@linkplain #init
     * initialized}, {@code false} otherwise.
     *
     * @return {@code true} if this object has been initialized,
     * {@code false} otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/AbstractProcessor.java
    public Iterable<? extends Completion> getCompletions(Element element,
                                                         AnnotationMirror annotation,
                                                         ExecutableElement member,
                                                         String userText) {

    /**
     * Returns an empty iterable of completions.
     *
     * @param element {@inheritDoc}
     * @param annotation {@inheritDoc}
     * @param member {@inheritDoc}
     * @param userText {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/AbstractProcessor.java
    public abstract boolean process(Set<? extends TypeElement> annotations,
                                    RoundEnvironment roundEnv);

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/AbstractProcessor.java
    public synchronized void init(ProcessingEnvironment processingEnv) {

    /**
     * Initializes the processor with the processing environment by
     * setting the {@code processingEnv} field to the value of the
     * {@code processingEnv} argument.  An {@code
     * IllegalStateException} will be thrown if this method is called
     * more than once on the same object.
     *
     * @param processingEnv environment to access facilities the tool framework
     * provides to the processor
     * @throws IllegalStateException if this method is called more than once.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/AbstractProcessor.java
    public SourceVersion getSupportedSourceVersion() {

    /**
     * If the processor class is annotated with {@link
     * SupportedSourceVersion}, return the source version in the
     * annotation.  If the class is not so annotated, {@link
     * SourceVersion#RELEASE_6} is returned.
     *
     * @return the latest source version supported by this processor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/AbstractProcessor.java
    public Set<String> getSupportedAnnotationTypes() {

    /**
     * If the processor class is annotated with {@link
     * SupportedAnnotationTypes}, return an unmodifiable set with the
     * same set of strings as the annotation.  If the class is not so
     * annotated, an empty set is returned.
     *
     * @return the names of the annotation types supported by this
     * processor, or an empty set if none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/AbstractProcessor.java
    public Set<String> getSupportedOptions() {

    /**
     * If the processor class is annotated with {@link
     * SupportedOptions}, return an unmodifiable set with the same set
     * of strings as the annotation.  If the class is not so
     * annotated, an empty set is returned.
     *
     * @return the options recognized by this processor, or an empty
     * set if none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/AbstractProcessor.java
    protected AbstractProcessor() {}

    /**
     * Constructor for subclasses to call.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/AbstractProcessor.java
public abstract class AbstractProcessor implements Processor {

/**
 * An abstract annotation processor designed to be a convenient
 * superclass for most concrete annotation processors.  This class
 * examines annotation values to compute the {@linkplain
 * #getSupportedOptions options}, {@linkplain
 * #getSupportedAnnotationTypes annotation types}, and {@linkplain
 * #getSupportedSourceVersion source version} supported by its
 * subtypes.
 *
 * <p>The getter methods may {@linkplain Messager#printMessage issue
 * warnings} about noteworthy conditions using the facilities available
 * after the processor has been {@linkplain #isInitialized
 * initialized}.
 *
 * <p>Subclasses are free to override the implementation and
 * specification of any of the methods in this class as long as the
 * general {@link javax.annotation.processing.Processor Processor}
 * contract for that method is obeyed.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @since 1.6
 */
