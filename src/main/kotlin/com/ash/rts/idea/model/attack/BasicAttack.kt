package com.ash.rts.ideal.com.ash.rts.idea.model.attack

import com.ash.rts.idea.model.Attack
import com.ash.rts.idea.model.HitBox
import com.ash.rts.idea.model.Voxel
import com.ash.rts.ideal.com.ash.rts.idea.model.RtsMapRanges

class BasicAttack(private val currentVoxel: Voxel, private val map: RtsMapRanges): Attack {

    init {
        check(currentVoxel in map) { "Current location $currentVoxel not in Map" }
    }

    override fun availableAttacks(): Collection<HitBox> {
        val offset = listOf(-1, 0, 1)

        return offset.flatMap { x ->
            offset.flatMap { y ->
                offset.map { z ->
                    currentVoxel.copy(x = currentVoxel.x + x, y = currentVoxel.y + y, z = currentVoxel.z + z)
                }
                .filterNot { it != currentVoxel }
                .filter { it in map }
                .map { HitBox(it) }
            }
        }
    }

    override fun attack(voxel: Voxel) {
        TODO("Not yet implemented")
    }
}