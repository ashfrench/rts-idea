package com.ash.rts.ideal.com.ash.rts.idea.model

import com.ash.rts.idea.model.*

interface RtsUnit: Movement, Attack, Defense {
    override val hitBox: HitBox

    fun canMerge(rtsUnit: RtsUnit): Boolean
    fun merge(rtsUnit: RtsUnit): RtsUnit
    fun unmerge(): Collection<RtsUnit>
}

interface RtsMergedUnit: RtsUnit, MergedAttack, MergedDefense {
    override fun mergedUnits(): Collection<RtsUnit>

}