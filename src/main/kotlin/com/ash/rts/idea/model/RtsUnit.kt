package com.ash.rts.ideal.com.ash.rts.idea.model

import com.ash.rts.idea.model.Attack
import com.ash.rts.idea.model.Defense
import com.ash.rts.idea.model.HitBox
import com.ash.rts.idea.model.Movement

interface RtsUnit: Movement, Attack, Defense {
    override val hitBox: HitBox

    fun canMerge(rtsUnit: RtsUnit): Boolean
    fun merge(rtsUnit: RtsUnit): RtsUnit
    fun unmerge(): Collection<RtsUnit>
    fun mergedUnits(): Collection<RtsUnit>
}