_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/ContextSettings.hpp

////////////////////////////////////////////////////////////
/// \class sf::ContextSettings
/// \ingroup window
///
/// ContextSettings allows to define several advanced settings
/// of the OpenGL context attached to a window. All these
/// settings have no impact on the regular SFML rendering
/// (graphics module) -- except the anti-aliasing level, so
/// you may need to use this structure only if you're using
/// SFML as a windowing system for custom OpenGL rendering.
///
/// The depthBits and stencilBits members define the number
/// of bits per pixel requested for the (respectively) depth
/// and stencil buffers.
///
/// antialiasingLevel represents the requested number of
/// multisampling levels for anti-aliasing.
///
/// majorVersion and minorVersion define the version of the
/// OpenGL context that you want. Only versions greater or
/// equal to 3.0 are relevant; versions lesser than 3.0 are
/// all handled the same way (i.e. you can use any version
/// < 3.0 if you don't want an OpenGL 3 context).
///
/// Please note that these values are only a hint.
/// No failure will be reported if one or more of these values
/// are not supported by the system; instead, SFML will try to
/// find the closest valid match. You can then retrieve the
/// settings that the window actually used to create its context,
/// with Window::getSettings().
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/ContextSettings.hpp
};

    unsigned int depthBits;         ///< Bits of the depth buffer
    unsigned int stencilBits;       ///< Bits of the stencil buffer
    unsigned int antialiasingLevel; ///< Level of antialiasing
    unsigned int majorVersion;      ///< Major number of the context version to create
    unsigned int minorVersion;      ///< Minor number of the context version to create
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/ContextSettings.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/ContextSettings.hpp
    explicit ContextSettings(unsigned int depth = 0, unsigned int stencil = 0, unsigned int antialiasing = 0, unsigned int major = 2, unsigned int minor = 0) :

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// \param depth        Depth buffer bits
    /// \param stencil      Stencil buffer bits
    /// \param antialiasing Antialiasing level
    /// \param major        Major number of the context version
    /// \param minor        Minor number of the context version
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/ContextSettings.hpp
struct ContextSettings

////////////////////////////////////////////////////////////
/// \brief Structure defining the settings of the OpenGL
///        context attached to a window
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/ContextSettings.hpp
#ifndef SFML_CONTEXTSETTINGS_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/ContextSettings.hpp
//

////////////////////////////////////////////////////////////
