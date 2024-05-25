package com.ash.rts.idea.model.defense

import com.ash.rts.idea.model.Defense
import com.ash.rts.idea.model.HitBox
import com.ash.rts.idea.model.Voxel

class BasicDefense(override val hitBox: HitBox) : Defense {
    override fun defend(voxel: Voxel) {
        TODO("Not yet implemented")
    }
}