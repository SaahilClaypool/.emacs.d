_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp

////////////////////////////////////////////////////////////
/// \class sf::Context
/// \ingroup window
///
/// If you need to make OpenGL calls without having an
/// active window (like in a thread), you can use an
/// instance of this class to get a valid context.
///
/// Having a valid context is necessary for *every* OpenGL call.
///
/// Note that a context is only active in its current thread,
/// if you create a new thread it will have no valid context
/// by default.
///
/// To use a sf::Context instance, just construct it and let it
/// live as long as you need a valid context. No explicit activation
/// is needed, all it has to do is to exist. Its destructor
/// will take care of deactivating and freeing all the attached
/// resources.
///
/// Usage example:
/// \code
/// void threadFunction(void*)
/// {
///    sf::Context context;
///    // from now on, you have a valid context
///
///    // you can make OpenGL calls
///    glClear(GL_DEPTH_BUFFER_BIT);
/// }
/// // the context is automatically deactivated and destroyed
/// // by the sf::Context destructor
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
};

    ////////////////////////////////////////////////////////////
    priv::GlContext* m_context; ///< Internal OpenGL context
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    Context(const ContextSettings& settings, unsigned int width, unsigned int height);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a in-memory context
    ///
    /// This constructor is for internal use, you don't need
    /// to bother with it.
    ///
    /// \param settings Creation parameters
    /// \param width    Back buffer width
    /// \param height   Back buffer height
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    bool setActive(bool active);

    ////////////////////////////////////////////////////////////
    /// \brief Activate or deactivate explicitely the context
    ///
    /// \param active True to activate, false to deactivate
    ///
    /// \return True on success, false on failure
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    ~Context();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// The desctructor deactivates and destroys the context
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    Context();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// The constructor creates and activates the context
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
class SFML_WINDOW_API Context : GlResource, NonCopyable

////////////////////////////////////////////////////////////
/// \brief Class holding a valid drawing context
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
#include <SFML/Window/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
#ifndef SFML_CONTEXT_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp

////////////////////////////////////////////////////////////
/// \class sf::Context
/// \ingroup window
///
/// If you need to make OpenGL calls without having an
/// active window (like in a thread), you can use an
/// instance of this class to get a valid context.
///
/// Having a valid context is necessary for *every* OpenGL call.
///
/// Note that a context is only active in its current thread,
/// if you create a new thread it will have no valid context
/// by default.
///
/// To use a sf::Context instance, just construct it and let it
/// live as long as you need a valid context. No explicit activation
/// is needed, all it has to do is to exist. Its destructor
/// will take care of deactivating and freeing all the attached
/// resources.
///
/// Usage example:
/// \code
/// void threadFunction(void*)
/// {
///    sf::Context context;
///    // from now on, you have a valid context
///
///    // you can make OpenGL calls
///    glClear(GL_DEPTH_BUFFER_BIT);
/// }
/// // the context is automatically deactivated and destroyed
/// // by the sf::Context destructor
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
};

    ////////////////////////////////////////////////////////////
    priv::GlContext* m_context; ///< Internal OpenGL context
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    Context(const ContextSettings& settings, unsigned int width, unsigned int height);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a in-memory context
    ///
    /// This constructor is for internal use, you don't need
    /// to bother with it.
    ///
    /// \param settings Creation parameters
    /// \param width    Back buffer width
    /// \param height   Back buffer height
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    bool setActive(bool active);

    ////////////////////////////////////////////////////////////
    /// \brief Activate or deactivate explicitely the context
    ///
    /// \param active True to activate, false to deactivate
    ///
    /// \return True on success, false on failure
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    ~Context();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// The desctructor deactivates and destroys the context
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    Context();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// The constructor creates and activates the context
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
class SFML_WINDOW_API Context : GlResource, NonCopyable

////////////////////////////////////////////////////////////
/// \brief Class holding a valid drawing context
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
#include <SFML/Window/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
#ifndef SFML_CONTEXT_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp

