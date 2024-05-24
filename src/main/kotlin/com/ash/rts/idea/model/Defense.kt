package com.ash.rts.idea.model

import com.ash.rts.ideal.com.ash.rts.idea.model.RtsUnit

interface Defense {

    val hitBox: HitBox

}

interface MergedDefense : Defense {

    fun mergedUnits(): Collection<RtsUnit>

}