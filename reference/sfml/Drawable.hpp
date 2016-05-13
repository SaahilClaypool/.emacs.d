_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Drawable.hpp

////////////////////////////////////////////////////////////
/// \class sf::Drawable
/// \ingroup graphics
///
/// sf::Drawable is a very simple base class that allows objects
/// of derived classes to be drawn to a sf::RenderTarget.
///
/// All you have to do in your derived class is to override the
/// draw virtual function.
///
/// Note that inheriting from sf::Drawable is not mandatory,
/// but it allows this nice syntax "window.draw(object)" rather
/// than "object.draw(window)", which is more consistent with other
/// SFML classes.
///
/// Example:
/// \code
/// class MyDrawable : public sf::Drawable
/// {
/// public :
///
///    ...
///
/// private :
///
///     virtual void draw(sf::RenderTarget& target, sf::RenderStates states) const
///     {
///         // You can draw other high-level objects
///         target.draw(m_sprite, states);
///
///         // ... or use the low-level API
///         states.texture = &m_texture;
///         target.draw(m_vertices, states);
///
///         // ... or draw with OpenGL directly
///         glBegin(GL_QUADS);
///         ...
///         glEnd();
///     }
///
///     sf::Sprite m_sprite;
///     sf::Texture m_texture;
///     sf::VertexArray m_vertices;
/// };
/// \endcode
///
/// \see sf::RenderTarget
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Drawable.hpp
    virtual void draw(RenderTarget& target, RenderStates states) const = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Draw the object to a render target
    ///
    /// This is a pure virtual function that has to be implemented
    /// by the derived class to define how the drawable should be
    /// drawn.
    ///
    /// \param target Render target to draw to
    /// \param states Current render states
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Drawable.hpp
    virtual ~Drawable() {}

    ////////////////////////////////////////////////////////////
    /// \brief Virtual destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Drawable.hpp
class SFML_GRAPHICS_API Drawable

////////////////////////////////////////////////////////////
/// \brief Abstract base class for objects that can be drawn
///        to a render target
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Drawable.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Drawable.hpp
#ifndef SFML_DRAWABLE_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Drawable.hpp
//

////////////////////////////////////////////////////////////