////////////////////////////////////////////////////////////
/// \class sf::Context
/// \ingroup window
///
/// If you need to make OpenGL calls without having an
/// active window (like in a thread), you can use an
/// instance of this class to get a valid context.
///
/// Having a valid context is necessary for *every* OpenGL call.
///
/// Note that a context is only active in its current thread,
/// if you create a new thread it will have no valid context
/// by default.
///
/// To use a sf::Context instance, just construct it and let it
/// live as long as you need a valid context. No explicit activation
/// is needed, all it has to do is to exist. Its destructor
/// will take care of deactivating and freeing all the attached
/// resources.
///
/// Usage example:
/// \code
/// void threadFunction(void*)
/// {
///    sf::Context context;
///    // from now on, you have a valid context
///
///    // you can make OpenGL calls
///    glClear(GL_DEPTH_BUFFER_BIT);
/// }
/// // the context is automatically deactivated and destroyed
/// // by the sf::Context destructor
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
};

    ////////////////////////////////////////////////////////////
    priv::GlContext* m_context; ///< Internal OpenGL context
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    Context(const ContextSettings& settings, unsigned int width, unsigned int height);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a in-memory context
    ///
    /// This constructor is for internal use, you don't need
    /// to bother with it.
    ///
    /// \param settings Creation parameters
    /// \param width    Back buffer width
    /// \param height   Back buffer height
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    bool setActive(bool active);

    ////////////////////////////////////////////////////////////
    /// \brief Activate or deactivate explicitely the context
    ///
    /// \param active True to activate, false to deactivate
    ///
    /// \return True on success, false on failure
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    ~Context();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// The desctructor deactivates and destroys the context
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    Context();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// The constructor creates and activates the context
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
class SFML_WINDOW_API Context : GlResource, NonCopyable

////////////////////////////////////////////////////////////
/// \brief Class holding a valid drawing context
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
#include <SFML/Window/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
#ifndef SFML_CONTEXT_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp

////////////////////////////////////////////////////////////
/// \class sf::Context
/// \ingroup window
///
/// If you need to make OpenGL calls without having an
/// active window (like in a thread), you can use an
/// instance of this class to get a valid context.
///
/// Having a valid context is necessary for *every* OpenGL call.
///
/// Note that a context is only active in its current thread,
/// if you create a new thread it will have no valid context
/// by default.
///
/// To use a sf::Context instance, just construct it and let it
/// live as long as you need a valid context. No explicit activation
/// is needed, all it has to do is to exist. Its destructor
/// will take care of deactivating and freeing all the attached
/// resources.
///
/// Usage example:
/// \code
/// void threadFunction(void*)
/// {
///    sf::Context context;
///    // from now on, you have a valid context
///
///    // you can make OpenGL calls
///    glClear(GL_DEPTH_BUFFER_BIT);
/// }
/// // the context is automatically deactivated and destroyed
/// // by the sf::Context destructor
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
};

    ////////////////////////////////////////////////////////////
    priv::GlContext* m_context; ///< Internal OpenGL context
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    Context(const ContextSettings& settings, unsigned int width, unsigned int height);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a in-memory context
    ///
    /// This constructor is for internal use, you don't need
    /// to bother with it.
    ///
    /// \param settings Creation parameters
    /// \param width    Back buffer width
    /// \param height   Back buffer height
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    bool setActive(bool active);

    ////////////////////////////////////////////////////////////
    /// \brief Activate or deactivate explicitely the context
    ///
    /// \param active True to activate, false to deactivate
    ///
    /// \return True on success, false on failure
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    ~Context();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// The desctructor deactivates and destroys the context
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    Context();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// The constructor creates and activates the context
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
class SFML_WINDOW_API Context : GlResource, NonCopyable

////////////////////////////////////////////////////////////
/// \brief Class holding a valid drawing context
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
#include <SFML/Window/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
#ifndef SFML_CONTEXT_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp

////////////////////////////////////////////////////////////
/// \class sf::Context
/// \ingroup window
///
/// If you need to make OpenGL calls without having an
/// active window (like in a thread), you can use an
/// instance of this class to get a valid context.
///
/// Having a valid context is necessary for *every* OpenGL call.
///
/// Note that a context is only active in its current thread,
/// if you create a new thread it will have no valid context
/// by default.
///
/// To use a sf::Context instance, just construct it and let it
/// live as long as you need a valid context. No explicit activation
/// is needed, all it has to do is to exist. Its destructor
/// will take care of deactivating and freeing all the attached
/// resources.
///
/// Usage example:
/// \code
/// void threadFunction(void*)
/// {
///    sf::Context context;
///    // from now on, you have a valid context
///
///    // you can make OpenGL calls
///    glClear(GL_DEPTH_BUFFER_BIT);
/// }
/// // the context is automatically deactivated and destroyed
/// // by the sf::Context destructor
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
};

    ////////////////////////////////////////////////////////////
    priv::GlContext* m_context; ///< Internal OpenGL context
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    Context(const ContextSettings& settings, unsigned int width, unsigned int height);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a in-memory context
    ///
    /// This constructor is for internal use, you don't need
    /// to bother with it.
    ///
    /// \param settings Creation parameters
    /// \param width    Back buffer width
    /// \param height   Back buffer height
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    bool setActive(bool active);

    ////////////////////////////////////////////////////////////
    /// \brief Activate or deactivate explicitely the context
    ///
    /// \param active True to activate, false to deactivate
    ///
    /// \return True on success, false on failure
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    ~Context();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// The desctructor deactivates and destroys the context
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    Context();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// The constructor creates and activates the context
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
class SFML_WINDOW_API Context : GlResource, NonCopyable

