package com.ash.rts.ideal.com.ash.rts.idea.model

import com.ash.rts.idea.model.Voxel

object MapGenerator {

    fun generateMap(
        xRange: IntRange = (0..1250),
        yRange: IntRange = (0..1250),
        zRange: IntRange = (-5..5)
    ): RtsMap {
        val voxels =
            xRange.flatMap { x ->
                yRange.flatMap { y ->
                    zRange.map { z ->
                        Voxel(x, y, z)
                    }
                }
            }
        return RtsMap(voxels)
    }

    fun generateMapRange(
        xRange: IntRange = (0..10000),
        yRange: IntRange = (0..10000),
        zRange: IntRange = (-5..10)
    ) = RtsMapRanges(xRange, yRange, zRange)

}

data class RtsMap(val voxels: Collection<Voxel>)

data class RtsMapRanges(
    val xRange: IntRange = (0..10000),
    val yRange: IntRange = (0..10000),
    val zRange: IntRange = (-5..10)
) {
    operator fun contains(voxel: Voxel): Boolean {
        return voxel.x in xRange && voxel.y in yRange && voxel.z in zRange
    }
}
