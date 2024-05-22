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


}

data class RtsMap(val voxels: Collection<Voxel>)
