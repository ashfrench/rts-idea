package com.ash.rts.idea.model

interface Movement {

    fun availableMoves(): Set<HitBox>

}