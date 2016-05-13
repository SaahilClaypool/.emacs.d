_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/CircleShape.hpp

////////////////////////////////////////////////////////////
/// \class sf::CircleShape
/// \ingroup graphics
///
/// This class inherits all the functions of sf::Transformable
/// (position, rotation, scale, bounds, ...) as well as the
/// functions of sf::Shape (outline, color, texture, ...).
///
/// Usage example:
/// \code
/// sf::CircleShape circle;
/// circle.setRadius(150);
/// circle.setOutlineColor(sf::Color::Red);
/// circle.setOutlineThickness(5);
/// circle.setPosition(10, 20);
/// ...
/// window.draw(circle);
/// \endcode
///
/// Since the graphics card can't draw perfect circles, we have to
/// fake them with multiple triangles connected to each other. The
/// "points count" property of sf::CircleShape defines how many of these
/// triangles to use, and therefore defines the quality of the circle.
///
/// The number of points can also be used for another purpose; with
/// small numbers you can create any regular polygon shape:
/// equilateral triangle, square, pentagon, hexagon, ...
///
/// \see sf::Shape, sf::RectangleShape, sf::ConvexShape
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/CircleShape.hpp
};

    float        m_radius;     ///< Radius of the circle
    unsigned int m_pointCount; ///< Number of points composing the circle
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/CircleShape.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/CircleShape.hpp
    virtual Vector2f getPoint(unsigned int index) const;

    ////////////////////////////////////////////////////////////
    /// \brief Get a point of the shape
    ///
    /// The result is undefined if \a index is out of the valid range.
    ///
    /// \param index Index of the point to get, in range [0 .. getPointCount() - 1]
    ///
    /// \return Index-th point of the shape
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/CircleShape.hpp
    virtual unsigned int getPointCount() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the number of points of the shape
    ///
    /// \return Number of points of the shape
    ///
    /// \see setPointCount
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/CircleShape.hpp
    void setPointCount(unsigned int count);

    ////////////////////////////////////////////////////////////
    /// \brief Set the number of points of the circle
    ///
    /// \param count New number of points of the circle
    ///
    /// \see getPointCount
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/CircleShape.hpp
    float getRadius() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the radius of the circle
    ///
    /// \return Radius of the circle
    ///
    /// \see setRadius
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/CircleShape.hpp
    void setRadius(float radius);

    ////////////////////////////////////////////////////////////
    /// \brief Set the radius of the circle
    ///
    /// \param radius New radius of the circle
    ///
    /// \see getRadius
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/CircleShape.hpp
    explicit CircleShape(float radius = 0, unsigned int pointCount = 30);

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// \param radius     Radius of the circle
    /// \param pointCount Number of points composing the circle
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/CircleShape.hpp
class SFML_GRAPHICS_API CircleShape : public Shape

////////////////////////////////////////////////////////////
/// \brief Specialized shape representing a circle
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/CircleShape.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/CircleShape.hpp
#ifndef SFML_CIRCLESHAPE_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/CircleShape.hpp
//

////////////////////////////////////////////////////////////