////////////////////////////////////////////////////////////
/// \brief Class holding a valid drawing context
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
#include <SFML/Window/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
#ifndef SFML_CONTEXT_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp

////////////////////////////////////////////////////////////
/// \class sf::Context
/// \ingroup window
///
/// If you need to make OpenGL calls without having an
/// active window (like in a thread), you can use an
/// instance of this class to get a valid context.
///
/// Having a valid context is necessary for *every* OpenGL call.
///
/// Note that a context is only active in its current thread,
/// if you create a new thread it will have no valid context
/// by default.
///
/// To use a sf::Context instance, just construct it and let it
/// live as long as you need a valid context. No explicit activation
/// is needed, all it has to do is to exist. Its destructor
/// will take care of deactivating and freeing all the attached
/// resources.
///
/// Usage example:
/// \code
/// void threadFunction(void*)
/// {
///    sf::Context context;
///    // from now on, you have a valid context
///
///    // you can make OpenGL calls
///    glClear(GL_DEPTH_BUFFER_BIT);
/// }
/// // the context is automatically deactivated and destroyed
/// // by the sf::Context destructor
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
};

    ////////////////////////////////////////////////////////////
    priv::GlContext* m_context; ///< Internal OpenGL context
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    Context(const ContextSettings& settings, unsigned int width, unsigned int height);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a in-memory context
    ///
    /// This constructor is for internal use, you don't need
    /// to bother with it.
    ///
    /// \param settings Creation parameters
    /// \param width    Back buffer width
    /// \param height   Back buffer height
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    bool setActive(bool active);

    ////////////////////////////////////////////////////////////
    /// \brief Activate or deactivate explicitely the context
    ///
    /// \param active True to activate, false to deactivate
    ///
    /// \return True on success, false on failure
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    ~Context();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// The desctructor deactivates and destroys the context
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    Context();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// The constructor creates and activates the context
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
class SFML_WINDOW_API Context : GlResource, NonCopyable

////////////////////////////////////////////////////////////
/// \brief Class holding a valid drawing context
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
#include <SFML/Window/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
#ifndef SFML_CONTEXT_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp

////////////////////////////////////////////////////////////
/// \class sf::Context
/// \ingroup window
///
/// If you need to make OpenGL calls without having an
/// active window (like in a thread), you can use an
/// instance of this class to get a valid context.
///
/// Having a valid context is necessary for *every* OpenGL call.
///
/// Note that a context is only active in its current thread,
/// if you create a new thread it will have no valid context
/// by default.
///
/// To use a sf::Context instance, just construct it and let it
/// live as long as you need a valid context. No explicit activation
/// is needed, all it has to do is to exist. Its destructor
/// will take care of deactivating and freeing all the attached
/// resources.
///
/// Usage example:
/// \code
/// void threadFunction(void*)
/// {
///    sf::Context context;
///    // from now on, you have a valid context
///
///    // you can make OpenGL calls
///    glClear(GL_DEPTH_BUFFER_BIT);
/// }
/// // the context is automatically deactivated and destroyed
/// // by the sf::Context destructor
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
};

    ////////////////////////////////////////////////////////////
    priv::GlContext* m_context; ///< Internal OpenGL context
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    Context(const ContextSettings& settings, unsigned int width, unsigned int height);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a in-memory context
    ///
    /// This constructor is for internal use, you don't need
    /// to bother with it.
    ///
    /// \param settings Creation parameters
    /// \param width    Back buffer width
    /// \param height   Back buffer height
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    bool setActive(bool active);

    ////////////////////////////////////////////////////////////
    /// \brief Activate or deactivate explicitely the context
    ///
    /// \param active True to activate, false to deactivate
    ///
    /// \return True on success, false on failure
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    ~Context();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// The desctructor deactivates and destroys the context
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    Context();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// The constructor creates and activates the context
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
class SFML_WINDOW_API Context : GlResource, NonCopyable

