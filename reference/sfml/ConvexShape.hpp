_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/ConvexShape.hpp

////////////////////////////////////////////////////////////
/// \class sf::ConvexShape
/// \ingroup graphics
///
/// This class inherits all the functions of sf::Transformable
/// (position, rotation, scale, bounds, ...) as well as the
/// functions of sf::Shape (outline, color, texture, ...).
///
/// It is important to keep in mind that a convex shape must
/// always be... convex, otherwise it may not be drawn correctly.
/// Moreover, the points must be defined in order; using a random
/// order would result in an incorrect shape.
///
/// Usage example:
/// \code
/// sf::ConvexShape polygon;
/// polygon.setPointCount(3);
/// polygon.setPoint(0, sf::Vector2f(0, 0));
/// polygon.setPoint(1, sf::Vector2f(0, 10));
/// polygon.setPoint(2, sf::Vector2f(25, 5));
/// polygon.setOutlineColor(sf::Color::Red);
/// polygon.setOutlineThickness(5);
/// polygon.setPosition(10, 20);
/// ...
/// window.draw(polygon);
/// \endcode
///
/// \see sf::Shape, sf::RectangleShape, sf::CircleShape
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/ConvexShape.hpp
};

    std::vector<Vector2f> m_points; ///< Points composing the convex polygon
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/ConvexShape.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/ConvexShape.hpp
    virtual Vector2f getPoint(unsigned int index) const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the position of a point
    ///
    /// The result is undefined if \a index is out of the valid range.
    ///
    /// \param index Index of the point to get, in range [0 .. getPointCount() - 1]
    ///
    /// \return Position of the index-th point of the polygon
    ///
    /// \see setPoint
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/ConvexShape.hpp
    void setPoint(unsigned int index, const Vector2f& point);

    ////////////////////////////////////////////////////////////
    /// \brief Set the position of a point
    ///
    /// Don't forget that the polygon must remain convex, and
    /// the points need to stay ordered!
    /// setPointCount must be called first in order to set the total
    /// number of points. The result is undefined if \a index is out
    /// of the valid range.
    ///
    /// \param index Index of the point to change, in range [0 .. getPointCount() - 1]
    /// \param point New position of the point
    ///
    /// \see getPoint
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/ConvexShape.hpp
    virtual unsigned int getPointCount() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the number of points of the polygon
    ///
    /// \return Number of points of the polygon
    ///
    /// \see setPointCount
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/ConvexShape.hpp
    void setPointCount(unsigned int count);

    ////////////////////////////////////////////////////////////
    /// \brief Set the number of points of the polygon
    ///
    /// \a count must be greater than 2 to define a valid shape.
    ///
    /// \param count New number of points of the polygon
    ///
    /// \see getPointCount
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/ConvexShape.hpp
    explicit ConvexShape(unsigned int pointCount = 0);

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// \param pointCount Number of points of the polygon
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/ConvexShape.hpp
class SFML_GRAPHICS_API ConvexShape : public Shape

////////////////////////////////////////////////////////////
/// \brief Specialized shape representing a convex polygon
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/ConvexShape.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/ConvexShape.hpp
#ifndef SFML_CONVEXSHAPE_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/ConvexShape.hpp
//

////////////////////////////////////////////////////////////
