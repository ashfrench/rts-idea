package com.ash.rts.idea.model

import com.ash.rts.ideal.com.ash.rts.idea.model.RtsUnit

interface Attack {

    fun availableAttacks(): Set<HitBox>
    fun attack(voxel: Voxel)

}

interface MergedAttack: Attack {

    fun mergedUnits(): Collection<RtsUnit>

}