////////////////////////////////////////////////////////////
/// \brief Class holding a valid drawing context
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
#include <SFML/Window/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
#ifndef SFML_CONTEXT_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp

////////////////////////////////////////////////////////////
/// \class sf::Context
/// \ingroup window
///
/// If you need to make OpenGL calls without having an
/// active window (like in a thread), you can use an
/// instance of this class to get a valid context.
///
/// Having a valid context is necessary for *every* OpenGL call.
///
/// Note that a context is only active in its current thread,
/// if you create a new thread it will have no valid context
/// by default.
///
/// To use a sf::Context instance, just construct it and let it
/// live as long as you need a valid context. No explicit activation
/// is needed, all it has to do is to exist. Its destructor
/// will take care of deactivating and freeing all the attached
/// resources.
///
/// Usage example:
/// \code
/// void threadFunction(void*)
/// {
///    sf::Context context;
///    // from now on, you have a valid context
///
///    // you can make OpenGL calls
///    glClear(GL_DEPTH_BUFFER_BIT);
/// }
/// // the context is automatically deactivated and destroyed
/// // by the sf::Context destructor
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
};

    ////////////////////////////////////////////////////////////
    priv::GlContext* m_context; ///< Internal OpenGL context
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    Context(const ContextSettings& settings, unsigned int width, unsigned int height);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a in-memory context
    ///
    /// This constructor is for internal use, you don't need
    /// to bother with it.
    ///
    /// \param settings Creation parameters
    /// \param width    Back buffer width
    /// \param height   Back buffer height
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    bool setActive(bool active);

    ////////////////////////////////////////////////////////////
    /// \brief Activate or deactivate explicitely the context
    ///
    /// \param active True to activate, false to deactivate
    ///
    /// \return True on success, false on failure
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    ~Context();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// The desctructor deactivates and destroys the context
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    Context();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// The constructor creates and activates the context
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
class SFML_WINDOW_API Context : GlResource, NonCopyable

////////////////////////////////////////////////////////////
/// \brief Class holding a valid drawing context
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
#include <SFML/Window/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
#ifndef SFML_CONTEXT_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp

////////////////////////////////////////////////////////////
/// \class sf::Context
/// \ingroup window
///
/// If you need to make OpenGL calls without having an
/// active window (like in a thread), you can use an
/// instance of this class to get a valid context.
///
/// Having a valid context is necessary for *every* OpenGL call.
///
/// Note that a context is only active in its current thread,
/// if you create a new thread it will have no valid context
/// by default.
///
/// To use a sf::Context instance, just construct it and let it
/// live as long as you need a valid context. No explicit activation
/// is needed, all it has to do is to exist. Its destructor
/// will take care of deactivating and freeing all the attached
/// resources.
///
/// Usage example:
/// \code
/// void threadFunction(void*)
/// {
///    sf::Context context;
///    // from now on, you have a valid context
///
///    // you can make OpenGL calls
///    glClear(GL_DEPTH_BUFFER_BIT);
/// }
/// // the context is automatically deactivated and destroyed
/// // by the sf::Context destructor
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
};

    ////////////////////////////////////////////////////////////
    priv::GlContext* m_context; ///< Internal OpenGL context
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    Context(const ContextSettings& settings, unsigned int width, unsigned int height);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a in-memory context
    ///
    /// This constructor is for internal use, you don't need
    /// to bother with it.
    ///
    /// \param settings Creation parameters
    /// \param width    Back buffer width
    /// \param height   Back buffer height
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    bool setActive(bool active);

    ////////////////////////////////////////////////////////////
    /// \brief Activate or deactivate explicitely the context
    ///
    /// \param active True to activate, false to deactivate
    ///
    /// \return True on success, false on failure
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    ~Context();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// The desctructor deactivates and destroys the context
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
    Context();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// The constructor creates and activates the context
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
class SFML_WINDOW_API Context : GlResource, NonCopyable

////////////////////////////////////////////////////////////
/// \brief Class holding a valid drawing context
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
#include <SFML/Window/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
#ifndef SFML_CONTEXT_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Window/Context.hpp
//

////////////////////////////////////////////////////////////
