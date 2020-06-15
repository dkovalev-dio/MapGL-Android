package ru.dublgis.dgismobile.mapsdk.geometries.polygon

import ru.dublgis.dgismobile.mapsdk.LonLat

/**
 * Polygon initialization options.
 */
class PolygonOptions(
    /**
     * Geographical coordinates of polygon points in format: [outerEdges, cropEdges1, cropEdges2, ...].
     * The first section is outerEdges which describes an array of outer edges: [firstPoint,
     * secondPoint, ..., firstPoint]. Each point is a geographical point: [longitude, latitude].
     * The last point should be the same as the first.
     */
    var coordinates: Collection<Collection<LonLat>>
)